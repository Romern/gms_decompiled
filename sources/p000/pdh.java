package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: pdh */
final /* synthetic */ class pdh implements Runnable {

    /* renamed from: a */
    private final pdz f38869a;

    /* renamed from: b */
    private final BluetoothDevice f38870b;

    public pdh(pdz pdz, BluetoothDevice bluetoothDevice) {
        this.f38869a = pdz;
        this.f38870b = bluetoothDevice;
    }

    public final void run() {
        pdz pdz = this.f38869a;
        BluetoothDevice bluetoothDevice = this.f38870b;
        BluetoothDevice bluetoothDevice2 = pdz.f38936m;
        if (bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
            pdz.mo22948a(dcm.BT_HFP_A2DP_DISCONNECTED);
            pdz.mo22960g();
        }
    }
}
