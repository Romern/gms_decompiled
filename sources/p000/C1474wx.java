package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;

/* renamed from: wx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1474wx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f27544a;

    public C1474wx(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f27544a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f27544a.mo1263c();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27544a;
        actionBarOverlayLayout.f1144h = actionBarOverlayLayout.f1138b.animate().translationY((float) (-this.f27544a.f1138b.getHeight())).setListener(this.f27544a.f1145i);
    }
}
