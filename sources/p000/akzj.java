package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;

/* renamed from: akzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzj implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final ViewTreeObserver.OnScrollChangedListener f73161a = new akzi(this);

    /* renamed from: b */
    final /* synthetic */ OctarineWebviewChimeraActivity f73162b;

    public akzj(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity) {
        this.f73162b = octarineWebviewChimeraActivity;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f73162b.f81402p.getViewTreeObserver().addOnScrollChangedListener(this.f73161a);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f73162b.f81402p.getViewTreeObserver().removeOnScrollChangedListener(this.f73161a);
    }
}
