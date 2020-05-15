package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import java.util.List;

/* renamed from: ahgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgb {

    /* renamed from: a */
    private static ahgb f67139a;

    /* renamed from: b */
    private final BluetoothLeScanner f67140b;

    private ahgb(BluetoothLeScanner bluetoothLeScanner) {
        this.f67140b = bluetoothLeScanner;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return null;
     */
    /* renamed from: a */
    public static synchronized ahgb m55683a() {
        BluetoothLeScanner bluetoothLeScanner;
        synchronized (ahgb.class) {
            if (f67139a == null) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null && (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) != null) {
                    f67139a = new ahgb(bluetoothLeScanner);
                }
            }
            ahgb ahgb = f67139a;
            return ahgb;
        }
    }

    /* renamed from: a */
    public final void mo36417a(ScanCallback scanCallback) {
        try {
            this.f67140b.stopScan(scanCallback);
        } catch (IllegalStateException | NullPointerException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo36418a(List list, ScanSettings scanSettings, ScanCallback scanCallback) {
        try {
            this.f67140b.startScan(list, scanSettings, scanCallback);
            return true;
        } catch (IllegalStateException | NullPointerException e) {
            return false;
        }
    }
}
