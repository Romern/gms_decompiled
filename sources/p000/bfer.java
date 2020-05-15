package p000;

import android.location.GnssNavigationMessage;

/* renamed from: bfer */
final /* synthetic */ class bfer implements Runnable {

    /* renamed from: a */
    private final bfev f113592a;

    /* renamed from: b */
    private final GnssNavigationMessage f113593b;

    /* renamed from: c */
    private final long f113594c;

    public bfer(bfev bfev, GnssNavigationMessage gnssNavigationMessage, long j) {
        this.f113592a = bfev;
        this.f113593b = gnssNavigationMessage;
        this.f113594c = j;
    }

    public final void run() {
        bfev bfev = this.f113592a;
        bfev.f113606a.mo61592a(this.f113593b, this.f113594c);
    }
}
