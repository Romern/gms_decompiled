package p000;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfi extends buqn {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70520a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfi(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.f70520a = nearbyMessagesChimeraService;
    }

    public final void run() {
        try {
            this.f70520a.f80806e.await(cfop.f185115a.mo6606a().mo82231j(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            srn srn = ahfq.f67120a;
        }
    }
}
