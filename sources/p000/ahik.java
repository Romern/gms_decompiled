package p000;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: ahik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahik {

    /* renamed from: a */
    public final DiscoveryOptions f67244a;

    public ahik() {
        this.f67244a = new DiscoveryOptions();
    }

    /* renamed from: a */
    public final void mo36534a(Strategy strategy) {
        this.f67244a.f80467a = strategy;
    }

    public ahik(DiscoveryOptions discoveryOptions) {
        DiscoveryOptions discoveryOptions2 = new DiscoveryOptions();
        this.f67244a = discoveryOptions2;
        discoveryOptions2.f80467a = discoveryOptions.f80467a;
        discoveryOptions2.f80468b = discoveryOptions.f80468b;
        discoveryOptions2.f80469c = discoveryOptions.f80469c;
        discoveryOptions2.f80470d = discoveryOptions.f80470d;
        discoveryOptions2.f80471e = discoveryOptions.f80471e;
        discoveryOptions2.f80472f = discoveryOptions.f80472f;
        discoveryOptions2.f80473g = discoveryOptions.f80473g;
        discoveryOptions2.f80474h = discoveryOptions.f80474h;
        discoveryOptions2.f80475i = discoveryOptions.f80475i;
    }
}
