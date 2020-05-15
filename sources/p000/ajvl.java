package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.cast.JGCastService;

/* renamed from: ajvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvl extends Animator {

    /* renamed from: a */
    public final ViewGroup f71356a;

    /* renamed from: b */
    public final ViewGroup f71357b;

    /* renamed from: c */
    public ValueAnimator f71358c;

    /* renamed from: d */
    public long f71359d = 300;

    /* renamed from: e */
    public int f71360e;

    /* renamed from: f */
    public int f71361f;

    /* renamed from: g */
    public int f71362g;

    /* renamed from: h */
    public int f71363h;

    /* renamed from: i */
    public int f71364i;

    /* renamed from: j */
    public int f71365j;

    /* renamed from: k */
    private TimeInterpolator f71366k = new LinearInterpolator();

    /* renamed from: l */
    private long f71367l = 0;

    public ajvl(ViewGroup viewGroup) {
        this.f71356a = viewGroup;
        this.f71357b = (ViewGroup) viewGroup.getParent();
    }

    /* renamed from: a */
    public final void mo38964a(int i, int i2, int i3, int i4) {
        this.f71356a.measure(View.MeasureSpec.makeMeasureSpec(i3 - i, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(i4 - i2, JGCastService.FLAG_PRIVATE_DISPLAY));
        this.f71356a.layout(i, i2, i3, i4);
        ViewGroup viewGroup = this.f71356a;
        int i5 = Build.VERSION.SDK_INT;
        viewGroup.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.f71358c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f71358c = null;
        }
    }

    public final void end() {
        ValueAnimator valueAnimator = this.f71358c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f71358c = null;
        }
    }

    public final long getDuration() {
        return this.f71359d;
    }

    public final TimeInterpolator getInterpolator() {
        return this.f71366k;
    }

    public final long getStartDelay() {
        return this.f71367l;
    }

    public final boolean isRunning() {
        return this.f71358c != null;
    }

    public final Animator setDuration(long j) {
        this.f71359d = j;
        return this;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f71366k = timeInterpolator;
    }

    public final void setStartDelay(long j) {
        this.f71367l = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akiu.a(android.view.ViewGroup, boolean):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      akiu.a(android.view.View, float):void
      akiu.a(android.view.View, android.view.View):void
      akiu.a(android.view.ViewGroup, boolean):void */
    public final void start() {
        if (!isRunning()) {
            akiu.m59858a(this.f71357b, true);
            mo38964a(this.f71360e, this.f71361f, this.f71362g, this.f71363h);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f71365j - this.f71364i);
            this.f71358c = ofInt;
            ofInt.setDuration(this.f71359d);
            this.f71358c.setInterpolator(this.f71366k);
            this.f71358c.addUpdateListener(new ajvj(this));
            this.f71358c.addListener(new ajvk(this));
            this.f71358c.start();
        }
    }
}
