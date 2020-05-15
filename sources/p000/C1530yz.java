package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: yz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1530yz extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ acm f27691a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f27692b;

    /* renamed from: c */
    final /* synthetic */ View f27693c;

    /* renamed from: d */
    final /* synthetic */ C1538zg f27694d;

    public C1530yz(C1538zg zgVar, acm acm, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27694d = zgVar;
        this.f27691a = acm;
        this.f27692b = viewPropertyAnimator;
        this.f27693c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f27692b.setListener(null);
        this.f27693c.setAlpha(1.0f);
        this.f27694d.mo208e(this.f27691a);
        this.f27694d.f27730f.remove(this.f27691a);
        this.f27694d.mo16613c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
