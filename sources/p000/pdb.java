package p000;

import android.net.wifi.WifiInfo;

/* renamed from: pdb */
final /* synthetic */ class pdb implements Runnable {

    /* renamed from: a */
    private final pdz f38856a;

    /* renamed from: b */
    private final String f38857b;

    /* renamed from: c */
    private final int f38858c;

    /* renamed from: d */
    private final WifiInfo f38859d;

    public pdb(pdz pdz, String str, int i, WifiInfo wifiInfo) {
        this.f38856a = pdz;
        this.f38857b = str;
        this.f38858c = i;
        this.f38859d = wifiInfo;
    }

    public final void run() {
        pdz pdz = this.f38856a;
        String str = this.f38857b;
        int i = this.f38858c;
        WifiInfo wifiInfo = this.f38859d;
        synchronized (pdz.f38925b) {
            for (otc otc : pdz.f38928e) {
                if (!pdz.f38901E) {
                    otc.mo22599a(str, i, wifiInfo, pdz.f38933j, pdz.f38934k);
                } else {
                    pdz.f38948y.post(new pdc(pdz, otc, str, i, wifiInfo));
                }
            }
        }
    }
}
