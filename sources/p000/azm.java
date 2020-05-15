package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: azm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azm extends aze {

    /* renamed from: c */
    private final String f2673c;

    /* renamed from: d */
    private final boolean f2674d;

    /* renamed from: e */
    private final C1230nw f2675e = new C1230nw();

    /* renamed from: f */
    private final C1230nw f2676f = new C1230nw();

    /* renamed from: g */
    private final RectF f2677g = new RectF();

    /* renamed from: h */
    private final int f2678h;

    /* renamed from: i */
    private final azy f2679i;

    /* renamed from: j */
    private final azy f2680j;

    /* renamed from: k */
    private final azy f2681k;

    /* renamed from: l */
    private ban f2682l;

    /* renamed from: m */
    private final int f2683m;

    public azm(ayo ayo, bcg bcg, bbr bbr) {
        super(ayo, bcg, bcb.m2653a(bbr.f2871l), bcc.m2655a(bbr.f2872m), bbr.f2866g, bbr.f2862c, bbr.f2865f, bbr.f2867h, bbr.f2868i);
        this.f2673c = bbr.f2860a;
        this.f2683m = bbr.f2870k;
        this.f2674d = bbr.f2869j;
        this.f2678h = (int) (ayo.f2550a.mo2856a() / 32.0f);
        azy a = bbr.f2861b.mo2972a();
        this.f2679i = a;
        a.mo2939a(this);
        bcg.mo2989a(this.f2679i);
        azy a2 = bbr.f2863d.mo2972a();
        this.f2680j = a2;
        a2.mo2939a(this);
        bcg.mo2989a(this.f2680j);
        azy a3 = bbr.f2864e.mo2972a();
        this.f2681k = a3;
        a3.mo2939a(this);
        bcg.mo2989a(this.f2681k);
    }

    /* renamed from: a */
    private final int[] m2520a(int[] iArr) {
        ban ban = this.f2682l;
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
    private final int m2521c() {
        int round = Math.round(this.f2680j.f2742c * ((float) this.f2678h));
        int round2 = Math.round(this.f2681k.f2742c * ((float) this.f2678h));
        int round3 = Math.round(this.f2679i.f2742c * ((float) this.f2678h));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2673c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aze.a(android.graphics.RectF, android.graphics.Matrix, boolean):void
     arg types: [android.graphics.RectF, android.graphics.Matrix, int]
     candidates:
      azm.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      aze.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      azi.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      aze.a(android.graphics.RectF, android.graphics.Matrix, boolean):void */
    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Matrix matrix2 = matrix;
        if (!this.f2674d) {
            mo2924a(this.f2677g, matrix2, false);
            if (this.f2683m == 1) {
                long c = (long) m2521c();
                shader = (LinearGradient) this.f2675e.mo15534a(c);
                if (shader == null) {
                    PointF pointF = (PointF) this.f2680j.mo2944f();
                    PointF pointF2 = (PointF) this.f2681k.mo2944f();
                    bbp bbp = (bbp) this.f2679i.mo2944f();
                    shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m2520a(bbp.f2851b), bbp.f2850a, Shader.TileMode.CLAMP);
                    this.f2675e.mo15540b(c, shader);
                }
            } else {
                long c2 = (long) m2521c();
                shader = (RadialGradient) this.f2676f.mo15534a(c2);
                if (shader == null) {
                    PointF pointF3 = (PointF) this.f2680j.mo2944f();
                    PointF pointF4 = (PointF) this.f2681k.mo2944f();
                    bbp bbp2 = (bbp) this.f2679i.mo2944f();
                    int[] a = m2520a(bbp2.f2851b);
                    float[] fArr = bbp2.f2850a;
                    float f = pointF3.x;
                    float f2 = pointF3.y;
                    RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (pointF4.x - f), (double) (pointF4.y - f2)), a, fArr, Shader.TileMode.CLAMP);
                    this.f2676f.mo15540b(c2, radialGradient);
                    shader = radialGradient;
                }
            }
            shader.setLocalMatrix(matrix2);
            this.f2614b.setShader(shader);
            super.mo2923a(canvas, matrix, i);
        }
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        super.mo2926a(obj, beq);
        if (obj == ayt.f2573C) {
            ban ban = new ban(beq);
            this.f2682l = ban;
            ban.mo2939a(this);
            this.f2613a.mo2989a(this.f2682l);
        }
    }
}
