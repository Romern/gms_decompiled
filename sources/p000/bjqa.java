package p000;

/* renamed from: bjqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqa {
    /* renamed from: a */
    public static String m104306a(String str) {
        return str.replaceAll("[^\\d]", "");
    }

    /* renamed from: a */
    public static String m104307a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        while (true) {
            if (i < min) {
                if (str.charAt(i) != str2.charAt(i)) {
                    min = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        int length = str2.length();
        while (min < length && Character.isWhitespace(str2.charAt(min))) {
            min++;
        }
        return str2.substring(min);
    }
}
