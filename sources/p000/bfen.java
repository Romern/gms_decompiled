package p000;

import java.util.List;

/* renamed from: bfen */
final /* synthetic */ class bfen implements Runnable {

    /* renamed from: a */
    private final bfev f113572a;

    /* renamed from: b */
    private final List f113573b;

    /* renamed from: c */
    private final List f113574c;

    /* renamed from: d */
    private final long f113575d;

    public bfen(bfev bfev, List list, List list2, long j) {
        this.f113572a = bfev;
        this.f113573b = list;
        this.f113574c = list2;
        this.f113575d = j;
    }

    public final void run() {
        bfev bfev = this.f113572a;
        bfev.f113606a.mo61597a(this.f113573b, this.f113574c, this.f113575d);
    }
}
