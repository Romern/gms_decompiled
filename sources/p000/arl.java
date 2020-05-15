package p000;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: arl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arl implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2092a;

    public arl(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2092a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f2092a;
        if (!swipeRefreshLayout.f1700d) {
            swipeRefreshLayout.mo2089a((Animation.AnimationListener) null);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
