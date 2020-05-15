package p000;

import android.content.Context;
import android.hardware.SensorEvent;
import android.net.wifi.RttManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bfij extends bfgs {

    /* renamed from: a */
    protected final Context f114006a;

    /* renamed from: b */
    protected final WifiManager f114007b;

    /* renamed from: c */
    protected final bfig f114008c;

    /* renamed from: d */
    protected final bflc f114009d;

    /* renamed from: e */
    final long f114010e;

    /* renamed from: f */
    protected final Runnable f114011f = new bfih(this);

    /* renamed from: l */
    private WifiManager.WifiLock f114012l;

    /* renamed from: m */
    private int f114013m = 0;

    public bfij(Context context, bfev bfev, bflc bflc, bfew bfew, bhdb bhdb, long j, bfig bfig) {
        super(bfev, bfew, bhdb);
        bmxy.m108581a(context);
        this.f114006a = context;
        this.f114009d = bflc;
        this.f114007b = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f114008c = bfig;
        this.f114010e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61527a() {
        WifiManager.WifiLock createWifiLock = this.f114007b.createWifiLock(2, "WifiScanner");
        this.f114012l = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        this.f114012l.acquire();
        mo61713d();
        mo61723f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        try {
            WifiManager.WifiLock wifiLock = this.f114012l;
            if (wifiLock != null && wifiLock.isHeld()) {
                this.f114012l.release();
            }
            mo61714e();
        } catch (IllegalArgumentException e) {
        }
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61501g();
        }
    }

    /* renamed from: c */
    public abstract void mo61712c();

    /* renamed from: d */
    public abstract void mo61713d();

    /* renamed from: e */
    public abstract void mo61714e();

    /* renamed from: f */
    public final void mo61723f() {
        this.f113805h.removeCallbacks(this.f114011f);
        mo61712c();
        bfew bfew = this.f113806i;
        if (bfew != null) {
            int i = this.f114013m;
            this.f114013m = i + 1;
            bfew.mo61487a(i);
        }
        this.f113805h.postDelayed(this.f114011f, this.f114010e + 2000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61720a(long j, List list, List list2) {
        synchronized (this) {
            if (list != null) {
                bfev bfev = this.f113805h;
                bmxy.m108581a(list);
                bfev.post(new bfen(bfev, list, list2, j));
                mo61672a(bfgt.f113811a, j, (SensorEvent) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61721a(List list) {
        long j;
        int i;
        boolean z;
        RttManager rttManager;
        RttManager.RttCapabilities rttCapabilities;
        int i2;
        List<ScanResult> scanResults = list == null ? this.f114007b.getScanResults() : list;
        int i3 = 0;
        if (scanResults != null) {
            Iterator it = scanResults.iterator();
            while (it.hasNext()) {
                if (((ScanResult) it.next()) == null) {
                    it.remove();
                }
            }
            this.f114009d.mo61853a(scanResults);
            i = scanResults.size();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
            i = 0;
        }
        if (this.f114008c != null) {
            Context context = this.f114006a;
            bfii bfii = new bfii(this, j, scanResults);
            if (!(scanResults == null || (rttManager = (RttManager) context.getSystemService("rttmanager")) == null || (rttCapabilities = rttManager.getRttCapabilities()) == null || !rttCapabilities.twoSided11McRttSupported)) {
                ArrayList arrayList = new ArrayList();
                for (ScanResult scanResult : scanResults) {
                    if (!scanResult.is80211mcResponder() || arrayList.size() == 10) {
                        i3 = 0;
                    } else {
                        RttManager.RttParams rttParams = new RttManager.RttParams();
                        rttParams.deviceType = 1;
                        rttParams.requestType = 2;
                        rttParams.bssid = scanResult.BSSID;
                        rttParams.frequency = scanResult.frequency;
                        rttParams.numSamplesPerBurst = 5;
                        rttParams.numRetriesPerFTMR = i3;
                        rttParams.channelWidth = scanResult.channelWidth;
                        rttParams.centerFreq0 = scanResult.centerFreq0;
                        rttParams.centerFreq1 = scanResult.centerFreq1;
                        int i4 = scanResult.channelWidth;
                        if ((rttCapabilities.preambleSupported & 4) == 0) {
                            i2 = 2;
                        } else {
                            i2 = i4 < 2 ? 2 : 4;
                        }
                        rttParams.preamble = i2;
                        int i5 = scanResult.channelWidth;
                        int i6 = rttCapabilities.bwSupported;
                        rttParams.bandwidth = ((i6 & 16) != 0 && i5 >= 2) ? 16 : ((i6 & 8) != 0 && i5 > 0) ? 8 : (i6 & 4) == 0 ? 0 : i5 < 0 ? 0 : 4;
                        if (rttParams.bandwidth != 0) {
                            arrayList.add(rttParams);
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    }
                }
                RttManager.RttParams[] rttParamsArr = (RttManager.RttParams[]) arrayList.toArray(new RttManager.RttParams[arrayList.size()]);
                if (rttParamsArr.length != 0) {
                    rttManager.startRanging(rttParamsArr, new bfie(bfii));
                    return;
                }
            }
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        mo61722a(z);
        mo61720a(j, scanResults, (List) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61722a(boolean z) {
        this.f113805h.removeCallbacks(this.f114011f);
        long j = this.f114010e;
        if (!z) {
            j = Math.max(5000L, j);
        }
        this.f113805h.postDelayed(this.f114011f, j);
    }
}
