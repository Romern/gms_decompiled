package com.felicanetworks.cmnlib;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class CommonAppException extends Exception implements ExceptionCodeInterface {
    String errIdentifiercode = null;

    public CommonAppException() {
    }

    public String getErrIdentifierCode() {
        return this.errIdentifiercode;
    }

    public void setErrIdentifierCode(String str) {
        this.errIdentifiercode = str;
    }

    public CommonAppException(String str) {
        super(str);
    }

    public CommonAppException(String str, Throwable th) {
        super(str, th);
    }

    public CommonAppException(Throwable th) {
        super(th);
    }
}
