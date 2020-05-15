package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: xyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xyv implements Runnable {

    /* renamed from: k */
    private static final Logger f53401k = new Logger(new String[]{"BleRequestOperation"}, (short[]) null);

    /* renamed from: a */
    public final xyw f53402a;

    /* renamed from: b */
    private final xwj f53403b;

    /* renamed from: c */
    private final xjg f53404c;

    /* renamed from: d */
    private final xfk f53405d;

    /* renamed from: e */
    private final xws f53406e;

    /* renamed from: f */
    private final xyx f53407f;

    /* renamed from: g */
    private final xgm f53408g;

    /* renamed from: h */
    private final BluetoothDevice f53409h;

    /* renamed from: i */
    private final xfo f53410i;

    /* renamed from: j */
    private final Handler f53411j;

    public xyv(xwj xwj, xjg xjg, xfk xfk, xws xws, BluetoothDevice bluetoothDevice, xfo xfo, xyw xyw, Handler handler, xgm xgm, xyx xyx) {
        this.f53403b = xwj;
        bmxy.m108581a(xjg);
        this.f53404c = xjg;
        bmxy.m108581a(xfk);
        this.f53405d = xfk;
        this.f53406e = xws;
        bmxy.m108581a(bluetoothDevice);
        this.f53409h = bluetoothDevice;
        bmxy.m108581a(xfo);
        this.f53410i = xfo;
        bmxy.m108581a(xyw);
        this.f53402a = xyw;
        bmxy.m108581a(handler);
        this.f53411j = handler;
        bmxy.m108581a(xgm);
        this.f53408g = xgm;
        bmxy.m108581a(xyx);
        this.f53407f = xyx;
    }

    public final void run() {
        ResponseData responseData;
        bqgg c;
        try {
            BluetoothDevice bluetoothDevice = this.f53409h;
            xfo xfo = this.f53410i;
            this.f53404c.mo29833b().get();
            try {
                responseData = this.f53405d.mo29706a(xfo);
                this.f53408g.mo29736a(bluetoothDevice);
                c = this.f53404c.mo29834c();
            } catch (xfv e) {
                f53401k.mo25417e("Error when communicating with the security key.", e, new Object[0]);
                xws xws = this.f53406e;
                if (xws != null) {
                    xws.mo30184a(this.f53403b, e);
                }
                responseData = e.mo29712a();
                c = this.f53404c.mo29834c();
            }
            c.get();
        } catch (InterruptedException | ExecutionException e2) {
            f53401k.mo25417e("Error when communicating with the security key.", e2, new Object[0]);
            xws xws2 = this.f53406e;
            if (xws2 != null) {
                xws2.mo30184a(this.f53403b, e2);
            }
            responseData = xfv.m42834a(28416).mo29712a();
        } catch (Throwable th) {
            this.f53404c.mo29834c().get();
            throw th;
        }
        Future future = this.f53407f.f53413a;
        if (future == null) {
            xyx.f53412d.mo25416d("isCancelled check invoked on Ble request operation that has not been assigned yet.", new Object[0]);
        } else if (future.isCancelled()) {
            return;
        }
        this.f53411j.post(new xyt(this, responseData));
    }
}
