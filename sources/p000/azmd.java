package p000;

import android.animation.ValueAnimator;

/* renamed from: azmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azmd implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ azme f99614a;

    public azmd(azme azme) {
        this.f99614a = azme;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = 1.0f - (animatedFraction * 0.5f);
        this.f99614a.f99617c.setAlpha(f);
        this.f99614a.f99618d.setAlpha(f);
        this.f99614a.f99617c.setScaleX(f2);
        this.f99614a.f99617c.setScaleY(f2);
        this.f99614a.f99618d.setScaleX(f2);
        this.f99614a.f99618d.setScaleY(f2);
    }
}
