package p000;

import android.view.ViewTreeObserver;

/* renamed from: ntw */
final /* synthetic */ class ntw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final nud f36489a;

    public ntw(nud nud) {
        this.f36489a = nud;
    }

    public final void onGlobalLayout() {
        nud nud = this.f36489a;
        nud.mo21590a(nud.mo21589a().getDecorView());
    }
}
