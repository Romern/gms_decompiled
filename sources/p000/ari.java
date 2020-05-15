package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: ari */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ari extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2087a;

    public ari(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2087a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2087a.mo2087a(f);
    }
}
