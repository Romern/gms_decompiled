package p000;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: azyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azyv extends Drawable implements azys {

    /* renamed from: d */
    public static final /* synthetic */ int f100223d = 0;

    /* renamed from: e */
    private static final LinearInterpolator f100224e = new LinearInterpolator();

    /* renamed from: a */
    public boolean f100225a;

    /* renamed from: b */
    public float f100226b;

    /* renamed from: c */
    public Runnable f100227c;

    /* renamed from: f */
    private final ValueAnimator f100228f;

    /* renamed from: g */
    private final ValueAnimator f100229g;

    /* renamed from: h */
    private float f100230h;

    /* renamed from: i */
    private final RectF f100231i = new RectF();

    /* renamed from: j */
    private final Rect f100232j = new Rect();

    /* renamed from: k */
    private final int f100233k;

    /* renamed from: l */
    private final Paint f100234l;

    /* renamed from: m */
    private final int f100235m;

    /* renamed from: n */
    private final int f100236n;

    /* renamed from: o */
    private final float f100237o;

    /* renamed from: p */
    private final azwz f100238p;

    /* renamed from: q */
    private final azxc f100239q;

    /* renamed from: r */
    private int f100240r = 255;

    public azyv(int i, int i2, int i3) {
        this.f100235m = i;
        this.f100237o = -1.0f;
        this.f100236n = i2;
        this.f100233k = i3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        ofFloat.setDuration(750L);
        ofFloat.setInterpolator(f100224e);
        this.f100228f = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        ofFloat2.addListener(new azyu(this));
        ofFloat2.setDuration(750L);
        ofFloat2.setInterpolator(f100224e);
        this.f100229g = ofFloat2;
        Paint paint = new Paint();
        this.f100234l = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f100234l.setStrokeCap(Paint.Cap.SQUARE);
        this.f100234l.setAntiAlias(true);
        this.f100225a = false;
        this.f100226b = (float) (getLevel() / 10000);
        azwz azwz = new azwz();
        this.f100238p = azwz;
        double level = (double) getLevel();
        Double.isNaN(level);
        azwz.mo55350b(level / 10000.0d);
        azwz.mo55346a((double) this.f100226b);
        azwz.mo55349b();
        azwz.mo55347a(new azyt(this));
        this.f100239q = new azxc(this.f100238p);
        setVisible(false, false);
    }

    /* renamed from: b */
    public final void mo55416b() {
        mo55417c();
        if (this.f100228f.isStarted()) {
            this.f100228f.cancel();
        }
        if (this.f100229g.isStarted()) {
            this.f100229g.cancel();
        }
    }

    /* renamed from: c */
    public final void mo55417c() {
        azwz azwz = this.f100238p;
        double level = (double) getLevel();
        Double.isNaN(level);
        azwz.mo55350b(level / 10000.0d);
        this.f100239q.mo55353b();
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        if (!getBounds().isEmpty() && isVisible()) {
            if (this.f100237o != -1.0f) {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.f100232j.left = centerX - (getIntrinsicWidth() / 2);
                this.f100232j.right = centerX + (getIntrinsicWidth() / 2);
                this.f100232j.top = centerY - (getIntrinsicHeight() / 2);
                this.f100232j.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.f100232j;
            } else {
                rect = getBounds();
            }
            int i = this.f100235m;
            float f = this.f100230h;
            float f2 = ((float) i) * f;
            int i2 = (int) (((float) this.f100240r) * f);
            float f3 = ((float) (this.f100236n + i)) - (f2 / 2.0f);
            this.f100234l.setStrokeWidth(f2);
            this.f100231i.set(rect);
            this.f100231i.inset(f3, f3);
            float width = this.f100231i.width();
            float f4 = this.f100226b;
            this.f100234l.setColor(this.f100233k);
            this.f100234l.setAlpha((int) (((float) i2) * 0.2f));
            canvas.drawOval(this.f100231i, this.f100234l);
            this.f100234l.setAlpha(i2);
            double d = (double) ((width / 2.0f) - f2);
            Double.isNaN(d);
            double d2 = (double) (f2 * 180.0f);
            Double.isNaN(d2);
            float max = Math.max(f4 * 360.0f, (float) ((d * 3.141592653589793d) / d2));
            if (max >= 5.0f) {
                canvas.drawArc(this.f100231i, -90.0f, max, false, this.f100234l);
            }
        }
    }

    public float getAlphaFraction() {
        return this.f100230h;
    }

    public final int getIntrinsicHeight() {
        float f = this.f100237o;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        float f = this.f100237o;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        azwz azwz = this.f100238p;
        double d = (double) i;
        Double.isNaN(d);
        azwz.mo55346a(d / 10000.0d);
        this.f100239q.mo55352a();
        return true;
    }

    public final void setAlpha(int i) {
        if (i != this.f100240r) {
            this.f100240r = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f100230h = f;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f100234l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f100225a;
        if (!z3 && !z2) {
            return false;
        }
        this.f100225a = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f100229g.isRunning()) {
                this.f100228f.setCurrentPlayTime(750 - this.f100229g.getCurrentPlayTime());
                this.f100229g.cancel();
            }
            if (z2) {
                mo55416b();
                this.f100228f.start();
            } else {
                this.f100228f.start();
            }
            this.f100227c = null;
        } else if (z3) {
            if (this.f100228f.isRunning()) {
                this.f100229g.setCurrentPlayTime(750 - this.f100228f.getCurrentPlayTime());
                this.f100228f.cancel();
            }
            this.f100229g.start();
        } else {
            mo55416b();
        }
        return z3;
    }

    /* renamed from: a */
    public final void mo55413a() {
        this.f100225a = false;
        if (super.setVisible(false, false)) {
            Runnable runnable = this.f100227c;
            if (runnable != null) {
                runnable.run();
            }
            mo55417c();
        }
        this.f100227c = null;
    }

    /* renamed from: a */
    public final void mo55414a(Runnable runnable) {
        this.f100227c = runnable;
        setVisible(false, false);
    }
}
