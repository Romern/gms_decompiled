package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: hez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hez {

    /* renamed from: a */
    public final List f19630a = new ArrayList();

    /* renamed from: b */
    private final ScheduledExecutorService f19631b;

    public hez(ScheduledExecutorService scheduledExecutorService) {
        this.f19631b = scheduledExecutorService;
    }

    /* renamed from: a */
    public final bqgg mo12447a(adbj adbj, bqgg bqgg, long j, TimeUnit timeUnit) {
        hey hey = new hey(adbj, bqgg);
        this.f19630a.add(hey);
        bqga.m112781a(bqgg, hey, bqfb.INSTANCE);
        return bqga.m112773a(bqgg, j, timeUnit, this.f19631b);
    }

    /* renamed from: a */
    public final void mo12448a(adbj adbj, bqgg bqgg) {
        hey hey = new hey(adbj, bqgg);
        this.f19630a.add(hey);
        bqga.m112781a(bqgg, hey, bqfb.INSTANCE);
    }
}
