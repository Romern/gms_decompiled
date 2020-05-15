package p000;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dse extends drx {

    /* renamed from: c */
    public final Set f13927c = new HashSet();

    public dse() {
        super("FenceSchedulerOperation");
    }

    /* renamed from: b */
    private final void m9215b() {
        dtl dtl;
        long a = dwq.m9665i().mo20505a();
        dtl E = dwq.m9648E();
        SparseArray b = E.mo9562b();
        int i = 0;
        while (i < b.size()) {
            int keyAt = b.keyAt(i);
            dun dun = (dun) b.valueAt(i);
            Set a2 = E.mo9553a(keyAt);
            if (keyAt != -1) {
                if (a2 == null) {
                    dtl = E;
                } else if (a2.size() != 0) {
                    long j = 1 + a;
                    boolean a3 = dun.mo9636a(j);
                    Set set = this.f13927c;
                    dtl = E;
                    Integer valueOf = Integer.valueOf(keyAt);
                    boolean contains = set.contains(valueOf);
                    if (a3) {
                        m9212a(keyAt, a2);
                    } else if (contains) {
                        m9216b(keyAt, a2);
                    }
                    duj b2 = dun.mo9637b(j);
                    new Object[1][0] = b2;
                    if (b2.mo9619a() && contains) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dse", "b", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68409a("[FenceSchedulerOperation] Received none epoch time but already running for context=%s", keyAt);
                        m9216b(keyAt, a2);
                    } else {
                        long j2 = b2.f14045c;
                        if (j2 == -2 && !contains) {
                            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                            bnsl2.mo68432a("dse", "b", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68409a("[FenceSchedulerOperation] Received any epoch time but production not running for context=%s", keyAt);
                            m9212a(keyAt, a2);
                        } else if (j2 <= a) {
                            Object[] objArr = {valueOf, Long.valueOf(a), Boolean.valueOf(contains)};
                        } else {
                            mo9514a(j2 - a, dqy.m9123a("FenceScheduler"));
                        }
                    }
                } else {
                    dtl = E;
                }
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                bnsl3.mo68432a("dse", "b", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("[FenceSchedulerOperation] No interest records found for context= [%s]", keyAt);
            } else {
                dtl = E;
                m9213a(a, dun);
            }
            i++;
            E = dtl;
        }
    }

    /* renamed from: a */
    private final void m9212a(int i, Set set) {
        dwq.m9674r().mo9726a(set);
        this.f13927c.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    private final void m9213a(long j, dun dun) {
        dwq.m9667k().mo9435a(new dtg(dwq.m9648E()), dqy.m9123a("EvaluateFences"));
        if (dun != null) {
            duj b = dun.mo9637b(1 + j);
            Object[] objArr = {b, Long.valueOf(j)};
            long j2 = b.f14045c;
            if (j2 > j) {
                mo9514a(j2 - j, dqy.m9123a("FenceScheduler"));
            }
        }
    }

    /* renamed from: a */
    public static final void m9214a(Set set) {
        dwq.m9674r().mo9733b(set);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        Object obj;
        long j = 1;
        int i = -1;
        if (dwq.m9648E().f13993d) {
            long a = dwq.m9665i().mo20505a();
            dtl E = dwq.m9648E();
            dun dun = (dun) E.mo9562b().get(-1);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(E.mo9563c().size());
            if (dun == null) {
                obj = "null";
            } else {
                obj = dun;
            }
            objArr[1] = obj;
            m9213a(a, dun);
            for (dus dus : E.mo9563c()) {
                SparseArray sparseArray = new SparseArray();
                dtf.m9280a(dus.mo9674t(), sparseArray);
                dun dun2 = (dun) sparseArray.get(-1);
                if (dun2 != null && !dun2.mo9636a(a + 1)) {
                    E.mo9557a(dus);
                }
            }
            return;
        }
        long a2 = dwq.m9665i().mo20505a();
        dtl E2 = dwq.m9648E();
        SparseArray b = E2.mo9562b();
        int i2 = 0;
        while (i2 < b.size()) {
            int keyAt = b.keyAt(i2);
            dun dun3 = (dun) b.valueAt(i2);
            Set a3 = E2.mo9553a(keyAt);
            if (keyAt != i) {
                if (a3 != null) {
                    if (a3.size() != 0) {
                        long j2 = a2 + j;
                        boolean a4 = dun3.mo9636a(j2);
                        Set set = this.f13927c;
                        Integer valueOf = Integer.valueOf(keyAt);
                        boolean contains = set.contains(valueOf);
                        if (a4) {
                            m9212a(keyAt, a3);
                        } else if (contains) {
                            m9216b(keyAt, a3);
                        }
                        duj b2 = dun3.mo9637b(j2);
                        new Object[1][0] = b2;
                        if (b2.mo9619a() && contains) {
                            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                            bnsl.mo68432a("dse", "b", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68409a("[FenceSchedulerOperation] Received none epoch time but already running for context=%s", keyAt);
                            m9216b(keyAt, a3);
                        } else {
                            long j3 = b2.f14045c;
                            if (j3 == -2 && !contains) {
                                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                                bnsl2.mo68432a("dse", "b", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68409a("[FenceSchedulerOperation] Received any epoch time but production not running for context=%s", keyAt);
                                m9212a(keyAt, a3);
                            } else if (j3 <= a2) {
                                Object[] objArr2 = {valueOf, Long.valueOf(a2), Boolean.valueOf(contains)};
                            } else {
                                mo9514a(j3 - a2, dqy.m9123a("FenceScheduler"));
                            }
                        }
                    }
                }
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                bnsl3.mo68432a("dse", "b", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("[FenceSchedulerOperation] No interest records found for context= [%s]", keyAt);
            } else {
                m9213a(a2, dun3);
            }
            i2++;
            j = 1;
            i = -1;
        }
    }

    /* renamed from: b */
    private final void m9216b(int i, Set set) {
        m9214a(set);
        this.f13927c.remove(Integer.valueOf(i));
    }
}
