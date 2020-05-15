package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: yj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1514yj implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f27648a;

    /* renamed from: b */
    final /* synthetic */ C1515yk f27649b;

    public C1514yj(C1515yk ykVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f27649b = ykVar;
        this.f27648a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f27649b.f27653d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f27648a);
        }
    }
}
