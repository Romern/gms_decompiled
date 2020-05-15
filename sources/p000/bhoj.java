package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: bhoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhoj extends bhlr {

    /* renamed from: a */
    public final RectF f119193a;

    /* renamed from: b */
    private final Paint f119194b;

    /* renamed from: c */
    private int f119195c;

    bhoj() {
        this(null);
    }

    /* renamed from: a */
    public final void mo64085a(float f, float f2, float f3, float f4) {
        if (f != this.f119193a.left || f2 != this.f119193a.top || f3 != this.f119193a.right || f4 != this.f119193a.bottom) {
            this.f119193a.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhoj(bhlx bhlx) {
        super(bhlx == null ? new bhlx() : bhlx);
        Paint paint = new Paint(1);
        this.f119194b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f119194b.setColor(-1);
        this.f119194b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f119193a = new RectF();
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            int i = Build.VERSION.SDK_INT;
            this.f119195c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }
        super.draw(canvas);
        canvas.drawRect(this.f119193a, this.f119194b);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f119195c);
        }
    }
}
