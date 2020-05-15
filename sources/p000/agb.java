package p000;

import android.animation.Animator;

/* renamed from: agb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agb implements Animator.AnimatorListener {

    /* renamed from: a */
    private boolean f499a;

    /* renamed from: a */
    public void mo644a() {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f499a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f499a) {
            mo644a();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f499a = false;
    }
}
