package p000;

import android.content.Context;

/* renamed from: ytm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ytm {

    /* renamed from: a */
    public final qws f54593a;

    /* renamed from: b */
    public final qxq f54594b;

    public ytm(Context context) {
        qws qws = new qws(context, "FITNESS_GMS_CORE", null);
        this.f54593a = qws;
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        qxq qxq = new qxq(this.f54593a, "FITNESS_GMS_COUNTERS", 3600);
        this.f54594b = qxq;
        qxq.mo24374a();
        this.f54594b.mo24375a(snp.m35703a(1, 10), 3600000);
    }
}
