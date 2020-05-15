package p000;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* renamed from: axlq */
public final /* synthetic */ class axlq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ImageView f96156a;

    public axlq(ImageView imageView) {
        this.f96156a = imageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f96156a.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
