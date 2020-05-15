package p000;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ajfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfk extends buqn {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70522a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfk(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.f70522a = nearbyMessagesChimeraService;
    }

    public final void run() {
        HashSet hashSet = new HashSet();
        aiyr aiyr = (aiyr) this.f70522a.f80809h.mo36473a(aiyr.class);
        for (aiyo aiyo : aiyr.mo38298b()) {
            if (aiyo.mo38280a()) {
                hashSet.add(aiyr.mo38292a(aiyo));
            }
        }
        synchronized (NearbyMessagesChimeraService.f80800a) {
            Map map = this.f70522a.f80805d;
            if (map != null) {
                map.keySet().retainAll(hashSet);
                if (this.f70522a.f80805d.isEmpty()) {
                    this.f70522a.f80805d = null;
                }
            }
        }
    }
}
