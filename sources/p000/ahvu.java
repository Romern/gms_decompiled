package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvu */
public final /* synthetic */ class ahvu implements Runnable {

    /* renamed from: a */
    private final ahwb f68186a;

    /* renamed from: b */
    private final BluetoothDevice f68187b;

    /* renamed from: c */
    private final String f68188c;

    public ahvu(ahwb ahwb, BluetoothDevice bluetoothDevice, String str) {
        this.f68186a = ahwb;
        this.f68187b = bluetoothDevice;
        this.f68188c = str;
    }

    public final void run() {
        ahwb ahwb = this.f68186a;
        BluetoothDevice bluetoothDevice = this.f68187b;
        ahwb.mo37218a(bluetoothDevice, new ahvw(ahwb, bluetoothDevice, this.f68188c));
    }
}
