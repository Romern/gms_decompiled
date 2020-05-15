package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: akli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akli extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ aklk f72196a;

    public akli(aklk aklk) {
        this.f72196a = aklk;
    }

    public final void onAvailable(Network network) {
        aklk aklk = this.f72196a;
        int i = aklk.f72200k;
        aklk.mo39540a(network);
    }

    public final void onLost(Network network) {
        aklk aklk = this.f72196a;
        int i = aklk.f72200k;
        sdo.m34966a(aklk.f72202d, "WfaNetworkStatusClient can not be null in network lost callback.");
        synchronized (aklk.f72204f) {
            if (network.equals(aklk.f72205g)) {
                boolean z = true;
                new Object[1][0] = network;
                int i2 = eoa.f15378a;
                aklk.f72205g = null;
                aklk.mo39543d();
                aklw aklw = aklk.f72202d;
                aklf aklf = new aklf(aklk);
                sdo.m34973b("Cannot be called from the main thread.");
                if (aklw.mo39549a()) {
                    aknf.m60075a("NetworkLostStartBinding");
                    int a = aklw.mo39548a(new aklu());
                    if (a == 1) {
                        aknf.m60075a("NetworkLostBindingError");
                    } else if (a == 2) {
                        aknf.m60075a("NetworkLostMessageNotAcked");
                    }
                    if (a != 0) {
                        z = false;
                    }
                    aklf.mo39534a(z);
                } else {
                    Intent intent = new Intent(cfpm.f185392a.mo6606a().mo82467c());
                    String b = cfpm.m142486b();
                    String valueOf = String.valueOf(b);
                    String valueOf2 = String.valueOf(cfpm.f185392a.mo6606a().mo82468d());
                    intent.setComponent(new ComponentName(b, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
                    aklw.f72226a.sendBroadcast(intent);
                    aklf.mo39534a(true);
                }
            }
        }
    }
}
