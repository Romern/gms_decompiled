package com.felicanetworks.sductrl;

import com.felicanetworks.cmnlib.CommonAppException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ControlFunctionException extends CommonAppException {
    public static final int ERROR_CODE_BADPARAM = 1;
    public static final int ERROR_CODE_BADSTATUS = 2;
    public static final int ERROR_CODE_FATAL = 3;
    private static final long serialVersionUID = -377375146110623863L;
    private int _errorCode;

    public ControlFunctionException(String str, int i) {
        this(str, null, i);
    }

    public int getErrorCode() {
        return this._errorCode;
    }

    public int getExceptionCode() {
        return 513;
    }

    public ControlFunctionException(String str, String str2, int i) {
        super(str);
        this._errorCode = 0;
        super.setErrIdentifierCode(str2);
        this._errorCode = i;
    }
}
