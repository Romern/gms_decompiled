package p000;

import android.widget.AbsListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: acvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvx implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ acwa f60927a;

    public acvx(acwa acwa) {
        this.f60927a = acwa;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (this.f60927a.f60933b.getChildCount() <= 0 || this.f60927a.f60933b.getChildAt(0).getTop() >= 0) {
            z = true;
        } else {
            z = false;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f60927a.f60938g;
        if (i != 0) {
            z2 = false;
        } else if (!z) {
            z2 = false;
        }
        swipeRefreshLayout.setEnabled(z2);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
