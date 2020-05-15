package p000;

/* renamed from: acej */
final /* synthetic */ class acej implements bmxj {

    /* renamed from: a */
    private final acen f59650a;

    /* renamed from: b */
    private final bonk f59651b;

    public acej(acen acen, bonk bonk) {
        this.f59650a = acen;
        this.f59651b = bonk;
    }

    public final Object apply(Object obj) {
        boolean z;
        acen acen = this.f59650a;
        bonk bonk = this.f59651b;
        bmxv bmxv = (bmxv) obj;
        try {
            if (!bmxv.mo66813a() || !((bonk) ((basd) bmxv.mo66814b()).mo55930a()).equals(bonk)) {
                z = true;
            } else {
                z = false;
            }
            if (cenv.m137616b()) {
                if (!z) {
                    ((bads) acen.f59657b.mo16713a()).mo32743a(12009);
                } else {
                    ((bads) acen.f59657b.mo16713a()).mo32743a(12010);
                }
            }
            return Boolean.valueOf(z);
        } catch (bxwf e) {
            if (cenv.m137616b()) {
                ((bads) acen.f59657b.mo16713a()).mo32743a(12011);
            }
            return true;
        }
    }
}
