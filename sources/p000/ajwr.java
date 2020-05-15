package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: ajwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwr extends Drawable {

    /* renamed from: a */
    public int[] f71454a = new int[0];

    /* renamed from: b */
    public ValueAnimator f71455b;

    /* renamed from: c */
    public float f71456c = 0.0f;

    /* renamed from: d */
    private Paint f71457d;

    /* renamed from: a */
    public final int mo39012a() {
        return getBounds().width();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
     arg types: [int, int, float, int, int[], ?[OBJECT, ARRAY], android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void} */
    /* renamed from: b */
    public final void mo39013b() {
        Paint paint = new Paint();
        this.f71457d = paint;
        paint.setDither(true);
        if (this.f71454a.length >= 2) {
            this.f71457d.setShader(new LinearGradient(0.0f, 0.0f, (float) mo39012a(), 0.0f, this.f71454a, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    /* renamed from: c */
    public final void mo39014c() {
        ValueAnimator valueAnimator = this.f71455b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f71455b = null;
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f71456c, 0.0f);
        canvas.drawRect(0.0f, 0.0f, (float) mo39012a(), (float) getBounds().height(), this.f71457d);
        canvas.restore();
    }

    public final int getAlpha() {
        return 0;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        mo39013b();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        mo39013b();
    }
}
