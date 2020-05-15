package p000;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;

/* renamed from: asbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbk {

    /* renamed from: a */
    public final String f88665a;

    /* renamed from: b */
    public final int f88666b;

    /* renamed from: c */
    public final int f88667c;

    /* renamed from: d */
    public final int f88668d;

    public asbk(ScanResult scanResult, int i) {
        this.f88665a = scanResult.SSID;
        this.f88666b = WifiManager.calculateSignalLevel(scanResult.level, 4);
        this.f88667c = !scanResult.capabilities.contains("WEP") ? !scanResult.capabilities.contains("PSK") ? scanResult.capabilities.contains("EAP") ? 3 : 0 : 2 : 1;
        this.f88668d = i;
    }

    public final String toString() {
        String str = this.f88665a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append("AccessPoint<");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
