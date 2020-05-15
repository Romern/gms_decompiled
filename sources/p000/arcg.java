package p000;

import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1658arch f87349a;

    public arcg(C1658arch arch) {
        this.f87349a = arch;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e  */
    public final void run() {
        Status status;
        aucb aucb;
        String str;
        C1658arch arch = this.f87349a;
        ardc ardc = arch.f87351b;
        arit arit = arch.f87350a;
        D2DDevice d2DDevice = arch.f87352c;
        String str2 = arch.f87353d;
        ariq ariq = arch.f87354e;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 4);
        arbt arbt = ardc.f87415d;
        sdo.checkIfNull(d2DDevice, "device cannot be null.");
        sdo.checkIfNull(ariq, "connectionListener cannot be null.");
        arbt.f87322h = ariq;
        int i = d2DDevice.f107873b;
        if (i == 1) {
            arbt.f87317c.mo48653f(2);
        } else if (i != 2) {
            Logger Logger = arbt.f87315a;
            int i2 = d2DDevice.f107873b;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Unsupported device protocol (");
            sb.append(i2);
            sb.append(") for logging device connection type!");
            Logger.mo25416d(sb.toString(), new Object[0]);
        } else {
            arbt.f87317c.mo48653f(4);
        }
        if (!arbt.mo48381b()) {
            if (cgqs.m146600f()) {
                arbt.f87319e.mo48532c();
            }
            Status status2 = new Status(8);
            arbt.f87325k = false;
            try {
                arbt.f87324j = d2DDevice;
                int i3 = d2DDevice.f107873b;
                if (i3 != 1) {
                    if (i3 != 2) {
                        status = new Status(10560);
                        if (!status.mo17710c()) {
                            arbt.f87315a.mo25418e("Connecting to %s failed %s", d2DDevice.f107874c, status);
                            arbt.f87317c.mo48647b(status.f30115i);
                            arbt.mo48383d();
                        }
                        arbt.m72422c(arit, status);
                    }
                }
                Logger logger2 = arbt.f87315a;
                String valueOf = String.valueOf(d2DDevice.f107874c);
                logger2.mo25412b(valueOf.length() == 0 ? new String("Connecting to: ") : "Connecting to: ".concat(valueOf), new Object[0]);
                Logger logger3 = arbt.f87315a;
                String valueOf2 = String.valueOf(str2);
                logger3.logVerbose(valueOf2.length() == 0 ? new String("Connecting using PIN: ") : "Connecting using PIN: ".concat(valueOf2), new Object[0]);
                arbb arbb = arbt.f87320f;
                armu a = arbt.mo48376a(ariq);
                int i4 = d2DDevice.f107873b;
                if (i4 == 1) {
                    ((aras) arbb).f87233c = 2;
                    aucb = ((aras) arbb).f87231a.mo48354a(d2DDevice, a, str2);
                } else if (i4 != 2) {
                    aucb = aucu.m76777a((Exception) new rjp(new Status(13)));
                } else {
                    ((aras) arbb).f87233c = 3;
                    aucb = ((aras) arbb).f87232b.mo48354a(d2DDevice, a, str2);
                }
                status2 = ascs.m73792a(aucb);
                try {
                    aqxl aqxl = arbt.f87316b.f87202f;
                    if (d2DDevice.f107873b != 1) {
                        str = "NearbyConnections";
                    } else {
                        str = "NearbyBootstrap";
                    }
                    ((beon) aqxl.f87036c.mo6606a()).mo60861b(str, Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(status2.f30115i));
                    status = status2;
                    if (!status.mo17710c()) {
                    }
                    arbt.m72422c(arit, status);
                } catch (Throwable th) {
                    th = th;
                    if (!status2.mo17710c()) {
                        arbt.f87315a.mo25418e("Connecting to %s failed %s", d2DDevice.f107874c, status2);
                        arbt.f87317c.mo48647b(status2.f30115i);
                        arbt.mo48383d();
                    }
                    arbt.m72422c(arit, status2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (!status2.mo17710c()) {
                }
                arbt.m72422c(arit, status2);
                throw th;
            }
        } else {
            arbt.f87315a.mo25418e("Connection already in progress.", new Object[0]);
            arbt.m72422c(arit, new Status(10566));
        }
    }
}
