package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;

/* renamed from: ahwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahwj implements busx {

    /* renamed from: a */
    final /* synthetic */ ahwk f68224a;

    public ahwj(ahwk ahwk) {
        this.f68224a = ahwk;
    }

    /* renamed from: a */
    public final void mo37228a() {
    }

    /* renamed from: a */
    public final void mo37230a(int i, BluetoothProfile bluetoothProfile) {
    }

    /* renamed from: a */
    public final void mo37229a(int i, int i2, int i3, BluetoothDevice bluetoothDevice) {
        if (i3 == 0) {
            String address = bluetoothDevice.getAddress();
            if (!this.f68224a.mo37238b(address)) {
                ahwk ahwk = this.f68224a;
                for (BatteryAdvertisement batteryAdvertisement : ahwk.f68226b.values()) {
                    if (address.equals(batteryAdvertisement.f80504a)) {
                        ahwk.f68225a.mo37241a(address);
                        batteryAdvertisement.f80521r = true;
                        return;
                    }
                }
            }
        }
    }
}
