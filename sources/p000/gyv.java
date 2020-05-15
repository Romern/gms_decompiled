package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: gyv */
final /* synthetic */ class gyv implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final gzd f19264a;

    /* renamed from: b */
    private final View f19265b;

    /* renamed from: c */
    private final View f19266c;

    public gyv(gzd gzd, View view, View view2) {
        this.f19264a = gzd;
        this.f19265b = view;
        this.f19266c = view2;
    }

    public final void onScrollChanged() {
        gzd gzd = this.f19264a;
        View view = this.f19265b;
        View view2 = this.f19266c;
        gzd.mo12348a(view.getBottom() - (view2.getHeight() + view2.getScrollY()) != 0);
    }
}
