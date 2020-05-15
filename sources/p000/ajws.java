package p000;

import android.animation.ValueAnimator;

/* renamed from: ajws */
public final /* synthetic */ class ajws implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ajwt f71458a;

    public ajws(ajwt ajwt) {
        this.f71458a = ajwt;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ajwt ajwt = this.f71458a;
        ajwt.onLevelChange(((Integer) valueAnimator.getAnimatedValue()).intValue());
        ajwt.invalidateSelf();
    }
}
