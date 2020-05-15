package p000;

/* renamed from: jnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jnm {

    /* renamed from: a */
    private static jnm f22890a;

    private jnm() {
    }

    /* renamed from: a */
    public static final String m16979a(String str, String str2) {
        String valueOf = String.valueOf(str2);
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* renamed from: b */
    public static final String m16981b(String str, String str2) {
        String valueOf = String.valueOf(str2);
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* renamed from: a */
    public static jnm m16980a() {
        if (f22890a == null) {
            f22890a = new jnm();
        }
        return f22890a;
    }
}
