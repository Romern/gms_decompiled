package p000;

import android.animation.ValueAnimator;

/* renamed from: ajwq */
public final /* synthetic */ class ajwq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ajwr f71453a;

    public ajwq(ajwr ajwr) {
        this.f71453a = ajwr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ajwr ajwr = this.f71453a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ajwr.f71456c = ((float) ajwr.mo39012a()) * ((floatValue + floatValue) - 4.0f);
        ajwr.invalidateSelf();
    }
}
