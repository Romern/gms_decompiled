package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: adol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adol implements bmxj {

    /* renamed from: a */
    final /* synthetic */ adqq f62281a;

    /* renamed from: b */
    final /* synthetic */ adqr f62282b;

    public adol(adqq adqq, adqr adqr) {
        this.f62281a = adqq;
        this.f62282b = adqr;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List<adon> list = (List) obj;
        if (list == null) {
            return false;
        }
        Boolean bool = true;
        HashSet<adqq> hashSet = new HashSet();
        for (adon adon : list) {
            bool = Boolean.valueOf(bool.booleanValue() & adon.f62285b.booleanValue());
            if (adon.f62285b.booleanValue()) {
                hashSet.add(adon.f62284a);
                if (adon.f62284a.equals(this.f62281a) && this.f62281a.mo33713a()) {
                    this.f62282b.mo33719a(this.f62281a.f62515b.longValue());
                }
            }
        }
        if (!bool.booleanValue()) {
            adqr adqr = this.f62282b;
            synchronized (adqr.f62517b) {
                Set<adqq> a = adql.m50999a(adqr.mo33718a("batch_indexing_windows"));
                HashSet hashSet2 = new HashSet();
                for (adqq adqq : a) {
                    hashSet2.add(adqq.toString());
                }
                HashSet hashSet3 = new HashSet();
                for (adqq adqq2 : hashSet) {
                    hashSet3.add(adqq2.toString());
                }
                hashSet2.removeAll(hashSet3);
                adqr.f62516a.edit().putStringSet("batch_indexing_windows", hashSet2).commit();
            }
        } else {
            this.f62282b.mo33722c();
            if (this.f62281a.mo33713a()) {
                this.f62282b.mo33719a(this.f62281a.f62515b.longValue());
            }
        }
        adnt.m50869a("Bulk mediastore status = %s", bool);
        return bool;
    }
}
