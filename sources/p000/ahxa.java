package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: ahxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxa extends LruCache {

    /* renamed from: f */
    static final ParcelUuid f68272f = new ParcelUuid(ayod.f98113a);

    /* renamed from: a */
    public final ahxb f68273a;

    /* renamed from: b */
    public final Context f68274b;

    /* renamed from: c */
    public final buqh f68275c;

    /* renamed from: d */
    public final sqv f68276d;

    /* renamed from: e */
    public final ahsi f68277e;

    /* renamed from: g */
    private final ahyr f68278g;

    /* renamed from: h */
    private final ahyh f68279h;

    /* renamed from: i */
    private final aicw f68280i;

    public ahxa(Context context) {
        super((int) cfog.m141292t());
        this.f68274b = context;
        this.f68273a = new ahxb(context);
        this.f68275c = (buqh) ahgz.m55754a(context, buqh.class);
        this.f68276d = (sqv) ahgz.m55754a(context, sqv.class);
        this.f68278g = (ahyr) ahgz.m55754a(context, ahyr.class);
        this.f68280i = (aicw) ahgz.m55754a(context, aicw.class);
        this.f68277e = (ahsi) ahgz.m55754a(context, ahsi.class);
        this.f68279h = (ahyh) ahgz.m55754a(context, ahyh.class);
    }

    /* renamed from: a */
    private static boolean m56812a(ahyw ahyw) {
        int i = ahyw.f68401j;
        return i != 0 && ahyw.f68394c >= i;
    }

    /* renamed from: b */
    private static boolean m56813b(ScanResult scanResult, ahyw ahyw) {
        byte[] serviceData = scanResult.getScanRecord().getServiceData(f68272f);
        if (serviceData == null) {
            return false;
        }
        if (ahyw == null || ((ahfo.m55650b(serviceData) && (ahyw.f68392a & 512) != 0) || (!ahfo.m55650b(serviceData) && (ahyw.f68392a & 1) != 0))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ahyw mo37249a(ScanResult scanResult, int i) {
        byte[] serviceData = scanResult.getScanRecord().getServiceData(f68272f);
        int txPowerLevel = scanResult.getScanRecord().getTxPowerLevel();
        long a = this.f68276d.mo20505a();
        bxvd da = ahyw.f68389A.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw = (ahyw) da.f164949b;
        int i2 = ahyw.f68392a | 2097152;
        ahyw.f68392a = i2;
        ahyw.f68415y = a;
        ahyw.f68392a = i2 | 32;
        ahyw.f68398g = a;
        String address = scanResult.getDevice().getAddress();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw2 = (ahyw) da.f164949b;
        address.getClass();
        ahyw2.f68392a |= 128;
        ahyw2.f68400i = address;
        int rssi = scanResult.getRssi();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw3 = (ahyw) da.f164949b;
        ahyw3.f68392a |= 2;
        ahyw3.f68394c = rssi;
        ByteString a2 = ByteString.m123261a(scanResult.getScanRecord().getBytes());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw4 = (ahyw) da.f164949b;
        a2.getClass();
        ahyw4.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        ahyw4.f68413w = a2;
        if (!(scanResult.getDevice() == null || scanResult.getDevice().getName() == null)) {
            String name = scanResult.getDevice().getName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyw ahyw5 = (ahyw) da.f164949b;
            name.getClass();
            ahyw5.f68392a |= 1024;
            ahyw5.f68403l = name;
        }
        if (ahfo.m55650b(serviceData)) {
            String a3 = srv.m36160a(ahfo.m55648a(serviceData));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyw ahyw6 = (ahyw) da.f164949b;
            a3.getClass();
            ahyw6.f68392a |= 1;
            ahyw6.f68393b = a3;
            this.f68277e.mo37015a(bvin.FAST_PAIR_DEVICE_DETECTED_WITH_MODEL_ID, a3, ahhs.m55808a(scanResult.getRssi(), txPowerLevel), scanResult.getDevice().getAddress(), i);
            ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairCache: found device %s advertising model id %s", scanResult.getDevice().getAddress(), a3);
            ahyw ahyw7 = (ahyw) put(scanResult.getDevice().getAddress(), (ahyw) da.mo74062i());
            this.f68275c.mo72987c(new ahwx(this, "fastPairCacheManager_loadObservedDevice", scanResult, a3, txPowerLevel));
            return ahyw7;
        }
        srn srn = ahsd.f67925a;
        scanResult.getDevice().getAddress();
        this.f68277e.mo37015a(bvin.FAST_PAIR_DEVICE_DETECTED_WITH_BLOOM_FILTER, "0", ahhs.m55808a(scanResult.getRssi(), txPowerLevel), scanResult.getDevice().getAddress(), i);
        String address2 = scanResult.getDevice().getAddress();
        ByteString a4 = ByteString.m123261a(serviceData);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw8 = (ahyw) da.f164949b;
        a4.getClass();
        int i3 = ahyw8.f68392a | 512;
        ahyw8.f68392a = i3;
        ahyw8.f68402k = a4;
        ahyw8.f68392a = i3 | 4;
        ahyw8.f68395d = txPowerLevel;
        return (ahyw) put(address2, (ahyw) da.mo74062i());
    }

    /* renamed from: b */
    public final void mo37253b(ScanResult scanResult, int i) {
        ahyw ahyw;
        String address = scanResult.getDevice().getAddress();
        ahyw ahyw2 = (ahyw) get(scanResult.getDevice().getAddress());
        if (ahyw2 == null) {
            ahyw = mo37249a(scanResult, i);
        } else if (m56813b(scanResult, ahyw2)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairCache: Advertisement type changed for device %s", scanResult.getDevice().getAddress());
            ahyw = mo37249a(scanResult, i);
        } else {
            String address2 = scanResult.getDevice().getAddress();
            bxvd bxvd = (bxvd) ahyw2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) ahyw2);
            int rssi = scanResult.getRssi();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ahyw ahyw3 = (ahyw) bxvd.f164949b;
            ahyw3.f68392a |= 2;
            ahyw3.f68394c = rssi;
            ahyw = (ahyw) put(address2, (ahyw) bxvd.mo74062i());
        }
        ahyw ahyw4 = (ahyw) get(address);
        if (ahyw4 != null) {
            if (m56813b(scanResult, ahyw)) {
                if ((ahyw4.f68392a & 1) == 0) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairCache: First time device %s advertising bloom filter found with data %s.", address, srv.m36160a(scanResult.getScanRecord().getServiceData(f68272f)));
                } else {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairCache: First time device %s with model id %s found.", address, ahyw4.f68393b);
                }
            }
            mo37252a(scanResult, ahyw4);
        }
    }

    /* renamed from: a */
    public final ahyx mo37250a(bvkr bvkr, boolean z) {
        bvkr bvkr2;
        long j;
        bxvd da = ahyx.f68417f.mo74144da();
        if (bvkr == null) {
            bvkr2 = bvkr.f156460d;
        } else {
            bvkr2 = bvkr;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyx ahyx = (ahyx) da.f164949b;
        bvkr2.getClass();
        ahyx.f68421c = bvkr2;
        ahyx.f68419a |= 2;
        if (bvkr != null) {
            j = this.f68276d.mo20505a();
        } else {
            j = this.f68276d.mo20505a() - TimeUnit.HOURS.toMillis(cfog.m141295w() - 1);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyx ahyx2 = (ahyx) da.f164949b;
        int i = ahyx2.f68419a | 4;
        ahyx2.f68419a = i;
        ahyx2.f68422d = j;
        ahyx2.f68419a = i | 8;
        ahyx2.f68423e = z;
        String str = "-1";
        if (bvkr != null) {
            bvkk bvkk = bvkr.f156462a;
            if (bvkk == null) {
                bvkk = bvkk.f156420q;
            }
            try {
                String hexString = Long.toHexString(bvkk.f156422a);
                while (hexString.length() < 6) {
                    String valueOf = String.valueOf(hexString);
                    hexString = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
                }
                str = hexString;
            } catch (NumberFormatException e) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: The format of input is not long.");
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyx ahyx3 = (ahyx) da.f164949b;
        str.getClass();
        ahyx3.f68419a |= 1;
        ahyx3.f68420b = str;
        ahyx ahyx4 = (ahyx) da.mo74062i();
        this.f68273a.mo36470e(ahyx4);
        return ahyx4;
    }

    /* renamed from: a */
    public final void mo37251a(ahyw ahyw, ScanResult scanResult) {
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        boolean z3;
        byte[] bArr3;
        ahyw ahyw2 = ahyw;
        if (!(scanResult.getScanRecord() == null || (ahfo.m55647a(scanResult.getScanRecord()) == null && ahfo.m55653c(scanResult.getScanRecord()) == null))) {
            if (!cfoj.m141540U()) {
                Context context = this.f68274b;
                String address = scanResult.getDevice().getAddress();
                ScanRecord scanRecord = scanResult.getScanRecord();
                int rssi = scanResult.getRssi();
                byte[] a = ahfo.m55647a(scanRecord);
                if (a == null) {
                    a = ahfo.m55653c(scanRecord);
                    z3 = true;
                } else {
                    z3 = false;
                }
                byte[] b = ahfo.m55651b(scanRecord);
                byte[] e = ahfo.m55656e(scanRecord);
                double a2 = ahhs.m55808a(rssi, scanRecord.getTxPowerLevel());
                Intent putExtra = new Intent("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED").setClassName("com.google.android.gms", "com.google.android.gms.nearby.discovery.service.DiscoveryService").putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER", a).putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SUPPRESS_NOTIFICATION", z3).putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SALT", b);
                if (e != null && e.length > 0) {
                    bArr3 = e;
                } else {
                    bArr3 = ahfo.m55655d(scanRecord);
                }
                context.startService(putExtra.putExtra("com.google.android.gms.nearby.discovery.BATTERY_VALUES", bArr3).putExtra("com.google.android.gms.nearby.discovery.BATTERY_SUPPRESS_NOTIFICATION", e != null && e.length > 0).putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", address).putExtra("com.google.android.gms.nearby.discovery.DISTANCE_ESTIMATE", a2));
            } else {
                byte[] a3 = ahfo.m55647a(scanResult.getScanRecord());
                if (a3 == null) {
                    bArr = ahfo.m55653c(scanResult.getScanRecord());
                    z = true;
                } else {
                    bArr = a3;
                    z = false;
                }
                byte[] e2 = ahfo.m55656e(scanResult.getScanRecord());
                aics aics = (aics) ahgz.m55754a(this.f68274b, aics.class);
                String address2 = scanResult.getDevice().getAddress();
                byte[] b2 = ahfo.m55651b(scanResult.getScanRecord());
                if (e2 != null && e2.length > 0) {
                    bArr2 = e2;
                } else {
                    bArr2 = ahfo.m55655d(scanResult.getScanRecord());
                }
                if (e2 == null || e2.length <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (aics.mo37398a(bArr, z, address2, b2, bArr2, z2, ahhs.m55808a(scanResult.getRssi(), scanResult.getScanRecord().getTxPowerLevel())) == 2) {
                    return;
                }
            }
        }
        if ((ahyw2.f68392a & 1) != 0 && m56812a(ahyw)) {
            srn srn = ahsd.f67925a;
            bxvd bxvd = (bxvd) ahyw2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) ahyw2);
            long a4 = ((sqv) ahgz.m55754a(this.f68274b, sqv.class)).mo20505a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ahyw ahyw3 = (ahyw) bxvd.f164949b;
            bxvu bxvu = ahyw.f68391u;
            ahyw3.f68392a |= 32;
            ahyw3.f68398g = a4;
            ahyw ahyw4 = (ahyw) bxvd.mo74062i();
            if (cfoj.m141525F()) {
                ahyh ahyh = this.f68279h;
                String a5 = bmwb.m108442a(ahyw4.f68393b);
                synchronized (ahyh.f68345b) {
                    if (ahyh.f68345b.get(a5) == null) {
                        ahyh.f68345b.put(a5, ahyh.mo37290a());
                    }
                }
                int intValue = ((Integer) ahyh.f68345b.get(a5)).intValue();
                if (!ahyh.f68344a.mo37287a(intValue)) {
                    Intent className = new Intent().setClassName(ahyh.f68346c, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity");
                    className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", ahyw4.serializeToBytes());
                    className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_TYPE", "DEVICE_PAIRING");
                    className.setFlags(268435456);
                    ahyh.f68344a.mo37288a(intValue, 2);
                    ahyh.f68346c.startActivity(className);
                    ((buqh) ahgz.m55754a(ahyh.f68346c, buqh.class)).mo72989e(ahyh.f68347d);
                    ((buqh) ahgz.m55754a(ahyh.f68346c, buqh.class)).mo72983a(ahyh.f68347d, TimeUnit.SECONDS.toMillis(cfog.m141285m()));
                    return;
                }
                return;
            }
            ahyr ahyr = this.f68278g;
            if (cfoj.f184966a.mo6606a().mo82151bh() && !ahyr.f68377k.mo73041e()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Skipping showing notification, preference disabled.");
                return;
            }
            synchronized (ahyr.f68368b) {
                if (ahyr.f68368b.get(ahyw4.f68400i) == null) {
                    ahyr.f68368b.put(ahyw4.f68400i, Integer.valueOf(ahyr.f68367a.getAndIncrement()));
                    ahyr.f68376j.mo37019a(bvin.FAST_PAIR_NOTIFICATION_SHOWN, ahyw4.f68393b, ahyw4.f68400i, ahyr.f68378l.mo20505a() - ahyw4.f68415y);
                }
            }
            int intValue2 = ((Integer) ahyr.f68368b.get(ahyw4.f68400i)).intValue();
            if (!ahyr.f68371e.mo37299a(intValue2)) {
                ahyp ahyp = ahyr.f68371e;
                Integer valueOf = Integer.valueOf(intValue2);
                ahwv ahwv = (ahwv) ahyp.get(valueOf);
                boolean z4 = (ahwv == null || ahwv.f68259a != 3) ? false : !ahyp.mo37300a(ahwv);
                ahys ahys = ahyr.f68372f;
                String str = ahyw4.f68397f;
                String b3 = ahys.m56886b(ahys.f68380b, ahyw4);
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", ahys.f68380b.getResources().getString(C0126R.string.common_devices));
                if (cfog.f184854a.mo6606a().mo81953O()) {
                    String valueOf2 = String.valueOf(str);
                    str = valueOf2.length() == 0 ? new String("@") : "@".concat(valueOf2);
                }
                ahvk ahvk = new ahvk(ahys.f68380b, false);
                ahvk.mo37420a((cfoj.f184966a.mo6606a().mo82166bw() && z4) ? "DEVICES_REBRANDED" : "DEVICES_WITHIN_REACH_REBRANDED");
                ahvk.mo13630b(qkj.m32287a(ahys.f68380b, C0126R.C0127drawable.quantum_ic_devices_other_googblue_24));
                ahvk.mo13621a(ahys.m56885a(ahys.f68380b, ahyw4));
                ahvk.mo13640e(str);
                ahvk.mo13632b((CharSequence) b3);
                C1101jd jdVar = new C1101jd();
                jdVar.mo13593a(b3);
                ahvk.mo13626a(jdVar);
                Context context2 = ahys.f68380b;
                int i = ahys.f68379a;
                ahys.f68379a = i + 1;
                ahvk.f22254f = PendingIntent.getService(context2, i, ahys.m56884a(context2, valueOf, ahyw4), JGCastService.FLAG_PRIVATE_DISPLAY);
                Context context3 = ahys.f68380b;
                String str2 = ahyw4.f68393b;
                Intent action = DiscoveryChimeraService.m67336a(context3).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_DISMISSED");
                action.putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", intValue2).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", str2);
                int i2 = ahys.f68379a;
                ahys.f68379a = i2 + 1;
                ahvk.mo13631b(PendingIntent.getService(context3, i2, action, JGCastService.FLAG_PRIVATE_DISPLAY));
                ahvk.mo13637c(true);
                ahvk.mo13638d();
                ahvk.mo13627a(false);
                ahvk.f22271w = C1133kh.m17843b(ahys.f68380b, C0126R.color.discovery_activity_accent);
                ahvk.mo13634c();
                ahvk.f22269u = "recommendation";
                ahvk.mo13623a(bundle);
                if (cfoj.f184966a.mo6606a().mo82098aV()) {
                    AccessibilityManager accessibilityManager = (AccessibilityManager) ahys.f68380b.getSystemService("accessibility");
                    if (cfoj.m141542W() || !accessibilityManager.isTouchExplorationEnabled()) {
                        Context context4 = ahys.f68380b;
                        int i3 = ahys.f68379a;
                        ahys.f68379a = i3 + 1;
                        ahvk.mo13635c(PendingIntent.getService(context4, i3, new Intent(), JGCastService.FLAG_PRIVATE_DISPLAY));
                    }
                }
                if (cfoj.m141532M()) {
                    String str3 = null;
                    if ((ahyw4.f68392a & 1024) != 0 && !ahyw4.f68403l.isEmpty()) {
                        String str4 = ahyw4.f68403l;
                        if (!TextUtils.isEmpty(str4) && str4.trim().matches("^LE-[0-9]{4}")) {
                            str3 = str4.substring(3, 7);
                        }
                    }
                    if (str3 != null) {
                        ahvk.mo13636c(str3);
                    }
                }
                if (z4) {
                    int a6 = qkj.m32287a(ahys.f68380b, C0126R.C0127drawable.quantum_ic_notifications_paused_grey600_24);
                    String string = ahys.f68380b.getString(C0126R.string.discovery_do_not_show_again);
                    Context context5 = ahys.f68380b;
                    Intent putExtra2 = DiscoveryChimeraService.m67336a(context5).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_BANNED").putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", intValue2).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", ahyw4.f68393b).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", ahyw4.f68400i);
                    int i4 = ahys.f68379a;
                    ahys.f68379a = i4 + 1;
                    ahvk.mo13618a(a6, string, PendingIntent.getService(context5, i4, putExtra2, JGCastService.FLAG_PRIVATE_DISPLAY));
                }
                Notification b4 = ahvk.mo13629b();
                if (!ahyr.f68371e.mo37299a(intValue2)) {
                    long aY = cfog.f184854a.mo6606a().mo81990aY();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("FastPairNotificationTimeout");
                    sb.append(intValue2);
                    ahyq ahyq = new ahyq(ahyr, sb.toString(), intValue2, ahyw4);
                    ahyr.f68375i.mo72989e((buqn) ahyr.f68369c.get(valueOf));
                    ahyr.f68375i.mo72983a(ahyq, aY);
                    ahyr.f68369c.put(valueOf, ahyq);
                    ahyr.f68373g.mo36450a(intValue2, b4);
                    ahyo ahyo = ahyr.f68374h;
                    ahyo.f68360a.put(valueOf, ahyw4);
                    ahyo.mo37296a();
                }
                ahyr.f68371e.mo37298a(intValue2, 2);
                if (cfoj.m141550ae() && cfoj.m141546aa()) {
                    ahhd.m55769a(ahyr.f68370d, "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_PAIRING");
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aicw.a(ahsu, boolean):java.lang.String
     arg types: [ahsu, int]
     candidates:
      aicw.a(java.lang.String, int):android.content.Intent
      aicw.a(boolean, java.lang.String):void
      butb.a(android.content.Context, bvin):android.content.Intent
      aicw.a(ahsu, boolean):java.lang.String */
    /* renamed from: a */
    public final void mo37252a(ScanResult scanResult, ahyw ahyw) {
        int a = bvkt.m121215a(ahyw.f68412v);
        if (a != 0 && a == 3 && cfoj.f184966a.mo6606a().mo82138bI() && m56812a(ahyw)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairCache: Auto launching %s", ahyw.f68400i);
            aiaa a2 = ahvd.m56706a(ahyw);
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a2);
            int rssi = scanResult.getRssi();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa = (aiaa) bxvd.f164949b;
            aiaa aiaa2 = aiaa.f68501K;
            aiaa.f68513a |= 8192;
            aiaa.f68528p = rssi;
            ByteString a3 = ByteString.m123261a(nek.m26028a(scanResult.getScanRecord().getBytes()).f35402e);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa3 = (aiaa) bxvd.f164949b;
            a3.getClass();
            aiaa3.f68513a |= 268435456;
            aiaa3.f68508F = a3;
            bxvd da = aiab.f68539d.mo74144da();
            bxvd da2 = byzm.f169125d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byzm byzm = (byzm) da2.f164949b;
            byzm.f169128b = 700;
            byzm.f169127a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aiab aiab = (aiab) da.f164949b;
            byzm byzm2 = (byzm) da2.mo74062i();
            byzm2.getClass();
            aiab.f68542b = byzm2;
            aiab.f68541a |= 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa4 = (aiaa) bxvd.f164949b;
            aiab aiab2 = (aiab) da.mo74062i();
            aiab2.getClass();
            aiaa4.mo37329a();
            aiaa4.f68505C.add(aiab2);
            this.f68280i.mo37415a(new ahsu(this.f68274b, (aiaa) bxvd.mo74062i()), false);
        } else if (cfoj.m141538S() || !cfoj.m141540U()) {
            mo37251a(ahyw, scanResult);
        } else {
            this.f68275c.mo72987c(new ahwy(this, "fastPairEvaluateAndScan", ahyw, scanResult));
        }
    }
}
