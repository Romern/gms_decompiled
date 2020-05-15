package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: ayon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ayon extends ayqp {

    /* renamed from: a */
    private final BluetoothDevice f98124a;

    protected ayon(Context context, ayqk ayqk, BluetoothDevice bluetoothDevice, String... strArr) {
        super(context, ayqk, strArr);
        this.f98124a = bluetoothDevice;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54158a(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        BluetoothDevice bluetoothDevice2 = this.f98124a;
        if (bluetoothDevice2 == null || bluetoothDevice2.equals(bluetoothDevice)) {
            mo54160b(intent);
        } else {
            bnsp bnsp = aypn.f98194a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo54160b(Intent intent);
}
