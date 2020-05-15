package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: zyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyf {

    /* renamed from: a */
    final qxq f56171a;

    /* renamed from: b */
    final boolean f56172b;

    /* renamed from: c */
    private final Context f56173c = rpr.m34216b();

    public zyf() {
        qws qws = new qws(this.f56173c, "GMSCORE_API_COUNTERS", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        qxq qxq = new qxq(qws, qws.f42340g, 100);
        this.f56171a = qxq;
        qxq.mo24374a();
        this.f56172b = cdiv.m133521b();
    }

    /* renamed from: a */
    public final void mo31586a(Status status) {
        if (this.f56172b) {
            this.f56171a.mo24385d("132-FontsProvider").mo24367a(status.f30115i);
            this.f56171a.mo24388e();
        }
    }
}
