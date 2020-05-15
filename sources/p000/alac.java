package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alac extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ alaf f73200a;

    public alac(alaf alaf) {
        this.f73200a = alaf;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f73200a.f73213g.setVisibility(8);
    }
}
