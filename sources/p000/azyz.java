package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* renamed from: azyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azyz extends Drawable implements Animatable, azys {

    /* renamed from: j */
    public static final /* synthetic */ int f100244j = 0;

    /* renamed from: m */
    private static final LinearInterpolator f100245m = new LinearInterpolator();

    /* renamed from: A */
    private final float f100246A;

    /* renamed from: B */
    private long f100247B;

    /* renamed from: C */
    private long f100248C;

    /* renamed from: a */
    public final AnimatorSet f100249a;

    /* renamed from: b */
    public final ValueAnimator f100250b;

    /* renamed from: c */
    public float f100251c;

    /* renamed from: d */
    public float f100252d;

    /* renamed from: e */
    public int f100253e;

    /* renamed from: f */
    public int f100254f;

    /* renamed from: g */
    public final int[] f100255g;

    /* renamed from: h */
    public boolean f100256h;

    /* renamed from: i */
    public Runnable f100257i;

    /* renamed from: k */
    private final RectF f100258k = new RectF();

    /* renamed from: l */
    private final Rect f100259l = new Rect();

    /* renamed from: n */
    private final ValueAnimator f100260n;

    /* renamed from: o */
    private final ValueAnimator f100261o;

    /* renamed from: p */
    private final ValueAnimator f100262p;

    /* renamed from: q */
    private final ValueAnimator f100263q;

    /* renamed from: r */
    private final ValueAnimator f100264r;

    /* renamed from: s */
    private final ArrayList f100265s;

    /* renamed from: t */
    private float f100266t;

    /* renamed from: u */
    private float f100267u;

    /* renamed from: v */
    private float f100268v;

    /* renamed from: w */
    private final Paint f100269w;

    /* renamed from: x */
    private int f100270x;

    /* renamed from: y */
    private final int f100271y;

    /* renamed from: z */
    private final int f100272z;

    public azyz(int i, int i2, int[] iArr) {
        this.f100271y = i;
        this.f100246A = -1.0f;
        this.f100272z = i2;
        this.f100255g = iArr;
        this.f100256h = false;
        ArrayList arrayList = new ArrayList();
        this.f100265s = arrayList;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", 0.0f, 1.0f);
        ofFloat.setDuration(1332L);
        ofFloat.setInterpolator(f100245m);
        this.f100260n = ofFloat;
        arrayList.add(ofFloat);
        ArrayList arrayList2 = this.f100265s;
        int[] iArr2 = this.f100255g;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "currentColor", iArr2[this.f100253e], iArr2[mo55432b()]);
        ofInt.setEvaluator(azwp.f100128a);
        ofInt.setStartDelay(999);
        ofInt.setDuration(333L);
        ofInt.setInterpolator(f100245m);
        this.f100254f = this.f100255g[this.f100253e];
        this.f100250b = ofInt;
        arrayList2.add(ofInt);
        ArrayList arrayList3 = this.f100265s;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "headFraction", 0.0f, 1.0f);
        ofFloat2.setDuration(666L);
        ofFloat2.setInterpolator(azwy.f100140a);
        this.f100261o = ofFloat2;
        arrayList3.add(ofFloat2);
        ArrayList arrayList4 = this.f100265s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", 0.0f, 1.0f);
        ofFloat3.setStartDelay(666);
        ofFloat3.setDuration(666L);
        ofFloat3.setInterpolator(azwy.f100140a);
        this.f100262p = ofFloat3;
        arrayList4.add(ofFloat3);
        ArrayList arrayList5 = this.f100265s;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        ofFloat4.addListener(new azyx(this));
        ofFloat4.setDuration(750L);
        ofFloat4.setInterpolator(f100245m);
        this.f100263q = ofFloat4;
        arrayList5.add(ofFloat4);
        ArrayList arrayList6 = this.f100265s;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        ofFloat5.addListener(new azyy(this));
        ofFloat5.setDuration(750L);
        ofFloat5.setInterpolator(f100245m);
        this.f100264r = ofFloat5;
        arrayList6.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.f100260n, this.f100261o, this.f100262p, this.f100250b);
        azzj.m86383a();
        azws.m86303a(animatorSet, new azyw(this));
        this.f100249a = animatorSet;
        Paint paint = new Paint();
        this.f100269w = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f100269w.setStrokeCap(Paint.Cap.SQUARE);
        this.f100269w.setAntiAlias(true);
        this.f100270x = 255;
        setVisible(false, false);
        mo55433c();
    }

    /* renamed from: b */
    public final int mo55432b() {
        return (this.f100253e + 1) % this.f100255g.length;
    }

    /* renamed from: c */
    public final void mo55433c() {
        super.setVisible(this.f100256h, false);
        if (this.f100249a.isStarted()) {
            this.f100249a.cancel();
        }
        ArrayList arrayList = this.f100265s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        mo55434d();
        this.f100267u = 0.0f;
        this.f100252d = 0.0f;
        this.f100266t = 0.0f;
        this.f100251c = 0.0f;
        this.f100253e = 0;
        int[] iArr = this.f100255g;
        int i2 = iArr[0];
        this.f100254f = i2;
        this.f100250b.setIntValues(i2, iArr[mo55432b()]);
        this.f100268v = 0.0f;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo55434d() {
        this.f100250b.setStartDelay(999);
        this.f100262p.setStartDelay(666);
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.f100264r.isRunning()) {
            if (this.f100246A != -1.0f) {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.f100259l.left = centerX - (getIntrinsicWidth() / 2);
                this.f100259l.right = centerX + (getIntrinsicWidth() / 2);
                this.f100259l.top = centerY - (getIntrinsicHeight() / 2);
                this.f100259l.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.f100259l;
            } else {
                rect = getBounds();
            }
            int i = this.f100271y;
            float f = this.f100268v;
            float f2 = ((float) i) * f;
            int i2 = this.f100270x;
            float f3 = ((float) (this.f100272z + i)) - (f2 / 2.0f);
            this.f100269w.setColor(this.f100254f);
            this.f100269w.setAlpha((int) (((float) i2) * f));
            this.f100269w.setStrokeWidth(f2);
            this.f100258k.set(rect);
            this.f100258k.inset(f3, f3);
            float width = this.f100258k.width();
            float f4 = this.f100252d * 290.0f;
            float abs = Math.abs((this.f100267u * 290.0f) - f4);
            double d = (double) ((width / 2.0f) - f2);
            Double.isNaN(d);
            double d2 = (double) (f2 * 180.0f);
            Double.isNaN(d2);
            float max = Math.max(abs, (float) ((d * 3.141592653589793d) / d2));
            float f5 = this.f100266t;
            canvas.drawArc(this.f100258k, (f4 + (this.f100251c + (f5 * 286.0f))) - 0.049804688f, max, false, this.f100269w);
        }
    }

    public float getAlphaFraction() {
        return this.f100268v;
    }

    public int getCurrentColor() {
        return this.f100254f;
    }

    public float getDetentFraction() {
        return this.f100266t;
    }

    public float getHeadFraction() {
        return this.f100267u;
    }

    public final int getIntrinsicHeight() {
        float f = this.f100246A;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        float f = this.f100246A;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.f100252d;
    }

    public final boolean isRunning() {
        return this.f100249a.isRunning() || this.f100263q.isRunning();
    }

    public final void setAlpha(int i) {
        if (i != this.f100270x) {
            this.f100270x = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f100268v = f;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f100269w.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCurrentColor(int i) {
        this.f100254f = i;
        invalidateSelf();
    }

    public void setDetentFraction(float f) {
        this.f100266t = f;
        invalidateSelf();
    }

    public void setHeadFraction(float f) {
        this.f100267u = f;
        invalidateSelf();
    }

    public void setTailFraction(float f) {
        this.f100252d = f;
        invalidateSelf();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f100256h;
        if (!z3 && !z2) {
            return false;
        }
        this.f100256h = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f100264r.isRunning()) {
                this.f100263q.setCurrentPlayTime(750 - this.f100264r.getCurrentPlayTime());
                this.f100264r.cancel();
            }
            if (!z2) {
                long max = Math.max(0L, this.f100247B - (SystemClock.elapsedRealtime() - this.f100248C));
                this.f100247B = max;
                this.f100263q.setStartDelay(max);
                this.f100263q.start();
            } else {
                mo55433c();
                this.f100263q.setStartDelay(0);
                this.f100263q.start();
                this.f100247B = 0;
            }
            this.f100248C = SystemClock.elapsedRealtime();
            this.f100257i = null;
        } else if (z3) {
            if (this.f100263q.isRunning()) {
                this.f100264r.setCurrentPlayTime(750 - this.f100263q.getCurrentPlayTime());
                this.f100263q.cancel();
            }
            this.f100264r.start();
        } else {
            mo55433c();
        }
        return z3;
    }

    public final void start() {
        mo55431a(true);
    }

    public final void stop() {
        mo55431a(false);
    }

    /* renamed from: a */
    public final void mo55413a() {
        stop();
        mo55433c();
    }

    /* renamed from: a */
    public final void mo55414a(Runnable runnable) {
        this.f100257i = runnable;
        stop();
    }

    /* renamed from: a */
    public final void mo55431a(boolean z) {
        setVisible(z, true);
    }
}
