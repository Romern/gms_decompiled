package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.CommonAppException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkAccessException extends CommonAppException {
    public static final int ID_CANCELED = 5;
    @Deprecated
    public static final int ID_CONNECT_ERROR = 1;
    public static final int ID_IOERROR = 4;
    @Deprecated
    public static final int ID_OTHER = 6;
    public static final int ID_TIMEOUT = 3;
    @Deprecated
    public static final int ID_TIMEOUT_SETTING_ERROR = 2;
    @Deprecated
    public static final int ID_URLERROR = 0;
    private int errorId;

    public NetworkAccessException(int i) {
        super("errorId:" + i);
        this.errorId = i;
    }

    public int getErrorId() {
        return this.errorId;
    }

    public int getExceptionCode() {
        return 5;
    }

    public NetworkAccessException(String str, Throwable th) {
        super(str, th);
    }

    public NetworkAccessException(Throwable th, String str, int i) {
        super("errorId:" + i + ", cd:" + str, th);
        this.errorId = i;
        setErrIdentifierCode(str);
    }
}
