package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aqbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbw {

    /* renamed from: a */
    public Map f85616a = new HashMap();

    /* renamed from: b */
    public final ReadWriteLock f85617b = new ReentrantReadWriteLock();

    static {
        aqbw.class.getSimpleName();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqbw.a(aqbv, boolean):aqbv
     arg types: [aqbv, int]
     candidates:
      aqbw.a(long, long):boolean
      aqbw.a(aqbv, boolean):aqbv */
    /* renamed from: a */
    static aqbv m71327a(aqbv aqbv) {
        return m71328a(aqbv, true);
    }

    /* renamed from: a */
    public static aqbv m71328a(aqbv aqbv, boolean z) {
        if (aqbv.f85614a.f85696b.size() != 0) {
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = aqbv.f85614a.f85696b;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                aqdc aqdc = (aqdc) bxwc.get(i);
                long j = aqbv.f85615b;
                aqcg aqcg = aqdc.f85753e;
                if (aqcg == null) {
                    aqcg = aqcg.f85649b;
                }
                if (!m71329a(j, aqcg.f85651a)) {
                    arrayList.add(aqdc);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (!z) {
                aqbv aqbv2 = new aqbv();
                aqcq aqcq = (aqcq) aqcr.f85693e.mo74144da();
                aqcg aqcg2 = aqbv.f85614a.f85697c;
                if (aqcg2 == null) {
                    aqcg2 = aqcg.f85649b;
                }
                if (aqcq.f164950c) {
                    aqcq.mo74035c();
                    aqcq.f164950c = false;
                }
                aqcr aqcr = (aqcr) aqcq.f164949b;
                aqcg2.getClass();
                aqcr.f85697c = aqcg2;
                aqcr.f85695a |= 1;
                aqcg aqcg3 = aqbv.f85614a.f85698d;
                if (aqcg3 == null) {
                    aqcg3 = aqcg.f85649b;
                }
                if (aqcq.f164950c) {
                    aqcq.mo74035c();
                    aqcq.f164950c = false;
                }
                aqcr aqcr2 = (aqcr) aqcq.f164949b;
                aqcg3.getClass();
                aqcr2.f85698d = aqcg3;
                aqcr2.f85695a |= 2;
                aqbv2.f85615b = aqbv.f85615b;
                aqcq.mo47755a(arrayList);
                aqbv2.f85614a = (aqcr) aqcq.mo74062i();
                return aqbv2;
            }
            if (arrayList.size() < aqbv.f85614a.f85696b.size()) {
                aqcr aqcr3 = aqbv.f85614a;
                bxvd bxvd = (bxvd) aqcr3.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) aqcr3);
                aqcq aqcq2 = (aqcq) bxvd;
                if (aqcq2.f164950c) {
                    aqcq2.mo74035c();
                    aqcq2.f164950c = false;
                }
                aqcr aqcr4 = aqcr.f85693e;
                ((aqcr) aqcq2.f164949b).f85696b = GeneratedMessageLite.m124030de();
                aqcq2.mo47755a(arrayList);
                aqbv.f85614a = (aqcr) aqcq2.mo74062i();
            }
            return aqbv;
        }
        aqcr aqcr5 = aqbv.f85614a;
        if ((aqcr5.f85695a & 2) != 0) {
            long j2 = aqbv.f85615b;
            aqcg aqcg4 = aqcr5.f85698d;
            if (aqcg4 == null) {
                aqcg4 = aqcg.f85649b;
            }
            if (!m71329a(j2, aqcg4.f85651a)) {
                return aqbv;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m71329a(long j, long j2) {
        return j + (j2 * 1000) <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo47749a(Map map, apgr apgr, aqbv aqbv) {
        aqbu aqbu;
        apgr b = apgr.mo47194b();
        if (map.containsKey(b)) {
            aqbu = (aqbu) map.get(b);
            if (aqbu.f85612a == null) {
                aqbu.f85612a = new HashMap();
            }
            if (aqbu.f85613b == null) {
                aqbu.f85613b = new HashMap();
            }
        } else {
            aqbu aqbu2 = new aqbu();
            aqbu2.f85612a = new HashMap();
            aqbu2.f85613b = new HashMap();
            map.put(b, aqbu2);
            aqbu = aqbu2;
        }
        if (aqde.m71378a(aqbv.f85614a)) {
            aqbu.f85613b.put(apgr, aqbv);
        } else {
            aqbu.f85612a.put(apgr, aqbv);
        }
    }
}
