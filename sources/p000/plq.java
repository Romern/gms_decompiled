package p000;

import com.google.android.gms.cast.discovery.BleDeviceScanner$BleScanCallback;

/* renamed from: plq */
public final /* synthetic */ class plq implements Runnable {

    /* renamed from: a */
    private final BleDeviceScanner$BleScanCallback f39604a;

    /* renamed from: b */
    private final int f39605b;

    public plq(BleDeviceScanner$BleScanCallback bleDeviceScanner$BleScanCallback, int i) {
        this.f39604a = bleDeviceScanner$BleScanCallback;
        this.f39605b = i;
    }

    public final void run() {
        BleDeviceScanner$BleScanCallback bleDeviceScanner$BleScanCallback = this.f39604a;
        int i = this.f39605b;
        bleDeviceScanner$BleScanCallback.f29868a.f39640e.mo23677d("Failed to start BLE scan. Error code : %d.", Integer.valueOf(i));
        bleDeviceScanner$BleScanCallback.f29868a.mo23394d();
        bleDeviceScanner$BleScanCallback.f29868a.f39643h.mo23141e();
    }
}
