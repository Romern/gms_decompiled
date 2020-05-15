package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcg implements azi, azx, bav {

    /* renamed from: a */
    final Matrix f2934a;

    /* renamed from: b */
    final ayo f2935b;

    /* renamed from: c */
    final bcj f2936c;

    /* renamed from: d */
    public bcg f2937d;

    /* renamed from: e */
    public bcg f2938e;

    /* renamed from: f */
    final bam f2939f;

    /* renamed from: g */
    private final Path f2940g = new Path();

    /* renamed from: h */
    private final Matrix f2941h = new Matrix();

    /* renamed from: i */
    private final Paint f2942i;

    /* renamed from: j */
    private final Paint f2943j;

    /* renamed from: k */
    private final Paint f2944k;

    /* renamed from: l */
    private final Paint f2945l;

    /* renamed from: m */
    private final Paint f2946m;

    /* renamed from: n */
    private final RectF f2947n;

    /* renamed from: o */
    private final RectF f2948o;

    /* renamed from: p */
    private final RectF f2949p;

    /* renamed from: q */
    private final RectF f2950q;

    /* renamed from: r */
    private bae f2951r;

    /* renamed from: s */
    private List f2952s;

    /* renamed from: t */
    private final List f2953t;

    /* renamed from: u */
    private boolean f2954u;

    public bcg(ayo ayo, bcj bcj) {
        boolean z = true;
        this.f2942i = new azc(1);
        this.f2943j = new azc(PorterDuff.Mode.DST_IN, null);
        this.f2944k = new azc(PorterDuff.Mode.DST_OUT, null);
        this.f2945l = new azc(1);
        this.f2946m = new azc(PorterDuff.Mode.CLEAR);
        this.f2947n = new RectF();
        this.f2948o = new RectF();
        this.f2949p = new RectF();
        this.f2950q = new RectF();
        this.f2934a = new Matrix();
        this.f2953t = new ArrayList();
        this.f2954u = true;
        this.f2935b = ayo;
        this.f2936c = bcj;
        bcj.f2965c + "#draw";
        if (bcj.f2984v == 3) {
            this.f2945l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f2945l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        bam a = bcj.f2970h.mo2978a();
        this.f2939f = a;
        a.mo2955a((azx) this);
        List list = bcj.f2969g;
        if (list != null && !list.isEmpty()) {
            bae bae = new bae(bcj.f2969g);
            this.f2951r = bae;
            List list2 = bae.f2753a;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                ((azy) list2.get(i)).mo2939a(this);
            }
            List list3 = this.f2951r.f2754b;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                azy azy = (azy) list3.get(i2);
                mo2989a(azy);
                azy.mo2939a(this);
            }
        }
        if (!this.f2936c.f2981s.isEmpty()) {
            baa baa = new baa(this.f2936c.f2981s);
            baa.f2741b = true;
            baa.mo2939a(new bcf(this, baa));
            mo2990a(((Float) baa.mo2944f()).floatValue() != 1.0f ? false : z);
            mo2989a(baa);
            return;
        }
        mo2990a(true);
    }

    /* renamed from: a */
    private final void m2660a(Canvas canvas) {
        canvas.drawRect(this.f2947n.left - 4.0f, this.f2947n.top - 4.0f, this.f2947n.right + 1.0f, this.f2947n.bottom + 1.0f, this.f2946m);
        axq.m2409a();
    }

    /* renamed from: e */
    private final void m2661e() {
        this.f2935b.invalidateSelf();
    }

    /* renamed from: f */
    private final void m2662f() {
        if (this.f2952s != null) {
            return;
        }
        if (this.f2938e != null) {
            this.f2952s = new ArrayList();
            for (bcg bcg = this.f2938e; bcg != null; bcg = bcg.f2938e) {
                this.f2952s.add(bcg);
            }
            return;
        }
        this.f2952s = Collections.emptyList();
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
    }

    /* renamed from: b */
    public final String mo2930b() {
        return this.f2936c.f2965c;
    }

    /* renamed from: b */
    public abstract void mo2991b(Canvas canvas, Matrix matrix, int i);

    /* renamed from: b */
    public void mo2992b(bau bau, int i, List list, bau bau2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo2993c() {
        return this.f2937d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo2994d() {
        bae bae = this.f2951r;
        return bae != null && !bae.f2753a.isEmpty();
    }

    /* renamed from: a */
    public final void mo2922a() {
        m2661e();
    }

    /* renamed from: a */
    public void mo2988a(float f) {
        bam bam = this.f2939f;
        azy azy = bam.f2773e;
        if (azy != null) {
            azy.mo2938a(f);
        }
        azy azy2 = bam.f2776h;
        if (azy2 != null) {
            azy2.mo2938a(f);
        }
        azy azy3 = bam.f2777i;
        if (azy3 != null) {
            azy3.mo2938a(f);
        }
        azy azy4 = bam.f2769a;
        if (azy4 != null) {
            azy4.mo2938a(f);
        }
        azy azy5 = bam.f2770b;
        if (azy5 != null) {
            azy5.mo2938a(f);
        }
        azy azy6 = bam.f2771c;
        if (azy6 != null) {
            azy6.mo2938a(f);
        }
        azy azy7 = bam.f2772d;
        if (azy7 != null) {
            azy7.mo2938a(f);
        }
        baa baa = bam.f2774f;
        if (baa != null) {
            baa.mo2938a(f);
        }
        baa baa2 = bam.f2775g;
        if (baa2 != null) {
            baa2.mo2938a(f);
        }
        if (this.f2951r != null) {
            for (int i = 0; i < this.f2951r.f2753a.size(); i++) {
                ((azy) this.f2951r.f2753a.get(i)).mo2938a(f);
            }
        }
        float f2 = this.f2936c.f2974l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        bcg bcg = this.f2937d;
        if (bcg != null) {
            bcg.mo2988a(bcg.f2936c.f2974l * f);
        }
        for (int i2 = 0; i2 < this.f2953t.size(); i2++) {
            ((azy) this.f2953t.get(i2)).mo2938a(f);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcg.a(android.graphics.RectF, android.graphics.Matrix, boolean):void
     arg types: [android.graphics.RectF, android.graphics.Matrix, int]
     candidates:
      bcg.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      azi.a(android.graphics.Canvas, android.graphics.Matrix, int):void
      bcg.a(android.graphics.RectF, android.graphics.Matrix, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010b, code lost:
        if (r15 != r10) goto L_0x0113;
     */
    /* renamed from: a */
    public final void mo2923a(Canvas canvas, Matrix matrix, int i) {
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        if (!this.f2954u || this.f2936c.f2982t) {
            axq.m2409a();
            return;
        }
        m2662f();
        this.f2941h.reset();
        this.f2941h.set(matrix2);
        for (int size = this.f2952s.size() - 1; size >= 0; size--) {
            this.f2941h.preConcat(((bcg) this.f2952s.get(size)).f2939f.mo2953a());
        }
        axq.m2409a();
        azy azy = this.f2939f.f2773e;
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (azy != null ? ((Integer) azy.mo2944f()).intValue() : 100))) / 100.0f) * 255.0f);
        if (mo2993c() || mo2994d()) {
            boolean z = false;
            mo2924a(this.f2947n, this.f2941h, false);
            RectF rectF = this.f2947n;
            int i2 = 1;
            if (mo2993c() && this.f2936c.f2984v != 3) {
                this.f2949p.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f2937d.mo2924a(this.f2949p, matrix2, true);
                if (!rectF.intersect(this.f2949p)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.f2941h.preConcat(this.f2939f.mo2953a());
            RectF rectF2 = this.f2947n;
            Matrix matrix3 = this.f2941h;
            this.f2948o.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i3 = 2;
            if (mo2994d()) {
                int size2 = this.f2951r.f2755c.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        bbs bbs = (bbs) this.f2951r.f2755c.get(i4);
                        this.f2940g.set((Path) ((azy) this.f2951r.f2753a.get(i4)).mo2944f());
                        this.f2940g.transform(matrix3);
                        int i5 = bbs.f2876d;
                        int i6 = i5 - 1;
                        if (i5 != 0) {
                            if (i6 != 0) {
                                if (i6 == i2) {
                                    break;
                                }
                            }
                            if (bbs.f2875c) {
                                break;
                            }
                            this.f2940g.computeBounds(this.f2950q, z);
                            if (i4 != 0) {
                                RectF rectF3 = this.f2948o;
                                rectF3.set(Math.min(rectF3.left, this.f2950q.left), Math.min(this.f2948o.top, this.f2950q.top), Math.max(this.f2948o.right, this.f2950q.right), Math.max(this.f2948o.bottom, this.f2950q.bottom));
                            } else {
                                this.f2948o.set(this.f2950q);
                            }
                            i4++;
                            z = false;
                            i2 = 1;
                            i3 = 2;
                        } else {
                            throw null;
                        }
                    } else if (!rectF2.intersect(this.f2948o)) {
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            if (!this.f2947n.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f2947n.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            axq.m2409a();
            if (!this.f2947n.isEmpty()) {
                ben.m2834a(canvas2, this.f2947n, this.f2942i);
                axq.m2409a();
                m2660a(canvas);
                mo2991b(canvas2, this.f2941h, intValue);
                axq.m2409a();
                if (mo2994d()) {
                    Matrix matrix4 = this.f2941h;
                    ben.m2834a(canvas2, this.f2947n, this.f2943j);
                    int i7 = Build.VERSION.SDK_INT;
                    axq.m2409a();
                    int i8 = 0;
                    while (i8 < this.f2951r.f2755c.size()) {
                        bbs bbs2 = (bbs) this.f2951r.f2755c.get(i8);
                        azy azy2 = (azy) this.f2951r.f2753a.get(i8);
                        azy azy3 = (azy) this.f2951r.f2754b.get(i8);
                        int i9 = bbs2.f2876d;
                        int i10 = i9 - 1;
                        if (i9 != 0) {
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    if (i8 == 0) {
                                        this.f2942i.setColor(-16777216);
                                        this.f2942i.setAlpha(255);
                                        canvas2.drawRect(this.f2947n, this.f2942i);
                                    }
                                    if (!bbs2.f2875c) {
                                        this.f2940g.set((Path) azy2.mo2944f());
                                        this.f2940g.transform(matrix4);
                                        canvas2.drawPath(this.f2940g, this.f2944k);
                                    } else {
                                        ben.m2834a(canvas2, this.f2947n, this.f2944k);
                                        canvas2.drawRect(this.f2947n, this.f2942i);
                                        this.f2944k.setAlpha((int) (((float) ((Integer) azy3.mo2944f()).intValue()) * 2.55f));
                                        this.f2940g.set((Path) azy2.mo2944f());
                                        this.f2940g.transform(matrix4);
                                        canvas2.drawPath(this.f2940g, this.f2944k);
                                        canvas.restore();
                                    }
                                } else if (i10 == 2) {
                                    if (bbs2.f2875c) {
                                        ben.m2834a(canvas2, this.f2947n, this.f2943j);
                                        canvas2.drawRect(this.f2947n, this.f2942i);
                                        this.f2944k.setAlpha((int) (((float) ((Integer) azy3.mo2944f()).intValue()) * 2.55f));
                                        this.f2940g.set((Path) azy2.mo2944f());
                                        this.f2940g.transform(matrix4);
                                        canvas2.drawPath(this.f2940g, this.f2944k);
                                        canvas.restore();
                                    } else {
                                        ben.m2834a(canvas2, this.f2947n, this.f2943j);
                                        this.f2940g.set((Path) azy2.mo2944f());
                                        this.f2940g.transform(matrix4);
                                        this.f2942i.setAlpha((int) (((float) ((Integer) azy3.mo2944f()).intValue()) * 2.55f));
                                        canvas2.drawPath(this.f2940g, this.f2942i);
                                        canvas.restore();
                                    }
                                }
                            } else if (!bbs2.f2875c) {
                                this.f2940g.set((Path) azy2.mo2944f());
                                this.f2940g.transform(matrix4);
                                this.f2942i.setAlpha((int) (((float) ((Integer) azy3.mo2944f()).intValue()) * 2.55f));
                                canvas2.drawPath(this.f2940g, this.f2942i);
                            } else {
                                ben.m2834a(canvas2, this.f2947n, this.f2942i);
                                canvas2.drawRect(this.f2947n, this.f2942i);
                                this.f2940g.set((Path) azy2.mo2944f());
                                this.f2940g.transform(matrix4);
                                this.f2942i.setAlpha((int) (((float) ((Integer) azy3.mo2944f()).intValue()) * 2.55f));
                                canvas2.drawPath(this.f2940g, this.f2944k);
                                canvas.restore();
                            }
                            i8++;
                        } else {
                            throw null;
                        }
                    }
                    canvas.restore();
                    axq.m2409a();
                }
                if (mo2993c()) {
                    ben.m2834a(canvas2, this.f2947n, this.f2945l);
                    axq.m2409a();
                    m2660a(canvas);
                    this.f2937d.mo2923a(canvas2, matrix2, intValue);
                    canvas.restore();
                    axq.m2409a();
                    axq.m2409a();
                }
                canvas.restore();
                axq.m2409a();
            }
            axq.m2409a();
            return;
        }
        this.f2941h.preConcat(this.f2939f.mo2953a());
        mo2991b(canvas2, this.f2941h, intValue);
        axq.m2409a();
        axq.m2409a();
    }

    /* renamed from: a */
    public void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        this.f2947n.set(0.0f, 0.0f, 0.0f, 0.0f);
        m2662f();
        this.f2934a.set(matrix);
        if (z) {
            List list = this.f2952s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2934a.preConcat(((bcg) this.f2952s.get(size)).f2939f.mo2953a());
                }
            } else {
                bcg bcg = this.f2938e;
                if (bcg != null) {
                    this.f2934a.preConcat(bcg.f2939f.mo2953a());
                }
            }
        }
        this.f2934a.preConcat(this.f2939f.mo2953a());
    }

    /* renamed from: a */
    public final void mo2989a(azy azy) {
        if (azy != null) {
            this.f2953t.add(azy);
        }
    }

    /* renamed from: a */
    public final void mo2925a(bau bau, int i, List list, bau bau2) {
        if (bau.mo2963a(mo2930b(), i)) {
            if (!"__container".equals(mo2930b())) {
                bau2 = bau2.mo2962a(mo2930b());
                if (bau.mo2965c(mo2930b(), i)) {
                    list.add(bau2.mo2961a(this));
                }
            }
            if (bau.mo2966d(mo2930b(), i)) {
                mo2992b(bau, i + bau.mo2964b(mo2930b(), i), list, bau2);
            }
        }
    }

    /* renamed from: a */
    public void mo2926a(Object obj, beq beq) {
        this.f2939f.mo2957a(obj, beq);
    }

    /* renamed from: a */
    public final void mo2990a(boolean z) {
        if (z != this.f2954u) {
            this.f2954u = z;
            m2661e();
        }
    }
}
