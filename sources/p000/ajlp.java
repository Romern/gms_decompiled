package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ajlp */
final /* synthetic */ class ajlp implements Callable {

    /* renamed from: a */
    private final ajmt f70866a;

    /* renamed from: b */
    private final ajmr f70867b;

    public ajlp(ajmt ajmt, ajmr ajmr) {
        this.f70866a = ajmt;
        this.f70867b = ajmr;
    }

    public final Object call() {
        C1240of ofVar;
        C1240of ofVar2;
        ajmt ajmt = this.f70866a;
        ajmr ajmr = this.f70867b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ajud ajud = ajmr.f70929a;
        Charset charset = NearbySharingChimeraService.f80888a;
        if (nearbySharingChimeraService.mo44451p() && (ofVar2 = nearbySharingChimeraService.f80908t) != null && ((TransferMetadata) ofVar2.f26799b).f81056e) {
            nearbySharingChimeraService.f80908t = null;
        }
        nearbySharingChimeraService.f80900l.remove(ajud);
        if (!nearbySharingChimeraService.mo44451p() && (ofVar = nearbySharingChimeraService.f80908t) != null) {
            ShareTarget shareTarget = (ShareTarget) ofVar.f26798a;
            TransferMetadata transferMetadata = (TransferMetadata) ofVar.f26799b;
            List b = nearbySharingChimeraService.mo44430b(0);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                ((ajud) b.get(i)).mo38711a(shareTarget, transferMetadata);
            }
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("A receive surface has been unregistered");
        nearbySharingChimeraService.mo44442g();
        nearbySharingChimeraService.mo44457v();
        return 0;
    }
}
