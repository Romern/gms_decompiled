package p000;

import android.net.wifi.WifiInfo;

/* renamed from: oth */
final /* synthetic */ class oth implements Runnable {

    /* renamed from: a */
    private final C1585otp f38385a;

    /* renamed from: b */
    private final String f38386b;

    /* renamed from: c */
    private final int f38387c;

    /* renamed from: d */
    private final WifiInfo f38388d;

    public oth(C1585otp otp, String str, int i, WifiInfo wifiInfo) {
        this.f38385a = otp;
        this.f38386b = str;
        this.f38387c = i;
        this.f38388d = wifiInfo;
    }

    public final void run() {
        C1585otp otp = this.f38385a;
        String str = this.f38386b;
        int i = this.f38387c;
        WifiInfo wifiInfo = this.f38388d;
        otp.mo22614a();
        int i2 = otp.f38429j;
        if (i2 == 2) {
            otp.f38424e.mo17418b(bpdn.PROTOCOL_IO_ERROR, bpdo.WIFI_NETWORK_UNAVAILABLE, "Wifi network request failed - timeout");
            otp.f38422c.mo22619a(2, null, Integer.valueOf(otp.f38429j), 303, null);
            return;
        }
        otp.f38429j = i2 + 1;
        otp.f38425f.postDelayed(new oti(otp, str, i, wifiInfo), 1000);
    }
}
