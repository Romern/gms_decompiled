package p000;

import android.view.animation.Animation;

/* renamed from: soq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class soq implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ sov f44871a;

    /* renamed from: b */
    final /* synthetic */ sox f44872b;

    public soq(sox sox, sov sov) {
        this.f44872b = sox;
        this.f44871a = sov;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f44871a.mo25899a();
        this.f44871a.mo25902b();
        sox sox = this.f44872b;
        sox.f44900c.startAnimation(sox.f44901d);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
