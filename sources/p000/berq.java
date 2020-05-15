package p000;

import java.util.Locale;

/* renamed from: berq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class berq {

    /* renamed from: a */
    long f112229a = -1;

    /* renamed from: b */
    protected final berb f112230b;

    public berq(berb berb) {
        this.f112230b = berb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r9 >= (r11 + Long.MAX_VALUE)) goto L_0x0048;
     */
    /* renamed from: a */
    protected static final boolean m95597a(long j, long j2, long j3, long j4) {
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j4)};
        long j5 = Long.MAX_VALUE;
        if (!(j == Long.MAX_VALUE || j2 == Long.MAX_VALUE)) {
            if (j2 >= 0) {
                if (j <= j2 - Long.MIN_VALUE) {
                    j5 = Long.MIN_VALUE;
                    long abs = Math.abs(j5);
                    return abs > j3 / 2 && abs <= j4 / 2;
                }
            }
            j5 = j - j2;
            long abs2 = Math.abs(j5);
            if (abs2 > j3 / 2) {
            }
        }
    }

    /* renamed from: b */
    public static final long m95598b(long j) {
        return (j / 1000000) + 1500;
    }

    /* renamed from: a */
    public abstract berp mo61059a(long j);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo61062c() {
        berb berb = this.f112230b;
        long j = berb.f112166ap;
        long j2 = Long.MAX_VALUE;
        if (berb.mo60995k() != Long.MAX_VALUE) {
            berb berb2 = this.f112230b;
            if (!berb2.f112191r.f112367a) {
                j2 = Math.max(0L, berb2.mo60995k() - m95598b(berb2.f112123K.f112059a));
            } else {
                j2 = berb2.mo60995k();
            }
        }
        return bhct.m100648a(j, j2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: d */
    public final long mo61063d() {
        long j;
        berb berb = this.f112230b;
        long j2 = berb.f112133U;
        if (j2 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (berb.f112191r.f112367a) {
            StringBuilder sb = new StringBuilder(82);
            sb.append("getMinPeriod: accelBatchingMode is on. Return minPeriodMillis=");
            sb.append(j2);
            sb.toString();
            return this.f112230b.f112133U;
        } else if (berb.f112114B.mo62860d()) {
            long j3 = this.f112230b.f112133U;
            StringBuilder sb2 = new StringBuilder(76);
            sb2.append("getMinPeriod: hardware AR is on. Return minPeriodMillis=");
            sb2.append(j3);
            sb2.toString();
            return this.f112230b.f112133U;
        } else {
            berb berb2 = this.f112230b;
            if (berb2.f112151aa) {
                j = berb2.f112127O.f112059a;
            } else {
                j = berb2.f112123K.f112059a;
            }
            long b = m95598b(j);
            long j4 = this.f112230b.f112133U;
            StringBuilder sb3 = new StringBuilder(118);
            sb3.append("getMinPeriod: accelBatchingMode is off. minPeriodMillis=");
            sb3.append(j4);
            sb3.append(", detectionTimeMillis=");
            sb3.append(b);
            sb3.toString();
            return Math.max(0L, this.f112230b.f112133U - b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo61061b() {
        berb berb = this.f112230b;
        long j = berb.f112162al;
        long j2 = berb.f112134V;
        long j3 = Long.MAX_VALUE;
        if (j2 != Long.MAX_VALUE) {
            j3 = Math.max(0L, j2 - m95598b(berb.f112128P.f112059a));
        }
        return bhct.m100648a(j, j3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo61058a() {
        long a = bhct.m100648a(this.f112230b.f112161ak, mo61063d());
        return this.f112230b.mo60987c() ? Math.min(a, bhct.m100648a(this.f112230b.f112165ao, 60000)) : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61060a(long j, long j2) {
        return j < j2 && !m95597a(j, j2, this.f112230b.f112134V, Long.MAX_VALUE) && !this.f112230b.f112176az.mo62933b();
    }
}
