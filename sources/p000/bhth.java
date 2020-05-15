package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bhth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhth implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119539a;

    /* renamed from: b */
    final /* synthetic */ bhtn f119540b;

    /* renamed from: c */
    final /* synthetic */ bhtl f119541c;

    public bhth(bhtl bhtl, Collection collection, bhtn bhtn) {
        this.f119541c = bhtl;
        this.f119539a = collection;
        this.f119540b = bhtn;
    }

    public final void run() {
        bhtl bhtl = this.f119541c;
        Collection collection = this.f119539a;
        bhtn bhtn = this.f119540b;
        bhsw bhsw = bhtl.f119550a;
        if (bhsw != null) {
            bhtq a = bhsw.mo64242a((Set) new HashSet(collection));
            HashSet hashSet = new HashSet();
            long[] jArr = new long[a.f119564b.size()];
            int i = 0;
            for (Long l : a.f119564b) {
                jArr[i] = l.longValue();
                i++;
            }
            for (long[] jArr2 : a.f119563a.values()) {
                for (long j : jArr2) {
                    hashSet.add(Long.valueOf(j));
                }
            }
            bhtl.f119557h.execute(new bhti(bhtn, hashSet, jArr));
        }
    }
}
