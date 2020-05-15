package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: wtm */
final /* synthetic */ class wtm implements Runnable {

    /* renamed from: a */
    private final wts f51303a;

    /* renamed from: b */
    private final BluetoothDevice f51304b;

    public wtm(wts wts, BluetoothDevice bluetoothDevice) {
        this.f51303a = wts;
        this.f51304b = bluetoothDevice;
    }

    public final void run() {
        wts wts = this.f51303a;
        BluetoothDevice bluetoothDevice = this.f51304b;
        try {
            ayqm.m84613a(bluetoothDevice).mo54282a("removeBond", new Class[0]).mo54280a(new Object[0]);
            wtv.m42254a(wts.getContext(), bvin.FAST_PAIR_DEVICE_FORGOTTEN);
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wts", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("DeviceDetail: Error removing bond for device=%s", bluetoothDevice);
        }
    }
}
