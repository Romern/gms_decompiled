package p000;

/* renamed from: bgpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgpb implements bhba {

    /* renamed from: a */
    private final bgng f117153a;

    public bgpb(bgng bgng) {
        this.f117153a = bgng;
    }

    /* renamed from: a */
    public final void mo61420a() {
    }

    /* renamed from: a */
    public final void mo61425a(bsax bsax, long j) {
        bsax.mo70134g(14, this.f117153a.mo62792ct());
        bsax.mo70134g(15, this.f117153a.mo62793cu());
    }

    /* renamed from: a */
    public final void mo61426a(bxvd bxvd, long j) {
        int ct = this.f117153a.mo62792ct();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buna buna = (buna) bxvd.f164949b;
        buna buna2 = buna.f154289i;
        buna.f154291a |= 2048;
        buna.f154297g = ct;
        int cu = this.f117153a.mo62793cu();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buna buna3 = (buna) bxvd.f164949b;
        buna3.f154291a |= 4096;
        buna3.f154298h = cu;
    }
}
