package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;

/* renamed from: pbz */
final /* synthetic */ class pbz implements Runnable {

    /* renamed from: a */
    private final pce f38803a;

    /* renamed from: b */
    private final BluetoothDevice f38804b;

    public pbz(pce pce, BluetoothDevice bluetoothDevice) {
        this.f38803a = pce;
        this.f38804b = bluetoothDevice;
    }

    public final void run() {
        pce pce = this.f38803a;
        BluetoothDevice bluetoothDevice = this.f38804b;
        BluetoothHeadset bluetoothHeadset = pce.f38817g;
        if (bluetoothHeadset != null && bluetoothDevice != null && bluetoothHeadset.getConnectionState(bluetoothDevice) != 2) {
            if (pce.f38820j.mo22596a()) {
                bluetoothDevice.getName();
            }
            pce.f38819i.mo22941a(bluetoothDevice);
        }
    }
}
