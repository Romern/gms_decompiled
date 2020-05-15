package p000;

import android.bluetooth.BluetoothDevice;
import android.util.Log;

/* renamed from: vql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vql implements bmxz {

    /* renamed from: a */
    private final vqr f49797a;

    /* renamed from: b */
    private final bmwc f49798b;

    /* renamed from: c */
    private final Object f49799c;

    public vql(vqr vqr, bmwc bmwc, Object obj) {
        this.f49797a = vqr;
        this.f49798b = bmwc;
        this.f49799c = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6527a(Object obj) {
        bmwc bmwc;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        vqr vqr = this.f49797a;
        if (vqr != null && (bmwc = this.f49798b) != null) {
            return bmwc.mo28751a(vqr.mo28750a(bluetoothDevice), this.f49799c);
        }
        Log.w("CAR.BT", "Could not parse BT rule");
        return false;
    }
}
