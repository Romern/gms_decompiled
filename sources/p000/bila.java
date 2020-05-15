package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: bila */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bila extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f120808a;

    /* renamed from: b */
    final /* synthetic */ acm f120809b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f120810c;

    /* renamed from: d */
    final /* synthetic */ bilb f120811d;

    public bila(bilb bilb, View view, acm acm, ViewPropertyAnimator viewPropertyAnimator) {
        this.f120811d = bilb;
        this.f120808a = view;
        this.f120809b = acm;
        this.f120810c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        bilb.m102505a(this.f120808a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f120810c.setListener(null);
        this.f120811d.mo208e(this.f120809b);
        this.f120811d.f120814k.remove(this.f120809b);
        this.f120811d.mo64726g();
        this.f120810c.setStartDelay(0);
    }

    public final void onAnimationStart(Animator animator) {
        this.f120808a.setAlpha(0.0f);
    }
}
