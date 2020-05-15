package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* renamed from: arcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcv f87386a;

    public arcu(arcv arcv) {
        this.f87386a = arcv;
    }

    public final void run() {
        arcv arcv = this.f87386a;
        ardc ardc = arcv.f87389c;
        arit arit = arcv.f87387a;
        ariz ariz = arcv.f87388b;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 2);
        arbt arbt = ardc.f87415d;
        sdo.checkIfNull(ariz, "scanListener is null.");
        if (arbt.f87323i == null) {
            arbt.f87323i = new ardu(ariz);
            Status a = arbt.f87318d.mo49051a();
            if (!a.mo17710c()) {
                arbt.f87315a.mo25412b("Failed to initialize resources.", new Object[0]);
                arbt.f87323i.mo48218a(a.f30115i);
                arbt.mo48385f();
                arbt.mo48384e();
                arbt.m72420a(arit, a);
                return;
            }
            arbt.f87315a.mo25412b("Scanning for target devices.", new Object[0]);
            arbb arbb = arbt.f87320f;
            ardt ardt = arbt.f87323i;
            aras aras = (aras) arbb;
            aras.f87233c = 1;
            aucb[] aucbArr = new aucb[2];
            arbb arbb2 = aras.f87231a;
            arbj.f87275a.logVerbose("Starting scan through Nearby Bootstrap", new Object[0]);
            arbj arbj = (arbj) arbb2;
            arbj.f87278d = ardt;
            ahco ahco = arbj.f87276b;
            arbi arbi = arbj.f87281g;
            ahek ahek = ahek.f67077a;
            ahdu ahdu = (ahdu) ahek.f67078b.get(arbi);
            if (ahdu == null) {
                ahdu = new ahdu(arbi);
                ahek.f67078b.put(arbi, ahdu);
            }
            ahej ahej = (ahej) ahco;
            rjx rjx = (rjx) ahco;
            rod a2 = ahej.f67076a.mo37440a(rjx, new Object(), "scan");
            rob rob = a2.f43429b;
            sdo.checkIfNull(rob, "Key must not be null");
            aucbArr[0] = ahej.f67076a.mo37437a(rjx, new ahee(a2, ahdu), new ahef(rob));
            arbr arbr = aras.f87232b;
            arbr.f87299b.logVerbose("Starting scan via Nearby Connections.", new Object[0]);
            arbr.f87303f = ardt;
            ahik ahik = new ahik();
            ahik.mo36534a(arbr.f87298a);
            DiscoveryOptions discoveryOptions = ahik.f67244a;
            ahin ahin = arbr.f87309l;
            aucbArr[1] = arbr.f87300c.mo36520a(cgqs.m146601g(), ahin, discoveryOptions);
            Status a3 = ascs.m73792a(aucu.m76781a(aucbArr));
            if (!a3.mo17710c()) {
                a3 = new Status(10557);
            }
            arbt.m72420a(arit, a3);
            return;
        }
        arbt.f87315a.mo25418e("Source device is already scanning.", new Object[0]);
        arbt.m72420a(arit, new Status(10558));
    }
}
