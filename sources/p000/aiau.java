package p000;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiau extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68580a;

    /* renamed from: b */
    final /* synthetic */ DiscoveryChimeraService f68581b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiau(DiscoveryChimeraService discoveryChimeraService, String str, Intent intent) {
        super(str);
        this.f68581b = discoveryChimeraService;
        this.f68580a = intent;
    }

    public final void run() {
        this.f68581b.f80540k.mo37162a(this.f68580a);
    }
}
