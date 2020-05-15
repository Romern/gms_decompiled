package p000;

import android.support.p001v4.widget.NestedScrollView;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: lpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lpp extends bhfj {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f26547a;

    /* renamed from: b */
    final /* synthetic */ lpq f26548b;

    public lpp(lpq lpq, RecyclerView recyclerView) {
        this.f26548b = lpq;
        this.f26547a = recyclerView;
    }

    /* renamed from: a */
    public final void mo12434a(int i) {
        if (i == 1) {
            NestedScrollView nestedScrollView = (NestedScrollView) this.f26547a.getParent();
            if (nestedScrollView.canScrollVertically(-1) || nestedScrollView.canScrollVertically(1)) {
                this.f26548b.f26553j.postDelayed(new lpo(this), 50);
            }
        } else if (i == 4 || i == 6) {
            this.f26548b.mo15350c(lpq.f26549g.get());
        }
    }

    /* renamed from: a */
    public final void mo12435a(View view, float f) {
        if (f <= -0.05f) {
            this.f26548b.f26553j.cancelPendingInputEvents();
            this.f26548b.mo15350c(lpq.f26549g.get());
        }
    }
}
