package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import java.util.Set;

/* renamed from: aids */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aids extends aifx {

    /* renamed from: a */
    private final rod f68807a;

    /* renamed from: b */
    private final Set f68808b = new C1225nr();

    /* renamed from: c */
    private final Set f68809c = new C1225nr();

    public aids(rod rod) {
        sdo.m34959a(rod);
        this.f68807a = rod;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo37452a() {
        for (String str : this.f68808b) {
            this.f68807a.mo24968a(new aidq(str));
        }
        this.f68808b.clear();
        for (String str2 : this.f68809c) {
            this.f68807a.mo24968a(new aidr(str2));
        }
        this.f68809c.clear();
    }

    /* renamed from: a */
    public final void mo36560a(OnBandwidthChangedParams onBandwidthChangedParams) {
        this.f68807a.mo24968a(new aidp(onBandwidthChangedParams));
    }

    /* renamed from: a */
    public final synchronized void mo36561a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        this.f68808b.add(onConnectionInitiatedParams.f80570a);
        this.f68807a.mo24968a(new aidm(onConnectionInitiatedParams));
    }

    /* renamed from: a */
    public final synchronized void mo36562a(OnConnectionResultParams onConnectionResultParams) {
        this.f68808b.remove(onConnectionResultParams.f80584a);
        Status c = aieh.m57074c(onConnectionResultParams.f80585b);
        if (c.mo17710c()) {
            this.f68809c.add(onConnectionResultParams.f80584a);
        }
        this.f68807a.mo24968a(new aidn(onConnectionResultParams, c));
    }

    /* renamed from: a */
    public final synchronized void mo36563a(OnDisconnectedParams onDisconnectedParams) {
        this.f68809c.remove(onDisconnectedParams.f80587a);
        this.f68807a.mo24968a(new aido(onDisconnectedParams));
    }
}
