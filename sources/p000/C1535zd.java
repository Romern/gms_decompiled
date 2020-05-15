package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: zd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1535zd extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1536ze f27709a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f27710b;

    /* renamed from: c */
    final /* synthetic */ View f27711c;

    /* renamed from: d */
    final /* synthetic */ C1538zg f27712d;

    public C1535zd(C1538zg zgVar, C1536ze zeVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27712d = zgVar;
        this.f27709a = zeVar;
        this.f27710b = viewPropertyAnimator;
        this.f27711c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f27710b.setListener(null);
        this.f27711c.setAlpha(1.0f);
        this.f27711c.setTranslationX(0.0f);
        this.f27711c.setTranslationY(0.0f);
        this.f27712d.mo208e(this.f27709a.f27714b);
        this.f27712d.f27731g.remove(this.f27709a.f27714b);
        this.f27712d.mo16613c();
    }

    public final void onAnimationStart(Animator animator) {
        acm acm = this.f27709a.f27714b;
    }
}
