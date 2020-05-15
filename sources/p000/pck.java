package p000;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;

/* renamed from: pck */
public final /* synthetic */ class pck {
    /* renamed from: a */
    public static int m30193a(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids;
        if (!(bluetoothDevice == null || (uuids = bluetoothDevice.getUuids()) == null)) {
            for (ParcelUuid parcelUuid : uuids) {
                if (!(parcelUuid == null || parcelUuid.getUuid() == null)) {
                    if (pea.f38950a.equals(parcelUuid.getUuid())) {
                        return 2;
                    }
                    if (pea.f38951b.equals(parcelUuid.getUuid())) {
                        return 3;
                    }
                }
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static int m30194a(bixd bixd) {
        if (bixd == null) {
            return 1;
        }
        switch (bixd.ordinal()) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
            default:
                return 1;
            case 9:
                return 10;
        }
    }
}
