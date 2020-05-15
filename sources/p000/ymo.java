package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ymo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ymo extends ymq {

    /* renamed from: c */
    private final yjw f54095c = new yjw(2);

    /* renamed from: d */
    private final ymt f54096d;

    /* renamed from: e */
    private final long f54097e;

    /* renamed from: f */
    private final boolean f54098f;

    public ymo(ymp ymp) {
        super(ymp);
        ymt ymt = ymp.f54103e;
        bmxy.m108581a(ymt);
        this.f54096d = ymt;
        this.f54097e = ymp.f54104f;
        this.f54098f = ymp.f54105g;
    }

    /* renamed from: a */
    private static float m44371a(yhu yhu) {
        return yhu.mo30510b(0);
    }

    /* renamed from: a */
    public final void mo30608a(List list, yhg yhg, yhx yhx) {
        float f;
        bnre bnre;
        bnre bnre2;
        float f2;
        yfw yfw;
        bnre bnre3;
        float f3;
        float f4;
        ymo ymo = this;
        yhg yhg2 = yhg;
        ygx a = yjy.m44261a(list, "com.google.weight");
        ygx a2 = yjy.m44261a(list, "com.google.activity.segment");
        ygx a3 = yjy.m44261a(list, "com.google.calories.bmr");
        ygx a4 = yjy.m44261a(list, "com.google.distance.delta");
        bngx a5 = yjy.m44257a(a2);
        bngx a6 = yjy.m44257a(a4);
        bnre i = yjy.m44257a(a3).listIterator();
        bnre i2 = yjy.m44257a(a).listIterator();
        bnre i3 = bngx.m109355a(ymo.f54095c.mo30580a(a6, a5, yhx)).listIterator();
        if (i2.hasNext()) {
            f = m44371a((yhu) i2.next());
        } else {
            f = 73.0f;
        }
        yfw yfw2 = (yfw) yhg2;
        long j = yfw2.f53737a;
        long j2 = yfw2.f53738b;
        bnre i4 = yfp.m43970b(yhg2, a5.listIterator()).listIterator();
        while (i4.hasNext()) {
            yhu yhu = (yhu) i4.next();
            yfv a7 = yfv.m44005a(Math.max(j, yhu.mo30385a()), Math.min(j2, yhu.mo30387b()));
            yfw yfw3 = (yfw) a7;
            yhu b = yfp.m43971b(i2, yfw3.f53737a);
            if (b != null) {
                f = m44371a(b);
            }
            ymt ymt = ymo.f54096d;
            boolean z = ymo.f54098f;
            if (z) {
                bnre = i4;
                bnre2 = i2;
                f2 = ymt.mo30610a(73.0f, 170.0f, ymt.f54114a);
            } else {
                bnre = i4;
                bnre2 = i2;
                f2 = f * 24.0f;
            }
            yfv yfv = a7;
            yhu b2 = yfp.m43971b(i, yfw3.f53737a);
            if (b2 != null) {
                f2 = b2.mo30510b(0);
            }
            long j3 = j;
            float a8 = yfp.m43955a(i3, yfw3.f53737a, yfw3.f53738b);
            int j4 = yhu.mo30517j();
            long a9 = yhf.m44092a(yfv);
            bmxy.m108588a(a9 >= 0);
            if (a9 != 0) {
                yfw = yfw3;
                if (ymt.mo30611a(j4) <= 1.0f) {
                    f3 = (((float) a9) / ((float) TimeUnit.DAYS.toNanos(1))) * f2;
                    bnre3 = i3;
                } else {
                    float a10 = ymt.mo30611a(j4) * 24.0f * f * ymt.m44386a(a9);
                    bnre3 = i3;
                    float nanos = ((float) a9) / ((float) TimeUnit.MINUTES.toNanos(1));
                    float f5 = a8 / nanos;
                    float f6 = f5 / 60.0f;
                    Float f7 = (Float) ynq.f54217a.get(Integer.valueOf(j4));
                    float f8 = Float.NaN;
                    if (f7 == null || f7.floatValue() >= f6) {
                        if (!(j4 == 1 || j4 == 14)) {
                            if (!(j4 == 35 || j4 == 88 || j4 == 7)) {
                                if (j4 != 8) {
                                    if (!(j4 == 93 || j4 == 94)) {
                                        switch (j4) {
                                            case 16:
                                            case 17:
                                            case 18:
                                            case 19:
                                                break;
                                            default:
                                                switch (j4) {
                                                }
                                        }
                                    }
                                }
                                f4 = 0.2f;
                                f8 = (f5 * f4) + 3.5f;
                            }
                            f4 = 0.1f;
                            f8 = (f5 * f4) + 3.5f;
                        }
                        float f9 = 15.0f + f;
                        f8 = (((((((9.81f * f9) * f6) * 0.0053f) + (((f6 * f6) * f6) * 0.185f)) * 6.118f) * 1.8f) / f9) + 7.0f;
                    }
                    float f10 = (((f8 * nanos) * f) * 5.01f) / 1000.0f;
                    if (Float.isNaN(f10)) {
                        f10 = 0.0f;
                    }
                    if (z) {
                        float[] fArr = {f10, a10, f2 * ymt.m44386a(a9)};
                        bmxy.m108588a(true);
                        float f11 = fArr[0];
                        for (int i5 = 1; i5 < 3; i5++) {
                            f11 = Math.max(f11, fArr[i5]);
                        }
                        f3 = f11;
                    } else {
                        f3 = Math.max(f10, a10);
                    }
                }
            } else {
                bnre3 = i3;
                yfw = yfw3;
                f3 = 0.0f;
            }
            if (f3 > 0.0f) {
                long j5 = ymo.f54097e;
                long j6 = yfw.f53737a;
                long j7 = yfw.f53738b;
                long a11 = yhf.m44092a(yfv);
                if (j5 <= 0) {
                    j5 = a11;
                }
                while (j6 < j7) {
                    long j8 = j6 + j5;
                    long min = Math.min(j8, j7);
                    yht c = yhx.mo30521c();
                    yfm.m43953a(c, j6, min);
                    yft a12 = c.mo30503a();
                    double d = (double) f3;
                    double d2 = (double) (min - j6);
                    double d3 = (double) a11;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d);
                    a12.mo30432a(d * (d2 / d3));
                    i = i;
                    j5 = j5;
                    j6 = j8;
                }
            }
            ymo = this;
            i = i;
            i4 = bnre;
            i2 = bnre2;
            j = j3;
            i3 = bnre3;
        }
    }
}
