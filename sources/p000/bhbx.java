package p000;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: bhbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbx {

    /* renamed from: a */
    private long f118277a = 0;

    /* renamed from: a */
    public final synchronized void mo63540a() {
        this.f118277a = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final synchronized boolean mo63541a(long j, boolean z) {
        return mo63542a(true, j, z, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public final synchronized boolean mo63542a(boolean z, long j, boolean z2, long j2) {
        long elapsedRealtime;
        float f;
        float f2;
        elapsedRealtime = SystemClock.elapsedRealtime() - this.f118277a;
        if (j2 != Long.MAX_VALUE) {
            f = (float) j2;
        } else if (z2) {
            f = (float) j;
        } else {
            if (!z) {
                f2 = (float) ceys.f183516a.mo6606a().freshPeriodThresholdBackground();
            } else {
                f2 = (float) ceys.f183516a.mo6606a().freshPeriodThreshold();
            }
            f = f2 * ((float) j);
        }
        int i = Build.VERSION.SDK_INT;
        return ((float) elapsedRealtime) > Math.min(f, (float) cfap.m138545b());
    }
}
