package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlm */
final /* synthetic */ class ajlm implements Callable {

    /* renamed from: a */
    private final ajmt f70860a;

    /* renamed from: b */
    private final AcceptParams f70861b;

    public ajlm(ajmt ajmt, AcceptParams acceptParams) {
        this.f70860a = ajmt;
        this.f70861b = acceptParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70860a;
        AcceptParams acceptParams = this.f70861b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ShareTarget shareTarget = acceptParams.f81071a;
        Charset charset = NearbySharingChimeraService.f80888a;
        int a = nearbySharingChimeraService.mo44420a(shareTarget).mo38780a(shareTarget);
        nearbySharingChimeraService.f80906r.mo38956a(ajvh.m59101a(2));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Client accepted incoming file from %s", shareTarget);
        return Integer.valueOf(a);
    }
}
