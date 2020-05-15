package p000;

import android.media.MediaRouter;

/* renamed from: amc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amc extends MediaRouter.VolumeCallback {

    /* renamed from: a */
    protected final amb f904a;

    public amc(amb amb) {
        this.f904a = amb;
    }

    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f904a.mo1025a(routeInfo, i);
    }

    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f904a.mo1026b(routeInfo, i);
    }
}
