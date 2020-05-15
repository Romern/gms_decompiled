package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: fbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbp extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ fbq f16213a;

    public fbp(fbq fbq) {
        this.f16213a = fbq;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16213a.f16215b.setListener(null);
        this.f16213a.f16216c.f16220c.mo10770b();
    }
}
