package p000;

import android.bluetooth.BluetoothDevice;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.WorkSource;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ahpz extends ahmn {

    /* renamed from: j */
    public final ahov f67765j;

    /* renamed from: k */
    public ahpg f67766k;

    /* renamed from: l */
    public ahpd f67767l;

    /* renamed from: m */
    private ahpj f67768m;

    /* renamed from: n */
    private ahkv f67769n;

    /* renamed from: o */
    private ahkv f67770o;

    public ahpz(ahov ahov, ahnp ahnp, ahne ahne, ahlh ahlh) {
        super(ahnp, ahne, ahlh, ahov);
        this.f67765j = ahov;
    }

    /* renamed from: a */
    private static boolean m56331a(int i) {
        return cfnv.m140781e() && i == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36850b(ahkv ahkv) {
        ahov ahov = this.f67765j;
        String l = ahkv.mo36729l();
        synchronized (ahov.f67669e) {
            if (ahov.mo36916a()) {
                ahov.f67666b.f69119f.mo37624d(l);
            }
        }
        this.f67767l = null;
        if (ahkv == this.f67770o) {
            ahov ahov2 = this.f67765j;
            synchronized (ahov2.f67668d) {
                if (ahov2.mo36916a()) {
                    ahov2.f67666b.f69118e.mo37584d();
                }
            }
            this.f67770o = null;
        }
        this.f67766k = null;
        if (cfnv.m140776al()) {
            ahov ahov3 = this.f67765j;
            String l2 = ahkv.mo36729l();
            synchronized (ahov3.f67671g) {
                if (ahov3.mo36916a()) {
                    ahov3.f67666b.f69121h.mo37785f(l2);
                }
            }
        }
        this.f67768m = null;
        ahov ahov4 = this.f67765j;
        String l3 = ahkv.mo36729l();
        synchronized (ahov4.f67674j) {
            if (ahov4.mo36916a()) {
                ahov4.f67666b.f69125l.mo37657c(l3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String[] mo36856c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.BLUETOOTH");
        arrayList.add("android.permission.BLUETOOTH_ADMIN");
        arrayList.add("android.permission.ACCESS_WIFI_STATE");
        arrayList.add("android.permission.CHANGE_WIFI_STATE");
        int i = Build.VERSION.SDK_INT;
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        int i2 = Build.VERSION.SDK_INT;
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List mo36857d() {
        return Arrays.asList(bvif.WIFI_LAN, bvif.WEB_RTC, bvif.BLUETOOTH, bvif.BLE, bvif.NFC);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public bvif mo36859e() {
        return bvif.WIFI_LAN;
    }

    /* renamed from: g */
    public Strategy mo36958g() {
        return Strategy.f80480a;
    }

    /* renamed from: h */
    public int mo36959h() {
        return 2;
    }

    /* renamed from: a */
    static byte[] m56332a(String str) {
        return Arrays.copyOf(spn.m35862a(str, "SHA-256"), 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ahmk mo36837a(ahkv ahkv, String str, DiscoveryOptions discoveryOptions) {
        boolean z;
        byte[] bArr;
        boolean z2;
        ArrayList a = bnkn.m109661a();
        boolean z3 = true;
        if (cfnv.m140749K() && discoveryOptions.f80474h) {
            ahpj ahpj = new ahpj(this, ahkv, str);
            if (ahkv.mo36685a("android.permission.NFC") != 0) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("In startNfcDiscovery(), client %d failed to scan because of missing permissions", ahkv.mo36706b());
            } else {
                ahov ahov = this.f67765j;
                String c = ahkv.mo36711c();
                if (cfnv.m140801y()) {
                    bArr = ahkv.mo36734n();
                } else {
                    bArr = null;
                }
                synchronized (ahov.f67674j) {
                    if (ahov.mo36916a()) {
                        if (!ahov.f67666b.f69117d.mo37659a() || !ahov.f67666b.f69125l.mo37653a(str, c, new ahom(ahpj), bArr)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            srn srn = ahkm.f67363a;
                            ahkv.mo36706b();
                            this.f67768m = ahpj;
                            a.add(bvif.NFC);
                        }
                    }
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In startNfcDiscovery(), client %d couldn't start scanning on NFC for serviceId %s.", ahkv.mo36706b(), str);
                }
            }
        }
        if (cfnv.m140795s() && discoveryOptions.f80469c && !discoveryOptions.f80471e) {
            ahpg ahpg = new ahpg(this, ahkv, str);
            ahov ahov2 = this.f67765j;
            synchronized (ahov2.f67668d) {
                if (ahov2.mo36916a()) {
                    if (!ahov2.f67666b.f69115b.mo37631a() || !ahov2.f67666b.f69118e.mo37578a(new ahoi(ahpg))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        srn srn2 = ahkm.f67363a;
                        ahkv.mo36706b();
                        this.f67770o = ahkv;
                        this.f67766k = ahpg;
                        a.add(bvif.BLUETOOTH);
                    }
                }
                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In startBluetoothDiscovery(), client %d couldn't start scanning on Bluetooth for serviceId %s.", ahkv.mo36706b(), str);
            }
        }
        if (cfnv.m140785i() && discoveryOptions.f80470d) {
            ahpd ahpd = new ahpd(this, ahkv, str);
            boolean z4 = discoveryOptions.f80471e;
            ParcelUuid parcelUuid = discoveryOptions.f80472f;
            ahov ahov3 = this.f67765j;
            WorkSource a2 = stx.m36335a(ahkv.f67387c, ahkv.f67388d);
            synchronized (ahov3.f67669e) {
                if (ahov3.mo36916a()) {
                    if (!z4) {
                        if (ahov3.f67666b.f69115b.mo37631a()) {
                        }
                    }
                    boolean a3 = ahov3.f67666b.f69119f.mo37615a(a2, str, new ahoj(ahpd), z4 ? 1 : 0, parcelUuid);
                    if (a3) {
                        srn srn3 = ahkm.f67363a;
                        ahkv.mo36706b();
                        this.f67767l = ahpd;
                        a.add(bvif.BLE);
                    }
                }
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In startBleDiscovery(), client %d couldn't start scanning on BLE for serviceId %s.", ahkv.mo36706b(), str);
        }
        if (cfnv.m140776al() && discoveryOptions.f80473g && !discoveryOptions.f80471e) {
            ahpm ahpm = new ahpm(this, ahkv, str);
            ahov ahov4 = this.f67765j;
            synchronized (ahov4.f67671g) {
                if (ahov4.mo36916a()) {
                    if (!ahov4.f67666b.f69116c.mo37789a() || !ahov4.f67666b.f69121h.mo37778a(str, new ahok(ahpm))) {
                        z3 = false;
                    }
                    if (z3) {
                        srn srn4 = ahkm.f67363a;
                        ahkv.mo36706b();
                        a.add(bvif.WIFI_LAN);
                    }
                }
                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In startWifiLanDiscovery(), client %d couldn't start scanning on Wifi for serviceId %s.", ahkv.mo36706b(), str);
            }
        }
        if (!a.isEmpty()) {
            return ahmk.m56135a(a);
        }
        ((bnsl) ahkm.f67363a.mo68387b()).mo68418a("Failed startDiscovery() for client %d because we couldn't scan on Bluetooth, BLE, or Wifi LAN for serviceId %s", ahkv.mo36706b(), str);
        return ahmk.m56134a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo36853b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.BLUETOOTH");
        arrayList.add("android.permission.BLUETOOTH_ADMIN");
        arrayList.add("android.permission.ACCESS_WIFI_STATE");
        arrayList.add("android.permission.CHANGE_WIFI_STATE");
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* renamed from: a */
    public ahmk mo36838a(ahkv ahkv, String str, String str2, byte[] bArr, byte[] bArr2, AdvertisingOptions advertisingOptions) {
        AdvertisingOptions advertisingOptions2;
        ArrayList arrayList;
        String str3;
        byte[] bArr3;
        byte[] bArr4;
        String str4;
        byte[] bArr5;
        String str5;
        ArrayList arrayList2;
        Object obj;
        AdvertisingOptions advertisingOptions3;
        byte[] bArr6;
        String str6;
        ArrayList arrayList3;
        boolean z;
        boolean d;
        boolean z2;
        boolean z3;
        ahkv ahkv2 = ahkv;
        String str7 = str;
        String str8 = str2;
        byte[] bArr7 = bArr;
        AdvertisingOptions advertisingOptions4 = advertisingOptions;
        ArrayList a = bnkn.m109661a();
        boolean z4 = false;
        if (cfnv.m140749K() && advertisingOptions4.f80451j) {
            if (ahkv2.mo36685a("android.permission.NFC") != 0) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68423a("In startNfcAdvertising(%s), client %d failed to advertise because of missing permissions", ahkm.m55981a(bArr), ahkv.mo36706b());
            } else {
                ahov ahov = this.f67765j;
                ahps ahps = new ahps(this, ahkv2, bArr7);
                synchronized (ahov.f67674j) {
                    if (ahov.mo36916a()) {
                        if (ahov.f67666b.f69117d.mo37659a()) {
                            ailq ailq = ahov.f67666b.f69125l;
                            ahps.getClass();
                            if (ailq.mo37652a(str7, new ahog(ahps))) {
                                z2 = true;
                                if (z2) {
                                    srn srn = ahkm.f67363a;
                                    ahkm.m55981a(bArr);
                                    ahkv.mo36706b();
                                    if (!this.f67765j.mo36917a(str7)) {
                                        if (!this.f67765j.mo36919a(str7, new ahpq(this, ahkv2, bArr7))) {
                                            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startNfcAdvertising(%s), client %d failed to start listening for incoming Bluetooth connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
                                            this.f67765j.mo36939k(str7);
                                        } else {
                                            ahkm.m55981a(bArr);
                                            ahkv.mo36706b();
                                        }
                                    }
                                    byte[] a2 = m56332a(str);
                                    byte[] a3 = ahox.m56303a(mo36959h(), str8, a2, bArr7, this.f67765j.mo36923b());
                                    if (a3 == null) {
                                        ((bnsl) ahkm.f67363a.mo68388c()).mo68429a("In startNfcAdvertising(%s), client %d failed to generate NfcTag {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), 1, Integer.valueOf(mo36959h()), str2, ahkm.m55981a(a2), ahkm.m55981a(bArr));
                                        this.f67765j.mo36939k(str7);
                                    } else {
                                        ahkm.m55981a(bArr);
                                        ahkv.mo36706b();
                                        ahov ahov2 = this.f67765j;
                                        ahpy ahpy = new ahpy(this, ahkv2);
                                        synchronized (ahov2.f67674j) {
                                            if (ahov2.mo36916a()) {
                                                if (!ahov2.f67666b.f69117d.mo37659a() || !ahov2.f67666b.f69125l.mo37654a(str7, a3, bArr2, ahpy)) {
                                                    z3 = false;
                                                } else {
                                                    z3 = true;
                                                }
                                                if (z3) {
                                                    ahkm.m55981a(bArr);
                                                    ahkv.mo36706b();
                                                    a.add(bvif.NFC);
                                                }
                                            }
                                            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("In startNfcAdvertising(%s), client %d couldn't become NFC discoverable with NfcTag %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), a3);
                                            this.f67765j.mo36939k(str7);
                                        }
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                    ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startNfcAdvertising(%s), client %d failed to start listening for incoming NFC connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
                }
            }
        }
        if (cfnv.m140756R() && advertisingOptions4.f80454m && !advertisingOptions4.f80448g) {
            ahov ahov3 = this.f67765j;
            synchronized (ahov3.f67675k) {
                d = ahov3.f67666b.f69124k.mo37681d();
            }
            if (!d) {
                aiss a4 = m56136a(str, str2, bArr);
                ahov ahov4 = this.f67765j;
                ahpu ahpu = new ahpu(this, ahkv2, bArr7);
                synchronized (ahov4.f67675k) {
                    if (ahov4.mo36916a()) {
                        aimk aimk = ahov4.f67666b.f69124k;
                        ahpu.getClass();
                        boolean a5 = aimk.mo37677a(a4, new ahoh(ahpu));
                        if (a5) {
                            srn srn2 = ahkm.f67363a;
                            ahkm.m55981a(bArr);
                            ahkv.mo36706b();
                        }
                    }
                    ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startListeningForWebRtcConnections(%s), client %d failed to start listening for incoming WebRTC connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
                }
            }
            a.add(bvif.WEB_RTC);
        }
        if (cfnv.m140795s() && advertisingOptions4.f80445d && !advertisingOptions4.f80448g) {
            if (!this.f67765j.mo36917a(str7)) {
                if (!this.f67765j.mo36919a(str7, new ahpq(this, ahkv2, bArr7))) {
                    ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startBluetoothAdvertising(%s), client %d failed to start listening for incoming Bluetooth connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
                } else {
                    srn srn3 = ahkm.f67363a;
                    ahkm.m55981a(bArr);
                    ahkv.mo36706b();
                }
            }
            byte[] a6 = m56332a(str);
            String a7 = ahmr.m56190a(mo36959h(), str8, a6, bArr7);
            if (a7 == null) {
                ((bnsl) ahkm.f67363a.mo68388c()).mo68429a("In startBluetoothAdvertising(%s), client %d failed to generate BluetoothDeviceName {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), 1, Integer.valueOf(mo36959h()), str2, ahkm.m55981a(a6), ahkm.m55981a(bArr));
                this.f67765j.mo36924b(str7);
            } else {
                srn srn4 = ahkm.f67363a;
                ahkm.m55981a(bArr);
                ahkv.mo36706b();
                ahov ahov5 = this.f67765j;
                synchronized (ahov5.f67668d) {
                    if (ahov5.mo36916a()) {
                        if (!ahov5.f67666b.f69115b.mo37631a() || !ahov5.f67666b.f69118e.mo37581b(a7)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            ahkm.m55981a(bArr);
                            ahkv.mo36706b();
                            this.f67769n = ahkv2;
                            a.add(bvif.BLUETOOTH);
                        }
                    }
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("In startBluetoothAdvertising(%s), client %d couldn't start Bluetooth advertising with BluetoothDeviceName %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), a7);
                    this.f67765j.mo36924b(str7);
                }
            }
        }
        if (!cfnv.m140785i()) {
            arrayList = a;
            advertisingOptions2 = advertisingOptions4;
            bArr3 = bArr7;
            str3 = str8;
        } else if (advertisingOptions4.f80446e) {
            byte[] bArr8 = advertisingOptions4.f80447f;
            boolean z5 = advertisingOptions4.f80448g;
            ParcelUuid parcelUuid = advertisingOptions4.f80449h;
            ahov ahov6 = this.f67765j;
            synchronized (ahov6.f67669e) {
                if (ahov6.mo36916a()) {
                    boolean e = ahov6.f67666b.f69119f.mo37626e(str7);
                    if (!e) {
                    }
                    if ((m56331a(z5 ? 1 : 0) || (cfnv.m140799w() && advertisingOptions4.f80453l)) && !this.f67765j.mo36917a(str7)) {
                        if (this.f67765j.mo36919a(str7, new ahpq(this, ahkv2, bArr7))) {
                            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startBleAdvertising(%s), client %d failed to start listening for incoming Bluetooth connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
                            this.f67765j.mo36928d(str7);
                            arrayList = a;
                            advertisingOptions2 = advertisingOptions4;
                            bArr3 = bArr7;
                            str3 = str8;
                        } else {
                            srn srn5 = ahkm.f67363a;
                            ahkm.m55981a(bArr);
                            ahkv.mo36706b();
                        }
                    }
                    byte[] a8 = m56332a(str);
                    if (m56331a(z5)) {
                        str4 = this.f67765j.mo36923b();
                    } else {
                        str4 = null;
                    }
                    if (parcelUuid == null) {
                        arrayList2 = a;
                        advertisingOptions3 = advertisingOptions4;
                        bArr6 = bArr7;
                        str5 = str8;
                        bArr5 = ahmo.m56180a(mo36959h(), a8, str2, bArr, str4, false);
                    } else {
                        arrayList2 = a;
                        advertisingOptions3 = advertisingOptions4;
                        bArr6 = bArr7;
                        str5 = str8;
                        bArr5 = ahmo.m56180a(mo36959h(), null, str2, bArr, null, true);
                    }
                    if (bArr5 != null) {
                        srn srn6 = ahkm.f67363a;
                        ahkm.m55981a(bArr);
                        ahkv.mo36706b();
                        ahov ahov7 = this.f67765j;
                        Object obj2 = ahov7.f67669e;
                        synchronized (obj2) {
                            try {
                                if (ahov7.mo36916a()) {
                                    if (!z5) {
                                        if (ahov7.f67666b.f69115b.mo37631a()) {
                                        }
                                    }
                                    byte[] bArr9 = bArr8;
                                    obj = obj2;
                                    try {
                                        boolean a9 = ahov7.f67666b.f69119f.mo37619a(str, bArr5, bArr9, z5 ? 1 : 0, parcelUuid);
                                        if (a9) {
                                            ahkm.m55981a(bArr);
                                            ahkv.mo36706b();
                                            ahkm.m55981a(bArr5);
                                            arrayList2.add(bvif.BLE);
                                            arrayList = arrayList2;
                                            str3 = str5;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                                throw th;
                            }
                        }
                        ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startBleAdvertising(%s), client %d couldn't start BLE Advertising with BleAdvertisement %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), ahkm.m55981a(bArr5));
                        this.f67765j.mo36928d(str7);
                        arrayList = arrayList2;
                        str3 = str5;
                    } else {
                        ((bnsl) ahkm.f67363a.mo68388c()).mo68423a("In startBleAdvertising(%s), client %d failed to create an advertisement.", ahkm.m55981a(bArr), ahkv.mo36706b());
                        this.f67765j.mo36928d(str7);
                        arrayList = arrayList2;
                        str3 = str5;
                    }
                }
            }
            ahov ahov8 = this.f67765j;
            ahpo ahpo = new ahpo(this, ahkv2, bArr7);
            synchronized (ahov8.f67669e) {
                if (!ahov8.mo36916a()) {
                    arrayList3 = a;
                    advertisingOptions2 = advertisingOptions4;
                    bArr3 = bArr7;
                    str6 = str8;
                } else {
                    if (!z5) {
                        if (!ahov8.f67666b.f69115b.mo37631a()) {
                            arrayList3 = a;
                            advertisingOptions2 = advertisingOptions4;
                            bArr3 = bArr7;
                            str6 = str8;
                        }
                    }
                    aikx aikx = ahov8.f67666b.f69119f;
                    ahpo.getClass();
                    boolean a10 = aikx.mo37617a(str7, new ahob(ahpo));
                    if (a10) {
                        srn srn7 = ahkm.f67363a;
                        ahkm.m55981a(bArr);
                        ahkv.mo36706b();
                        if (this.f67765j.mo36919a(str7, new ahpq(this, ahkv2, bArr7))) {
                        }
                    } else {
                        arrayList3 = a;
                        advertisingOptions2 = advertisingOptions4;
                        bArr3 = bArr7;
                        str6 = str8;
                    }
                }
            }
            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startBleAdvertising(%s), client %d failed to start listening for incoming BLE connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
            arrayList = arrayList3;
            str3 = str6;
        } else {
            arrayList = a;
            advertisingOptions2 = advertisingOptions4;
            bArr3 = bArr7;
            str3 = str8;
        }
        if (cfnv.m140776al()) {
            if (advertisingOptions2.f80450i && !advertisingOptions2.f80448g) {
                int i = Build.VERSION.SDK_INT;
                if (!this.f67765j.mo36930e(str7)) {
                    bArr4 = bArr3;
                    if (!this.f67765j.mo36920a(str7, new ahpw(this, ahkv, bArr4))) {
                        ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startWifiLanAdvertising(%s), client %d failed to start listening for incoming Wifi LAN connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str7);
                    } else {
                        srn srn8 = ahkm.f67363a;
                        ahkm.m55981a(bArr);
                        ahkv.mo36706b();
                    }
                } else {
                    bArr4 = bArr3;
                }
                byte[] a11 = m56332a(str);
                NsdServiceInfo a12 = ahro.m56438a(mo36959h(), str3, a11, bArr4);
                if (a12 == null) {
                    ((bnsl) ahkm.f67363a.mo68388c()).mo68429a("In startWifiLanAdvertising(%s), client %d failed to generate WifiLanServiceInfo {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), 1, Integer.valueOf(mo36959h()), str2, ahkm.m55981a(a11), ahkm.m55981a(bArr));
                    this.f67765j.mo36932f(str7);
                } else {
                    srn srn9 = ahkm.f67363a;
                    ahkm.m55981a(bArr);
                    ahkv.mo36706b();
                    ahov ahov9 = this.f67765j;
                    synchronized (ahov9.f67671g) {
                        if (ahov9.mo36916a()) {
                            if (ahov9.f67666b.f69116c.mo37789a() && ahov9.f67666b.f69121h.mo37779a(str7, a12)) {
                                z4 = true;
                            }
                            if (z4) {
                                ahkm.m55981a(bArr);
                                ahkv.mo36706b();
                                arrayList.add(bvif.WIFI_LAN);
                            }
                        }
                        ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("In startWifiLanAdvertising(%s), client %d couldn't advertise with WifiLanServiceInfo %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), a12);
                        this.f67765j.mo36932f(str7);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return ahmk.m56135a(arrayList);
        }
        ((bnsl) ahkm.f67363a.mo68387b()).mo68423a("Failed startAdvertising(%s) for client %d", ahkm.m55981a(bArr), ahkv.mo36706b());
        return ahmk.m56134a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ahna mo36839a(ahkv ahkv, ahmg ahmg) {
        if (ahmg instanceof ahme) {
            ahme ahme = (ahme) ahmg;
            srn srn = ahkm.f67363a;
            ahkv.mo36706b();
            BluetoothDevice bluetoothDevice = ahme.f67518a;
            aipa a = this.f67765j.mo36913a(bluetoothDevice, ahme.f67523d, ahkv.mo36739q(ahme.f67521b));
            if (a != null) {
                ahms a2 = ahms.m56191a(a);
                if (a2 != null) {
                    ahkv.mo36706b();
                    return a2;
                }
                srz.m36171a(a);
                throw new ahmf(bvif.BLUETOOTH, 13, String.format("In bluetoothConnectImpl(), failed to create Bluetooth endpoint channel for endpoint %s", ahme.f67521b));
            }
            throw new ahmf(bvif.BLUETOOTH, 8007, String.format("In bluetoothConnectImpl(), failed to connect to Bluetooth device %s for endpoint %s", bluetoothDevice, ahme.f67521b));
        }
        aisv aisv = null;
        aiqc aiqc = null;
        r6 = null;
        aiwf aiwf = null;
        r6 = null;
        airy airy = null;
        aisv = null;
        aisv = null;
        aisv = null;
        if (ahmg instanceof ahmd) {
            ahmd ahmd = (ahmd) ahmg;
            srn srn2 = ahkm.f67363a;
            ahkv.mo36706b();
            aipt aipt = ahmd.f67517a;
            ahov ahov = this.f67765j;
            String str = ahmd.f67523d;
            boolean c = m56142c(ahkv, ahmd.f67521b);
            ahfk q = ahkv.mo36739q(ahmd.f67521b);
            synchronized (ahov.f67669e) {
                if (ahov.mo36916a()) {
                    aiqc = ahov.f67666b.f69119f.mo37609a(aipt, str, c ? 1 : 0, q);
                }
            }
            if (aiqc != null) {
                ahmp a3 = ahmp.m56181a(aiqc);
                if (a3 != null) {
                    ahkv.mo36706b();
                    return a3;
                }
                srz.m36171a(aiqc);
                throw new ahmf(bvif.BLE, 13, String.format("In bleConnectImpl(), failed to create BLE endpoint channel for endpoint %s", ahmd.f67521b));
            }
            throw new ahmf(bvif.BLE, 8007, String.format("In bleConnectImpl(), failed to connect to BLE device %s for endpoint %s", aipt, ahmd.f67521b));
        } else if (ahmg instanceof ahmm) {
            ahmm ahmm = (ahmm) ahmg;
            srn srn3 = ahkm.f67363a;
            ahkv.mo36706b();
            NsdServiceInfo nsdServiceInfo = ahmm.f67543a;
            ahov ahov2 = this.f67765j;
            ahfk q2 = ahkv.mo36739q(ahmm.f67521b);
            synchronized (ahov2.f67671g) {
                if (ahov2.mo36916a()) {
                    if (ahov2.f67666b.f69116c.mo37789a()) {
                        aiwf = ahov2.f67666b.f69121h.mo37768a(nsdServiceInfo, q2);
                    }
                }
            }
            if (aiwf != null) {
                ahrn a4 = ahrn.m56434a(aiwf);
                if (a4 != null) {
                    ahkv.mo36706b();
                    return a4;
                }
                srz.m36171a(aiwf);
                throw new ahmf(bvif.WIFI_LAN, 13, String.format("In wifiLanConnectImpl(), failed to create Wifi LAN endpoint channel for endpoint %s", ahmm.f67521b));
            }
            throw new ahmf(bvif.WIFI_LAN, 13, String.format("In wifiLanConnectImpl(), failed to connect to service %s for endpoint %s", nsdServiceInfo.getServiceName(), ahmm.f67521b));
        } else if (ahmg instanceof ahmi) {
            ahmi ahmi = (ahmi) ahmg;
            ahov ahov3 = this.f67765j;
            String str2 = ahmi.f67523d;
            aisb aisb = ahmi.f67527a;
            ahfk q3 = ahkv.mo36739q(ahmi.f67521b);
            synchronized (ahov3.f67674j) {
                if (ahov3.mo36916a()) {
                    if (ahov3.f67666b.f69117d.mo37659a()) {
                        airy = ahov3.f67666b.f69125l.mo37646a(str2, aisb, q3);
                    }
                }
            }
            if (airy != null) {
                ahow a5 = ahow.m56298a(airy);
                if (a5 != null) {
                    srn srn4 = ahkm.f67363a;
                    ahkv.mo36706b();
                    return a5;
                }
                srz.m36171a(airy);
                throw new ahmf(bvif.NFC, 13, String.format("In nfcConnectImpl(), failed to create NFC endpoint channel for endpoint %s", ahmi.f67521b));
            }
            throw new ahmf(bvif.NFC, 13, String.format("In nfcConnectImpl(), failed to connect to NFC device for endpoint %s", ahmi.f67521b));
        } else if (ahmg instanceof ahml) {
            ahml ahml = (ahml) ahmg;
            ahov ahov4 = this.f67765j;
            aiss aiss = ahml.f67542a;
            synchronized (ahov4.f67675k) {
                if (ahov4.mo36916a()) {
                    aimk aimk = ahov4.f67666b.f69124k;
                    synchronized (aimk) {
                        if (!aimk.mo37675a()) {
                            aimk.mo37680c();
                        } else if (aimk.f69177c != aimj.NONE) {
                            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                            bnsl.mo68432a("aimk", "a", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68420a("Cannot connect with WebRTC because we are already acting as a %s.", aimk.f69177c);
                        } else {
                            aimk.f69176b = aiss;
                            if (aimk.mo37676a(aimj.ANSWERER, aiss.m57869a(ails.m57448b(64)))) {
                                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                                bnsl2.mo68432a("aimk", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("Attempting to make a WebRTC connection to %s.", aiss);
                                aisv aisv2 = (aisv) ahhf.m55778c("WebRtc.connect", aimk.mo37670a(aimk.f69175a.f69647b, ailw.f69154a), cfnv.f184625a.mo6606a().mo81761aT());
                                if (aisv2 == null) {
                                    synchronized (aimk) {
                                        aimk.mo37680c();
                                    }
                                }
                                aisv = aisv2;
                            }
                        }
                    }
                }
            }
            if (aisv != null) {
                ahrc a6 = ahrc.m56404a(aisv);
                srn srn5 = ahkm.f67363a;
                return a6;
            }
            throw new ahmf(bvif.WEB_RTC, 13, String.format("In webRtcConnectImpl(), failed to connect to WebRTC device for endpoint %s", ahml.f67521b));
        } else {
            bvif bvif = ahmg.f67524e;
            throw new ahmf(bvif, 13, String.format("P2PClusterPCPHandler is unable to connect to the endpoint of unknown type %s.", bvif.name()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36841a(ahkv ahkv) {
        ahov ahov = this.f67765j;
        String h = ahkv.mo36721h();
        synchronized (ahov.f67669e) {
            if (ahov.mo36916a()) {
                ahov.f67666b.f69119f.mo37620b(h);
            }
        }
        if (ahkv == this.f67769n) {
            ahov ahov2 = this.f67765j;
            synchronized (ahov2.f67668d) {
                if (ahov2.mo36916a()) {
                    ahov2.f67666b.f69118e.mo37582c();
                }
            }
            this.f67769n = null;
        }
        if (cfnv.m140776al()) {
            ahov ahov3 = this.f67765j;
            String h2 = ahkv.mo36721h();
            synchronized (ahov3.f67671g) {
                if (ahov3.mo36916a()) {
                    ahov3.f67666b.f69121h.mo37783d(h2);
                }
            }
        }
        ahov ahov4 = this.f67765j;
        String h3 = ahkv.mo36721h();
        synchronized (ahov4.f67674j) {
            if (ahov4.mo36916a()) {
                ahov4.f67666b.f69125l.mo37650a(h3);
            }
        }
        this.f67765j.mo36928d(ahkv.mo36721h());
        this.f67765j.mo36924b(ahkv.mo36721h());
        if (cfnv.m140776al()) {
            this.f67765j.mo36932f(ahkv.mo36721h());
        }
        this.f67765j.mo36939k(ahkv.mo36721h());
        if (cfnv.m140756R()) {
            ahov ahov5 = this.f67765j;
            synchronized (ahov5.f67675k) {
                if (ahov5.mo36916a()) {
                    ahov5.f67666b.f69124k.mo37682e();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo36957a(ahme ahme) {
        ahpg ahpg = this.f67766k;
        if (ahpg != null && ahpg.f67713d.containsValue(ahme)) {
            return false;
        }
        ahpd ahpd = this.f67767l;
        if (ahpd != null && ahpd.f67704e.containsValue(ahme)) {
            return false;
        }
        ahpj ahpj = this.f67768m;
        if (ahpj == null || !ahpj.f67725e.containsValue(ahme)) {
            return true;
        }
        return false;
    }
}
