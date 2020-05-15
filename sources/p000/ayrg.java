package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrg extends ayta {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f98329a;

    /* renamed from: b */
    final /* synthetic */ ayri f98330b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayrg(ayri ayri, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.f98330b = ayri;
        this.f98329a = bluetoothGattCharacteristic;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54308b() {
        boolean z;
        String str;
        ayrh ayrh = new ayrh();
        this.f98330b.f98341i.put(this.f98329a, ayrh);
        ayri ayri = this.f98330b;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f98329a;
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) != 0) {
            z = false;
        } else if ((properties & 32) != 0) {
            z = true;
        } else {
            throw new BluetoothException(String.format("%s on device %s supports neither notifications nor indications.", aysx.m84755b(bluetoothGattCharacteristic), ayri.f98336d.mo54358a()));
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(aynb.f98002a);
        if (descriptor != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[3];
            objArr[0] = "Enabling";
            if (!z) {
                str = "notification";
            } else {
                str = "indication";
            }
            objArr[1] = str;
            objArr[2] = bluetoothGattCharacteristic.getUuid();
            ayri.f98336d.mo54359a(bluetoothGattCharacteristic, true);
            byte[] bArr = z ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            Object[] objArr2 = {Integer.valueOf(bArr.length), aysx.m84756b(descriptor), ayri.f98336d.mo54358a()};
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                ayri.f98337e.mo54415b(new ayrf(ayri, new Object[]{ayro.WRITE_DESCRIPTOR, ayri.f98336d, descriptor}, descriptor, bArr), ayri.f98343k);
                new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                return ayrh;
            } catch (BluetoothException e) {
                throw new BluetoothException(String.format("Failed to write %s on device %s.", aysx.m84756b(descriptor), ayri.f98336d.mo54358a()), e);
            }
        } else {
            throw new BluetoothException(String.format("%s on device %s is missing client config descriptor.", aysx.m84755b(bluetoothGattCharacteristic), ayri.f98336d.mo54358a()));
        }
    }
}
