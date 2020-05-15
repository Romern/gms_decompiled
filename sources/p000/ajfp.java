package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: ajfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfp extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f70530a;

    /* renamed from: b */
    final /* synthetic */ Context f70531b;

    /* renamed from: c */
    final /* synthetic */ NearbyMessagesChimeraService.OptInChangeBroadcastReceiver f70532c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfp(NearbyMessagesChimeraService.OptInChangeBroadcastReceiver optInChangeBroadcastReceiver, String str, Intent intent, Context context) {
        super(str);
        this.f70532c = optInChangeBroadcastReceiver;
        this.f70530a = intent;
        this.f70531b = context;
    }

    public final void run() {
        String stringExtra = this.f70530a.getStringExtra("EXTRA_PACKAGE_NAME");
        srn srn = ahfq.f67120a;
        NearbyMessagesChimeraService nearbyMessagesChimeraService = NearbyMessagesChimeraService.this;
        Object obj = NearbyMessagesChimeraService.f80800a;
        bngx a = nearbyMessagesChimeraService.mo44371a(stringExtra);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ajgf ajgf = (ajgf) a.get(i);
            ajgf.f70563b.mo72987c(new ajgc(ajgf, "onNearbyPermissionChanged"));
        }
        if (!new ajgk(this.f70531b).mo38612b(stringExtra)) {
            NearbyMessagesChimeraService.this.m67416a(stringExtra, true);
        }
    }
}
