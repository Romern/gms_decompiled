package p000;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aibc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibc extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68593a;

    /* renamed from: b */
    final /* synthetic */ DiscoveryChimeraService.IntentReceiver f68594b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibc(DiscoveryChimeraService.IntentReceiver intentReceiver, String str, Intent intent) {
        super(str);
        this.f68594b = intentReceiver;
        this.f68593a = intent;
    }

    public final void run() {
        DiscoveryChimeraService.this.f80540k.mo37162a(this.f68593a);
    }
}
