package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: beda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beda extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattCharacteristic f106925a;

    /* renamed from: b */
    final /* synthetic */ byte[] f106926b;

    /* renamed from: c */
    final /* synthetic */ bede f106927c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public beda(bede bede, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte... bArr) {
        super(objArr);
        this.f106927c = bede;
        this.f106925a = bluetoothGattCharacteristic;
        this.f106926b = bArr;
    }

    /* renamed from: a */
    public final void mo54307a() {
        BluetoothGattCharacteristic a = aysx.m84752a(this.f106925a);
        a.setValue(this.f106926b);
        if (!this.f106927c.f106939e.mo54365b(a)) {
            throw new BluetoothException("gatt.writeCharacteristic returned false.");
        }
    }
}
