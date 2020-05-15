package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: ark */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ark extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f2089a;

    /* renamed from: b */
    final /* synthetic */ int f2090b;

    /* renamed from: c */
    final /* synthetic */ SwipeRefreshLayout f2091c;

    public ark(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f2091c = swipeRefreshLayout;
        this.f2089a = i;
        this.f2090b = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        arg arg = this.f2091c.f1706j;
        int i = this.f2089a;
        arg.setAlpha((int) (((float) i) + (((float) (this.f2090b - i)) * f)));
    }
}
