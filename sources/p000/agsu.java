package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.CountDownLatch;

/* renamed from: agsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agsu extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final String f66393a;

    /* renamed from: b */
    IOException f66394b;

    /* renamed from: c */
    final CountDownLatch f66395c = new CountDownLatch(1);

    /* renamed from: d */
    Boolean f66396d;

    /* renamed from: e */
    final /* synthetic */ agsv f66397e;

    public agsu(agsv agsv, String str) {
        this.f66397e = agsv;
        this.f66393a = str;
    }

    public final void onAvailable(Network network) {
        try {
            URLConnection openConnection = network.openConnection(new URL(this.f66393a));
            agsv.f66398a.mo26019b(agyt.m55307c()).mo68426a("%s Cellular network %s with connection %s is available for CPID end point: %s", "BgTaskGetCpid:", network, openConnection, this.f66393a);
            this.f66396d = Boolean.valueOf(this.f66397e.mo36069a(this.f66393a, openConnection));
        } catch (IOException e) {
            this.f66394b = e;
        }
        this.f66395c.countDown();
    }

    public final void onUnavailable() {
        agsv.f66398a.mo26019b(agyt.m55307c()).mo68420a("%s Cellular network is unavailable while querying CPID endpoint", "BgTaskGetCpid:");
        this.f66397e.mo36068a(27046);
        this.f66395c.countDown();
    }
}
