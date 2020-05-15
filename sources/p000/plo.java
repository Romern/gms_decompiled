package p000;

import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import com.google.android.gms.cast.discovery.BleDeviceScanner$BleScanCallback;

/* renamed from: plo */
public final /* synthetic */ class plo implements Runnable {

    /* renamed from: a */
    private final BleDeviceScanner$BleScanCallback f39600a;

    /* renamed from: b */
    private final ScanResult f39601b;

    public plo(BleDeviceScanner$BleScanCallback bleDeviceScanner$BleScanCallback, ScanResult scanResult) {
        this.f39600a = bleDeviceScanner$BleScanCallback;
        this.f39601b = scanResult;
    }

    public final void run() {
        BleDeviceScanner$BleScanCallback bleDeviceScanner$BleScanCallback = this.f39600a;
        ScanResult scanResult = this.f39601b;
        bleDeviceScanner$BleScanCallback.mo17580a();
        plr plr = bleDeviceScanner$BleScanCallback.f29868a;
        ParcelUuid parcelUuid = plr.f39606a;
        plr.mo23383a(scanResult);
    }
}
