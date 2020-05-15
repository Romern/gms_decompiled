package p000;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.util.Log;

/* renamed from: vqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum vqq implements vqr {
    MAJOR_CLASS,
    CLASS;
    

    /* renamed from: c */
    private static final bnhe f49811c = bnhe.m109408a("=", vqp.EQUALS);

    /* renamed from: a */
    public final bmxz mo28752a(vqu vqu) {
        Integer num;
        bmwc bmwc = (bmwc) vqu.mo28753a(f49811c);
        try {
            num = Integer.valueOf(Integer.parseInt(vqu.f49822a, 16));
        } catch (NumberFormatException e) {
            Log.w("CAR.BT", "Could not parse value", e);
            num = null;
        }
        return new vql(this, bmwc, num);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28750a(BluetoothDevice bluetoothDevice) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
            if (bluetoothClass == null) {
                return 0;
            }
            return Integer.valueOf(bluetoothClass.getMajorDeviceClass());
        } else if (ordinal == 1) {
            BluetoothClass bluetoothClass2 = bluetoothDevice.getBluetoothClass();
            if (bluetoothClass2 == null) {
                return 0;
            }
            return Integer.valueOf(bluetoothClass2.getDeviceClass());
        } else {
            throw null;
        }
    }
}
