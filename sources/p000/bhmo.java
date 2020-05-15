package p000;

import android.animation.ValueAnimator;

/* renamed from: bhmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmo implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhnd f119086a;

    public bhmo(bhnd bhnd) {
        this.f119086a = bhnd;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String str = bhnd.f119106b;
        this.f119086a.f119110e.setTranslationY((float) intValue);
    }
}
