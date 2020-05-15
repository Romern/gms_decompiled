package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.reporting.collectors.WifiScanReporter$ScanReceiver;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bgua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgua {

    /* renamed from: a */
    public final Set f117539a = new HashSet();

    /* renamed from: b */
    public final sqv f117540b;

    /* renamed from: c */
    public final Object f117541c = new Object();

    /* renamed from: d */
    public boolean f117542d;

    /* renamed from: e */
    public bgtz f117543e;

    /* renamed from: f */
    private final Context f117544f;

    /* renamed from: g */
    private WifiScanReporter$ScanReceiver f117545g;

    public bgua(Context context, sqv sqv) {
        this.f117544f = context;
        this.f117540b = sqv;
    }

    /* renamed from: a */
    public final synchronized void mo63171a() {
        if (this.f117542d) {
            bgzo.m100471b(this.f117544f, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS").cancel();
            WifiScanReporter$ScanReceiver wifiScanReporter$ScanReceiver = this.f117545g;
            if (wifiScanReporter$ScanReceiver != null) {
                try {
                    this.f117544f.unregisterReceiver(wifiScanReporter$ScanReceiver);
                    this.f117545g = null;
                } catch (IllegalArgumentException e) {
                    try {
                        bgur.m100025c("GCoreUlr", "Try to unregister a  wifi scan reporter receiver before register it!");
                        this.f117545g = null;
                    } catch (Throwable th) {
                        this.f117545g = null;
                        throw th;
                    }
                }
            }
            synchronized (this.f117541c) {
                this.f117543e = null;
                this.f117539a.clear();
            }
            this.f117542d = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo63172a(bgtz bgtz) {
        if (!this.f117542d) {
            this.f117543e = bgtz;
            if (this.f117545g == null) {
                WifiScanReporter$ScanReceiver wifiScanReporter$ScanReceiver = new WifiScanReporter$ScanReceiver(this);
                this.f117545g = wifiScanReporter$ScanReceiver;
                this.f117544f.registerReceiver(wifiScanReporter$ScanReceiver, new IntentFilter("com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS"));
            }
            PendingIntent b = bgzo.m100471b(this.f117544f, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS");
            bxbi bxbi = new bxbi(this.f117544f.getPackageName());
            bxbi.mo73557c(b);
            bxbi.mo73552a(stx.m36335a(this.f117544f, "com.google.android.gms"));
            boolean a = bgzo.m100465a(this.f117544f, bxbi.f161815a);
            this.f117542d = a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("NLP Wifi scan registration, result is ");
            sb.append(a);
            sb.toString();
        }
    }
}
