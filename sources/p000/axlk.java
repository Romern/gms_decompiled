package p000;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.gms.walletp2p.feature.widgets.pagerlayout.PagerLayout;

/* renamed from: axlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axlk implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f96143a;

    /* renamed from: b */
    final /* synthetic */ PagerLayout f96144b;

    public axlk(PagerLayout pagerLayout, View view) {
        this.f96144b = pagerLayout;
        this.f96143a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f96144b.f110756d = false;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.f96143a.setVisibility(0);
    }
}
