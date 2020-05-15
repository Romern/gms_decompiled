package p000;

import android.animation.ValueAnimator;

/* renamed from: azyh */
final /* synthetic */ class azyh implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C1393tx f100196a;

    public azyh(C1393tx txVar) {
        this.f100196a = txVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f100196a.mo16070a(valueAnimator.getAnimatedFraction());
    }
}
