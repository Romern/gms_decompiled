package p000;

import android.net.wifi.WifiInfo;

/* renamed from: pdc */
final /* synthetic */ class pdc implements Runnable {

    /* renamed from: a */
    private final pdz f38860a;

    /* renamed from: b */
    private final String f38861b;

    /* renamed from: c */
    private final int f38862c;

    /* renamed from: d */
    private final WifiInfo f38863d;

    /* renamed from: e */
    private final otc f38864e;

    public pdc(pdz pdz, otc otc, String str, int i, WifiInfo wifiInfo) {
        this.f38860a = pdz;
        this.f38864e = otc;
        this.f38861b = str;
        this.f38862c = i;
        this.f38863d = wifiInfo;
    }

    public final void run() {
        pdz pdz = this.f38860a;
        this.f38864e.mo22599a(this.f38861b, this.f38862c, this.f38863d, pdz.f38933j, pdz.f38934k);
    }
}
