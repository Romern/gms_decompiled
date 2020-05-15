package p000;

import androidx.wear.widget.drawer.PageIndicatorView;

/* renamed from: awl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awl extends awd {

    /* renamed from: a */
    final /* synthetic */ PageIndicatorView f2442a;

    public awl(PageIndicatorView pageIndicatorView) {
        this.f2442a = pageIndicatorView;
    }

    /* renamed from: a */
    public final void mo2745a() {
        PageIndicatorView pageIndicatorView = this.f2442a;
        pageIndicatorView.f1818c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay((long) this.f2442a.f1816a).setDuration((long) this.f2442a.f1817b).start();
    }
}
