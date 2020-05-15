package p000;

import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import java.util.List;

/* renamed from: eck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eck implements ContextHubTransaction.OnCompleteListener {

    /* renamed from: a */
    final /* synthetic */ aucf f14681a;

    public eck(aucf aucf) {
        this.f14681a = aucf;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction, ContextHubTransaction.Response response) {
        for (NanoAppState nanoAppState : (List) response.getContents()) {
            if (nanoAppState.getNanoAppId() == 5147455389092024337L) {
                if (!nanoAppState.isEnabled() || nanoAppState.getNanoAppVersion() < cdid.f180932a.mo6606a().mo77640g()) {
                    new Object[1][0] = Long.valueOf(nanoAppState.getNanoAppVersion());
                } else {
                    new Object[1][0] = Long.valueOf(nanoAppState.getNanoAppVersion());
                    this.f14681a.mo50391a((Object) true);
                    return;
                }
            }
        }
        this.f14681a.mo50391a((Object) false);
    }
}
