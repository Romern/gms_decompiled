package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: vj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1433vj implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C1437vn f27372a;

    public C1433vj(C1437vn vnVar) {
        this.f27372a = vnVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f27372a.f27385e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f27372a.f27385e = view.getViewTreeObserver();
            }
            C1437vn vnVar = this.f27372a;
            vnVar.f27385e.removeGlobalOnLayoutListener(vnVar.f27383c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
