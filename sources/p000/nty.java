package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: nty */
final /* synthetic */ class nty implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final nud f36491a;

    public nty(nud nud) {
        this.f36491a = nud;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        nud nud = this.f36491a;
        if (view == view2) {
            return;
        }
        if (view == nud.mo21589a().getDecorView() || view2 == null) {
            nud.mo21590a(nud.mo21589a().getDecorView());
        }
    }
}
