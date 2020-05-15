package p000;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: bam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bam {

    /* renamed from: a */
    public azy f2769a;

    /* renamed from: b */
    public azy f2770b;

    /* renamed from: c */
    public azy f2771c;

    /* renamed from: d */
    public azy f2772d;

    /* renamed from: e */
    public azy f2773e;

    /* renamed from: f */
    public final baa f2774f;

    /* renamed from: g */
    public final baa f2775g;

    /* renamed from: h */
    public final azy f2776h;

    /* renamed from: i */
    public final azy f2777i;

    /* renamed from: j */
    private final Matrix f2778j = new Matrix();

    /* renamed from: k */
    private final Matrix f2779k;

    /* renamed from: l */
    private final Matrix f2780l;

    /* renamed from: m */
    private final Matrix f2781m;

    /* renamed from: n */
    private final float[] f2782n;

    public bam(bbk bbk) {
        azy azy;
        azy azy2;
        azy azy3;
        azy azy4;
        azy azy5;
        azy azy6;
        bbd bbd = bbk.f2835a;
        if (bbd != null) {
            azy = bbd.mo2972a();
        } else {
            azy = null;
        }
        this.f2769a = azy;
        bbl bbl = bbk.f2836b;
        if (bbl != null) {
            azy2 = bbl.mo2972a();
        } else {
            azy2 = null;
        }
        this.f2770b = azy2;
        bbf bbf = bbk.f2837c;
        if (bbf != null) {
            azy3 = bbf.mo2972a();
        } else {
            azy3 = null;
        }
        this.f2771c = azy3;
        bba bba = bbk.f2838d;
        if (bba != null) {
            azy4 = bba.mo2972a();
        } else {
            azy4 = null;
        }
        this.f2772d = azy4;
        bba bba2 = bbk.f2840f;
        if (bba2 != null) {
            azy5 = bba2.mo2972a();
        } else {
            azy5 = null;
        }
        baa baa = (baa) azy5;
        this.f2774f = baa;
        if (baa != null) {
            this.f2779k = new Matrix();
            this.f2780l = new Matrix();
            this.f2781m = new Matrix();
            this.f2782n = new float[9];
        } else {
            this.f2779k = null;
            this.f2780l = null;
            this.f2781m = null;
            this.f2782n = null;
        }
        bba bba3 = bbk.f2841g;
        if (bba3 != null) {
            azy6 = bba3.mo2972a();
        } else {
            azy6 = null;
        }
        this.f2775g = (baa) azy6;
        bbc bbc = bbk.f2839e;
        if (bbc != null) {
            this.f2773e = bbc.mo2972a();
        }
        bba bba4 = bbk.f2842h;
        if (bba4 != null) {
            this.f2776h = bba4.mo2972a();
        } else {
            this.f2776h = null;
        }
        bba bba5 = bbk.f2843i;
        if (bba5 != null) {
            this.f2777i = bba5.mo2972a();
        } else {
            this.f2777i = null;
        }
    }

    /* renamed from: b */
    private final void m2593b() {
        for (int i = 0; i < 9; i++) {
            this.f2782n[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public final Matrix mo2953a() {
        float f;
        float f2;
        float f3;
        this.f2778j.reset();
        azy azy = this.f2770b;
        if (azy != null) {
            PointF pointF = (PointF) azy.mo2944f();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.f2778j.preTranslate(pointF.x, pointF.y);
            }
        }
        azy azy2 = this.f2772d;
        if (azy2 != null) {
            if (azy2 instanceof ban) {
                f3 = ((Float) azy2.mo2944f()).floatValue();
            } else {
                f3 = ((baa) azy2).mo2946g();
            }
            if (f3 != 0.0f) {
                this.f2778j.preRotate(f3);
            }
        }
        if (this.f2774f != null) {
            baa baa = this.f2775g;
            if (baa != null) {
                f = (float) Math.cos(Math.toRadians((double) ((-baa.mo2946g()) + 90.0f)));
            } else {
                f = 0.0f;
            }
            baa baa2 = this.f2775g;
            if (baa2 != null) {
                f2 = (float) Math.sin(Math.toRadians((double) ((-baa2.mo2946g()) + 90.0f)));
            } else {
                f2 = 1.0f;
            }
            double tan = Math.tan(Math.toRadians((double) this.f2774f.mo2946g()));
            m2593b();
            float[] fArr = this.f2782n;
            fArr[0] = f;
            fArr[1] = f2;
            float f4 = -f2;
            fArr[3] = f4;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f2779k.setValues(fArr);
            m2593b();
            float[] fArr2 = this.f2782n;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f2780l.setValues(fArr2);
            m2593b();
            float[] fArr3 = this.f2782n;
            fArr3[0] = f;
            fArr3[1] = f4;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f2781m.setValues(fArr3);
            this.f2780l.preConcat(this.f2779k);
            this.f2781m.preConcat(this.f2780l);
            this.f2778j.preConcat(this.f2781m);
        }
        azy azy3 = this.f2771c;
        if (azy3 != null) {
            ber ber = (ber) azy3.mo2944f();
            float f5 = ber.f3117a;
            if (!(f5 == 1.0f && ber.f3118b == 1.0f)) {
                this.f2778j.preScale(f5, ber.f3118b);
            }
        }
        azy azy4 = this.f2769a;
        if (azy4 != null) {
            PointF pointF2 = (PointF) azy4.mo2944f();
            if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
                this.f2778j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.f2778j;
    }

    /* renamed from: a */
    public final Matrix mo2954a(float f) {
        PointF pointF;
        ber ber;
        azy azy = this.f2770b;
        PointF pointF2 = null;
        if (azy != null) {
            pointF = (PointF) azy.mo2944f();
        } else {
            pointF = null;
        }
        azy azy2 = this.f2771c;
        if (azy2 != null) {
            ber = (ber) azy2.mo2944f();
        } else {
            ber = null;
        }
        this.f2778j.reset();
        if (pointF != null) {
            this.f2778j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (ber != null) {
            double d = (double) f;
            this.f2778j.preScale((float) Math.pow((double) ber.f3117a, d), (float) Math.pow((double) ber.f3118b, d));
        }
        azy azy3 = this.f2772d;
        if (azy3 != null) {
            float floatValue = ((Float) azy3.mo2944f()).floatValue();
            azy azy4 = this.f2769a;
            if (azy4 != null) {
                pointF2 = (PointF) azy4.mo2944f();
            }
            Matrix matrix = this.f2778j;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF2 != null ? pointF2.x : 0.0f;
            if (pointF2 != null) {
                f3 = pointF2.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f2778j;
    }

    /* renamed from: a */
    public final void mo2955a(azx azx) {
        azy azy = this.f2773e;
        if (azy != null) {
            azy.mo2939a(azx);
        }
        azy azy2 = this.f2776h;
        if (azy2 != null) {
            azy2.mo2939a(azx);
        }
        azy azy3 = this.f2777i;
        if (azy3 != null) {
            azy3.mo2939a(azx);
        }
        azy azy4 = this.f2769a;
        if (azy4 != null) {
            azy4.mo2939a(azx);
        }
        azy azy5 = this.f2770b;
        if (azy5 != null) {
            azy5.mo2939a(azx);
        }
        azy azy6 = this.f2771c;
        if (azy6 != null) {
            azy6.mo2939a(azx);
        }
        azy azy7 = this.f2772d;
        if (azy7 != null) {
            azy7.mo2939a(azx);
        }
        baa baa = this.f2774f;
        if (baa != null) {
            baa.mo2939a(azx);
        }
        baa baa2 = this.f2775g;
        if (baa2 != null) {
            baa2.mo2939a(azx);
        }
    }

    /* renamed from: a */
    public final void mo2956a(bcg bcg) {
        bcg.mo2989a(this.f2773e);
        bcg.mo2989a(this.f2776h);
        bcg.mo2989a(this.f2777i);
        bcg.mo2989a(this.f2769a);
        bcg.mo2989a(this.f2770b);
        bcg.mo2989a(this.f2771c);
        bcg.mo2989a(this.f2772d);
        bcg.mo2989a(this.f2774f);
        bcg.mo2989a(this.f2775g);
    }

    /* renamed from: a */
    public final boolean mo2957a(Object obj, beq beq) {
        azy azy;
        azy azy2;
        if (obj == ayt.f2578e) {
            azy azy3 = this.f2769a;
            if (azy3 == null) {
                new PointF();
                this.f2769a = new ban(beq, null);
                return true;
            }
            azy3.f2743d = beq;
            return true;
        } else if (obj == ayt.f2579f) {
            azy azy4 = this.f2770b;
            if (azy4 == null) {
                new PointF();
                this.f2770b = new ban(beq, null);
                return true;
            }
            azy4.f2743d = beq;
            return true;
        } else if (obj == ayt.f2584k) {
            azy azy5 = this.f2771c;
            if (azy5 == null) {
                new ber();
                this.f2771c = new ban(beq, null);
                return true;
            }
            azy5.f2743d = beq;
            return true;
        } else if (obj == ayt.f2585l) {
            azy azy6 = this.f2772d;
            if (azy6 == null) {
                this.f2772d = new ban(beq, null);
                return true;
            }
            azy6.f2743d = beq;
            return true;
        } else {
            if (obj == ayt.f2576c) {
                azy = this.f2773e;
                if (azy == null) {
                    this.f2773e = new ban(beq, null);
                    return true;
                }
            } else if ((obj == ayt.f2598y && (azy2 = this.f2776h) != null) || ((obj == ayt.f2599z && (azy2 = this.f2777i) != null) || (obj == ayt.f2586m && (azy2 = this.f2774f) != null))) {
                azy2.f2743d = beq;
                return true;
            } else if (obj != ayt.f2587n || (azy = this.f2775g) == null) {
                return false;
            }
            azy.f2743d = beq;
            return true;
        }
    }
}
