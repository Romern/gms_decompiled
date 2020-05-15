package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: ajwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwy extends Drawable {

    /* renamed from: a */
    public final ajwx f71484a;

    /* renamed from: b */
    public final ajwx f71485b;

    /* renamed from: c */
    public final ajwx f71486c;

    /* renamed from: d */
    public boolean f71487d = false;

    public ajwy(Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth((float) akim.m59828a(context, 4));
        paint.setColor(akim.m59829b(context));
        this.f71484a = new ajwx(this, paint, akim.m59828a(context, 14));
        this.f71485b = new ajwx(this, m59165a(context));
        this.f71486c = new ajwx(this, m59165a(context));
    }

    /* renamed from: a */
    private static Paint m59165a(Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) akim.m59828a(context, 4));
        paint.setColor(akim.m59829b(context));
        return paint;
    }

    public final void draw(Canvas canvas) {
        if (this.f71487d) {
            this.f71485b.mo39040a(canvas);
            this.f71486c.mo39040a(canvas);
        }
        this.f71484a.mo39040a(canvas);
    }

    public final int getAlpha() {
        return this.f71484a.f71480b.getAlpha();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f71485b.f71480b.setAlpha(i);
        this.f71486c.f71480b.setAlpha(i);
        this.f71484a.f71480b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f71485b.f71480b.setColorFilter(colorFilter);
        this.f71486c.f71480b.setColorFilter(colorFilter);
        this.f71484a.f71480b.setColorFilter(colorFilter);
    }
}
