package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvy */
final /* synthetic */ class ahvy implements Runnable {

    /* renamed from: a */
    private final ahwb f68197a;

    /* renamed from: b */
    private final BluetoothDevice f68198b;

    public ahvy(ahwb ahwb, BluetoothDevice bluetoothDevice) {
        this.f68197a = ahwb;
        this.f68198b = bluetoothDevice;
    }

    public final void run() {
        ahwb ahwb = this.f68197a;
        ahwb.mo37219b(this.f68198b).f68201a = ahwb.f68207b.mo20506b() + cfog.f184854a.mo6606a().mo81976aK();
    }
}
