package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: fay */
final /* synthetic */ class fay implements C0038ax {

    /* renamed from: a */
    private final fbh f16183a;

    public fay(fbh fbh) {
        this.f16183a = fbh;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fbh fbh = this.f16183a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout = fbh.f16198f;
        if (swipeRefreshLayout.f1698b != booleanValue) {
            swipeRefreshLayout.mo2090a(booleanValue);
        }
    }
}
