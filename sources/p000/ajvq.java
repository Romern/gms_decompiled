package p000;

import android.os.SystemClock;

/* renamed from: ajvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvq {

    /* renamed from: a */
    private final String f71372a;

    /* renamed from: b */
    private long f71373b = 0;

    /* renamed from: c */
    private long f71374c = 0;

    public ajvq(String str) {
        this.f71372a = str;
    }

    /* renamed from: a */
    public final void mo38976a() {
        this.f71374c++;
        ((bnsl) ajvp.f71371a.mo68390d()).mo68423a("Incremented the RateLimitThrottler(%s) count to %d.", this.f71372a, this.f71374c);
    }

    /* renamed from: a */
    public final boolean mo38977a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (elapsedRealtime <= this.f71373b + j2) {
            if (this.f71374c >= j) {
                z = true;
            }
            if (z) {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68425a("RateLimitThrottler(%s) is at the throttling limit of (%d/%d millis): skipping action.", this.f71372a, Long.valueOf(j), Long.valueOf(j2));
            }
            return z;
        }
        this.f71373b = elapsedRealtime;
        this.f71374c = 0;
        return false;
    }
}
