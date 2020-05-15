package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: abb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f97a;

    public abb(RecyclerView recyclerView) {
        this.f97a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f97a;
        if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.f97a;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }
}
