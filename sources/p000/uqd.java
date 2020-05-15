package p000;

/* renamed from: uqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f48512a;

    /* renamed from: b */
    final /* synthetic */ uts f48513b;

    public uqd(uts uts, boolean z) {
        this.f48513b = uts;
        this.f48512a = z;
    }

    public final void run() {
        if (this.f48512a) {
            uts uts = this.f48513b;
            uqe uqe = uts.f48633c;
            long j = uts.f48631a.f48366m;
            sbw sbw = uqe.f48514a;
            umd a = uqe.f48517d.mo27875a(j);
            if (a != null) {
                int i = a.f48197e;
                if (i <= 0) {
                    uqe.f48514a.mo25374b("EventDistributor", "Snooze on event without attempts %d", Integer.valueOf(i));
                    i = 1;
                }
                a.f48197e = i - 1;
                int i2 = a.f48198f;
                a.f48198f = i2 + 1;
                double pow = Math.pow((double) uqe.f48519f, (double) i2);
                long j2 = uqe.f48518e;
                long currentTimeMillis = System.currentTimeMillis();
                double d = (double) j2;
                Double.isNaN(d);
                a.f48196d = currentTimeMillis + ((long) (d * pow));
                a.mo27725t();
                return;
            }
            uqe.f48514a.mo25377c("EventDistributor", "Persisted event not found on snooze");
            return;
        }
        uts uts2 = this.f48513b;
        uqe uqe2 = uts2.f48633c;
        umd umd = uts2.f48631a;
        upx upx = uts2.f48632b;
        sbw sbw2 = uqe.f48514a;
        uqe2.mo27861a(umd, upx, 0);
    }
}
