package p000;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiScanner;
import android.net.wifi.rtt.WifiRttManager;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: bgkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgkc implements bgnx {

    /* renamed from: a */
    public final Context f116682a;

    /* renamed from: b */
    public final bfor f116683b;

    /* renamed from: c */
    public final bgkg f116684c;

    /* renamed from: d */
    public final WifiManager f116685d;

    /* renamed from: e */
    public final bugp f116686e;

    /* renamed from: f */
    public final Executor f116687f;

    /* renamed from: g */
    public bgls f116688g;

    /* renamed from: h */
    private final bgkg f116689h;

    public bgkc(Context context, bugp bugp, bfor bfor, bgkg bgkg, bgkg bgkg2, WifiManager wifiManager, Executor executor) {
        this.f116682a = context;
        this.f116686e = bugp;
        this.f116683b = bfor;
        this.f116684c = bgkg;
        this.f116689h = bgkg2;
        this.f116685d = wifiManager;
        this.f116687f = executor;
    }

    /* renamed from: a */
    public final void mo62800a(bgnq bgnq, boolean z, bgmj bgmj) {
        WifiRttManager wifiRttManager;
        bgnq bgnq2 = bgnq;
        bfor bfor = this.f116683b;
        bfor.mo62047a(new bfop(bfos.WIFI_REQUEST_SCAN, bfor.mo62055b(), "%2$d", bgnq.ordinal()));
        bgkx bgkx = bgkx.f116729g;
        bgkg bgkg = this.f116689h;
        bgke bgke = (bgnq2 == bgnq.LOCATOR && (ceze.m138458c() || cfas.f183550a.mo6606a().addRttToWifiScan()) && (wifiRttManager = (WifiRttManager) this.f116682a.getSystemService("wifirtt")) != null && wifiRttManager.isAvailable()) ? new bgke(this.f116682a, bgkg, this.f116683b, this.f116687f) : bgkg;
        if (bgnq2 == bgnq.LOCATOR) {
            Context context = this.f116682a;
            if (ceze.m138459d()) {
                aki.m919a(context).mo874a(new Intent("com.google.android.location.internal.WIFI_SCAN_STARTED"));
            }
        }
        bgkx.mo62947a(this.f116682a, bgke, z, bgmj, bgnq2 != bgnq.LOCATOR, this.f116683b, this.f116687f);
    }

    /* renamed from: b */
    public final void mo62804b() {
        bglb bglb = ((bgkm) bgkx.f116729g).f116710a;
        if (bglb != null) {
            boolean scanResults = bglb.f116744a.getScanResults();
            StringBuilder sb = new StringBuilder(43);
            sb.append("wifiScanner.getScanResults() returned ");
            sb.append(scanResults);
            sb.toString();
        }
    }

    /* renamed from: c */
    public final boolean mo62805c() {
        return this.f116685d.reconnect();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgkm.a(boolean, int, int, boolean):android.net.wifi.WifiScanner$ScanSettings
     arg types: [int, int, int, boolean]
     candidates:
      bgkj.a(android.app.AlarmManager, long, android.app.PendingIntent, bgmj):void
      bgkj.a(android.content.Context, java.lang.String, android.location.LocationListener, android.os.Looper):void
      bgkx.a(android.app.AlarmManager, long, android.app.PendingIntent, bgmj):void
      bgkx.a(android.content.Context, java.lang.String, android.location.LocationListener, android.os.Looper):void
      bgkm.a(boolean, int, int, boolean):android.net.wifi.WifiScanner$ScanSettings */
    /* renamed from: a */
    public final void mo62801a(boolean z, long j, int i, boolean z2) {
        bgls bgls;
        StringBuilder sb = new StringBuilder(91);
        sb.append("setupWifiBatching: enable is ");
        sb.append(z);
        sb.append(", period is ");
        sb.append(j);
        sb.append(", maxScans is ");
        sb.append(i);
        sb.toString();
        if (!ceuk.m138257b() || (bgls = this.f116688g) == null || !bgls.mo62988a()) {
            bgls bgls2 = this.f116688g;
            if (bgls2 != null && bgls2.mo62989b()) {
                bmxy.m108581a(this.f116688g);
                this.f116688g.mo62991c();
            }
            bgkx bgkx = bgkx.f116729g;
            Context context = this.f116682a;
            bgkg bgkg = this.f116684c;
            StringBuilder sb2 = new StringBuilder(75);
            sb2.append("setupWifiBatching, enable is ");
            sb2.append(z);
            sb2.append(" and scanIntervai is ");
            sb2.append(j);
            sb2.toString();
            if (bgkx.mo62952a(context, 8)) {
                WifiScanner wifiScanner = (WifiScanner) context.getSystemService("wifiscanner");
                if (z) {
                    bgkm bgkm = (bgkm) bgkx;
                    bglb bglb = bgkm.f116710a;
                    if (bglb == null) {
                        WifiScanner.ScanSettings a = bgkm.mo62950a(false, (int) j, i, z2);
                        bgkm.f116710a = new bglb(wifiScanner, bgkg, false);
                        wifiScanner.startBackgroundScan(a, bgkm.f116710a);
                        return;
                    }
                    wifiScanner.stopBackgroundScan(bglb);
                    return;
                }
                bgkm bgkm2 = (bgkm) bgkx;
                bglb bglb2 = bgkm2.f116710a;
                if (bglb2 != null) {
                    wifiScanner.stopBackgroundScan(bglb2);
                    bgkm2.f116710a = null;
                }
            }
        } else if (z) {
            StringBuilder sb3 = new StringBuilder(74);
            sb3.append("setting batch nanoapp period ");
            sb3.append(j);
            sb3.append(", maxScans is ");
            sb3.append(i);
            sb3.toString();
            bmxy.m108581a(this.f116688g);
            this.f116688g.mo62990a(j, ((long) i) * j);
        } else {
            bmxy.m108581a(this.f116688g);
            this.f116688g.mo62990a(0, 0);
        }
    }

    /* renamed from: a */
    public final void mo62802a(bfnt[] bfntArr, bges bges) {
        bgkb bgkb = new bgkb(this, bges);
        bgkx bgkx = bgkx.f116729g;
        Context context = this.f116682a;
        bfor bfor = this.f116683b;
        Executor executor = this.f116687f;
        WifiRttManager wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt");
        if (wifiRttManager != null) {
            ArrayList arrayList = new ArrayList();
            for (bfnt bfnt : bfntArr) {
                if (bfnt instanceof bgjq) {
                    arrayList.add(((bgjq) bfnt).f116644h);
                } else {
                    String valueOf = String.valueOf(bfnt);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("startWifiRanging: non-RealWifiRttDevice is ");
                    sb.append(valueOf);
                    sb.toString();
                }
            }
            ((bgkr) bgkx).mo62957a(wifiRttManager, arrayList, bgkb, bfor, executor);
        }
    }

    /* renamed from: a */
    public final boolean mo62803a() {
        bgls bgls;
        boolean a = bgkx.f116729g.mo62952a(this.f116682a, 8);
        boolean b = ceuk.m138257b();
        StringBuilder sb = new StringBuilder(75);
        sb.append("wifiBatchScanSupported: hardwareCapable is ");
        sb.append(a);
        sb.append(", isNanoAppAllowed is ");
        sb.append(b);
        sb.toString();
        if (!a) {
            return ceuk.m138257b() && (bgls = this.f116688g) != null && bgls.mo62988a();
        }
        return true;
    }
}
