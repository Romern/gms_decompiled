package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.ParcelUuid;

/* renamed from: xgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xgn {

    /* renamed from: c */
    private static final sek f52214c = new sek(new String[]{"BluetoothPairingStateProvider"}, (short[]) null);

    /* renamed from: a */
    private final BluetoothAdapter f52215a = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: b */
    private final xgm f52216b;

    public xgn(Context context) {
        this.f52216b = new xgm(context);
    }

    /* renamed from: a */
    public final boolean mo29737a() {
        boolean contains;
        BluetoothAdapter bluetoothAdapter = this.f52215a;
        if (bluetoothAdapter != null) {
            loop0:
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                ParcelUuid[] uuids = bluetoothDevice.getUuids();
                if (uuids != null) {
                    int length = uuids.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (uuids[i].getUuid().equals(xiv.f52382c)) {
                            f52214c.mo25414c("Bluetooth device %s has FIDO UUID", bluetoothDevice);
                            break loop0;
                        } else {
                            i++;
                        }
                    }
                } else {
                    f52214c.mo25418e("getUuids() returns null for device: %s", bluetoothDevice);
                }
                xgm xgm = this.f52216b;
                synchronized (xgm.f52213b) {
                    contains = xgm.f52212a.getStringSet("known_u2f_devices", bnon.f131923a).contains(bluetoothDevice.getAddress());
                }
                if (contains) {
                    return true;
                }
            }
        }
        return false;
    }
}
