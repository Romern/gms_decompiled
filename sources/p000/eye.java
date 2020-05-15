package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: eye */
final /* synthetic */ class eye implements C0038ax {

    /* renamed from: a */
    private final eyl f16025a;

    public eye(eyl eyl) {
        this.f16025a = eyl;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        eyl eyl = this.f16025a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout = eyl.f16033b;
        if (swipeRefreshLayout.f1698b != booleanValue) {
            swipeRefreshLayout.mo2090a(booleanValue);
        }
    }
}
