package p000;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiaz extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68589a;

    /* renamed from: b */
    final /* synthetic */ DiscoveryChimeraService f68590b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiaz(DiscoveryChimeraService discoveryChimeraService, String str, Intent intent) {
        super(str);
        this.f68590b = discoveryChimeraService;
        this.f68589a = intent;
    }

    public final void run() {
        this.f68590b.f80535f.mo37416a(this.f68589a);
    }
}
