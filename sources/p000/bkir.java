package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: bkir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkir extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f124318a;

    /* renamed from: b */
    final /* synthetic */ int f124319b;

    public bkir(View view, int i) {
        this.f124318a = view;
        this.f124319b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f124318a.setVisibility(this.f124319b);
        animator.removeListener(this);
    }
}
