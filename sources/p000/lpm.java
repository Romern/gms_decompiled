package p000;

import android.util.TypedValue;
import android.view.ViewTreeObserver;

/* renamed from: lpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lpm implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ lpq f26544a;

    public lpm(lpq lpq) {
        this.f26544a = lpq;
    }

    public final void onGlobalLayout() {
        int height = this.f26544a.f26159a.getContainerActivity().getWindow().getDecorView().getHeight() - this.f26544a.f26552i.getHeight();
        if (height > ((int) TypedValue.applyDimension(1, 200.0f, this.f26544a.f26552i.getResources().getDisplayMetrics())) && lpq.f26549g.compareAndSet(-1, height)) {
            lpq lpq = this.f26544a;
            lpq.f26551h.hideSoftInputFromWindow(lpq.f26552i.getWindowToken(), 0);
            this.f26544a.mo15349b(height);
            this.f26544a.f26159a.getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
