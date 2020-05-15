package p000;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiak */
public final /* synthetic */ class aiak implements Runnable {

    /* renamed from: a */
    private final DiscoveryChimeraService f68569a;

    public aiak(DiscoveryChimeraService discoveryChimeraService) {
        this.f68569a = discoveryChimeraService;
    }

    public final void run() {
        this.f68569a.mo44203c();
    }
}
