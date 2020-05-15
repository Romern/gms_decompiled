package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.android.gms.cast.discovery.WifiGuestModeDeviceScanner$1;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnj extends ply {

    /* renamed from: a */
    public static final /* synthetic */ int f39824a = 0;

    /* renamed from: b */
    private static final String[] f39825b = {"00:1A:11:FF:", "FA:8F:CA:"};

    /* renamed from: c */
    private final WifiManager f39826c;

    /* renamed from: d */
    private final pmn f39827d;

    /* renamed from: k */
    private final BroadcastReceiver f39828k = new WifiGuestModeDeviceScanner$1(this, "cast");

    public pnj(Context context, ScheduledExecutorService scheduledExecutorService, phy phy, poj poj, pmn pmn) {
        super(context, scheduledExecutorService, phy, "WifiGuestMode", poj);
        this.f39826c = (WifiManager) context.getSystemService("wifi");
        this.f39827d = pmn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23382a() {
        this.f39640e.mo23861b("stopScanInternal");
        this.f39827d.mo23424a(this);
        try {
            this.f39641f.unregisterReceiver(this.f39828k);
        } catch (IllegalArgumentException e) {
        }
        poj poj = this.f39644i;
        Set emptySet = Collections.emptySet();
        System.currentTimeMillis();
        poj.mo23521a(emptySet).mo23522a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo23386b(Set set, int i) {
        this.f39640e.mo23861b("startScanInternal");
        this.f39827d.mo23422a(set);
        this.f39641f.registerReceiver(this.f39828k, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        if (cdbt.m132500b()) {
            try {
                this.f39826c.startScan();
                return true;
            } catch (NullPointerException e) {
                this.f39640e.mo23676c(e, "Failed to start WiFi scan.", new Object[0]);
                return false;
            }
        } else {
            this.f39826c.startScan();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23384a(Set set, int i) {
        this.f39640e.mo23861b("onScanSettingsUpdated");
        this.f39827d.mo23422a(set);
        mo23479a(false);
    }

    /* renamed from: a */
    public final void mo23479a(boolean z) {
        List<ScanResult> list;
        this.f39640e.mo23856a("processLatestScanResults(%b)", Boolean.valueOf(z));
        if (qay.m31790c(this.f39641f)) {
            list = this.f39826c.getScanResults();
        } else {
            list = null;
        }
        HashSet hashSet = new HashSet();
        if (list == null) {
            this.f39640e.mo23861b("No results in WiFi scan");
        } else {
            this.f39640e.mo23856a("Number of WiFi scan results: %d", Integer.valueOf(list.size()));
            for (ScanResult scanResult : list) {
                if (scanResult != null && !TextUtils.isEmpty(scanResult.BSSID) && TextUtils.isEmpty(scanResult.SSID)) {
                    String upperCase = scanResult.BSSID.toUpperCase();
                    int i = 0;
                    Object[] objArr = {scanResult.SSID, scanResult.BSSID, Integer.valueOf(scanResult.level)};
                    String[] strArr = f39825b;
                    int length = strArr.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (upperCase.startsWith(strArr[i])) {
                            this.f39640e.mo23856a("Guest mode device within WiFi range %s", scanResult.BSSID);
                            hashSet.add(upperCase);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            this.f39827d.mo23426b(this);
        }
        if (ccxy.m132140b() && this.f39644i.f39918b.mo23495e().f39873b == null) {
            this.f39644i.mo23519a(System.currentTimeMillis()).mo23522a();
        }
        poj poj = this.f39644i;
        System.currentTimeMillis();
        poj.mo23521a(hashSet).mo23522a();
    }
}
