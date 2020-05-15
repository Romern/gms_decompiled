package p000;

import android.animation.ValueAnimator;

/* renamed from: azyi */
final /* synthetic */ class azyi implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final azxf f100197a;

    public azyi(azxf azxf) {
        this.f100197a = azxf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f100197a.mo55356a(valueAnimator.getAnimatedFraction());
    }
}
