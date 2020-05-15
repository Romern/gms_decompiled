package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;

/* renamed from: auth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1659auth implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f92483a;

    /* renamed from: b */
    final /* synthetic */ long f92484b;

    /* renamed from: c */
    final /* synthetic */ BluetoothTrustletChimeraService f92485c;

    public C1659auth(BluetoothTrustletChimeraService bluetoothTrustletChimeraService, BluetoothDevice bluetoothDevice, long j) {
        this.f92485c = bluetoothTrustletChimeraService;
        this.f92483a = bluetoothDevice;
        this.f92484b = j;
    }

    public final void run() {
        if (auuj.m77862c(this.f92483a)) {
            long currentTimeMillis = System.currentTimeMillis();
            BluetoothTrustletChimeraService.f109169a.mo50711a("Bluetooth %s has been connecting for %f secs. Save its connection property", this.f92483a.getAddress(), Float.valueOf(((float) (currentTimeMillis - this.f92484b)) / 1000.0f));
            this.f92485c.f109173h.mo50728a(auuj.m77872k(this.f92483a.getAddress()), auuj.m77860b(this.f92483a));
            this.f92485c.f109173h.mo50737d();
        }
        this.f92485c.f109174i.remove(this.f92483a);
    }
}
