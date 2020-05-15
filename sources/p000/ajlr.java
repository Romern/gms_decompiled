package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ajlr */
final /* synthetic */ class ajlr implements Callable {

    /* renamed from: a */
    private final ajmt f70871a;

    /* renamed from: b */
    private final ajms f70872b;

    public ajlr(ajmt ajmt, ajms ajms) {
        this.f70871a = ajmt;
        this.f70872b = ajms;
    }

    public final Object call() {
        C1240of ofVar;
        C1240of ofVar2;
        ajmt ajmt = this.f70871a;
        ajms ajms = this.f70872b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        ajud ajud = ajms.f70931a;
        Charset charset = NearbySharingChimeraService.f80888a;
        if (nearbySharingChimeraService.mo44428a(1, 3) && (ofVar2 = nearbySharingChimeraService.f80909u) != null && ((TransferMetadata) ofVar2.f26799b).f81056e) {
            nearbySharingChimeraService.f80909u = null;
        }
        nearbySharingChimeraService.f80901m.remove(ajud);
        if (!nearbySharingChimeraService.mo44428a(1, 3) && (ofVar = nearbySharingChimeraService.f80909u) != null) {
            ShareTarget shareTarget = (ShareTarget) ofVar.f26798a;
            TransferMetadata transferMetadata = (TransferMetadata) ofVar.f26799b;
            List b = nearbySharingChimeraService.mo44431b(0);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                ((ajud) ((C1240of) b.get(i)).f26798a).mo38711a(shareTarget, transferMetadata);
            }
        }
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("A share sheet has been unregistered");
        nearbySharingChimeraService.mo44443h();
        nearbySharingChimeraService.mo44457v();
        return 0;
    }
}
