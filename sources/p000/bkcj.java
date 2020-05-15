package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: bkcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkcj extends GradientDrawable {

    /* renamed from: a */
    private final Paint f123996a;

    /* renamed from: b */
    private final RectF f123997b = new RectF();

    /* renamed from: c */
    private int f123998c;

    public bkcj() {
        Paint paint = new Paint(1);
        this.f123996a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f123996a.setColor(-1);
        this.f123996a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: a */
    public final void mo65840a(float f, float f2, float f3) {
        if (f != this.f123997b.left || this.f123997b.top != 0.0f || f2 != this.f123997b.right || f3 != this.f123997b.bottom) {
            this.f123997b.set(f, 0.0f, f2, f3);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            int i = Build.VERSION.SDK_INT;
            this.f123998c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            ((View) callback).setLayerType(2, null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f123997b, this.f123996a);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f123998c);
        }
    }
}
