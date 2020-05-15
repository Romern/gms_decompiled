package p000;

/* renamed from: bbuf */
final /* synthetic */ class bbuf implements bmxj {

    /* renamed from: a */
    private final bbwq f103414a;

    /* renamed from: b */
    private final bcoh f103415b;

    public bbuf(bbwq bbwq, bcoh bcoh) {
        this.f103414a = bbwq;
        this.f103415b = bcoh;
    }

    public final Object apply(Object obj) {
        bbwq bbwq = this.f103414a;
        bcoh bcoh = this.f103415b;
        bngx bngx = (bngx) obj;
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            bbwq.mo56327b(bcoh, ((bcsp) i.next()).mo57317a()).mo57832f();
        }
        return bngx;
    }
}
