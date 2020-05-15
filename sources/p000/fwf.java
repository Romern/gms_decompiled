package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: fwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwf extends abz {

    /* renamed from: a */
    final /* synthetic */ fwo f17434a;

    public fwf(fwo fwo) {
        this.f17434a = fwo;
    }

    /* renamed from: a */
    public final void mo270a(RecyclerView recyclerView, int i) {
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        fys fys;
        if (i2 > 0 && (fys = this.f17434a.f17480s.f17661d) != null && fys.getVisibility() == 0 && recyclerView.getScrollState() == 1) {
            this.f17434a.mo11432a(false);
        }
    }
}
