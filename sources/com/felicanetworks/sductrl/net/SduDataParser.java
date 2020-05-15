package com.felicanetworks.sductrl.net;

import com.felicanetworks.cmnctrl.net.DataParseException;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.felicanetworks.cmnctrl.net.NetworkAccessRequestData;
import com.felicanetworks.cmnctrl.net.NetworkAccessResponseData;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.cmnlib.p005sg.SgMgrException;
import com.felicanetworks.cmnlib.util.DataCheckerUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SduDataParser extends DataParser implements FunctionCodeInterface {
    private static final int COMMUNICATION_OK = 200;
    private static final String CONTENTS_TYPE = "application/x-www-form-urlencoded";
    private static final char DOUBLE_QUOTATION = '\"';
    private static final String HEADER_CONTENTLENGTH = "content-length";
    private static final String HEADER_CONTENTTYPE = "content-type";
    private static final String HEADER_USERAGENT = "User-Agent";
    private static final String KEY_AUTHFINISHCODE = "authfincode";
    private static final String KEY_DATA_SEPARATOR = ": ";
    private static final String KEY_RESPNSECODE = "rescode";
    private static final String KEY_STARTURL = "surl";
    private static final String RESCODE_NG = "NG";
    private static final String RESCODE_OK = "OK";
    private static final int SIZE_AUTHFINISHCODE = 4;
    private static final int SIZE_RESPNSECODE = 2;
    private AppContext _context;

    public SduDataParser(AppContext appContext) {
        super(appContext);
        this._context = appContext;
    }

    private String getAuthData(String str, String str2) {
        String str3 = str + KEY_DATA_SEPARATOR;
        if (str2.startsWith(str3)) {
            int indexOf = str2.indexOf(34, str3.length());
            int lastIndexOf = str2.lastIndexOf(34);
            if (!(indexOf == -1 || lastIndexOf == -1 || indexOf == lastIndexOf)) {
                return str2.substring(indexOf + 1, lastIndexOf);
            }
        }
        return null;
    }

    public NetworkAccessRequestData createAuthQuerryData(byte[] bArr) {
        if (bArr != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(HEADER_USERAGENT, this._context.userAgent);
                hashMap.put("content-type", "application/x-www-form-urlencoded");
                hashMap.put("content-length", String.valueOf(bArr.length));
                return new NetworkAccessRequestData((String) this._context.sgMgr.getSgValue(25), DataParser.CONNECT_TYPE_POST, hashMap, ((Integer) this._context.sgMgr.getSgValue(26)).intValue(), ((Integer) this._context.sgMgr.getSgValue(51)).intValue(), bArr);
            } catch (SgMgrException e) {
                throw new DataParseException(e, this._context.logMgr.out(LogMgr.CatExp.ERR, this, e), 3);
            } catch (Exception e2) {
                throw new DataParseException(e2, this._context.logMgr.out(LogMgr.CatExp.ERR, this, e2), 3);
            }
        } else {
            throw new IllegalArgumentException("ticket is null");
        }
    }

    public int getClassCode() {
        return 1;
    }

    public int getFunctionCode() {
        return 35;
    }

    public AuthResponseData parseAuthResponseData(NetworkAccessResponseData networkAccessResponseData) {
        int i;
        String str;
        if (networkAccessResponseData != null) {
            try {
                if (networkAccessResponseData.code == 200) {
                    String str2 = (String) networkAccessResponseData.header.get("content-length");
                    DataCheckerUtil.checkDecNumberFormat(str2);
                    int parseInt = Integer.parseInt(str2);
                    byte[] bArr = networkAccessResponseData.data;
                    if (bArr.length == parseInt) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), "UTF-8"));
                        String authData = getAuthData(KEY_RESPNSECODE, bufferedReader.readLine());
                        if (authData == null) {
                            throw new DataParseException(2, "Cannot get ResCode");
                        } else if (authData.length() == 2) {
                            if (authData.equals(RESCODE_OK)) {
                                i = 0;
                            } else if (authData.equals(RESCODE_NG)) {
                                i = 1;
                            } else {
                                throw new DataParseException(2, "ResCode is naither  OK nor NG");
                            }
                            String readLine = bufferedReader.readLine();
                            String str3 = null;
                            if (i == 1) {
                                str = getAuthData(KEY_AUTHFINISHCODE, readLine);
                                if (str == null) {
                                    throw new DataParseException(2, "Cannot get FinishCode");
                                } else if (str.length() == 4) {
                                    DataCheckerUtil.checkAlphaSignFormat(str);
                                } else {
                                    throw new DataParseException(2, "FinishCode length is Illegal");
                                }
                            } else {
                                str = null;
                            }
                            bufferedReader.readLine();
                            String readLine2 = bufferedReader.readLine();
                            if (i == 0) {
                                str3 = getAuthData(KEY_STARTURL, readLine2);
                                if (str3 != null) {
                                    DataCheckerUtil.checkUrlCharFormat(str3);
                                } else {
                                    throw new DataParseException(2, "Cannot get StartUrl");
                                }
                            }
                            return new AuthResponseData(i, str, str3);
                        } else {
                            throw new DataParseException(2, "ResCode length is Illegal");
                        }
                    } else {
                        throw new DataParseException(2, "Contents Length not equal ResData Length");
                    }
                } else {
                    throw new DataParseException(2, "ResCode : " + networkAccessResponseData.code);
                }
            } catch (DataParseException e) {
                this._context.logMgr.out(LogMgr.CatExp.WAR, this, e);
                throw e;
            } catch (Exception e2) {
                throw new DataParseException(e2, this._context.logMgr.out(LogMgr.CatExp.WAR, this, e2), 2);
            }
        } else {
            throw new IllegalArgumentException("ResData is null");
        }
    }
}
