package p000;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: bexl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexl implements Serializable {

    /* renamed from: a */
    public static final Object f112945a = new Object();

    /* renamed from: b */
    public static bexl f112946b;

    /* renamed from: c */
    private final bexf f112947c;

    /* renamed from: d */
    private final bexf[] f112948d;

    /* renamed from: e */
    private final bexf[] f112949e;

    /* renamed from: f */
    private int f112950f = 0;

    /* renamed from: g */
    private int f112951g = 0;

    /* renamed from: h */
    private float f112952h;

    public bexl(String str) {
        int i = 0;
        float f = 1.0f;
        this.f112952h = 1.0f;
        this.f112947c = new bexf(5);
        this.f112948d = new bexf[3];
        this.f112949e = new bexf[10];
        int i2 = 0;
        while (true) {
            bexf[] bexfArr = this.f112948d;
            int length = bexfArr.length;
            if (i2 >= 3) {
                break;
            }
            bexfArr[i2] = new bexf(5);
            i2++;
        }
        while (true) {
            bexf[] bexfArr2 = this.f112949e;
            int length2 = bexfArr2.length;
            if (i >= 10) {
                break;
            }
            bexfArr2[i] = new bexf(5);
            i++;
        }
        this.f112952h = bexg.f112895a.containsKey(str) ? ((Float) bexg.f112895a.get(str)).floatValue() : f;
    }

    /* renamed from: a */
    static final float m96024a(float f) {
        return (float) Math.max(Math.log10((double) Math.abs(f)) * 10.0d, -10000.0d);
    }

    /* renamed from: a */
    private static final void m96025a(bexk bexk, String str, int i, float f) {
        String valueOf = String.valueOf(bexk.f112907a[i]);
        bexk.mo61228a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03f8, code lost:
        return r3;
     */
    /* renamed from: a */
    public final synchronized bexk mo61229a(Map map, int i) {
        bexl bexl;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        int i3;
        float f9;
        float f10;
        int i4;
        bexl bexl2 = this;
        Map map2 = map;
        int i5 = i;
        synchronized (this) {
            try {
                bexk bexk = new bexk();
                bfku bfku = (bfku) map2.get(bfgt.f113823m);
                int i6 = bexl2.f112950f;
                int i7 = i5 - i6;
                int min = Math.min(i6 != 0 ? ((i7 + 60) / 360) - 1 : 0, 4);
                boolean z = i6 == 0 || i7 >= 330;
                if (bfku != null) {
                    if (bfku.f114316b > 0) {
                        int i8 = bexl2.f112951g;
                        if (i8 != 0) {
                            i2 = (((i5 - i8) + 60) / 360) - 1;
                        } else {
                            i2 = 0;
                        }
                        int min2 = Math.min(i2, 4);
                        int i9 = 0;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        for (int i10 = 0; i10 < bfku.f114316b; i10++) {
                            float a = bfku.mo61854a(i10, 0);
                            if (!Float.isInfinite(a) && !Float.isNaN(a)) {
                                f11 += a;
                                f12 += a * a;
                                i9++;
                            }
                        }
                        float f13 = i9 != 0 ? f11 / ((float) i9) : 0.0f;
                        float[] fArr = {f13, i9 != 0 ? (f12 - (f11 * f13)) / ((float) i9) : 0.0f};
                        bexk.f112927i = Math.max(m96024a(fArr[0]), 20.0f);
                        bexk.f112928j = m96024a((float) Math.sqrt((double) fArr[1]));
                        bexk.f112929k = ((float) Math.sqrt((double) fArr[1])) / fArr[0];
                        for (int i11 = 1; i11 < 23; i11++) {
                            int i12 = i11 + 44;
                            int i13 = 0;
                            float f14 = 0.0f;
                            while (true) {
                                i4 = bfku.f114316b;
                                if (i13 >= i4) {
                                    break;
                                }
                                f14 += m96024a(bfku.mo61854a(i13, i12));
                                i13++;
                            }
                            StringBuilder sb = new StringBuilder(27);
                            sb.append("soundMeanLogBark");
                            sb.append(i11);
                            bexk.mo61228a(sb.toString(), f14 / ((float) i4));
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 >= 10) {
                                break;
                            }
                            StringBuilder sb2 = new StringBuilder(27);
                            sb2.append("soundMeanLogBark");
                            sb2.append(i14 + 12);
                            float max = Math.max(bexk.mo61227a(sb2.toString()), 30.0f);
                            if (min2 > 0) {
                                if (bexl2.f112949e[i14].mo61220a() != 0) {
                                    f10 = bexl2.f112949e[i14].mo61224c();
                                } else {
                                    f10 = max;
                                }
                                float f15 = (f10 + max) / 2.0f;
                                for (int i15 = 0; i15 < min2; i15++) {
                                    bexl2.f112949e[i14].mo61221a(f15);
                                }
                            }
                            if (!z) {
                                bexf bexf = bexl2.f112949e[i14];
                                bexf.mo61222b((max + bexf.mo61224c()) / 2.0f);
                            } else {
                                bexl2.f112949e[i14].mo61221a(max);
                            }
                            i14++;
                        }
                        int length = bexl2.f112949e[0].mo61223b().length;
                        float[] fArr2 = new float[length];
                        if (length > 0) {
                            float[] fArr3 = new float[length];
                            int i16 = 0;
                            for (i3 = 10; i16 < i3; i3 = 10) {
                                float[] b = bexl2.f112949e[i16].mo61223b();
                                for (int i17 = 0; i17 < length; i17++) {
                                    fArr3[i17] = fArr3[i17] + ((float) Math.pow((double) b[i17], 2.0d));
                                }
                                i16++;
                            }
                            for (int i18 = 0; i18 < length; i18++) {
                                fArr2[i18] = (float) Math.round(Math.sqrt((double) fArr3[i18]));
                            }
                        }
                        for (int i19 = 0; i19 < bexk.f112907a.length; i19++) {
                            if (length > i19) {
                                f9 = fArr2[(length - i19) - 1];
                            } else {
                                f9 = 2.0f;
                            }
                            m96025a(bexk, "soundMeanLogBark", i19, f9);
                        }
                        bexl2.f112951g = i5;
                    }
                }
                bfku bfku2 = (bfku) map2.get(bfgt.f113814d);
                if (bfku2 != null) {
                    int i20 = bfku2.f114316b;
                    if (i20 > 0) {
                        int i21 = 0;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        while (i21 < i20) {
                            f16 += bfku2.mo61854a(i21, 0);
                            f17 += bfku2.mo61854a(i21, 1);
                            f18 += bfku2.mo61854a(i21, 2);
                            i21++;
                            bexl2 = this;
                        }
                        float f19 = (float) i20;
                        float f20 = f16 / f19;
                        float f21 = f17 / f19;
                        float f22 = f18 / f19;
                        try {
                            float sqrt = (float) Math.sqrt((double) ((f20 * f20) + (f21 * f21) + (f22 * f22)));
                            if (sqrt != 0.0f) {
                                f2 = f20 / sqrt;
                            } else {
                                f2 = 0.0f;
                            }
                            if (sqrt != 0.0f) {
                                f3 = f21 / sqrt;
                            } else {
                                f3 = 0.0f;
                            }
                            if (sqrt != 0.0f) {
                                f4 = f22 / sqrt;
                            } else {
                                f4 = 0.0f;
                            }
                            if (min > 0) {
                                if (bexl2.f112948d[0].mo61220a() != 0) {
                                    f6 = bexl2.f112948d[0].mo61224c();
                                } else {
                                    f6 = f2;
                                }
                                if (bexl2.f112948d[1].mo61220a() != 0) {
                                    f7 = bexl2.f112948d[1].mo61224c();
                                } else {
                                    f7 = f3;
                                }
                                if (bexl2.f112948d[2].mo61220a() != 0) {
                                    f8 = bexl2.f112948d[2].mo61224c();
                                } else {
                                    f8 = f4;
                                }
                                for (int i22 = 0; i22 < min; i22++) {
                                    bexl2.f112948d[0].mo61221a(f6);
                                    bexl2.f112948d[1].mo61221a(f7);
                                    bexl2.f112948d[2].mo61221a(f8);
                                }
                            }
                            if (!z) {
                                bexf bexf2 = bexl2.f112948d[0];
                                bexf2.mo61222b((f2 + bexf2.mo61224c()) / 2.0f);
                                bexf bexf3 = bexl2.f112948d[1];
                                bexf3.mo61222b((f3 + bexf3.mo61224c()) / 2.0f);
                                bexf bexf4 = bexl2.f112948d[2];
                                bexf4.mo61222b((f4 + bexf4.mo61224c()) / 2.0f);
                            } else {
                                bexl2.f112948d[0].mo61221a(f2);
                                bexl2.f112948d[1].mo61221a(f3);
                                bexl2.f112948d[2].mo61221a(f4);
                            }
                            int a2 = bexl2.f112948d[0].mo61220a();
                            if (a2 != 1) {
                                float[] b2 = bexl2.f112948d[0].mo61223b();
                                float[] b3 = bexl2.f112948d[1].mo61223b();
                                float[] b4 = bexl2.f112948d[2].mo61223b();
                                int i23 = a2 - 1;
                                float[] fArr4 = new float[i23];
                                int i24 = 0;
                                while (i24 < i23) {
                                    fArr4[i24] = (float) Math.sqrt(Math.pow((double) b2[i24], 2.0d) + Math.pow((double) b3[i24], 2.0d) + Math.pow((double) b4[i24], 2.0d));
                                    i24++;
                                    b2 = b2;
                                }
                                for (int i25 = 0; i25 < bexk.f112907a.length; i25++) {
                                    if (i23 > i25) {
                                        f5 = fArr4[(i23 - i25) - 1];
                                    } else {
                                        f5 = 0.002f;
                                    }
                                    m96025a(bexk, "accelGravityDir", i25, f5);
                                }
                            } else {
                                bexk.f112924f = 0.002f;
                                bexk.f112925g = 0.002f;
                                bexk.f112926h = 0.002f;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                bfku bfku3 = (bfku) map.get(bfgt.f113821k);
                if (bfku3 == null) {
                    bexl = this;
                } else {
                    int i26 = bfku3.f114316b;
                    if (i26 > 0) {
                        float f23 = 0.0f;
                        for (int i27 = 0; i27 < i26; i27++) {
                            f23 += bfku3.mo61854a(i27, 0);
                        }
                        bexl = this;
                        try {
                            float min3 = Math.min(1000.0f, bexl.f112952h * (f23 / ((float) i26)));
                            bexk.f112920b = min3;
                            if (min > 0) {
                                if (bexl.f112947c.mo61220a() != 0) {
                                    f = bexl.f112947c.mo61224c();
                                } else {
                                    f = bexk.f112920b;
                                }
                                float f24 = (bexk.f112920b + f) / 2.0f;
                                for (int i28 = 0; i28 < min; i28++) {
                                    bexl.f112947c.mo61221a(f24);
                                }
                            }
                            if (!z) {
                                bexf bexf5 = bexl.f112947c;
                                bexf5.mo61222b((min3 + bexf5.mo61224c()) / 2.0f);
                            } else {
                                bexl.f112947c.mo61221a(min3);
                            }
                            float[] b5 = bexl.f112947c.mo61223b();
                            int i29 = 0;
                            while (i29 < bexk.f112907a.length) {
                                int i30 = i29 + 1;
                                int length2 = b5.length;
                                m96025a(bexk, "meanLightLevel", i29, length2 >= i30 ? b5[length2 - i30] : 0.0f);
                                i29 = i30;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        bexl = this;
                    }
                }
                Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(TimeZone.getDefault().getID()));
                instance.setTimeInMillis(((long) i5) * 1000);
                bexk.f112918K = (float) instance.get(11);
                if (z) {
                    bexl.f112950f = i5;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
