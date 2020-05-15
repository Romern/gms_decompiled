package p000;

import android.os.SystemClock;

/* renamed from: npw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class npw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ npx f36355a;

    public npw(npx npx) {
        this.f36355a = npx;
    }

    public final void run() {
        npx npx = this.f36355a;
        if (SystemClock.elapsedRealtime() - npx.f36365i >= 1800) {
            if (npx.f36363g != null && npx.f36364h.get()) {
                npx.f36363g.removeSpeed();
                npx.f36363g.setAccuracy(7.89f);
                npx.f36363g.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                npx.f36363g.setTime(SystemClock.currentThreadTimeMillis());
                npx.mo21435a(npx.f36363g);
            }
            npx npx2 = this.f36355a;
            npx2.mo21437a(npx2.f36372p, 1000);
            return;
        }
        bnsi c = npx.f36356a.mo68388c();
        c.mo68432a("npx", "d", 485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Fake location inject fired but it was up to date.");
    }
}
