package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: aro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aro extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2095a;

    public aro(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2095a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f2095a;
        float f2 = swipeRefreshLayout.f1703g;
        swipeRefreshLayout.mo2087a(f2 + ((-f2) * f));
        this.f2095a.mo2093b(f);
    }
}
