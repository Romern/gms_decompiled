package p000;

/* renamed from: bajk */
final /* synthetic */ class bajk implements bmxj {

    /* renamed from: a */
    static final bmxj f101059a = new bajk();

    private bajk() {
    }

    public final Object apply(Object obj) {
        boolean z;
        byhk byhk;
        Long l;
        bykb bykb = (bykb) obj;
        byka a = byka.m124893a(bykb.f166730c);
        if (a == null) {
            a = byka.UNKNOWN;
        }
        boolean z2 = false;
        if (a != byka.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        byka a2 = byka.m124893a(bykb.f166730c);
        if (a2 == null) {
            a2 = byka.UNKNOWN;
        }
        bmxy.m108596a(z, "Invalid change result status %s!", a2);
        byka a3 = byka.m124893a(bykb.f166730c);
        if (a3 == null) {
            a3 = byka.UNKNOWN;
        }
        if (a3 == byka.ACCEPTED) {
            z2 = true;
        }
        if (bykb.f166728a == 2) {
            byhk = (byhk) bykb.f166729b;
        } else {
            byhk = byhk.f166467c;
        }
        if ((byhk.f166469a & 1) != 0) {
            l = Long.valueOf(byhk.f166470b);
        } else {
            l = null;
        }
        return new bacz(z2, l);
    }
}
