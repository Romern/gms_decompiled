package p000;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;

/* renamed from: cirx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f191309a;

    /* renamed from: b */
    final /* synthetic */ cisd f191310b;

    public cirx(cisd cisd, Runnable runnable) {
        this.f191310b = cisd;
        this.f191309a = runnable;
    }

    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.f191310b.f191319b);
        cisd cisd = this.f191310b;
        if (cisd.f191320c) {
            ThreadStatsUid.set(cisd.f191321d);
        }
        try {
            this.f191309a.run();
            if (this.f191310b.f191320c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (this.f191310b.f191320c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            throw th;
        }
    }
}
