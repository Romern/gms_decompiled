package p000;

import android.os.SystemClock;

/* renamed from: qxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxo {

    /* renamed from: a */
    final /* synthetic */ qxp f42372a;

    /* renamed from: b */
    private final long f42373b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    private final qxp f42374c;

    public qxo(qxp qxp, qxp qxp2) {
        this.f42372a = qxp;
        this.f42374c = qxp2;
        qxq qxq = this.f42372a.f42375f;
        qxk qxk = qxq.f42376a;
        sqv sqv = qxq.f42383d;
    }

    /* renamed from: a */
    public final long mo24370a() {
        qxq qxq = this.f42372a.f42375f;
        qxk qxk = qxq.f42376a;
        sqv sqv = qxq.f42383d;
        return SystemClock.elapsedRealtime() - this.f42373b;
    }

    /* renamed from: b */
    public final void mo24371b() {
        this.f42374c.mo24356a(mo24370a(), qxq.f42377b);
    }
}
