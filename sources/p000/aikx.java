package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.AdvertisingSetParameters;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.WorkSource;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import com.google.android.gms.nearby.mediums.BluetoothLowEnergy$2;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aikx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aikx {

    /* renamed from: i */
    public static final /* synthetic */ int f69072i = 0;

    /* renamed from: j */
    private static final ParcelUuid f69073j = new ParcelUuid(airk.f69554a);

    /* renamed from: k */
    private static final ParcelUuid f69074k = new ParcelUuid(airk.f69555b);

    /* renamed from: A */
    private final Map f69075A = new C1223np();

    /* renamed from: B */
    private final Set f69076B = new C1225nr();

    /* renamed from: C */
    private final bqgj f69077C = ahhr.m55806b();

    /* renamed from: D */
    private final SecureRandom f69078D = new SecureRandom();

    /* renamed from: a */
    airo f69079a;

    /* renamed from: b */
    public final Map f69080b = new ConcurrentHashMap();

    /* renamed from: c */
    public aijv f69081c;

    /* renamed from: d */
    public aikw f69082d;

    /* renamed from: e */
    public aikl f69083e;

    /* renamed from: f */
    public aikl f69084f;

    /* renamed from: g */
    public aikb f69085g;

    /* renamed from: h */
    public aikb f69086h;

    /* renamed from: l */
    private final Context f69087l;

    /* renamed from: m */
    private final BluetoothManager f69088m;

    /* renamed from: n */
    private final BluetoothAdapter f69089n;

    /* renamed from: o */
    private final airs f69090o;

    /* renamed from: p */
    private final aiqk f69091p = new aiqk();

    /* renamed from: q */
    private final ScheduledExecutorService f69092q = ahhr.m55804a();

    /* renamed from: r */
    private final Map f69093r = new C1223np();

    /* renamed from: s */
    private final neg f69094s;

    /* renamed from: t */
    private final aiku f69095t = new aiku();

    /* renamed from: u */
    private final int f69096u = ((int) cfnv.f184625a.mo6606a().mo81718D());

    /* renamed from: v */
    private final Map f69097v = new C1223np();

    /* renamed from: w */
    private final Map f69098w = new C1223np();

    /* renamed from: x */
    private final byte[] f69099x;

    /* renamed from: y */
    private aijx f69100y;

    /* renamed from: z */
    private aikj f69101z;

    public aikx(Context context, airs airs) {
        Context applicationContext = context.getApplicationContext();
        this.f69087l = applicationContext;
        this.f69090o = airs;
        this.f69094s = nef.m26014a(applicationContext);
        int i = Build.VERSION.SDK_INT;
        this.f69088m = (BluetoothManager) this.f69087l.getSystemService("bluetooth");
        this.f69089n = BluetoothAdapter.getDefaultAdapter();
        String a = ahhg.m55779a();
        long nextLong = new SecureRandom().nextLong();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20);
        sb.append(a);
        sb.append(nextLong);
        this.f69099x = ails.m57446a(sb.toString().getBytes(), 2);
    }

    /* renamed from: a */
    private final aiqp m57350a(String str, byte[] bArr, ahfk ahfk, int i) {
        String str2;
        if (bArr != null) {
            str2 = sqd.m35972d(bArr);
        } else {
            str2 = null;
        }
        aijz aijz = new aijz(this.f69087l, str, new aijo(this, str2), this.f69078D, ahfk, i);
        if (m57351a(this.f69090o.mo37908b(aijz))) {
            aiqp aiqp = aijz.f69008e;
            if (!(aiqp == null || bArr == null)) {
                this.f69075A.put(str2, new aiks(aiqp, aijz));
            }
            return aiqp;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aikx", "a", 1798, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to create an outgoing MultiplexBleSocket to %s because the MediumOperation was unable to be registered.", str);
        return null;
    }

    /* renamed from: e */
    public static void m57353e() {
        try {
            Thread.sleep(cfnv.f184625a.mo6606a().mo81716B());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    public static boolean m57354f() {
        if (!cfnv.f184625a.mo6606a().mo81734T()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: g */
    public static boolean m57355g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!cfnv.f184625a.mo6606a().mo81733S()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return defaultAdapter != null && defaultAdapter.isLeExtendedAdvertisingSupported();
    }

    /* renamed from: i */
    private final boolean m57358i() {
        AdvertiseData advertiseData;
        AdvertiseData advertiseData2;
        AdvertiseData advertiseData3;
        int i;
        int i2 = 2;
        AdvertiseData advertiseData4 = null;
        if (m57371v()) {
            AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            AdvertiseData.Builder addServiceUuid = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(f69073j);
            Map map = this.f69080b;
            aikj aikj = this.f69101z;
            int i3 = aikj != null ? aikj.f69042a.f69448a : 0;
            byte[] bArr = new byte[128];
            this.f69078D.nextBytes(bArr);
            String str = new String(bArr);
            buqd buqd = new buqd(new byte[10], new aiqn());
            buqd.mo72978a(str);
            byte[] a = m57352a(bArr);
            for (aijw aijw : map.values()) {
                if (aijw != null) {
                    buqd.mo72978a(aijw.f68996a);
                    byte[] bArr2 = aijw.f68997b;
                    ByteBuffer allocate = ByteBuffer.allocate(a.length + bArr2.length);
                    allocate.put(a);
                    allocate.put(bArr2);
                    a = m57352a(allocate.array());
                }
            }
            byte[] a2 = aipg.m57650a(2, this.f69096u, buqd.mo72980a(), a, i3);
            if (a2 != null) {
                addServiceUuid.addServiceData(f69073j, a2);
                advertiseData2 = includeTxPowerLevel.build();
                advertiseData = addServiceUuid.build();
            } else {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "i", 574, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to start a BLE legacy advertisement because creating an advertisement header failed.");
                return false;
            }
        } else {
            advertiseData2 = null;
            advertiseData = null;
        }
        if (this.f69100y != null) {
            AdvertiseData.Builder includeTxPowerLevel2 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            AdvertiseData.Builder includeTxPowerLevel3 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            aikg aikg = this.f69100y.f69001c;
            if (aikg != null) {
                includeTxPowerLevel2.addServiceData(f69074k, aikg.f69030a).setIncludeTxPowerLevel(cfnv.m140778b());
                includeTxPowerLevel3.addServiceUuid(f69074k);
            }
            aikf aikf = this.f69100y.f69002d;
            if (aikf != null) {
                includeTxPowerLevel2.addServiceUuid(f69073j);
                if (!f69073j.equals(aikf.f69028a)) {
                    includeTxPowerLevel2.addServiceUuid(aikf.f69028a);
                }
                includeTxPowerLevel3.addServiceData(aikf.f69028a, aikf.f69029b);
            }
            advertiseData4 = includeTxPowerLevel2.build();
            advertiseData3 = includeTxPowerLevel3.build();
        } else {
            advertiseData3 = null;
        }
        int l = m57361l();
        AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
        if (l != 0) {
            i = (int) cfnv.f184625a.mo6606a().mo81717C();
        } else {
            i = 2;
        }
        AdvertiseSettings.Builder advertiseMode = builder.setAdvertiseMode(i);
        if (l == 0) {
            i2 = 3;
        }
        AdvertiseSettings build = advertiseMode.setTxPowerLevel(i2).setConnectable(true).build();
        if (!(advertiseData4 == null || advertiseData3 == null)) {
            aikl aikl = new aikl(build, advertiseData4, advertiseData3);
            if (!m57351a(this.f69090o.mo37908b(aikl))) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aikx", "i", 637, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to advertise a fast legacy advertisement over BLE because the MediumOperation failed to register.");
                return false;
            }
            this.f69084f = aikl;
            srn srn = ailf.f69111a;
        }
        if (!(advertiseData2 == null || advertiseData == null)) {
            aikl aikl2 = new aikl(build, advertiseData2, advertiseData);
            if (!m57351a(this.f69090o.mo37908b(aikl2))) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68432a("aikx", "i", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to advertise legacy GATT header over BLE because the MediumOperation failed to register.");
                this.f69090o.mo37910c(this.f69084f);
                return false;
            }
            this.f69083e = aikl2;
            srn srn2 = ailf.f69111a;
        }
        return true;
    }

    /* renamed from: j */
    private final void m57359j() {
        AdvertiseData advertiseData;
        int i;
        int i2;
        AdvertiseData advertiseData2 = null;
        if (!m57371v() || this.f69080b.isEmpty()) {
            advertiseData = null;
        } else {
            AdvertiseData.Builder addServiceUuid = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(f69073j);
            addServiceUuid.addServiceData(f69073j, ((aijw) this.f69080b.values().iterator().next()).f68997b);
            advertiseData = addServiceUuid.build();
        }
        if (this.f69100y != null) {
            AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            aikg aikg = this.f69100y.f69001c;
            if (aikg != null) {
                includeTxPowerLevel.addServiceData(f69074k, aikg.f69030a).setIncludeTxPowerLevel(cfnv.m140778b());
                includeTxPowerLevel.addServiceUuid(f69074k);
            }
            aikf aikf = this.f69100y.f69002d;
            if (aikf != null) {
                includeTxPowerLevel.addServiceUuid(f69073j);
                if (!f69073j.equals(aikf.f69028a)) {
                    includeTxPowerLevel.addServiceUuid(aikf.f69028a);
                }
                includeTxPowerLevel.addServiceData(aikf.f69028a, aikf.f69029b);
            }
            advertiseData2 = includeTxPowerLevel.build();
        }
        int l = m57361l();
        AdvertisingSetParameters.Builder builder = new AdvertisingSetParameters.Builder();
        if (l != 0) {
            i = 1600;
        } else {
            i = 160;
        }
        AdvertisingSetParameters.Builder interval = builder.setInterval(i);
        if (l != 0) {
            i2 = -7;
        } else {
            i2 = 1;
        }
        AdvertisingSetParameters build = interval.setTxPowerLevel(i2).setConnectable(true).build();
        if (advertiseData2 != null) {
            aikb aikb = new aikb(build, advertiseData2);
            if (m57351a(this.f69090o.mo37908b(aikb))) {
                this.f69086h = aikb;
                srn srn = ailf.f69111a;
            } else {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "j", 748, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to advertise a fast extended advertisement over BLE because the MediumOperation failed to register.");
            }
        }
        if (advertiseData != null) {
            aikb aikb2 = new aikb(build, advertiseData);
            if (m57351a(this.f69090o.mo37908b(aikb2))) {
                this.f69085g = aikb2;
                srn srn2 = ailf.f69111a;
                return;
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aikx", "j", 765, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to advertise regular extended advertisement over BLE because the MediumOperation failed to register.");
        }
    }

    /* renamed from: k */
    private final void m57360k() {
        aikl aikl = this.f69083e;
        if (aikl != null) {
            this.f69090o.mo37910c(aikl);
        }
        aikl aikl2 = this.f69084f;
        if (aikl2 != null) {
            this.f69090o.mo37910c(aikl2);
        }
        aikb aikb = this.f69085g;
        if (aikb != null) {
            this.f69090o.mo37910c(aikb);
        }
        aikb aikb2 = this.f69086h;
        if (aikb2 != null) {
            this.f69090o.mo37910c(aikb2);
        }
        this.f69083e = null;
        this.f69084f = null;
        this.f69085g = null;
        this.f69086h = null;
    }

    /* renamed from: l */
    private final int m57361l() {
        aijx aijx = this.f69100y;
        if (aijx != null && aijx.f69000b == 0) {
            return 0;
        }
        for (aijw aijw : this.f69080b.values()) {
            if (aijw != null && aijw.f68998c == 0) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: m */
    private final int m57362m() {
        for (aikt aikt : this.f69093r.values()) {
            if (aikt.f69063a == 0) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: n */
    private final boolean m57363n() {
        return this.f69079a != null;
    }

    /* renamed from: o */
    private final boolean m57364o() {
        int i = 2;
        if (m57355g()) {
            List singletonList = Collections.singletonList(new ScanFilter.Builder().setServiceUuid(f69073j).build());
            ScanSettings.Builder builder = new ScanSettings.Builder();
            if (m57362m() != 0) {
                i = 0;
            }
            aike aike = new aike(singletonList, builder.setScanMode(i).setCallbackType(1).setLegacy(false).setReportDelay(0).build(), new BluetoothLowEnergy$2(this, "nearby", "BluetoothLowEnergy"), new aijj(this), this.f69092q, this.f69095t.mo37603a());
            if (!m57351a(this.f69090o.mo37908b(aike))) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "q", 1260, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to start BLE extended included scanning because the MediumOperation failed to register.");
                return false;
            }
            this.f69079a = aike;
            return true;
        }
        Iterator it = this.f69093r.values().iterator();
        WorkSource workSource = null;
        while (true) {
            if (it.hasNext()) {
                aikt aikt = (aikt) it.next();
                if (aikt.f69063a == 0) {
                    workSource = aikt.f69064b;
                    break;
                }
                workSource = aikt.f69064b;
            } else {
                break;
            }
        }
        if (workSource != null) {
            neh neh = new neh();
            neh.mo20517a(f69073j);
            List singletonList2 = Collections.singletonList(neh.mo20515a());
            nem nem = new nem();
            if (m57362m() != 0) {
                i = 0;
            }
            nem.mo20538b(i);
            nem.mo20534a(1);
            nem.mo20535a(0L);
            nem.mo20537a(singletonList2);
            nem.f35408a = 1;
            nem.mo20536a(workSource);
            BleSettings a = nem.mo20533a();
            aikr aikr = new aikr(this.f69094s, new aijr(this), a, new aiji(this), this.f69092q, this.f69095t.mo37603a());
            if (!m57351a(this.f69090o.mo37908b(aikr))) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aikx", "p", 1200, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Failed to start BLE Legacy only scanning with settings %s because the MediumOperation failed to register.", a);
                return false;
            }
            this.f69079a = aikr;
            return true;
        }
        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
        bnsl3.mo68432a("aikx", "p", 1145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("Cannot start BLE Legacy only scanning because no WorkSource could be found.");
        return false;
    }

    /* renamed from: p */
    private final boolean m57365p() {
        int i;
        Iterator it = this.f69093r.values().iterator();
        WorkSource workSource = null;
        while (true) {
            if (it.hasNext()) {
                aikt aikt = (aikt) it.next();
                if (aikt.f69063a == 0) {
                    workSource = aikt.f69064b;
                    break;
                }
                workSource = aikt.f69064b;
            } else {
                break;
            }
        }
        if (workSource != null) {
            neh neh = new neh();
            neh.mo20517a(f69073j);
            List singletonList = Collections.singletonList(neh.mo20515a());
            nem nem = new nem();
            if (m57362m() != 0) {
                i = 0;
            } else {
                i = 2;
            }
            nem.mo20538b(i);
            nem.mo20534a(1);
            nem.mo20535a(0L);
            nem.mo20537a(singletonList);
            nem.f35408a = 1;
            nem.mo20536a(workSource);
            BleSettings a = nem.mo20533a();
            aikr aikr = new aikr(this.f69094s, new aijr(this), a, new aiji(this), this.f69092q, this.f69095t.mo37603a());
            if (!m57351a(this.f69090o.mo37908b(aikr))) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "p", 1200, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to start BLE Legacy only scanning with settings %s because the MediumOperation failed to register.", a);
                return false;
            }
            this.f69079a = aikr;
            return true;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aikx", "p", 1145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Cannot start BLE Legacy only scanning because no WorkSource could be found.");
        return false;
    }

    /* renamed from: q */
    private final boolean m57366q() {
        int i;
        List singletonList = Collections.singletonList(new ScanFilter.Builder().setServiceUuid(f69073j).build());
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (m57362m() != 0) {
            i = 0;
        } else {
            i = 2;
        }
        aike aike = new aike(singletonList, builder.setScanMode(i).setCallbackType(1).setLegacy(false).setReportDelay(0).build(), new BluetoothLowEnergy$2(this, "nearby", "BluetoothLowEnergy"), new aijj(this), this.f69092q, this.f69095t.mo37603a());
        if (!m57351a(this.f69090o.mo37908b(aike))) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "q", 1260, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to start BLE extended included scanning because the MediumOperation failed to register.");
            return false;
        }
        this.f69079a = aike;
        return true;
    }

    /* renamed from: r */
    private final void m57367r() {
        if (!m57363n()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aikx", "r", 1304, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop BLE scanning because there is no scan in progress.");
            return;
        }
        this.f69090o.mo37910c(this.f69079a);
        this.f69079a = null;
    }

    /* renamed from: s */
    private final boolean m57368s() {
        aikj aikj = new aikj(this.f69089n, this.f69080b, new aijk(this));
        if (!m57351a(this.f69090o.mo37908b(aikj))) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "s", 1517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to open a BLE L2CAP server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
            return false;
        }
        this.f69101z = aikj;
        return true;
    }

    /* renamed from: t */
    private final boolean m57369t() {
        aikw aikw = new aikw(this.f69087l, new aijl(this));
        if (!m57351a(this.f69090o.mo37908b(aikw))) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "t", 1550, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to open a BLE server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
            return false;
        }
        this.f69082d = aikw;
        return true;
    }

    /* renamed from: u */
    private final void m57370u() {
        if (!mo37625d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aikx", "u", 1623, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop the BLE server socket because it was never started.");
            return;
        }
        this.f69090o.mo37910c(this.f69082d);
        this.f69082d = null;
        aikj aikj = this.f69101z;
        if (aikj != null) {
            this.f69090o.mo37910c(aikj);
            this.f69101z = null;
        }
    }

    /* renamed from: v */
    private final boolean m57371v() {
        return this.f69081c != null;
    }

    /* renamed from: w */
    private final boolean m57372w() {
        ayrr ayrr = new ayrr();
        ayrq ayrq = new ayrq();
        for (int i = 0; i < this.f69096u; i++) {
            aiju aiju = new aiju(this, i);
            ayrq.f98376a.put(new BluetoothGattCharacteristic(airk.m57795a(aiju.f68990a), 2, 1), aiju);
        }
        ayrr.f98377a.put(airk.f69554a, ayrq);
        aijv aijv = new aijv(this.f69087l, this.f69088m, ayrr);
        if (!m57351a(this.f69090o.mo37908b(aijv))) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "w", 1866, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Fail to start an advertisement GATT server because BluetoothLowEnergy was unable to register the MediumOperation.");
            return false;
        }
        this.f69081c = aijv;
        return true;
    }

    /* renamed from: x */
    private final void m57373x() {
        if (!m57371v()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aikx", "x", 1914, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to stop the advertisement GATT server because it's not running.");
            return;
        }
        this.f69090o.mo37910c(this.f69081c);
        this.f69081c = null;
    }

    /* renamed from: b */
    public final synchronized void mo37620b(String str) {
        if (!mo37616a(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aikx", "b", 967, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Cannot stop BLE advertising for service ID %s because it never started.", str);
            return;
        }
        m57360k();
        aijx aijx = this.f69100y;
        if (aijx != null) {
            if (aijx.f68999a.equals(str)) {
                this.f69100y = null;
            }
        }
        Set<Integer> set = (Set) this.f69097v.remove(str);
        if (set != null) {
            for (Integer num : set) {
                this.f69080b.remove(Integer.valueOf(num.intValue()));
            }
        }
        if (this.f69100y == null) {
            if (this.f69097v.isEmpty()) {
                if (this.f69076B.isEmpty()) {
                    srn srn = ailf.f69111a;
                    m57373x();
                }
                srn srn2 = ailf.f69111a;
            }
        }
        if (!m57356h()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aikx", "b", 988, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to restart BLE advertisement after stopping BLE advertisement for service ID %s.", str);
        }
        srn srn22 = ailf.f69111a;
    }

    /* renamed from: c */
    public final synchronized void mo37622c() {
        this.f69091p.mo37861b();
    }

    /* renamed from: d */
    public final void mo37624d(String str) {
        this.f69095t.mo37605b(str);
        synchronized (this) {
            if (mo37623c(str)) {
                int m = m57362m();
                this.f69093r.remove(str);
                this.f69091p.mo37859a(str);
                int m2 = m57362m();
                if (this.f69093r.isEmpty()) {
                    m57367r();
                } else if (m != m2) {
                    m57367r();
                    if (!m57364o()) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                        bnsl.mo68432a("aikx", "d", 1394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Failed to restart BLE scan after stopping BLE scan for service ID %s.", str);
                    }
                }
                srn srn = ailf.f69111a;
                return;
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aikx", "d", 1376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Cannot stop BLE scanning for service ID %s because it never started.", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo37625d() {
        return this.f69082d != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01bc  */
    /* renamed from: h */
    private final boolean m57356h() {
        boolean z;
        AdvertiseData advertiseData;
        AdvertiseData advertiseData2;
        int i;
        int i2;
        AdvertiseData advertiseData3;
        AdvertiseData advertiseData4;
        AdvertiseData advertiseData5;
        AdvertiseData advertiseData6;
        int i3;
        int i4 = 2;
        if (m57371v()) {
            AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            AdvertiseData.Builder addServiceUuid = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(f69073j);
            Map map = this.f69080b;
            aikj aikj = this.f69101z;
            int i5 = aikj != null ? aikj.f69042a.f69448a : 0;
            byte[] bArr = new byte[128];
            this.f69078D.nextBytes(bArr);
            String str = new String(bArr);
            buqd buqd = new buqd(new byte[10], new aiqn());
            buqd.mo72978a(str);
            byte[] a = m57352a(bArr);
            for (aijw aijw : map.values()) {
                if (aijw != null) {
                    buqd.mo72978a(aijw.f68996a);
                    byte[] bArr2 = aijw.f68997b;
                    ByteBuffer allocate = ByteBuffer.allocate(a.length + bArr2.length);
                    allocate.put(a);
                    allocate.put(bArr2);
                    a = m57352a(allocate.array());
                }
            }
            byte[] a2 = aipg.m57650a(2, this.f69096u, buqd.mo72980a(), a, i5);
            if (a2 != null) {
                addServiceUuid.addServiceData(f69073j, a2);
                advertiseData4 = includeTxPowerLevel.build();
                advertiseData3 = addServiceUuid.build();
            } else {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "i", 574, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to start a BLE legacy advertisement because creating an advertisement header failed.");
                z = false;
                if (z || !m57355g()) {
                    return z;
                }
                if (!m57371v() || this.f69080b.isEmpty()) {
                    advertiseData = null;
                } else {
                    AdvertiseData.Builder addServiceUuid2 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(f69073j);
                    addServiceUuid2.addServiceData(f69073j, ((aijw) this.f69080b.values().iterator().next()).f68997b);
                    advertiseData = addServiceUuid2.build();
                }
                if (this.f69100y != null) {
                    AdvertiseData.Builder includeTxPowerLevel2 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                    aikg aikg = this.f69100y.f69001c;
                    if (aikg != null) {
                        includeTxPowerLevel2.addServiceData(f69074k, aikg.f69030a).setIncludeTxPowerLevel(cfnv.m140778b());
                        includeTxPowerLevel2.addServiceUuid(f69074k);
                    }
                    aikf aikf = this.f69100y.f69002d;
                    if (aikf != null) {
                        includeTxPowerLevel2.addServiceUuid(f69073j);
                        if (!f69073j.equals(aikf.f69028a)) {
                            includeTxPowerLevel2.addServiceUuid(aikf.f69028a);
                        }
                        includeTxPowerLevel2.addServiceData(aikf.f69028a, aikf.f69029b);
                    }
                    advertiseData2 = includeTxPowerLevel2.build();
                } else {
                    advertiseData2 = null;
                }
                int l = m57361l();
                AdvertisingSetParameters.Builder builder = new AdvertisingSetParameters.Builder();
                if (l != 0) {
                    i = 1600;
                } else {
                    i = 160;
                }
                AdvertisingSetParameters.Builder interval = builder.setInterval(i);
                if (l != 0) {
                    i2 = -7;
                } else {
                    i2 = 1;
                }
                AdvertisingSetParameters build = interval.setTxPowerLevel(i2).setConnectable(true).build();
                if (advertiseData2 != null) {
                    aikb aikb = new aikb(build, advertiseData2);
                    if (m57351a(this.f69090o.mo37908b(aikb))) {
                        this.f69086h = aikb;
                        srn srn = ailf.f69111a;
                    } else {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl2.mo68432a("aikx", "j", 748, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to advertise a fast extended advertisement over BLE because the MediumOperation failed to register.");
                    }
                }
                if (advertiseData != null) {
                    aikb aikb2 = new aikb(build, advertiseData);
                    if (m57351a(this.f69090o.mo37908b(aikb2))) {
                        this.f69085g = aikb2;
                        srn srn2 = ailf.f69111a;
                    } else {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl3.mo68432a("aikx", "j", 765, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Failed to advertise regular extended advertisement over BLE because the MediumOperation failed to register.");
                    }
                }
                return true;
            }
        } else {
            advertiseData4 = null;
            advertiseData3 = null;
        }
        if (this.f69100y != null) {
            AdvertiseData.Builder includeTxPowerLevel3 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            AdvertiseData.Builder includeTxPowerLevel4 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            aikg aikg2 = this.f69100y.f69001c;
            if (aikg2 != null) {
                includeTxPowerLevel3.addServiceData(f69074k, aikg2.f69030a).setIncludeTxPowerLevel(cfnv.m140778b());
                includeTxPowerLevel4.addServiceUuid(f69074k);
            }
            aikf aikf2 = this.f69100y.f69002d;
            if (aikf2 != null) {
                includeTxPowerLevel3.addServiceUuid(f69073j);
                if (!f69073j.equals(aikf2.f69028a)) {
                    includeTxPowerLevel3.addServiceUuid(aikf2.f69028a);
                }
                includeTxPowerLevel4.addServiceData(aikf2.f69028a, aikf2.f69029b);
            }
            advertiseData6 = includeTxPowerLevel3.build();
            advertiseData5 = includeTxPowerLevel4.build();
        } else {
            advertiseData6 = null;
            advertiseData5 = null;
        }
        int l2 = m57361l();
        AdvertiseSettings.Builder builder2 = new AdvertiseSettings.Builder();
        if (l2 != 0) {
            i3 = (int) cfnv.f184625a.mo6606a().mo81717C();
        } else {
            i3 = 2;
        }
        AdvertiseSettings.Builder advertiseMode = builder2.setAdvertiseMode(i3);
        if (l2 == 0) {
            i4 = 3;
        }
        AdvertiseSettings build2 = advertiseMode.setTxPowerLevel(i4).setConnectable(true).build();
        if (!(advertiseData6 == null || advertiseData5 == null)) {
            aikl aikl = new aikl(build2, advertiseData6, advertiseData5);
            if (!m57351a(this.f69090o.mo37908b(aikl))) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68432a("aikx", "i", 637, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to advertise a fast legacy advertisement over BLE because the MediumOperation failed to register.");
                z = false;
                if (z) {
                }
                return z;
            }
            this.f69084f = aikl;
            srn srn3 = ailf.f69111a;
        }
        if (advertiseData4 == null) {
            z = true;
        } else {
            if (advertiseData3 != null) {
                aikl aikl2 = new aikl(build2, advertiseData4, advertiseData3);
                if (!m57351a(this.f69090o.mo37908b(aikl2))) {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl5.mo68432a("aikx", "i", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("Failed to advertise legacy GATT header over BLE because the MediumOperation failed to register.");
                    this.f69090o.mo37910c(this.f69084f);
                    z = false;
                } else {
                    this.f69083e = aikl2;
                    srn srn4 = ailf.f69111a;
                }
            }
            z = true;
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean mo37623c(String str) {
        return this.f69093r.containsKey(str);
    }

    /* renamed from: f */
    public final synchronized void mo37627f(String str) {
        if (!mo37626e(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aikx", "f", 1645, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Can't stop accepting BLE connections for service ID %s because it was never started.", str);
            return;
        }
        this.f69098w.remove(str);
    }

    /* renamed from: e */
    public final synchronized boolean mo37626e(String str) {
        return this.f69082d != null && this.f69098w.containsKey(str);
    }

    /* renamed from: g */
    public final synchronized void mo37628g(String str) {
        if (str != null) {
            aiks aiks = (aiks) this.f69075A.remove(str);
            if (aiks != null) {
                this.f69090o.mo37910c(aiks.f69062b);
            }
        }
    }

    /* renamed from: a */
    private static boolean m57351a(airr airr) {
        airr airr2 = airr.UNKNOWN;
        int ordinal = airr.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError(String.format("Unknown RegistrationResult %s", airr));
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static byte[] m57352a(byte[] bArr) {
        return ails.m57446a(bArr, 4);
    }

    /* renamed from: a */
    public final synchronized aipe mo37607a(aysl aysl, int i, aipe aipe, int i2, Set set) {
        synchronized (this) {
            aipe aipe2 = aipe != null ? aipe : new aipe();
            if (aysl == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "a", 2053, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Can't read from an advertisement GATT server because bluetoothDevice is null.");
                return aipe2;
            } else if (!mo37621b()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aikx", "a", 2059, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Can't read from an advertisement GATT server because BLE is not available.");
                return aipe2;
            } else {
                ayrk e = ayrl.m84663e();
                e.mo54322b();
                e.mo54321a(cfnv.m140790n());
                aiki aiki = new aiki(this.f69087l, this.f69089n, aysl, e.mo54320a(), i, aipe2, this.f69095t.mo37603a(), i2, set);
                if (!m57351a(this.f69090o.mo37908b(aiki))) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl3.mo68432a("aikx", "a", 2089, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to read from an advertisement GATT server because the MediumOperation was unable to be registered.");
                }
                this.f69090o.mo37910c(aiki);
                return aipe2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo37621b() {
        if (!cfnv.f184625a.mo6606a().mo81747aF()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return this.f69087l.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.f69087l.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && this.f69088m != null && this.f69089n != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* renamed from: a */
    public final synchronized aiqc mo37608a(int i, String str, byte[] bArr, String str2, ahfk ahfk, int i2) {
        aiqp aiqp;
        String str3;
        String str4 = str2;
        synchronized (this) {
            if (bArr != null) {
                try {
                    if (this.f69075A.containsKey(sqd.m35972d(bArr))) {
                        aiks aiks = (aiks) this.f69075A.get(sqd.m35972d(bArr));
                        aiqp = aiks != null ? aiks.f69061a : null;
                        if (aiqp != null) {
                            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                            bnsl.mo68432a("aikx", "a", 1727, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68424a("Failed to retrieve a physical BLE socket to %s when creating a BLE socket for service ID %s.", str, str4);
                            return null;
                        }
                        aiqc a = aiqp.mo37863a(i, str4);
                        if (a != null) {
                            return a;
                        }
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl2.mo68432a("aikx", "a", 1737, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68424a("Failed to create a per-client BLE socket to %s for service ID %s.", str, str4);
                        if (bArr == null) {
                            if (aiqp instanceof aira) {
                                ((aira) aiqp).mo37879a();
                            } else {
                                ((aiqy) aiqp).mo37872a();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bArr != null) {
                str3 = sqd.m35972d(bArr);
            } else {
                str3 = null;
            }
            aijz aijz = new aijz(this.f69087l, str, new aijo(this, str3), this.f69078D, ahfk, i2);
            if (!m57351a(this.f69090o.mo37908b(aijz))) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68432a("aikx", "a", 1798, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Failed to create an outgoing MultiplexBleSocket to %s because the MediumOperation was unable to be registered.", str);
                aiqp = null;
            } else {
                aiqp = aijz.f69008e;
                if (aiqp != null) {
                    if (bArr != null) {
                        this.f69075A.put(str3, new aiks(aiqp, aijz));
                    }
                }
            }
            if (aiqp != null) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized aiqc mo37609a(aipt aipt, String str, int i, ahfk ahfk) {
        if (aipt == null || str == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "a", 1671, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to create client BLE socket because at least one of blePeripheral or serviceId is null.");
            return null;
        } else if (ahfk.mo36401b()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aikx", "a", 1678, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("Can't create client BLE socket to %s for service ID %s because the action has been cancelled", aipt, str);
            return null;
        } else {
            return this.f69091p.mo37856a(aipt, new aijn(this, str, ahfk, aipt));
        }
    }

    /* renamed from: a */
    public final synchronized void mo37610a() {
        ahhr.m55805a(this.f69092q, "BluetoothLowEnergy.onLostExecutor");
        ahhr.m55805a(this.f69077C, "BluetoothLowEnergy.singleThreadOffloader");
        Iterator it = new C1225nr(this.f69097v.keySet()).iterator();
        while (it.hasNext()) {
            mo37620b((String) it.next());
        }
        m57373x();
        Iterator it2 = new C1225nr(this.f69098w.keySet()).iterator();
        while (it2.hasNext()) {
            mo37627f((String) it2.next());
        }
        m57370u();
        Iterator it3 = new C1225nr(this.f69093r.keySet()).iterator();
        while (it3.hasNext()) {
            mo37624d((String) it3.next());
        }
        this.f69091p.mo37857a();
    }

    /* renamed from: a */
    public final synchronized void mo37611a(aiqc aiqc) {
        ahob ahob;
        Iterator it = this.f69098w.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ahob = null;
                break;
            }
            String str = (String) it.next();
            if (Arrays.equals(aiqc.mo37841d(), m57357h(str))) {
                ahob = (ahob) this.f69098w.get(str);
                break;
            }
        }
        String a = ails.m57438a(aiqc.mo37841d());
        if (ahob == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aikx", "a", 1576, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Received an incoming BLE socket with service ID hash %s, but no clients map to that socket.", a);
            ails.m57440a(aiqc, "BLE", a);
            return;
        }
        airo airo = new airo(38);
        if (!m57351a(this.f69090o.mo37908b(airo))) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aikx", "a", 1587, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to accept an incoming BLE socket because BluetoothLowEnergy was unable to register the MediumOperation.");
            ails.m57440a(aiqc, "BLE", a);
            return;
        }
        this.f69076B.add(aiqc);
        aiqc.mo37637a(new aijm(this, airo, aiqc));
        ahpo ahpo = ahob.f67648a;
        ahpo.f67739c.mo36847a(new ahpn(ahpo, aiqc));
    }

    /* renamed from: a */
    public final synchronized void mo37612a(airo airo, aiqc aiqc) {
        this.f69090o.mo37910c(airo);
        this.f69076B.remove(aiqc);
        if (this.f69076B.isEmpty() && this.f69097v.isEmpty()) {
            m57373x();
        }
        if (this.f69076B.isEmpty() && this.f69098w.isEmpty()) {
            m57370u();
        }
    }

    /* renamed from: a */
    public final synchronized void mo37613a(BleSighting bleSighting) {
        this.f69091p.mo37858a(bleSighting, new aijt(this));
    }

    /* renamed from: a */
    public final void mo37614a(Runnable runnable) {
        this.f69077C.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized boolean mo37615a(WorkSource workSource, String str, ahoj ahoj, int i, ParcelUuid parcelUuid) {
        if (workSource == null || str == null || ahoj == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "a", 1035, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start BLE scanning because at least one of workSource, serviceId, ordiscoveredPeripheralCallback is null.");
            return false;
        } else if (mo37623c(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aikx", "a", 1042, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Refusing to start BLE scanning for service ID %s because we are already scanning for that service ID.", str);
            return false;
        } else if (!mo37621b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aikx", "a", 1050, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to start BLE scanning for service ID %s because BLE is not available.", str);
            return false;
        } else {
            int m = m57362m();
            this.f69091p.mo37860a(str, ahoj, parcelUuid);
            this.f69093r.put(str, new aikt(i, workSource));
            this.f69095t.mo37604a(str);
            int m2 = m57362m();
            if (m57363n()) {
                if (m != m2) {
                    m57367r();
                }
            }
            if (m57363n() || m57364o()) {
                return true;
            }
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68432a("aikx", "a", 1074, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Failed to start BLE scanning for service ID %s because the BLE scan failed to start.", str);
            mo37624d(str);
            return false;
        }
    }

    /* renamed from: h */
    private static byte[] m57357h(String str) {
        return ails.m57446a(str.getBytes(), 3);
    }

    /* renamed from: a */
    public final synchronized boolean mo37616a(String str) {
        aijx aijx;
        aijx = this.f69100y;
        return (aijx == null || !aijx.f68999a.equals(str)) ? this.f69097v.containsKey(str) : true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37617a(String str, ahob ahob) {
        if (str == null || ahob == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikx", "a", 1428, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start accepting BLE connections because at least one of serviceId or acceptedConnectionCallback is null.");
            return false;
        } else if (mo37626e(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aikx", "a", 1435, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Refusing to start accepting BLE connections for %s because BluetoothLowEnergy is alreadyaccepting BLE connections for that service ID.", str);
            return false;
        } else if (!mo37621b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aikx", "a", 1443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Can't start accepting BLE connections for %s because BLE is not available.", str);
            return false;
        } else {
            if (this.f69076B.isEmpty()) {
                srn srn = ailf.f69111a;
                m57370u();
            }
            if (!mo37625d()) {
                aikw aikw = new aikw(this.f69087l, new aijl(this));
                if (!m57351a(this.f69090o.mo37908b(aikw))) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl4.mo68432a("aikx", "t", 1550, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Failed to open a BLE server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl5.mo68432a("aikx", "a", 1469, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68420a("Failed to start accepting BLE connections for %s because a BLE server socket could not be spun up.", str);
                    return false;
                }
                this.f69082d = aikw;
            }
            this.f69098w.put(str, ahob);
            if (m57354f() && this.f69101z == null) {
                aikj aikj = new aikj(this.f69089n, this.f69080b, new aijk(this));
                if (!m57351a(this.f69090o.mo37908b(aikj))) {
                    bnsl bnsl6 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl6.mo68432a("aikx", "s", 1517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Failed to open a BLE L2CAP server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
                    bnsl bnsl7 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl7.mo68432a("aikx", "a", 1483, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68420a("Failed to start accepting BLE L2CAP connections for %s because a BLE server socket could not be spun up.", str);
                } else {
                    this.f69101z = aikj;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo37618a(String str, byte[] bArr, int i) {
        int i2;
        if (!this.f69097v.containsKey(str)) {
            int i3 = 0;
            loop0:
            while (true) {
                if (i3 < this.f69096u) {
                    int i4 = i3;
                    while (true) {
                        i2 = i3 + 1;
                        if (i4 < i2) {
                            if (this.f69080b.get(Integer.valueOf(i4)) != null) {
                                break;
                            }
                            i4++;
                        } else {
                            break loop0;
                        }
                    }
                } else {
                    i3 = -1;
                    break;
                }
                i3 = i2;
            }
            if (i3 < 0) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aikx", "a", 1946, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Cannot add a GATT advertisement for service ID %s because there are no available advertisement slots.", str);
                return false;
            }
            byte[] a = aipf.m57644a(2, 2, m57357h(str), bArr, this.f69099x, false);
            if (a == null) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aikx", "a", 1962, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Cannot add a GATT advertisement for service ID %s because creating a BleAdvertisementfailed.", str);
                return false;
            }
            Map map = this.f69080b;
            Integer valueOf = Integer.valueOf(i3);
            map.put(valueOf, new aijw(str, a, i));
            C1225nr nrVar = new C1225nr();
            nrVar.add(valueOf);
            this.f69097v.put(str, nrVar);
            return true;
        }
        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
        bnsl3.mo68432a("aikx", "a", 1935, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Cannot add a GATT advertisement for service ID %s because it already exists in the advertisement GATT server.", str);
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, int, int, java.lang.Integer]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027e, code lost:
        if (r26 != null) goto L_0x0280;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3 A[SYNTHETIC, Splitter:B:44:0x00e3] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0036=Splitter:B:13:0x0036, B:117:0x02ae=Splitter:B:117:0x02ae, B:20:0x004f=Splitter:B:20:0x004f} */
    /* renamed from: a */
    public final synchronized boolean mo37619a(String str, byte[] bArr, byte[] bArr2, int i, ParcelUuid parcelUuid) {
        aikg aikg;
        aikf aikf;
        boolean z;
        aikf aikf2;
        aikg aikg2;
        int i2;
        int i3;
        byte[] bArr3;
        String str2 = str;
        byte[] bArr4 = bArr2;
        int i4 = i;
        ParcelUuid parcelUuid2 = parcelUuid;
        synchronized (this) {
            if (str2 == null || bArr == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aikx", "a", 377, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Refusing to start BLE advertising because a null serviceId or advertisementsBytes was passed in.");
                return false;
            } else if (bArr4 == null || parcelUuid2 == null) {
                if (!(bArr4 == null && parcelUuid2 == null)) {
                    if (this.f69100y != null) {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl2.mo68432a("aikx", "a", 393, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Refusing to start BLE advertising for service ID %s because the request contained either a FastPair model ID or a fast advertisement service UUID, but there's no room for either.", str2);
                        return false;
                    }
                }
                if (mo37616a(str)) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl3.mo68432a("aikx", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Refusing to start BLE advertising for service ID %s because that service ID is already being advertised.", str2);
                    return false;
                } else if (!mo37621b()) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl4.mo68432a("aikx", "a", 410, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("Failed to start BLE advertising for service ID %s because BLE is not available.", str2);
                    return false;
                } else {
                    if (bArr4 != null) {
                        int length = bArr4.length;
                        if (length >= 3) {
                            if (length <= 14) {
                                ByteBuffer allocate = ByteBuffer.allocate(length + 1);
                                allocate.put((byte) ((length + length) & 30));
                                allocate.put(bArr4);
                                bArr3 = allocate.array();
                                if (bArr3 != null) {
                                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                                    bnsl5.mo68432a("aikx", "a", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl5.mo68424a("Failed to start BLE advertising for service ID %s because the FastPair service data failed to serialize from FastPair model ID %s.", str2, ails.m57438a(bArr2));
                                    return false;
                                }
                                aikg = new aikg(bArr3);
                            }
                        }
                        bnsl bnsl6 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl6.mo68432a("aiql", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68425a("Out of range modelId. Expected between %d and %d but got %d instead.", (Object) 3, (Object) 14, (Object) Integer.valueOf(length));
                        bArr3 = null;
                        if (bArr3 != null) {
                        }
                    } else {
                        aijx aijx = this.f69100y;
                        aikg = aijx != null ? aijx.f69001c : null;
                    }
                    if (parcelUuid2 != null) {
                        byte[] a = aipf.m57644a(2, 2, null, bArr, this.f69099x, true);
                        if (a == null) {
                            bnsl bnsl7 = (bnsl) ailf.f69111a.mo68387b();
                            bnsl7.mo68432a("aikx", "a", 442, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68420a("Failed to start BLE advertising for service ID %s because the fast advertisement failed to serialize.", str2);
                            return false;
                        }
                        aikf = new aikf(parcelUuid2, a);
                    } else {
                        aijx aijx2 = this.f69100y;
                        aikf = aijx2 != null ? aijx2.f69002d : null;
                    }
                    if (parcelUuid2 == null) {
                        if (this.f69076B.isEmpty()) {
                            srn srn = ailf.f69111a;
                            m57373x();
                        }
                        if (!m57371v()) {
                            ayrr ayrr = new ayrr();
                            ayrq ayrq = new ayrq();
                            int i5 = 0;
                            while (i5 < this.f69096u) {
                                aiju aiju = new aiju(this, i5);
                                ayrq.f98376a.put(new BluetoothGattCharacteristic(airk.m57795a(aiju.f68990a), 2, 1), aiju);
                                i5++;
                                aikg = aikg;
                                aikf = aikf;
                            }
                            aikg2 = aikg;
                            aikf2 = aikf;
                            ayrr.f98377a.put(airk.f69554a, ayrq);
                            aijv aijv = new aijv(this.f69087l, this.f69088m, ayrr);
                            if (!m57351a(this.f69090o.mo37908b(aijv))) {
                                bnsl bnsl8 = (bnsl) ailf.f69111a.mo68387b();
                                bnsl8.mo68432a("aikx", "w", 1866, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl8.mo68405a("Fail to start an advertisement GATT server because BluetoothLowEnergy was unable to register the MediumOperation.");
                                bnsl bnsl9 = (bnsl) ailf.f69111a.mo68387b();
                                bnsl9.mo68432a("aikx", "a", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl9.mo68420a("Failed to start BLE advertising for service ID %s because the advertisement GATT server failed to start.", str2);
                                return false;
                            }
                            this.f69081c = aijv;
                        } else {
                            aikg2 = aikg;
                            aikf2 = aikf;
                        }
                        if (this.f69097v.containsKey(str2)) {
                            bnsl bnsl10 = (bnsl) ailf.f69111a.mo68388c();
                            bnsl10.mo68432a("aikx", "a", 1935, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl10.mo68420a("Cannot add a GATT advertisement for service ID %s because it already exists in the advertisement GATT server.", str2);
                        } else {
                            int i6 = 0;
                            loop1:
                            while (true) {
                                if (i6 < this.f69096u) {
                                    int i7 = i6;
                                    while (true) {
                                        i3 = i6 + 1;
                                        if (i7 < i3) {
                                            if (this.f69080b.get(Integer.valueOf(i7)) != null) {
                                                break;
                                            }
                                            i7++;
                                        } else {
                                            i2 = i6;
                                            break loop1;
                                        }
                                    }
                                } else {
                                    i2 = -1;
                                    break;
                                }
                                i6 = i3;
                            }
                            if (i2 < 0) {
                                bnsl bnsl11 = (bnsl) ailf.f69111a.mo68388c();
                                bnsl11.mo68432a("aikx", "a", 1946, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl11.mo68420a("Cannot add a GATT advertisement for service ID %s because there are no available advertisement slots.", str2);
                            } else {
                                String str3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                z = true;
                                byte[] a2 = aipf.m57644a(2, 2, m57357h(str), bArr, this.f69099x, false);
                                if (a2 == null) {
                                    bnsl bnsl12 = (bnsl) ailf.f69111a.mo68387b();
                                    bnsl12.mo68432a("aikx", "a", 1962, str3);
                                    bnsl12.mo68420a("Cannot add a GATT advertisement for service ID %s because creating a BleAdvertisementfailed.", str2);
                                } else {
                                    Map map = this.f69080b;
                                    Integer valueOf = Integer.valueOf(i2);
                                    map.put(valueOf, new aijw(str2, a2, i4));
                                    C1225nr nrVar = new C1225nr();
                                    nrVar.add(valueOf);
                                    this.f69097v.put(str2, nrVar);
                                }
                            }
                        }
                        bnsl bnsl13 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl13.mo68432a("aikx", "a", 492, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl13.mo68420a("Failed to start BLE advertising for service ID %s because the GATT advertisements were unable to be added to the advertisement GATT server.", str2);
                        return false;
                    }
                    aikg2 = aikg;
                    aikf2 = aikf;
                    z = true;
                    if (bArr4 != null) {
                    }
                    this.f69100y = new aijx(str2, i4, aikg2, aikf2);
                    m57360k();
                    if (m57356h()) {
                        return z;
                    }
                    bnsl bnsl14 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl14.mo68432a("aikx", "a", 519, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl14.mo68420a("Failed to start BLE advertising for service ID %s because the BLE advertisement failed to start.", str2);
                    mo37620b(str);
                    return false;
                }
            } else {
                bnsl bnsl15 = (bnsl) ailf.f69111a.mo68387b();
                bnsl15.mo68432a("aikx", "a", 384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl15.mo68420a("Refusing to start BLE advertising for service ID %s because the request contained both a FastPair model ID and a fast advertisement service UUID, but there's only room for one.", str2);
                return false;
            }
        }
    }
}
