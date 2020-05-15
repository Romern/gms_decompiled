package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: pcc */
final /* synthetic */ class pcc implements Runnable {

    /* renamed from: a */
    private final pcd f38808a;

    /* renamed from: b */
    private final BluetoothDevice f38809b;

    public pcc(pcd pcd, BluetoothDevice bluetoothDevice) {
        this.f38808a = pcd;
        this.f38809b = bluetoothDevice;
    }

    public final void run() {
        pcd pcd = this.f38808a;
        BluetoothDevice bluetoothDevice = this.f38809b;
        pce pce = pcd.f38810a;
        int[] iArr = pce.f38811a;
        pce.f38819i.f38895a.f38936m = bluetoothDevice;
    }
}
