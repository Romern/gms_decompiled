package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: arg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arg extends Drawable implements Animatable {

    /* renamed from: d */
    private static final Interpolator f2077d = new LinearInterpolator();

    /* renamed from: e */
    private static final Interpolator f2078e = new akc();

    /* renamed from: f */
    private static final int[] f2079f = {-16777216};

    /* renamed from: a */
    public final arf f2080a;

    /* renamed from: b */
    float f2081b;

    /* renamed from: c */
    boolean f2082c;

    /* renamed from: g */
    private float f2083g;

    /* renamed from: h */
    private final Resources f2084h;

    /* renamed from: i */
    private final Animator f2085i;

    public arg(Context context) {
        C1244oj.m19766a(context);
        this.f2084h = context.getResources();
        arf arf = new arf();
        this.f2080a = arf;
        arf.mo2324a(f2079f);
        mo2329a(2.5f);
        arf arf2 = this.f2080a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ard(this, arf2));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2077d);
        ofFloat.addListener(new are(this, arf2));
        this.f2085i = ofFloat;
    }

    /* renamed from: a */
    static final void m1907a(float f, arf arf) {
        if (f > 0.75f) {
            float f2 = (f - 6.0f) / 0.25f;
            int b = arf.mo2325b();
            int i = arf.f2064i[arf.mo2320a()];
            int i2 = (b >> 24) & 255;
            int i3 = (b >> 16) & 255;
            int i4 = (b >> 8) & 255;
            int i5 = b & 255;
            arf.f2076u = ((i2 + ((int) (((float) (((i >> 24) & 255) - i2)) * f2))) << 24) | ((i3 + ((int) (((float) (((i >> 16) & 255) - i3)) * f2))) << 16) | ((i4 + ((int) (((float) (((i >> 8) & 255) - i4)) * f2))) << 8) | (i5 + ((int) (f2 * ((float) ((i & 255) - i5)))));
            return;
        }
        arf.f2076u = arf.mo2325b();
    }

    /* renamed from: b */
    public final void mo2333b(float f) {
        arf arf = this.f2080a;
        if (f != arf.f2071p) {
            arf.f2071p = f;
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo2334c(float f) {
        arf arf = this.f2080a;
        arf.f2060e = 0.0f;
        arf.f2061f = f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2083g, bounds.exactCenterX(), bounds.exactCenterY());
        arf arf = this.f2080a;
        RectF rectF = arf.f2056a;
        float f = arf.f2072q;
        float f2 = (arf.f2063h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) arf.f2073r) * arf.f2071p) / 2.0f, arf.f2063h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = arf.f2060e;
        float f4 = arf.f2062g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((arf.f2061f + f4) * 360.0f) - f5;
        arf.f2057b.setColor(arf.f2076u);
        arf.f2057b.setAlpha(arf.f2075t);
        float f7 = arf.f2063h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, arf.f2059d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, arf.f2057b);
        if (arf.f2069n) {
            Path path = arf.f2070o;
            if (path == null) {
                arf.f2070o = new Path();
                arf.f2070o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height());
            int i = arf.f2073r;
            float f9 = arf.f2071p;
            arf.f2070o.moveTo(0.0f, 0.0f);
            arf.f2070o.lineTo(((float) arf.f2073r) * arf.f2071p, 0.0f);
            Path path2 = arf.f2070o;
            int i2 = arf.f2073r;
            float f10 = arf.f2071p;
            path2.lineTo((((float) i2) * f10) / 2.0f, ((float) arf.f2074s) * f10);
            arf.f2070o.offset(((min / 2.0f) + rectF.centerX()) - ((((float) i) * f9) / 2.0f), rectF.centerY() + (arf.f2063h / 2.0f));
            arf.f2070o.close();
            arf.f2058c.setColor(arf.f2076u);
            arf.f2058c.setAlpha(arf.f2075t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(arf.f2070o, arf.f2058c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f2080a.f2075t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f2085i.isRunning();
    }

    public final void setAlpha(int i) {
        this.f2080a.f2075t = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2080a.f2057b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.f2085i.cancel();
        this.f2080a.mo2326c();
        arf arf = this.f2080a;
        if (arf.f2061f != arf.f2060e) {
            this.f2082c = true;
            this.f2085i.setDuration(666);
            this.f2085i.start();
            return;
        }
        arf.mo2322a(0);
        this.f2080a.mo2327d();
        this.f2085i.setDuration(1332);
        this.f2085i.start();
    }

    public final void stop() {
        this.f2085i.cancel();
        this.f2083g = 0.0f;
        this.f2080a.mo2323a(false);
        this.f2080a.mo2322a(0);
        this.f2080a.mo2327d();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo2328a() {
        arf arf = this.f2080a;
        float f = this.f2084h.getDisplayMetrics().density;
        arf.mo2321a(2.5f * f);
        arf.f2072q = 7.5f * f;
        arf.mo2322a(0);
        arf.f2073r = (int) (10.0f * f);
        arf.f2074s = (int) (f * 5.0f);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo2329a(float f) {
        this.f2080a.mo2321a(f);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2330a(float f, arf arf, boolean z) {
        float f2;
        float f3;
        if (this.f2082c) {
            m1907a(f, arf);
            double floor = Math.floor((double) (arf.f2068m / 0.8f));
            float f4 = arf.f2066k;
            float f5 = arf.f2067l;
            arf.f2060e = f4 + (((-0.01f + f5) - f4) * f);
            arf.f2061f = f5;
            float f6 = arf.f2068m;
            arf.f2062g = f6 + ((((float) (floor + 1.0d)) - f6) * f);
        } else if (f != 1.0f || z) {
            float f7 = arf.f2068m;
            if (f >= 0.5f) {
                f2 = arf.f2066k + 0.79f;
                f3 = f2 - (((1.0f - f2078e.getInterpolation((-0.5f + f) / 0.5f)) * 0.79f) + 0.01f);
            } else {
                f3 = arf.f2066k;
                f2 = f3 + (f2078e.getInterpolation(f / 0.5f) * 0.79f) + 0.01f;
            }
            float f8 = this.f2081b;
            arf.f2060e = f3;
            arf.f2061f = f2;
            arf.f2062g = f7 + (0.20999998f * f);
            this.f2083g = (f + f8) * 216.0f;
        }
    }

    /* renamed from: a */
    public final void mo2331a(boolean z) {
        this.f2080a.mo2323a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo2332a(int... iArr) {
        this.f2080a.mo2324a(iArr);
        this.f2080a.mo2322a(0);
        invalidateSelf();
    }
}
