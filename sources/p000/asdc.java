package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.google.android.gms.smartdevice.utils.wifi.WifiDiscoveryManager$WifiScanResultsReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: asdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdc {

    /* renamed from: a */
    public final Handler f88725a = new adzt();

    /* renamed from: b */
    public final Runnable f88726b = new asda(this);

    /* renamed from: c */
    public final WifiManager f88727c;

    /* renamed from: d */
    private final Context f88728d;

    /* renamed from: e */
    private final Pattern f88729e;

    /* renamed from: f */
    private final asdb f88730f;

    /* renamed from: g */
    private BroadcastReceiver f88731g;

    /* renamed from: h */
    private final Set f88732h = new HashSet();

    public asdc(Context context, Pattern pattern, asdb asdb) {
        WifiManager a = asdd.m73822a(context);
        sdo.m34959a(context);
        this.f88728d = context;
        sdo.m34959a(pattern);
        this.f88729e = pattern;
        sdo.m34959a(asdb);
        this.f88730f = asdb;
        sdo.m34959a(a);
        this.f88727c = a;
    }

    /* renamed from: a */
    public final synchronized void mo49058a() {
        if (!mo49061c()) {
            mo49059a(this.f88727c.getScanResults());
            WifiDiscoveryManager$WifiScanResultsReceiver wifiDiscoveryManager$WifiScanResultsReceiver = new WifiDiscoveryManager$WifiScanResultsReceiver(this);
            this.f88731g = wifiDiscoveryManager$WifiScanResultsReceiver;
            this.f88728d.registerReceiver(wifiDiscoveryManager$WifiScanResultsReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            this.f88725a.post(this.f88726b);
        }
    }

    /* renamed from: b */
    public final synchronized void mo49060b() {
        if (mo49061c()) {
            BroadcastReceiver broadcastReceiver = this.f88731g;
            if (broadcastReceiver != null) {
                this.f88728d.unregisterReceiver(broadcastReceiver);
                this.f88731g = null;
            }
            this.f88725a.removeCallbacksAndMessages(this.f88726b);
            this.f88732h.clear();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo49061c() {
        return this.f88731g != null;
    }

    /* renamed from: a */
    public final synchronized void mo49059a(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (this.f88729e.matcher(scanResult.SSID).matches()) {
                    hashMap.put(scanResult.SSID, scanResult);
                }
            }
        }
        Set<String> b = rsr.m34361b(hashMap.keySet(), this.f88732h);
        Set<String> b2 = rsr.m34361b(hashMap.keySet(), b);
        Set<String> b3 = rsr.m34361b(this.f88732h, hashMap.keySet());
        if (!b.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : b) {
                ScanResult scanResult2 = (ScanResult) hashMap.get(str);
                if (scanResult2 != null) {
                    hashSet.add(scanResult2);
                }
            }
            this.f88730f.mo48997a(hashSet);
        }
        if (!b2.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            for (String str2 : b2) {
                ScanResult scanResult3 = (ScanResult) hashMap.get(str2);
                if (scanResult3 != null) {
                    hashSet2.add(scanResult3);
                }
            }
            ((asai) this.f88730f).mo48997a(hashSet2);
        }
        if (!b3.isEmpty()) {
            asdb asdb = this.f88730f;
            synchronized (((asai) asdb).f88586d) {
                for (String str3 : b3) {
                    arwm arwm = ((asai) asdb).f88584b;
                    synchronized (arwm.f88366a) {
                        arwm.f88367b.remove(str3);
                    }
                }
            }
            ((asai) asdb).f88584b.notifyDataSetChanged();
        }
        this.f88732h.addAll(b);
        this.f88732h.removeAll(b3);
    }
}
