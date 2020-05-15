package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: arcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arcz f87395a;

    public arcy(arcz arcz) {
        this.f87395a = arcz;
    }

    public final void run() {
        arcz arcz = this.f87395a;
        ardc ardc = arcz.f87397b;
        arit arit = arcz.f87396a;
        BootstrapConfigurations bootstrapConfigurations = arcz.f87398c;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 9);
        arbt arbt = ardc.f87415d;
        if (!arbt.mo48381b()) {
            arbt.f87315a.mo25418e("No connection established. Before bootstrapping, you should connect to the device", new Object[0]);
            arbt.m72423d(arit, new Status(10567));
            return;
        }
        Status status = new Status(8);
        try {
            arbt.mo48379a(bootstrapConfigurations);
            status = new Status(0);
        } finally {
            arbt.m72424e(arit, status);
        }
    }
}
