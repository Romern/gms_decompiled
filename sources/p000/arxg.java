package p000;

import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

/* renamed from: arxg */
final /* synthetic */ class arxg implements Runnable {

    /* renamed from: a */
    private final arxy f88405a;

    /* renamed from: b */
    private final ConnectionRequest f88406b;

    public arxg(arxy arxy, ConnectionRequest connectionRequest) {
        this.f88405a = arxy;
        this.f88406b = connectionRequest;
    }

    public final void run() {
        arxy arxy = this.f88405a;
        ConnectionRequest connectionRequest = this.f88406b;
        arxy.f88430a.mo25409a("Finished waiting, connecting", new Object[0]);
        arxy.f88432c.mo48360a(connectionRequest, arxy.f88437h).mo50372a(new arxj(arxy));
    }
}
