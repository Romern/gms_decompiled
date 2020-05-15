package com.google.android.contextmanager.producer.module.indooroutdoor;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WifiFeatureGroupGenerator extends aacn {

    /* renamed from: a */
    public final Context f7715a;

    /* renamed from: b */
    public final Handler f7716b;

    /* renamed from: c */
    public volatile boolean f7717c;

    /* renamed from: d */
    public ech f7718d;

    /* renamed from: e */
    private final WifiManager f7719e;

    /* renamed from: f */
    private final ebx f7720f;

    /* renamed from: g */
    private final ebu f7721g;

    public WifiFeatureGroupGenerator(Context context, ebu ebu, ebx ebx, Looper looper) {
        super("contextmanager");
        this.f7715a = context;
        this.f7721g = ebu;
        this.f7719e = (WifiManager) context.getSystemService("wifi");
        this.f7720f = ebx;
        this.f7716b = new adzt(looper);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        List<ScanResult> list;
        if (this.f7717c && "android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            try {
                list = this.f7719e.getScanResults();
            } catch (RuntimeException e) {
                Log.e("IndoorOutdoorPredictor", "Failed to scan wifi results.", e);
                list = null;
            }
            if (list != null) {
                eci eci = new eci();
                Iterator<T> it = list.iterator();
                while (true) {
                    char c = 0;
                    if (!it.hasNext()) {
                        List a = eci.mo9955a(0);
                        List a2 = eci.mo9955a(1);
                        this.f7718d = new ech(nanos, eci.m10105b(a, 0), eci.m10104a(a, 0), eci.m10105b(a2, 1), eci.m10104a(a2, 1));
                        this.f7721g.f14626a.mo9930a();
                        break;
                    }
                    T t = (ScanResult) it.next();
                    if (t == null || !bebi.m91717a(t.BSSID)) {
                        String valueOf = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Invalid BSSID in scan result: ");
                        sb.append(valueOf);
                        Log.e("IndoorOutdoorPredictor", sb.toString());
                    } else if (!bebi.m91718a(t.BSSID, t.SSID)) {
                        String str = t.BSSID;
                        int i = t.level;
                        int i2 = t.frequency;
                        if (bebi.m91717a(str)) {
                            long a3 = bupz.m120219a(str);
                            if (bebi.m91715a(a3)) {
                                long j = a3 & 281474960982000L;
                                Map map = eci.f14680b;
                                Long valueOf2 = Long.valueOf(j);
                                ecg ecg = (ecg) map.get(valueOf2);
                                if (ecg == null) {
                                    ecg = new ecg(j);
                                    eci.f14680b.put(valueOf2, ecg);
                                }
                                if (i2 >= 2601) {
                                    c = 1;
                                }
                                int[] iArr = ecg.f14671b;
                                iArr[c] = iArr[c] + 1;
                                int[] iArr2 = ecg.f14672c;
                                iArr2[c] = iArr2[c] + i;
                            } else {
                                StringBuilder sb2 = new StringBuilder(41);
                                sb2.append("Invalid MAC address: ");
                                sb2.append(a3);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } else {
                            String valueOf3 = String.valueOf(str);
                            throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Invalid BSSID ") : "Invalid BSSID ".concat(valueOf3));
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                Log.e("IndoorOutdoorPredictor", "null scan results");
            }
            ebx ebx = this.f7720f;
            ebx.f14636b.removeMessages(2);
            ebx.mo9933a();
        }
    }
}
