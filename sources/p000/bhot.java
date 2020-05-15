package p000;

import android.animation.ValueAnimator;

/* renamed from: bhot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhot implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhou f119207a;

    public bhot(bhou bhou) {
        this.f119207a = bhou;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f119207a.f119222m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
