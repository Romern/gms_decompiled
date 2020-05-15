package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: wgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgj {

    /* renamed from: a */
    private volatile wgi f50621a;

    /* renamed from: a */
    private static final boolean m41908a(wgi wgi) {
        return wgi == null || (wgi.f50620b >= 0 && SystemClock.elapsedRealtime() >= wgi.f50620b);
    }

    /* renamed from: b */
    public final long mo29098b() {
        wgi wgi = this.f50621a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m41908a(wgi)) {
            return 0;
        }
        long j = wgi.f50620b;
        return j >= 0 ? TimeUnit.MILLISECONDS.toSeconds(wgi.f50620b - elapsedRealtime) : j;
    }

    /* renamed from: a */
    public final String mo29096a() {
        wgi wgi = this.f50621a;
        return !m41908a(wgi) ? wgi.f50619a : "";
    }

    /* renamed from: a */
    public final void mo29097a(String str, long j) {
        if (str == null || j == 0) {
            this.f50621a = null;
            return;
        }
        if (j >= 0) {
            j = TimeUnit.SECONDS.toMillis(j) + SystemClock.elapsedRealtime();
        }
        this.f50621a = new wgi(str, j);
    }
}
