package p000;

import android.animation.ValueAnimator;

/* renamed from: zp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1547zp implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1548zq f27759a;

    public C1547zp(C1548zq zqVar) {
        this.f27759a = zqVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f27759a.f27768b.setAlpha(floatValue);
        this.f27759a.f27769c.setAlpha(floatValue);
        this.f27759a.mo16631a();
    }
}
