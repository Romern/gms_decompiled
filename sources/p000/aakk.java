package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aakk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakk {

    /* renamed from: a */
    public final qxq f28364a;

    /* renamed from: b */
    private final qws f28365b;

    /* renamed from: c */
    private final aeat f28366c;

    /* renamed from: d */
    private aajf f28367d;

    public aakk(qws qws, qxq qxq, aeat aeat) {
        this.f28365b = qws;
        this.f28364a = qxq;
        this.f28366c = aeat;
        qws.mo24337a(cagz.m126622a(2));
        qxq.mo24375a(snp.m35703a(1, 10), bqcn.m112578a(TimeUnit.HOURS.toMillis(1)));
        qxq.mo24374a();
        if (cecz.m136056d() > 0) {
            aebl aebl = new aebl();
            aebl.f63099k = "LogPhenotypeExperimentIds";
            aebl.f63097i = "com.google.android.gms.gcm.HeartbeatAlarm$ConnectionInfoPersistService";
            aebl.f63070a = cecz.m136056d();
            aebl.f63071b = TimeUnit.HOURS.toSeconds(1);
            aebl.f63102n = true;
            aebl.mo34029b(false);
            this.f28366c.mo33984a(aebl.mo33974b());
        }
    }

    /* renamed from: a */
    public final aajf mo16930a() {
        qws qws;
        if (this.f28367d == null) {
            ScheduledExecutorService a = adzl.f62962b.mo25877a(1, 1);
            if (!cecz.f182285a.mo6606a().mo78828at()) {
                qws = new qws(rpr.m34216b(), "STREAMZ_GCM", null);
            } else {
                qws = qws.m33019a(rpr.m34216b(), "STREAMZ_GCM");
            }
            this.f28367d = new aajf(a, new beof(qws, "STREAMZ_GCM"), "gmscore_gcm");
        }
        return this.f28367d;
    }

    /* renamed from: a */
    public final void mo16931a(aaql aaql) {
        this.f28365b.mo24335a(aaql.mo73642k()).mo24327b();
    }
}
