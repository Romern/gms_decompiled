package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiax extends buqn {

    /* renamed from: a */
    final /* synthetic */ Bundle f68585a;

    /* renamed from: b */
    final /* synthetic */ Intent f68586b;

    /* renamed from: c */
    final /* synthetic */ DiscoveryChimeraService f68587c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiax(DiscoveryChimeraService discoveryChimeraService, String str, Bundle bundle, Intent intent) {
        super(str);
        this.f68587c = discoveryChimeraService;
        this.f68585a = bundle;
        this.f68586b = intent;
    }

    public final void run() {
        this.f68587c.f80538i.mo37011a(this.f68585a.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED") ? this.f68586b.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS") ? bvin.DEVICE_NOTIFICATION_SETTINGS_ENABLED : bvin.NOTIFICATION_SETTINGS_ENABLED : this.f68586b.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS") ? bvin.DEVICE_NOTIFICATION_SETTINGS_DISABLED : bvin.NOTIFICATION_SETTINGS_DISABLED);
        this.f68587c.f80533d.mo37366a();
    }
}
