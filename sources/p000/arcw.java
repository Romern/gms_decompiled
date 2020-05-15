package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcx f87391a;

    public arcw(arcx arcx) {
        this.f87391a = arcx;
    }

    public final void run() {
        Status status;
        arcx arcx = this.f87391a;
        ardc ardc = arcx.f87393b;
        arit arit = arcx.f87392a;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 3);
        arbt arbt = ardc.f87415d;
        arbt.f87315a.mo25412b("Stopping scan for target devices.", new Object[0]);
        if (arbt.f87323i == null) {
            arbt.f87315a.mo25418e("Source device is not scanning.", new Object[0]);
            arbt.m72421b(arit, new Status(10559));
            return;
        }
        Status status2 = new Status(8);
        try {
            arbb arbb = arbt.f87320f;
            ahco ahco = ((arbj) ((aras) arbb).f87231a).f87276b;
            arbr arbr = ((aras) arbb).f87232b;
            arbr.f87299b.logVerbose("Stopping scan.", new Object[0]);
            arbr.mo48373b();
            arbr.f87307j.clear();
            Status a = ascs.m73792a(aucu.m76781a(((ahej) ahco).f67076a.mo37435a((rjx) ahco, "scan"), aucu.m76778a((Object) null)));
            if (!a.mo17710c()) {
                Logger Logger = arbt.f87315a;
                String valueOf = String.valueOf(ahcu.m55496a(a.f30115i));
                Logger.mo25418e(valueOf.length() == 0 ? new String("Error while stopping Nearby scan: ") : "Error while stopping Nearby scan: ".concat(valueOf), new Object[0]);
                status = new Status(10557);
            } else {
                status = new Status(0);
            }
        } finally {
            arbt.m72421b(arit, status2);
            arbt.mo48385f();
        }
    }
}
