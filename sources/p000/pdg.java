package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: pdg */
final /* synthetic */ class pdg implements Runnable {

    /* renamed from: a */
    private final pdz f38867a;

    /* renamed from: b */
    private final BluetoothDevice f38868b;

    public pdg(pdz pdz, BluetoothDevice bluetoothDevice) {
        this.f38867a = pdz;
        this.f38868b = bluetoothDevice;
    }

    public final void run() {
        this.f38867a.f38936m = this.f38868b;
    }
}
