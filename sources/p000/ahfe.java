package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ahfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfe extends ahdr {

    /* renamed from: f */
    public static final /* synthetic */ int f67099f = 0;

    /* renamed from: g */
    private static final bnsp f67100g = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: a */
    public final Handler f67101a;

    /* renamed from: b */
    public ahct f67102b;

    /* renamed from: c */
    public final Context f67103c;

    /* renamed from: d */
    public final CountDownLatch f67104d;

    /* renamed from: e */
    public final ServiceConnection f67105e = new ahev(this, "nearby");

    public ahfe(Context context, Handler handler) {
        this.f67103c = context;
        this.f67101a = handler;
        this.f67102b = null;
        this.f67104d = new CountDownLatch(1);
    }

    /* renamed from: a */
    public final String mo36351a() {
        ahct b = mo36391b();
        if (b == null) {
            return null;
        }
        if (b.mo36320b()) {
            String str = b.f67010b.f67043u;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Target device does not have token set yet.");
        }
        throw new IllegalStateException("The device is not in target mode.");
    }

    /* renamed from: b */
    public final ahct mo36391b() {
        try {
            this.f67104d.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) f67100g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahfe", "b", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get Nearby.Direct service");
        }
        return this.f67102b;
    }

    /* renamed from: a */
    public final void mo36352a(ahdp ahdp) {
        this.f67101a.post(new ahfc(this, ahdp));
    }

    /* renamed from: a */
    public final void mo36353a(ConnectRequest connectRequest) {
        this.f67101a.post(new ahfa(this, connectRequest));
    }

    /* renamed from: a */
    public final void mo36354a(ContinueConnectRequest continueConnectRequest) {
        this.f67101a.post(new ahfb(this, continueConnectRequest));
    }

    /* renamed from: a */
    public final void mo36355a(DisableTargetRequest disableTargetRequest) {
        this.f67101a.post(new ahez(this, disableTargetRequest));
    }

    /* renamed from: a */
    public final void mo36356a(DisconnectRequest disconnectRequest) {
        this.f67101a.post(new ahfd(this, disconnectRequest));
    }

    /* renamed from: a */
    public final void mo36357a(EnableTargetRequest enableTargetRequest) {
        this.f67101a.post(new ahey(this, enableTargetRequest));
    }

    /* renamed from: a */
    public final void mo36358a(SendDataRequest sendDataRequest) {
        this.f67101a.post(new aheu(this, sendDataRequest));
    }

    /* renamed from: a */
    public final void mo36359a(StartScanRequest startScanRequest) {
        this.f67101a.post(new ahew(this, startScanRequest));
    }

    /* renamed from: a */
    public final void mo36360a(StopScanRequest stopScanRequest) {
        this.f67101a.post(new ahex(this, stopScanRequest));
    }
}
