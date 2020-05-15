package p000;

import android.os.SystemClock;

/* renamed from: npv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class npv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ npx f36354a;

    public npv(npx npx) {
        this.f36354a = npx;
    }

    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        npx npx = this.f36354a;
        if (elapsedRealtime - npx.f36365i >= 1800 && npx.f36363g != null) {
            npx.f36372p.run();
        }
    }
}
