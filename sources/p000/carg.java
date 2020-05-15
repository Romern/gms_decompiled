package p000;

/* renamed from: carg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class carg {
    /* renamed from: a */
    public static String m127039a(String str) {
        if (str.length() != 1) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
    }
}
