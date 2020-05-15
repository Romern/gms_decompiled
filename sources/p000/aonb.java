package p000;

import android.animation.Animator;

/* renamed from: aonb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aonb implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ aonc f78562a;

    public aonb(aonc aonc) {
        this.f78562a = aonc;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f78562a.f78564a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f78562a.f78564a) {
            animator.start();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
