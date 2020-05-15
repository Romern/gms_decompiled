package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.EnumMap;
import java.util.Locale;
import java.util.UUID;

/* renamed from: xig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xig {

    /* renamed from: h */
    public static final sek f52339h = new sek(new String[]{"BleConnectionManager"}, (short[]) null);

    /* renamed from: a */
    public final BluetoothDevice f52340a;

    /* renamed from: b */
    public final Object f52341b = new Object();

    /* renamed from: c */
    public final xik f52342c;

    /* renamed from: d */
    public final xiw f52343d;

    /* renamed from: e */
    public BluetoothGatt f52344e;

    /* renamed from: f */
    public int f52345f = 23;

    /* renamed from: g */
    public final BluetoothGattCallback f52346g = new xie(this);

    public xig(BluetoothDevice bluetoothDevice) {
        bmxy.m108581a(bluetoothDevice);
        this.f52340a = bluetoothDevice;
        this.f52342c = new xik();
        this.f52343d = new xiw();
    }

    /* renamed from: a */
    public static final String m42998a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        if (bluetoothGattCharacteristic == null) {
            return "null characteristic";
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = bluetoothGattCharacteristic.getUuid();
        BluetoothGattService service = bluetoothGattCharacteristic.getService();
        if (service != null) {
            str = String.format(Locale.US, "service %s", service.getUuid());
        } else {
            str = "null service";
        }
        objArr[1] = str;
        return String.format(locale, "characteristic %s on service %s", objArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [xii, java.util.UUID]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final BluetoothGattCharacteristic mo29800a(UUID uuid, UUID uuid2) {
        f52339h.mo25412b("Getting characteristic for UUID %s", uuid2);
        f52339h.mo25412b("Getting service for UUID %s", uuid);
        BluetoothGattService service = this.f52344e.getService(uuid);
        if (service != null) {
            f52339h.mo25412b("Service found for UUID %s", uuid);
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
            if (characteristic != null) {
                f52339h.mo25412b("Characteristic %s found on service %s.", uuid2, uuid);
                return characteristic;
            }
            String format = String.format("Characteristic %s not found on service %s of device %s", uuid2, uuid, this.f52344e.getDevice());
            EnumMap enumMap = new EnumMap(xii.class);
            enumMap.put((Object) xii.SERVICE, (Object) uuid);
            enumMap.put((Object) xii.CHARACTERISTIC, (Object) uuid2);
            throw new xij(format, this.f52342c.f52357a, enumMap);
        }
        String format2 = String.format(Locale.US, "Service %s not found on device %s.", uuid, this.f52344e.getDevice());
        EnumMap enumMap2 = new EnumMap(xii.class);
        enumMap2.put((Object) xii.SERVICE, (Object) uuid);
        throw new xij(format2, this.f52342c.f52357a, enumMap2);
    }
}
