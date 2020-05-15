package p000;

/* renamed from: chxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxo extends chyf {

    /* renamed from: a */
    final /* synthetic */ chxp f189468a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chxo(chxp chxp) {
        super(chxp.f189471c.f189479e);
        this.f189468a = chxp;
    }

    /* renamed from: a */
    public final void mo85790a() {
        int i = ciix.f190424a;
        try {
            this.f189468a.f189469a.mo70085e();
        } catch (Throwable th) {
            chuv a = chuv.f189216c.mo85692c(th).mo85687a("Failed to call onReady.");
            this.f189468a.f189471c.f189480f.mo85764b(a);
            this.f189468a.mo85795a(a, new chtr());
        }
    }
}
