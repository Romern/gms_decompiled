package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrd extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f98321a;

    /* renamed from: b */
    final /* synthetic */ byte[] f98322b;

    /* renamed from: c */
    final /* synthetic */ ayri f98323c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayrd(ayri ayri, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte... bArr) {
        super(objArr);
        this.f98323c = ayri;
        this.f98321a = bluetoothGattCharacteristic;
        this.f98322b = bArr;
    }

    /* renamed from: a */
    public final void mo54307a() {
        BluetoothGattCharacteristic a = aysx.m84752a(this.f98321a);
        a.setValue(this.f98322b);
        if (!this.f98323c.f98336d.mo54365b(a)) {
            throw new BluetoothException("gatt.writeCharacteristic returned false.");
        }
    }
}
