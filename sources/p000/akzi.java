package p000;

import android.view.ViewTreeObserver;

/* renamed from: akzi */
final /* synthetic */ class akzi implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final akzj f73160a;

    public akzi(akzj akzj) {
        this.f73160a = akzj;
    }

    public final void onScrollChanged() {
        akzj akzj = this.f73160a;
        akzj.f73162b.f81400n.setEnabled(akzj.f73162b.f81402p.getScrollY() == 0);
    }
}
