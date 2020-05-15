package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcd f87338a;

    public arcc(arcd arcd) {
        this.f87338a = arcd;
    }

    public final void run() {
        arcd arcd = this.f87338a;
        ardc ardc = arcd.f87340b;
        arit arit = arcd.f87339a;
        D2DDevice d2DDevice = arcd.f87341c;
        BootstrapConfigurations bootstrapConfigurations = arcd.f87342d;
        arin arin = arcd.f87343e;
        sdo.m34964a(ardc.f87414c);
        int i = 2;
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 5);
        arbt arbt = ardc.f87415d;
        if (!cgpg.m146451e()) {
            sdo.checkIfNull(d2DDevice, "device should not be null.");
        }
        sdo.checkIfNull(arin, "bootstrapListener should not be null.");
        if (!arbt.mo48381b()) {
            arbt.f87315a.mo25418e("No connection established. Before bootstrapping, you should connect to the device", new Object[0]);
            arbt.m72423d(arit, new Status(10567));
        } else if (arbt.f87321g != null) {
            arbt.f87315a.mo25418e("Bootstrap already in progress.", new Object[0]);
            arbt.m72423d(arit, new Status(10561));
        } else {
            if (!cgpg.m146451e() || d2DDevice != null) {
                sdo.checkIfNull(arbt.f87324j, "mTargetDevice should not be null!");
                if (!sdg.m34949a(d2DDevice.f107875d, arbt.f87324j.f107875d)) {
                    arbt.f87315a.mo25418e("Device that should be bootstrapped does not match device we're currently connected to.", new Object[0]);
                    arbt.m72423d(arit, new Status(10568));
                    return;
                }
            }
            Status status = new Status(8);
            try {
                arbt.f87321g = arin;
                if (!cgpg.m146451e()) {
                    arbt.mo48380a(bootstrapConfigurations, d2DDevice.f107873b);
                } else {
                    D2DDevice d2DDevice2 = arbt.f87324j;
                    if (d2DDevice2 != null) {
                        i = d2DDevice2.f107873b;
                    }
                    arbt.mo48380a(bootstrapConfigurations, i);
                }
                status = new Status(0);
            } finally {
                arbt.m72423d(arit, status);
            }
        }
    }
}
