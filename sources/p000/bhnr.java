package p000;

import android.animation.ValueAnimator;

/* renamed from: bhnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhnr implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f119146a;

    /* renamed from: b */
    final /* synthetic */ int f119147b;

    /* renamed from: c */
    final /* synthetic */ bhnt f119148c;

    public bhnr(bhnt bhnt, int i, int i2) {
        this.f119148c = bhnt;
        this.f119146a = i;
        this.f119147b = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        bhnt bhnt = this.f119148c;
        bhnt.mo64054a(bhdl.m100676a(bhnt.f119158h, this.f119146a, animatedFraction), bhdl.m100676a(this.f119148c.f119159i, this.f119147b, animatedFraction));
    }
}
