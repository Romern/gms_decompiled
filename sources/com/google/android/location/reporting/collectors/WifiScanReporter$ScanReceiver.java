package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.location.WifiScan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WifiScanReporter$ScanReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgua f150867a;

    /* renamed from: b */
    private long f150868b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiScanReporter$ScanReceiver(bgua bgua) {
        super("location");
        this.f150867a = bgua;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        WifiScan wifiScan;
        byte[] byteArrayExtra = intent.getByteArrayExtra("location.WIFI_SCAN");
        if (byteArrayExtra != null) {
            wifiScan = WifiScan.m66876a(byteArrayExtra);
        } else {
            wifiScan = null;
        }
        if (wifiScan != null) {
            bgua bgua = this.f150867a;
            if (bgua.f117542d) {
                synchronized (bgua.f117541c) {
                    if (this.f150867a.f117543e != null && chcs.f188354a.mo6606a().mo85027P()) {
                        bgtz bgtz = this.f150867a.f117543e;
                        ((bgxx) bgtz).f117961k.sendMessage(((bgxx) bgtz).f117961k.obtainMessage(5, wifiScan));
                    }
                }
                if (this.f150868b != 0) {
                    sqv sqv = this.f150867a.f117540b;
                    if (SystemClock.elapsedRealtime() - this.f150868b <= chcs.f188354a.mo6606a().mo85060aV()) {
                        return;
                    }
                }
                synchronized (this.f150867a.f117541c) {
                    this.f150867a.f117539a.add(wifiScan);
                }
                sqv sqv2 = this.f150867a.f117540b;
                this.f150868b = SystemClock.elapsedRealtime();
                int a = wifiScan.mo43592a();
                StringBuilder sb = new StringBuilder(35);
                sb.append("Saved wifi scan of size ");
                sb.append(a);
                sb.toString();
            }
        }
    }
}
