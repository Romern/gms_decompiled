package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: vsm */
final /* synthetic */ class vsm implements bml {

    /* renamed from: a */
    private final vsr f49909a;

    /* renamed from: b */
    private final BluetoothDevice f49910b;

    public vsm(vsr vsr, BluetoothDevice bluetoothDevice) {
        this.f49909a = vsr;
        this.f49910b = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo3281a(boolean z) {
        vsr vsr = this.f49909a;
        vsr.f49923f.mo28778a(new vso(vsr, this.f49910b, z));
    }
}
