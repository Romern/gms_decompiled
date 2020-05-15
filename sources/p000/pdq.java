package p000;

import android.os.SystemClock;

/* renamed from: pdq */
final /* synthetic */ class pdq implements Runnable {

    /* renamed from: a */
    private final pdr f38881a;

    public pdq(pdr pdr) {
        this.f38881a = pdr;
    }

    public final void run() {
        pdz pdz = this.f38881a.f38882a;
        bnsn bnsn = pdz.f38896a;
        if (!pdz.f38935l.getAndSet(true)) {
            pdz.f38912P.mo22596a();
            pdz.f38948y.postDelayed(new pdm(pdz), 5000);
            pdz.f38942s = false;
            pdz.f38941r = SystemClock.elapsedRealtime();
            pdz.mo22947a(bixe.f122174d, 1);
            pdz.mo22948a(dcm.WIFI_PROJECTION_START_REQUESTED);
        }
    }
}
