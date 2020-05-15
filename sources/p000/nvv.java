package p000;

import android.os.SystemClock;

/* renamed from: nvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nvx f36695a;

    public nvv(nvx nvx) {
        this.f36695a = nvx;
    }

    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nvx nvx = this.f36695a;
        long j = elapsedRealtime - nvx.f36701b;
        long j2 = nvx.f36704e;
        if (j < j2) {
            nvx.mo21730a(j2 - j);
        } else if (!nvx.f36702c) {
            nvx.f36700a.removeCallbacksAndMessages(null);
            nvx.f36702c = true;
            nvx.mo21734d();
        }
    }
}
