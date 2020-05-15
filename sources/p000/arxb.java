package p000;

import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: arxb */
public final /* synthetic */ class arxb implements aubq {

    /* renamed from: a */
    private final arxy f88399a;

    /* renamed from: b */
    private final ConnectionRequest f88400b;

    public arxb(arxy arxy, ConnectionRequest connectionRequest) {
        this.f88399a = arxy;
        this.f88400b = connectionRequest;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        arxy arxy = this.f88399a;
        ConnectionRequest connectionRequest = this.f88400b;
        if (aucb.mo50384b()) {
            arxy.f88430a.mo25412b("Disconnect from previous connection succeeded, waiting for Bluetooth cleanup", new Object[0]);
            snp.m35703a(1, 9).mo25814a(new arxg(arxy, connectionRequest), cgpa.f187426a.mo6606a().mo84223q(), TimeUnit.MILLISECONDS).mo741a(arxh.f88407a, bqfb.INSTANCE);
            return;
        }
        arxy.f88430a.logVerbose("Disconnect failed, likely no connection in progress", new Object[0]);
        arxy.f88432c.mo48360a(connectionRequest, arxy.f88437h).mo50372a(new arxi(arxy));
    }
}
