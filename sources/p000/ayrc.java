package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrc extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f98319a;

    /* renamed from: b */
    final /* synthetic */ ayri f98320b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayrc(ayri ayri, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.f98320b = ayri;
        this.f98319a = bluetoothGattCharacteristic;
    }

    /* renamed from: a */
    public final void mo54307a() {
        if (!this.f98320b.f98336d.mo54361a(this.f98319a)) {
            throw new BluetoothException("gatt.readCharacteristic returned false.");
        }
    }
}
