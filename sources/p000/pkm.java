package p000;

/* renamed from: pkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pkm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pkn f39487a;

    public pkm(pkn pkn) {
        this.f39487a = pkn;
    }

    public final void run() {
        qav qav;
        try {
            this.f39487a.f39489b.mo23861b("**** selector loop thread starting");
            this.f39487a.f39492e.countDown();
            this.f39487a.mo23324c();
            qav = this.f39487a.f39489b;
        } catch (Throwable th) {
            this.f39487a.f39489b.mo23861b("**** selector loop thread exiting");
            this.f39487a.f39499l = null;
            this.f39487a.mo23326e();
            throw th;
        }
        qav.mo23861b("**** selector loop thread exiting");
        this.f39487a.f39499l = null;
        this.f39487a.mo23326e();
    }
}
