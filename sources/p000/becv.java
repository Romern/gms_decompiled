package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* renamed from: becv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becv extends ayta {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f106918a;

    /* renamed from: b */
    final /* synthetic */ bede f106919b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public becv(bede bede, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.f106919b = bede;
        this.f106918a = bluetoothGattCharacteristic;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bede.a(android.bluetooth.BluetoothGattCharacteristic, boolean):void
     arg types: [android.bluetooth.BluetoothGattCharacteristic, int]
     candidates:
      bede.a(java.util.UUID, java.util.UUID):android.bluetooth.BluetoothGattCharacteristic
      bede.a(android.bluetooth.BluetoothGattCharacteristic, boolean):void */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54308b() {
        this.f106919b.mo58566a(this.f106918a, false);
        this.f106919b.f106940f.remove(this.f106918a);
        return null;
    }
}
