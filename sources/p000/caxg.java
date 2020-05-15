package p000;

/* renamed from: caxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxg {
    /* renamed from: a */
    public static int m127459a(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m127461b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong >= 0) {
                return (int) parseLong;
            }
            return 0;
        } catch (NumberFormatException e) {
            return i;
        }
    }

    /* renamed from: a */
    public static int m127460a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
