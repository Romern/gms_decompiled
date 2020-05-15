package p000;

import android.view.ViewTreeObserver;

/* renamed from: gyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gyk implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ gyl f19228a;

    public gyk(gyl gyl) {
        this.f19228a = gyl;
    }

    public final void onGlobalLayout() {
        this.f19228a.f19239k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f19228a.f19229a.mo12444a(this.f19228a.f19239k.getBottom() + this.f19228a.f19231c.getBottom());
    }
}
