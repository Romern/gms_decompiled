package p000;

import android.animation.ValueAnimator;

/* renamed from: ard */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ard implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ arf f2052a;

    /* renamed from: b */
    final /* synthetic */ arg f2053b;

    public ard(arg arg, arf arf) {
        this.f2053b = arg;
        this.f2052a = arf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        arg.m1907a(floatValue, this.f2052a);
        this.f2053b.mo2330a(floatValue, this.f2052a, false);
        this.f2053b.invalidateSelf();
    }
}
