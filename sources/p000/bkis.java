package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: bkis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkis extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f124320a;

    public bkis(View view) {
        this.f124320a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f124320a.setAlpha(1.0f);
        this.f124320a.setTranslationY(0.0f);
        animator.removeListener(this);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f124320a.setAlpha(1.0f);
        this.f124320a.setTranslationY(0.0f);
        animator.removeListener(this);
    }
}
