package p000;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: arh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arh implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2086a;

    public arh(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2086a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        arp arp;
        SwipeRefreshLayout swipeRefreshLayout = this.f2086a;
        if (swipeRefreshLayout.f1698b) {
            swipeRefreshLayout.f1706j.setAlpha(255);
            this.f2086a.f1706j.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.f2086a;
            if (swipeRefreshLayout2.f1707k && (arp = swipeRefreshLayout2.f1697a) != null) {
                arp.mo2355a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.f2086a;
            swipeRefreshLayout3.f1699c = swipeRefreshLayout3.f1701e.getTop();
            return;
        }
        swipeRefreshLayout.mo2086a();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
