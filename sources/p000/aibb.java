package p000;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aibb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibb extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68591a;

    /* renamed from: b */
    final /* synthetic */ DiscoveryChimeraService.GuardedIntentReceiver f68592b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibb(DiscoveryChimeraService.GuardedIntentReceiver guardedIntentReceiver, String str, Intent intent) {
        super(str);
        this.f68592b = guardedIntentReceiver;
        this.f68591a = intent;
    }

    public final void run() {
        DiscoveryChimeraService.this.f80540k.mo37162a(this.f68591a);
    }
}
