package p000;

/* renamed from: adnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnv {

    /* renamed from: b */
    private static adnv f62239b;

    /* renamed from: a */
    private final snf f62240a;

    public adnv(snf snf) {
        this.f62240a = snf;
    }

    /* renamed from: a */
    public static synchronized adnv m50879a() {
        adnv adnv;
        synchronized (adnv.class) {
            if (f62239b == null) {
                f62239b = new adnv(snp.m35703a(1, 10));
            }
            adnv = f62239b;
        }
        return adnv;
    }

    /* renamed from: a */
    public final void mo33695a(Runnable runnable) {
        this.f62240a.execute(runnable);
    }
}
