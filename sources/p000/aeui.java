package p000;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;
import java.util.concurrent.CountDownLatch;

/* renamed from: aeui */
public final /* synthetic */ class aeui implements aehz {

    /* renamed from: a */
    private final long f63833a;

    /* renamed from: b */
    private final long f63834b;

    /* renamed from: c */
    private final int f63835c;

    /* renamed from: d */
    private final CountDownLatch f63836d;

    public aeui(long j, long j2, int i, CountDownLatch countDownLatch) {
        this.f63833a = j;
        this.f63834b = j2;
        this.f63835c = i;
        this.f63836d = countDownLatch;
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        long j = this.f63833a;
        long j2 = this.f63834b;
        int i = this.f63835c;
        CountDownLatch countDownLatch = this.f63836d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis() - location.getTime();
        GcmReceiverChimeraService.m67041a(true, currentTimeMillis, elapsedRealtime, j, location.getAccuracy());
        if (currentTimeMillis <= j2 && location.getAccuracy() <= ((float) i)) {
            countDownLatch.countDown();
        }
    }
}
