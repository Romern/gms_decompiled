package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: aibr */
final /* synthetic */ class aibr implements Runnable {

    /* renamed from: a */
    private final aics f68629a;

    /* renamed from: b */
    private final aicp f68630b;

    /* renamed from: c */
    private final BluetoothDevice f68631c;

    public aibr(aics aics, aicp aicp, BluetoothDevice bluetoothDevice) {
        this.f68629a = aics;
        this.f68630b = aicp;
        this.f68631c = bluetoothDevice;
    }

    public final void run() {
        aics aics = this.f68629a;
        aicp aicp = this.f68630b;
        BluetoothDevice bluetoothDevice = this.f68631c;
        if (aicp == aicp.CONNECTED && aics.f68714k.mo37231a(bluetoothDevice.getAddress()) == null) {
            aics.f68704a.mo72983a(new aicb(aics, "batteryLevelToast", bluetoothDevice), cfog.f184854a.mo6606a().mo82029g());
        }
    }
}
