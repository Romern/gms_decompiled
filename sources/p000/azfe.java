package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.ExecutionException;

/* renamed from: azfe */
public final /* synthetic */ class azfe implements Runnable {

    /* renamed from: a */
    private final MessagingService f99220a;

    /* renamed from: b */
    private final Intent f99221b;

    public azfe(MessagingService messagingService, Intent intent) {
        this.f99220a = messagingService;
        this.f99221b = intent;
    }

    public final void run() {
        bmxv bmxv;
        MessagingService messagingService = this.f99220a;
        Intent intent = this.f99221b;
        String stringExtra = intent.getStringExtra("tickle");
        azph.m85998a(messagingService.f111093m).mo55152a(1971, stringExtra, (String) null, (ConversationId) null);
        String stringExtra2 = intent.getStringExtra("msRecvId");
        bmxv bmxv2 = bmvz.f131120a;
        if (cfgs.m139414t()) {
            azqf a = azqf.m86130a(messagingService.f111093m);
            bngs j = bngx.m109377j();
            try {
                bnre i = ((bngx) azbj.m85193a(a.f99879a).mo54563c().mo56338a().get()).listIterator();
                while (i.hasNext()) {
                    bcoh bcoh = (bcoh) i.next();
                    if (bcoh.mo57060d() == bcog.VALID && bcoh.mo57061e().equals(cfeo.m138879j())) {
                        j.mo67668c(bcoh);
                    }
                }
                azph.m85998a(a.f99879a).mo55125a(1730);
                bmxv = bmxv.m108566b(j.mo67664a());
            } catch (InterruptedException | ExecutionException e) {
                azoj.m85933c("LighterUtils", "Could not retrieve account contexts", new Object[0]);
                azph.m85998a(a.f99879a).mo55166b(1731, 59);
                bmxv = bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
                bnre i2 = ((bngx) bmxv.mo66814b()).listIterator();
                while (true) {
                    if (!i2.hasNext()) {
                        break;
                    }
                    bcoh bcoh2 = (bcoh) i2.next();
                    bmxv a2 = bcoh2.mo57058b().mo57069a();
                    if (a2.mo66813a() && ddq.m8203a((String) a2.mo66814b(), stringExtra2)) {
                        bmxv2 = bmxv.m108566b(bcoh2);
                        break;
                    }
                }
            }
        }
        if (bmxv2.mo66813a()) {
            azbj.m85193a(messagingService.f111093m).mo54564d().mo56328b((bcoh) bmxv2.mo66814b());
            azph.m85998a(messagingService.f111093m).mo55152a(1973, stringExtra, (String) null, (ConversationId) null);
            return;
        }
        azoj.m85933c("MessagingService", "Failed to get account context with the same gaia email", new Object[0]);
        azph.m85998a(messagingService.f111093m).mo55136a(1972, 80, null, stringExtra, null, null);
    }
}
