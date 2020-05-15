package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$2;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ajwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwo {

    /* renamed from: a */
    public final ScheduledExecutorService f71437a = ahhr.m55804a();

    /* renamed from: b */
    public int f71438b = -2;

    /* renamed from: c */
    public final Map f71439c = new C1223np();

    /* renamed from: d */
    public ajwk f71440d;

    /* renamed from: e */
    public int f71441e = -1;

    /* renamed from: f */
    private final Context f71442f;

    /* renamed from: g */
    private final BluetoothAdapter f71443g;

    /* renamed from: h */
    private ahga f71444h;

    /* renamed from: i */
    private ahgb f71445i;

    /* renamed from: j */
    private ScanCallback f71446j;

    /* renamed from: k */
    private boolean f71447k;

    /* renamed from: l */
    private boolean f71448l;

    /* renamed from: m */
    private ScheduledFuture f71449m;

    /* renamed from: n */
    private AdvertiseCallback f71450n;

    public ajwo(Context context) {
        this.f71442f = context;
        this.f71443g = BluetoothAdapter.getDefaultAdapter();
        this.f71444h = ahga.m55680a();
        this.f71445i = ahgb.m55683a();
    }

    /* renamed from: c */
    public static String m59132c(int i) {
        return i != -2 ? i != -1 ? i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "SCAN_MODE_LOW_LATENCY" : "SCAN_MODE_BALANCED" : "SCAN_MODE_LOW_POWER" : "SCAN_MODE_OPPORTUNISTIC" : "NONE";
    }

    /* renamed from: d */
    public static String m59134d(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "Unknown" : "Silent" : "Notify" : "None";
    }

    /* renamed from: g */
    private final boolean m59135g() {
        BluetoothAdapter bluetoothAdapter = this.f71443g;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    /* renamed from: h */
    private final ajwk m59136h() {
        bnre i = bngx.m109368a(this.f71439c.values()).listIterator();
        ajwk ajwk = null;
        while (i.hasNext()) {
            ajwk ajwk2 = ((ajwl) i.next()).f71422a;
            if (ajwk == null || ajwm.LOST.equals(ajwk.f71421c)) {
                ajwk = ajwk2;
            }
            if (ajwm.CLOSE.equals(ajwk2.f71421c)) {
                if (ajwk2.f71420b == 0) {
                    return ajwk2;
                }
                ajwk = ajwk2;
            }
        }
        return ajwk;
    }

    /* renamed from: b */
    public final synchronized void mo39000b(int i) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("ajwo", "b", 457, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Scanning for FastInitiation failed with error %s. Stopping scan.", ailb.m57408a(i));
        mo39006f();
    }

    /* renamed from: c */
    public final synchronized boolean mo39003c() {
        return this.f71450n != null;
    }

    /* renamed from: e */
    public final synchronized boolean mo39005e() {
        return this.f71446j != null;
    }

    /* renamed from: f */
    public final synchronized void mo39006f() {
        if (!mo39005e()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("ajwo", "f", 594, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop scanning for FastInitiation. Not scanning.");
            return;
        }
        ScanCallback scanCallback = this.f71446j;
        if (scanCallback != null) {
            this.f71445i.mo36417a(scanCallback);
            this.f71446j = null;
        }
        this.f71440d = null;
        this.f71438b = -2;
        bnre i = bngx.m109368a(this.f71439c.values()).listIterator();
        while (i.hasNext()) {
            ((ajwl) i.next()).f71425d.cancel(true);
        }
        this.f71439c.clear();
        ScheduledFuture scheduledFuture = this.f71449m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f71449m = null;
        }
        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl2.mo68432a("ajwo", "f", 615, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped scanning for FastInitiation");
    }

    /* renamed from: a */
    private final boolean m59131a(ajjf ajjf, int i) {
        if (!cfov.m142067t() || !this.f71442f.getPackageManager().hasSystemFeature("android.hardware.bluetooth") || !this.f71442f.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || !akij.m59823a(this.f71442f) || this.f71445i == null || (!m59135g() && !mo39002b())) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("ajwo", "a", 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to scan for FastInitiation. Scanning is not supported on this device.");
            return false;
        } else if (mo39005e() && this.f71438b == i) {
            return true;
        } else {
            if (mo39005e()) {
                this.f71445i.mo36417a(this.f71446j);
                this.f71446j = null;
                this.f71438b = -2;
            }
            List singletonList = Collections.singletonList(new ScanFilter.Builder().setServiceUuid(ajwe.f71402a).build());
            ScanSettings build = new ScanSettings.Builder().setScanMode(i).setCallbackType(1).setReportDelay(0).build();
            FastInitiation$2 fastInitiation$2 = new FastInitiation$2(this, this.f71442f, "nearby", ajjf);
            ahgb ahgb = this.f71445i;
            if (ahgb == null || !ahgb.mo36418a(singletonList, build, fastInitiation$2)) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("ajwo", "a", 424, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Call to startScan for FastInitiation failed.");
                return false;
            }
            this.f71446j = fastInitiation$2;
            this.f71438b = i;
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("ajwo", "a", 430, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Started scanning for FastInitiation with mode: %s", m59132c(i));
            return true;
        }
    }

    /* renamed from: c */
    private final boolean m59133c(ajjf ajjf) {
        ajwm ajwm;
        ajwk h = m59136h();
        if (h != null) {
            ajwm = h.f71421c;
        } else {
            ajwm = ajwm.LOST;
        }
        if (!this.f71447k) {
            return m59131a(ajjf, -1);
        }
        if (ajwm.LOST.equals(ajwm) && !this.f71448l) {
            return m59131a(ajjf, 0);
        }
        return m59131a(ajjf, 2);
    }

    /* renamed from: d */
    public final synchronized void mo39004d() {
        if (!mo39003c()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("ajwo", "d", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop advertising FastInitiation. Not advertising.");
            return;
        }
        this.f71444h.mo36415a(this.f71450n);
        this.f71450n = null;
        this.f71441e = -1;
        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl2.mo68432a("ajwo", "d", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped advertising FastInitiation");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39001b(ajjf ajjf) {
        ajwk h = m59136h();
        ajwk ajwk = this.f71440d;
        if (!(ajwk instanceof ajwk) || !(h instanceof ajwk)) {
            if (ajwk == h) {
                return;
            }
        } else if (sdg.m34949a(Integer.valueOf(ajwk.f71419a), Integer.valueOf(h.f71419a)) && sdg.m34949a(Integer.valueOf(ajwk.f71420b), Integer.valueOf(h.f71420b)) && sdg.m34949a(ajwk.f71421c, h.f71421c)) {
            return;
        }
        if (h != null) {
            ajjf.mo38695a(h.f71419a, h.f71420b, h.f71421c);
            this.f71440d = new ajwk(h.f71419a, h.f71420b, h.f71421c);
            return;
        }
        ajwk ajwk2 = this.f71440d;
        if (ajwk2 != null) {
            ajjf.mo38695a(ajwk2.f71419a, ajwk2.f71420b, ajwm.LOST);
            this.f71440d = null;
        }
    }

    /* renamed from: b */
    public final boolean mo39002b() {
        if (!cfov.f185185a.mo6606a().mo82390n()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        BluetoothAdapter bluetoothAdapter = this.f71443g;
        return bluetoothAdapter != null && bluetoothAdapter.isBleScanAlwaysAvailable();
    }

    /* renamed from: a */
    public final synchronized void mo38994a() {
        if (mo39003c()) {
            mo39004d();
        }
        if (mo39005e()) {
            mo39006f();
        }
        this.f71437a.shutdown();
    }

    /* renamed from: a */
    public final synchronized void mo38995a(ajjf ajjf) {
        if (mo39005e()) {
            this.f71448l = false;
            m59133c(ajjf);
            this.f71449m = null;
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("ajwo", "a", 452, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastInitiation warming period has ended");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38996a(ajjf ajjf, ScanResult scanResult) {
        double d;
        if (mo39005e()) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord == null) {
                srn srn = ajvp.f71371a;
            } else {
                ajwe a = ajwe.m59129a(scanRecord.getServiceData(ajwe.f71402a));
                if (a == null) {
                    srn srn2 = ajvp.f71371a;
                } else {
                    srn srn3 = ajvp.f71371a;
                    scanResult.getRssi();
                    String address = scanResult.getDevice().getAddress();
                    int rssi = scanResult.getRssi();
                    ajwl ajwl = (ajwl) this.f71439c.get(address);
                    if (ajwl == null) {
                        ajwl = new ajwl(this, new ajwg(this, ajjf, address));
                        this.f71439c.put(address, ajwl);
                    } else {
                        ajwl.f71425d.cancel(true);
                        ajwl.f71425d = ajwl.f71426e.f71437a.schedule(ajwl.f71424c, cfov.m142068u(), TimeUnit.MILLISECONDS);
                    }
                    int i = a.f71405c;
                    ajwk ajwk = ajwl.f71422a;
                    ajwk.f71419a = i;
                    ajwk.f71420b = a.f71406d;
                    long aT = cfov.f185185a.mo6606a().mo82311aT();
                    ajwn ajwn = ajwl.f71423b;
                    double d2 = (double) (rssi + ((int) aT));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ajwn.f71434d = d2;
                    if (!ajwn.f71436f) {
                        long j = elapsedRealtime - ajwn.f71433c;
                        int i2 = ajwn.f71435e >= d2 ? ajwn.f71432b : ajwn.f71431a;
                        if (i2 != 0) {
                            double d3 = (double) j;
                            double d4 = (double) i2;
                            Double.isNaN(d3);
                            Double.isNaN(d4);
                            d = Math.min(d3 / d4, 1.0d);
                        } else {
                            d = 1.0d;
                        }
                        d2 = ((1.0d - d) * ajwn.f71435e) + (ajwn.f71434d * d);
                        ajwn.f71435e = d2;
                    } else {
                        ajwn.f71435e = d2;
                        ajwn.f71436f = false;
                    }
                    ajwn.f71433c = elapsedRealtime;
                    double b = nhe.m26254b((int) d2, a.f71407e) * 100.0d;
                    ajwm ajwm = ajwl.f71422a.f71421c;
                    if (b < ((double) cfov.f185185a.mo6606a().mo82287W())) {
                        ajwl.mo38991a(ajwm.CLOSE);
                    } else if (b >= ((double) cfov.f185185a.mo6606a().mo82288X())) {
                        if (b < ((double) cfov.f185185a.mo6606a().mo82289Y())) {
                            ajwl.mo38991a(ajwm.FAR);
                        } else if (b >= ((double) cfov.f185185a.mo6606a().mo82290Z())) {
                            ajwl.mo38991a(ajwm.LOST);
                        } else if (ajwm.CLOSE.equals(ajwm)) {
                            ajwl.mo38991a(ajwm.FAR);
                        }
                    } else if (ajwm.LOST.equals(ajwm)) {
                        ajwl.mo38991a(ajwm.FAR);
                    }
                    m59133c(ajjf);
                }
            }
            mo39001b(ajjf);
            return;
        }
        srn srn4 = ajvp.f71371a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38997a(ajjf ajjf, String str) {
        this.f71439c.remove(str);
        if (mo39005e()) {
            m59133c(ajjf);
            mo39001b(ajjf);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo38998a(int i) {
        String str;
        int i2 = i;
        synchronized (this) {
            this.f71444h = ahga.m55680a();
            String str2 = "ajwo";
            if (!cfov.m142067t()) {
                str = str2;
            } else if (!this.f71442f.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                str = str2;
            } else if (!this.f71442f.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                str = str2;
            } else if (!m59135g()) {
                str = str2;
            } else if (this.f71444h != null) {
                if (mo39003c()) {
                    if (this.f71441e != i2) {
                        mo39004d();
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl.mo68432a(str2, "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Restarting FastInitiation advertising with type=%s.", m59134d(i));
                    } else {
                        String str3 = str2;
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl2.mo68432a(str3, "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Failed to advertise FastInitiation. Already advertising with type=%s.", m59134d(i));
                        return false;
                    }
                }
                ajwe a = ajwe.m59128a(i);
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(true).build();
                bqgy c = bqgy.m112818c();
                ajwh ajwh = new ajwh(c);
                ahga ahga = this.f71444h;
                AdvertiseData.Builder addServiceUuid = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(ajwe.f71402a);
                ParcelUuid parcelUuid = ajwe.f71402a;
                int i3 = a.f71405c;
                int i4 = a.f71406d;
                int i5 = (i4 & 7) << 2;
                byte[] bArr = {(byte) (i5 | ((byte) (i3 << 5))), (byte) (-a.f71407e)};
                byte[] bArr2 = ajwe.f71403b;
                char c2 = 0;
                byte[][] bArr3 = {bArr};
                char c3 = 0;
                while (c3 <= 0) {
                    byte[] bArr4 = bArr3[c2];
                    int length = bArr2.length;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[(length + length2)];
                    System.arraycopy(bArr2, 0, bArr5, 0, length);
                    System.arraycopy(bArr4, 0, bArr5, length, length2);
                    bArr2 = bArr5;
                    bArr3 = bArr3;
                    str2 = str2;
                    c3 = 1;
                    c2 = 0;
                }
                String str4 = str2;
                if (ahga.mo36416a(build, addServiceUuid.addServiceData(parcelUuid, bArr2).build(), ajwh)) {
                    try {
                        c.get(cfov.m142041Q(), TimeUnit.SECONDS);
                        this.f71450n = ajwh;
                        this.f71441e = i2;
                        srn srn = ajvp.f71371a;
                        return true;
                    } catch (InterruptedException e) {
                        String str5 = str4;
                        Thread.currentThread().interrupt();
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68387b();
                        bnsl3.mo68432a(str5, "a", 302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Interrupted while waiting to start FastInitiation advertising.");
                        return false;
                    } catch (ExecutionException e2) {
                        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68387b();
                        bnsl4.mo68437a(e2);
                        bnsl4.mo68432a(str4, "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Failed to start FastInitiation advertising.");
                        return false;
                    } catch (TimeoutException e3) {
                        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68387b();
                        bnsl5.mo68437a(e3);
                        bnsl5.mo68432a(str4, "a", 307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68415a("Failed to start FastInitiation advertising in %d seconds.", cfov.m142041Q());
                        return false;
                    }
                } else {
                    String str6 = str4;
                    bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68387b();
                    bnsl6.mo68432a(str6, "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Failed to start FastInitiation advertising.");
                    return false;
                }
            } else {
                str = str2;
            }
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl7.mo68432a(str, "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Failed to advertise FastInitiation. Advertising is not supported on this device.");
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo38999a(boolean z, ajjf ajjf) {
        boolean c;
        this.f71445i = ahgb.m55683a();
        this.f71447k = z;
        this.f71448l = true;
        c = m59133c(ajjf);
        if (c) {
            this.f71449m = this.f71437a.schedule(new ajwf(this, ajjf), cfov.f185185a.mo6606a().mo82321ad(), TimeUnit.MILLISECONDS);
        } else {
            this.f71447k = false;
            this.f71448l = false;
        }
        return c;
    }
}
