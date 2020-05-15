package p000;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: azzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzc extends Drawable implements azys {

    /* renamed from: a */
    public int f100275a;

    /* renamed from: b */
    public boolean f100276b;

    /* renamed from: c */
    public double f100277c;

    /* renamed from: d */
    public Runnable f100278d;

    /* renamed from: e */
    private final int f100279e;

    /* renamed from: f */
    private final int f100280f;

    /* renamed from: g */
    private final int f100281g;

    /* renamed from: h */
    private final int f100282h;

    /* renamed from: i */
    private final Paint f100283i;

    /* renamed from: j */
    private final azwz f100284j;

    /* renamed from: k */
    private final azxc f100285k;

    /* renamed from: l */
    private final ObjectAnimator f100286l;

    /* renamed from: m */
    private final ObjectAnimator f100287m;

    /* renamed from: n */
    private final float f100288n;

    /* renamed from: o */
    private final float f100289o;

    /* renamed from: p */
    private float f100290p;

    /* renamed from: q */
    private float f100291q;

    /* renamed from: r */
    private final azxd f100292r = new azzb(this);

    public azzc(int i, int i2, int i3, float f, int i4) {
        this.f100280f = i;
        this.f100275a = i2;
        this.f100281g = i3;
        this.f100279e = Math.round(f * 255.0f);
        this.f100282h = i4;
        Paint paint = new Paint();
        this.f100283i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f100283i.setAntiAlias(true);
        float f2 = 1.0f;
        this.f100290p = 1.0f;
        this.f100276b = isVisible();
        this.f100291q = 0.0f;
        double level = (double) getLevel();
        Double.isNaN(level);
        this.f100277c = level / 10000.0d;
        this.f100288n = 1.0f;
        this.f100289o = i4 != 2 ? 0.0f : f2;
        azwz azwz = new azwz();
        this.f100284j = azwz;
        double level2 = (double) getLevel();
        Double.isNaN(level2);
        azwz.mo55350b(level2 / 10000.0d);
        azwz.mo55346a(this.f100277c);
        azwz.mo55349b();
        azwz.mo55347a(this.f100292r);
        this.f100285k = new azxc(this.f100284j);
        this.f100286l = azzd.m86376a(this, "growScale");
        ObjectAnimator b = azzd.m86377b(this, "growScale");
        b.addListener(new azza(this));
        this.f100287m = b;
    }

    /* renamed from: b */
    public final void mo55456b() {
        azwz azwz = this.f100284j;
        double level = (double) getLevel();
        Double.isNaN(level);
        azwz.mo55350b(level / 10000.0d);
        this.f100285k.mo55353b();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            canvas.save();
            Rect bounds = getBounds();
            float height = (float) bounds.height();
            float f = (float) this.f100280f;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(((float) bounds.width()) / 10000.0f, ((float) this.f100280f) / 4.0f);
            canvas.translate(5000.0f, 2.0f);
            if (this.f100291q < 1.0f) {
                if (this.f100282h == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.f100291q - 4.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.f100291q);
            }
            int i = this.f100281g;
            if (i == -1) {
                this.f100283i.setColor(this.f100275a);
            } else {
                this.f100283i.setColor(i);
            }
            this.f100283i.setAlpha((int) (((float) this.f100279e) * this.f100290p));
            canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.f100283i);
            this.f100283i.setColor(this.f100275a);
            this.f100283i.setAlpha((int) (this.f100290p * 255.0f));
            canvas.drawRect(-5000.0f, -2.0f, ((float) (this.f100277c * 10000.0d)) - 8.687973E-4f, 2.0f, this.f100283i);
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.f100291q;
    }

    public final int getIntrinsicHeight() {
        return this.f100280f;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        azwz azwz = this.f100284j;
        double d = (double) i;
        Double.isNaN(d);
        azwz.mo55346a(d / 10000.0d);
        this.f100285k.mo55352a();
        return true;
    }

    public final void setAlpha(int i) {
        this.f100290p = ((float) i) / 255.0f;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f100283i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.f100291q = f;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3;
        if (z != this.f100276b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !z2) {
            return false;
        }
        this.f100276b = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                mo55456b();
                this.f100286l.cancel();
                this.f100287m.cancel();
                this.f100291q = this.f100289o;
            }
            this.f100287m.cancel();
            this.f100286l.setFloatValues(this.f100288n);
            this.f100286l.start();
            this.f100278d = null;
        } else if (z3) {
            this.f100286l.cancel();
            this.f100287m.setFloatValues(this.f100289o);
            this.f100287m.start();
        }
        return z3;
    }

    /* renamed from: a */
    public final void mo55413a() {
        this.f100276b = false;
        if (super.setVisible(false, false)) {
            this.f100286l.cancel();
            this.f100287m.cancel();
            mo55456b();
            Runnable runnable = this.f100278d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f100278d = null;
    }

    /* renamed from: a */
    public final void mo55414a(Runnable runnable) {
        this.f100278d = runnable;
        setVisible(false, false);
    }
}
