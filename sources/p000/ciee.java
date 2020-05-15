package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ciee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciee implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cieg f189949a;

    public ciee(cieg cieg) {
        this.f189949a = cieg;
    }

    public final void run() {
        cieg cieg = this.f189949a;
        if (cieg.f189955e) {
            long a = cieg.mo86005a();
            cieg cieg2 = this.f189949a;
            if (cieg2.f189954d - a > 0) {
                cieg2.f189956f = cieg2.f189951a.schedule(new cief(cieg2), this.f189949a.f189954d - a, TimeUnit.NANOSECONDS);
                return;
            }
            cieg2.f189955e = false;
            cieg2.f189956f = null;
            cieg2.f189953c.run();
            return;
        }
        cieg.f189956f = null;
    }
}
