package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: apxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f85071a;

    /* renamed from: b */
    final /* synthetic */ abp f85072b;

    public apxo(RecyclerView recyclerView, abp abp) {
        this.f85071a = recyclerView;
        this.f85072b = abp;
    }

    public final void run() {
        this.f85071a.setItemAnimator(this.f85072b);
    }
}
