package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: bkbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkbe extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f123913a;

    public bkbe(ViewGroup viewGroup) {
        this.f123913a = viewGroup;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f123913a.setTranslationY(0.0f);
    }
}
