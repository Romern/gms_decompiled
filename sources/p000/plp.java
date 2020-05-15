package p000;

import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import com.google.android.gms.cast.discovery.BleDeviceScanner$BleScanCallback;
import java.util.List;

/* renamed from: plp */
public final /* synthetic */ class plp implements Runnable {

    /* renamed from: a */
    private final BleDeviceScanner$BleScanCallback f39602a;

    /* renamed from: b */
    private final List f39603b;

    public plp(BleDeviceScanner$BleScanCallback bleDeviceScanner$BleScanCallback, List list) {
        this.f39602a = bleDeviceScanner$BleScanCallback;
        this.f39603b = list;
    }

    public final void run() {
        BleDeviceScanner$BleScanCallback bleDeviceScanner$BleScanCallback = this.f39602a;
        List<ScanResult> list = this.f39603b;
        bleDeviceScanner$BleScanCallback.mo17580a();
        for (ScanResult scanResult : list) {
            plr plr = bleDeviceScanner$BleScanCallback.f29868a;
            ParcelUuid parcelUuid = plr.f39606a;
            plr.mo23383a(scanResult);
        }
    }
}
