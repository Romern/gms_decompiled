package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import java.nio.charset.Charset;

/* renamed from: ajlo */
final /* synthetic */ class ajlo implements Runnable {

    /* renamed from: a */
    private final ajmt f70864a;

    /* renamed from: b */
    private final IsEnabledParams f70865b;

    public ajlo(ajmt ajmt, IsEnabledParams isEnabledParams) {
        this.f70864a = ajmt;
        this.f70865b = isEnabledParams;
    }

    public final void run() {
        ajmt ajmt = this.f70864a;
        try {
            ajyg ajyg = this.f70865b.f81085a;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            Charset charset = NearbySharingChimeraService.f80888a;
            ajyg.mo38892a(nearbySharingChimeraService.mo44446k());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to invoke isEnabled callback.");
        }
    }
}
