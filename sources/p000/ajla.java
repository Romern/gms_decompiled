package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;
import java.nio.charset.Charset;

/* renamed from: ajla */
final /* synthetic */ class ajla implements Runnable {

    /* renamed from: a */
    private final ajmt f70836a;

    /* renamed from: b */
    private final GetDataUsageParams f70837b;

    public ajla(ajmt ajmt, GetDataUsageParams getDataUsageParams) {
        this.f70836a = ajmt;
        this.f70837b = getDataUsageParams;
    }

    public final void run() {
        ajmt ajmt = this.f70836a;
        try {
            ajyn ajyn = this.f70837b.f81082a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyn.mo38891a(nearbySharingChimeraService.mo44447l());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke getDataUsage callback.");
        }
    }
}
