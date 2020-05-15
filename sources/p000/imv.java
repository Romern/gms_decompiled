package p000;

/* renamed from: imv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imv {
    /* renamed from: a */
    public static String m15741a(String str) {
        int indexOf;
        sdo.m34959a((Object) str);
        String lowerCase = str.toLowerCase();
        int i = -1;
        if (!(lowerCase == null || (indexOf = lowerCase.indexOf("@")) == -1)) {
            String substring = lowerCase.substring(indexOf + 1);
            if ("gmail.com".equalsIgnoreCase(substring) || "googlemail.com".equalsIgnoreCase(substring)) {
                i = lowerCase.indexOf(64);
            }
        }
        if (i <= 0) {
            return lowerCase;
        }
        StringBuilder sb = null;
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = lowerCase.charAt(i2);
            if (charAt != '.') {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else if (sb == null) {
                sb = new StringBuilder(lowerCase.substring(0, i2));
            }
        }
        if (sb == null) {
            return lowerCase;
        }
        sb.append(lowerCase.substring(i));
        return sb.toString();
    }
}
