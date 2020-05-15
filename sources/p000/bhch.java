package p000;

import com.google.android.location.util.WifiScanNotificationHelper$1;

/* renamed from: bhch */
public final /* synthetic */ class bhch implements Runnable {

    /* renamed from: a */
    private final WifiScanNotificationHelper$1 f118294a;

    /* renamed from: b */
    private final int f118295b;

    public bhch(WifiScanNotificationHelper$1 wifiScanNotificationHelper$1, int i) {
        this.f118294a = wifiScanNotificationHelper$1;
        this.f118295b = i;
    }

    public final void run() {
        WifiScanNotificationHelper$1 wifiScanNotificationHelper$1 = this.f118294a;
        wifiScanNotificationHelper$1.f150969b.f118300e.f115424g.mo62315a(this.f118295b);
    }
}
