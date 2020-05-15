package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;

/* renamed from: ajkj */
final /* synthetic */ class ajkj implements Runnable {

    /* renamed from: a */
    private final ajmt f70798a;

    /* renamed from: b */
    private final UnregisterSendSurfaceParams f70799b;

    /* renamed from: c */
    private final ajms f70800c;

    public ajkj(ajmt ajmt, UnregisterSendSurfaceParams unregisterSendSurfaceParams, ajms ajms) {
        this.f70798a = ajmt;
        this.f70799b = unregisterSendSurfaceParams;
        this.f70800c = ajms;
    }

    public final void run() {
        ajmt ajmt = this.f70798a;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "unregisterSendSurface", this.f70799b.f81137b, new ajlr(ajmt, this.f70800c));
    }
}
