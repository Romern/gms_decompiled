package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: yrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yrm {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Collection, bmxj]
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
    public static bngx m44666a(Collection collection) {
        return bngx.m109355a(bnjd.m109575a((Iterable) collection, yrk.f54491a));
    }

    /* renamed from: a */
    public static bngx m44667a(List list, caae caae, zrd zrd) {
        yrl yrl = new yrl(zrd);
        bngs b = bngx.m109371b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            caaa caaa = (caaa) it.next();
            b.mo67668c(zrw.m46080a(caaa, caae, yrl.apply(caaa.f172311e)));
        }
        return b.mo67664a();
    }
}
