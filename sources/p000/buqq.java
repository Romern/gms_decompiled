package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;

/* renamed from: buqq */
public final /* synthetic */ class buqq implements Runnable {

    /* renamed from: a */
    private final RecyclerView f154719a;

    /* renamed from: b */
    private final String f154720b;

    /* renamed from: c */
    private final String f154721c;

    /* renamed from: d */
    private final abh f154722d;

    /* renamed from: e */
    private final busj f154723e;

    public buqq(busj busj, RecyclerView recyclerView, String str, String str2, abh abh) {
        this.f154723e = busj;
        this.f154719a = recyclerView;
        this.f154720b = str;
        this.f154721c = str2;
        this.f154722d = abh;
    }

    public final void run() {
        busj busj = this.f154723e;
        RecyclerView recyclerView = this.f154719a;
        String str = this.f154720b;
        String str2 = this.f154721c;
        abh abh = this.f154722d;
        if (busj.m120383a(recyclerView)) {
            busj.mo73083a(recyclerView, str, str2);
            return;
        }
        Log.w("AutoTestUiInjector", "ListView content is not ready, wait...");
        abh.mo166a(new buqt(busj, recyclerView, abh, str, str2));
    }
}
