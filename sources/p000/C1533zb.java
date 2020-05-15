package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: zb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1533zb extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ acm f27699a;

    /* renamed from: b */
    final /* synthetic */ int f27700b;

    /* renamed from: c */
    final /* synthetic */ View f27701c;

    /* renamed from: d */
    final /* synthetic */ int f27702d;

    /* renamed from: e */
    final /* synthetic */ ViewPropertyAnimator f27703e;

    /* renamed from: f */
    final /* synthetic */ C1538zg f27704f;

    public C1533zb(C1538zg zgVar, acm acm, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f27704f = zgVar;
        this.f27699a = acm;
        this.f27700b = i;
        this.f27701c = view;
        this.f27702d = i2;
        this.f27703e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f27700b != 0) {
            this.f27701c.setTranslationX(0.0f);
        }
        if (this.f27702d != 0) {
            this.f27701c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f27703e.setListener(null);
        this.f27704f.mo208e(this.f27699a);
        this.f27704f.f27729e.remove(this.f27699a);
        this.f27704f.mo16613c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
