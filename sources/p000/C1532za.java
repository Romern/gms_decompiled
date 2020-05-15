package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: za */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1532za extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ acm f27695a;

    /* renamed from: b */
    final /* synthetic */ View f27696b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f27697c;

    /* renamed from: d */
    final /* synthetic */ C1538zg f27698d;

    public C1532za(C1538zg zgVar, acm acm, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f27698d = zgVar;
        this.f27695a = acm;
        this.f27696b = view;
        this.f27697c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f27696b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f27697c.setListener(null);
        this.f27698d.mo208e(this.f27695a);
        this.f27698d.f27728d.remove(this.f27695a);
        this.f27698d.mo16613c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
