package p000;

/* renamed from: hrs */
final /* synthetic */ class hrs implements bqeh {

    /* renamed from: a */
    private final hsk f20326a;

    /* renamed from: b */
    private final hez f20327b;

    public hrs(hsk hsk, hez hez) {
        this.f20326a = hsk;
        this.f20327b = hez;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hsc]
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
        hsk hsk = this.f20326a;
        hez hez = this.f20327b;
        bngx bngx = (bngx) obj;
        if (!bngx.isEmpty()) {
            return adax.m50091a(bngx.m109355a(bnjd.m109575a((Iterable) bngx, (bmxj) new hsc(hsk, hez))), hsd.f20344a);
        }
        throw adbe.m50106a(28434);
    }
}
