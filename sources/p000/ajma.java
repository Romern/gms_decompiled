package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import java.nio.charset.Charset;

/* renamed from: ajma */
final /* synthetic */ class ajma implements Runnable {

    /* renamed from: a */
    private final ajmt f70892a;

    /* renamed from: b */
    private final GetDeviceNameParams f70893b;

    public ajma(ajmt ajmt, GetDeviceNameParams getDeviceNameParams) {
        this.f70892a = ajmt;
        this.f70893b = getDeviceNameParams;
    }

    public final void run() {
        ajmt ajmt = this.f70892a;
        try {
            ajyw ajyw = this.f70893b.f81083a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyw.mo39085a(nearbySharingChimeraService.mo44449n());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke getDeviceName callback.");
        }
    }
}
