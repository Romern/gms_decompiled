package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1393tx extends Drawable {

    /* renamed from: b */
    private static final float f27219b = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f27220a = new Paint();

    /* renamed from: c */
    private final float f27221c;

    /* renamed from: d */
    private final float f27222d;

    /* renamed from: e */
    private final float f27223e;

    /* renamed from: f */
    private float f27224f;

    /* renamed from: g */
    private boolean f27225g;

    /* renamed from: h */
    private final Path f27226h = new Path();

    /* renamed from: i */
    private final int f27227i;

    /* renamed from: j */
    private float f27228j;

    /* renamed from: k */
    private float f27229k;

    /* renamed from: l */
    private final int f27230l = 2;

    public C1393tx(Context context) {
        this.f27220a.setStyle(Paint.Style.STROKE);
        this.f27220a.setStrokeJoin(Paint.Join.MITER);
        this.f27220a.setStrokeCap(Paint.Cap.BUTT);
        this.f27220a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C1390tu.f27204m, C0126R.attr.drawerArrowStyle, 2132017542);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != this.f27220a.getColor()) {
            this.f27220a.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (this.f27220a.getStrokeWidth() != dimension) {
            this.f27220a.setStrokeWidth(dimension);
            double d = (double) (dimension / 2.0f);
            double cos = Math.cos((double) f27219b);
            Double.isNaN(d);
            this.f27229k = (float) (d * cos);
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f27225g != z) {
            this.f27225g = z;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f27224f) {
            this.f27224f = round;
            invalidateSelf();
        }
        this.f27227i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f27222d = (float) Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f27221c = (float) Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f27223e = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo16070a(float f) {
        if (this.f27228j != f) {
            this.f27228j = f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.f27230l;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                z = true;
            } else if (C1173lt.m19613g(this) == 1) {
                z = true;
            }
        }
        float f = this.f27221c;
        float f2 = f * f;
        double sqrt = Math.sqrt((double) (f2 + f2));
        float f3 = this.f27222d;
        float f4 = this.f27228j;
        float f5 = ((((float) sqrt) - f3) * f4) + f3;
        float f6 = f3 + ((this.f27223e - f3) * f4);
        float round = (float) Math.round(((this.f27229k + 0.0f) * f4) + 0.0f);
        float f7 = f27219b;
        float f8 = this.f27228j;
        float f9 = ((f7 + 0.0f) * f8) + 0.0f;
        float f10 = !z ? -180.0f : 0.0f;
        double d = (double) f5;
        double d2 = (double) f9;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        float f11 = f10 + (f8 * 180.0f);
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f27226h.rewind();
        float strokeWidth = this.f27224f + this.f27220a.getStrokeWidth();
        float f12 = strokeWidth + (((-this.f27229k) - strokeWidth) * this.f27228j);
        float f13 = (-f6) / 2.0f;
        this.f27226h.moveTo(f13 + round, 0.0f);
        this.f27226h.rLineTo(f6 - (round + round), 0.0f);
        this.f27226h.moveTo(f13, f12);
        this.f27226h.rLineTo(round2, round3);
        this.f27226h.moveTo(f13, -f12);
        this.f27226h.rLineTo(round2, -round3);
        this.f27226h.close();
        canvas.save();
        float strokeWidth2 = this.f27220a.getStrokeWidth();
        int height = bounds.height();
        float f14 = this.f27224f;
        int i3 = ((int) ((((float) height) - (3.0f * strokeWidth2)) - (f14 + f14))) / 4;
        canvas2.translate((float) bounds.centerX(), ((float) (i3 + i3)) + (strokeWidth2 * 1.5f) + f14);
        if (this.f27225g) {
            if (!z) {
                i = 1;
            } else {
                i = -1;
            }
            canvas2.rotate(f11 * ((float) i));
        } else if (z) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f27226h, this.f27220a);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f27227i;
    }

    public final int getIntrinsicWidth() {
        return this.f27227i;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f27220a.getAlpha()) {
            this.f27220a.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27220a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
