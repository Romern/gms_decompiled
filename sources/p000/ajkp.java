package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RejectParams;

/* renamed from: ajkp */
final /* synthetic */ class ajkp implements Runnable {

    /* renamed from: a */
    private final ajmt f70814a;

    /* renamed from: b */
    private final RejectParams f70815b;

    public ajkp(ajmt ajmt, RejectParams rejectParams) {
        this.f70814a = ajmt;
        this.f70815b = rejectParams;
    }

    public final void run() {
        ajmt ajmt = this.f70814a;
        RejectParams rejectParams = this.f70815b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "reject", rejectParams.f81118b, new ajll(ajmt, rejectParams));
    }
}
