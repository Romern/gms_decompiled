package p000;

import android.bluetooth.BluetoothSocket;

/* renamed from: ahxs */
final /* synthetic */ class ahxs implements Runnable {

    /* renamed from: a */
    private final ahye f68304a;

    /* renamed from: b */
    private final BluetoothSocket f68305b;

    public ahxs(ahye ahye, BluetoothSocket bluetoothSocket) {
        this.f68304a = ahye;
        this.f68305b = bluetoothSocket;
    }

    public final void run() {
        ahye ahye = this.f68304a;
        ahye.mo37277a(this.f68305b);
        ahye.mo37286e();
    }
}
