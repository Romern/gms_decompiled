package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: abc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f98a;

    public abc(RecyclerView recyclerView) {
        this.f98a = recyclerView;
    }

    public final void run() {
        abp abp = this.f98a.mItemAnimator;
        if (abp != null) {
            abp.mo198a();
        }
        this.f98a.mPostedAnimatorRunner = false;
    }
}
