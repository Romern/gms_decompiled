package p000;

import android.bluetooth.BluetoothDevice;
import java.util.Locale;

/* renamed from: vqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum vqt implements vqr {
    MAC,
    NAME;
    

    /* renamed from: c */
    private static final bnhe f49820c = bnhe.m109411a("=", vqs.EQUALS, "^=", vqs.STARTS_WITH, "$=", vqs.ENDS_WITH, "*=", vqs.CONTAINS);

    /* renamed from: a */
    public final bmxz mo28752a(vqu vqu) {
        return new vql(this, (bmwc) vqu.mo28753a(f49820c), vqu.f49822a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28750a(BluetoothDevice bluetoothDevice) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return bluetoothDevice.getAddress().toLowerCase(Locale.US);
        }
        if (ordinal == 1) {
            return bluetoothDevice.getName();
        }
        throw null;
    }
}
