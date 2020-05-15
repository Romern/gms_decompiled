package p000;

import android.animation.ValueAnimator;

/* renamed from: bhof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhof implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhoh f119187a;

    public bhof(bhoh bhoh) {
        this.f119187a = bhoh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f119187a.f119222m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
