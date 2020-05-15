package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: ppr */
final /* synthetic */ class ppr implements Runnable {

    /* renamed from: a */
    private final ppt f40033a;

    public ppr(ppt ppt) {
        this.f40033a = ppt;
    }

    public final void run() {
        ppt ppt = this.f40033a;
        ppt.mo23538a();
        synchronized (ppt.f40039c) {
            ScheduledFuture scheduledFuture = ppt.f40038b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                ppt.f40038b = null;
            }
        }
    }
}
