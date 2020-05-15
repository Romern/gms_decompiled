package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: aphr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphr {

    /* renamed from: a */
    public final qxq f84398a;

    public aphr(qws qws) {
        qxq qxq = new qxq(qws, "GCM_COUNTERS", 1024);
        this.f84398a = qxq;
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        qxq.mo24375a(snp.m35703a(1, 10), bqcn.m112578a(TimeUnit.HOURS.toMillis(1)));
        qxq.mo24374a();
    }
}
