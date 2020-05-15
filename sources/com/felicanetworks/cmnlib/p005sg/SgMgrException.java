package com.felicanetworks.cmnlib.p005sg;

import com.felicanetworks.cmnlib.ExceptionCodeInterface;

/* renamed from: com.felicanetworks.cmnlib.sg.SgMgrException */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SgMgrException extends Exception implements ExceptionCodeInterface {
    String errIdentifierCode = null;

    public SgMgrException() {
    }

    public String getErrIdentifierCode() {
        return this.errIdentifierCode;
    }

    public int getExceptionCode() {
        return 8;
    }

    public void setErrIdentifierCode(String str) {
        this.errIdentifierCode = str;
    }

    public SgMgrException(String str) {
        super(str);
    }

    public SgMgrException(String str, Throwable th) {
        super(str, th);
    }

    public SgMgrException(Throwable th) {
        super(th);
    }
}
