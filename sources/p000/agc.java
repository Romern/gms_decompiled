package p000;

import android.support.wearable.view.drawer.PageIndicatorView;

/* renamed from: agc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agc extends agb {

    /* renamed from: a */
    final /* synthetic */ PageIndicatorView f500a;

    public agc(PageIndicatorView pageIndicatorView) {
        this.f500a = pageIndicatorView;
    }

    /* renamed from: a */
    public final void mo644a() {
        PageIndicatorView pageIndicatorView = this.f500a;
        pageIndicatorView.f1442c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay((long) this.f500a.f1440a).setDuration((long) this.f500a.f1441b).start();
    }
}
