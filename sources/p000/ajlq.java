package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlq */
final /* synthetic */ class ajlq implements Callable {

    /* renamed from: a */
    private final ajmt f70868a;

    /* renamed from: b */
    private final ajud f70869b;

    /* renamed from: c */
    private final int f70870c;

    public ajlq(ajmt ajmt, ajud ajud, int i) {
        this.f70868a = ajmt;
        this.f70869b = ajud;
        this.f70870c = i;
    }

    public final Object call() {
        C1240of ofVar;
        ajmt ajmt = this.f70868a;
        ajud ajud = this.f70869b;
        int i = this.f70870c;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        Charset charset = NearbySharingChimeraService.f80888a;
        if (i == 1 && (ofVar = nearbySharingChimeraService.f80908t) != null) {
            ajud.mo38711a((ShareTarget) ofVar.f26798a, (TransferMetadata) ofVar.f26799b);
        }
        nearbySharingChimeraService.f80900l.put(ajud, Integer.valueOf(i));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("A receive surface has been registered");
        nearbySharingChimeraService.mo44442g();
        nearbySharingChimeraService.mo44457v();
        return 0;
    }
}
