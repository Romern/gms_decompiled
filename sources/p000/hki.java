package p000;

/* renamed from: hki */
final /* synthetic */ class hki implements bqeh {

    /* renamed from: a */
    private final hkq f19941a;

    /* renamed from: b */
    private final hez f19942b;

    public hki(hkq hkq, hez hez) {
        this.f19941a = hkq;
        this.f19942b = hez;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hkj]
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
        hkq hkq = this.f19941a;
        hez hez = this.f19942b;
        bngx bngx = (bngx) obj;
        if (!bngx.isEmpty()) {
            return adax.m50094a(bnjd.m109575a((Iterable) bngx, (bmxj) new hkj(hkq, hez)), new hkk(bngx));
        }
        throw adbe.m50106a(28434);
    }
}
