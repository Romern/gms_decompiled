package com.felicanetworks.cmnctrl.packages;

import com.felicanetworks.cmnlib.CommonAppException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageAccessException extends CommonAppException {
    public static final int ID_OTHER_ERROR = 1;
    public static final int ID_PKG_NOTFOUND_ERROR = 0;
    private static final long serialVersionUID = -5871352138468117458L;
    private int errorId;

    public PackageAccessException(Throwable th, String str, int i) {
        super(th);
        this.errorId = i;
        setErrIdentifierCode(str);
    }

    public int getErrorId() {
        return this.errorId;
    }

    public int getExceptionCode() {
        return 1;
    }
}
