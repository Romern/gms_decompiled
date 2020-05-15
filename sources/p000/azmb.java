package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: azmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azmb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f99610a;

    /* renamed from: b */
    final /* synthetic */ View f99611b;

    /* renamed from: c */
    final /* synthetic */ azme f99612c;

    public azmb(azme azme, View view, View view2) {
        this.f99612c = azme;
        this.f99610a = view;
        this.f99611b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (animatedFraction + 1.0f) * 0.5f;
        this.f99610a.setAlpha(animatedFraction);
        this.f99610a.setScaleX(f);
        this.f99610a.setScaleY(f);
        azme azme = this.f99612c;
        if (!azme.f99622h && animatedFraction > 0.25f) {
            View view = this.f99611b;
            view.setScaleX(0.5f);
            view.setScaleY(0.5f);
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(azme.f99616b);
            this.f99612c.f99622h = true;
        }
    }
}
