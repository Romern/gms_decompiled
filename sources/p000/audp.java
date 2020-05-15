package p000;

/* renamed from: audp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audp {

    /* renamed from: a */
    public static volatile qws f91423a;

    /* renamed from: b */
    private static volatile qws f91424b;

    private audp() {
    }

    /* renamed from: a */
    public static void m76829a(bolj bolj) {
        if (f91424b == null) {
            synchronized (audp.class) {
                if (f91424b == null) {
                    f91424b = new qws(rpr.m34216b(), "SCOOBY_EVENT_LOG", null);
                }
            }
        }
        f91424b.mo24335a(bolj.mo73642k()).mo24327b();
    }
}
