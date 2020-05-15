package p000;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiScanner;
import android.os.UserManager;
import com.android.location.provider.ActivityRecognitionProviderClient;
import java.util.concurrent.Executor;

/* renamed from: bgkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgkm extends bgkl {

    /* renamed from: a */
    bglb f116710a;

    /* renamed from: b */
    private Boolean f116711b;

    /* renamed from: c */
    private Boolean f116712c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WifiScanner.ScanSettings mo62950a(boolean z, int i, int i2, boolean z2) {
        StringBuilder sb = new StringBuilder(90);
        sb.append("buildScanSettings: singleShot is ");
        sb.append(z);
        sb.append(", periodInMs is ");
        sb.append(i);
        sb.append(", maxScans is ");
        sb.append(i2);
        sb.toString();
        WifiScanner.ScanSettings scanSettings = new WifiScanner.ScanSettings();
        if (z) {
            scanSettings.reportEvents = 2;
            scanSettings.numBssidsPerScan = 25;
            scanSettings.periodInMs = 0;
        } else {
            scanSettings.reportEvents = 0;
            scanSettings.numBssidsPerScan = 25;
            scanSettings.maxScansToCache = i2;
            scanSettings.periodInMs = i;
        }
        scanSettings.band = 3;
        return scanSettings;
    }

    /* renamed from: a */
    public final bgis mo62949a() {
        if (cers.m138134b()) {
            return new bgiq();
        }
        try {
            ActivityRecognitionProviderClient.class.getName();
            return new bgip();
        } catch (NoClassDefFoundError e) {
            return super.mo62949a();
        }
    }

    /* renamed from: a */
    public final bgkf mo62951a(ScanResult scanResult) {
        long j;
        ScanResult scanResult2 = scanResult;
        long j2 = scanResult2.timestamp / 1000;
        if (scanResult2.BSSID != null) {
            j = bupz.m120219a(scanResult2.BSSID);
        } else {
            j = 0;
        }
        return new bgkf(j2, j, scanResult2.SSID, scanResult2.capabilities, scanResult2.channelWidth, scanResult.is80211mcResponder(), scanResult2.frequency, scanResult2.level, scanResult2.centerFreq0, scanResult2.centerFreq1, scanResult);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgkm.a(boolean, int, int, boolean):android.net.wifi.WifiScanner$ScanSettings
     arg types: [int, int, int, boolean]
     candidates:
      bgkj.a(android.app.AlarmManager, long, android.app.PendingIntent, bgmj):void
      bgkj.a(android.content.Context, java.lang.String, android.location.LocationListener, android.os.Looper):void
      bgkx.a(android.app.AlarmManager, long, android.app.PendingIntent, bgmj):void
      bgkx.a(android.content.Context, java.lang.String, android.location.LocationListener, android.os.Looper):void
      bgkm.a(boolean, int, int, boolean):android.net.wifi.WifiScanner$ScanSettings */
    /* renamed from: a */
    public void mo62947a(Context context, bgkg bgkg, boolean z, bgmj bgmj, boolean z2, bfor bfor, Executor executor) {
        if (z2 || !mo62952a(context, 16)) {
            super.mo62947a(context, bgkg, z, bgmj, z2, bfor, executor);
            return;
        }
        WifiScanner wifiScanner = (WifiScanner) context.getSystemService("wifiscanner");
        try {
            wifiScanner.startScan(mo62950a(true, 10000, 0, z), new bglb(wifiScanner, bgkg, true));
        } catch (IllegalStateException e) {
            super.mo62947a(context, bgkg, z, bgmj, false, bfor, executor);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo62952a(Context context, int i) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (this.f116711b == null) {
            try {
                this.f116711b = Boolean.valueOf(((UserManager) context.getSystemService("user")).isManagedProfile());
            } catch (SecurityException e) {
                this.f116711b = Boolean.FALSE;
            }
        }
        if (!this.f116711b.booleanValue() && (((int) ceze.m138468m()) & i) != 0) {
            if (this.f116712c == null) {
                boolean isWifiScannerSupported = wifiManager.isWifiScannerSupported();
                StringBuilder sb = new StringBuilder(50);
                sb.append("WifiManager.isWifiScannerSupported() returns ");
                sb.append(isWifiScannerSupported);
                sb.toString();
                this.f116712c = Boolean.valueOf(isWifiScannerSupported);
            }
            return this.f116712c.booleanValue();
        }
    }
}
