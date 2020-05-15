package p000;

/* renamed from: fdq */
final /* synthetic */ class fdq implements C0038ax {

    /* renamed from: a */
    private final fdu f16336a;

    public fdq(fdu fdu) {
        this.f16336a = fdu;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fdu fdu = this.f16336a;
        epm epm = (epm) obj;
        if (fdu.f16348e.mo2448b() == fdt.PENDING) {
            int i = epm.f15487c;
            if (i == 2) {
                fdu.f16348e.mo2450b(fdt.SPLASH);
            } else if (i == 3) {
                fdu.f16348e.mo2450b(fdt.ONBOARDING);
            } else if (i == 4) {
                fdu.f16348e.mo2450b(fdt.NAVIGATION);
            }
        }
    }
}
