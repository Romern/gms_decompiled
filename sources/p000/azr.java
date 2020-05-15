package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: azr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azr implements azq, azx, azo {

    /* renamed from: a */
    private final Path f2689a = new Path();

    /* renamed from: b */
    private final String f2690b;

    /* renamed from: c */
    private final ayo f2691c;

    /* renamed from: d */
    private final boolean f2692d;

    /* renamed from: e */
    private final azy f2693e;

    /* renamed from: f */
    private final azy f2694f;

    /* renamed from: g */
    private final azy f2695g;

    /* renamed from: h */
    private final azy f2696h;

    /* renamed from: i */
    private final azy f2697i;

    /* renamed from: j */
    private final azy f2698j;

    /* renamed from: k */
    private final azy f2699k;

    /* renamed from: l */
    private final azf f2700l = new azf();

    /* renamed from: m */
    private boolean f2701m;

    /* renamed from: n */
    private final int f2702n;

    public azr(ayo ayo, bcg bcg, bbu bbu) {
        this.f2691c = ayo;
        this.f2690b = bbu.f2879a;
        this.f2702n = bbu.f2888j;
        this.f2692d = bbu.f2887i;
        this.f2693e = bbu.f2880b.mo2972a();
        this.f2694f = bbu.f2881c.mo2972a();
        this.f2695g = bbu.f2882d.mo2972a();
        this.f2697i = bbu.f2884f.mo2972a();
        this.f2699k = bbu.f2886h.mo2972a();
        if (this.f2702n == 1) {
            this.f2696h = bbu.f2883e.mo2972a();
            this.f2698j = bbu.f2885g.mo2972a();
        } else {
            this.f2696h = null;
            this.f2698j = null;
        }
        bcg.mo2989a(this.f2693e);
        bcg.mo2989a(this.f2694f);
        bcg.mo2989a(this.f2695g);
        bcg.mo2989a(this.f2697i);
        bcg.mo2989a(this.f2699k);
        if (this.f2702n == 1) {
            bcg.mo2989a(this.f2696h);
            bcg.mo2989a(this.f2698j);
        }
        this.f2693e.mo2939a(this);
        this.f2694f.mo2939a(this);
        this.f2695g.mo2939a(this);
        this.f2697i.mo2939a(this);
        this.f2699k.mo2939a(this);
        if (this.f2702n == 1) {
            this.f2696h.mo2939a(this);
            this.f2698j.mo2939a(this);
        }
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2701m = false;
        this.f2691c.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2690b;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        float f;
        float f2;
        float f3;
        double d;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        double d2;
        int i;
        if (this.f2701m) {
            return this.f2689a;
        }
        this.f2689a.reset();
        if (!this.f2692d) {
            int i2 = this.f2702n;
            if (i2 != 0) {
                double d3 = 0.0d;
                if (i2 == 1) {
                    float floatValue = ((Float) this.f2693e.mo2944f()).floatValue();
                    azy azy = this.f2695g;
                    if (azy != null) {
                        d3 = (double) ((Float) azy.mo2944f()).floatValue();
                    }
                    double radians = Math.toRadians(d3 - 0.0498046875d);
                    double d4 = (double) floatValue;
                    Double.isNaN(d4);
                    float f15 = (float) (6.283185307179586d / d4);
                    float f16 = f15 / 2.0f;
                    float f17 = floatValue - ((float) ((int) floatValue));
                    if (f17 != 0.0f) {
                        double d5 = (double) ((1.0f - f17) * f16);
                        Double.isNaN(d5);
                        radians += d5;
                    }
                    float floatValue2 = ((Float) this.f2697i.mo2944f()).floatValue();
                    float floatValue3 = ((Float) this.f2696h.mo2944f()).floatValue();
                    azy azy2 = this.f2698j;
                    if (azy2 != null) {
                        f = ((Float) azy2.mo2944f()).floatValue() / 100.0f;
                    } else {
                        f = 0.0f;
                    }
                    azy azy3 = this.f2699k;
                    if (azy3 != null) {
                        f2 = ((Float) azy3.mo2944f()).floatValue() / 100.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f17 != 0.0f) {
                        float f18 = ((floatValue2 - floatValue3) * f17) + floatValue3;
                        f3 = f;
                        double d6 = (double) f18;
                        double cos = Math.cos(radians);
                        Double.isNaN(d6);
                        float f19 = (float) (d6 * cos);
                        double sin = Math.sin(radians);
                        Double.isNaN(d6);
                        float f20 = (float) (d6 * sin);
                        this.f2689a.moveTo(f19, f20);
                        double d7 = (double) ((f15 * f17) / 2.0f);
                        Double.isNaN(d7);
                        double d8 = radians + d7;
                        f4 = f19;
                        f7 = f16;
                        f5 = f20;
                        f6 = f18;
                        d = d8;
                    } else {
                        f3 = f;
                        double d9 = (double) floatValue2;
                        double cos2 = Math.cos(radians);
                        Double.isNaN(d9);
                        f4 = (float) (cos2 * d9);
                        double sin2 = Math.sin(radians);
                        Double.isNaN(d9);
                        float f21 = (float) (d9 * sin2);
                        this.f2689a.moveTo(f4, f21);
                        f7 = f16;
                        double d10 = (double) f7;
                        Double.isNaN(d10);
                        d = radians + d10;
                        f5 = f21;
                        f6 = 0.0f;
                    }
                    double ceil = Math.ceil(d4);
                    double d11 = ceil + ceil;
                    double d12 = d;
                    boolean z = false;
                    int i3 = 0;
                    float f22 = f4;
                    while (true) {
                        float f23 = floatValue2;
                        float f24 = floatValue3;
                        double d13 = (double) i3;
                        if (d13 >= d11) {
                            break;
                        }
                        if (!z) {
                            f8 = f24;
                        } else {
                            f8 = f23;
                        }
                        float f25 = (f6 == 0.0f || d13 != d11 + -2.0d) ? f7 : (f15 * f17) / 2.0f;
                        float f26 = f15;
                        float f27 = f7;
                        double d14 = (double) ((f6 == 0.0f || d13 != d11 + -1.0d) ? f8 : f6);
                        double cos3 = Math.cos(d12);
                        Double.isNaN(d14);
                        double d15 = d13;
                        float f28 = (float) (d14 * cos3);
                        double sin3 = Math.sin(d12);
                        Double.isNaN(d14);
                        float f29 = (float) (d14 * sin3);
                        if (f3 == 0.0f && f2 == 0.0f) {
                            this.f2689a.lineTo(f28, f29);
                            f9 = f6;
                            f10 = f25;
                        } else {
                            f9 = f6;
                            f10 = f25;
                            double atan2 = (double) ((float) (Math.atan2((double) f5, (double) f22) - 2.858407346410207d));
                            float cos4 = (float) Math.cos(atan2);
                            float sin4 = (float) Math.sin(atan2);
                            float f30 = f5;
                            float f31 = f22;
                            double atan22 = (double) ((float) (Math.atan2((double) f29, (double) f28) - 2.858407346410207d));
                            float cos5 = (float) Math.cos(atan22);
                            float sin5 = (float) Math.sin(atan22);
                            if (!z) {
                                f11 = f2;
                            } else {
                                f11 = f3;
                            }
                            if (!z) {
                                f12 = f3;
                            } else {
                                f12 = f2;
                            }
                            if (!z) {
                                f13 = f23;
                            } else {
                                f13 = f24;
                            }
                            float f32 = f13 * f11 * 0.47829f;
                            float f33 = cos4 * f32;
                            float f34 = f32 * sin4;
                            float f35 = f8 * f12 * 0.47829f;
                            float f36 = cos5 * f35;
                            float f37 = f35 * sin5;
                            if (f17 != 0.0f) {
                                if (i3 == 0) {
                                    f33 *= f17;
                                    f34 *= f17;
                                } else if (d15 == d11 - 4.0d) {
                                    f36 *= f17;
                                    f37 *= f17;
                                }
                            }
                            this.f2689a.cubicTo(f31 - f33, f30 - f34, f28 + f36, f29 + f37, f28, f29);
                        }
                        double d16 = (double) f10;
                        Double.isNaN(d16);
                        d12 += d16;
                        z = !z;
                        i3++;
                        f5 = f29;
                        f22 = f28;
                        floatValue2 = f23;
                        floatValue3 = f24;
                        f15 = f26;
                        f7 = f27;
                        f6 = f9;
                    }
                    PointF pointF = (PointF) this.f2694f.mo2944f();
                    this.f2689a.offset(pointF.x, pointF.y);
                    this.f2689a.close();
                } else if (i2 == 2) {
                    int floor = (int) Math.floor((double) ((Float) this.f2693e.mo2944f()).floatValue());
                    azy azy4 = this.f2695g;
                    if (azy4 != null) {
                        d3 = (double) ((Float) azy4.mo2944f()).floatValue();
                    }
                    double radians2 = Math.toRadians(d3 - 0.0498046875d);
                    double d17 = (double) floor;
                    float floatValue4 = ((Float) this.f2699k.mo2944f()).floatValue() / 100.0f;
                    float floatValue5 = ((Float) this.f2697i.mo2944f()).floatValue();
                    double d18 = (double) floatValue5;
                    double cos6 = Math.cos(radians2);
                    Double.isNaN(d18);
                    float f38 = (float) (d18 * cos6);
                    double sin6 = Math.sin(radians2);
                    Double.isNaN(d18);
                    float f39 = floatValue5;
                    float f40 = (float) (d18 * sin6);
                    this.f2689a.moveTo(f38, f40);
                    Double.isNaN(d17);
                    double d19 = (double) ((float) (6.283185307179586d / d17));
                    Double.isNaN(d19);
                    double d20 = radians2 + d19;
                    double ceil2 = Math.ceil(d17);
                    int i4 = 0;
                    while (((double) i4) < ceil2) {
                        double cos7 = Math.cos(d20);
                        Double.isNaN(d18);
                        float f41 = (float) (cos7 * d18);
                        double sin7 = Math.sin(d20);
                        Double.isNaN(d18);
                        double d21 = d19;
                        float f42 = (float) (d18 * sin7);
                        if (floatValue4 != 0.0f) {
                            i = i4;
                            double atan23 = (double) ((float) (Math.atan2((double) f40, (double) f38) - 2.858407346410207d));
                            d2 = d18;
                            double atan24 = (double) ((float) (Math.atan2((double) f42, (double) f41) - 2.858407346410207d));
                            float f43 = f39 * floatValue4 * 0.25f;
                            f14 = floatValue4;
                            this.f2689a.cubicTo(f38 - (((float) Math.cos(atan23)) * f43), f40 - (((float) Math.sin(atan23)) * f43), f41 + (((float) Math.cos(atan24)) * f43), f42 + (f43 * ((float) Math.sin(atan24))), f41, f42);
                        } else {
                            f14 = floatValue4;
                            d2 = d18;
                            i = i4;
                            this.f2689a.lineTo(f41, f42);
                        }
                        Double.isNaN(d21);
                        d20 += d21;
                        i4 = i + 1;
                        f40 = f42;
                        f38 = f41;
                        d19 = d21;
                        d18 = d2;
                        floatValue4 = f14;
                    }
                    PointF pointF2 = (PointF) this.f2694f.mo2944f();
                    this.f2689a.offset(pointF2.x, pointF2.y);
                    this.f2689a.close();
                }
                this.f2689a.close();
                this.f2700l.mo2928a(this.f2689a);
                this.f2701m = true;
                return this.f2689a;
            }
            throw null;
        }
        this.f2701m = true;
        return this.f2689a;
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        azy azy;
        azy azy2;
        if (obj == ayt.f2592s) {
            this.f2693e.f2743d = beq;
        } else if (obj == ayt.f2593t) {
            this.f2695g.f2743d = beq;
        } else if (obj == ayt.f2583j) {
            this.f2694f.f2743d = beq;
        } else if (obj == ayt.f2594u && (azy2 = this.f2696h) != null) {
            azy2.f2743d = beq;
        } else if (obj == ayt.f2595v) {
            this.f2697i.f2743d = beq;
        } else if (obj == ayt.f2596w && (azy = this.f2698j) != null) {
            azy.f2743d = beq;
        } else if (obj == ayt.f2597x) {
            this.f2699k.f2743d = beq;
        }
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            azg azg = (azg) list.get(i);
            if (azg instanceof azw) {
                azw azw = (azw) azg;
                if (azw.f2738e == 1) {
                    this.f2700l.mo2929a(azw);
                    azw.mo2935a(this);
                }
            }
        }
    }
}
