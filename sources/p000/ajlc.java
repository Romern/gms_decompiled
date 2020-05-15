package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import java.nio.charset.Charset;

/* renamed from: ajlc */
final /* synthetic */ class ajlc implements Runnable {

    /* renamed from: a */
    private final ajmt f70840a;

    /* renamed from: b */
    private final GetVisibilityParams f70841b;

    public ajlc(ajmt ajmt, GetVisibilityParams getVisibilityParams) {
        this.f70840a = ajmt;
        this.f70841b = getVisibilityParams;
    }

    public final void run() {
        ajmt ajmt = this.f70840a;
        try {
            ajyn ajyn = this.f70841b.f81084a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyn.mo38891a(nearbySharingChimeraService.mo44448m());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke getVisibility callback.");
        }
    }
}
