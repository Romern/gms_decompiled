package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ajlj */
final /* synthetic */ class ajlj implements Callable {

    /* renamed from: a */
    private final ajmt f70854a;

    /* renamed from: b */
    private final OpenParams f70855b;

    public ajlj(ajmt ajmt, OpenParams openParams) {
        this.f70854a = ajmt;
        this.f70855b = openParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70854a;
        OpenParams openParams = this.f70855b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ShareTarget shareTarget = openParams.f81095a;
        Charset charset = NearbySharingChimeraService.f80888a;
        int c = nearbySharingChimeraService.mo44420a(shareTarget).mo38790c(shareTarget);
        nearbySharingChimeraService.f80908t = null;
        ajvg ajvg = nearbySharingChimeraService.f80906r;
        List b = shareTarget.mo44499b();
        bxvd d = ajvh.m59107d(22);
        bxvd da = bvfl.f155881c.mo74144da();
        bvfe a = ajvh.m59104a(b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfl bvfl = (bvfl) da.f164949b;
        a.getClass();
        bvfl.f155884b = a;
        bvfl.f155883a |= 1;
        bvfl bvfl2 = (bvfl) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfl2.getClass();
        bvgd.f155984u = bvfl2;
        bvgd.f155964a |= 4194304;
        ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Client opened incoming file from %s", shareTarget);
        return Integer.valueOf(c);
    }
}
