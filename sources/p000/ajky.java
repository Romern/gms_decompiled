package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import java.nio.charset.Charset;

/* renamed from: ajky */
final /* synthetic */ class ajky implements Runnable {

    /* renamed from: a */
    private final ajmt f70832a;

    /* renamed from: b */
    private final GetAccountParams f70833b;

    public ajky(ajmt ajmt, GetAccountParams getAccountParams) {
        this.f70832a = ajmt;
        this.f70833b = getAccountParams;
    }

    public final void run() {
        ajmt ajmt = this.f70832a;
        try {
            ajyd ajyd = this.f70833b.f81075a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyd.mo39083a(nearbySharingChimeraService.mo44453r());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke getAccount callback.");
        }
    }
}
