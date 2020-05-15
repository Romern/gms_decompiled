package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JavaNetworkAccess extends BaseNetworkAccess implements FunctionCodeInterface {
    private static final String CHARCODE = "UTF-8";
    private static final String CONNECTION = "connection";
    private static final String CONNECT_TYPE_GET = "GET";
    private static final String CONTENT_LENGTH_KEY = "content-length";
    public static final String CONTENT_TYPE_KEY = "content-type";
    private AppContext context;
    private boolean isCancel = false;
    private HttpURLConnection urlconn = null;

    public JavaNetworkAccess(AppContext appContext) {
        this.context = appContext;
    }

    private NetworkAccessException createNetworkAccessException(Exception exc) {
        if (exc instanceof InterruptedException) {
            return new NetworkAccessException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 5);
        }
        if (exc instanceof SocketTimeoutException) {
            return new NetworkAccessException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 3);
        }
        return new NetworkAccessException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 4);
    }

    public void cancel() {
        this.isCancel = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cc A[SYNTHETIC, Splitter:B:103:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01bd A[SYNTHETIC, Splitter:B:95:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c4 A[SYNTHETIC, Splitter:B:99:0x01c4] */
    public NetworkAccessResponseData connect(NetworkAccessRequestData networkAccessRequestData) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        URL url;
        NetworkAccessResponseData networkAccessResponseData;
        this.isCancel = false;
        try {
            if (!networkAccessRequestData.method.equals(CONNECT_TYPE_GET)) {
                url = new URI(networkAccessRequestData.url).normalize().toURL();
            } else {
                networkAccessRequestData.header.remove("content-length");
                url = new URI(networkAccessRequestData.url + "?" + new String(networkAccessRequestData.data, CHARCODE)).normalize().toURL();
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            this.urlconn = httpURLConnection2;
            httpURLConnection2.setRequestMethod(networkAccessRequestData.method);
            this.urlconn.setConnectTimeout(networkAccessRequestData.connectTimeout);
            this.urlconn.setReadTimeout(networkAccessRequestData.readTimeout);
            this.urlconn.setRequestProperty(CONNECTION, "close");
            for (String str : networkAccessRequestData.header.keySet()) {
                this.urlconn.setRequestProperty(str, (String) networkAccessRequestData.header.get(str));
            }
            if (!networkAccessRequestData.method.equals(CONNECT_TYPE_GET)) {
                this.urlconn.setDoOutput(true);
                this.urlconn.setFixedLengthStreamingMode(Integer.parseInt((String) networkAccessRequestData.header.get("content-length")));
                outputStream = this.urlconn.getOutputStream();
                try {
                    outputStream.write(networkAccessRequestData.data);
                } catch (Exception e) {
                    e = e;
                    inputStream = null;
                    byteArrayOutputStream = null;
                    try {
                        throw createNetworkAccessException(e);
                    } catch (Throwable th) {
                        th = th;
                        if (outputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        httpURLConnection = this.urlconn;
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    byteArrayOutputStream = null;
                    if (outputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    httpURLConnection = this.urlconn;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } else {
                outputStream = null;
            }
            this.urlconn.connect();
            NetworkAccessListener networkAccessListener = networkAccessRequestData.listener;
            if (networkAccessListener != null) {
                networkAccessListener.session();
            }
            int responseCode = this.urlconn.getResponseCode();
            HashMap hashMap = new HashMap();
            for (String str2 : this.urlconn.getHeaderFields().keySet()) {
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(Locale.US);
                    hashMap.put(lowerCase, this.urlconn.getHeaderField(lowerCase));
                }
            }
            int parseInt = (hashMap.get("content-length") == null || Integer.parseInt((String) hashMap.get("content-length")) <= 0) ? 0 : Integer.parseInt((String) hashMap.get("content-length"));
            if (parseInt != 0) {
                int i = parseInt / networkAccessRequestData.noticeCnt;
                inputStream = this.urlconn.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    int i2 = i;
                    int i3 = 0;
                    while (!this.isCancel) {
                        try {
                            int read = inputStream.read();
                            if (read == -1) {
                                networkAccessResponseData = new NetworkAccessResponseData(responseCode, hashMap, byteArrayOutputStream.toByteArray());
                            } else {
                                byteArrayOutputStream.write(read);
                                if (byteArrayOutputStream.size() >= i2 && i3 <= networkAccessRequestData.noticeCnt) {
                                    i3++;
                                    NetworkAccessListener networkAccessListener2 = networkAccessRequestData.listener;
                                    if (networkAccessListener2 != null) {
                                        networkAccessListener2.receiveRatio(i3);
                                    }
                                    i2 += i;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            throw createNetworkAccessException(e);
                        }
                    }
                    this.isCancel = false;
                    throw new InterruptedException();
                } catch (Exception e3) {
                    e = e3;
                    byteArrayOutputStream = null;
                    throw createNetworkAccessException(e);
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    if (outputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    httpURLConnection = this.urlconn;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } else {
                networkAccessResponseData = new NetworkAccessResponseData(responseCode, hashMap, null);
                inputStream = null;
                byteArrayOutputStream = null;
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e4) {
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e6) {
                }
            }
            HttpURLConnection httpURLConnection3 = this.urlconn;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                this.urlconn = null;
            }
            return networkAccessResponseData;
        } catch (Exception e7) {
            e = e7;
            outputStream = null;
            inputStream = null;
            byteArrayOutputStream = null;
            throw createNetworkAccessException(e);
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            inputStream = null;
            byteArrayOutputStream = null;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e8) {
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e9) {
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e10) {
                }
            }
            httpURLConnection = this.urlconn;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.urlconn = null;
            }
            throw th;
        }
    }

    public int getClassCode() {
        return 5;
    }

    public int getFunctionCode() {
        return 4;
    }
}
