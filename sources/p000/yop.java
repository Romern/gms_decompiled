package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yop extends yll {

    /* renamed from: c */
    private final float f54283c;

    /* renamed from: d */
    private final float f54284d;

    /* renamed from: e */
    private final yfr f54285e;

    /* renamed from: f */
    private final bnic f54286f;

    public yop(yoo yoo) {
        super(yoo);
        this.f54283c = yoo.f54279a;
        this.f54284d = yoo.f54280b;
        this.f54286f = yoo.f54282d;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.heart_minutes");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(this.f53897b.mo30613a(bzzr.m126369a("from_activity", yoo.f54281c)));
        this.f54285e = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "HeartPointFromActivitySegmentsTransformation";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54285e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        Float f;
        yhx a = yhy.m44167a(this.f54285e);
        ygx a2 = yjy.m44261a(list, "com.google.activity.segment");
        if (a2 == null) {
            ypq.m44538a("Desired data source not found", Level.FINE, "com.google.activity.segment", new Object[0]);
            return a.mo30520b();
        }
        bnre i = a2.mo30473a().listIterator();
        while (i.hasNext()) {
            yhu yhu = (yhu) i.next();
            int j = yhu.mo30517j();
            if ((this.f54286f.contains(yhu.mo30511d().mo30422b().mo30409a()) || !ynk.m44409a(j)) && (f = (Float) bzzq.f172146a.get(Integer.valueOf(j))) != null && f.floatValue() >= this.f54283c) {
                float floatValue = f.floatValue();
                yfw yfw = (yfw) yhg;
                long max = Math.max(yhu.mo30385a(), yfw.f53737a);
                long min = Math.min(yhu.mo30387b(), yfw.f53738b);
                long minutes = TimeUnit.NANOSECONDS.toMinutes(max);
                while (true) {
                    long j2 = 1 + minutes;
                    if (TimeUnit.MINUTES.toNanos(j2) > min) {
                        break;
                    }
                    if (TimeUnit.MINUTES.toNanos(minutes) >= max) {
                        yht c = a.mo30521c();
                        TimeUnit timeUnit = TimeUnit.MINUTES;
                        yfm.m43953a(c, timeUnit.toNanos(minutes), timeUnit.toNanos(j2));
                        c.mo30506a(yhu.mo30511d());
                        c.mo30503a().mo30432a(floatValue < this.f54284d ? 1.0d : 2.0d);
                    }
                    minutes = j2;
                }
            }
        }
        return a.mo30520b();
    }
}
