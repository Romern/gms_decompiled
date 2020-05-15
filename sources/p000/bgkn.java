package p000;

import android.content.Context;
import android.net.wifi.RttManager;
import android.net.wifi.WifiScanner;
import android.os.WorkSource;
import java.util.concurrent.Executor;

/* renamed from: bgkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgkn extends bgkm {
    /* renamed from: a */
    public final bfnz mo62953a(RttManager.RttResult rttResult) {
        bfnz bfnz = new bfnz();
        bfnz.f114529a = bupz.m120219a(rttResult.bssid);
        bfnz.f114533e = rttResult.distance;
        bfnz.f114534f = rttResult.distanceStandardDeviation;
        if (rttResult.rssi > 10) {
            bfnz.f114532d = -(rttResult.rssi / 2);
        } else {
            bfnz.f114532d = rttResult.rssi;
        }
        int i = rttResult.rssi;
        int i2 = bfnz.f114532d;
        StringBuilder sb = new StringBuilder(60);
        sb.append("wifi rtt rssi is ");
        sb.append(i);
        sb.append(", generated value is ");
        sb.append(i2);
        sb.toString();
        bfnz.f114530b = rttResult.status;
        bfnz.f114531c = rttResult.ts;
        bfnz.f114535g = rttResult.measurementType;
        bfnz.f114536h = rttResult.measurementFrameNumber;
        bfnz.f114537i = rttResult.successMeasurementFrameNumber;
        return bfnz;
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
    public final void mo62947a(Context context, bgkg bgkg, boolean z, bgmj bgmj, boolean z2, bfor bfor, Executor executor) {
        WifiScanner wifiScanner = (WifiScanner) context.getSystemService("wifiscanner");
        if (wifiScanner == null) {
            super.mo62947a(context, bgkg, z, bgmj, true, bfor, executor);
            return;
        }
        WifiScanner.ScanSettings a = mo62950a(true, 10000, 0, z);
        bglb bglb = new bglb(wifiScanner, bgkg, true);
        if (bgmj instanceof bhcv) {
            WorkSource workSource = ((bhcw) bgmj).f118316a;
            if (workSource == null) {
                wifiScanner.startScan(a, bglb);
            } else {
                wifiScanner.startScan(a, bglb, workSource);
            }
        } else {
            wifiScanner.startScan(a, bglb);
        }
    }
}
