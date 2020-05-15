package p000;

import android.os.SystemClock;
import java.io.IOException;

/* renamed from: xkz */
final /* synthetic */ class xkz implements Runnable {

    /* renamed from: a */
    private final xlc f52639a;

    public xkz(xlc xlc) {
        this.f52639a = xlc;
    }

    public final void run() {
        xlc xlc = this.f52639a;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xlc.f52644a.f52637a.connect();
            xlc.f52644a.mo29884a();
            xlc.f52643b.mo25414c("Connected in %d ms. I/O timeout: %d ms", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Integer.valueOf(xlc.f52644a.f52637a.getTimeout()));
        } catch (IOException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            throw a.mo33301a().mo33303c();
        }
    }
}
