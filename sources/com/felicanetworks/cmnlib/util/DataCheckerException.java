package com.felicanetworks.cmnlib.util;

import com.felicanetworks.cmnlib.CommonAppException;
import com.felicanetworks.cmnlib.ExceptionCodeInterface;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataCheckerException extends CommonAppException implements ExceptionCodeInterface {
    public static final int ID_ATTRIBUTE_ERROR = 1;
    public static final int ID_LENGTH_ERROR = 0;

    /* renamed from: id */
    private int f7373id;

    public DataCheckerException() {
        this.f7373id = -1;
    }

    public int getErrorId() {
        return this.f7373id;
    }

    public int getExceptionCode() {
        return 9;
    }

    public DataCheckerException(int i) {
        super("errorId:" + i);
        this.f7373id = i;
    }

    public DataCheckerException(int i, String str) {
        this(i, str, "");
    }

    public DataCheckerException(int i, String str, String str2) {
        super("errorId:" + i + " " + str2 + " {" + str + "}");
        this.f7373id = i;
    }
}
