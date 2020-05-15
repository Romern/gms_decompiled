package p000;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.beacon.BleSighting;
import com.google.android.gms.nearby.mediums.BluetoothLowEnergy$2;

/* renamed from: aijs */
public final /* synthetic */ class aijs implements Runnable {

    /* renamed from: a */
    private final BluetoothLowEnergy$2 f68987a;

    /* renamed from: b */
    private final ScanResult f68988b;

    public aijs(BluetoothLowEnergy$2 bluetoothLowEnergy$2, ScanResult scanResult) {
        this.f68987a = bluetoothLowEnergy$2;
        this.f68988b = scanResult;
    }

    public final void run() {
        BluetoothLowEnergy$2 bluetoothLowEnergy$2 = this.f68987a;
        ScanResult scanResult = this.f68988b;
        bluetoothLowEnergy$2.f80649a.mo37613a(new BleSighting(scanResult.getDevice(), scanResult.getScanRecord().getBytes(), scanResult.getRssi(), scanResult.getTimestampNanos()));
    }
}
