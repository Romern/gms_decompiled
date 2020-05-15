package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;

/* renamed from: ajko */
final /* synthetic */ class ajko implements Runnable {

    /* renamed from: a */
    private final ajmt f70812a;

    /* renamed from: b */
    private final AcceptParams f70813b;

    public ajko(ajmt ajmt, AcceptParams acceptParams) {
        this.f70812a = ajmt;
        this.f70813b = acceptParams;
    }

    public final void run() {
        ajmt ajmt = this.f70812a;
        AcceptParams acceptParams = this.f70813b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "accept", acceptParams.f81072b, new ajlm(ajmt, acceptParams));
    }
}
