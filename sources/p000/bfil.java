package p000;

import android.content.Context;
import android.net.wifi.WifiScanner;
import android.os.WorkSource;

/* renamed from: bfil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfil extends bfij {

    /* renamed from: l */
    private final bgmj f114016l;

    public bfil(Context context, bfev bfev, bflc bflc, bfew bfew, bhdb bhdb, bgmj bgmj, long j, bfig bfig) {
        super(context, bfev, bflc, bfew, bhdb, j, bfig);
        this.f114016l = bgmj;
    }

    /* renamed from: c */
    public final void mo61712c() {
        WifiScanner wifiScanner = (WifiScanner) this.f114006a.getSystemService("wifiscanner");
        bfik bfik = new bfik(this);
        WifiScanner.ScanSettings scanSettings = new WifiScanner.ScanSettings();
        scanSettings.band = 3;
        scanSettings.reportEvents = 2;
        scanSettings.numBssidsPerScan = 100;
        scanSettings.periodInMs = 0;
        bgmj bgmj = this.f114016l;
        if (bgmj instanceof bhcv) {
            WorkSource b = ((bhcv) bgmj).mo63559b();
            if (b != null) {
                wifiScanner.startScan(scanSettings, bfik, b);
            } else {
                wifiScanner.startScan(scanSettings, bfik);
            }
        } else {
            wifiScanner.startScan(scanSettings, bfik);
        }
    }

    /* renamed from: d */
    public final void mo61713d() {
    }

    /* renamed from: e */
    public final void mo61714e() {
    }
}
