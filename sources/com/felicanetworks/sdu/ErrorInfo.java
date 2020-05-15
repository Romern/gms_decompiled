package com.felicanetworks.sdu;

import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.FelicaException;
import java.io.Serializable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ErrorInfo implements Serializable {
    public static final int ID_ACTIVATE_FELICA = 2;
    public static final int ID_FELICA_EXCEPTION = 4;
    public static final int ID_FSC = 3;
    public static final int ID_SDU = 1;
    public static final int TYPE_ACTIVATE_FELICA_HTTP_ERROR = 201;
    public static final int TYPE_ACTIVATE_FELICA_MFC_VERSION_ERROR = 202;
    public static final int TYPE_ACTIVATE_FELICA_NOT_FOUND_ERROR = 203;
    public static final int TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR = 299;
    public static final int TYPE_ACTIVATE_FELICA_USED_BY_OTHER_APP = 204;
    public static final int TYPE_ACTIVATE_FELICA_UTILITY_VERSION_ERROR = 205;
    public static final int TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE = 401;
    public static final int TYPE_FELICA_EXCEPTION_OTHER = 499;
    public static final int TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED = 402;
    public static final int TYPE_FSC_HTTP_ERROR = 301;
    public static final int TYPE_FSC_OTHER_ERROR = 399;
    public static final int TYPE_SDU_COMMUNICATIONERROR = 103;
    public static final int TYPE_SDU_FAILED = 104;
    public static final int TYPE_SDU_MEMORY_FULL = 105;
    public static final int TYPE_SDU_OVERCROWDING = 101;
    public static final int TYPE_SDU_SERVERMAINTENANCE = 102;
    public static final int TYPE_SDU_UNKNOWN = 199;
    AppInfo appInfo;
    FelicaException cause;

    /* renamed from: id */
    int f7455id;
    String message;
    int status;
    int type;

    ErrorInfo() {
    }

    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    public FelicaException getFelicaException() {
        return this.cause;
    }

    public int getId() {
        return this.f7455id;
    }

    public String getMessage() {
        return this.message;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "ErrorInfo[" + this.f7455id + "," + this.type + "," + this.message + "," + this.appInfo + "," + this.cause + "]";
    }

    public ErrorInfo(int i, int i2, int i3) {
        this.f7455id = i;
        this.type = i2;
        this.status = i3;
    }

    public ErrorInfo(int i, int i2, FelicaException felicaException) {
        this.f7455id = i;
        this.type = i2;
        this.cause = felicaException;
    }

    public ErrorInfo(int i, int i2, String str, AppInfo appInfo2) {
        this.f7455id = i;
        this.type = i2;
        this.message = str;
        this.appInfo = appInfo2;
    }
}
