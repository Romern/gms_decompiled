package p000;

import android.view.ViewTreeObserver;

/* renamed from: gxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gxs implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ gxt f19185a;

    public gxs(gxt gxt) {
        this.f19185a = gxt;
    }

    public final void onGlobalLayout() {
        this.f19185a.f19186a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f19185a.f19192g.mo12444a(this.f19185a.f19186a.getBottom());
    }
}
