package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arck implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcl f87361a;

    public arck(arcl arcl) {
        this.f87361a = arcl;
    }

    public final void run() {
        Status status;
        arcl arcl = this.f87361a;
        ardc ardc = arcl.f87363b;
        arit arit = arcl.f87362a;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 7);
        arbt arbt = ardc.f87415d;
        arbt.f87315a.mo25412b("Disconnecting", new Object[0]);
        if (!arbt.mo48381b()) {
            arbt.f87315a.mo25418e("No connection in progress.", new Object[0]);
            arbt.m72426g(arit, new Status(10567));
            return;
        }
        Status status2 = new Status(8);
        try {
            Status a = ascs.m73792a(arbt.f87320f.mo48353a());
            if (a.mo17710c()) {
                status = new Status(0);
            } else if (a.f30115i != 10567) {
                status = new Status(10557);
            } else {
                status = new Status(10567);
            }
        } finally {
            arbt.mo48383d();
            arbt.m72426g(arit, status2);
        }
    }
}
