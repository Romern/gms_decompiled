package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSighting;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$1;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$4;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: buyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyc {

    /* renamed from: l */
    public static final /* synthetic */ int f155286l = 0;

    /* renamed from: m */
    private static final long f155287m = (TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - SystemClock.elapsedRealtimeNanos());

    /* renamed from: a */
    public final buqh f155288a;

    /* renamed from: b */
    public final Map f155289b = new HashMap();

    /* renamed from: c */
    public final buya f155290c;

    /* renamed from: d */
    public final buqn f155291d = new buxx(this, "FastPairScanner_checkForLost");

    /* renamed from: e */
    public final buqn f155292e = new buxy(this, "FastPairScanner_loseEverything");

    /* renamed from: f */
    public List f155293f;

    /* renamed from: g */
    public boolean f155294g = false;

    /* renamed from: h */
    public final Queue f155295h;

    /* renamed from: i */
    public buyb f155296i;

    /* renamed from: j */
    public final buqn f155297j = new buxz(this, "FastPairScanner_scanModeDowngrade");

    /* renamed from: k */
    public int f155298k = 1;

    /* renamed from: n */
    private final Context f155299n;

    /* renamed from: o */
    private final ScanCallback f155300o = new FastPairScanner$1(this, "nearby", "FastPairScanner");

    /* renamed from: p */
    private final IntentFilter f155301p = new IntentFilter("com.google.android.gms.nearby.ACTION_LOW_LATENCY_SCAN_BURST");

    /* renamed from: q */
    private final IntentFilter f155302q = new IntentFilter("com.google.android.gms.nearby.ACTION_FAST_PAIR_CONNECTED");

    /* renamed from: r */
    private final IntentFilter f155303r = new IntentFilter("com.google.android.gms.nearby.ACTION_FAST_PAIR_DISCONNECTED");

    /* renamed from: s */
    private final BroadcastReceiver f155304s = new FastPairScanner$4(this, "nearby");

    /* renamed from: t */
    private final BroadcastReceiver f155305t = new FastPairScanner$6(this, "nearby");

    public buyc(Context context, buya buya) {
        this.f155299n = context;
        this.f155290c = buya;
        this.f155288a = (buqh) ahgz.m55754a(context, buqh.class);
        if (cfoa.m141100g()) {
            this.f155295h = new ConcurrentLinkedQueue();
        } else {
            this.f155295h = bnfd.m109230a((int) cfoa.m141103j());
        }
    }

    /* renamed from: a */
    static int m120737a(int i) {
        if (i == Integer.MIN_VALUE) {
            return 1;
        }
        if (i == -1) {
            return 2;
        }
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68432a("buyc", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("FastPairScanner: Unknown ScanSettings scan mode: %s", i);
        return 1;
    }

    /* renamed from: b */
    private final void m120739b(int i) {
        int a = m120737a(i);
        int i2 = this.f155298k;
        if (i2 == 0) {
            throw null;
        } else if (i2 != a) {
            this.f155298k = a;
            this.f155290c.mo73176b(a);
        }
    }

    /* renamed from: e */
    private static ahgb m120740e() {
        ahgb a = ahgb.m55683a();
        if (a == null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68390d();
            bnsl.mo68432a("buyc", "e", 390, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("FastPairScanner: BluetoothLeScannerCompat is null, Bluetooth might be off. Enabled=%b", Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().isEnabled()));
        }
        return a;
    }

    /* renamed from: c */
    public final boolean mo73249c() {
        return ((PowerManager) this.f155299n.getSystemService("power")).isInteractive();
    }

    /* renamed from: d */
    public final long mo73250d() {
        if (this.f155298k == m120737a((int) cfoa.m141102i())) {
            return cfog.f184854a.mo6606a().mo82004am();
        }
        return cfog.m141288p();
    }

    /* renamed from: a */
    static BleSighting m120738a(ScanResult scanResult) {
        if (scanResult.getScanRecord() != null) {
            return new BleSighting(scanResult.getDevice(), scanResult.getScanRecord().getBytes(), scanResult.getRssi(), scanResult.getTimestampNanos() + f155287m);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo73248b() {
        this.f155288a.mo72989e(this.f155291d);
        if (!this.f155289b.isEmpty()) {
            long longValue = ((Long) Collections.min(this.f155289b.values())).longValue();
            this.f155288a.mo72983a(this.f155291d, mo73250d() - (SystemClock.elapsedRealtime() - longValue));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73246a() {
        if (this.f155296i != null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68390d();
            bnsl.mo68432a("buyc", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairScanner: Stopping scan.");
            ahgb e = m120740e();
            if (e != null) {
                try {
                    e.mo36417a(this.f155300o);
                    this.f155296i.f155283b = (int) (SystemClock.uptimeMillis() - this.f155296i.f155282a);
                    if (cfoa.m141100g()) {
                        while (((long) this.f155295h.size()) >= cfoa.m141103j()) {
                            this.f155295h.poll();
                        }
                    }
                    this.f155295h.add(this.f155296i);
                    this.f155296i = null;
                } catch (IllegalStateException e2) {
                    bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("buyc", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Could not stop scan (ok if Bluetooth is off).");
                }
                try {
                    if (cfoj.m141570t()) {
                        ahhd.m55766a(this.f155299n, this.f155304s);
                    }
                } catch (IllegalArgumentException e3) {
                    bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68432a("buyc", "a", 369, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Unable to unregister receiver.");
                }
            }
            this.f155292e.run();
            this.f155293f = null;
            m120739b(Integer.MIN_VALUE);
            return;
        }
        bnsl bnsl4 = (bnsl) bvcm.f155598a.mo68390d();
        bnsl4.mo68432a("buyc", "a", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("FastPairScanner: Scan already stopped.");
    }

    /* renamed from: a */
    public final void mo73247a(List list, int i) {
        byte[] bArr;
        byte[] bArr2;
        if (list == null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68390d();
            bnsl.mo68432a("buyc", "a", 285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FastPairScanner: Scan without filters, no-op.");
            return;
        }
        if (list.equals(this.f155293f)) {
            int i2 = this.f155298k;
            int a = m120737a(i);
            if (i2 == 0) {
                throw null;
            } else if (i2 == a && ((cfoa.m141099f() && this.f155296i != null) || !cfoa.m141099f())) {
                bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68390d();
                bnsl2.mo68432a("buyc", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("FastPairScanner: Same filters, scan mode and currentScan=%s, no-op.", this.f155296i);
                return;
            }
        }
        mo73246a();
        if (!list.isEmpty()) {
            bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68390d();
            bnsl3.mo68432a("buyc", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i3 = this.f155298k;
            String a2 = bzal.m125582a(i3);
            if (i3 != 0) {
                bnsl3.mo68424a("FastPairScanner: Starting scan, mode %s -> %s", a2, bzal.m125582a(m120737a(i)));
                ahgb e = m120740e();
                if (e != null) {
                    try {
                        ArrayList arrayList = new ArrayList(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            BleFilter bleFilter = (BleFilter) it.next();
                            ScanFilter.Builder builder = new ScanFilter.Builder();
                            if (!bmxx.m108577a(bleFilter.f29255b)) {
                                builder.setDeviceAddress(bleFilter.f29255b);
                            }
                            if (!bmxx.m108577a(bleFilter.f29254a)) {
                                builder.setDeviceName(bleFilter.f29254a);
                            }
                            int i4 = bleFilter.f29261h;
                            if (!(i4 == -1 || (bArr2 = bleFilter.f29262i) == null)) {
                                byte[] bArr3 = bleFilter.f29263j;
                                if (bArr3 != null) {
                                    builder.setManufacturerData(i4, bArr2, bArr3);
                                } else {
                                    builder.setManufacturerData(i4, bArr2);
                                }
                            }
                            ParcelUuid parcelUuid = bleFilter.f29258e;
                            if (!(parcelUuid == null || (bArr = bleFilter.f29259f) == null)) {
                                byte[] bArr4 = bleFilter.f29260g;
                                if (bArr4 != null) {
                                    builder.setServiceData(parcelUuid, bArr, bArr4);
                                } else {
                                    builder.setServiceData(parcelUuid, bArr);
                                }
                            }
                            ParcelUuid parcelUuid2 = bleFilter.f29256c;
                            if (parcelUuid2 != null) {
                                ParcelUuid parcelUuid3 = bleFilter.f29257d;
                                if (parcelUuid3 != null) {
                                    builder.setServiceUuid(parcelUuid2, parcelUuid3);
                                } else {
                                    builder.setServiceUuid(parcelUuid2);
                                }
                            }
                            arrayList.add(builder.build());
                        }
                        e.mo36418a(arrayList, new ScanSettings.Builder().setScanMode(i).build(), this.f155300o);
                        if (this.f155296i == null) {
                            this.f155296i = new buyb(SystemClock.uptimeMillis(), m120737a(i));
                        }
                        this.f155293f = list;
                        m120739b(i);
                        if (cfoj.m141570t()) {
                            ahhd.m55767a(this.f155299n, this.f155304s, this.f155301p);
                            this.f155299n.registerReceiver(this.f155304s, this.f155301p);
                        }
                        if (cfoa.f184773a.mo6606a().mo81868i()) {
                            ahhd.m55767a(this.f155299n, this.f155305t, this.f155302q);
                            ahhd.m55767a(this.f155299n, this.f155305t, this.f155303r);
                        }
                    } catch (IllegalStateException | NullPointerException e2) {
                        bnsl bnsl4 = (bnsl) bvcm.f155598a.mo68387b();
                        bnsl4.mo68437a(e2);
                        bnsl4.mo68432a("buyc", "a", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Could not start scan.");
                        if (!cfoj.f184966a.mo6606a().mo82149bf() && (e2 instanceof NullPointerException)) {
                            throw e2;
                        }
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
