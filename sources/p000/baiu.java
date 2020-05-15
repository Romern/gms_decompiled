package p000;

/* renamed from: baiu */
final /* synthetic */ class baiu implements bmxj {

    /* renamed from: a */
    private final bajy f101021a;

    public baiu(bajy bajy) {
        this.f101021a = bajy;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bxwc, bmxj]
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
    public final Object apply(Object obj) {
        bajy bajy = this.f101021a;
        byhc byhc = (byhc) obj;
        bxvd da = byha.f166414f.mo74144da();
        int i = byhc.f166427b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byha byha = (byha) da.f164949b;
        int i2 = byha.f166416a | 1;
        byha.f166416a = i2;
        byha.f166417b = i;
        if ((byhc.f166426a & 2) != 0) {
            int i3 = byhc.f166428c;
            i2 |= 2;
            byha.f166416a = i2;
            byha.f166418c = i3;
        }
        if ((byhc.f166426a & 4) != 0) {
            long j = bajy.f101098a;
            long j2 = byhc.f166429d;
            byha.f166416a = i2 | 4;
            byha.f166419d = j + j2;
        }
        if ((byhc.f166426a & 8) != 0) {
            byix byix = byhc.f166430e;
            if (byix == null) {
                byix = byix.f166620b;
            }
            Iterable a = bnjd.m109575a((Iterable) byix.f166622a, bajx.f101097a);
            bxvd da2 = byir.f166595b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byir byir = (byir) da2.f164949b;
            byir.mo74384c();
            bxsy.m123078a(a, byir.f166597a);
            byir byir2 = (byir) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byha byha2 = (byha) da.f164949b;
            byir2.getClass();
            byha2.f166420e = byir2;
            byha2.f166416a |= 8;
        }
        return (byha) da.mo74062i();
    }
}
