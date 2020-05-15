package p000;

import android.os.Bundle;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiaw extends buqn {

    /* renamed from: a */
    final /* synthetic */ Bundle f68583a;

    /* renamed from: b */
    final /* synthetic */ DiscoveryChimeraService f68584b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiaw(DiscoveryChimeraService discoveryChimeraService, String str, Bundle bundle) {
        super(str);
        this.f68584b = discoveryChimeraService;
        this.f68583a = bundle;
    }

    public final void run() {
        this.f68584b.f80538i.mo37011a(this.f68583a.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_MASTER_SWITCH_ENABLED") ? bvin.NOTIFICATION_MASTER_SWITCH_ENABLED : bvin.NOTIFICATION_MASTER_SWITCH_DISABLED);
    }
}
