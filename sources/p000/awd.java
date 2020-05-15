package p000;

import android.animation.Animator;

/* renamed from: awd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awd implements Animator.AnimatorListener {

    /* renamed from: a */
    private boolean f2417a;

    /* renamed from: a */
    public void mo2745a() {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2417a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f2417a) {
            mo2745a();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f2417a = false;
    }
}
