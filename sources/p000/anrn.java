package p000;

/* renamed from: anrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anrn implements rkl {

    /* renamed from: a */
    public boolean f77507a;

    /* renamed from: b */
    final /* synthetic */ anro f77508b;

    public anrn(anro anro) {
        this.f77508b = anro;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        allk allk = (allk) rkk;
        if (!this.f77507a) {
            if (allk.mo7183bo().mo17710c()) {
                anro anro = this.f77508b;
                rto rto = anro.f77511c;
                if (rto == null) {
                    anro.f77511c = new rto(allk.mo40472b());
                } else {
                    anro.f77511c = rto.m34406a(rto, allk.mo40472b());
                }
            }
            this.f77508b.f77510b = allk.mo40488d();
            anro anro2 = this.f77508b;
            anro2.f77512d = null;
            anro2.mo41658b(allk.mo7183bo(), this.f77508b.f77511c);
        }
    }
}
