package p000;

/* renamed from: advf */
final /* synthetic */ class advf implements bmxj {

    /* renamed from: a */
    static final bmxj f62799a = new advf();

    private advf() {
    }

    public final Object apply(Object obj) {
        bsjg bsjg;
        bsjh bsjh;
        bsiz bsiz = (bsiz) obj;
        int i = bsiz.f144771a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                bsjg = (bsjg) bsiz.f144772b;
            } else {
                bsjg = bsjg.f144789b;
            }
            return new advz(bsjg);
        } else if (i3 != 1) {
            return advx.m51257a();
        } else {
            if (i == 2) {
                bsjh = (bsjh) bsiz.f144772b;
            } else {
                bsjh = bsjh.f144792b;
            }
            return new adwa(bsjh);
        }
    }
}
