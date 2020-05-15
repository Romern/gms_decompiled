package p000;

/* renamed from: baye */
final /* synthetic */ class baye implements bmxj {

    /* renamed from: a */
    private final bayg f102084a;

    public baye(bayg bayg) {
        this.f102084a = bayg;
    }

    public final Object apply(Object obj) {
        bayg bayg = this.f102084a;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        bayg.f102090e.mo34988b(1036);
        bbev.m87905a("%s: Failed to remove expired groups!", "ExpirationHandler");
        return null;
    }
}
