package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: gzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gzb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f19273a;

    /* renamed from: b */
    final /* synthetic */ View f19274b;

    /* renamed from: c */
    final /* synthetic */ View f19275c;

    /* renamed from: d */
    final /* synthetic */ gzd f19276d;

    public gzb(gzd gzd, View view, View view2, View view3) {
        this.f19276d = gzd;
        this.f19273a = view;
        this.f19274b = view2;
        this.f19275c = view3;
    }

    public final void onGlobalLayout() {
        boolean z;
        this.f19273a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        gzd gzd = this.f19276d;
        if (this.f19274b.getHeight() != this.f19275c.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        gzd.mo12348a(z);
    }
}
