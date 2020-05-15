package p000;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: ajfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfn extends aeaa {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70526a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfn(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.f70526a = nearbyMessagesChimeraService;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        srn srn = ahfq.f67120a;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        this.f70526a.f80809h.mo36476a(buye.class, buyd.m120747a(iBinder));
        ((ajat) this.f70526a.f80809h.mo36473a(ajat.class)).mo38418d();
        srn srn = ahfq.f67120a;
        this.f70526a.f80806e.countDown();
    }
}
