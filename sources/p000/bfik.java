package p000;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiScanner;
import java.util.ArrayList;

/* renamed from: bfik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfik implements WifiScanner.ScanListener {

    /* renamed from: a */
    private final ArrayList f114014a = new ArrayList();

    /* renamed from: b */
    private final bfij f114015b;

    public bfik(bfij bfij) {
        this.f114015b = bfij;
    }

    public final void onFailure(int i, String str) {
        this.f114015b.mo61722a(false);
    }

    public final void onFullResult(ScanResult scanResult) {
        if (scanResult != null) {
            this.f114014a.add(scanResult);
        }
    }

    public final void onPeriodChanged(int i) {
    }

    public final void onResults(WifiScanner.ScanData[] scanDataArr) {
        this.f114015b.mo61721a(this.f114014a);
    }

    public final void onSuccess() {
    }
}
