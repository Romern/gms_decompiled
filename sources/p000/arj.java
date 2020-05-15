package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: arj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arj extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2088a;

    public arj(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2088a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2088a.mo2087a(1.0f - f);
    }
}
