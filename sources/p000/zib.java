package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: zib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zib implements zhn {

    /* renamed from: a */
    private static final Object f55123a = new Object();

    /* renamed from: b */
    private static final WeakHashMap f55124b = new WeakHashMap();

    /* renamed from: c */
    private final BluetoothGatt f55125c;

    static {
        zvt.m46581a();
    }

    private zib(BluetoothGatt bluetoothGatt) {
        this.f55125c = bluetoothGatt;
    }

    /* renamed from: a */
    public static zhn m45491a(BluetoothGatt bluetoothGatt) {
        synchronized (f55123a) {
            WeakReference weakReference = (WeakReference) f55124b.get(bluetoothGatt);
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    zhn zhn = (zhn) weakReference.get();
                    return zhn;
                }
            }
            zib zib = new zib(bluetoothGatt);
            f55124b.put(bluetoothGatt, new WeakReference(zib));
            return zib;
        }
    }

    /* renamed from: b */
    public final boolean mo31132b() {
        return this.f55125c.connect();
    }

    /* renamed from: c */
    public final boolean mo31133c() {
        return this.f55125c.discoverServices();
    }

    /* renamed from: d */
    public final List mo31134d() {
        return this.f55125c.getServices();
    }

    /* renamed from: a */
    public final void mo31128a() {
        this.f55125c.disconnect();
    }

    /* renamed from: a */
    public final boolean mo31129a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f55125c.readCharacteristic(bluetoothGattCharacteristic);
    }

    /* renamed from: a */
    public final boolean mo31130a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return this.f55125c.setCharacteristicNotification(bluetoothGattCharacteristic, z);
    }

    /* renamed from: a */
    public final boolean mo31131a(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return this.f55125c.writeDescriptor(bluetoothGattDescriptor);
    }
}
