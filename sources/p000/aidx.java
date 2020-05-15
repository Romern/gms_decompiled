package p000;

import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;
import java.util.Set;

/* renamed from: aidx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aidx extends aigg {

    /* renamed from: a */
    private final rod f68814a;

    /* renamed from: b */
    private final Set f68815b = new C1225nr();

    public aidx(rod rod) {
        sdo.m34959a(rod);
        this.f68814a = rod;
    }

    /* renamed from: b */
    public static boolean m57058b(OnEndpointFoundParams onEndpointFoundParams) {
        String str;
        return onEndpointFoundParams.f80593d != null && ((str = onEndpointFoundParams.f80590a) == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo37453a() {
        for (String str : this.f68815b) {
            this.f68814a.mo24968a(new aidw(str));
        }
        this.f68815b.clear();
    }

    /* renamed from: a */
    public final void mo36557a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
    }

    /* renamed from: a */
    public final synchronized void mo36554a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams) {
        this.f68814a.mo24968a(new aidt(onEndpointDistanceChangedParams));
    }

    /* renamed from: a */
    public final synchronized void mo36555a(OnEndpointFoundParams onEndpointFoundParams) {
        if (!m57058b(onEndpointFoundParams)) {
            this.f68815b.add(onEndpointFoundParams.f80590a);
        }
        this.f68814a.mo24968a(new aidu(onEndpointFoundParams));
    }

    /* renamed from: a */
    public final synchronized void mo36556a(OnEndpointLostParams onEndpointLostParams) {
        this.f68815b.remove(onEndpointLostParams.f80595a);
        this.f68814a.mo24968a(new aidv(onEndpointLostParams));
    }
}
