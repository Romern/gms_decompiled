package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: arm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arm extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2093a;

    public arm(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2093a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        SwipeRefreshLayout swipeRefreshLayout = this.f2093a;
        if (!swipeRefreshLayout.f1708l) {
            i = swipeRefreshLayout.f1705i - Math.abs(swipeRefreshLayout.f1704h);
        } else {
            i = swipeRefreshLayout.f1705i;
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f2093a;
        int i2 = swipeRefreshLayout2.f1702f;
        this.f2093a.mo2094b((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f1701e.getTop());
        this.f2093a.f1706j.mo2333b(1.0f - f);
    }
}
