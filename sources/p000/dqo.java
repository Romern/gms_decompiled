package p000;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: dqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dqo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dqs f13821a;

    public dqo(dqs dqs) {
        this.f13821a = dqs;
    }

    public final void run() {
        HashSet<dqm> hashSet;
        drv k = dwq.m9667k();
        long b = dwq.m9665i().mo20506b();
        dqr dqr = this.f13821a.f13832a;
        NavigableMap headMap = dqr.f13829a.headMap(Long.valueOf(b), true);
        if (!headMap.isEmpty()) {
            hashSet = new HashSet();
            for (Set<dqq> set : headMap.values()) {
                for (dqq dqq : set) {
                    hashSet.add(dqq.f13826a);
                }
            }
            for (Set<dqq> set2 : headMap.values()) {
                for (dqq dqq2 : set2) {
                    dqr.f13830b.mo67310c(dqq2.f13826a, dqq2);
                }
            }
            headMap.clear();
            dqr.f13831c = Long.MAX_VALUE;
            if (!dqr.mo9452a()) {
                for (Set<dqq> set3 : dqr.f13829a.values()) {
                    for (dqq dqq3 : set3) {
                        dqr.f13831c = Math.min(dqr.f13831c, dqq3.f13828c);
                    }
                }
            }
        } else {
            hashSet = null;
        }
        if (hashSet != null) {
            for (dqm dqm : hashSet) {
                k.mo9435a(new dqn(dqm), dqy.m9123a("TaskConsolidator#ExecuteOperation#taskExecute"));
            }
        }
        if (!this.f13821a.f13832a.mo9452a()) {
            this.f13821a.mo9453a();
        }
    }
}
