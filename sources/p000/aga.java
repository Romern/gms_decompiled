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

/* renamed from: aga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aga extends Drawable {

    /* renamed from: b */
    private static final Property f494b = new afz(Integer.class, "level");

    /* renamed from: c */
    private static final TimeInterpolator f495c = afy.f491a;

    /* renamed from: a */
    public final ObjectAnimator f496a;

    /* renamed from: d */
    private final RectF f497d = new RectF();

    /* renamed from: e */
    private final Paint f498e;

    public aga() {
        Paint paint = new Paint();
        this.f498e = paint;
        paint.setAntiAlias(true);
        this.f498e.setStyle(Paint.Style.STROKE);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, f494b, 0, 10000);
        this.f496a = ofInt;
        ofInt.setRepeatCount(-1);
        this.f496a.setRepeatMode(1);
        this.f496a.setDuration(6000L);
        this.f496a.setInterpolator(new LinearInterpolator());
    }

    /* renamed from: a */
    private static float m729a(float f, float f2, float f3) {
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
        this.f497d.set(getBounds());
        this.f497d.inset(0.0f, 0.0f);
        this.f498e.setStrokeWidth(0.0f);
        this.f498e.setColor(0);
        int level = getLevel();
        float f3 = ((float) (level - ((level / 2000) * 2000))) / 2000.0f;
        float f4 = 54.0f * f3;
        if (f3 < 0.5f) {
            f = f495c.getInterpolation(m729a(0.0f, 0.5f, f3)) * 306.0f;
        } else {
            f = (1.0f - f495c.getInterpolation(m729a(0.5f, 1.0f, f3))) * 306.0f;
        }
        float max = Math.max(1.0f, f);
        float f5 = ((float) level) * 1.0E-4f;
        canvas.rotate((((f5 + f5) * 360.0f) - 0.049804688f) + f4, this.f497d.centerX(), this.f497d.centerY());
        RectF rectF = this.f497d;
        if (f3 >= 0.5f) {
            f2 = 306.0f - max;
        } else {
            f2 = 0.0f;
        }
        canvas.drawArc(rectF, f2, max, false, this.f498e);
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
