package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajll */
final /* synthetic */ class ajll implements Callable {

    /* renamed from: a */
    private final ajmt f70858a;

    /* renamed from: b */
    private final RejectParams f70859b;

    public ajll(ajmt ajmt, RejectParams rejectParams) {
        this.f70858a = ajmt;
        this.f70859b = rejectParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70858a;
        RejectParams rejectParams = this.f70859b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ShareTarget shareTarget = rejectParams.f81117a;
        Charset charset = NearbySharingChimeraService.f80888a;
        int b = nearbySharingChimeraService.mo44420a(shareTarget).mo38788b(shareTarget);
        nearbySharingChimeraService.f80908t = null;
        nearbySharingChimeraService.f80906r.mo38956a(ajvh.m59101a(3));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Client rejected incoming file from %s", shareTarget);
        return Integer.valueOf(b);
    }
}
