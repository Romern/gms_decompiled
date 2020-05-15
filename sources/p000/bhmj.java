package p000;

import android.animation.ValueAnimator;

/* renamed from: bhmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhnd f119080a;

    public bhmj(bhnd bhnd) {
        this.f119080a = bhnd;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f119080a.f119110e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
