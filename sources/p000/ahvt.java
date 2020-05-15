package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvt */
public final /* synthetic */ class ahvt implements Runnable {

    /* renamed from: a */
    private final ahwb f68183a;

    /* renamed from: b */
    private final BluetoothDevice f68184b;

    /* renamed from: c */
    private final String f68185c;

    public ahvt(ahwb ahwb, BluetoothDevice bluetoothDevice, String str) {
        this.f68183a = ahwb;
        this.f68184b = bluetoothDevice;
        this.f68185c = str;
    }

    public final void run() {
        ahwb ahwb = this.f68183a;
        BluetoothDevice bluetoothDevice = this.f68184b;
        ahwb.mo37218a(bluetoothDevice, new ahvx(ahwb, bluetoothDevice, this.f68185c));
    }
}
