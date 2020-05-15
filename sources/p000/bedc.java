package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* renamed from: bedc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bedc extends ayta {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f106931a;

    /* renamed from: b */
    final /* synthetic */ bede f106932b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bedc(bede bede, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.f106932b = bede;
        this.f106931a = bluetoothGattCharacteristic;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bede.a(android.bluetooth.BluetoothGattCharacteristic, boolean):void
     arg types: [android.bluetooth.BluetoothGattCharacteristic, int]
     candidates:
      bede.a(java.util.UUID, java.util.UUID):android.bluetooth.BluetoothGattCharacteristic
      bede.a(android.bluetooth.BluetoothGattCharacteristic, boolean):void */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54308b() {
        bedd bedd = new bedd();
        this.f106932b.f106940f.put(this.f106931a, bedd);
        this.f106932b.mo58566a(this.f106931a, true);
        return bedd;
    }
}
