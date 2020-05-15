package p000;

/* renamed from: fyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fyf implements rkl {

    /* renamed from: a */
    public boolean f17615a;

    /* renamed from: b */
    final /* synthetic */ fyg f17616b;

    public fyf(fyg fyg) {
        this.f17616b = fyg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        allk allk = (allk) rkk;
        if (!this.f17615a) {
            if (allk.mo7183bo().mo17710c()) {
                fyg fyg = this.f17616b;
                rto rto = fyg.f17619c;
                if (rto == null) {
                    fyg.f17619c = new rto(allk.mo40472b());
                } else {
                    fyg.f17619c = rto.m34406a(rto, allk.mo40472b());
                }
            }
            this.f17616b.f17618b = allk.mo40488d();
            fyg fyg2 = this.f17616b;
            fyg2.f17620d = null;
            fyg2.mo41658b(allk.mo7183bo(), this.f17616b.f17619c);
        }
    }
}
