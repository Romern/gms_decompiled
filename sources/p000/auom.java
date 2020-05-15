package p000;

/* renamed from: auom */
final /* synthetic */ class auom implements bmxj {

    /* renamed from: a */
    private final boolean f92202a;

    public auom(boolean z) {
        this.f92202a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f92202a;
        boolean z2 = true;
        if (!((Boolean) obj).booleanValue() && z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
