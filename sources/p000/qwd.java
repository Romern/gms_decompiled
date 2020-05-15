package p000;

import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.chromesync.sync.SyncIntentOperation;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/* renamed from: qwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qwd {

    /* renamed from: a */
    public final qta f42304a = ((qta) qta.f42084i.mo13145b());

    /* renamed from: b */
    private final Random f42305b = new SecureRandom();

    /* renamed from: c */
    private final skc f42306c = new skc(rpr.m34216b());

    /* renamed from: d */
    private final PowerManager f42307d = ((PowerManager) rpr.m34216b().getSystemService("power"));

    /* renamed from: a */
    private final long m32989a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return (long) (((this.f42305b.nextDouble() * 0.4d) + 0.8d) * d);
    }

    /* renamed from: a */
    public final long mo24310a(acyr acyr) {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList((Collection) this.f42304a.mo24253a(acyr, qta.f42083h));
        arrayList.add(Long.valueOf(elapsedRealtime));
        while (true) {
            i = 0;
            if (arrayList.size() <= 10) {
                break;
            }
            arrayList.remove(0);
        }
        this.f42304a.mo24254a(acyr, qta.f42083h, bngx.m109368a((Collection) arrayList));
        String str = this.f42307d.isScreenOn() ? (String) qqv.f41975l.mo58455c() : (String) qqv.f41976m.mo58455c();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : bmyx.m108640a(',').mo66917a().mo66918a((CharSequence) str)) {
            arrayList2.add(Long.valueOf(str2));
        }
        while (i < arrayList2.size() && i < arrayList.size()) {
            elapsedRealtime = Math.max(elapsedRealtime, ((Long) arrayList.get((arrayList.size() - 1) - i)).longValue() + m32989a(((Long) arrayList2.get(i)).longValue()));
            i++;
        }
        return elapsedRealtime;
    }

    /* renamed from: a */
    public final long mo24311a(acyr acyr, long j) {
        long longValue = ((Long) this.f42304a.mo24253a(acyr, qta.f42081f)).longValue();
        if (j <= longValue) {
            return longValue;
        }
        this.f42304a.mo24254a(acyr, qta.f42081f, Long.valueOf(j));
        return j;
    }

    /* renamed from: a */
    public final void mo24312a(long j, qwc qwc) {
        this.f42306c.mo25675a("ChromeSync-SyncScheduler", 3, j, SyncIntentOperation.m22434a(qwc), "com.google.android.gms");
    }

    /* renamed from: a */
    public final void mo24313a(qwc qwc, int i) {
        long j;
        acyr acyr = qwc.f42300a;
        long a = mo24310a(acyr);
        if ((i >> 8) == 1) {
            long longValue = ((Long) this.f42304a.mo24253a(acyr, qta.f42082g)).longValue();
            if (longValue == -1) {
                j = ((Long) qqv.f41977n.mo58455c()).longValue();
            } else {
                j = Math.min(longValue + longValue, ((Long) qqv.f41978o.mo58455c()).longValue());
            }
            this.f42304a.mo24254a(acyr, qta.f42082g, Long.valueOf(j));
            a = Math.max(a, SystemClock.elapsedRealtime() + m32989a(j));
        }
        if (i == 258) {
            a = Math.max(a, SystemClock.elapsedRealtime() + m32989a(((Long) qqv.f41979p.mo58455c()).longValue()));
        }
        mo24312a(mo24311a(acyr, a), qwc);
    }
}
