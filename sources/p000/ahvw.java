package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvw */
final /* synthetic */ class ahvw implements Runnable {

    /* renamed from: a */
    private final ahwb f68191a;

    /* renamed from: b */
    private final BluetoothDevice f68192b;

    /* renamed from: c */
    private final String f68193c;

    public ahvw(ahwb ahwb, BluetoothDevice bluetoothDevice, String str) {
        this.f68191a = ahwb;
        this.f68192b = bluetoothDevice;
        this.f68193c = str;
    }

    public final void run() {
        this.f68191a.mo37219b(this.f68192b).f68203c = this.f68193c;
    }
}
