package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: ynq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ynq implements yka {

    /* renamed from: a */
    public static final bnhe f54217a;

    /* renamed from: c */
    private static final bnhe f54218c;

    /* renamed from: b */
    protected final yju f54219b = new yju(yju.f53948a);

    /* renamed from: d */
    private final long f54220d;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(7, Float.valueOf(4.6f));
        h.mo67695b(8, Float.valueOf(12.4f));
        h.mo67695b(1, Float.valueOf(37.16f));
        h.mo67695b(0, Float.valueOf(176.221f));
        f54217a = h.mo67618b();
        bnha h2 = bnhe.m109414h();
        h2.mo67695b(7, Float.valueOf(0.25f));
        h2.mo67695b(8, Float.valueOf(0.75f));
        f54218c = h2.mo67618b();
    }

    public ynq(long j) {
        this.f54220d = j;
    }

    /* renamed from: a */
    protected static float m44439a(yhu yhu) {
        return yhu.mo30510b(0);
    }

    /* renamed from: a */
    protected static final float m44440a(yhu yhu, yhu yhu2) {
        boolean z;
        int j = yhu.mo30517j();
        if (yhi.m44106a(j) || yhi.f53823a.get(j) || yhi.f53824b.get(j)) {
            return 0.0f;
        }
        long min = Math.min(yhu.mo30387b(), yhu2.mo30387b()) - Math.max(yhu.mo30385a(), yhu2.mo30385a());
        if (min <= yhf.m44092a(yhu) + yhf.m44092a(yhu2)) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108606b(z, "Points [%s] and [%s] do not overlap.", yhu, yhu2);
        float f = (float) min;
        bnhe bnhe = f54217a;
        Integer valueOf = Integer.valueOf(j);
        if (bnhe.containsKey(valueOf)) {
            return (((Float) f54217a.get(valueOf)).floatValue() * f) / ((float) TimeUnit.SECONDS.toNanos(1));
        }
        return Float.MAX_VALUE;
    }

    /* renamed from: a */
    protected static void m44441a(yhu yhu, float f, float f2) {
        ypq.m44538a("Reported distance exceeds maximum possible distance", Level.FINE, "reported distance: [%fm] maximum distance: [%fm] distance point: %s", Float.valueOf(f2), Float.valueOf(f), yhu);
    }

    /* renamed from: a */
    protected static void m44442a(yhx yhx, Iterator it, yhg yhg) {
        while (it.hasNext()) {
            m44443a(yhx, (yhu) it.next(), yhg);
        }
    }

    /* renamed from: a */
    protected static void m44443a(yhx yhx, yhu yhu, yhg yhg) {
        if (!yfp.m43967a(yhu, yhg)) {
            yht a = yhx.mo30521c().mo30504a(yhu);
            a.mo30506a(yhu.mo30511d());
            a.mo30503a().mo30432a((double) m44439a(yhu));
        }
    }

    /* renamed from: a */
    protected static final boolean m44444a(List list) {
        yhu yhu = (yhu) bnjd.m109591c(list, (Object) null);
        return yhu == null || yhu.mo30517j() == 3;
    }

    /* renamed from: a */
    public ygx mo30582a(ygx ygx, List list, yhg yhg, yhx yhx, yhy yhy) {
        yhg yhg2 = yhg;
        yhx yhx2 = yhx;
        ygx a = yjy.m44261a(list, "com.google.activity.segment");
        bmxy.m108581a(a);
        bngx a2 = a.mo30473a();
        Iterable a3 = this.f54219b.mo30578a(ygx.mo30473a(), a2, yjy.m44266a(yhy, ygx.mo30474b()));
        bnjq h = bnjr.m109626h(a3.iterator());
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            yhu yhu = (yhu) a2.get(i);
            ArrayList arrayList = new ArrayList();
            while (h.hasNext() && !yfp.m43976d((yhg) h.mo67862a(), yhu)) {
                yhu yhu2 = (yhu) h.next();
                if (yfp.m43975c(yhu2, yhu)) {
                    m44443a(yhx2, yhu2, yhg2);
                } else {
                    bmxy.m108598a(yfp.m43977e(yhu2, yhu), "%s not contained in %s, activity segments: %s, distances: %s", yhu2, yhu, a2, a3);
                    float a4 = m44439a(yhu2);
                    yhu yhu3 = yhu2;
                    float a5 = m44440a(yhu, yhu3);
                    if (a5 <= 0.0f || a4 > a5) {
                        m44441a(yhu3, a5, a4);
                    } else {
                        arrayList.add(yhu3);
                    }
                }
            }
            if (mo30635a(yhu, arrayList)) {
                m44442a(yhx2, arrayList.iterator(), yhg2);
            }
        }
        if (!m44444a(a2)) {
            m44442a(yhx2, h, yhg2);
        }
        return yhx.mo30520b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30635a(yhu yhu, List list) {
        Float f = (Float) f54218c.get(Integer.valueOf(yhu.mo30517j()));
        if (f == null) {
            return true;
        }
        long a = yhh.m44102a(yhu, TimeUnit.SECONDS);
        if (a == 0) {
            return false;
        }
        if (a <= this.f54220d) {
            float a2 = yfp.m43954a(list) / ((float) a);
            if (a2 < f.floatValue()) {
                float floatValue = f.floatValue();
                ypq.m44538a("Recorded speed is less than minimum speed", Level.FINE, "recorded speed: [%fm/s] minimum speed: [%fm/s] activity: %s", Float.valueOf(a2), Float.valueOf(floatValue), yhu);
                return false;
            }
        }
        return true;
    }
}
