package p000;

import android.bluetooth.BluetoothGattService;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayry extends aysz {

    /* renamed from: a */
    final /* synthetic */ aysp f98387a;

    /* renamed from: b */
    final /* synthetic */ BluetoothGattService f98388b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayry(Object[] objArr, aysp aysp, BluetoothGattService bluetoothGattService) {
        super(objArr);
        this.f98387a = aysp;
        this.f98388b = bluetoothGattService;
    }

    /* renamed from: a */
    public final void mo54307a() {
        if (!this.f98387a.mo54385a(this.f98388b)) {
            throw new BluetoothException("Fails on adding service");
        }
    }
}
