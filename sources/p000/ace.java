package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: ace */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ace extends abj {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f153a;

    public ace(RecyclerView recyclerView) {
        this.f153a = recyclerView;
    }

    /* renamed from: a */
    public final void mo188a() {
        this.f153a.assertNotInLayoutOrScroll(null);
        RecyclerView recyclerView = this.f153a;
        recyclerView.mState.f182f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (!this.f153a.mAdapterHelper.mo16490d()) {
            this.f153a.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo291b() {
        if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
            RecyclerView recyclerView = this.f153a;
            if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                C1280ps.m19891a(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                return;
            }
        }
        RecyclerView recyclerView2 = this.f153a;
        recyclerView2.mAdapterUpdateDuringMeasure = true;
        recyclerView2.requestLayout();
    }

    /* renamed from: c */
    public final void mo192c(int i, int i2) {
        this.f153a.assertNotInLayoutOrScroll(null);
        C1491xn xnVar = this.f153a.mAdapterHelper;
        if (i2 > 0) {
            xnVar.f27591a.add(xnVar.mo16481a(2, i, i2, null));
            xnVar.f27594d |= 2;
            if (xnVar.f27591a.size() == 1) {
                mo291b();
            }
        }
    }

    /* renamed from: d */
    public final void mo193d(int i, int i2) {
        this.f153a.assertNotInLayoutOrScroll(null);
        C1491xn xnVar = this.f153a.mAdapterHelper;
        if (i != i2) {
            xnVar.f27591a.add(xnVar.mo16481a(8, i, i2, null));
            xnVar.f27594d |= 8;
            if (xnVar.f27591a.size() == 1) {
                mo291b();
            }
        }
    }

    /* renamed from: a */
    public final void mo190a(int i, int i2, Object obj) {
        this.f153a.assertNotInLayoutOrScroll(null);
        C1491xn xnVar = this.f153a.mAdapterHelper;
        if (i2 > 0) {
            xnVar.f27591a.add(xnVar.mo16481a(4, i, i2, obj));
            xnVar.f27594d |= 4;
            if (xnVar.f27591a.size() == 1) {
                mo291b();
            }
        }
    }

    /* renamed from: b */
    public final void mo191b(int i, int i2) {
        this.f153a.assertNotInLayoutOrScroll(null);
        C1491xn xnVar = this.f153a.mAdapterHelper;
        if (i2 > 0) {
            xnVar.f27591a.add(xnVar.mo16481a(1, i, i2, null));
            xnVar.f27594d |= 1;
            if (xnVar.f27591a.size() == 1) {
                mo291b();
            }
        }
    }
}
