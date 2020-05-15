package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: arn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arn extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f2094a;

    public arn(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2094a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2094a.mo2093b(f);
    }
}
