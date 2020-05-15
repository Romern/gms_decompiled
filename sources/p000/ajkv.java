package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;

/* renamed from: ajkv */
final /* synthetic */ class ajkv implements Runnable {

    /* renamed from: a */
    private final ajmt f70826a;

    /* renamed from: b */
    private final MarkContactAsSelectedParams f70827b;

    public ajkv(ajmt ajmt, MarkContactAsSelectedParams markContactAsSelectedParams) {
        this.f70826a = ajmt;
        this.f70827b = markContactAsSelectedParams;
    }

    public final void run() {
        ajmt ajmt = this.f70826a;
        MarkContactAsSelectedParams markContactAsSelectedParams = this.f70827b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "markContactAsSelected", markContactAsSelectedParams.f81088b, new ajli(ajmt, markContactAsSelectedParams));
    }
}
