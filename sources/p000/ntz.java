package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ntz */
final /* synthetic */ class ntz implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final nud f36492a;

    public ntz(nud nud) {
        this.f36492a = nud;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        nud nud = this.f36492a;
        if (view != view2) {
            nqr nqr = nud.f36503g;
            if (view2 != null && ((nqq) nqr.f36427a.peek()) != null) {
                throw null;
            }
        }
    }
}
