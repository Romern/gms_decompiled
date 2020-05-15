package p000;

import android.animation.ValueAnimator;

/* renamed from: ajvj */
final /* synthetic */ class ajvj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ajvl f71354a;

    public ajvj(ajvl ajvl) {
        this.f71354a = ajvl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ajvl ajvl = this.f71354a;
        ajvl.mo38964a(ajvl.f71360e, ajvl.f71361f - ((Integer) valueAnimator.getAnimatedValue()).intValue(), ajvl.f71362g, ajvl.f71363h);
    }
}
