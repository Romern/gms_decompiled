package p000;

/* renamed from: ffc */
public final /* synthetic */ class ffc implements C0038ax {

    /* renamed from: a */
    private final ffe f16435a;

    public ffc(ffe ffe) {
        this.f16435a = ffe;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ffe ffe = this.f16435a;
        epm epm = (epm) obj;
        if (ffe.f16444d.mo2448b() != ffd.FINISHING_WITH_ONBOARDING && ffe.f16444d.mo2448b() != ffd.FINISHING_WITHOUT_ONBOARDING) {
            int i = epm.f15487c;
            if (i == 4) {
                ffe.f16444d.mo2450b(ffd.FINISHING_WITHOUT_ONBOARDING);
            } else if (i == 3) {
                ffe.f16444d.mo2450b(ffd.FINISHING_WITH_ONBOARDING);
            }
        }
    }
}
