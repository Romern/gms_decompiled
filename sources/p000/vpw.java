package p000;

/* renamed from: vpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpw {
    /* renamed from: a */
    public static String m41036a(String str) {
        boolean z;
        int i;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            int codePointAt = str.codePointAt(i2);
            int type = Character.getType(codePointAt);
            if (type == 15 || type == 16 || type == 13 || type == 14) {
                z = false;
            } else {
                z = type != 12;
            }
            if (!z) {
                i = 32;
            } else {
                i = codePointAt;
            }
            sb.appendCodePoint(i);
            i2 += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m41037b(String str) {
        String replace = str.replace("\\", "\\\\").replace("'", "\\'");
        StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 2);
        sb.append("'");
        sb.append(replace);
        sb.append("'");
        return sb.toString();
    }
}
