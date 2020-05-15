package p000;

import android.content.Context;
import android.media.MediaRouter;

/* renamed from: nkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkf {

    /* renamed from: a */
    private final MediaRouter f35886a;

    /* renamed from: b */
    private MediaRouter.RouteInfo f35887b;

    public nkf(Context context) {
        this.f35886a = (MediaRouter) context.getSystemService("media_router");
    }

    /* renamed from: c */
    private final synchronized void m26613c() {
        MediaRouter.RouteInfo defaultRoute = this.f35886a.getDefaultRoute();
        MediaRouter.RouteInfo selectedRoute = this.f35886a.getSelectedRoute(1);
        if (defaultRoute != selectedRoute) {
            this.f35887b = selectedRoute;
            bnsi c = nkq.f35898a.mo68388c();
            c.mo68432a("nkf", "c", 775, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("disabling A2dp route while in projection");
        }
        this.f35886a.selectRoute(1, defaultRoute);
    }

    /* renamed from: a */
    public final synchronized void mo20943a() {
        m26613c();
    }

    /* renamed from: b */
    public final synchronized void mo20944b() {
        MediaRouter.RouteInfo routeInfo = this.f35887b;
        if (routeInfo != null) {
            this.f35886a.selectRoute(1, routeInfo);
            this.f35887b = null;
        }
    }
}
