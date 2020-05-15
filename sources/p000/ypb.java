package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ypb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypb extends yll {

    /* renamed from: c */
    public final float f54317c;

    /* renamed from: d */
    public final float f54318d;

    /* renamed from: e */
    public final yoy f54319e;

    /* renamed from: f */
    private final long f54320f;

    /* renamed from: g */
    private final long f54321g;

    /* renamed from: h */
    private final yfr f54322h;

    public ypb(yoz yoz) {
        super(yoz);
        yoy yoy = yoz.f54314e;
        bmxy.m108581a(yoy);
        this.f54319e = yoy;
        this.f54317c = yoz.f54310a;
        this.f54318d = yoz.f54311b;
        this.f54320f = TimeUnit.MINUTES.toNanos(yoz.f54312c);
        this.f54321g = TimeUnit.MINUTES.toNanos(yoz.f54313d);
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.heart_rate.bpm");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(bzzr.m126369a(this.f53897b.mo30613a("resting_heart_rate"), "merge_heart_rate_bpm"));
        this.f54322h = a.mo30415a();
    }

    /* renamed from: a */
    private static long m44514a(long j) {
        return TimeUnit.HOURS.toNanos(TimeUnit.NANOSECONDS.toHours(j));
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "RestingHeartRateTransformation";
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54322h;
    }

    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        ygx a = yjy.m44264a(yhy, "com.google.heart_rate.bpm", "merge_heart_rate_bpm", list);
        yhx a2 = yhy.m44167a(this.f54322h);
        long j = this.f54320f;
        long j2 = this.f54321g;
        ArrayList arrayList = new ArrayList();
        yfw yfw = (yfw) yhg;
        long a3 = m44514a(yfw.f53737a);
        long j3 = yfw.f53737a;
        if (a3 < j3) {
            a3 = m44514a(j3) + TimeUnit.HOURS.toNanos(1);
        }
        long a4 = m44514a(yfw.f53738b);
        bmxv b = (yhh.m44105a(yhg, a3) && yhh.m44105a(yhg, a4)) ? bmxv.m108566b(yfv.m44005a(a3, a4)) : bmvz.f131120a;
        if (b.mo66813a()) {
            yhg yhg2 = (yhg) b.mo66814b();
            for (long a5 = yhg2.mo30385a(); a5 <= yhg2.mo30387b(); a5 += j2) {
                arrayList.add(yfv.m44005a(a5 - j, a5));
            }
        }
        yfp.m43964a(a2, new ykj(new ypa(this, a2), arrayList, a.mo30473a()));
        return a2.mo30520b();
    }
}
