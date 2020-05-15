package p000;

import android.graphics.Rect;
import android.view.View;

/* renamed from: hw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1063hw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f20476a;

    /* renamed from: b */
    final /* synthetic */ Rect f20477b;

    public C1063hw(View view, Rect rect) {
        this.f20476a = view;
        this.f20477b = rect;
    }

    public final void run() {
        C1078ij ijVar = C1066hz.f20575a;
        View view = this.f20476a;
        if (view != null) {
            C1078ij.m15503a(view, this.f20477b);
        }
    }
}
