package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: asps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asps extends Drawable {

    /* renamed from: a */
    private final Paint f89361a;

    /* renamed from: b */
    private final Paint f89362b;

    public asps(Context context) {
        Paint paint = new Paint();
        this.f89361a = paint;
        paint.setColor(C1133kh.m17843b(context, C0126R.color.tp_global_action_cta_border));
        this.f89361a.setAntiAlias(true);
        this.f89361a.setStyle(Paint.Style.STROKE);
        this.f89361a.setStrokeWidth(context.getResources().getDisplayMetrics().density);
        Paint paint2 = new Paint();
        this.f89362b = paint2;
        paint2.setColor(C1133kh.m17843b(context, C0126R.color.tp_global_action_cta_background));
        this.f89362b.setAntiAlias(true);
        this.f89362b.setStyle(Paint.Style.FILL);
    }

    public final void draw(Canvas canvas) {
        float width = ((float) getBounds().width()) * 0.035714287f;
        RectF rectF = new RectF(getBounds());
        canvas.drawRoundRect(rectF, width, width, this.f89362b);
        canvas.drawRoundRect(rectF, width, width, this.f89361a);
    }

    public final int getIntrinsicHeight() {
        return 440;
    }

    public final int getIntrinsicWidth() {
        return 700;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f89361a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f89361a.setColorFilter(colorFilter);
    }
}
