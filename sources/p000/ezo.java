package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: ezo */
final /* synthetic */ class ezo implements C0038ax {

    /* renamed from: a */
    private final ezr f16114a;

    public ezo(ezr ezr) {
        this.f16114a = ezr;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ezr ezr = this.f16114a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout = ezr.f16119b;
        if (swipeRefreshLayout.f1698b != booleanValue) {
            swipeRefreshLayout.mo2090a(booleanValue);
        }
    }
}
