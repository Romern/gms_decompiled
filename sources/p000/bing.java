package p000;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: bing */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bing implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f120994a;

    /* renamed from: b */
    final /* synthetic */ int f120995b;

    public bing(View view, int i) {
        this.f120994a = view;
        this.f120995b = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f120994a.setVisibility(this.f120995b);
        this.f120994a.clearAnimation();
        this.f120994a.setTag(null);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.f120994a.setVisibility(0);
    }
}
