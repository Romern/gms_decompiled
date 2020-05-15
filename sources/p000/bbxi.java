package p000;

/* renamed from: bbxi */
final /* synthetic */ class bbxi implements bmxj {

    /* renamed from: a */
    private final bbxm f103663a;

    /* renamed from: b */
    private final bcoh f103664b;

    public bbxi(bbxm bbxm, bcoh bcoh) {
        this.f103663a = bbxm;
        this.f103664b = bcoh;
    }

    public final Object apply(Object obj) {
        bbxm bbxm = this.f103663a;
        bcoh bcoh = this.f103664b;
        bbyq bbyq = (bbyq) obj;
        if (bbyq.mo56531d() == 2 && bbyq.mo56529b().mo66813a()) {
            return (bcoz) bbyq.mo56529b().mo66814b();
        }
        synchronized (bbxm.f103682h) {
            bbxm.f103684j.remove(bcoh);
        }
        return null;
    }
}
