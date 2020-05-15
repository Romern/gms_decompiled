package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: awy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awy {

    /* renamed from: a */
    private static boolean[] f2459a = new boolean[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    private static boolean[] f2460b = new boolean[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: a */
    public static String m2306a(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt == '-' || charAt == '_') {
                    stringBuffer.append('-');
                    i++;
                } else if (i == 2) {
                    stringBuffer.append(Character.toUpperCase(str.charAt(i2)));
                } else {
                    stringBuffer.append(Character.toLowerCase(str.charAt(i2)));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static boolean m2307a(char c) {
        return ((c > 31 && c != 127) || c == 9 || c == 10 || c == 13) ? false : true;
    }

    /* renamed from: b */
    private static boolean m2308b(char c) {
        return c > 255 || f2459a[c];
    }

    /* renamed from: c */
    private static boolean m2310c(char c) {
        return c > 255 || f2460b[c];
    }

    /* renamed from: d */
    public static boolean m2312d(String str) {
        int i;
        if (str.length() <= 0) {
            i = 1;
        } else if (!m2308b(str.charAt(0))) {
            return false;
        } else {
            i = 1;
        }
        while (i < str.length()) {
            if (!m2310c(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m2313e(String str) {
        int i;
        if (str.length() <= 0) {
            i = 1;
        } else if (!m2308b(str.charAt(0)) || str.charAt(0) == ':') {
            return false;
        } else {
            i = 1;
        }
        while (i < str.length()) {
            if (!m2310c(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
            i++;
        }
        return true;
    }

    static {
        boolean z;
        char c = 0;
        while (c < f2460b.length) {
            boolean[] zArr = f2459a;
            boolean z2 = true;
            if (c < 'a' || c > 'z') {
                z = (c >= 'A' && c <= 'Z') || c == ':' || c == '_' || (c >= 192 && c <= 214) || (c >= 216 && c <= 246);
            } else {
                z = true;
            }
            zArr[c] = z;
            boolean[] zArr2 = f2460b;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && !((c >= '0' && c <= '9') || c == ':' || c == '_' || c == '-' || c == '.' || c == 183 || ((c >= 192 && c <= 214) || (c >= 216 && c <= 246))))) {
                z2 = false;
            }
            zArr2[c] = z2;
            c = (char) (c + 1);
        }
    }

    /* renamed from: b */
    static String[] m2309b(String str) {
        int i;
        int indexOf = str.indexOf(61);
        if (str.charAt(1) == '?') {
            i = 2;
        } else {
            i = 1;
        }
        String substring = str.substring(i, indexOf);
        int i2 = indexOf + 1;
        char charAt = str.charAt(i2);
        int i3 = i2 + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - indexOf);
        while (i3 < length) {
            stringBuffer.append(str.charAt(i3));
            i3++;
            if (str.charAt(i3) == charAt) {
                i3++;
            }
        }
        return new String[]{substring, stringBuffer.toString()};
    }

    /* renamed from: c */
    static boolean m2311c(String str) {
        if (str != null) {
            int i = 0;
            boolean z = true;
            int i2 = 0;
            while (i < str.length()) {
                if (str.charAt(i) == '-') {
                    i2++;
                    z = z && (i == 8 || i == 13 || i == 18 || i == 23);
                }
                i++;
            }
            return z && i2 == 4 && i == 36;
        }
    }
}
