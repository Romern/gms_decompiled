package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: ajru */
public final /* synthetic */ class ajru implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final View f71202a;

    /* renamed from: b */
    private final float f71203b;

    /* renamed from: c */
    private final DecelerateInterpolator f71204c;

    /* renamed from: d */
    private final View f71205d;

    public ajru(View view, float f, DecelerateInterpolator decelerateInterpolator, View view2) {
        this.f71202a = view;
        this.f71203b = f;
        this.f71204c = decelerateInterpolator;
        this.f71205d = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f71202a;
        float f = this.f71203b;
        DecelerateInterpolator decelerateInterpolator = this.f71204c;
        View view2 = this.f71205d;
        view.setTranslationX(f - (decelerateInterpolator.getInterpolation(valueAnimator.getAnimatedFraction()) * f));
        view2.setScaleX(view.getScaleX());
        view2.setScaleY(view.getScaleY());
        view2.setTranslationX(view.getTranslationX());
        view2.setTranslationY(view.getTranslationY());
    }
}
