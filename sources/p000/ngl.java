package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;

/* renamed from: ngl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngl {

    /* renamed from: a */
    public final BluetoothAdapter f35519a;

    /* renamed from: b */
    public BluetoothLeScanner f35520b = m26193b();

    public ngl(BluetoothAdapter bluetoothAdapter) {
        this.f35519a = bluetoothAdapter;
    }

    /* renamed from: b */
    private final BluetoothLeScanner m26193b() {
        BluetoothAdapter bluetoothAdapter = this.f35519a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBluetoothLeScanner();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo20601a() {
        BluetoothLeScanner b = m26193b();
        this.f35520b = b;
        boolean z = b != null;
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resetting - new scanner available: ");
        sb.append(z);
        nha.m26245b(sb.toString());
    }
}
