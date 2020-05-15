package p000;

/* renamed from: bmwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmwb {
    /* renamed from: a */
    public static char m108441a(char c) {
        return m108445b(c) ? (char) (c ^ ' ') : c;
    }

    /* renamed from: b */
    public static String m108444b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (!m108445b(str.charAt(i))) {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m108445b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m108445b(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: c */
    public static boolean m108446c(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: d */
    private static int m108447d(char c) {
        return (char) ((c | ' ') - 'a');
    }

    /* renamed from: a */
    public static String m108442a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (!m108446c(str.charAt(i))) {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m108446c(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m108443a(CharSequence charSequence, CharSequence charSequence2) {
        int d;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((d = m108447d(charAt)) >= 26 || d != m108447d(charAt2))) {
                return false;
            }
        }
        return true;
    }
}
