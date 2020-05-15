package p000;

import android.animation.ValueAnimator;

/* renamed from: bhds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhds implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ bhlr f118344a;

    public bhds(bhlr bhlr) {
        this.f118344a = bhlr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f118344a.mo63949d(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
