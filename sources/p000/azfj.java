package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.Map;

/* renamed from: azfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f99228a;

    /* renamed from: b */
    final /* synthetic */ MessagingService f99229b;

    public azfj(MessagingService messagingService, Intent intent) {
        this.f99229b = messagingService;
        this.f99228a = intent;
    }

    public final void run() {
        Object obj;
        Intent intent;
        LocalEntityId localEntityId;
        azet azet;
        MessagingService messagingService = this.f99229b;
        Intent intent2 = this.f99228a;
        String action = intent2.getAction();
        boolean equals = "com.google.android.apps.libraries.matchstick.action.GCM_TICKLE_ACTION".equals(action);
        if (equals) {
            messagingService.f111090j.mo55149a((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, intent2.getStringExtra("tickle"), (LocalEntityId) null, (aznz) null, azoi.m85924a(intent2));
        }
        boolean equals2 = "com.google.android.apps.libraries.matchstick.action.RESTORE_BIND".equals(action);
        if (intent2.getBooleanExtra("require_bind", true) || equals2 || equals) {
            Intent intent3 = new Intent("com.google.android.apps.libraries.matchstick.action.RESTORE_BIND");
            intent3.setClassName(messagingService.f111093m, "com.google.android.gms.matchstick.net.MessagingService");
            Intent a = messagingService.f111091k.mo54872a(intent3, intent3.getLongExtra("retry_interval_intent_extra", 0), cfeo.m138862S(), cfeo.m138861R());
            LocalEntityId a2 = azoi.m85924a(intent2);
            if (a2 == null) {
                azoj.m85932b("MessagingService", "userID not defined in intent", new Object[0]);
                if (cfec.m138765b()) {
                    a2 = azcv.m85357a(messagingService.f111093m).mo54692a(true);
                } else if (azdl.m85420h(messagingService.f111093m)) {
                    a2 = new LocalEntityId(azdl.m85414b(messagingService.f111093m), 1, "MS");
                } else {
                    a2 = azcv.f99014b;
                }
            }
            LocalEntityId g = azcv.m85357a(messagingService.f111093m).mo54706g(a2);
            Object obj2 = messagingService.f111083c;
            synchronized (obj2) {
                try {
                    if (messagingService.f111087g.get(g) == null) {
                        new Object[1][0] = g;
                        Map map = messagingService.f111087g;
                        Context context = messagingService.f111093m;
                        azet azet2 = azet;
                        intent = a;
                        Map map2 = map;
                        obj = obj2;
                        LocalEntityId localEntityId2 = g;
                        try {
                            azet = new azet(context, azcl.m85289a(context), messagingService.f111091k, azcd.m85252a(messagingService.f111093m), azdj.m85399a(messagingService.f111093m), messagingService, messagingService, messagingService.f111086f, messagingService.f111092l, azan.m85141a(messagingService.f111093m), g);
                            localEntityId = localEntityId2;
                            map2.put(localEntityId, azet2);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        obj = obj2;
                        localEntityId = g;
                        intent = a;
                        new Object[1][0] = localEntityId;
                    }
                    if (!equals) {
                        azet azet3 = (azet) messagingService.f111087g.get(localEntityId);
                        azet3.f99195k.mo54886b("Open bind connection", new azem(azet3, intent));
                        return;
                    }
                    azet azet4 = (azet) messagingService.f111087g.get(localEntityId);
                    azet4.f99195k.mo54886b("Pull unread messages", new azen(azet4, intent));
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                    throw th;
                }
            }
        }
    }
}
