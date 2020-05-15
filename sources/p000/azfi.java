package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azfi */
public final /* synthetic */ class azfi implements Runnable {

    /* renamed from: a */
    private final MessagingService f99226a;

    /* renamed from: b */
    private final Intent f99227b;

    public azfi(MessagingService messagingService, Intent intent) {
        this.f99226a = messagingService;
        this.f99227b = intent;
    }

    public final void run() {
        this.f99226a.mo60381c(this.f99227b);
    }
}
