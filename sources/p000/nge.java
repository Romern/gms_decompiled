package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.concurrent.TimeUnit;

/* renamed from: nge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nge implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    final /* synthetic */ ngg f35478a;

    public nge(ngg ngg) {
        this.f35478a = ngg;
    }

    public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        synchronized (this.f35478a.f35485c) {
            if (bluetoothDevice != null) {
                String valueOf = String.valueOf(bluetoothDevice);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
                sb.append("Scan result received, timestamp (nanos)=");
                sb.append(nanos);
                sb.append(", device=");
                sb.append(valueOf);
                sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("Scan result (null) received, timestamp (nanos)=");
                sb2.append(nanos);
                sb2.toString();
            }
            this.f35478a.f35485c.add(new ngf(bluetoothDevice, i, bArr, nanos));
        }
    }
}
