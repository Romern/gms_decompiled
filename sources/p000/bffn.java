package p000;

import android.location.GnssMeasurementsEvent;
import android.os.SystemClock;

/* renamed from: bffn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffn extends GnssMeasurementsEvent.Callback {

    /* renamed from: a */
    final /* synthetic */ bffp f113696a;

    public bffn(bffp bffp) {
        this.f113696a = bffp;
    }

    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        bffp bffp = this.f113696a;
        int i = bffp.f113698f;
        if (bffp.f113701c && !bffp.mo61674i()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bfev bfev = this.f113696a.f113805h;
            bfev.post(new bfeq(bfev, gnssMeasurementsEvent, elapsedRealtime));
            this.f113696a.mo61672a(bfgt.f113827q, elapsedRealtime, null);
        }
    }

    public final void onStatusChanged(int i) {
    }
}
