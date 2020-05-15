package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OpenParams;

/* renamed from: ajkr */
final /* synthetic */ class ajkr implements Runnable {

    /* renamed from: a */
    private final ajmt f70818a;

    /* renamed from: b */
    private final OpenParams f70819b;

    public ajkr(ajmt ajmt, OpenParams openParams) {
        this.f70818a = ajmt;
        this.f70819b = openParams;
    }

    public final void run() {
        ajmt ajmt = this.f70818a;
        OpenParams openParams = this.f70819b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "open", openParams.f81096b, new ajlj(ajmt, openParams));
    }
}
