package p000;

import android.media.MediaRouter;

/* renamed from: ana */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ana extends aky {

    /* renamed from: a */
    private final Object f959a;

    public ana(Object obj) {
        this.f959a = obj;
    }

    /* renamed from: b */
    public final void mo940b(int i) {
        ((MediaRouter.RouteInfo) this.f959a).requestSetVolume(i);
    }

    /* renamed from: c */
    public final void mo942c(int i) {
        ((MediaRouter.RouteInfo) this.f959a).requestUpdateVolume(i);
    }
}
