package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: hd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1044hd extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f19486a;

    /* renamed from: b */
    final /* synthetic */ View f19487b;

    /* renamed from: c */
    final /* synthetic */ C1018gh f19488c;

    public C1044hd(ViewGroup viewGroup, View view, C1018gh ghVar) {
        this.f19486a = viewGroup;
        this.f19487b = view;
        this.f19488c = ghVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f19486a.endViewTransition(this.f19487b);
        animator.removeListener(this);
        C1018gh ghVar = this.f19488c;
        View view = ghVar.f18174K;
        if (view != null && ghVar.f18166C) {
            view.setVisibility(8);
        }
    }
}
