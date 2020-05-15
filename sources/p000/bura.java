package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* renamed from: bura */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bura implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ burc f154752a;

    public bura(burc burc) {
        this.f154752a = burc;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        burx burx;
        bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
        bnsl.mo68432a("bura", "onServiceConnected", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("FastPair: DeviceStatusServiceConnUtil connected with DiscoveryService");
        synchronized (this.f154752a) {
            burc burc = this.f154752a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDeviceStatusService");
                burx = !(queryLocalInterface instanceof burx) ? new burv(iBinder) : (burx) queryLocalInterface;
            } else {
                burx = null;
            }
            burc.f154753a = burx;
        }
        this.f154752a.f154756d.mo29390a();
        this.f154752a.f154754b.countDown();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f154752a) {
            burc burc = this.f154752a;
            burc.f154753a = null;
            if (!burc.f154755c) {
                bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
                bnsl.mo68432a("bura", "onServiceDisconnected", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPair: DeviceStatusServiceConnUtil disconnected with DiscoveryService when service stopped, ignore.");
            } else {
                burc.f154755c = false;
                burc.mo73022a();
                bnsl bnsl2 = (bnsl) busr.f154819a.mo68390d();
                bnsl2.mo68432a("bura", "onServiceDisconnected", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FastPair: DeviceStatusServiceConnUtil disconnected with DiscoveryService accidentally, start service again!");
            }
        }
        this.f154752a.f154756d.mo29391b();
        this.f154752a.f154754b = new CountDownLatch(1);
    }
}
