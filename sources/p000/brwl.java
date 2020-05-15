package p000;

/* renamed from: brwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brwl implements bqfp {

    /* renamed from: a */
    final /* synthetic */ chqr f143525a;

    /* renamed from: b */
    final /* synthetic */ brwm f143526b;

    public brwl(brwm brwm, chqr chqr) {
        this.f143526b = brwm;
        this.f143525a = chqr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        chqs chqs = (chqs) obj;
        try {
            brwm brwm = this.f143526b;
            brwm.f143528b = chqs;
            for (Runnable runnable : brwm.f143527a) {
                runnable.run();
            }
        } catch (Throwable th) {
            mo6481a(th);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f143526b.f143530d = true;
        this.f143525a.mo25570a(chuv.m149608a(th), new chtr());
    }
}
