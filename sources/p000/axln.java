package p000;

import android.animation.Animator;
import android.view.View;
import com.google.android.gms.walletp2p.feature.widgets.pagerlayout.PagerLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axln implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ View f96149a;

    /* renamed from: b */
    final /* synthetic */ View f96150b;

    /* renamed from: c */
    final /* synthetic */ PagerLayout f96151c;

    public axln(PagerLayout pagerLayout, View view, View view2) {
        this.f96151c = pagerLayout;
        this.f96149a = view;
        this.f96150b = view2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f96149a.setAlpha(1.0f);
        this.f96149a.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        this.f96151c.f110756d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f96149a.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        this.f96151c.f110756d = false;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f96149a.setAlpha(0.0f);
        this.f96149a.setVisibility(0);
        this.f96150b.setVisibility(8);
    }
}
