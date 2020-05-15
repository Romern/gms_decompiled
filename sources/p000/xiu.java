package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: xiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xiu {

    /* renamed from: a */
    private final UUID f52378a;

    /* renamed from: b */
    private final int f52379b;

    public xiu(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        bmxy.m108581a(bluetoothGattCharacteristic);
        this.f52378a = bluetoothGattCharacteristic.getUuid();
        this.f52379b = bluetoothGattCharacteristic.getInstanceId();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xiu) {
            xiu xiu = (xiu) obj;
            if (!bmxi.m108538a(this.f52378a, xiu.f52378a) || this.f52379b != xiu.f52379b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52378a, Integer.valueOf(this.f52379b)});
    }

    public final String toString() {
        return String.format(Locale.US, "UUID: %s, instance id: %d", this.f52378a, Integer.valueOf(this.f52379b));
    }
}
