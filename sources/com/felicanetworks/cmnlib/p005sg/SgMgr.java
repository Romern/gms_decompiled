package com.felicanetworks.cmnlib.p005sg;

import android.util.Log;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.util.CommonUtil;
import com.felicanetworks.cmnlib.util.DataCheckerException;
import com.felicanetworks.cmnlib.util.DataCheckerUtil;
import com.felicanetworks.sdu.UnsupportedDeviceException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.felicanetworks.cmnlib.sg.SgMgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class SgMgr implements FunctionCodeInterface {
    protected static final int ATTR_ALPHA_NUMBER = 4;
    protected static final int ATTR_ALPHA_SIGN = 8;
    protected static final int ATTR_DEC_NUMBER = 1;
    protected static final int ATTR_HEX_NUMBER = 2;
    protected static final int ATTR_INDIVIDUAL = 128;
    protected static final int ATTR_NONE = 0;
    protected static final int ATTR_URI = 16;
    protected static final int DATAFORM_BIN = 2;
    protected static final int DATAFORM_INT = 1;
    protected static final int DATAFORM_STRING = 0;
    protected static final int DATASIZE_CHANGEABLE = 1;
    protected static final int DATASIZE_CHECKNON = 2;
    protected static final int DATASIZE_FIXED = 0;
    private static final String DISP_ERROR_CODE_FORMAT = "%02X-%03X-%04d-%03X";
    protected static final int ELEMENT_CHECK_TABLE_CNT = 7;
    protected static final int ISMANDATERY_MUST = 0;
    protected static final int ISMANDATERY_OPT = 1;
    public static final int KEY_LOG_OUTPUT_FLG = 16777247;
    public static final int KEY_MFC_CARRIER_CODE = 16777229;
    public static final int KEY_MFC_ISSUER_CODE = 16777228;
    public static final int KEY_MFC_RETRY_CNT = 16777226;
    public static final int KEY_MFC_TIMEOUT = 16777225;
    public static final int KEY_SRV_MOBILE_IDENTIFICATION_INFO = 16777244;
    public static final int KEY_SRV_TIMEZONE = 16777240;
    protected static final int LOGIC_KEY_MASK = 16777216;
    protected static final String LOG_FORMAT_KEY = "key  = %08X : %s";
    private static final String LOG_TAG_STR = "%s";
    protected static final int SGFILE_COLUMN_ATTR_KEY_BASE = 16;
    protected static final int SGFILE_COLUMN_COUNT = 2;
    protected static final int SGFILE_COLUMN_NUMBER_KEY = 0;
    protected static final int SGFILE_COLUMN_NUMBER_VALUE = 1;
    protected static final String SGFILE_FORMAT_SEPARATOR = ",";
    protected static final String SGFILE_SUPPORTED_LINE_FORMAT = "^[0-9A-F]{8},.*";
    protected static final String SGFILE_UNSUPPORTED_LINE_FORMAT = ".*,.*,";
    protected static final int SG_INFO_TABLE_CLM_ATTRIBUTE = 4;
    protected static final int SG_INFO_TABLE_CLM_DATA_TYPE = 6;
    protected static final int SG_INFO_TABLE_CLM_MANDATERY = 5;
    protected static final int SG_INFO_TABLE_CLM_REAL_KEY = 1;
    protected static final int SG_INFO_TABLE_CLM_SIZE = 3;
    protected static final int SG_INFO_TABLE_CLM_SIZE_TYPE = 2;
    protected static final int SG_INFO_TABLE_CLM_VIRTUAL_KEY = 0;
    protected static final int TBL_ELEMENT_IVALUE_ISMANDATERY = 3;
    protected static final int TBL_ELEMENT_SG_CODE = 0;
    protected static final int TBL_ELEMENT_VALUE_ATTR = 2;
    protected static final int TBL_ELEMENT_VALUE_SIZE = 1;
    private static final int UNKNOWN_EXCEPTION_CODE = 4095;
    private static final int[][] commonSupportedSgInformationTable = {new int[]{KEY_MFC_ISSUER_CODE, 1, 0, 6, 2, 0, 0}, new int[]{KEY_MFC_CARRIER_CODE, 2, 0, 6, 2, 0, 0}};
    private AppContext context;
    private boolean errorFlg = false;
    protected Map sgTable;

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$ClassNameChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ClassNameChecker extends PackageNameChecker {
        public ClassNameChecker() {
            super();
        }
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$FirstIssueExecFlagChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FirstIssueExecFlagChecker extends ZeroOrOneChecker {
        public FirstIssueExecFlagChecker() {
            super();
        }
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$LogOutputFlagChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class LogOutputFlagChecker extends ZeroOrOneChecker {
        public LogOutputFlagChecker() {
            super();
        }
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$PackageNameChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PackageNameChecker implements DataCheckerInterface {
        public PackageNameChecker() {
        }

        public void checkAttribute(String str) {
            DataCheckerUtil.checkAlphaSignFormat(str);
        }
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$StringValueChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class StringValueChecker implements DataCheckerInterface {
        public StringValueChecker() {
        }

        public void checkAttribute(String str) {
            if (str != null) {
                String[] permitList = getPermitList();
                Arrays.sort(permitList);
                if (Arrays.binarySearch(permitList, str) < 0) {
                    throw new DataCheckerException();
                }
                return;
            }
            throw new DataCheckerException();
        }

        /* access modifiers changed from: protected */
        public abstract String[] getPermitList();
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$SystemFileKeyCodeInfo */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SystemFileKeyCodeInfo {
        int[] checkData = null;
        DataCheckerInterface indivChecker = null;
        String value = null;

        public SystemFileKeyCodeInfo() {
        }
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$TimezoneChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class TimezoneChecker extends StringValueChecker {
        public TimezoneChecker() {
            super();
        }

        /* access modifiers changed from: protected */
        public String[] getPermitList() {
            return TimeZone.getAvailableIDs();
        }
    }

    /* renamed from: com.felicanetworks.cmnlib.sg.SgMgr$ZeroOrOneChecker */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ZeroOrOneChecker extends StringValueChecker {
        private final String[] permissionList = {"0", "1"};

        public ZeroOrOneChecker() {
            super();
        }

        /* access modifiers changed from: protected */
        public String[] getPermitList() {
            return this.permissionList;
        }
    }

    public SgMgr(AppContext appContext) {
        this.context = appContext;
        this.sgTable = new HashMap();
    }

    private void checkMandatery(int[][] iArr) {
        int length = iArr.length;
        if (length != this.sgTable.size()) {
            for (int[] iArr2 : iArr) {
                if (iArr2[5] == 0 && this.sgTable.get(Integer.valueOf(iArr2[0])) == null) {
                    sgLogOut(LOG_FORMAT_KEY, iArr2[1], "Must be corrected.");
                    this.errorFlg = true;
                }
            }
        }
    }

    private void checkSg(List list) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SystemFileKeyCodeInfo systemFileKeyCodeInfo = (SystemFileKeyCodeInfo) it.next();
            String str = systemFileKeyCodeInfo.value;
            if (str == null) {
                int[] iArr = systemFileKeyCodeInfo.checkData;
                if (iArr[5] == 0) {
                    sgLogOut(LOG_FORMAT_KEY, iArr[1], "Not specified.");
                    this.errorFlg = true;
                }
            } else {
                int[] iArr2 = systemFileKeyCodeInfo.checkData;
                int i = iArr2[2];
                if (i == 0 || i == 1) {
                    int i2 = i ^ 1;
                    try {
                        int i3 = iArr2[3];
                        if (i2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        DataCheckerUtil.checkByteLength(str, i3, z);
                    } catch (DataCheckerException e) {
                        sgLogOut(LOG_FORMAT_KEY, systemFileKeyCodeInfo.checkData[1], "Invalid size.");
                        this.errorFlg = true;
                    }
                }
                try {
                    int i4 = systemFileKeyCodeInfo.checkData[4];
                    if (i4 == 1) {
                        DataCheckerUtil.checkDecNumberFormat(systemFileKeyCodeInfo.value);
                    } else if (i4 == 2) {
                        DataCheckerUtil.checkHexNumberFormat(systemFileKeyCodeInfo.value);
                    } else if (i4 == 4) {
                        DataCheckerUtil.checkAlphaNumberFormat(systemFileKeyCodeInfo.value);
                    } else if (i4 == 8) {
                        DataCheckerUtil.checkAlphaSignFormat(systemFileKeyCodeInfo.value);
                    } else if (i4 == 16) {
                        DataCheckerUtil.checkUrlCharFormat(systemFileKeyCodeInfo.value);
                    } else if (i4 == 128) {
                        systemFileKeyCodeInfo.indivChecker.checkAttribute(systemFileKeyCodeInfo.value);
                    }
                    if (this.sgTable.containsKey(Integer.valueOf(systemFileKeyCodeInfo.checkData[0]))) {
                        sgLogOut(LOG_FORMAT_KEY, systemFileKeyCodeInfo.checkData[1], "Already exists.");
                        this.errorFlg = true;
                    } else {
                        try {
                            int[] iArr3 = systemFileKeyCodeInfo.checkData;
                            int i5 = iArr3[6];
                            if (i5 == 0) {
                                this.sgTable.put(Integer.valueOf(iArr3[0]), systemFileKeyCodeInfo.value);
                            } else if (i5 == 1) {
                                this.sgTable.put(Integer.valueOf(iArr3[0]), Integer.valueOf(Integer.parseInt(systemFileKeyCodeInfo.value)));
                            } else if (i5 == 2) {
                                this.sgTable.put(Integer.valueOf(iArr3[0]), CommonUtil.hexStringToBin(systemFileKeyCodeInfo.value));
                            } else {
                                throw new SgMgrException("Invalid data type.");
                            }
                        } catch (Exception e2) {
                            sgLogOut(LOG_FORMAT_KEY, systemFileKeyCodeInfo.checkData[1], "Invalid type.");
                            this.errorFlg = true;
                        }
                    }
                } catch (DataCheckerException e3) {
                    sgLogOut(LOG_FORMAT_KEY, systemFileKeyCodeInfo.checkData[1], "Invalid attribute.");
                    this.errorFlg = true;
                }
            }
        }
    }

    private SgMgrException createSgManagerException(Exception exc) {
        SgMgrException sgMgrException = new SgMgrException(exc);
        sgMgrException.setErrIdentifierCode(String.format(DISP_ERROR_CODE_FORMAT, Integer.valueOf(getFunctionCode()), Integer.valueOf(getClassCode()), Integer.valueOf(sgMgrException.getStackTrace()[1].getLineNumber()), Integer.valueOf(exc != null ? sgMgrException.getExceptionCode() : UNKNOWN_EXCEPTION_CODE)));
        return sgMgrException;
    }

    protected static int getAppIdMask(String str) {
        return Integer.parseInt(str, 16) << 16;
    }

    private Map getSgCheckerTable() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(getcommonSgCheckerTable());
        hashMap.putAll(getIndividualSgCheckerTable());
        return hashMap;
    }

    private int[][] getSupportedSgInformationTable() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList((Object[]) commonSupportedSgInformationTable.clone()));
        arrayList.addAll(Arrays.asList(getIndividualSupportedSgInformationTable()));
        return (int[][]) arrayList.toArray(new int[0][]);
    }

    private Map getcommonSgCheckerTable() {
        return new HashMap();
    }

    private void isNoError() {
        if (this.errorFlg) {
            throw createSgManagerException(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    private ArrayList readSgFile(InputStream inputStream, int[][] iArr, Map map) {
        BufferedReader bufferedReader;
        try {
            ArrayList arrayList = new ArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (readLine.matches(SGFILE_SUPPORTED_LINE_FORMAT) && !readLine.matches(SGFILE_UNSUPPORTED_LINE_FORMAT)) {
                        String[] split = readLine.split(SGFILE_FORMAT_SEPARATOR);
                        int parseLong = (int) Long.parseLong(split[0], 16);
                        int length = iArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            int[] iArr2 = iArr[i];
                            if (iArr2[1] == parseLong) {
                                SystemFileKeyCodeInfo systemFileKeyCodeInfo = new SystemFileKeyCodeInfo();
                                systemFileKeyCodeInfo.checkData = iArr2;
                                if (split.length == 2) {
                                    if (split[1].length() > 0) {
                                        systemFileKeyCodeInfo.value = split[1];
                                    }
                                }
                                if (iArr2[4] == 128) {
                                    systemFileKeyCodeInfo.indivChecker = (DataCheckerInterface) map.get(Integer.valueOf(iArr2[0]));
                                }
                                arrayList.add(systemFileKeyCodeInfo);
                            } else {
                                i++;
                            }
                        }
                    }
                }
                bufferedReader.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void checkParamAdjustment();

    public abstract String getAppId();

    public abstract String getAppName();

    /* access modifiers changed from: protected */
    public abstract String getAppSgFilePath();

    /* access modifiers changed from: protected */
    public InputStream getAppSgFileStream() {
        return new FileInputStream(getAppSgFilePath());
    }

    public int getClassCode() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract String getCommonSgFilePath();

    /* access modifiers changed from: protected */
    public InputStream getCommonSgFileStream() {
        return new FileInputStream(getCommonSgFilePath());
    }

    /* access modifiers changed from: protected */
    public AppContext getContext() {
        return this.context;
    }

    public int getFunctionCode() {
        return 7;
    }

    /* access modifiers changed from: protected */
    public abstract Map getIndividualSgCheckerTable();

    /* access modifiers changed from: protected */
    public abstract int[][] getIndividualSupportedSgInformationTable();

    public abstract String getManageSystemCode();

    public Object getSgValue(int i) {
        Object obj = this.sgTable.get(Integer.valueOf(i));
        if (obj != null) {
            return obj;
        }
        throw new SgMgrException();
    }

    public void loadSg() {
        InputStream appSgFileStream;
        InputStream commonSgFileStream;
        try {
            int[][] supportedSgInformationTable = getSupportedSgInformationTable();
            Map sgCheckerTable = getSgCheckerTable();
            appSgFileStream = getAppSgFileStream();
            ArrayList readSgFile = readSgFile(appSgFileStream, supportedSgInformationTable, sgCheckerTable);
            appSgFileStream.close();
            try {
                commonSgFileStream = getCommonSgFileStream();
                readSgFile.addAll(readSgFile(commonSgFileStream, supportedSgInformationTable, sgCheckerTable));
                commonSgFileStream.close();
                checkSg(readSgFile);
                try {
                    checkParamAdjustment();
                } catch (DataCheckerException e) {
                    this.errorFlg = true;
                }
                checkMandatery(supportedSgInformationTable);
                isNoError();
            } catch (FileNotFoundException e2) {
                throw new UnsupportedDeviceException();
            } catch (Throwable th) {
                commonSgFileStream.close();
                throw th;
            }
        } catch (UnsupportedDeviceException e3) {
            throw e3;
        } catch (Exception e4) {
            sgLogOut("Unknown error occurred.");
            throw createSgManagerException(e4);
        } catch (Throwable th2) {
            appSgFileStream.close();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void sgLogOut(String str) {
        Log.w(String.format(LOG_TAG_STR, getAppName()), str);
    }

    /* access modifiers changed from: protected */
    public void sgLogOut(String str, int i, String str2) {
        sgLogOut(String.format(str, Integer.valueOf(i), str2));
    }
}
