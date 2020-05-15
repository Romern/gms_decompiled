package p000;

import android.view.animation.Animation;

/* renamed from: fbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbl implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ fbq f16205a;

    public fbl(fbq fbq) {
        this.f16205a = fbq;
    }

    public final void onAnimationEnd(Animation animation) {
        ffe ffe = this.f16205a.f16216c.f16220c;
        ffe.f16444d.mo2450b(ffd.LOADING_SPINNER);
        ffe.f16444d.mo2667a(ffe.f16442b.f16324b, new ffc(ffe));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
