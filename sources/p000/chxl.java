package p000;

/* renamed from: chxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxl extends chyf {

    /* renamed from: a */
    final /* synthetic */ chtr f189461a;

    /* renamed from: b */
    final /* synthetic */ chxp f189462b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chxl(chxp chxp, chtr chtr) {
        super(chxp.f189471c.f189479e);
        this.f189462b = chxp;
        this.f189461a = chtr;
    }

    /* renamed from: a */
    public final void mo85790a() {
        int i = ciix.f190424a;
        chxp chxp = this.f189462b;
        if (!chxp.f189470b) {
            try {
                chxp.f189469a.mo25569a(this.f189461a);
            } catch (Throwable th) {
                chuv a = chuv.f189216c.mo85692c(th).mo85687a("Failed to read headers");
                this.f189462b.f189471c.f189480f.mo85764b(a);
                this.f189462b.mo85795a(a, new chtr());
            }
        }
    }
}
