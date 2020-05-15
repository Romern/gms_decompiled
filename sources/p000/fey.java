package p000;

/* renamed from: fey */
final /* synthetic */ class fey implements epg {

    /* renamed from: a */
    private final ffb f16423a;

    public fey(ffb ffb) {
        this.f16423a = ffb;
    }

    /* renamed from: a */
    public final Object mo10390a(Object obj, Object obj2) {
        ffb ffb = this.f16423a;
        eps eps = (eps) obj;
        bmxv bmxv = (bmxv) obj2;
        boolean z = true;
        if (!bmxv.mo66813a() || !((eps) bmxv.mo66814b()).f15497a) {
            if (ffb.f16433i) {
                z = eps.f15497a;
                if (!z) {
                    ffb.f16433i = false;
                }
            } else if (!eps.f15497a || !eps.f15498b) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
