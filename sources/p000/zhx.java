package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* renamed from: zhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zhx implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    private final zhk f55115a;

    public zhx(zhk zhk) {
        bmxy.m108581a(zhk);
        this.f55115a = zhk;
    }

    public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f55115a.mo31120a(zia.m45487a(bluetoothDevice), bArr);
    }
}
