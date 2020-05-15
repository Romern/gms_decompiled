package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: bkph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkph {
    /* renamed from: a */
    static String m106270a(String str) {
        int i = 0;
        while (i < str.length()) {
            if (!m106271a(str.charAt(i))) {
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bytes = str.getBytes("UTF-8");
                    for (byte b : bytes) {
                        char c = (char) b;
                        if (!m106271a(c)) {
                            sb.append('%');
                            sb.append(Character.forDigit((b & 240) >> 4, 16));
                            sb.append(Character.forDigit(b & 15, 16));
                        } else {
                            sb.append(c);
                        }
                    }
                    return sb.toString();
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError();
                }
            } else {
                i++;
            }
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m106271a(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c < 'A' || c > 'Z') {
            return (c >= '0' && c <= '9') || c == '-' || c == '.' || c == '_' || c == '~';
        }
        return true;
    }
}
