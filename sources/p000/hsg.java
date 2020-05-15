package p000;

/* renamed from: hsg */
final /* synthetic */ class hsg implements bqeh {

    /* renamed from: a */
    private final hsk f20348a;

    /* renamed from: b */
    private final hez f20349b;

    /* renamed from: c */
    private final bngx f20350c;

    public hsg(hsk hsk, hez hez, bngx bngx) {
        this.f20348a = hsk;
        this.f20349b = hez;
        this.f20350c = bngx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hsh]
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.HashSet, hry]
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, bmxj]
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
        hsk hsk = this.f20348a;
        hez hez = this.f20349b;
        bngx bngx = this.f20350c;
        bngx bngx2 = (bngx) obj;
        if (!bngx2.isEmpty()) {
            return hsk.mo12692a(hez, bnjd.m109575a((Iterable) bnpf.m110049a(bnjd.m109575a((Iterable) bngx2, hrx.f20332a)), (bmxj) new hry(hsk)));
        }
        if (!bmxx.m108577a(hsk.f20360e.f10097f)) {
            bmxv a = hsk.m14815a(hsk.f20360e);
            if (a.mo66813a()) {
                hip hip = new hip(hsk.f20360e);
                hip.f19832a = ((acyr) a.mo66814b()).mo33252a();
                return hsk.mo12692a(hez, bngx.m109356a(hip.mo12504a()));
            }
        }
        if (!bmxx.m108577a(hsk.f20360e.f10097f) || ((hjg) hjg.f19886a.mo33309a()).mo12577b(hsk.f20359d)) {
            return bqdx.m112673a(adax.m50091a(bngx.m109355a(bnjd.m109575a((Iterable) bngx, (bmxj) new hsh(hsk))), hsi.f20352a), new hsj(hsk, bngx), bqfb.INSTANCE);
        }
        throw adbe.m50106a(28431);
    }
}
