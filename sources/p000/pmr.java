package p000;

import android.os.SystemClock;

/* renamed from: pmr */
final /* synthetic */ class pmr implements Runnable {

    /* renamed from: a */
    private final pmt f39734a;

    /* renamed from: b */
    private final int f39735b;

    public pmr(pmt pmt, int i) {
        this.f39734a = pmt;
        this.f39735b = i;
    }

    public final void run() {
        pmt pmt = this.f39734a;
        int i = this.f39735b;
        pmt.f39740b = SystemClock.elapsedRealtime();
        pia g = pmt.f39643h.mo23143g();
        if (g != null) {
            g.mo23148a(i);
        }
    }
}
