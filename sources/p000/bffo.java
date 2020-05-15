package p000;

import android.location.GnssNavigationMessage;
import android.os.SystemClock;

/* renamed from: bffo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffo extends GnssNavigationMessage.Callback {

    /* renamed from: a */
    final /* synthetic */ bffp f113697a;

    public bffo(bffp bffp) {
        this.f113697a = bffp;
    }

    public final void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
        bffp bffp = this.f113697a;
        int i = bffp.f113698f;
        if (bffp.f113702d && !bffp.mo61674i()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bfev bfev = this.f113697a.f113805h;
            bfev.post(new bfer(bfev, gnssNavigationMessage, elapsedRealtime));
            this.f113697a.mo61672a(bfgt.f113828r, elapsedRealtime, null);
        }
    }

    public final void onStatusChanged(int i) {
    }
}
