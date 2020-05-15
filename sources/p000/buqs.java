package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: buqs */
final /* synthetic */ class buqs implements Runnable {

    /* renamed from: a */
    private final buqt f154729a;

    /* renamed from: b */
    private final RecyclerView f154730b;

    /* renamed from: c */
    private final abh f154731c;

    /* renamed from: d */
    private final String f154732d;

    /* renamed from: e */
    private final String f154733e;

    public buqs(buqt buqt, RecyclerView recyclerView, abh abh, String str, String str2) {
        this.f154729a = buqt;
        this.f154730b = recyclerView;
        this.f154731c = abh;
        this.f154732d = str;
        this.f154733e = str2;
    }

    public final void run() {
        buqt buqt = this.f154729a;
        RecyclerView recyclerView = this.f154730b;
        abh abh = this.f154731c;
        String str = this.f154732d;
        String str2 = this.f154733e;
        if (busj.m120383a(recyclerView)) {
            abh.mo174b(buqt);
            buqt.f154738e.mo73083a(recyclerView, str, str2);
        }
    }
}
