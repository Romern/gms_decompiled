package p000;

import android.util.Log;

/* renamed from: vre */
final /* synthetic */ class vre implements Runnable {

    /* renamed from: a */
    private final vrh f49839a;

    public vre(vrh vrh) {
        this.f49839a = vrh;
    }

    public final void run() {
        vrh vrh = this.f49839a;
        Log.i("CAR.DRIVINGMODE", "Pocket detection timeout. Stopping...");
        vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_POCKET_TIMEOUT);
        vrh.mo28763a();
    }
}
