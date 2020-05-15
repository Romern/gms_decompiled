package p000;

import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: ajfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfh extends buqn {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70519a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfh(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.f70519a = nearbyMessagesChimeraService;
    }

    public final void run() {
        aiwp aiwp = (aiwp) this.f70519a.f80809h.mo36473a(aiwp.class);
        aiwp.f69949b.mo72987c(new aiwm(aiwp, "CopresenceHelper.init"));
        this.f70519a.f80809h.mo36473a(ajeg.class);
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.f70519a;
        nearbyMessagesChimeraService.f80807f = new CopresenceBroadcastReceiver((ajat) nearbyMessagesChimeraService.f80809h.mo36473a(ajat.class), (buqh) this.f70519a.f80809h.mo36473a(buqh.class));
        this.f70519a.f80809h.mo36473a(ajbd.class);
    }
}
