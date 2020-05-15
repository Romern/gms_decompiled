package p000;

import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ahyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyo {

    /* renamed from: a */
    public final Map f68360a;

    /* renamed from: b */
    private final DiscoveryChimeraService f68361b;

    /* renamed from: c */
    private final Context f68362c;

    public ahyo(Context context) {
        this.f68362c = context;
        this.f68361b = (DiscoveryChimeraService) ahgz.m55754a(context, DiscoveryChimeraService.class);
        this.f68360a = cfoj.m141563m() ? new ConcurrentHashMap() : new HashMap();
    }

    /* renamed from: a */
    public final void mo37296a() {
        DiscoveryChimeraService discoveryChimeraService = this.f68361b;
        bngs j = bngx.m109377j();
        for (Map.Entry entry : cfoj.m141563m() ? bnic.m109495a((Collection) this.f68360a.entrySet()) : this.f68360a.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            ahyw ahyw = (ahyw) entry.getValue();
            j.mo67668c(new DiscoveryListItem(ahyw.f68393b, ahyw.f68397f, ahys.m56886b(this.f68362c, ahyw), null, null, 0.0f, false, bzbk.NEARBY_DEVICE, ahys.m56884a(this.f68362c, Integer.valueOf(intValue), ahyw), ahys.m56885a(this.f68362c, ahyw), false));
        }
        discoveryChimeraService.mo44201a(0, j.mo67664a());
    }

    /* renamed from: a */
    public final void mo37297a(int i) {
        this.f68360a.remove(Integer.valueOf(i));
        mo37296a();
    }
}
