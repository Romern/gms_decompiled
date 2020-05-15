package p000;

import android.net.wifi.ScanResult;

/* renamed from: ddg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddg {

    /* renamed from: a */
    public final ScanResult f12926a;

    /* renamed from: b */
    public int f12927b = 0;

    /* renamed from: c */
    public double f12928c = 1000.0d;

    public ddg(ScanResult scanResult) {
        this.f12926a = scanResult;
        this.f12927b = scanResult.level;
    }

    /* renamed from: a */
    public final String mo8538a() {
        return this.f12926a.BSSID;
    }
}
