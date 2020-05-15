package com.felicanetworks.sdulib.p006sg;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.p005sg.SgMgr;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.felicanetworks.sdulib.sg.SduSgMgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SduSgMgr extends SgMgr {
    private static final String APP_ID = "0206";
    private static final String APP_NAME = "SDULib";
    private static final String APP_SG_FILENAME = "com_felicanetworks_sdu.cfg";
    private static final String COMMON_SG_FILEPATH = "/product/etc/felica/common.cfg";
    private static final String COMMON_SG_FILEPATH_SECOND = "/vender/etc/felica/common.cfg";
    private static final String COMMON_SG_FILEPATH_THIRD = "/system/etc/felica/common.cfg";
    public static final int KEY_MFC_DEVIDE_SYSTEMCODE = 54;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO1 = 27;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO10 = 36;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO2 = 28;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO3 = 29;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO4 = 30;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO5 = 31;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO6 = 32;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO7 = 33;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO8 = 34;
    public static final int KEY_SRV_ENCODED_DEVIDE_INFO9 = 35;
    public static final int KEY_SRV_TICKET_AUTHEN_READ_TIMEOUT = 51;
    public static final int KEY_SRV_TICKET_DEVIDE_SESS_TIMEOUT = 26;
    public static final int KEY_SRV_TICKET_DEVIDE_URL = 25;
    public static final int KEY_SRV_TICKET_EXPIRATION_INTERVAL = 53;
    public static final int KEY_SRV_UA_APPNAME = 55;
    private static final String MANAGE_SYSTEM_CODE = "FE0F";
    private int[][] supportedIndividualSgInformationTable = {new int[]{SgMgr.KEY_MFC_TIMEOUT, 513, 1, 8, 1, 0, 1}, new int[]{SgMgr.KEY_MFC_RETRY_CNT, 514, 1, 2, 1, 0, 1}, new int[]{54, 515, 0, 4, 2, 0, 2}, new int[]{SgMgr.KEY_SRV_TIMEZONE, 769, 1, 64, 128, 0, 0}, new int[]{25, 770, 1, 999, 16, 0, 0}, new int[]{26, 771, 1, 8, 1, 0, 1}, new int[]{51, 772, 1, 8, 1, 0, 1}, new int[]{53, 773, 1, 6, 1, 0, 1}, new int[]{55, 774, 1, 30, 8, 0, 0}, new int[]{27, 800, 1, 9999, 2, 0, 2}, new int[]{28, 801, 1, 9999, 2, 0, 2}, new int[]{29, 802, 1, 9999, 2, 0, 2}, new int[]{30, 803, 1, 9999, 2, 0, 2}, new int[]{31, 804, 1, 9999, 2, 0, 2}, new int[]{32, 805, 1, 9999, 2, 0, 2}, new int[]{33, 806, 1, 9999, 2, 0, 2}, new int[]{34, 807, 1, 9999, 2, 0, 2}, new int[]{35, 808, 1, 9999, 2, 0, 2}, new int[]{36, 809, 1, 9999, 2, 0, 2}, new int[]{SgMgr.KEY_LOG_OUTPUT_FLG, 1281, 0, 1, 128, 0, 1}};

    public SduSgMgr(AppContext appContext) {
        super(appContext);
    }

    /* access modifiers changed from: protected */
    public void checkParamAdjustment() {
    }

    public String getAppId() {
        return APP_ID;
    }

    public String getAppName() {
        return APP_NAME;
    }

    /* access modifiers changed from: protected */
    public String getAppSgFilePath() {
        return null;
    }

    /* access modifiers changed from: protected */
    public InputStream getAppSgFileStream() {
        return getContext().androidContext.getAssets().open(APP_SG_FILENAME);
    }

    public int getClassCode() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public String getCommonSgFilePath() {
        String str = COMMON_SG_FILEPATH;
        if (!new File(str).exists()) {
            str = COMMON_SG_FILEPATH_SECOND;
            if (!new File(str).exists()) {
                return COMMON_SG_FILEPATH_THIRD;
            }
        }
        return str;
    }

    public int getFunctionCode() {
        return 37;
    }

    /* access modifiers changed from: protected */
    public Map getIndividualSgCheckerTable() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf((int) SgMgr.KEY_SRV_TIMEZONE), new SgMgr.TimezoneChecker());
        hashMap.put(Integer.valueOf((int) SgMgr.KEY_LOG_OUTPUT_FLG), new SgMgr.LogOutputFlagChecker());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public int[][] getIndividualSupportedSgInformationTable() {
        int[][] iArr = (int[][]) this.supportedIndividualSgInformationTable.clone();
        int appIdMask = SgMgr.getAppIdMask(getAppId());
        for (int[] iArr2 : iArr) {
            iArr2[1] = iArr2[1] | appIdMask;
        }
        return iArr;
    }

    public String getManageSystemCode() {
        return MANAGE_SYSTEM_CODE;
    }
}
