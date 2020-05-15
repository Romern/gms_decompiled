package p000;

import android.os.SystemClock;

/* renamed from: qxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxn {

    /* renamed from: a */
    final /* synthetic */ qxq f42370a;

    /* renamed from: b */
    private final long f42371b = SystemClock.elapsedRealtime();

    public qxn(qxq qxq) {
        this.f42370a = qxq;
        sqv sqv = this.f42370a.f42383d;
    }

    /* renamed from: a */
    public final void mo24369a(qxp qxp) {
        qxq qxq = this.f42370a;
        qxk qxk = qxq.f42376a;
        sqv sqv = qxq.f42383d;
        qxp.mo24356a(SystemClock.elapsedRealtime() - this.f42371b, qxq.f42377b);
    }
}
