package p000;

/* renamed from: bryn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bryn extends chqr {

    /* renamed from: a */
    public final chqr f143664a;

    /* renamed from: b */
    private final blka f143665b = blka.m107273a();

    public bryn(chqr chqr) {
        this.f143664a = chqr;
    }

    /* renamed from: a */
    private final void m114876a(Runnable runnable) {
        if (blkh.m107295b(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) {
            runnable.run();
        } else {
            bljx.m107268a(this.f143665b.f126722a, runnable).run();
        }
    }

    /* renamed from: e */
    public final void mo70085e() {
        chqr chqr = this.f143664a;
        chqr.getClass();
        m114876a((Runnable) new brym(chqr));
    }

    /* renamed from: a */
    public final void mo25569a(chtr chtr) {
        m114876a((Runnable) new bryj(this, chtr));
    }

    /* renamed from: a */
    public final void mo25570a(chuv chuv, chtr chtr) {
        m114876a((Runnable) new bryl(this, chuv, chtr));
    }

    /* renamed from: a */
    public final void mo25571a(Object obj) {
        m114876a((Runnable) new bryk(this, obj));
    }
}
