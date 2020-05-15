package p000;

/* renamed from: hrl */
final /* synthetic */ class hrl implements bqeh {

    /* renamed from: a */
    private final hrr f20307a;

    /* renamed from: b */
    private final bngx f20308b;

    /* renamed from: c */
    private final bngx f20309c;

    public hrl(hrr hrr, bngx bngx, bngx bngx2) {
        this.f20307a = hrr;
        this.f20308b = bngx;
        this.f20309c = bngx2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hrn]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Object a;
        bqgg bqgg;
        hrr hrr = this.f20307a;
        bngx bngx = this.f20308b;
        bngx bngx2 = this.f20309c;
        Boolean bool = (Boolean) obj;
        if (bngx.size() > 1) {
            return hrr.mo12690a(bool.booleanValue());
        }
        hnc hnc = hrr.f20324f;
        String str = hrr.f20321c;
        hns hns = hnc.f20056a;
        hnl hnl = hns.f20088e;
        sdo.m34959a(hnl);
        sdo.m34977c(str);
        synchronized (hns.f20090c) {
            hng hng = hns.f20089b;
            String b = hds.m14229b(str);
            a = hng.mo12631a(hnq.f20084b, new String[]{"---", b, hnl.f20074a}, new hno(hnl), hnl.f20075b);
            if (a == null) {
                a = hnl.f20075b;
            }
        }
        if (!((Boolean) a).booleanValue()) {
            bqgg = bqga.m112775a((Object) false);
        } else {
            bqgg = adax.m50091a(bngx.m109355a(bnjd.m109575a((Iterable) bngx2, (bmxj) new hrn(hrr))), hro.f20314a);
        }
        return bqdx.m112674a(bqgg, new hrq(hrr, bool, bngx), bqfb.INSTANCE);
    }
}
