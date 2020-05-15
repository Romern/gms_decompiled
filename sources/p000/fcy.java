package p000;

/* renamed from: fcy */
final /* synthetic */ class fcy implements epg {

    /* renamed from: a */
    private final fda f16293a;

    public fcy(fda fda) {
        this.f16293a = fda;
    }

    /* renamed from: a */
    public final Object mo10390a(Object obj, Object obj2) {
        fda fda = this.f16293a;
        eps eps = (eps) obj;
        bmxv bmxv = (bmxv) obj2;
        boolean z = true;
        if (!bmxv.mo66813a() || !((eps) bmxv.mo66814b()).f15497a) {
            if (fda.f16303h) {
                z = eps.f15497a;
                if (z) {
                    fda.f16303h = false;
                }
            } else if (!eps.f15497a || !eps.f15498b) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
