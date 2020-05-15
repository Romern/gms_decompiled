package p000;

import android.animation.ValueAnimator;

/* renamed from: bhmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmk implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhnd f119081a;

    public bhmk(bhnd bhnd) {
        this.f119081a = bhnd;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f119081a.f119110e.setScaleX(floatValue);
        this.f119081a.f119110e.setScaleY(floatValue);
    }
}
