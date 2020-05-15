package p000;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: pdk */
final /* synthetic */ class pdk implements Runnable {

    /* renamed from: a */
    private final pdz f38874a;

    /* renamed from: b */
    private final BluetoothSocket f38875b;

    public pdk(pdz pdz, BluetoothSocket bluetoothSocket) {
        this.f38874a = pdz;
        this.f38875b = bluetoothSocket;
    }

    public final void run() {
        pdz pdz = this.f38874a;
        BluetoothSocket bluetoothSocket = this.f38875b;
        if (bluetoothSocket != null) {
            if (bluetoothSocket.isConnected()) {
                pdz.f38912P.mo22596a();
                pdz.mo22954b(bluetoothSocket);
                return;
            }
            try {
                bluetoothSocket.close();
            } catch (IOException e) {
            }
        }
        synchronized (pdz.f38925b) {
            if (dcm.CONNECTING_BT.equals(pdz.f38927d)) {
                pdz.f38948y.post(pdz.f38908L);
            } else if (dcm.IDLE.equals(pdz.f38927d)) {
                pdz.mo22960g();
            }
        }
    }
}
