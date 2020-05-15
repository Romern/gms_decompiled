package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: zc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1534zc extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1536ze f27705a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f27706b;

    /* renamed from: c */
    final /* synthetic */ View f27707c;

    /* renamed from: d */
    final /* synthetic */ C1538zg f27708d;

    public C1534zc(C1538zg zgVar, C1536ze zeVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27708d = zgVar;
        this.f27705a = zeVar;
        this.f27706b = viewPropertyAnimator;
        this.f27707c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f27706b.setListener(null);
        this.f27707c.setAlpha(1.0f);
        this.f27707c.setTranslationX(0.0f);
        this.f27707c.setTranslationY(0.0f);
        this.f27708d.mo208e(this.f27705a.f27713a);
        this.f27708d.f27731g.remove(this.f27705a.f27713a);
        this.f27708d.mo16613c();
    }

    public final void onAnimationStart(Animator animator) {
        acm acm = this.f27705a.f27713a;
    }
}
