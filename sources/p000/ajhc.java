package p000;

import android.view.ViewTreeObserver;

/* renamed from: ajhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajhc implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ajhd f70612a;

    /* renamed from: b */
    final /* synthetic */ ajhe f70613b;

    public ajhc(ajhe ajhe, ajhd ajhd) {
        this.f70613b = ajhe;
        this.f70612a = ajhd;
    }

    public final boolean onPreDraw() {
        this.f70613b.f70616d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f70612a.mo38630a();
        return true;
    }
}
