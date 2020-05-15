package p000;

import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayre extends aysz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattDescriptor f98324a;

    /* renamed from: b */
    final /* synthetic */ ayri f98325b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayre(ayri ayri, Object[] objArr, BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(objArr);
        this.f98325b = ayri;
        this.f98324a = bluetoothGattDescriptor;
    }

    /* renamed from: a */
    public final void mo54307a() {
        aysm aysm = this.f98325b.f98336d;
        if (!aysm.f98420a.readDescriptor(this.f98324a)) {
            throw new BluetoothException("gatt.readDescriptor returned false.");
        }
    }
}
