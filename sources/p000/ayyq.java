package p000;

import java.util.concurrent.Future;

/* renamed from: ayyq */
final /* synthetic */ class ayyq implements bqeg {

    /* renamed from: a */
    private final ayyu f98755a;

    /* renamed from: b */
    private final String f98756b;

    /* renamed from: c */
    private final bqgg f98757c;

    /* renamed from: d */
    private final bqgg f98758d;

    /* renamed from: e */
    private final ayyf f98759e;

    /* renamed from: f */
    private final bqgg f98760f;

    /* renamed from: g */
    private final ayvy f98761g;

    public ayyq(ayyu ayyu, String str, bqgg bqgg, bqgg bqgg2, ayyf ayyf, bqgg bqgg3, ayvy ayvy) {
        this.f98755a = ayyu;
        this.f98756b = str;
        this.f98757c = bqgg;
        this.f98758d = bqgg2;
        this.f98759e = ayyf;
        this.f98760f = bqgg3;
        this.f98761g = ayvy;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        ayyu ayyu = this.f98755a;
        String str = this.f98756b;
        bqgg bqgg = this.f98757c;
        bqgg bqgg2 = this.f98758d;
        ayyf ayyf = this.f98759e;
        bqgg bqgg3 = this.f98760f;
        ayvy ayvy = this.f98761g;
        aywc i = aywd.m84968i();
        i.mo54475a(str);
        i.mo54473a((bxxc) bqga.m112780a((Future) bqgg));
        i.f98604a = (boki) bqga.m112780a((Future) bqgg2);
        i.f98605b = (Integer) ayyu.f98767a.mo40449c(ayyf).mo66810a(ayyt.f98766a).mo66815c();
        i.f98608e = (int[]) bqga.m112780a((Future) bqgg3);
        i.mo54474a(cagz.DEFAULT);
        ayye ayye = (ayye) ayyf.f98736b.get(0);
        if ((ayyc.m85064a(ayye).f98652a & 4) != 0) {
            long j = ayyc.m85064a(ayye).f98656e;
            i.f98606c = Long.valueOf(ayvj.m84935a(j) / 1000);
            i.f98607d = Long.valueOf(j / 1000);
        }
        bljb a = blkh.m107281a("GIL:ClearcutTransmitter");
        try {
            bqgg a2 = ayyu.f98768b.mo54476a(i.mo54472a(), ayvy.f98588b);
            a.mo66586a(a2);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
