package p000;

import android.net.TrafficStats;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.netrec.util.LogNetrecEventOperation;

/* renamed from: aknf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknf {

    /* renamed from: a */
    private static volatile qws f72299a;

    /* renamed from: b */
    private static volatile qxq f72300b;

    /* renamed from: c */
    private static final Object f72301c = new Object();

    private aknf() {
    }

    /* renamed from: a */
    private static long m60071a(long j) {
        return j - (j % 10);
    }

    /* renamed from: b */
    private static qws m60077b() {
        if (f72299a == null) {
            synchronized (aknf.class) {
                if (f72299a == null) {
                    f72299a = new qws(rpr.m34216b(), "NETREC", null);
                }
            }
        }
        return f72299a;
    }

    /* renamed from: a */
    public static boqx m60072a(int i) {
        long a = m60071a(TrafficStats.getMobileRxBytes());
        long a2 = m60071a(TrafficStats.getMobileTxBytes());
        long a3 = m60071a(TrafficStats.getTotalRxBytes());
        bxvd da = boqx.f134343i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqx boqx = (boqx) da.f164949b;
        boqx.f134346b = i - 1;
        boqx.f134345a |= 1;
        bxvd da2 = boqy.f134353e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boqy boqy = (boqy) da2.f164949b;
        int i2 = boqy.f134355a | 8;
        boqy.f134355a = i2;
        boqy.f134358d = a;
        int i3 = i2 | 4;
        boqy.f134355a = i3;
        boqy.f134357c = a2;
        boqy.f134355a = i3 | 2;
        boqy.f134356b = a3 - a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqx boqx2 = (boqx) da.f164949b;
        boqy boqy2 = (boqy) da2.mo74062i();
        boqy2.getClass();
        boqx2.f134347c = boqy2;
        boqx2.f134345a |= 2;
        return (boqx) da.mo74062i();
    }

    /* renamed from: b */
    public static qxo m60078b(String str) {
        return m60073a().mo24389f(str).mo24372a();
    }

    /* renamed from: b */
    public static void m60079b(int i) {
        bxvd da = boqx.f134343i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqx boqx = (boqx) da.f164949b;
        boqx.f134346b = i - 1;
        boqx.f134345a |= 1;
        m60074a(da);
    }

    /* renamed from: a */
    public static qxq m60073a() {
        if (f72300b == null) {
            synchronized (aknf.class) {
                if (f72300b == null) {
                    f72300b = new qxq(m60077b(), "NETREC_COUNTERS", (int) cfpd.f185332a.mo6606a().mo82459x());
                    f72300b.mo24374a();
                }
            }
        }
        return f72300b;
    }

    /* renamed from: a */
    public static void m60074a(bxvd bxvd) {
        qwo a;
        if (spn.m35873c()) {
            qws b = m60077b();
            bxvd da = boqw.f134338d.mo74144da();
            synchronized (f72301c) {
                long longValue = ((Long) akka.f72134i.mo10351a()).longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqw boqw = (boqw) da.f164949b;
                boqw.f134340a |= 1;
                boqw.f134341b = longValue;
                int intValue = ((Integer) akka.f72135j.mo10351a()).intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boqw boqw2 = (boqw) da.f164949b;
                boqw2.f134340a |= 2;
                boqw2.f134342c = intValue;
                akka.f72135j.mo10352a(Integer.valueOf(intValue + 1));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqx boqx = (boqx) bxvd.f164949b;
                boqw boqw3 = (boqw) da.mo74062i();
                boqx boqx2 = boqx.f134343i;
                boqw3.getClass();
                boqx.f134349e = boqw3;
                boqx.f134345a |= 16;
                a = b.mo24333a(bxvd.mo74062i());
            }
            new Object[1][0] = bxvd.mo74062i();
            int i = eoa.f15378a;
            a.mo24327b();
            akka.f72136k.mo10352a(Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        int i2 = eoa.f15378a;
        rpr b2 = rpr.m34216b();
        b2.startService(IntentOperation.getStartIntent(b2, LogNetrecEventOperation.class, "com.google.android.gms.netrec.util.LOG_NETREC_EVENT").putExtra("netrecEvent", ((boqx) bxvd.mo74062i()).serializeToBytes()));
    }

    /* renamed from: a */
    public static void m60075a(String str) {
        new Object[1][0] = str;
        int i = eoa.f15378a;
        m60073a().mo24383c(str).mo24359a();
    }

    /* renamed from: a */
    public static void m60076a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        int i2 = eoa.f15378a;
        m60073a().mo24385d(str).mo24367a(i);
    }
}
