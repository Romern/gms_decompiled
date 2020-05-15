package p000;

import android.animation.ValueAnimator;
import android.support.wearable.view.CircledImageView;

/* renamed from: afu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afu implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CircledImageView f471a;

    public afu(CircledImageView circledImageView) {
        this.f471a = circledImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        CircledImageView circledImageView = this.f471a;
        if (intValue != circledImageView.f1419b) {
            circledImageView.f1419b = intValue;
            circledImageView.invalidate();
        }
    }
}
