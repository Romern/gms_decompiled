package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: dnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dnn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dns f13637a;

    public dnn(dns dns) {
        this.f13637a = dns;
    }

    public final void run() {
        RecyclerView recyclerView = this.f13637a.f13642b;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
