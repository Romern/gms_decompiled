package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: wm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1463wm implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C1465wo f27505a;

    public C1463wm(C1465wo woVar) {
        this.f27505a = woVar;
    }

    public final void onGlobalLayout() {
        if (this.f27505a.mo107e()) {
            C1465wo woVar = this.f27505a;
            if (!woVar.f27507a.f71p) {
                View view = woVar.f27509c;
                if (view != null && view.isShown()) {
                    this.f27505a.f27507a.mo101aI();
                } else {
                    this.f27505a.mo105d();
                }
            }
        }
    }
}
