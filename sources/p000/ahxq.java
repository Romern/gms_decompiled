package p000;

import android.bluetooth.BluetoothSocket;

/* renamed from: ahxq */
final /* synthetic */ class ahxq implements Runnable {

    /* renamed from: a */
    private final ahye f68301a;

    /* renamed from: b */
    private final BluetoothSocket f68302b;

    public ahxq(ahye ahye, BluetoothSocket bluetoothSocket) {
        this.f68301a = ahye;
        this.f68302b = bluetoothSocket;
    }

    public final void run() {
        ahye ahye = this.f68301a;
        ahye.mo37277a(this.f68302b);
        ahye.mo37286e();
    }
}
