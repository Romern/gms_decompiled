package p000;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.gms.walletp2p.feature.widgets.pagerlayout.PagerLayout;

/* renamed from: axlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axlp implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f96154a;

    /* renamed from: b */
    final /* synthetic */ PagerLayout f96155b;

    public axlp(PagerLayout pagerLayout, View view) {
        this.f96155b = pagerLayout;
        this.f96154a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f96155b.f110756d = false;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.f96154a.setVisibility(0);
    }
}
