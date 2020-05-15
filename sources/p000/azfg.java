package p000;

import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.concurrent.ExecutionException;

/* renamed from: azfg */
public final /* synthetic */ class azfg implements Runnable {

    /* renamed from: a */
    private final MessagingService f99224a;

    public azfg(MessagingService messagingService) {
        this.f99224a = messagingService;
    }

    public final void run() {
        MessagingService messagingService = this.f99224a;
        bngx e = bngx.m109376e();
        try {
            e = (bngx) azbj.m85193a(messagingService.f111093m).mo54563c().mo56338a().get();
        } catch (InterruptedException | ExecutionException e2) {
            azoj.m85933c("MessagingService", "Could not retrieve account context", new Object[0]);
        }
        if (!e.isEmpty()) {
            azbj.m85193a(messagingService.f111093m).mo54564d().mo56330b(e);
        }
    }
}
