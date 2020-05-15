package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: becz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becz extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f106923a;

    /* renamed from: b */
    final /* synthetic */ bede f106924b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public becz(bede bede, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.f106924b = bede;
        this.f106923a = bluetoothGattCharacteristic;
    }

    /* renamed from: a */
    public final void mo54307a() {
        if (!this.f106924b.f106939e.mo54361a(this.f106923a)) {
            throw new BluetoothException("gatt.readCharacteristic returned false.");
        }
    }
}
