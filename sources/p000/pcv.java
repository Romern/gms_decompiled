package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: pcv */
final /* synthetic */ class pcv implements Runnable {

    /* renamed from: a */
    private final pdz f38850a;

    public pcv(pdz pdz) {
        this.f38850a = pdz;
    }

    public final void run() {
        BluetoothSocket bluetoothSocket;
        pdz pdz = this.f38850a;
        try {
            BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
            pdz.mo22948a(dcm.CONNECTING_RFCOMM);
            BluetoothDevice bluetoothDevice = pdz.f38936m;
            bmxy.m108581a(bluetoothDevice);
            bluetoothSocket = bluetoothDevice.createRfcommSocketToServiceRecord(pdz.f38905I);
            try {
                bluetoothSocket.connect();
                if (bluetoothSocket.isConnected()) {
                    bmxy.m108581a(bluetoothSocket);
                    pdz.mo22954b(bluetoothSocket);
                    return;
                }
                pdz.mo22945a(bluetoothSocket);
            } catch (IOException e) {
                pdz.mo22945a(bluetoothSocket);
            }
        } catch (IOException e2) {
            bluetoothSocket = null;
            pdz.mo22945a(bluetoothSocket);
        }
    }
}
