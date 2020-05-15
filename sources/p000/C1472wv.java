package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p002v7.widget.ActionBarOverlayLayout;

/* renamed from: wv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1472wv extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f27542a;

    public C1472wv(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f27542a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27542a;
        actionBarOverlayLayout.f1144h = null;
        actionBarOverlayLayout.f1141e = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27542a;
        actionBarOverlayLayout.f1144h = null;
        actionBarOverlayLayout.f1141e = false;
    }
}
