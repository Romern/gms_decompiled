package p000;

import java.util.concurrent.Future;

/* renamed from: hsb */
final /* synthetic */ class hsb implements bqeh {

    /* renamed from: a */
    private final hsk f20339a;

    /* renamed from: b */
    private final hez f20340b;

    /* renamed from: c */
    private final bqgg f20341c;

    public hsb(hsk hsk, hez hez, bqgg bqgg) {
        this.f20339a = hsk;
        this.f20340b = hez;
        this.f20341c = bqgg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adax.a(bngx, bmxj):bqgg
     arg types: [bngx, hsf]
     candidates:
      adax.a(bqgg, java.lang.Object):bqgg
      adax.a(java.lang.Iterable, bmxj):bqgg
      adax.a(bngx, bmxj):bqgg */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hse]
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
        hsk hsk = this.f20339a;
        hez hez = this.f20340b;
        bqgg bqgg = this.f20341c;
        if (!((Boolean) obj).booleanValue()) {
            bngx bngx = (bngx) bqga.m112780a((Future) bqgg);
            return bqdx.m112674a(adax.m50091a(bngx.m109355a(bnjd.m109575a((Iterable) bngx, (bmxj) new hse(hsk, hez))), (bmxj) new hsf(hdw.m14231a(hsk.f20360e))), new hsg(hsk, hez, bngx), bqfb.INSTANCE);
        }
        throw adbe.m50106a(28435);
    }
}
