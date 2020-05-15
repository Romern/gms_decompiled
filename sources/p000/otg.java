package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: otg */
public final /* synthetic */ class otg implements Runnable {

    /* renamed from: a */
    private final C1585otp f38384a;

    public otg(C1585otp otp) {
        this.f38384a = otp;
    }

    public final void run() {
        C1585otp otp = this.f38384a;
        ScheduledFuture scheduledFuture = otp.f38427h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        otp.f38425f.removeCallbacksAndMessages(null);
        otp.f38426g.shutdownNow();
    }
}
