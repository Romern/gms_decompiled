package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

/* renamed from: awc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awc extends Drawable {

    /* renamed from: b */
    private static final Property f2412b = new awb(Integer.class, "level");

    /* renamed from: c */
    private static final TimeInterpolator f2413c = avw.f2397a;

    /* renamed from: a */
    public final ObjectAnimator f2414a;

    /* renamed from: d */
    private final RectF f2415d = new RectF();

    /* renamed from: e */
    private final Paint f2416e;

    public awc() {
        Paint paint = new Paint();
        this.f2416e = paint;
        paint.setAntiAlias(true);
        this.f2416e.setStyle(Paint.Style.STROKE);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, f2412b, 0, 10000);
        this.f2414a = ofInt;
        ofInt.setRepeatCount(-1);
        this.f2414a.setRepeatMode(1);
        this.f2414a.setDuration(6000L);
        this.f2414a.setInterpolator(new LinearInterpolator());
    }

    /* renamed from: a */
    private static float m2262a(float f, float f2, float f3) {
        if (f != f2) {
            return (f3 - f) / (f2 - f);
        }
        return 0.0f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        canvas.save();
        this.f2415d.set(getBounds());
        this.f2415d.inset(0.0f, 0.0f);
        this.f2416e.setStrokeWidth(0.0f);
        this.f2416e.setColor(0);
        int level = getLevel();
        float f3 = ((float) (level - ((level / 2000) * 2000))) / 2000.0f;
        float f4 = 54.0f * f3;
        if (f3 < 0.5f) {
            f = f2413c.getInterpolation(m2262a(0.0f, 0.5f, f3)) * 306.0f;
        } else {
            f = (1.0f - f2413c.getInterpolation(m2262a(0.5f, 1.0f, f3))) * 306.0f;
        }
        float max = Math.max(1.0f, f);
        float f5 = ((float) level) * 1.0E-4f;
        canvas.rotate((((f5 + f5) * 360.0f) - 0.049804688f) + f4, this.f2415d.centerX(), this.f2415d.centerY());
        RectF rectF = this.f2415d;
        if (f3 >= 0.5f) {
            f2 = 306.0f - max;
        } else {
            f2 = 0.0f;
        }
        canvas.drawArc(rectF, f2, max, false, this.f2416e);
        canvas.restore();
    }

    public final int getOpacity() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
