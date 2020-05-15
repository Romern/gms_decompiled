package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import com.google.location.nearby.direct.bluetooth.state.BackgroundBleScanner$3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: buwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwo {

    /* renamed from: a */
    public static final buyz[] f155154a = {buyz.BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS};

    /* renamed from: b */
    public static final ParcelUuid f155155b = ParcelUuid.fromString("0000FE2C-0000-1000-8000-00805F9B34FB");

    /* renamed from: c */
    public final Context f155156c;

    /* renamed from: d */
    public final buqh f155157d;

    /* renamed from: e */
    public final Map f155158e = new HashMap();

    /* renamed from: f */
    public final skc f155159f;

    /* renamed from: g */
    public buyc f155160g;

    /* renamed from: h */
    public boolean f155161h;

    /* renamed from: i */
    public boolean f155162i;

    /* renamed from: j */
    public boolean f155163j;

    /* renamed from: k */
    public boolean f155164k;

    /* renamed from: l */
    public Integer f155165l;

    /* renamed from: m */
    public long f155166m = 0;

    /* renamed from: n */
    public final BroadcastReceiver f155167n = new BackgroundBleScanner$3(this, "nearby");

    /* renamed from: o */
    public int f155168o = 1;

    /* renamed from: p */
    private final buwt f155169p;

    /* renamed from: q */
    private final bvbu f155170q;

    /* renamed from: r */
    private BleSettings f155171r;

    /* renamed from: s */
    private List f155172s = Collections.emptyList();

    /* renamed from: t */
    private final buqn f155173t = new buwg(this, "BackgroundBleScanner_stopScanBurst");

    /* renamed from: u */
    private final buya f155174u = new buwk(this);

    public buwo(Context context, buwt buwt) {
        sdo.m34959a(context);
        this.f155156c = context;
        sdo.m34959a(buwt);
        this.f155169p = buwt;
        this.f155157d = (buqh) ahgz.m55754a(context, buqh.class);
        this.f155170q = (bvbu) ahgz.m55754a(context, bvbu.class);
        this.f155159f = new skc(context);
    }

    /* renamed from: a */
    static int m120591a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return 3;
        } else {
            if (i2 == 2) {
                return 0;
            }
            if (i2 == 3) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68432a("buwo", "a", 713, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String a = bzal.m125582a(i);
            if (i != 0) {
                bnsl.mo68420a("BackgroundBleScanner: Unknown BleScanMode: %s", a);
                return 3;
            }
            throw null;
        }
    }

    /* renamed from: b */
    private static int m120594b(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 2;
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68432a("buwo", "b", 729, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("BackgroundBleScanner: Unknown BleSettings scan mode: %s", i);
        return 1;
    }

    /* renamed from: c */
    public final PendingIntent mo73184c() {
        return PendingIntent.getBroadcast(this.f155156c, 0, new Intent("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE"), 134217728);
    }

    /* renamed from: d */
    public final void mo73185d() {
        int i;
        int i2;
        if (!this.f155161h) {
            this.f155157d.mo72989e(this.f155173t);
        } else if (!this.f155157d.mo72985b(this.f155173t)) {
            this.f155157d.mo72983a(this.f155173t, cfoa.f184773a.mo6606a().mo81877r());
        }
        int i3 = 1;
        if (mo73188g()) {
            buwn f = mo73187f();
            byyg byyg = this.f155170q.f155567b;
            boolean e = mo73186e();
            Integer num = this.f155165l;
            int i4 = 3;
            if (num != null) {
                i = num.intValue();
            } else if (this.f155161h && m120593a(f.f155153c)) {
                byya byya = byyg.f168925h;
                if (byya == null) {
                    byya = byya.f168860j;
                }
                byxz byxz = byya.f168866e;
                if (byxz == null) {
                    byxz = byxz.f168853e;
                }
                int b = bzal.m125583b(byxz.f168856b);
                if (b == 0) {
                    b = 1;
                }
                i = m120591a(b);
            } else if (m120595b(f.f155153c)) {
                i = this.f155164k ? 3 : 0;
            } else if (!e) {
                byya byya2 = byyg.f168925h;
                if (byya2 == null) {
                    byya2 = byya.f168860j;
                }
                byxz byxz2 = byya2.f168866e;
                if (byxz2 == null) {
                    byxz2 = byxz.f168853e;
                }
                int b2 = bzal.m125583b(byxz2.f168857c);
                if (b2 == 0) {
                    b2 = 1;
                }
                i = m120591a(b2);
            } else {
                byya byya3 = byyg.f168925h;
                if (byya3 == null) {
                    byya3 = byya.f168860j;
                }
                byxz byxz3 = byya3.f168866e;
                if (byxz3 == null) {
                    byxz3 = byxz.f168853e;
                }
                int b3 = bzal.m125583b(byxz3.f168858d);
                if (b3 == 0) {
                    b3 = 1;
                }
                i = m120591a(b3);
            }
            nem nem = new nem();
            nem.mo20536a(f.f155152b);
            nem.mo20538b(i);
            nem.mo20537a(f.f155151a);
            byya byya4 = byyg.f168925h;
            if (byya4 == null) {
                byya4 = byya.f168860j;
            }
            nem.mo20534a(byya4.f168869h);
            nem.f35408a = 1;
            BleSettings a = nem.mo20533a();
            if (this.f155160g == null && !this.f155172s.isEmpty() && !cfoa.f184773a.mo6606a().mo81870k()) {
                this.f155160g = new buyc(this.f155156c, this.f155174u);
            }
            if (this.f155160g != null) {
                if (cfoj.m141520A() && (this.f155161h || e)) {
                    buyc buyc = this.f155160g;
                    List list = this.f155172s;
                    if (!buyc.f155294g) {
                        i2 = (int) cfog.m141289q();
                    } else {
                        i2 = (int) cfog.m141287o();
                    }
                    buyc.mo73247a(list, i2);
                } else {
                    this.f155160g.mo73246a();
                }
            }
            if (a.equals(this.f155171r)) {
                srn srn = bvcm.f155598a;
                return;
            }
            srn srn2 = bvcm.f155598a;
            this.f155171r = a;
            if (i != 0) {
                if (i == 1) {
                    i4 = 4;
                } else if (i == 2) {
                    i4 = 5;
                } else if (i != 3) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68432a("buwo", "b", 729, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("BackgroundBleScanner: Unknown BleSettings scan mode: %s", i);
                    i4 = 1;
                } else {
                    i4 = 2;
                }
            }
            this.f155168o = i4;
            this.f155169p.mo73199a(a, this.f155174u);
        } else {
            srn srn3 = bvcm.f155598a;
            this.f155169p.mo73202a(this.f155174u);
            buyc buyc2 = this.f155160g;
            if (buyc2 != null) {
                buyc2.mo73246a();
            }
            this.f155171r = null;
            this.f155168o = 1;
            for (buwm buwm : this.f155158e.keySet()) {
                buwm.mo73152a();
            }
            mo73183b();
        }
        int i5 = this.f155168o;
        buyc buyc3 = this.f155160g;
        if (buyc3 != null) {
            i3 = buyc3.f155298k;
        }
        mo73179a(i5, i3);
    }

    /* renamed from: e */
    public final boolean mo73186e() {
        if (cfoa.m141101h()) {
            return this.f155162i;
        }
        PowerManager powerManager = (PowerManager) this.f155156c.getSystemService("power");
        return powerManager != null && powerManager.isScreenOn();
    }

    /* renamed from: f */
    public final buwn mo73187f() {
        List list;
        HashSet hashSet = new HashSet(this.f155158e.size());
        Set<BleFilter> hashSet2 = new HashSet(this.f155158e.size());
        WorkSource workSource = new WorkSource();
        boolean z = false;
        for (buwn buwn : this.f155158e.values()) {
            hashSet.addAll(Arrays.asList(buwn.f155153c));
            List list2 = buwn.f155151a;
            if (list2.isEmpty()) {
                hashSet2 = Collections.emptySet();
                z = true;
            } else if (!z) {
                hashSet2.addAll(list2);
            }
            workSource.add(buwn.f155152b);
        }
        if (cfoj.m141520A()) {
            ArrayList arrayList = new ArrayList();
            for (BleFilter bleFilter : hashSet2) {
                if (f155155b.equals(bleFilter.f29258e)) {
                    arrayList.add(bleFilter);
                }
            }
            this.f155172s = arrayList;
            hashSet2.removeAll(arrayList);
        }
        if (hashSet2.isEmpty() && hashSet.contains(buyz.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON)) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buwo", "f", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BackgroundBleScanner: Can't do always-on scanning without filters.");
            hashSet.remove(buyz.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON);
        }
        BleSettings bleSettings = this.f155171r;
        if (bleSettings != null) {
            List list3 = bleSettings.f29268d;
            if (hashSet2.size() == list3.size() && hashSet2.containsAll(list3)) {
                list = this.f155171r.f29268d;
                return new buwn(list, workSource, (buyz[]) hashSet.toArray(new buyz[0]));
            }
        }
        list = new ArrayList(hashSet2);
        return new buwn(list, workSource, (buyz[]) hashSet.toArray(new buyz[0]));
    }

    /* renamed from: g */
    public final boolean mo73188g() {
        return this.f155163j && this.f155169p.mo73216o();
    }

    /* renamed from: b */
    public static boolean m120595b(buyz[] buyzArr) {
        return sqc.m35963b(buyzArr, buyz.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON);
    }

    /* renamed from: a */
    public static boolean m120592a(Context context, buyz[] buyzArr) {
        if (buyzArr == null) {
            return true;
        }
        buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
        for (buyz buyz : buyzArr) {
            if (buyz == buyz.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON && (buxb == null || !buxb.f155209g.mo73207f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo73183b() {
        this.f155159f.mo25668a(mo73184c());
        this.f155164k = false;
    }

    /* renamed from: a */
    public static boolean m120593a(buyz[] buyzArr) {
        return sqc.m35963b(buyzArr, buyz.BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS);
    }

    /* renamed from: a */
    public final void mo73178a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b = cfoa.f184773a.mo6606a().mo81861b();
        long a = cfoa.f184773a.mo6606a().mo81860a();
        long j = this.f155166m;
        if (j + b < elapsedRealtime) {
            this.f155166m = elapsedRealtime;
        } else if (!this.f155164k && j + a < elapsedRealtime) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68390d();
            bnsl.mo68432a("buwo", "a", (int) ErrorInfo.TYPE_FSC_OTHER_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68417a("BackgroundBleScanner: Wake up rate too high, pausing for %tM:%tS.", b, b);
            this.f155164k = true;
            this.f155159f.mo25674a("NearbyDirect_BackgroundBleScanner_Unpause", 2, elapsedRealtime + b, mo73184c(), mo73187f().f155152b);
            mo73185d();
        }
    }

    /* renamed from: a */
    public final void mo73179a(int i, int i2) {
        for (buwm buwm : this.f155158e.keySet()) {
            buwm.mo73153a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo73180a(buwm buwm, List list, WorkSource workSource, buyz[] buyzArr) {
        if (buyzArr == null) {
            buyzArr = f155154a;
        }
        if (m120592a(this.f155156c, buyzArr)) {
            this.f155158e.put(buwm, new buwn(Collections.unmodifiableList(list), workSource, buyzArr));
            if (this.f155163j) {
                this.f155156c.unregisterReceiver(this.f155167n);
            }
            this.f155163j = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED");
            int i = Build.VERSION.SDK_INT;
            intentFilter.addAction("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
            if (m120593a(mo73187f().f155153c)) {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                if (cfoa.m141101h()) {
                    intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON");
                    intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF");
                }
            }
            if (m120595b(mo73187f().f155153c)) {
                intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE");
            }
            this.f155156c.registerReceiver(this.f155167n, intentFilter);
            this.f155161h = true;
            mo73185d();
            return;
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buwo", "a", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("BackgroundBleScanner: Ignoring request, scanning strategies unsupported (%s), maybe the device doesn't support hardware-offloaded filters.", Arrays.toString(buyzArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73181a(BleSighting bleSighting) {
        BluetoothDevice bluetoothDevice;
        if (!this.f155163j) {
            return;
        }
        if (bleSighting == null || (bluetoothDevice = bleSighting.f29271a) == null || bluetoothDevice.getAddress() == null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68437a(new IllegalStateException());
            bnsl.mo68432a("buwo", "a", 645, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BackgroundBleScanner: Invalid scan result: %s", bleSighting);
        } else if (bleSighting.f29272b != null) {
            for (buwm buwm : this.f155158e.keySet()) {
                Iterator it = ((buwn) this.f155158e.get(buwm)).f155151a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((BleFilter) it.next()).mo17292a(bleSighting)) {
                            buwm.mo73154a(bleSighting);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl2.mo68437a(new IllegalStateException());
            bnsl2.mo68432a("buwo", "a", 658, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("BackgroundBleScanner: Scan record with null bytes: %s", bleSighting);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73182a(String str) {
        char c;
        srn srn = bvcm.f155598a;
        switch (str.hashCode()) {
            case -2128145023:
                if (str.equals("android.intent.action.SCREEN_OFF")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1530327060:
                if (str.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1454123155:
                if (str.equals("android.intent.action.SCREEN_ON")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -737417248:
                if (str.equals("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 360422632:
                if (str.equals("android.bluetooth.adapter.action.BLE_STATE_CHANGED")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 575967096:
                if (str.equals("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 880469964:
                if (str.equals("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1524764930:
                if (str.equals("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                this.f155162i = true;
            case 2:
                this.f155161h = true;
                break;
            case 3:
            case 4:
                this.f155162i = false;
                this.f155161h = false;
                break;
            case 5:
                mo73183b();
                break;
            case 6:
            case 7:
                break;
            default:
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("buwo", "a", 631, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("BackgroundBleScanner: Unexpected action=%s", str);
                break;
        }
        mo73185d();
    }
}
