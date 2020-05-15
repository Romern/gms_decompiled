package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: wn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1464wn implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C1465wo f27506a;

    public C1464wn(C1465wo woVar) {
        this.f27506a = woVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f27506a.f27510d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f27506a.f27510d = view.getViewTreeObserver();
            }
            C1465wo woVar = this.f27506a;
            woVar.f27510d.removeGlobalOnLayoutListener(woVar.f27508b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
