package p000;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.gms.walletp2p.feature.widgets.pagerlayout.PagerLayout;

/* renamed from: axlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axlm implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f96147a;

    /* renamed from: b */
    final /* synthetic */ PagerLayout f96148b;

    public axlm(PagerLayout pagerLayout, View view) {
        this.f96148b = pagerLayout;
        this.f96147a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f96148b.f110756d = false;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.f96147a.setVisibility(0);
    }
}
