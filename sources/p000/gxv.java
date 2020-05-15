package p000;

import android.view.ViewTreeObserver;

/* renamed from: gxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gxv implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ gxw f19198a;

    public gxv(gxw gxw) {
        this.f19198a = gxw;
    }

    public final void onGlobalLayout() {
        this.f19198a.f19199a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f19198a.f19200b.mo12444a(this.f19198a.f19199a.getBottom());
    }
}
