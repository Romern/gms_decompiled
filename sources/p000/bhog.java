package p000;

import android.animation.ValueAnimator;

/* renamed from: bhog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhog implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhoh f119188a;

    public bhog(bhoh bhoh) {
        this.f119188a = bhoh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f119188a.f119222m.setScaleX(floatValue);
        this.f119188a.f119222m.setScaleY(floatValue);
    }
}
