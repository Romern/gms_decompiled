package p000;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;

/* renamed from: aiaj */
public final /* synthetic */ class aiaj implements Runnable {

    /* renamed from: a */
    private final DiscoveryChimeraService f68567a;

    /* renamed from: b */
    private final List f68568b;

    public aiaj(DiscoveryChimeraService discoveryChimeraService, List list) {
        this.f68567a = discoveryChimeraService;
        this.f68568b = list;
    }

    public final void run() {
        DiscoveryChimeraService discoveryChimeraService = this.f68567a;
        List list = this.f68568b;
        if (((ahuu) ahgz.m55754a(discoveryChimeraService, ahuu.class)).mo37180b()) {
            if (discoveryChimeraService.f80541l == null) {
                discoveryChimeraService.f80541l = apr.m1818a(discoveryChimeraService);
            }
            busp.m120392a(discoveryChimeraService.f80541l, !list.isEmpty());
        }
    }
}
