package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aves */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aves {

    /* renamed from: a */
    public final beoq f93028a;

    /* renamed from: b */
    public final bmzi f93029b = bmzn.m108681a((bmzi) new avem(this));

    /* renamed from: c */
    public final bmzi f93030c = bmzn.m108681a((bmzi) new aven(this));

    /* renamed from: d */
    public final bmzi f93031d;

    /* renamed from: e */
    private final beoo f93032e;

    /* renamed from: f */
    private final bmzi f93033f;

    public aves(ScheduledExecutorService scheduledExecutorService, beor beor, String str) {
        bmzn.m108681a((bmzi) new aveo(this));
        this.f93031d = bmzn.m108681a((bmzi) new avep(this));
        this.f93033f = bmzn.m108681a((bmzi) new aveq(this));
        bmzn.m108681a((bmzi) new aver(this));
        beoq a = beoq.m95364a(str);
        this.f93028a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f93032e = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f93032e = beox.m95372a(beor, scheduledExecutorService, this.f93028a, null);
    }

    /* renamed from: a */
    public final void mo51185a() {
        ((beon) this.f93033f.mo6606a()).mo60861b(true);
    }
}
