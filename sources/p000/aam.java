package p000;

import android.widget.AbsListView;

/* renamed from: aam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aam implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ aap f53a;

    public aam(aap aap) {
        this.f53a = aap;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f53a.mo111j() && this.f53a.f72q.getContentView() != null) {
            aap aap = this.f53a;
            aap.f70o.removeCallbacks(aap.f69n);
            this.f53a.f69n.run();
        }
    }
}
