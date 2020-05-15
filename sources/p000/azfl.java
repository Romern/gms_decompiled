package p000;

import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LocalEntityId f99232a;

    /* renamed from: b */
    final /* synthetic */ MessagingService f99233b;

    public azfl(MessagingService messagingService, LocalEntityId localEntityId) {
        this.f99233b = messagingService;
        this.f99232a = localEntityId;
    }

    public final void run() {
        LocalEntityId g = azcv.m85357a(this.f99233b.f111093m).mo54706g(this.f99232a);
        if (this.f99233b.f111087g.get(g) == null) {
            azoj.m85933c("MessagingService", "GrpcStreamingManager not alive", new Object[0]);
            return;
        }
        azet azet = (azet) this.f99233b.f111087g.get(g);
        azet.f99195k.mo54886b("ping bind", new azei(azet));
    }
}
