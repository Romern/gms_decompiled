package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azl implements azi, azx, azo {

    /* renamed from: a */
    private final String f2655a;

    /* renamed from: b */
    private final boolean f2656b;

    /* renamed from: c */
    private final bcg f2657c;

    /* renamed from: d */
    private final C1230nw f2658d = new C1230nw();

    /* renamed from: e */
    private final C1230nw f2659e = new C1230nw();

    /* renamed from: f */
    private final Path f2660f = new Path();

    /* renamed from: g */
    private final Paint f2661g = new azc(1);

    /* renamed from: h */
    private final RectF f2662h = new RectF();

    /* renamed from: i */
    private final List f2663i = new ArrayList();

    /* renamed from: j */
    private final azy f2664j;

    /* renamed from: k */
    private final azy f2665k;

    /* renamed from: l */
    private final azy f2666l;

    /* renamed from: m */
    private final azy f2667m;

    /* renamed from: n */
    private azy f2668n;

    /* renamed from: o */
    private ban f2669o;

    /* renamed from: p */
    private final ayo f2670p;

    /* renamed from: q */
    private final int f2671q;

    /* renamed from: r */
    private final int f2672r;

    public azl(ayo ayo, bcg bcg, bbq bbq) {
        this.f2657c = bcg;
        this.f2655a = bbq.f2857f;
        this.f2656b = bbq.f2858g;
        this.f2670p = ayo;
        this.f2672r = bbq.f2859h;
        this.f2660f.setFillType(bbq.f2852a);
        this.f2671q = (int) (ayo.f2550a.mo2856a() / 32.0f);
        azy a = bbq.f2853b.mo2972a();
        this.f2664j = a;
        a.mo2939a(this);
        bcg.mo2989a(this.f2664j);
        azy a2 = bbq.f2854c.mo2972a();
        this.f2665k = a2;
        a2.mo2939a(this);
        bcg.mo2989a(this.f2665k);
        azy a3 = bbq.f2855d.mo2972a();
        this.f2666l = a3;
        a3.mo2939a(this);
        bcg.mo2989a(this.f2666l);
        azy a4 = bbq.f2856e.mo2972a();
        this.f2667m = a4;
        a4.mo2939a(this);
        bcg.mo2989a(this.f2667m);
    }

    /* renamed from: a */
    private final int[] m2511a(int[] iArr) {
        ban ban = this.f2669o;
        if (ban != null) {
            Integer[] numArr = (Integer[]) ban.mo2944f();
            int length = numArr.length;
            int i = 0;
            if (iArr.length != length) {
                iArr = new int[length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private final int m2512c() {
        int round = Math.round(this.f2666l.f2742c * ((float) this.f2671q));
        int round2 = Math.round(this.f2667m.f2742c * ((float) this.f2671q));
        int round3 = Math.round(this.f2664j.f2742c * ((float) this.f2671q));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2655a;
    }

    /* renamed from: a */
    public final void mo2922a() {
        this.f2670p.invalidateSelf();
    }

    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        float f;
        Matrix matrix2 = matrix;
        if (!this.f2656b) {
            this.f2660f.reset();
            for (int i2 = 0; i2 < this.f2663i.size(); i2++) {
                this.f2660f.addPath(((azq) this.f2663i.get(i2)).mo2933e(), matrix2);
            }
            this.f2660f.computeBounds(this.f2662h, false);
            if (this.f2672r == 1) {
                long c = (long) m2512c();
                shader = (LinearGradient) this.f2658d.mo15534a(c);
                if (shader == null) {
                    PointF pointF = (PointF) this.f2666l.mo2944f();
                    PointF pointF2 = (PointF) this.f2667m.mo2944f();
                    bbp bbp = (bbp) this.f2664j.mo2944f();
                    LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m2511a(bbp.f2851b), bbp.f2850a, Shader.TileMode.CLAMP);
                    this.f2658d.mo15540b(c, linearGradient);
                    shader = linearGradient;
                }
            } else {
                long c2 = (long) m2512c();
                shader = (RadialGradient) this.f2659e.mo15534a(c2);
                if (shader == null) {
                    PointF pointF3 = (PointF) this.f2666l.mo2944f();
                    PointF pointF4 = (PointF) this.f2667m.mo2944f();
                    bbp bbp2 = (bbp) this.f2664j.mo2944f();
                    int[] a = m2511a(bbp2.f2851b);
                    float[] fArr = bbp2.f2850a;
                    float f2 = pointF3.x;
                    float f3 = pointF3.y;
                    float hypot = (float) Math.hypot((double) (pointF4.x - f2), (double) (pointF4.y - f3));
                    if (hypot > 0.0f) {
                        f = hypot;
                    } else {
                        f = 0.001f;
                    }
                    shader = new RadialGradient(f2, f3, f, a, fArr, Shader.TileMode.CLAMP);
                    this.f2659e.mo15540b(c2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            this.f2661g.setShader(shader);
            azy azy = this.f2668n;
            if (azy != null) {
                this.f2661g.setColorFilter((ColorFilter) azy.mo2944f());
            }
            this.f2661g.setAlpha(bem.m2821a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f2665k.mo2944f()).intValue())) / 100.0f) * 255.0f)));
            canvas.drawPath(this.f2660f, this.f2661g);
            axq.m2409a();
        }
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        this.f2660f.reset();
        for (int i = 0; i < this.f2663i.size(); i++) {
            this.f2660f.addPath(((azq) this.f2663i.get(i)).mo2933e(), matrix);
        }
        this.f2660f.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        bem.m2824a(bau, i, list, bau2, this);
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        if (obj == ayt.f2577d) {
            this.f2665k.f2743d = beq;
        } else if (obj == ayt.f2572B) {
            ban ban = new ban(beq);
            this.f2668n = ban;
            ban.mo2939a(this);
            this.f2657c.mo2989a(this.f2668n);
        } else if (obj == ayt.f2573C) {
            ban ban2 = new ban(beq);
            this.f2669o = ban2;
            ban2.mo2939a(this);
            this.f2657c.mo2989a(this.f2669o);
        }
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            azg azg = (azg) list2.get(i);
            if (azg instanceof azq) {
                this.f2663i.add((azq) azg);
            }
        }
    }
}
