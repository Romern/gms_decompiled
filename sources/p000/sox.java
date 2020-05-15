package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: sox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sox extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f44896a = new sou();

    /* renamed from: b */
    public static final Interpolator f44897b = new sow();

    /* renamed from: f */
    private static final Interpolator f44898f = new LinearInterpolator();

    /* renamed from: g */
    private static final Interpolator f44899g = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public final View f44900c;

    /* renamed from: d */
    public final Animation f44901d;

    /* renamed from: e */
    public float f44902e;

    /* renamed from: h */
    private final int[] f44903h = {-16777216};

    /* renamed from: i */
    private final sov f44904i;

    /* renamed from: j */
    private float f44905j;

    /* renamed from: k */
    private final Resources f44906k;

    /* renamed from: l */
    private double f44907l;

    /* renamed from: m */
    private double f44908m;

    /* renamed from: n */
    private final Animation f44909n;

    /* renamed from: o */
    private final Drawable.Callback f44910o = new sot(this);

    public sox(Context context, View view) {
        this.f44900c = view;
        this.f44906k = context.getResources();
        sov sov = new sov(this.f44910o);
        this.f44904i = sov;
        sov.mo25901a(this.f44903h);
        mo25910a(1);
        sov sov2 = this.f44904i;
        sop sop = new sop(sov2);
        sop.setInterpolator(f44899g);
        sop.setDuration(666);
        sop.setAnimationListener(new soq(this, sov2));
        sor sor = new sor(this, sov2);
        sor.setRepeatCount(-1);
        sor.setRepeatMode(1);
        sor.setInterpolator(f44898f);
        sor.setDuration(1333);
        sor.setAnimationListener(new sos(this, sov2));
        this.f44909n = sop;
        this.f44901d = sor;
    }

    /* renamed from: a */
    private final void m35776a(double d, double d2, double d3, double d4) {
        float f;
        sov sov = this.f44904i;
        float f2 = this.f44906k.getDisplayMetrics().density;
        double d5 = (double) f2;
        Double.isNaN(d5);
        this.f44907l = d * d5;
        Double.isNaN(d5);
        this.f44908m = d2 * d5;
        float f3 = ((float) d4) * f2;
        sov.f44883f = f3;
        sov.f44879b.setStrokeWidth(f3);
        sov.mo25906d();
        Double.isNaN(d5);
        sov.f44891n = d3 * d5;
        sov.mo25907e();
        float min = (float) Math.min((int) this.f44907l, (int) this.f44908m);
        double d6 = sov.f44891n;
        if (d6 > 0.0d && min >= 0.0f) {
            double d7 = (double) (min / 2.0f);
            Double.isNaN(d7);
            f = (float) (d7 - d6);
        } else {
            f = (float) Math.ceil((double) (sov.f44883f / 2.0f));
        }
        sov.f44884g = f;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f44905j, bounds.exactCenterX(), bounds.exactCenterY());
        sov sov = this.f44904i;
        RectF rectF = sov.f44878a;
        rectF.set(bounds);
        float f = sov.f44884g;
        rectF.inset(f, f);
        float f2 = sov.f44880c;
        float f3 = sov.f44882e;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = sov.f44881d;
        sov.f44879b.setColor(sov.f44885h[sov.f44886i]);
        canvas.drawArc(rectF, f4, ((f5 + f3) * 360.0f) - f4, false, sov.f44879b);
        if (sov.f44892o < 255) {
            sov.f44893p.setColor(0);
            sov.f44893p.setAlpha(255 - sov.f44892o);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), sov.f44893p);
        }
        canvas.restoreToCount(save);
    }

    public final int getAlpha() {
        return this.f44904i.f44892o;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f44908m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f44907l;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f44900c.getAnimation() != null;
    }

    public final void setAlpha(int i) {
        this.f44904i.f44892o = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        sov sov = this.f44904i;
        sov.f44879b.setColorFilter(colorFilter);
        sov.mo25906d();
    }

    public final void start() {
        this.f44901d.reset();
        this.f44904i.mo25902b();
        sov sov = this.f44904i;
        if (sov.f44881d != sov.f44880c) {
            this.f44900c.startAnimation(this.f44909n);
            return;
        }
        sov.mo25907e();
        this.f44904i.mo25904c();
        this.f44900c.startAnimation(this.f44901d);
    }

    public final void stop() {
        this.f44900c.clearAnimation();
        mo25909a(0.0f);
        this.f44904i.mo25907e();
        this.f44904i.mo25904c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25909a(float f) {
        this.f44905j = f;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo25910a(int i) {
        if (i != 0) {
            m35776a(40.0d, 40.0d, 8.75d, 2.5d);
        } else {
            m35776a(56.0d, 56.0d, 12.5d, 3.0d);
        }
    }

    /* renamed from: a */
    public final void mo25911a(int... iArr) {
        this.f44904i.mo25901a(iArr);
        this.f44904i.mo25907e();
    }
}
