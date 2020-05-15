package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.CancelParams;

/* renamed from: ajkq */
final /* synthetic */ class ajkq implements Runnable {

    /* renamed from: a */
    private final ajmt f70816a;

    /* renamed from: b */
    private final CancelParams f70817b;

    public ajkq(ajmt ajmt, CancelParams cancelParams) {
        this.f70816a = ajmt;
        this.f70817b = cancelParams;
    }

    public final void run() {
        ajmt ajmt = this.f70816a;
        CancelParams cancelParams = this.f70817b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "cancel", cancelParams.f81074b, new ajlk(ajmt, cancelParams));
    }
}
