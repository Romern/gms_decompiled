package p000;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.util.LruCache;
import java.util.List;

/* renamed from: ahtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahtz {

    /* renamed from: a */
    private static final bnic f68041a = m56658d();

    /* renamed from: b */
    private static final bnic f68042b = m56657c();

    /* renamed from: c */
    private static final bnic f68043c = m56659e();

    /* renamed from: d */
    private final ahzi f68044d;

    /* renamed from: e */
    private final ahyr f68045e;

    /* renamed from: f */
    private final ahxa f68046f;

    /* renamed from: g */
    private final ahsi f68047g;

    /* renamed from: h */
    private final buqh f68048h;

    /* renamed from: i */
    private final Context f68049i;

    public ahtz(Context context) {
        this.f68049i = context;
        this.f68044d = (ahzi) ahgz.m55754a(context, ahzi.class);
        this.f68045e = (ahyr) ahgz.m55754a(context, ahyr.class);
        this.f68046f = (ahxa) ahgz.m55754a(context, ahxa.class);
        this.f68047g = (ahsi) ahgz.m55754a(context, ahsi.class);
        this.f68048h = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    public static List m56654a() {
        if (cfoj.m141565o()) {
            return m56658d().mo67639g();
        }
        return f68041a.mo67639g();
    }

    /* renamed from: b */
    public static List m56656b() {
        if (cfoj.m141565o()) {
            return m56657c().mo67639g();
        }
        return f68042b.mo67639g();
    }

    /* renamed from: c */
    private static bnic m56657c() {
        bnia j = bnic.m109500j();
        j.mo67629b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_DOWNGRADE");
        j.mo67629b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST");
        j.mo67629b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_BATTERY");
        if (cfoj.m141550ae() && cfoj.m141546aa()) {
            j.mo67629b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_PAIRING");
        }
        if (cfoj.m141550ae() && cfoj.m141573w() && cfoj.f184966a.mo6606a().mo82144ba()) {
            j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_CLICKED");
        }
        if (cfoj.m141525F()) {
            j.mo67629b("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL");
        }
        return j.mo67751a();
    }

    /* renamed from: d */
    private static bnic m56658d() {
        bnia j = bnic.m109500j();
        j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP");
        if (cfoj.m141550ae()) {
            j.mo67629b("android.intent.action.SCREEN_ON");
            j.mo67629b("android.intent.action.SCREEN_OFF");
            j.mo67629b("android.net.wifi.STATE_CHANGE");
            j.mo67629b("android.net.conn.CONNECTIVITY_CHANGE");
            j.mo67629b("android.bluetooth.adapter.action.STATE_CHANGED");
            j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR");
            j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR");
            j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE");
            j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_DISMISSED");
            j.mo67629b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_BANNED");
            if (cfoj.f184966a.mo6606a().mo82081aE()) {
                j.mo67629b("android.intent.action.LOCALE_CHANGED");
            }
        }
        return j.mo67751a();
    }

    /* renamed from: e */
    private static bnic m56659e() {
        bnia j = bnic.m109500j();
        j.mo67752b((Iterable) m56657c());
        j.mo67752b((Iterable) m56658d());
        return j.mo67751a();
    }

    /* renamed from: a */
    public static boolean m56655a(String str) {
        if (cfoj.m141565o()) {
            return m56659e().contains(str);
        }
        return f68043c.contains(str);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0405, code lost:
        if (r8 != false) goto L_0x0407;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0430  */
    /* renamed from: a */
    public final void mo37162a(Intent intent) {
        char c;
        String str;
        boolean z;
        boolean z2;
        Intent intent2 = intent;
        this.f68048h.mo72984b();
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairHandler: Received action %s", intent.getAction());
        int intExtra = intent2.getIntExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", -1);
        String stringExtra = intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS");
        String stringExtra2 = intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_PUBLIC_ADDRESS");
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -2055695898:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1433975472:
                if (action.equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_DOWNGRADE")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1172645946:
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -687493489:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_DISMISSED")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -343630553:
                if (action.equals("android.net.wifi.STATE_CHANGE")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -19011148:
                if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 169758562:
                if (action.equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_PAIRING")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 257738786:
                if (action.equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 314392461:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_CLICKED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 388740751:
                if (action.equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case 411712845:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 639823527:
                if (action.equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_BATTERY")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 941344472:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_BANNED")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 1949616771:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2108582660:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR")) {
                    c = 1;
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
                String str2 = "com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID";
                this.f68047g.mo37019a(bvin.FAST_PAIR_NOTIFICATION_CLICKED, intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID"), stringExtra, 0);
                Intent intent3 = (Intent) intent2.getParcelableExtra("com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL");
                if (intent3 == null) {
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairHandler: Notification clicked with malformatted redirect intent");
                    return;
                }
                if (intent3.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID")) {
                    intent3.removeExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                }
                if (intent.getPackage() == null || !intent.getPackage().equals(this.f68049i.getPackageName())) {
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairHandler: ignoring click action from invalid package, %s", intent.getPackage());
                    return;
                }
                int intExtra2 = intent2.getIntExtra("com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL_TYPE", -1);
                Context context = this.f68049i;
                aiad aiad = new aiad(intent3, intExtra2, intent3.getPackage());
                switch (aiad.f68557b) {
                    case 1:
                    case 3:
                        boolean a = ahvd.m56712a(context, aiad.f68556a);
                        if (a) {
                            z = a;
                            break;
                        } else {
                            z = ahvd.m56715b(context, aiad.f68556a);
                            break;
                        }
                    case 2:
                    case 4:
                        z = ahvd.m56712a(context, aiad.f68556a);
                        break;
                    case 5:
                        z = ahvd.m56715b(context, aiad.f68556a);
                        break;
                    case 6:
                        context.sendBroadcast(aiad.f68556a);
                        str = aiad.f68556a.toUri(1);
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairUtils: Item launched. launchedUrl %s", str);
                        if (cfom.m141867b()) {
                            if (intExtra2 == 4) {
                                String str3 = str2;
                                this.f68047g.mo37018a(bvin.FAST_PAIR_POST_ACTION_INSTALL_COMPANION_APP, intent2.getStringExtra(str3), stm.m36299a(intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP")));
                                if (cfoj.m141556f() && intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP") != null) {
                                    ahvb.m56689a(this.f68049i, intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"), stringExtra2, (ahyw) this.f68046f.get(stringExtra), intent2.getStringExtra(str3));
                                }
                            } else {
                                this.f68047g.mo37018a(bvin.FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP, intent2.getStringExtra(str2), stm.m36299a(intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP")));
                            }
                        }
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairHandler: Finished launching %s, %s", intent3.getAction(), str);
                        if (intent3.getAction() != null && !intent3.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR") && str != null) {
                            this.f68045e.mo37303a(intent3.getIntExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", -1));
                            return;
                        }
                        return;
                    default:
                        ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairUtils: Failed to match intent type with redirect scheme");
                        ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairUtils: Failed to launch intent %s", aiad);
                        str = null;
                        if (cfom.m141867b()) {
                        }
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairHandler: Finished launching %s, %s", intent3.getAction(), str);
                        if (intent3.getAction() != null) {
                            return;
                        }
                        return;
                }
            case 1:
                if (intExtra != -1) {
                    ahyr ahyr = this.f68045e;
                    buqh buqh = ahyr.f68375i;
                    LruCache lruCache = ahyr.f68369c;
                    Integer valueOf = Integer.valueOf(intExtra);
                    buqh.mo72989e((buqn) lruCache.get(valueOf));
                    ahyr.f68369c.remove(valueOf);
                    ahyr.f68371e.mo37298a(intExtra, 4);
                    ahyr.f68374h.mo37297a(intExtra);
                    return;
                }
                return;
            case 2:
                if (stringExtra2 != null) {
                    this.f68045e.mo37304a(stringExtra2);
                    return;
                }
                return;
            case 3:
                int intExtra3 = intent2.getIntExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", -1);
                boolean booleanExtra = intent2.getBooleanExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", true);
                ahyr ahyr2 = this.f68045e;
                Integer valueOf2 = Integer.valueOf(intExtra3);
                if (booleanExtra) {
                    if (stringExtra2 != null) {
                        ahyr2.f68368b.put(stringExtra2, valueOf2);
                    }
                    ahyr2.f68371e.mo37298a(intExtra3, 5);
                    return;
                }
                ahyr2.f68371e.mo37301b(intExtra3);
                ahyr2.f68368b.remove(stringExtra);
                return;
            case 4:
                if (ahfo.m55646a(this.f68049i) && cfoj.m141550ae()) {
                    this.f68044d.mo37310b();
                    return;
                }
                return;
            case 5:
                if (ahfo.m55646a(this.f68049i) && cfoj.m141550ae()) {
                    this.f68044d.mo37313e();
                    return;
                }
                return;
            case 6:
                if (ahfo.m55646a(this.f68049i) && cfoj.m141550ae() && cfoj.f184966a.mo6606a().mo82174g()) {
                    if (!cfoj.f184966a.mo6606a().mo82190w()) {
                        z2 = this.f68044d.mo37315g();
                    } else {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("FastPairScanner2: isBleEnabled? bleEnabled:%b, btEnabled:%b, bleScanAvailable:%b", Boolean.valueOf(burl.m120296b()), Boolean.valueOf(burl.m120292a()), Boolean.valueOf(burl.m120298c()));
                        z2 = burl.m120296b();
                    }
                    boolean f = this.f68044d.mo37314f();
                    if (z2 && !f) {
                        this.f68044d.mo37308a(cfog.m141286n());
                        return;
                    } else if (!z2 && f) {
                        this.f68044d.mo37313e();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairAutoTest: LogLevel info");
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTest: LogLevel warning");
                ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("FastPairAutoTest: LogLevel severe");
                return;
            case 8:
                if (intExtra != -1) {
                    this.f68047g.mo37019a(bvin.FAST_PAIR_NOTIFICATION_DISMISSED, intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID"), stringExtra, 0);
                    this.f68045e.f68371e.mo37298a(intExtra, 3);
                    return;
                }
                return;
            case 9:
                if (intExtra != -1) {
                    this.f68047g.mo37019a(bvin.FAST_PAIR_NOTIFICATION_DO_NOT_SHOW_CLICKED, intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID"), stringExtra, 0);
                    this.f68045e.mo37303a(intExtra);
                    return;
                }
                return;
            case 10:
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairHandler: user locale change evict memory cache");
                ahxa ahxa = this.f68046f;
                ahxa.evictAll();
                ahxa.f68273a.mo36466c();
                return;
            case 11:
                if (!cfoj.m141550ae() || !cfoj.f184966a.mo6606a().mo82169bz()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairHandler: low latency burst for battery is not supported.");
                    return;
                } else {
                    this.f68044d.mo37308a(cfog.f184854a.mo6606a().mo82001aj());
                    return;
                }
            case 12:
                if (!cfoj.m141550ae() || !cfoj.m141546aa()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairHandler: low latency burst for pairing is not supported.");
                    return;
                } else {
                    this.f68044d.mo37308a(cfog.f184854a.mo6606a().mo82002ak());
                    return;
                }
            case 13:
                if (cfoj.m141550ae()) {
                    this.f68044d.mo37308a(cfog.m141286n());
                    return;
                }
                return;
            case 14:
                if (cfoj.m141550ae()) {
                    this.f68044d.mo37311c();
                    return;
                }
                return;
            case 15:
            case 16:
                NetworkInfo networkInfo = (NetworkInfo) intent2.getParcelableExtra("networkInfo");
                if (networkInfo != null && networkInfo.isConnected() && cfoj.f184966a.mo6606a().mo82124av()) {
                    ((ahvf) ahgz.m55754a(this.f68049i, ahvf.class)).f68156a.f68154c.mo37155b();
                    return;
                }
                return;
            case 17:
                String stringExtra3 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID");
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairHandler: HalfSheetManager report dismiss device modelId %s", stringExtra3);
                ahyh ahyh = (ahyh) ahgz.m55754a(this.f68049i, ahyh.class);
                Integer num = (Integer) ahyh.f68345b.get(stringExtra3);
                if (num != null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("HalfSheetManager: id %s half sheet is dismissed", num);
                    if (!ahyh.f68344a.mo37288a(num.intValue(), 3)) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("HalfSheetManager: id %s half sheet is banned", num);
                        ahyh.f68344a.mo37288a(num.intValue(), 6);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
