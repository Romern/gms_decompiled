package p000;

import java.util.List;

/* renamed from: bbrb */
final /* synthetic */ class bbrb implements bmxj {

    /* renamed from: a */
    private final bbrr f103196a;

    /* renamed from: b */
    private final bcoh f103197b;

    public bbrb(bbrr bbrr, bcoh bcoh) {
        this.f103196a = bbrr;
        this.f103197b = bcoh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, bbrg]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    public final Object apply(Object obj) {
        bbrr bbrr = this.f103196a;
        bcoh bcoh = this.f103197b;
        bbpe bbpe = (bbpe) obj;
        if (bbpe == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        bdal b = bbrr.mo56387b(bcoh);
        bngx b2 = bbpe.mo56285b();
        bbrr.f103233a.getClass();
        b.mo56648b(bnkn.m109668a((List) b2, (bmxj) new bbrg()));
        bbrr.f103236d.mo56674a(bcoh).edit().putLong("BLOCK_LAST_SYNC_KEY", currentTimeMillis).commit();
        return null;
    }
}
