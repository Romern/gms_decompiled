package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: dqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dqr {

    /* renamed from: a */
    public final egm f13829a = new egm();

    /* renamed from: b */
    public final bnot f13830b = bnge.m109299s();

    /* renamed from: c */
    public long f13831c = Long.MAX_VALUE;

    /* renamed from: a */
    public final void mo9451a(dqq dqq) {
        egm egm = this.f13829a;
        Long valueOf = Long.valueOf(dqq.f13827b);
        Set set = (Set) egm.get(valueOf);
        if (set == null) {
            HashSet hashSet = new HashSet();
            egm.put(valueOf, hashSet);
            hashSet.add(dqq);
        } else {
            set.add(dqq);
        }
        this.f13830b.mo67268a(dqq.f13826a, dqq);
    }

    /* renamed from: a */
    public final boolean mo9452a() {
        return this.f13829a.isEmpty();
    }
}
