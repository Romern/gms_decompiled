package p000;

/* renamed from: cwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwd {
    /* renamed from: a */
    public static String m7746a(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwd.a(java.lang.String, int, char):java.lang.String
     arg types: [java.lang.String, int, int]
     candidates:
      cwd.a(java.lang.String, int, java.lang.String):java.lang.String
      cwd.a(java.lang.String, int, char):java.lang.String */
    /* renamed from: b */
    public static String m7753b(String str, int i) {
        return m7748a(m7749a(str, i, '0'), i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwd.a(java.lang.String, int, char):java.lang.String
     arg types: [java.lang.String, int, int]
     candidates:
      cwd.a(java.lang.String, int, java.lang.String):java.lang.String
      cwd.a(java.lang.String, int, char):java.lang.String */
    /* renamed from: c */
    public static String m7754c(String str, int i) {
        String a = m7749a(str, i, '0');
        if (a != null) {
            return a.length() > i ? a.substring(a.length() - i) : a;
        }
        return null;
    }

    /* renamed from: a */
    public static String m7747a(String str, char c) {
        if (str == null) {
            return null;
        }
        int length = 32 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length <= 8192) {
            return str.concat(m7746a(c, length));
        }
        String valueOf = String.valueOf(c);
        if (m7751a((CharSequence) valueOf)) {
            valueOf = " ";
        }
        int length2 = valueOf.length();
        int length3 = 32 - str.length();
        if (length3 <= 0) {
            return str;
        }
        if (length2 == 1 && length3 <= 8192) {
            return m7747a(str, valueOf.charAt(0));
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
    public static String m7748a(String str, int i) {
        if (str != null) {
            return str.length() > i ? str.substring(0, i) : str;
        }
        return null;
    }

    /* renamed from: a */
    public static String m7749a(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length <= 8192) {
            return m7746a(c, length).concat(str);
        }
        return m7750a(str, i, String.valueOf(c));
    }

    /* renamed from: a */
    public static String m7750a(String str, int i, String str2) {
        if (m7751a((CharSequence) str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return m7749a(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return new String(cArr).concat(str);
    }

    /* renamed from: a */
    public static boolean m7751a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: a */
    public static boolean m7752a(String str) {
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
