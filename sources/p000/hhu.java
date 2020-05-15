package p000;

import android.view.ViewTreeObserver;

/* renamed from: hhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hhu implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ hhv f19802a;

    public hhu(hhv hhv) {
        this.f19802a = hhv;
    }

    public final void onGlobalLayout() {
        this.f19802a.f19805c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f19802a.f19804b.mo12444a(this.f19802a.f19805c.getBottom());
    }
}
