package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvv */
final /* synthetic */ class ahvv implements Runnable {

    /* renamed from: a */
    private final ahwb f68189a;

    /* renamed from: b */
    private final BluetoothDevice f68190b;

    public ahvv(ahwb ahwb, BluetoothDevice bluetoothDevice) {
        this.f68189a = ahwb;
        this.f68190b = bluetoothDevice;
    }

    public final void run() {
        ahwb ahwb = this.f68189a;
        BluetoothDevice bluetoothDevice = this.f68190b;
        if (ahwb.f68209d.containsKey(bluetoothDevice)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RetroactivePairManager: Remove info for device (%s)", bluetoothDevice);
            ahwb.f68209d.remove(bluetoothDevice);
        }
    }
}
