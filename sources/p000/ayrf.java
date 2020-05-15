package p000;

import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrf extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattDescriptor f98326a;

    /* renamed from: b */
    final /* synthetic */ byte[] f98327b;

    /* renamed from: c */
    final /* synthetic */ ayri f98328c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayrf(ayri ayri, Object[] objArr, BluetoothGattDescriptor bluetoothGattDescriptor, byte... bArr) {
        super(objArr);
        this.f98328c = ayri;
        this.f98326a = bluetoothGattDescriptor;
        this.f98327b = bArr;
    }

    /* renamed from: a */
    public final void mo54307a() {
        BluetoothGattDescriptor a = aysx.m84753a(this.f98326a);
        a.setValue(this.f98327b);
        if (!this.f98328c.f98336d.mo54362a(a)) {
            throw new BluetoothException("gatt.writeDescriptor returned false.");
        }
    }
}
