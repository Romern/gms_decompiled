package p000;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

/* renamed from: ajrv */
public final /* synthetic */ class ajrv implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final TextView f71206a;

    /* renamed from: b */
    private final float f71207b;

    /* renamed from: c */
    private final DecelerateInterpolator f71208c;

    public ajrv(TextView textView, float f, DecelerateInterpolator decelerateInterpolator) {
        this.f71206a = textView;
        this.f71207b = f;
        this.f71208c = decelerateInterpolator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.f71206a;
        float f = this.f71207b;
        textView.setTranslationX(f - (this.f71208c.getInterpolation(valueAnimator.getAnimatedFraction()) * f));
    }
}
