package p000;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;

/* renamed from: aysp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aysp {

    /* renamed from: a */
    public final BluetoothGattServer f98423a;

    private aysp(BluetoothGattServer bluetoothGattServer) {
        this.f98423a = bluetoothGattServer;
    }

    /* renamed from: a */
    public static aysp m84734a(BluetoothGattServer bluetoothGattServer) {
        if (bluetoothGattServer != null) {
            return new aysp(bluetoothGattServer);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo54386b(aysl aysl) {
        return this.f98423a.connect(aysl.f98419a, false);
    }

    /* renamed from: a */
    public final void mo54382a() {
        this.f98423a.close();
    }

    /* renamed from: a */
    public final void mo54383a(aysl aysl) {
        this.f98423a.cancelConnection(aysl.f98419a);
    }

    /* renamed from: a */
    public final void mo54384a(aysl aysl, int i, int i2, int i3, byte[] bArr) {
        this.f98423a.sendResponse(aysl.f98419a, i, i2, i3, bArr);
    }

    /* renamed from: a */
    public final boolean mo54385a(BluetoothGattService bluetoothGattService) {
        return this.f98423a.addService(bluetoothGattService);
    }
}
