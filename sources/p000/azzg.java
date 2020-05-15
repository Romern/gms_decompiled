package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: azzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzg extends Drawable implements Animatable, azys {

    /* renamed from: a */
    public int f100295a;

    /* renamed from: b */
    public final AnimatorSet f100296b;

    /* renamed from: c */
    public boolean f100297c = isVisible();

    /* renamed from: d */
    public Runnable f100298d;

    /* renamed from: e */
    public Runnable f100299e;

    /* renamed from: f */
    private final int f100300f;

    /* renamed from: g */
    private final boolean f100301g;

    /* renamed from: h */
    private final int f100302h;

    /* renamed from: i */
    private final int f100303i;

    /* renamed from: j */
    private final int f100304j;

    /* renamed from: k */
    private final Paint f100305k;

    /* renamed from: l */
    private final ObjectAnimator f100306l;

    /* renamed from: m */
    private final ObjectAnimator f100307m;

    /* renamed from: n */
    private final float f100308n;

    /* renamed from: o */
    private final float f100309o;

    /* renamed from: p */
    private float f100310p = 1.0f;

    /* renamed from: q */
    private float f100311q;

    /* renamed from: r */
    private float f100312r;

    /* renamed from: s */
    private float f100313s;

    /* renamed from: t */
    private float f100314t;

    /* renamed from: u */
    private float f100315u;

    /* renamed from: v */
    private final Rect f100316v;

    public azzg(int i, int i2, int i3, float f, boolean z, int i4) {
        this.f100302h = i;
        this.f100295a = i2;
        this.f100300f = Math.round(f * 255.0f);
        this.f100301g = z;
        this.f100304j = i4;
        this.f100303i = i3;
        float f2 = 1.0f;
        Paint paint = new Paint();
        this.f100305k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f100305k.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.1f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.8268492f);
        ofFloat2.setInterpolator(C1316ra.m20056a(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.8268492f, 0.1f);
        ofFloat3.setInterpolator(C1316ra.m20056a(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617L);
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", -522.6f, 199.6f);
        ofFloat4.setInterpolator(C1316ra.m20056a(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400);
        ofFloat4.setDuration(1600L);
        animatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.1f, 0.55f);
        ofFloat5.setInterpolator(C1316ra.m20056a(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat5.setDuration(352L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.55f, 0.90995026f);
        ofFloat6.setInterpolator(C1316ra.m20056a(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat6.setDuration(532L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.90995026f, 0.1f);
        ofFloat7.setInterpolator(C1316ra.m20056a(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat7.setDuration(1116L);
        animatorSet.playSequentially(ofFloat5, ofFloat6, ofFloat7);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", -208.0f, 132.0f);
        ofFloat8.setInterpolator(C1316ra.m20056a(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat8.setDuration(964L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", 132.0f, 422.6f);
        ofFloat9.setInterpolator(C1316ra.m20056a(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat9.setDuration(1036L);
        animatorSet.playSequentially(ofFloat8, ofFloat9);
        animatorSet.addListener(new azze(this));
        azzj.m86383a();
        azws.m86303a(animatorSet, null);
        this.f100296b = animatorSet;
        this.f100308n = 1.0f;
        this.f100309o = i4 != 2 ? 0.0f : f2;
        this.f100306l = azzd.m86376a(this, "growScale");
        ObjectAnimator b = azzd.m86377b(this, "growScale");
        b.addListener(new azzf(this));
        this.f100307m = b;
        this.f100316v = new Rect();
        mo55469b();
    }

    /* renamed from: b */
    public final void mo55469b() {
        this.f100306l.cancel();
        this.f100307m.cancel();
        this.f100296b.cancel();
        this.f100311q = 0.1f;
        this.f100312r = -522.6f;
        this.f100313s = 0.1f;
        this.f100314t = -197.6f;
        this.f100315u = this.f100309o;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Canvas.clipRect(float, float, float, float):boolean}
     arg types: [int, int, int, int]
     candidates:
      ClspMth{android.graphics.Canvas.clipRect(int, int, int, int):boolean}
      ClspMth{android.graphics.Canvas.clipRect(float, float, float, float):boolean} */
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f100316v)) {
            canvas.save();
            float height = (float) this.f100316v.height();
            float f = (float) this.f100302h;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(((float) this.f100316v.width()) / 360.0f, ((float) this.f100302h) / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.f100315u < 1.0f) {
                if (this.f100304j == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.f100315u - 4.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.f100315u);
            }
            int i = this.f100303i;
            if (i == -1) {
                this.f100305k.setColor(this.f100295a);
                this.f100305k.setAlpha((int) (this.f100310p * ((float) this.f100300f)));
            } else {
                this.f100305k.setColor(i);
                this.f100305k.setAlpha((int) (this.f100310p * ((float) this.f100300f)));
            }
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.f100305k);
            this.f100305k.setColor(this.f100295a);
            if (this.f100301g) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.f100305k.setAlpha((int) (this.f100310p * 255.0f));
            canvas.save();
            canvas.translate(this.f100312r, 0.0f);
            canvas.scale(this.f100311q, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.f100305k);
            canvas.restore();
            canvas.save();
            canvas.translate(this.f100314t, 0.0f);
            canvas.scale(this.f100313s, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.f100305k);
            canvas.restore();
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.f100315u;
    }

    public final int getIntrinsicHeight() {
        return this.f100302h;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.f100311q;
    }

    public float getRect1TranslationX() {
        return this.f100312r;
    }

    public float getRect2ScaleX() {
        return this.f100313s;
    }

    public float getRect2TranslationX() {
        return this.f100314t;
    }

    public final boolean isRunning() {
        return isVisible();
    }

    public final void setAlpha(int i) {
        this.f100310p = (float) i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f100305k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.f100315u = f;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f) {
        this.f100311q = f;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f) {
        this.f100312r = f;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f) {
        this.f100313s = f;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f) {
        this.f100314t = f;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3;
        if (z != this.f100297c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !z2) {
            return false;
        }
        this.f100297c = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                mo55469b();
            }
            this.f100307m.cancel();
            this.f100306l.setFloatValues(this.f100308n);
            this.f100306l.start();
            if (!this.f100296b.isStarted()) {
                this.f100296b.start();
            }
            this.f100299e = null;
        } else if (z3) {
            this.f100306l.cancel();
            this.f100307m.setFloatValues(this.f100309o);
            this.f100307m.start();
        }
        return z3;
    }

    public final void start() {
        setVisible(true, true);
    }

    public final void stop() {
        setVisible(false, false);
    }

    /* renamed from: a */
    public final void mo55413a() {
        this.f100297c = false;
        if (super.setVisible(false, false)) {
            this.f100306l.cancel();
            this.f100307m.cancel();
            this.f100296b.cancel();
            Runnable runnable = this.f100299e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f100299e = null;
    }

    /* renamed from: a */
    public final void mo55414a(Runnable runnable) {
        this.f100299e = runnable;
        stop();
    }
}
