package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: azmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azmc extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ azme f99613a;

    public azmc(azme azme) {
        this.f99613a = azme;
    }

    public final void onAnimationEnd(Animator animator) {
        azmg azmg = (azmg) this.f99613a.f99619e.get();
        if (azmg != null) {
            azmg.mo55049q();
        }
    }
}
