package p000;

/* renamed from: eik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eik {
    /* renamed from: a */
    static String m10484a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
