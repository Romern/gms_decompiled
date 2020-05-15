package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yox implements yoy {

    /* renamed from: a */
    public static final bmxv f54304a = bmvz.f131120a;

    /* renamed from: b */
    public static final long f54305b = TimeUnit.MINUTES.toNanos(10);

    /* renamed from: c */
    public final float f54306c;

    /* renamed from: d */
    public final long f54307d;

    /* renamed from: e */
    public final float f54308e;

    /* renamed from: f */
    public final float f54309f;

    public yox(float f, long j, float f2, float f3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (((double) f) < 0.0d || f > 1.0f) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108589a(z, "Percentile must be in [0.0, 1.0].");
        if (j <= 0 || j >= TimeUnit.DAYS.toMinutes(14)) {
            z2 = false;
        } else {
            z2 = true;
        }
        bmxy.m108593a(z2, "Minimum time in minutes (%s) must be greater than 0 and less than 2 weeks.", j);
        if (f2 <= 60.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        Float valueOf = Float.valueOf(f2);
        bmxy.m108596a(z3, "bpmFilterLowThreshold (%s) is being set too high (>60).", valueOf);
        if (f3 >= 80.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        Float valueOf2 = Float.valueOf(f3);
        bmxy.m108596a(z4, "bpmFilterHighThreshold (%s) is being set too low (<80).", valueOf2);
        bmxy.m108597a(f2 >= f3 ? false : z5, "bpmFilterLowThreshold (%s) must be lower than than bpmFilterHighThreshold (%s)", valueOf, valueOf2);
        this.f54306c = f;
        this.f54307d = TimeUnit.MINUTES.toNanos(j);
        this.f54308e = f2;
        this.f54309f = f3;
    }

    /* renamed from: a */
    public static float m44511a(yhu yhu) {
        return yhu.mo30510b(0);
    }
}
