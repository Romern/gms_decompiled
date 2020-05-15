package com.felicanetworks.sdu;

import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sductrl.chip.FelicaAccessException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ErrorInfoFactory {
    private static final Map ACTIVATE_FELICA_TABLE;
    public static final int STATUS_CODE_NORMAL_END = 0;
    public static final int STATUS_CODE_SERVER_MAINTENANCE = 9201;
    public static final int STATUS_CODE_SERVER_OVERCROWDING = 9101;
    public static final int STATUS_CODE_WRITE_MAX = 9401;
    public static final int STATUS_CODE_WRITING_OUT_OF_SPACE = 9301;

    static {
        HashMap hashMap = new HashMap();
        ACTIVATE_FELICA_TABLE = hashMap;
        hashMap.put(3, Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR));
        ACTIVATE_FELICA_TABLE.put(8, 202);
        ACTIVATE_FELICA_TABLE.put(4, 203);
        ACTIVATE_FELICA_TABLE.put(1, Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR));
        ACTIVATE_FELICA_TABLE.put(7, 204);
        ACTIVATE_FELICA_TABLE.put(9, 205);
    }

    public static ErrorInfo checkFscStatus(int i) {
        if (i == 0) {
            return null;
        }
        if (i == 9301) {
            return new ErrorInfo(1, (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, i);
        }
        if (i != 9401) {
            return new ErrorInfo(1, (int) ErrorInfo.TYPE_SDU_FAILED, i);
        }
        return null;
    }

    public static ErrorInfo createErrorInfo(FelicaException felicaException) {
        int i;
        int type = felicaException.getType();
        if (type != 7) {
            i = type != 55 ? ErrorInfo.TYPE_FELICA_EXCEPTION_OTHER : ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
        } else {
            i = ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED;
        }
        return new ErrorInfo(4, i, felicaException);
    }

    public static ErrorInfo createFelicaErrorInfo(int i, String str, AppInfo appInfo) {
        int i2;
        Integer num = (Integer) ACTIVATE_FELICA_TABLE.get(Integer.valueOf(i));
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR;
        }
        return new ErrorInfo(2, i2, str, appInfo);
    }

    public static ErrorInfo createFscErrorInfo(int i, String str) {
        return new ErrorInfo(3, i != 3 ? ErrorInfo.TYPE_FSC_OTHER_ERROR : ErrorInfo.TYPE_FSC_HTTP_ERROR, str, null);
    }

    public static ErrorInfo createSduErrorInfo(int i, String str) {
        return new ErrorInfo(1, i, null, null);
    }

    public static ErrorInfo createStatusErrorInfo(String str) {
        if ("9101".equals(str)) {
            return createSduErrorInfo(101, "");
        }
        if ("9201".equals(str)) {
            return createSduErrorInfo(102, "");
        }
        return createSduErrorInfo(ErrorInfo.TYPE_SDU_FAILED, str);
    }

    public static ErrorInfo createErrorInfo(FelicaAccessException felicaAccessException) {
        if (felicaAccessException.getId() == 1) {
            return createFelicaErrorInfo(felicaAccessException.getType(), felicaAccessException.getMessage(), felicaAccessException.getAppInfo());
        }
        return createFscErrorInfo(felicaAccessException.getType(), felicaAccessException.getMessage());
    }
}
