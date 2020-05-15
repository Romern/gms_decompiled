package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yps extends yll {

    /* renamed from: c */
    private final String f54342c;

    /* renamed from: d */
    private final yfr f54343d;

    public yps(ypr ypr) {
        super(ypr);
        String str = ypr.f54341a;
        bmxy.m108581a(str);
        this.f54342c = str;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.speed");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(bzzr.m126369a(this.f53897b.mo30613a("from_distance"), this.f54342c));
        this.f54343d = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "SpeedFromDistanceTransformation";
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54343d;
    }

    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        String str = this.f54342c;
        ygx a = yjy.m44261a(list, "com.google.distance.delta");
        if (a == null) {
            ypq.m44538a("Desired data source not found", Level.FINE, "%s not found", "com.google.distance.delta");
            a = yjy.m44263a("com.google.distance.delta", str);
        }
        yhx a2 = yhy.m44167a(this.f54343d);
        bnre i = a.mo30473a().listIterator();
        while (i.hasNext()) {
            yhu yhu = (yhu) i.next();
            long a3 = yhu.mo30385a();
            long b = yhu.mo30387b();
            long j = (a3 + b) / 2;
            yfw yfw = (yfw) yhg;
            if (j >= yfw.f53737a && j <= yfw.f53738b) {
                float b2 = yhu.mo30510b(0);
                float nanos = ((float) (b - a3)) / ((float) TimeUnit.SECONDS.toNanos(1));
                float f = b2 / nanos;
                if (nanos > 10.0f) {
                    yht c = a2.mo30521c();
                    yfm.m43953a(c, j, j);
                    c.mo30506a(yhu.mo30511d());
                    c.mo30503a().mo30432a((double) f);
                }
            }
        }
        return a2.mo30520b();
    }
}
