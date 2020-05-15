package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import java.nio.charset.Charset;

/* renamed from: ajks */
final /* synthetic */ class ajks implements Runnable {

    /* renamed from: a */
    private final ajmt f70820a;

    /* renamed from: b */
    private final IsOptedInParams f70821b;

    public ajks(ajmt ajmt, IsOptedInParams isOptedInParams) {
        this.f70820a = ajmt;
        this.f70821b = isOptedInParams;
    }

    public final void run() {
        ajmt ajmt = this.f70820a;
        try {
            ajyg ajyg = this.f70821b.f81086a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyg.mo38892a(nearbySharingChimeraService.mo44445j());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke isOptedIn callback.");
        }
    }
}
