package p000;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: ajff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajff extends buqn {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70517a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajff(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.f70517a = nearbyMessagesChimeraService;
    }

    public final void run() {
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.f70517a;
        try {
            nearbyMessagesChimeraService.f80811j.mo38159a();
            if (nearbyMessagesChimeraService.f80811j.mo38162b().isEmpty()) {
                aiyh aiyh = (aiyh) nearbyMessagesChimeraService.f80809h.mo36473a(aiyh.class);
                aiyh.f70062d.mo72984b();
                aiyh.mo38267c();
                if (!aiyh.f70061c.isEmpty() || !Collections.unmodifiableSet(((aiyh) nearbyMessagesChimeraService.f80809h.mo36473a(aiyh.class)).f70060b.keySet()).isEmpty() || !((aiyr) nearbyMessagesChimeraService.f80809h.mo36473a(aiyr.class)).mo38302d() || !new HashSet(((aiyr) nearbyMessagesChimeraService.f80809h.mo36473a(aiyr.class)).f70092c.mo67317p()).isEmpty() || ((aiwq) nearbyMessagesChimeraService.f80809h.mo36473a(aiwq.class)).mo38175a()) {
                    return;
                }
                srn srn = ahfq.f67120a;
                this.f70517a.stopSelf();
            }
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "d", 1109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception while waiting for BackgroundSubscribeCache init.");
        }
    }
}
