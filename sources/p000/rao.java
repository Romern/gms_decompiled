package p000;

/* renamed from: rao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rao {
    /* renamed from: a */
    static boolean m33182a(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || length > 64) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                return false;
            }
        }
        return true;
    }
}
