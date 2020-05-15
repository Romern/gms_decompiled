package p000;

import java.util.List;

/* renamed from: kky */
final /* synthetic */ class kky implements bqeg {

    /* renamed from: a */
    private final klf f24392a;

    /* renamed from: b */
    private final bqgj f24393b;

    /* renamed from: c */
    private final kjr f24394c;

    /* renamed from: d */
    private final List f24395d;

    public kky(klf klf, bqgj bqgj, kjr kjr, List list) {
        this.f24392a = klf;
        this.f24393b = bqgj;
        this.f24394c = kjr;
        this.f24395d = list;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        klf klf = this.f24392a;
        bqgj bqgj = this.f24393b;
        kjr kjr = this.f24394c;
        List<bqgg> list = this.f24395d;
        if (klf.f24420g) {
            bqgj.mo25812a(new kkv(klf, kjr));
        }
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bngs j3 = bngx.m109377j();
        bngs j4 = bngx.m109377j();
        for (bqgg bqgg : list) {
            kjs kjs = (kjs) bqgg.get();
            j.mo67666b((Iterable) kjs.f24276a);
            j2.mo67666b((Iterable) kjs.f24278c);
            j3.mo67666b((Iterable) kjs.f24279d);
            j4.mo67666b((Iterable) kjs.f24280e);
        }
        return bqga.m112775a(new kjs(j.mo67664a(), j2.mo67664a(), j3.mo67664a(), j4.mo67664a()));
    }
}
