package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvs */
public final /* synthetic */ class ahvs implements Runnable {

    /* renamed from: a */
    private final ahwb f68181a;

    /* renamed from: b */
    private final BluetoothDevice f68182b;

    public ahvs(ahwb ahwb, BluetoothDevice bluetoothDevice) {
        this.f68181a = ahwb;
        this.f68182b = bluetoothDevice;
    }

    public final void run() {
        ahwb ahwb = this.f68181a;
        BluetoothDevice bluetoothDevice = this.f68182b;
        ahwb.mo37218a(bluetoothDevice, new ahvy(ahwb, bluetoothDevice));
    }
}
