package p000;

import java.util.List;

/* renamed from: szh */
final /* synthetic */ class szh implements Runnable {

    /* renamed from: a */
    private final szm f45493a;

    /* renamed from: b */
    private final long f45494b;

    /* renamed from: c */
    private final int f45495c;

    /* renamed from: d */
    private final List f45496d;

    public szh(szm szm, long j, int i, List list) {
        this.f45493a = szm;
        this.f45494b = j;
        this.f45495c = i;
        this.f45496d = list;
    }

    public final void run() {
        this.f45493a.mo26274a(this.f45494b, this.f45495c, this.f45496d);
    }
}
