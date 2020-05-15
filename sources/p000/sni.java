package p000;

/* renamed from: sni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sni implements adzp {

    /* renamed from: b */
    private final Object f44795b;

    public sni(Object obj) {
        this.f44795b = obj;
    }

    /* renamed from: a */
    public static sni m35697a() {
        return new sni(snc.m35689a());
    }

    /* renamed from: b */
    public final blji mo25772b() {
        bliy a = blkh.m107280a(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        snc.m35690a(this.f44795b, a);
        return new sng(a);
    }

    /* renamed from: a */
    public final void mo25771a(Runnable runnable) {
        bliy a = blkh.m107280a(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        snc.m35690a(this.f44795b, a);
        try {
            runnable.run();
        } finally {
            blkh.m107287a(a, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        }
    }
}
