package p000;

import android.net.TrafficStats;
import java.util.concurrent.Callable;

/* renamed from: mzo */
final /* synthetic */ class mzo implements Callable {

    /* renamed from: a */
    private final nab f35053a;

    public mzo(nab nab) {
        this.f35053a = nab;
    }

    public final Object call() {
        nab nab = this.f35053a;
        if (nab.f35103j != null) {
            nab.f35075a.mo25414c("Arbitrarily cancel full backup transfer.", new Object[0]);
            nab.f35103j.f35010k.mo20336b();
            nab.f35102i = false;
        }
        nab.f35103j = null;
        TrafficStats.clearThreadStatsTag();
        TrafficStats.clearThreadStatsUid();
        nab.f35117x.mo19821a(2);
        return null;
    }
}
