package p000;

import android.widget.AbsListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: acuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acuz implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ acve f60854a;

    public acuz(acve acve) {
        this.f60854a = acve;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (this.f60854a.f60868b.getChildCount() <= 0 || this.f60854a.f60868b.getChildAt(0).getTop() >= 0) {
            z = true;
        } else {
            z = false;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f60854a.f60874h;
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
