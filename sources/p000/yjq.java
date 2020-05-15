package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjq implements yjx {

    /* renamed from: a */
    private final String f53941a;

    /* renamed from: b */
    private final yjp f53942b;

    public yjq(String str, yjp yjp) {
        this.f53941a = str;
        this.f53942b = yjp;
    }

    /* renamed from: a */
    public static yjx m44239a(String str) {
        return new yjq(str, yjn.f53939a);
    }

    /* renamed from: b */
    public static yjx m44240b(String str) {
        return new yjq(str, yjo.f53940a);
    }

    /* renamed from: a */
    public final ygx mo30574a(ygx ygx, yhg yhg, yhy yhy) {
        yhx a = yjy.m44266a(yhy, ygx.mo30474b());
        bnre i = ygx.mo30473a().listIterator();
        while (i.hasNext()) {
            yhu yhu = (yhu) i.next();
            if (mo30576a(yhg, yhu)) {
                String valueOf = String.valueOf(this.f53941a);
                yfw yfw = (yfw) yhg;
                ypq.m44538a(valueOf.length() == 0 ? new String("Empty trimmed output data point in ") : "Empty trimmed output data point in ".concat(valueOf), Level.WARNING, "Skipping empty trimmed data point [%tT-%tT] for window [%tT-%tT]%nPoint: %s", Long.valueOf(yhf.m44094b(yhu)), Long.valueOf(yhf.m44096c(yhu)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yfw.f53737a)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yfw.f53738b)), yhu);
            } else {
                mo30575a(a.mo30521c(), yhu, yhg);
            }
        }
        return a.mo30520b();
    }

    /* renamed from: a */
    public final void mo30575a(yht yht, yhu yhu, yhg yhg) {
        boolean z;
        long a = yhu.mo30385a();
        long b = yhu.mo30387b();
        long j = b - a;
        yfw yfw = (yfw) yhg;
        long max = Math.max(yfw.f53737a, a);
        long min = Math.min(yfw.f53738b, b);
        long j2 = min - max;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Trimmed data point is empty");
        yfm.m43953a(yht, max, min);
        yht.mo30506a(yhu.mo30511d());
        this.f53942b.mo30573a(((float) j2) / ((float) j), yhu, yht);
    }

    /* renamed from: a */
    public final boolean mo30576a(yhg yhg, yhg yhg2) {
        yfw yfw = (yfw) yhg;
        return Math.min(yfw.f53738b, yhg2.mo30387b()) - Math.max(yfw.f53737a, yhg2.mo30385a()) <= 0;
    }
}
