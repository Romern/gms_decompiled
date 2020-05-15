package p000;

import android.content.Intent;
import android.net.NetworkInfo;
import com.google.android.gms.cast.discovery.DiscoveryManager$DiscoveryManagerReceiver;

/* renamed from: pmg */
public final /* synthetic */ class pmg implements Runnable {

    /* renamed from: a */
    private final DiscoveryManager$DiscoveryManagerReceiver f39670a;

    /* renamed from: b */
    private final Intent f39671b;

    public pmg(DiscoveryManager$DiscoveryManagerReceiver discoveryManager$DiscoveryManagerReceiver, Intent intent) {
        this.f39670a = discoveryManager$DiscoveryManagerReceiver;
        this.f39671b = intent;
    }

    public final void run() {
        DiscoveryManager$DiscoveryManagerReceiver discoveryManager$DiscoveryManagerReceiver = this.f39670a;
        Intent intent = this.f39671b;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (!ccyz.m132249b()) {
                pmh pmh = discoveryManager$DiscoveryManagerReceiver.f29869a;
                long j = pmh.f39672b;
                pmh.f39680h.mo23397a(false);
            }
            discoveryManager$DiscoveryManagerReceiver.f29869a.mo23413a(false);
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            if (!ccyz.m132249b()) {
                pmh pmh2 = discoveryManager$DiscoveryManagerReceiver.f29869a;
                long j2 = pmh.f39672b;
                pmh2.f39680h.mo23397a(true);
            }
            discoveryManager$DiscoveryManagerReceiver.f29869a.mo23413a(false);
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getExtras().get("networkInfo");
            pmh pmh3 = discoveryManager$DiscoveryManagerReceiver.f29869a;
            long j3 = pmh.f39672b;
            pma pma = pmh3.f39680h;
            pma.f39647a.mo23856a("network connectivity changed to %s", networkInfo);
            if (networkInfo != null && networkInfo.isConnected()) {
                pma.mo23402e();
                pma.mo23400c();
                pma.mo23399b();
            }
            pma.mo23403f();
            discoveryManager$DiscoveryManagerReceiver.f29869a.mo23413a(false);
        }
    }
}
