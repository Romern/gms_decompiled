package p000;

import android.view.animation.Animation;

/* renamed from: sos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sos implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ sov f44875a;

    /* renamed from: b */
    final /* synthetic */ sox f44876b;

    public sos(sox sox, sov sov) {
        this.f44876b = sox;
        this.f44875a = sov;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
        this.f44875a.mo25902b();
        this.f44875a.mo25899a();
        sov sov = this.f44875a;
        sov.mo25900a(sov.f44881d);
        sox sox = this.f44876b;
        sox.f44902e = (sox.f44902e + 1.0f) % 5.0f;
    }

    public final void onAnimationStart(Animation animation) {
        this.f44876b.f44902e = 0.0f;
    }
}
