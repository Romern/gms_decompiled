package p000;

import android.animation.ValueAnimator;
import androidx.wear.widget.CircledImageView;

/* renamed from: avz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avz implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CircledImageView f2402a;

    public avz(CircledImageView circledImageView) {
        this.f2402a = circledImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        CircledImageView circledImageView = this.f2402a;
        if (intValue != circledImageView.f1785a) {
            circledImageView.f1785a = intValue;
            circledImageView.invalidate();
        }
    }
}
