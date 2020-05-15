package p000;

import android.media.MediaRouter;

/* renamed from: aly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class aly extends MediaRouter.Callback {

    /* renamed from: a */
    protected final alx f896a;

    public aly(alx alx) {
        this.f896a = alx;
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f896a.mo1008a(routeInfo);
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f896a.mo1012c(routeInfo);
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.f896a.mo1007a();
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f896a.mo1010b(routeInfo);
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.f896a.mo1014e(routeInfo);
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f896a.mo1009b();
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.f896a.mo1011c();
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f896a.mo1013d(routeInfo);
    }
}
