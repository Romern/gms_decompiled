package p000;

import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.contextmanager.producer.module.WifiScanProducer$WifiReceiver;
import java.util.List;

/* renamed from: ebh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f14590a;

    /* renamed from: b */
    final /* synthetic */ WifiScanProducer$WifiReceiver f14591b;

    public ebh(WifiScanProducer$WifiReceiver wifiScanProducer$WifiReceiver, Intent intent) {
        this.f14591b = wifiScanProducer$WifiReceiver;
        this.f14590a = intent;
    }

    public final void run() {
        WifiInfo wifiInfo;
        if (this.f14590a.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
            ebi ebi = this.f14591b.f7714a;
            long b = dwq.m9665i().mo20506b();
            dxr dxr = ebi.f14592b;
            ebi.f14595m = b;
            ebi ebi2 = this.f14591b.f7714a;
            List<ScanResult> scanResults = ebi2.f14593k.getScanResults();
            String str = null;
            try {
                wifiInfo = ebi2.f14593k.getConnectionInfo();
            } catch (IllegalArgumentException e) {
                wifiInfo = null;
            }
            if (wifiInfo != null) {
                str = wifiInfo.getBSSID();
            }
            int i = Build.VERSION.SDK_INT;
            dwq.m9665i().mo20505a();
            bxvd da = bxnw.f164101b.mo74144da();
            for (ScanResult scanResult : scanResults) {
                if (!bebi.m91717a(scanResult.BSSID)) {
                    new Object[1][0] = scanResult.BSSID;
                } else {
                    try {
                        if (bebi.m91719b(scanResult.SSID)) {
                            Object[] objArr = {scanResult.BSSID, scanResult.SSID};
                        } else if (scanResult.frequency == 0) {
                            new Object[1][0] = Integer.valueOf(scanResult.frequency);
                        } else {
                            bxvd da2 = bxnx.f164105i.mo74144da();
                            if (!TextUtils.isEmpty(scanResult.BSSID)) {
                                String str2 = scanResult.BSSID;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bxnx bxnx = (bxnx) da2.f164949b;
                                str2.getClass();
                                bxnx.f164107a |= 1;
                                bxnx.f164108b = str2;
                                if (bxnx.f164108b.equals(str)) {
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bxnx bxnx2 = (bxnx) da2.f164949b;
                                    bxnx2.f164107a |= 64;
                                    bxnx2.f164114h = true;
                                }
                            }
                            if (!TextUtils.isEmpty(scanResult.SSID)) {
                                String str3 = scanResult.SSID;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bxnx bxnx3 = (bxnx) da2.f164949b;
                                str3.getClass();
                                bxnx3.f164107a = 2 | bxnx3.f164107a;
                                bxnx3.f164109c = str3;
                            }
                            if (!TextUtils.isEmpty(scanResult.capabilities)) {
                                String str4 = scanResult.capabilities;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bxnx bxnx4 = (bxnx) da2.f164949b;
                                str4.getClass();
                                bxnx4.f164107a |= 4;
                                bxnx4.f164110d = str4;
                            }
                            int i2 = scanResult.frequency;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxnx bxnx5 = (bxnx) da2.f164949b;
                            bxnx5.f164107a |= 8;
                            bxnx5.f164111e = i2;
                            int i3 = scanResult.level;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxnx bxnx6 = (bxnx) da2.f164949b;
                            bxnx6.f164107a |= 16;
                            bxnx6.f164112f = i3;
                            long j = scanResult.timestamp;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxnx bxnx7 = (bxnx) da2.f164949b;
                            bxnx7.f164107a |= 32;
                            bxnx7.f164113g = j;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxnw bxnw = (bxnw) da.f164949b;
                            bxnx bxnx8 = (bxnx) da2.mo74062i();
                            bxnx8.getClass();
                            if (!bxnw.f164104a.mo73666a()) {
                                bxnw.f164104a = GeneratedMessageLite.m124021a(bxnw.f164104a);
                            }
                            bxnw.f164104a.add(bxnx8);
                        }
                    } catch (IllegalArgumentException e2) {
                    }
                }
            }
            tip tip = new tip(7, 17, 1);
            tip.mo26574a(tka.m37117a(dwq.m9665i().mo20505a()));
            tip.mo26572a(bxnw.f164102c, (bxnw) da.mo74062i());
            ebi2.mo9856c(tip.mo26570a());
        }
    }
}
