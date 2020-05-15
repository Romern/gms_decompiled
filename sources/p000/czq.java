package p000;

/* renamed from: czq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czq {
    /* renamed from: a */
    public static String m8037a(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m8043b(String str, int i) {
        if (str != null) {
            return str.length() > i ? str.substring(0, i) : str;
        }
        return null;
    }

    /* renamed from: c */
    public static String m8044c(String str, int i) {
        return m8043b(m8040a(str, i, '0'), i);
    }

    /* renamed from: d */
    public static String m8045d(String str, int i) {
        return m8039a(m8040a(str, i, '0'), i);
    }

    /* renamed from: a */
    public static String m8038a(String str, char c) {
        if (str == null) {
            return null;
        }
        int length = 32 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length <= 8192) {
            return str.concat(m8037a(c, length));
        }
        String valueOf = String.valueOf(c);
        if (m8041a((CharSequence) valueOf)) {
            valueOf = " ";
        }
        int length2 = valueOf.length();
        int length3 = 32 - str.length();
        if (length3 <= 0) {
            return str;
        }
        if (length2 == 1 && length3 <= 8192) {
            return m8038a(str, valueOf.charAt(0));
        }
        if (length3 == length2) {
            return str.concat(valueOf);
        }
        if (length3 < length2) {
            return str.concat(valueOf.substring(0, length3));
        }
        char[] cArr = new char[length3];
        char[] charArray = valueOf.toCharArray();
        for (int i = 0; i < length3; i++) {
            cArr[i] = charArray[i % length2];
        }
        return str.concat(new String(cArr));
    }

    /* renamed from: a */
    public static String m8039a(String str, int i) {
        if (str != null) {
            return str.length() > i ? str.substring(str.length() - i) : str;
        }
        return null;
    }

    /* renamed from: a */
    public static String m8040a(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length <= 8192) {
            return m8037a(c, length).concat(str);
        }
        String valueOf = String.valueOf(c);
        if (m8041a((CharSequence) valueOf)) {
            valueOf = " ";
        }
        int length2 = valueOf.length();
        int length3 = i - str.length();
        if (length3 <= 0) {
            return str;
        }
        if (length2 == 1 && length3 <= 8192) {
            return m8040a(str, i, valueOf.charAt(0));
        }
        if (length3 == length2) {
            return valueOf.concat(str);
        }
        if (length3 < length2) {
            return valueOf.substring(0, length3).concat(str);
        }
        char[] cArr = new char[length3];
        char[] charArray = valueOf.toCharArray();
        for (int i2 = 0; i2 < length3; i2++) {
            cArr[i2] = charArray[i2 % length2];
        }
        return new String(cArr).concat(str);
    }

    /* renamed from: a */
    public static boolean m8041a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: a */
    public static boolean m8042a(String str) {
        int length;
        int i;
        if (!(str == null || (length = str.length()) == 0)) {
            if (str.charAt(0) != '-') {
                i = 0;
            } else if (length != 1) {
                i = 1;
            }
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt <= '/' || charAt >= ':') {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }
}
