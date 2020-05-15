package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;

/* renamed from: ajkm */
final /* synthetic */ class ajkm implements Runnable {

    /* renamed from: a */
    private final ajmt f70807a;

    /* renamed from: b */
    private final UnregisterReceiveSurfaceParams f70808b;

    /* renamed from: c */
    private final ajmr f70809c;

    public ajkm(ajmt ajmt, UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams, ajmr ajmr) {
        this.f70807a = ajmt;
        this.f70808b = unregisterReceiveSurfaceParams;
        this.f70809c = ajmr;
    }

    public final void run() {
        ajmt ajmt = this.f70807a;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "unregisterReceiveSurface", this.f70808b.f81135b, new ajlp(ajmt, this.f70809c));
    }
}
