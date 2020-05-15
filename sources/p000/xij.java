package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: xij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xij extends Exception {

    /* renamed from: a */
    final xif f52354a;

    /* renamed from: b */
    final Map f52355b;

    public xij(String str) {
        super(str);
        this.f52354a = null;
        this.f52355b = null;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        if (this.f52354a != null) {
            sb.append(String.format(Locale.US, "; operation: %s", this.f52354a.toString()));
        }
        Map map = this.f52355b;
        if (map != null) {
            for (xii xii : map.keySet()) {
                sb.append(String.format(Locale.US, "; %s UUID: %s", xii.f52353d, ((UUID) this.f52355b.get(xii)).toString()));
            }
        }
        return sb.toString();
    }

    public xij(String str, xif xif) {
        super(str);
        this.f52354a = xif;
        this.f52355b = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [xii, java.util.UUID]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    public xij(String str, xif xif, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(str);
        bmxy.m108581a(xif);
        this.f52354a = xif;
        EnumMap enumMap = new EnumMap(xii.class);
        if (bluetoothGattCharacteristic != null) {
            enumMap.put((Object) xii.CHARACTERISTIC, (Object) bluetoothGattCharacteristic.getUuid());
        }
        this.f52355b = enumMap;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [xii, java.util.UUID]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    public xij(String str, xif xif, BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(str);
        bmxy.m108581a(xif);
        this.f52354a = xif;
        EnumMap enumMap = new EnumMap(xii.class);
        if (bluetoothGattDescriptor != null) {
            enumMap.put((Object) xii.DESCRIPTOR, (Object) bluetoothGattDescriptor.getUuid());
        }
        this.f52355b = enumMap;
    }

    public xij(String str, xif xif, Map map) {
        super(str);
        bmxy.m108581a(xif);
        this.f52354a = xif;
        this.f52355b = map;
    }
}
