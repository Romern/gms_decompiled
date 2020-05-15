package p000;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.fido.communication.ble.BleScanner$1;

/* renamed from: xio */
public final /* synthetic */ class xio implements Runnable {

    /* renamed from: a */
    private final BleScanner$1 f52366a;

    /* renamed from: b */
    private final ScanResult f52367b;

    public xio(BleScanner$1 bleScanner$1, ScanResult scanResult) {
        this.f52366a = bleScanner$1;
        this.f52367b = scanResult;
    }

    public final void run() {
        BleScanner$1 bleScanner$1 = this.f52366a;
        ScanResult scanResult = this.f52367b;
        xis xis = bleScanner$1.f31680a;
        int i = xis.f52369e;
        if (xis.f52372b != null) {
            bleScanner$1.f31680a.f52372b.mo29724a(scanResult);
        }
    }
}
