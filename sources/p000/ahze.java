package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ahze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahze extends buqn {

    /* renamed from: a */
    final /* synthetic */ ahzi f68453a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahze(ahzi ahzi, String str) {
        super(str);
        this.f68453a = ahzi;
    }

    public final void run() {
        if (!cfoj.f184966a.mo6606a().mo82070U()) {
            Context context = this.f68453a.f68466c;
            if (context != null) {
                Intent a = DiscoveryChimeraService.m67336a(context);
                a.setAction("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_DOWNGRADE");
                ahhd.m55768a(this.f68453a.f68466c, a);
                return;
            }
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairScanner2: context is invalid, canceling downgrade");
            return;
        }
        this.f68453a.mo37311c();
    }
}
