package com.felicanetworks.cmnlib.util;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataCheckerUtil {
    public static final String MATCH_ALPHA_NUM = "^[0-9a-zA-Z]+";
    public static final String MATCH_ALPHA_SIGN = "^[ -~]+";
    public static final String MATCH_HEX_NUM = "^[0-9A-F]+";
    public static final String MATCH_NUMBER = "^[0-9]+";
    public static final String MATCH_PACKAGE = "^[0-9a-zA-Z.]+";
    static final String[] MATCH_PROTOCOL = {"http:", "https:", "market:"};
    public static final String MATCH_URI = "[#-;?-Za-z!=_~]+";
    public static final String MSG_INVALID_PROTOCOL = "invalid protocol.";

    public static void checkAlphaNumberFormat(String str) {
        checkFormat(MATCH_ALPHA_NUM, str);
    }

    public static void checkAlphaSignFormat(String str) {
        checkFormat(MATCH_ALPHA_SIGN, str);
    }

    public static void checkByteLength(String str, int i, boolean z) {
        if (!z) {
            if (str.getBytes().length > i) {
                throw new DataCheckerException(0, str);
            }
        } else if (str.getBytes().length != i) {
            throw new DataCheckerException(0, str);
        }
    }

    public static void checkDecNumberFormat(String str) {
        checkFormat(MATCH_NUMBER, str);
    }

    public static void checkEqualLength(int i, int i2) {
        if (i != i2) {
            throw new DataCheckerException(0, i + " not equal " + i2);
        }
    }

    public static void checkFixValue(String str, String[] strArr) {
        int i = 0;
        if (str != null) {
            int length = strArr.length;
            while (i < length) {
                if (!str.equals(strArr[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new DataCheckerException(1, str);
        }
        throw new DataCheckerException(0, null);
    }

    public static void checkFormat(String str, String str2) {
        if (str2 == null) {
            throw new DataCheckerException(0, null);
        } else if (!str2.matches(str)) {
            throw new DataCheckerException(1, str2);
        }
    }

    public static void checkHexNumberFormat(String str) {
        checkFormat(MATCH_HEX_NUM, str);
    }

    public static void checkLessEqualLength(int i, int i2) {
        if (i > i2) {
            throw new DataCheckerException(0, i + " greater than " + i2);
        }
    }

    public static void checkPackageFormat(String str) {
        checkFormat(MATCH_PACKAGE, str);
    }

    public static void checkUrlCharFormat(String str) {
        int i = 0;
        if (str != null) {
            String[] strArr = MATCH_PROTOCOL;
            int length = strArr.length;
            while (i < length) {
                if (str.indexOf(strArr[i]) != 0) {
                    i++;
                } else if (!str.matches(MATCH_URI)) {
                    throw new DataCheckerException(1, str);
                } else {
                    return;
                }
            }
            throw new DataCheckerException(1, str, MSG_INVALID_PROTOCOL);
        }
        throw new DataCheckerException(0, null);
    }
}
