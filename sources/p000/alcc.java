package p000;

import android.view.animation.Animation;

/* renamed from: alcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alcc implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ alcd f73387a;

    public alcc(alcd alcd) {
        this.f73387a = alcd;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f73387a.setVisibility(8);
        this.f73387a.setClickable(false);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.f73387a.f73389b = false;
    }
}
