package p000;

import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f99230a;

    /* renamed from: b */
    final /* synthetic */ MessagingService f99231b;

    public azfk(MessagingService messagingService, int i) {
        this.f99231b = messagingService;
        this.f99230a = i;
    }

    public final void run() {
        MessagingService messagingService = this.f99231b;
        int i = this.f99230a;
        azox.m85981a();
        synchronized (messagingService.f111083c) {
            if (messagingService.f111084d.isEmpty() && messagingService.f111094n) {
                bmxy.m108600b(!messagingService.f111085e.mo54890b());
                messagingService.stopSelfResult(i);
            }
        }
    }
}
