package p000;

import android.os.SystemClock;

/* renamed from: beyq */
final /* synthetic */ class beyq implements Runnable {

    /* renamed from: a */
    private final beyr f113023a;

    public beyq(beyr beyr) {
        this.f113023a = beyr;
    }

    public final void run() {
        beyr beyr = this.f113023a;
        beyv beyv = beyr.f113024a;
        if (beyv.f113057t) {
            beyv.f113058u = SystemClock.elapsedRealtimeNanos();
        }
        beyr.f113024a.f113057t = false;
    }
}
