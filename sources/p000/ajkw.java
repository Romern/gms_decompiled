package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;

/* renamed from: ajkw */
final /* synthetic */ class ajkw implements Runnable {

    /* renamed from: a */
    private final ajmt f70828a;

    /* renamed from: b */
    private final UnmarkContactAsSelectedParams f70829b;

    public ajkw(ajmt ajmt, UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        this.f70828a = ajmt;
        this.f70829b = unmarkContactAsSelectedParams;
    }

    public final void run() {
        ajmt ajmt = this.f70828a;
        UnmarkContactAsSelectedParams unmarkContactAsSelectedParams = this.f70829b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "unmarkContactAsSelected", unmarkContactAsSelectedParams.f81133b, new ajlh(ajmt, unmarkContactAsSelectedParams));
    }
}
