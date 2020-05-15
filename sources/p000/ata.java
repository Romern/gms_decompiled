package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ata */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ata extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ atf f2160a;

    public ata(atf atf) {
        this.f2160a = atf;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2160a.mo2481f();
        animator.removeListener(this);
    }
}
