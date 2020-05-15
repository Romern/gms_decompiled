package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: buqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqt extends abj {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f154734a;

    /* renamed from: b */
    final /* synthetic */ abh f154735b;

    /* renamed from: c */
    final /* synthetic */ String f154736c;

    /* renamed from: d */
    final /* synthetic */ String f154737d;

    /* renamed from: e */
    final /* synthetic */ busj f154738e;

    public buqt(busj busj, RecyclerView recyclerView, abh abh, String str, String str2) {
        this.f154738e = busj;
        this.f154734a = recyclerView;
        this.f154735b = abh;
        this.f154736c = str;
        this.f154737d = str2;
    }

    /* renamed from: a */
    public final void mo188a() {
        this.f154738e.f154813a.post(new buqs(this, this.f154734a, this.f154735b, this.f154736c, this.f154737d));
    }
}
