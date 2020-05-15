package p000;

import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: bedb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bedb extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattDescriptor f106928a;

    /* renamed from: b */
    final /* synthetic */ byte[] f106929b;

    /* renamed from: c */
    final /* synthetic */ bede f106930c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bedb(bede bede, Object[] objArr, BluetoothGattDescriptor bluetoothGattDescriptor, byte... bArr) {
        super(objArr);
        this.f106930c = bede;
        this.f106928a = bluetoothGattDescriptor;
        this.f106929b = bArr;
    }

    /* renamed from: a */
    public final void mo54307a() {
        BluetoothGattDescriptor a = aysx.m84753a(this.f106928a);
        a.setValue(this.f106929b);
        if (!this.f106930c.f106939e.mo54362a(a)) {
            throw new BluetoothException("gatt.writeDescriptor returned false.");
        }
    }
}
