package p000;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhh {
    /* renamed from: a */
    public static long m44102a(yhg yhg, TimeUnit timeUnit) {
        return yhf.m44095b(yhg, timeUnit) - yhf.m44093a(yhg, timeUnit);
    }

    /* renamed from: a */
    public static boolean m44105a(yhg yhg, long j) {
        yfw yfw = (yfw) yhg;
        return yfw.f53737a <= j && j <= yfw.f53738b;
    }

    /* renamed from: a */
    public static bngx m44103a(Set set) {
        bngs b = bngx.m109371b(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bnoa bnoa = (bnoa) it.next();
            b.mo67668c(yfv.m44005a(((Long) bnoa.mo68172b()).longValue(), ((Long) bnoa.mo68176e()).longValue()));
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public static bnoa m44104a(yhg yhg) {
        return bnoa.m109932b(Long.valueOf(yhg.mo30385a()), Long.valueOf(yhg.mo30387b()));
    }
}
