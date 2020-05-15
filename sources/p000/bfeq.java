package p000;

import android.location.GnssMeasurementsEvent;

/* renamed from: bfeq */
final /* synthetic */ class bfeq implements Runnable {

    /* renamed from: a */
    private final bfev f113589a;

    /* renamed from: b */
    private final GnssMeasurementsEvent f113590b;

    /* renamed from: c */
    private final long f113591c;

    public bfeq(bfev bfev, GnssMeasurementsEvent gnssMeasurementsEvent, long j) {
        this.f113589a = bfev;
        this.f113590b = gnssMeasurementsEvent;
        this.f113591c = j;
    }

    public final void run() {
        bfev bfev = this.f113589a;
        bfev.f113606a.mo61591a(this.f113590b, this.f113591c);
    }
}
