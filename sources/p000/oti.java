package p000;

import android.net.Network;
import android.net.wifi.WifiInfo;

/* renamed from: oti */
final /* synthetic */ class oti implements Runnable {

    /* renamed from: a */
    private final C1585otp f38389a;

    /* renamed from: b */
    private final String f38390b;

    /* renamed from: c */
    private final int f38391c;

    /* renamed from: d */
    private final WifiInfo f38392d;

    public oti(C1585otp otp, String str, int i, WifiInfo wifiInfo) {
        this.f38389a = otp;
        this.f38390b = str;
        this.f38391c = i;
        this.f38392d = wifiInfo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otp.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void
     arg types: [java.lang.String, int, android.net.wifi.WifiInfo, ?[OBJECT, ARRAY], int]
     candidates:
      otp.a(android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, boolean):void
      otp.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void */
    public final void run() {
        this.f38389a.mo22617a(this.f38390b, this.f38391c, this.f38392d, (Network) null, false);
    }
}
