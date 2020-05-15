package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alad extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f73201a;

    /* renamed from: b */
    final /* synthetic */ alaf f73202b;

    public alad(alaf alaf, int i) {
        this.f73202b = alaf;
        this.f73201a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f73202b.f73209c.setTranslationY(0.0f);
        this.f73202b.mo40044b(this.f73201a);
    }

    public final void onAnimationStart(Animator animator) {
        this.f73202b.f73213g.setVisibility(0);
    }
}
