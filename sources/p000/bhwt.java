package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bhwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwt implements bhto {

    /* renamed from: a */
    final /* synthetic */ Set f119752a;

    /* renamed from: b */
    final /* synthetic */ bhws f119753b;

    public bhwt(Set set, bhws bhws) {
        this.f119752a = set;
        this.f119753b = bhws;
    }

    /* renamed from: a */
    public final void mo64222a(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bvoa bvoa = (bvoa) it.next();
            int i = bvoa.f156996a;
            if ((i & 4) == 0 || (i & 8) == 0) {
                bhuj.m101555a().mo64360b("PlaceInfo missing lat or lng.");
            } else {
                this.f119752a.add(new bhub(bvoa.f156999d, bvoa.f157000e, 0, Float.NaN, "unknown", 0, -1.0f));
            }
        }
        bhws bhws = this.f119753b;
        Set<bhub> set = this.f119752a;
        if (!set.isEmpty()) {
            bhuj.m101555a();
            bhso bhso = bhws.f119751b.f119464b;
            HashSet<Long> hashSet = new HashSet();
            for (bhub bhub : set) {
                hashSet.addAll(bhug.m101542a(bhub, (int) cggv.f186908a.mo6606a().mo83766a()));
            }
            long[] jArr = new long[hashSet.size()];
            int i2 = 0;
            for (Long l : hashSet) {
                jArr[i2] = l.longValue();
                i2++;
            }
            bhso.f119476a.mo64347a(jArr, true);
            bhso.f119483h.f119590e++;
        }
    }
}
