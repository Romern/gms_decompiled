package p000;

import android.content.Context;
import android.media.MediaRouter;

/* renamed from: anf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class anf extends ane {
    public anf(Context context, ang ang) {
        super(context, ang);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1062a(anb anb, akn akn) {
        super.mo1062a(anb, akn);
        CharSequence description = ((MediaRouter.RouteInfo) anb.f960a).getDescription();
        if (description != null) {
            akn.mo888b(description.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo2197b(anb anb) {
        return ((MediaRouter.RouteInfo) anb.f960a).isConnecting();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo1069e() {
        if (this.f973o) {
            amd.m1079a(this.f967i, this.f968j);
        }
        this.f973o = true;
        Object obj = this.f967i;
        ((MediaRouter) obj).addCallback(this.f971m, (MediaRouter.Callback) this.f968j, this.f972n | true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo1072g() {
        return ((MediaRouter) this.f967i).getDefaultRoute();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo1074h(Object obj) {
        ((MediaRouter) this.f967i).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1066a(anc anc) {
        ((MediaRouter.UserRouteInfo) anc.f964b).setName(anc.f963a.f875d);
        ((MediaRouter.UserRouteInfo) anc.f964b).setPlaybackType(anc.f963a.f878g);
        ((MediaRouter.UserRouteInfo) anc.f964b).setPlaybackStream(anc.f963a.f879h);
        ((MediaRouter.UserRouteInfo) anc.f964b).setVolume(anc.f963a.f881j);
        ((MediaRouter.UserRouteInfo) anc.f964b).setVolumeMax(anc.f963a.f882k);
        ((MediaRouter.UserRouteInfo) anc.f964b).setVolumeHandling(anc.f963a.f880i);
        ((MediaRouter.UserRouteInfo) anc.f964b).setDescription(anc.f963a.f876e);
    }
}
