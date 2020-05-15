package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;

/* renamed from: nyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyi {

    /* renamed from: b */
    private static final bnsn f36949b = odk.m28481a("CAR.BT.HeadsetWrapper");

    /* renamed from: a */
    public final BluetoothHeadset f36950a;

    public nyi(BluetoothHeadset bluetoothHeadset) {
        this.f36950a = bluetoothHeadset;
    }

    /* renamed from: a */
    public final int mo21840a(BluetoothDevice bluetoothDevice) {
        return this.f36950a.getConnectionState(bluetoothDevice);
    }

    /* renamed from: a */
    public final void mo21841a(BluetoothDevice bluetoothDevice, int i) {
        try {
            BluetoothHeadset.class.getMethod("setPriority", BluetoothDevice.class, Integer.TYPE).invoke(this.f36950a, bluetoothDevice, Integer.valueOf(i));
        } catch (ReflectiveOperationException e) {
            bnsi b = f36949b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("nyi", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error calling BluetoothHeadset#setPriority");
        }
    }

    /* renamed from: a */
    public final boolean mo21842a(BluetoothDevice bluetoothDevice, boolean z) {
        String str = !z ? "disconnect" : "connect";
        try {
            return ((Boolean) BluetoothHeadset.class.getMethod(str, BluetoothDevice.class).invoke(this.f36950a, bluetoothDevice)).booleanValue();
        } catch (ReflectiveOperationException e) {
            bnsi b = f36949b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("nyi", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("Error calling BluetoothHeadset#%s", str);
            return false;
        }
    }
}
