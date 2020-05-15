package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;

/* renamed from: ww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1473ww implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f27543a;

    public C1473ww(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f27543a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f27543a.mo1263c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27543a;
        actionBarOverlayLayout.f1144h = actionBarOverlayLayout.f1138b.animate().translationY(0.0f).setListener(this.f27543a.f1145i);
    }
}
