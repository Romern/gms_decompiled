package p000;

import android.view.ViewTreeObserver;

/* renamed from: hhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hhw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ hhx f19814a;

    public hhw(hhx hhx) {
        this.f19814a = hhx;
    }

    public final void onGlobalLayout() {
        this.f19814a.f19815a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f19814a.f19816b.mo12444a(this.f19814a.f19815a.getBottom());
    }
}
