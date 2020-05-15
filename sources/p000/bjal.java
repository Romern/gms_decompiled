package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;

/* renamed from: bjal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjal implements bjar {

    /* renamed from: a */
    public final bjas f122429a;

    /* renamed from: b */
    private final RecyclerView f122430b;

    public bjal(bjas bjas, RecyclerView recyclerView) {
        this.f122429a = bjas;
        this.f122430b = recyclerView;
    }

    /* renamed from: a */
    public final void mo64943a() {
        RecyclerView recyclerView = this.f122430b;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new bjak(this));
            if (mo64957c()) {
                this.f122429a.mo64963a(true);
                return;
            }
            return;
        }
        Log.w("RVRequireScrollMixin", "Cannot require scroll. Recycler view is null.");
    }

    /* renamed from: b */
    public final void mo64944b() {
        RecyclerView recyclerView = this.f122430b;
        if (recyclerView != null) {
            this.f122430b.smoothScrollBy(0, recyclerView.getHeight());
        }
    }

    /* renamed from: c */
    public final boolean mo64957c() {
        RecyclerView recyclerView = this.f122430b;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = this.f122430b.computeVerticalScrollRange() - this.f122430b.computeVerticalScrollExtent();
            if (computeVerticalScrollRange == 0 || computeVerticalScrollOffset >= computeVerticalScrollRange - 1) {
                return false;
            }
            return true;
        }
        return false;
    }
}
