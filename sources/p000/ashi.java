package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ashi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashi {

    /* renamed from: a */
    public final beoq f88970a;

    /* renamed from: b */
    public final bmzi f88971b = bmzn.m108681a((bmzi) new ashg(this));

    /* renamed from: c */
    public final bmzi f88972c = bmzn.m108681a((bmzi) new ashh(this));

    /* renamed from: d */
    private final beoo f88973d;

    private ashi(ScheduledExecutorService scheduledExecutorService, beor beor, String str) {
        beoq a = beoq.m95364a(str);
        this.f88970a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f88973d = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f88973d = beox.m95372a(beor, scheduledExecutorService, this.f88970a, null);
    }

    /* renamed from: a */
    public static ashi m74130a(ScheduledExecutorService scheduledExecutorService, beor beor) {
        return new ashi(scheduledExecutorService, beor, "gmscore_subscribedfeeds");
    }

    /* renamed from: a */
    public final void mo49156a(long j) {
        ((beox) this.f88973d).f111963d = j;
    }
}
