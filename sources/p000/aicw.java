package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aicw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicw extends butb {

    /* renamed from: a */
    public final Context f68735a;

    /* renamed from: b */
    public final ahsi f68736b;

    /* renamed from: c */
    private final ahst f68737c;

    /* renamed from: d */
    private final sqv f68738d;

    /* renamed from: e */
    private final aiae f68739e;

    /* renamed from: f */
    private final burh f68740f;

    /* renamed from: g */
    private final ahsh f68741g;

    /* renamed from: h */
    private final buqh f68742h;

    public aicw(Context context) {
        this.f68735a = context;
        this.f68742h = (buqh) ahgz.m55754a(context, buqh.class);
        this.f68737c = (ahst) ahgz.m55754a(context, ahst.class);
        this.f68739e = (aiae) ahgz.m55754a(context, aiae.class);
        this.f68736b = (ahsi) ahgz.m55754a(context, ahsi.class);
        this.f68740f = (burh) ahgz.m55754a(context, burh.class);
        this.f68741g = (ahsh) ahgz.m55754a(context, ahsh.class);
        this.f68738d = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* renamed from: a */
    private final void m56993a() {
        srn srn = ahsd.f67925a;
        this.f68742h.mo72984b();
        this.f68737c.mo37035a();
        Context context = this.f68735a;
        if (!burl.m120294a(context, ahfl.m55644a(context))) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("UserActionHandler: no refresh because of permission");
        }
        ((aibm) ahgz.m55754a(this.f68735a, aibm.class)).mo37366a();
    }

    /* renamed from: b */
    private static bvin m56994b(Intent intent) {
        return (bvin) bmxv.m108567c(bvin.m121150a(intent.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", 0))).mo66812a(bvin.UNKNOWN_DISCOVERY_EVENT);
    }

    /* renamed from: c */
    private static bzau m56995c(Intent intent) {
        return (bzau) bmxv.m108567c(bzau.m125594a(intent.getIntExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", 0))).mo66812a(bzau.ENTRY_POINT_UNKNOWN);
    }

    /* renamed from: d */
    private final void m56996d(Intent intent) {
        ahyz e = m56997e(intent);
        if (e == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("logSliceEvent: Can't get cached Fast Pair device from neither address nor account key.");
            return;
        }
        ahsi ahsi = this.f68736b;
        bvin b = m56994b(intent);
        String str = e.f68437k;
        bzau c = m56995c(intent);
        String str2 = (String) bmxv.m108567c(intent.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP")).mo66812a("unknown");
        if (!cfoj.m141567q()) {
            ahsi.mo37011a(b);
            return;
        }
        bxvd b2 = ahsi.mo37024b(b);
        bxvd da = byvy.f168535e.mo74144da();
        int a = ahsi.m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvy byvy = (byvy) da.f164949b;
        int i = byvy.f168537a | 1;
        byvy.f168537a = i;
        byvy.f168538b = a;
        byvy.f168539c = c.f169233e;
        int i2 = i | 2;
        byvy.f168537a = i2;
        str2.getClass();
        byvy.f168537a = i2 | 4;
        byvy.f168540d = str2;
        byvy byvy2 = (byvy) da.mo74062i();
        if (b2.f164950c) {
            b2.mo74035c();
            b2.f164950c = false;
        }
        bywl bywl = (bywl) b2.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvy2.getClass();
        bywl.f168610r = byvy2;
        bywl.f168593a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        ahsi.mo37023a((bywl) b2.mo74062i());
    }

    /* renamed from: e */
    private final ahyz m56997e(Intent intent) {
        if (intent.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS") != null) {
            return this.f68737c.mo37033a(intent.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS"));
        }
        if (intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY") != null) {
            return this.f68737c.mo37032a(bxtx.m123261a(intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY")));
        }
        return null;
    }

    /* renamed from: f */
    private final boolean m56998f(Intent intent) {
        try {
            this.f68735a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    /* renamed from: g */
    private final boolean m56999g(Intent intent) {
        return this.f68735a.startService(intent) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Intent mo37418b(String str, int i) {
        return DiscoveryChimeraService.m67336a(this.f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_DISMISS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo37412a(String str) {
        return DiscoveryChimeraService.m67336a(this.f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo37413a(String str, int i) {
        return DiscoveryChimeraService.m67336a(this.f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aicw.a(ahsu, boolean):java.lang.String
     arg types: [ahsu, int]
     candidates:
      aicw.a(java.lang.String, int):android.content.Intent
      aicw.a(boolean, java.lang.String):void
      butb.a(android.content.Context, bvin):android.content.Intent
      aicw.a(ahsu, boolean):java.lang.String */
    /* renamed from: b */
    public final String mo37419b(ahsu ahsu) {
        return mo37415a(ahsu, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aicw.a(ahsu, boolean):java.lang.String
     arg types: [ahsu, int]
     candidates:
      aicw.a(java.lang.String, int):android.content.Intent
      aicw.a(boolean, java.lang.String):void
      butb.a(android.content.Context, bvin):android.content.Intent
      aicw.a(ahsu, boolean):java.lang.String */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo37414a(ahsu ahsu) {
        return mo37415a(ahsu, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0120, code lost:
        if (r13 == false) goto L_0x012a;
     */
    /* renamed from: a */
    public final String mo37415a(ahsu ahsu, boolean z) {
        String str;
        boolean z2;
        Long l;
        if (ahsu != null) {
            srn srn = ahsd.f67925a;
            ahsu.mo37084i();
            if (ahsu.mo37085j() != bzbk.NEARBY_CHROMECAST || !cfod.f184793a.mo6606a().mo81907ab()) {
                str = ahsu.mo37095t();
            } else {
                String str2 = null;
                int i = 0;
                for (aiac aiac : this.f68737c.f67961c.mo37107f()) {
                    long a = this.f68738d.mo20505a();
                    if ((aiac.f68546a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        l = Long.valueOf(aiac.f68555j);
                    } else {
                        l = null;
                    }
                    if (!ahsu.m56516a(a, l)) {
                        bzbk a2 = bzbk.m125615a(aiac.f68548c);
                        if (a2 == null) {
                            a2 = bzbk.NEARBY_TYPE_UNKNOWN;
                        }
                        if (a2 == bzbk.NEARBY_CHROMECAST && (aiac.f68546a & 32) != 0) {
                            i++;
                            str2 = aiac.f68552g;
                        }
                    }
                }
                if (i == 1) {
                    str = String.format(cfod.f184793a.mo6606a().mo81913b(), str2);
                } else {
                    str = cfod.m141142b();
                }
            }
            aiad a3 = this.f68739e.mo37330a(str, ahsu);
            int i2 = a3.f68557b;
            if (i2 == 0) {
                ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("UserActionHandler action URL type unknown for ID %s", ahsu.mo37084i());
                return null;
            }
            if (i2 == 4) {
                ahsh ahsh = this.f68741g;
                ahsh.f67932b.mo72984b();
                ahsu.mo37069a(Long.valueOf(ahsh.f67934d.mo20505a()));
                ahsh.f67935e.mo73037b(true);
                this.f68736b.mo37012a(bvin.REDIRECTED_TO_PLAYSTORE, ahsu);
            }
            a3.f68556a.setFlags(268435456);
            if (z) {
                a3.f68556a.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
            }
            bzbk j = ahsu.mo37085j();
            bzbk bzbk = bzbk.NEARBY_DEVICE;
            if (j == bzbk) {
                a3.f68556a.putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", ahsu.mo37084i());
            }
            switch (a3.f68557b) {
                case 1:
                case 3:
                    z2 = m56998f(a3.f68556a);
                    if (!z2) {
                        z2 = m56999g(a3.f68556a);
                        break;
                    }
                    break;
                case 2:
                case 4:
                    z2 = m56998f(a3.f68556a);
                    break;
                case 5:
                    if (j == bzbk) {
                        z2 = m56999g(a3.f68556a);
                        break;
                    }
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68424a("Failed to launch intent %s for %s", a3, ahsu);
                    return null;
                case 6:
                    if (j == bzbk) {
                        this.f68735a.sendBroadcast(a3.f68556a);
                        return a3.f68556a.toUri(1);
                    }
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68424a("Failed to launch intent %s for %s", a3, ahsu);
                    return null;
                default:
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68424a("Failed to launch intent %s for %s", a3, ahsu);
                    return null;
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("UserActionHandler.launchItem() failed due to nonexistent item");
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37416a(Intent intent) {
        Integer num;
        ahsu ahsu;
        char c;
        Integer num2;
        Integer num3;
        String str;
        aiaa aiaa;
        Intent intent2 = intent;
        this.f68742h.mo72984b();
        String action = intent.getAction();
        srn srn = ahsd.f67925a;
        if (action == null) {
            ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("UserActionHandler action is null. (Invoked from an explicit action)");
            return;
        }
        if (intent2.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY")) {
            num = Integer.valueOf(intent2.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", 0));
        } else {
            num = null;
        }
        String stringExtra = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
        if (stringExtra != null) {
            ahsu = this.f68737c.mo37052e(stringExtra);
            if (ahsu == null) {
                ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Got invalid item ID %s", stringExtra);
            }
        } else {
            ahsu = null;
        }
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_IDS");
        ArrayList arrayList = new ArrayList();
        if (stringArrayListExtra != null) {
            arrayList.ensureCapacity(stringArrayListExtra.size());
            int size = stringArrayListExtra.size();
            for (int i = 0; i < size; i++) {
                ahsu e = this.f68737c.mo37052e(stringArrayListExtra.get(i));
                if (e == null) {
                    ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Got invalid item ID %s", stringExtra);
                } else {
                    arrayList.add(e);
                }
            }
        }
        aicu aicu = new aicu(this, "enable_certain_device", stringExtra);
        aicv aicv = new aicv(this, "disable_certain_device", stringExtra);
        intent2.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_EDUCATION_POLICY", 1);
        aict aict = (aict) ahgz.m55754a(this.f68735a, aict.class);
        switch (action.hashCode()) {
            case -2122686684:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_MAGIC_PAIR_PAIRING_DISMISS")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -2009311105:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_FOOTPRINTS_ANALYTICS")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1849521411:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LOG_FIND_MY_DEVICE_EVENT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1759314675:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_REQUEST_DATA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1686246004:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_OPT_IN_DISMISS")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1621693364:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_CLICK")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1582561631:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -971464229:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LOG_EVENT")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -529691762:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_DISMISS")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -479424124:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -463575145:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICK")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -209719977:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_GOOGLE_SETTING_CLICK")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -64709038:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LIST_ITEM_ENABLE")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 48867774:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_AUTO_REFRESH")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 201750478:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_DISCOVERY_LIST_ACTIVITY_ITEM_VIEWED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 266148446:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_DISCOVERY_LIST_ACTIVITY_ITEM_CLICK")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 292447751:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_SEND_PENDING_INTENT")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 292902778:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_GROUP_DISMISS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 379222929:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LAUNCH_WEB_URL_IN_BROWSER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 589591761:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_CLICK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 646648716:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_CLICK")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 663976884:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_LAUNCH_INTENT")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 900193546:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_OPT_IN_CLICK")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case 1274921945:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LIST_ITEM_DISABLE")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1401833397:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_USER_FEEDBACK")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1436955726:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_ITEM_DISMISS")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 1445757256:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_REFRESH")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1487727224:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_NOTIFICATION_GROUP_CLICK")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 1638558651:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_VIEWED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2131315984:
                if (action.equals("com.google.android.gms.nearby.discovery.ACTION_QS_TILE_CLICK")) {
                    c = 17;
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
                this.f68736b.mo37011a(bvin.LIST_VIEW_REFRESHED);
                m56993a();
                return;
            case 1:
                this.f68736b.mo37011a(bvin.LIST_VIEW_AUTO_REFRESHED);
                m56993a();
                return;
            case 2:
                ((aibm) ahgz.m55754a(this.f68735a, aibm.class)).mo37367a(1);
                return;
            case 3:
                ahsi ahsi = this.f68736b;
                bvin bvin = bvin.DEVICES_LIST_ITEM_CLICKED;
                String a = mo37414a(ahsu);
                if (intent2.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_LIST_POSITION")) {
                    num2 = Integer.valueOf(intent2.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_LIST_POSITION", -1));
                } else {
                    num2 = null;
                }
                ahsi.mo37014a(bvin, ahsu, a, num2);
                return;
            case 4:
                ahsi ahsi2 = this.f68736b;
                bvin bvin2 = bvin.LIST_ITEM_CLICKED;
                String a2 = mo37414a(ahsu);
                if (intent2.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_LIST_POSITION")) {
                    num3 = Integer.valueOf(intent2.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_LIST_POSITION", -1));
                } else {
                    num3 = null;
                }
                ahsi2.mo37014a(bvin2, ahsu, a2, num3);
                return;
            case 5:
                this.f68736b.mo37012a(bvin.DEVICES_LIST_ITEM_VIEWED, ahsu);
                return;
            case 6:
                this.f68736b.mo37012a(bvin.LIST_ITEM_VIEWED, ahsu);
                return;
            case 7:
                aict.mo37408a();
                this.f68736b.mo37025b(bvin.NOTIFICATION_ITEM_CLICKED, ahsu, mo37419b(ahsu), num);
                if (cfod.f184793a.mo6606a().mo81932u()) {
                    ((buqh) ahgz.m55754a(this.f68735a, buqh.class)).mo72983a(aicv, cfog.f184854a.mo6606a().mo81949K());
                    ((buqh) ahgz.m55754a(this.f68735a, buqh.class)).mo72983a(aicu, cfod.f184793a.mo6606a().mo81933v());
                    return;
                }
                return;
            case 8:
                if (ahsu != null) {
                    ahsu.mo37065a(3);
                }
                this.f68736b.mo37013a(bvin.NOTIFICATION_ITEM_DISMISSED, ahsu, num);
                aict.mo37409a(ahsu);
                return;
            case 9:
                this.f68736b.mo37013a(bvin.BEACON_OPT_IN_NOTIFICATION_DISMISSED, ahsu, num);
                aict.mo37409a(ahsu);
                return;
            case 10:
                this.f68736b.mo37022a(bvin.NOTIFICATION_GROUP_CLICKED, arrayList, num);
                aict.mo37408a();
                if (arrayList.size() == 1) {
                    mo37419b((ahsu) arrayList.get(0));
                    return;
                }
                this.f68740f.mo73042f();
                Context context = this.f68735a;
                context.startActivity(buso.m120390a(context));
                return;
            case 11:
                int i2 = Build.VERSION.SDK_INT;
                if (arrayList.size() > 1) {
                    this.f68736b.mo37022a(bvin.NOTIFICATION_GROUP_DISMISSED, arrayList, num);
                    return;
                }
                return;
            case 12:
                if (ahsu == null) {
                    ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("The item ID is either missing or invalid %s", stringExtra);
                    return;
                }
                this.f68736b.mo37013a(bvin.NOTIFICATION_DO_NOT_SHOW_AGAIN_CLICKED, ahsu, num);
                if (ahsu == null) {
                    ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("Muted item cannot be null");
                } else {
                    this.f68737c.mo37040a(ahsu.mo37084i(), 3);
                    ((aibm) ahgz.m55754a(this.f68735a, aibm.class)).mo37367a(1);
                }
                this.f68735a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                Toast.makeText(this.f68735a, (int) C0126R.string.discovery_report_abuse_snackbar_message, 0).show();
                return;
            case 13:
                aict.mo37408a();
                this.f68736b.mo37013a(bvin.BEACON_OPT_IN_NOTIFICATION_CLICKED, ahsu, num);
                Context context2 = this.f68735a;
                context2.startActivity(buso.m120390a(context2));
                return;
            case 14:
                this.f68736b.mo37013a(bvin.MAGIC_PAIR_PAIRING_NOTIFICATION_DISMISSED, ahsu, num);
                return;
            case 15:
                ahwm ahwm = (ahwm) ahgz.m55754a(this.f68735a, ahwm.class);
                ahwm.f68241e.put(ahwm.f68242f, ahwm.f68243g);
                this.f68736b.mo37020a(bvin.FAST_PAIR_BATTERY_NOTIFICATION_DISMISSED, intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID"), intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS"), 0, 0);
                return;
            case 16:
                String stringExtra2 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS");
                byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY");
                if (stringExtra2 == null || byteArrayExtra == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Failed to launch battery notification from click.");
                    return;
                }
                this.f68736b.mo37020a(bvin.FAST_PAIR_BATTERY_NOTIFICATION_CLICKED, intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID"), stringExtra2, 0, 0);
                Intent a3 = busn.m120389a(this.f68735a, stringExtra2, byteArrayExtra);
                if (a3 == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Couldn't create device details intent.");
                    return;
                }
                a3.setFlags(268435456);
                this.f68735a.startActivity(a3);
                return;
            case 17:
            case 18:
                this.f68740f.mo73042f();
                return;
            case 19:
                this.f68736b.mo37021a(bvin.LIST_ITEMS_ENABLED, arrayList);
                this.f68737c.mo37043a(stringArrayListExtra, 2);
                ((aibm) ahgz.m55754a(this.f68735a, aibm.class)).mo37366a();
                return;
            case 20:
                this.f68736b.mo37021a(bvin.LIST_ITEMS_DISABLED, arrayList);
                this.f68737c.mo37043a(stringArrayListExtra, 3);
                ((aibm) ahgz.m55754a(this.f68735a, aibm.class)).mo37366a();
                return;
            case 21:
                String stringExtra3 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_URL");
                this.f68736b.mo37012a(bvin.WEB_URL_LAUNCHED_IN_BROWSER, ahsu);
                Context context3 = this.f68735a;
                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra3)).addFlags(268435456);
                aiae.m56949a(addFlags, (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
                context3.startActivity(addFlags);
                return;
            case 22:
                boolean booleanExtra = intent2.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_IS_INITIAL_PAIRING", true);
                StringBuilder sb = new StringBuilder();
                if (!booleanExtra) {
                    str = "Subsequent";
                } else {
                    str = "Initial";
                }
                sb.append(str);
                sb.append(" pairing failure.\nPlease attach a bugreport.zip on buganizer.");
                wwr wwr = new wwr(this.f68735a);
                wwu wwu = new wwu(this.f68735a);
                wwu.f51499d = "com.google.android.apps.wearables.maestro.companion.USER_INITIATED_FEEDBACK_REPORT";
                wwu.f51498c = sb.toString();
                wwr.mo29487a(wwu.mo29490a());
                this.f68735a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: start user feedback");
                return;
            case 23:
                this.f68736b.mo37018a(bvin.m121150a(intent2.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", 56)), intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID"), intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"));
                return;
            case 24:
                String stringExtra4 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID");
                String str2 = intent2.hasExtra("com.google.android.gms.nearby.discovery.fastpair.CONNECTION_ID") ? (String) ((ahtv) ahgz.m55754a(this.f68735a, ahtv.class)).f68034b.get(Integer.valueOf(intent2.getIntExtra("com.google.android.gms.nearby.discovery.fastpair.CONNECTION_ID", 0))) : null;
                if (bmxx.m108577a(str2) && bmxx.m108577a(stringExtra4)) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: bisto does not send back valid information");
                    return;
                } else if (cfoj.m141524E()) {
                    if (!bmxx.m108577a(str2)) {
                        ahyw a4 = ahvd.m56704a(this.f68735a, str2);
                        aiaa = a4 != null ? ahvd.m56706a(a4) : null;
                    } else {
                        Iterator it = this.f68737c.mo37048c().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ahsu ahsu2 = (ahsu) it.next();
                                if (bmwb.m108443a(stringExtra4, bmxx.m108578b(ahsu2.mo37060G()))) {
                                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("OOBE setup: CachedItem for %s found", stringExtra4);
                                    aiaa = ahsu2.f67969b;
                                }
                            } else {
                                aiaa = null;
                            }
                        }
                    }
                    if (aiaa != null) {
                        ahsu ahsu3 = new ahsu(this.f68735a, aiaa);
                        new ahvb(this.f68735a, ahsu3, true).mo37193a(ahvd.m56709a(aiaa), 0, ahsu3.mo37086k(), ahsu3.mo37088m());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 25:
                this.f68736b.mo37012a(m56994b(intent), ahsu);
                return;
            case 26:
                ahti ahti = new ahti(intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID"), intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_BLE_ADDRESS"), this.f68735a);
                ahtg f = ahth.m56604f();
                f.mo37114a(bvjc.WRITE_TO_FOOTPRINTS);
                f.mo37113a(SystemClock.elapsedRealtime() - intent2.getLongExtra("com.google.android.gms.nearby.discovery.EXTRA_DURATION_MILLIS", 0));
                f.mo37115b(intent2.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_NUMBER_DEVICES", -1));
                if (intent2.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_UPLOAD_FAIL_REASON")) {
                    f.f67983a = (Throwable) intent2.getSerializableExtra("com.google.android.gms.nearby.discovery.EXTRA_UPLOAD_FAIL_REASON");
                }
                ahti.mo37121a(f.mo37111a());
                return;
            case 27:
                m56996d(intent);
                Intent intent3 = (Intent) intent2.getParcelableExtra("com.google.android.gms.nearby.discovery.EXTRA_INTENT");
                if (intent3 != null) {
                    intent3.setFlags(268435456);
                    this.f68735a.startActivity(intent3);
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("Launched intent after logging: %s", intent3.toUri(1));
                    return;
                }
                return;
            case 28:
                m56996d(intent);
                PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("com.google.android.gms.nearby.discovery.EXTRA_PENDING_INTENT");
                if (pendingIntent != null) {
                    try {
                        pendingIntent.send();
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("Sent pending intent after logging: %s", pendingIntent.getTargetPackage());
                        return;
                    } catch (PendingIntent.CanceledException e2) {
                        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                        bnsl.mo68437a(e2);
                        bnsl.mo68420a("Failed to send pending intent: %s", pendingIntent.getTargetPackage());
                        return;
                    }
                } else {
                    return;
                }
            case 29:
                ahyz e3 = m56997e(intent);
                if (e3 == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("logFindMyDevice: Can't get cached Fast Pair device from neither address nor account key.");
                    return;
                }
                ahsi ahsi3 = this.f68736b;
                bvin b = m56994b(intent);
                String str3 = e3.f68437k;
                bzau c2 = m56995c(intent);
                if (!cfoj.m141567q()) {
                    ahsi3.mo37011a(b);
                    return;
                } else {
                    ahsi3.mo37017a(b, str3, c2, 101);
                    return;
                }
            default:
                ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Action not found: %s.", intent.getAction());
                return;
        }
    }

    /* renamed from: a */
    public final void mo37417a(boolean z, String str) {
        if (this.f68737c.mo37052e(str) == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("UserActionHandler: cache manager does not have item id %s", str);
            return;
        }
        this.f68737c.mo37052e(str).mo37070a(z);
        ((aibm) ahgz.m55754a(this.f68735a, aibm.class)).mo37367a(1);
    }
}
