package p000;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;

/* renamed from: aiim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiim {

    /* renamed from: a */
    public final StartDiscoveryParams f68917a;

    public aiim() {
        this.f68917a = new StartDiscoveryParams();
    }

    /* renamed from: a */
    public final void mo37543a(aige aige) {
        this.f68917a.f80637b = aige;
    }

    /* renamed from: a */
    public final void mo37544a(aigh aigh) {
        this.f68917a.f80641f = aigh;
    }

    /* renamed from: a */
    public final void mo37545a(aigr aigr) {
        this.f68917a.f80636a = aigr;
    }

    /* renamed from: a */
    public final void mo37546a(DiscoveryOptions discoveryOptions) {
        this.f68917a.f80640e = discoveryOptions;
    }

    /* renamed from: a */
    public final void mo37547a(String str) {
        this.f68917a.f80638c = str;
    }

    public aiim(StartDiscoveryParams startDiscoveryParams) {
        StartDiscoveryParams startDiscoveryParams2 = new StartDiscoveryParams();
        this.f68917a = startDiscoveryParams2;
        startDiscoveryParams2.f80636a = startDiscoveryParams.f80636a;
        startDiscoveryParams2.f80637b = startDiscoveryParams.f80637b;
        startDiscoveryParams2.f80638c = startDiscoveryParams.f80638c;
        startDiscoveryParams2.f80639d = startDiscoveryParams.f80639d;
        startDiscoveryParams2.f80640e = startDiscoveryParams.f80640e;
        startDiscoveryParams2.f80641f = startDiscoveryParams.f80641f;
    }
}
