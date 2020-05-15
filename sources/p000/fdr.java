package p000;

/* renamed from: fdr */
final /* synthetic */ class fdr implements C0038ax {

    /* renamed from: a */
    private final fdu f16337a;

    public fdr(fdu fdu) {
        this.f16337a = fdu;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fdu fdu = this.f16337a;
        ept ept = (ept) obj;
        if (fdu.f16348e.mo2448b() != fdt.SPLASH) {
            return;
        }
        if (((epm) fdu.f16349f.mo2448b()).f15487c == 3) {
            fdu.f16348e.mo2450b(fdt.ONBOARDING);
        } else {
            fdu.f16348e.mo2450b(fdt.NAVIGATION);
        }
    }
}
