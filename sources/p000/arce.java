package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import java.util.concurrent.ExecutionException;

/* renamed from: arce */
final /* synthetic */ class arce implements Runnable {

    /* renamed from: a */
    private final arcf f87345a;

    public arce(arcf arcf) {
        this.f87345a = arcf;
    }

    public final void run() {
        aucb aucb;
        Status status;
        arcf arcf = this.f87345a;
        ardc ardc = arcf.f87347b;
        ConnectParams connectParams = arcf.f87346a;
        sdo.m34964a(ardc.f87414c);
        ardc.f87413b.mo48652e(2);
        armj.m73128a(ardc.f87413b, 21);
        arit arit = connectParams.f108000a;
        if (arit == null) {
            ardc.f87412a.mo25416d("connect2 received null device callbacks", new Object[0]);
            return;
        }
        arbt arbt = ardc.f87415d;
        ConnectionRequest connectionRequest = connectParams.f108001b;
        arbt.f87322h = connectParams.f108002c;
        sdo.checkIfNull(arit, "SourceDeviceCallbacks must not be null!");
        if (connectionRequest == null || arbt.f87322h == null) {
            arbt.m72422c(arit, new Status(10594));
            return;
        }
        D2DDevice d2DDevice = connectionRequest.f107865a;
        int i = 4;
        if (!cgql.m146579d()) {
            if (d2DDevice == null || d2DDevice.f107873b == 2) {
                arbt.f87317c.mo48653f(4);
            } else {
                arbt.m72422c(arit, new Status(13));
                return;
            }
        } else if (d2DDevice != null) {
            armh armh = arbt.f87317c;
            int i2 = d2DDevice.f107873b;
            if (i2 == 1) {
                i = 2;
            } else if (i2 != 2) {
                i = 1;
            }
            armh.mo48653f(i);
        } else {
            arbt.f87317c.mo48653f(4);
        }
        if (!arbt.mo48381b()) {
            if (cgqs.m146600f()) {
                arbt.f87319e.mo48532c();
            }
            arbt.f87325k = false;
            arbt.f87324j = d2DDevice;
            Logger Logger = arbt.f87315a;
            arbb arbb = arbt.f87320f;
            armu a = arbt.mo48376a(arbt.f87322h);
            if (!cgql.m146579d()) {
                aras aras = (aras) arbb;
                aras.f87233c = 3;
                aucb = aras.f87232b.mo48369a(connectionRequest, a);
            } else {
                D2DDevice d2DDevice2 = connectionRequest.f107865a;
                if (d2DDevice2 == null) {
                    aras aras2 = (aras) arbb;
                    aras2.f87233c = 3;
                    aucb = aras2.f87232b.mo48369a(connectionRequest, a);
                } else {
                    int i3 = d2DDevice2.f107873b;
                    if (i3 == 1) {
                        aras aras3 = (aras) arbb;
                        aras3.f87233c = 2;
                        aucb = aras3.f87231a.mo48354a(d2DDevice2, a, connectionRequest.f107866b);
                    } else if (i3 != 2) {
                        aucb = aucu.m76777a((Exception) new rjp(new Status(13)));
                    } else {
                        aras aras4 = (aras) arbb;
                        aras4.f87233c = 3;
                        aucb = aras4.f87232b.mo48369a(connectionRequest, a);
                    }
                }
            }
            try {
                aucu.m76782a(aucb);
            } catch (InterruptedException | ExecutionException e) {
                arbt.f87315a.mo25410a(e);
            }
            if (aucb.mo50384b()) {
                status = Status.f30107a;
            } else {
                Exception e2 = aucb.mo50387e();
                if (e2 instanceof rjp) {
                    status = new Status(((rjp) e2).mo24655a());
                } else {
                    status = new Status(13);
                }
            }
            if (!status.mo17710c()) {
                arbt.f87315a.mo25418e("Connection to device failed (%s)", status);
                arbt.f87317c.mo48647b(status.f30115i);
                arbt.mo48383d();
            }
            arbt.m72422c(arit, status);
            return;
        }
        arbt.f87315a.mo25418e("Connection already in progress.", new Object[0]);
        arbt.m72422c(arit, new Status(10566));
    }
}
