package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bunj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunj {

    /* renamed from: d */
    public static final long f154347d = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: p */
    private static final Map f154348p;

    /* renamed from: a */
    public float f154349a = Float.NaN;

    /* renamed from: b */
    public float f154350b = Float.NaN;

    /* renamed from: c */
    public float f154351c = Float.NaN;

    /* renamed from: e */
    public final bunt f154352e = new bunt();

    /* renamed from: f */
    public final bunt f154353f = new bunt();

    /* renamed from: g */
    public final bunt f154354g = new bunt();

    /* renamed from: h */
    public float f154355h = 45.0f;

    /* renamed from: i */
    public long f154356i = Long.MIN_VALUE;

    /* renamed from: j */
    public long f154357j = Long.MIN_VALUE;

    /* renamed from: k */
    public long f154358k = Long.MIN_VALUE;

    /* renamed from: l */
    public long f154359l = Long.MIN_VALUE;

    /* renamed from: m */
    public float f154360m = Float.NaN;

    /* renamed from: n */
    public float f154361n = Float.NaN;

    /* renamed from: o */
    public long f154362o = Long.MIN_VALUE;

    /* renamed from: q */
    private final Map f154363q = f154348p;

    /* renamed from: r */
    private final Map f154364r = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f154348p = hashMap;
        hashMap.put(0, Float.valueOf(0.074f));
        f154348p.put(1, Float.valueOf(2.0075f));
        f154348p.put(2, Float.valueOf(0.01f));
        f154348p.put(3, Float.valueOf(-23.32f));
        f154348p.put(4, Float.valueOf(0.24f));
        f154348p.put(5, Float.valueOf(0.17f));
        f154348p.put(6, Float.valueOf(44.13f));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public final float mo72897a(long j) {
        Map map;
        float f;
        float f2;
        double d;
        int i;
        int i2;
        if (this.f154352e.f154408b != 10 || this.f154353f.f154408b != 10 || this.f154354g.f154408b != 10 || Float.isNaN(this.f154349a)) {
            return -1.0f;
        }
        this.f154364r.clear();
        if (!Float.isNaN(this.f154349a) && this.f154352e.f154408b == 10 && this.f154353f.f154408b == 10 && this.f154354g.f154408b == 10) {
            float f3 = this.f154355h - this.f154349a;
            if (f3 > 0.0f) {
                f3 += f3;
            }
            float abs = Math.abs(f3);
            this.f154364r.put(0, Float.valueOf(abs));
            bunt bunt = this.f154354g;
            int i3 = bunt.f154408b;
            double d2 = 0.0d;
            if (i3 == 0) {
                f = 0.0f;
            } else {
                if (i3 != 0) {
                    double d3 = 0.0d;
                    int i4 = 0;
                    while (true) {
                        i2 = bunt.f154408b;
                        if (i4 >= i2) {
                            break;
                        }
                        double d4 = (double) bunt.f154407a[i4];
                        Double.isNaN(d4);
                        d3 += d4;
                        i4++;
                    }
                    double d5 = (double) i2;
                    Double.isNaN(d5);
                    d = d3 / d5;
                } else {
                    d = 0.0d;
                }
                double d6 = 0.0d;
                int i5 = 0;
                while (true) {
                    i = bunt.f154408b;
                    if (i5 >= i) {
                        break;
                    }
                    double d7 = (double) bunt.f154407a[i5];
                    Double.isNaN(d7);
                    double d8 = d7 - d;
                    d6 += d8 * d8;
                    i5++;
                }
                double d9 = (double) i;
                Double.isNaN(d9);
                f = (float) Math.sqrt(d6 / d9);
            }
            this.f154364r.put(1, Float.valueOf(f));
            this.f154364r.put(2, Float.valueOf(abs * f));
            bunt bunt2 = this.f154352e;
            bunt bunt3 = this.f154353f;
            int i6 = bunt2.f154408b;
            int i7 = bunt3.f154408b;
            float f4 = Float.NaN;
            if (i6 == i7 && i6 >= 2) {
                if (i6 == i7) {
                    int i8 = 0;
                    while (true) {
                        if (i8 < bunt2.f154408b) {
                            if (bunt2.mo72913a(i8) != bunt3.mo72913a(i8)) {
                                break;
                            }
                            i8++;
                        } else {
                            f4 = 1.0f;
                            break;
                        }
                    }
                }
                int i9 = bunt2.f154408b;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                for (int i10 = 0; i10 < i9; i10++) {
                    f6 += bunt2.mo72913a(i10);
                    f9 += bunt2.mo72913a(i10) * bunt2.mo72913a(i10);
                    f7 += bunt3.mo72913a(i10);
                    f8 += bunt3.mo72913a(i10) * bunt3.mo72913a(i10);
                    f5 += bunt2.mo72913a(i10) * bunt3.mo72913a(i10);
                }
                float f10 = (float) i9;
                float f11 = (f5 * f10) - (f6 * f7);
                float f12 = (f8 * f10) - (f7 * f7);
                float f13 = (f10 * f9) - (f6 * f6);
                f4 = (f13 == 0.0f || f12 == 0.0f) ? 0.0f : f11 / ((float) Math.sqrt((double) (f13 * f12)));
            }
            bunt bunt4 = this.f154352e;
            bunt bunt5 = this.f154353f;
            if (bunt4.f154408b == bunt5.f154408b) {
                for (int i11 = 0; i11 < bunt4.f154408b; i11++) {
                    d2 += Math.pow((double) bunp.m120073a(bunt4.mo72913a(i11) - bunt5.mo72913a(i11)), 2.0d);
                }
                f2 = (float) Math.sqrt(d2);
            } else {
                f2 = 0.0f;
            }
            this.f154364r.put(3, Float.valueOf(f4));
            this.f154364r.put(4, Float.valueOf(f2));
            this.f154364r.put(5, Float.valueOf((1.0f - f4) * f2));
            this.f154364r.put(6, Float.valueOf(1.0f));
            map = this.f154364r;
        } else {
            map = this.f154364r;
        }
        long j2 = this.f154362o;
        if (j2 != Long.MIN_VALUE && j - j2 < bunm.f154381a) {
            Float f14 = (Float) map.get(1);
            Float f15 = (Float) map.get(0);
            if (f15 != null && f15.floatValue() < 10.0f && f14 != null && f14.floatValue() < 4.0f) {
                return 25.0f;
            }
        }
        float f16 = 0.0f;
        for (Integer num : map.keySet()) {
            if (this.f154363q.containsKey(num)) {
                f16 += ((Float) this.f154363q.get(num)).floatValue() * ((Float) map.get(num)).floatValue();
            }
        }
        return Math.min(Math.max(f16, 0.0f), 180.0f);
    }
}
