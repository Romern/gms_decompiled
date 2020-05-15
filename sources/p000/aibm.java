package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aibm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibm {

    /* renamed from: a */
    public final ahst f68606a;

    /* renamed from: b */
    public final aidb f68607b;

    /* renamed from: c */
    public final buqh f68608c;

    /* renamed from: d */
    public final aiag f68609d;

    /* renamed from: e */
    private final Context f68610e;

    /* renamed from: f */
    private final ahyh f68611f;

    /* renamed from: g */
    private final aicw f68612g;

    /* renamed from: h */
    private final aict f68613h;

    /* renamed from: i */
    private final sqv f68614i;

    /* renamed from: j */
    private final buqn f68615j = new aibi(this, "timeoutUi");

    /* renamed from: k */
    private final buqn f68616k = new aibj(this, "updateUi");

    /* renamed from: l */
    private long f68617l = 0;

    /* renamed from: m */
    private long f68618m = 0;

    public aibm(Context context) {
        this.f68610e = context;
        this.f68606a = (ahst) ahgz.m55754a(context, ahst.class);
        this.f68607b = (aidb) ahgz.m55754a(context, aidb.class);
        this.f68611f = (ahyh) ahgz.m55754a(context, ahyh.class);
        this.f68612g = (aicw) ahgz.m55754a(context, aicw.class);
        this.f68613h = (aict) ahgz.m55754a(context, aict.class);
        this.f68608c = (buqh) ahgz.m55754a(context, buqh.class);
        this.f68614i = (sqv) ahgz.m55754a(context, sqv.class);
        this.f68609d = (aiag) ahgz.m55754a(context, aiag.class);
    }

    /* renamed from: a */
    private final Intent m56959a(String str) {
        return this.f68612g.mo37412a(str);
    }

    /* renamed from: a */
    public final void mo37366a() {
        mo37367a(0);
    }

    /* renamed from: a */
    public final void mo37367a(int i) {
        mo37368a(i, bzbk.NEARBY_TYPE_UNKNOWN);
    }

    /* renamed from: a */
    public final void mo37368a(int i, bzbk bzbk) {
        bngx bngx;
        int i2 = i;
        this.f68608c.mo72984b();
        if (i2 != 1) {
            long a = this.f68614i.mo20505a();
            long Z = (this.f68617l + cfod.f184793a.mo6606a().mo81904Z()) - a;
            if (bzbk == bzbk.NEARBY_DEVICE) {
                Z = (this.f68617l + cfod.f184793a.mo6606a().mo81903Y()) - a;
            }
            long j = this.f68618m;
            if (j != 0) {
                long j2 = j - a;
                if (j2 < Z) {
                    Z = j2;
                }
            }
            if (Z > 0) {
                this.f68608c.mo72989e(this.f68616k);
                this.f68608c.mo72983a(this.f68616k, Z);
                this.f68618m = Z + a;
                return;
            }
            this.f68618m = 0;
            this.f68617l = this.f68614i.mo20505a();
        }
        List<ahsu> c = this.f68606a.mo37048c();
        Context context = this.f68610e;
        if (!burl.m120294a(context, ahfl.m55644a(context))) {
            bngx = bngx.m109376e();
        } else {
            ArrayList arrayList = new ArrayList(c.size());
            for (ahsu ahsu : c) {
                int a2 = ahzv.m56936a(ahsu.f67969b.f68504B);
                if (a2 == 0 || a2 != 5) {
                    if (!ahsu.mo37075c()) {
                        ahsu.mo37066a(4, String.format("Not in recent scans (Last seen %s)", DateUtils.getRelativeTimeSpanString(ahsu.mo37101y().longValue(), this.f68614i.mo20505a(), 0)));
                    } else if (!ahsu.mo37078e()) {
                        ahsu.mo37066a(4, "Invalid title or URL");
                    } else {
                        ahsu.mo37073b(1, (String) null);
                        arrayList.add(ahsu);
                    }
                }
            }
            bngx = bngx.m109368a((Collection) arrayList);
        }
        srn srn = ahsd.f67925a;
        c.size();
        bngx.size();
        if (!cfod.f184793a.mo6606a().mo81930s()) {
            this.f68608c.mo72987c(new aibk(this, "updateUiWithItems", bngx, i2));
            return;
        }
        aiaf.m56953a(bngx);
        mo37369a(i2, bngx);
    }

    /* JADX WARN: Type inference failed for: r45v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, ahsu]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04ee  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo37369a(int i, Collection r45) {
        int i2;
        Object obj;
        int i3;
        aibm aibm;
        aidb aidb;
        bngx bngx;
        aicz aicz;
        int i4;
        aidb aidb2;
        aicz aicz2;
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        int size = r45.size();
        boolean z = false;
        int i5 = 0;
        while (true) {
            i2 = 4;
            if (i5 >= size) {
                break;
            }
            ahsu ahsu = (ahsu) r45.get(i5);
            int b = bzaw.m125599b(ahsu.mo37094s().f169128b);
            if (b == 0 || b != 101) {
                arrayList.add(ahsu);
            } else if (ahsu.mo37056C()) {
                ahsu.mo37066a(4, "Targeting does not match");
            } else {
                ahsu.mo37066a(4, "Rated poorly on server");
            }
            i5++;
            z = false;
        }
        srn srn = ahsd.f67925a;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, aibh.f68599a);
        HashSet hashSet = new HashSet(arrayList.size());
        HashSet hashSet2 = new HashSet(arrayList.size());
        HashSet hashSet3 = new HashSet(arrayList.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ahsu ahsu2 = (ahsu) it.next();
            if (hashSet2.contains(ahsu2.mo37055B())) {
                ahsu2.mo37066a(4, "Member of group already present");
                it.remove();
            } else if (ahsu2.mo37085j() != bzbk.NEARBY_DEVICE && hashSet.contains(ahsu2.mo37059F())) {
                ahsu2.mo37066a(4, "Beacon already has attachment");
                it.remove();
            } else if (hashSet3.contains(Integer.valueOf(ahsu2.mo37082h()))) {
                ahsu2.mo37066a(4, "Existing attachment with same text/URL");
                it.remove();
            } else {
                if (ahsu2.mo37060G() != null) {
                    hashSet.add(ahsu2.mo37059F());
                }
                if (ahsu2.mo37055B() != null) {
                    hashSet2.add(ahsu2.mo37055B());
                }
                hashSet3.add(Integer.valueOf(ahsu2.mo37082h()));
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        arrayList2.size();
        arrayList.size();
        arrayList2.size();
        int size2 = arrayList2.size();
        int i6 = 0;
        while (true) {
            obj = null;
            if (i6 >= size2) {
                break;
            }
            ((ahsu) arrayList2.get(i6)).mo37073b(2, (String) null);
            i6++;
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i7 = 0;
        while (true) {
            i3 = 1;
            if (i7 >= size3) {
                break;
            }
            ahsu ahsu3 = (ahsu) arrayList2.get(i7);
            if (ahsu3.mo37063J() == 2) {
                int b2 = bzaw.m125599b(ahsu3.mo37094s().f169128b);
                if (b2 != 0) {
                    i3 = b2;
                }
                if (i3 - 1 >= 700) {
                    arrayList3.add(ahsu3);
                }
            }
            i7++;
        }
        if (!arrayList3.isEmpty()) {
            aicw aicw = this.f68612g;
            ahsu ahsu4 = (ahsu) arrayList3.get(z ? 1 : 0);
            Intent a = aiae.m56947a(ahsu4.mo37095t());
            if (!(a == null || a.getPackage() == null)) {
                try {
                    aicw.f68735a.getPackageManager().getPackageInfo(a.getPackage(), z);
                } catch (PackageManager.NameNotFoundException e) {
                    a.getPackage();
                }
            }
            ahsu4.mo37084i();
            ahsu4.mo37057D();
            String b3 = aicw.mo37419b(ahsu4);
            aicw.f68736b.mo37025b(bvin.ITEM_AUTO_LAUNCHED, ahsu4, b3, null);
            if (b3 != null) {
                int size4 = arrayList3.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    ((ahsu) arrayList3.get(i8)).mo37070a(z);
                }
                this.f68608c.mo72983a(new aibl("reenableSystemDisabledItems", arrayList3), TimeUnit.SECONDS.toMillis(cfog.f184854a.mo6606a().mo82025c()));
            }
        }
        int i9 = 3;
        if (cfoj.m141525F()) {
            ahyh ahyh = this.f68611f;
            int size5 = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size5) {
                    break;
                }
                ahsu ahsu5 = (ahsu) arrayList2.get(i10);
                if (ahsu5.mo37060G() != null) {
                    String a2 = bmwb.m108442a(ahsu5.mo37060G());
                    synchronized (ahyh.f68345b) {
                        if (ahyh.f68345b.get(a2) == null) {
                            ahyh.f68345b.put(a2, ahyh.mo37290a());
                        }
                    }
                    Integer num = (Integer) ahyh.f68345b.get(a2);
                    if (!ahyh.f68344a.mo37287a(((Integer) ahyh.f68345b.get(a2)).intValue())) {
                        Intent className = new Intent().setClassName(ahyh.f68346c, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity");
                        className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", ahvd.m56714b(ahsu5.f67969b).mo73642k());
                        className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_TYPE", "DEVICE_PAIRING");
                        className.setFlags(268435456);
                        ahyh.f68344a.mo37288a(num.intValue(), 2);
                        ahyh.f68346c.startActivity(className);
                        ((buqh) ahgz.m55754a(ahyh.f68346c, buqh.class)).mo72989e(ahyh.f68347d);
                        ((buqh) ahgz.m55754a(ahyh.f68346c, buqh.class)).mo72983a(ahyh.f68347d, TimeUnit.SECONDS.toMillis(cfog.m141285m()));
                        break;
                    }
                }
                i10++;
            }
        } else {
            aidb aidb3 = this.f68607b;
            aict aict = this.f68613h;
            arrayList2.size();
            aiba aiba = ((DiscoveryChimeraService) ahgz.m55754a(aict.f68726a, DiscoveryChimeraService.class)).f80542m;
            if (aiba != null && aiba.mo73078d() && (arrayList2.size() <= 1 || !cfod.f184793a.mo6606a().mo81935x())) {
                aict.m56988a(arrayList2, "Notification not shown because Nearby Activity is in foreground");
                bngx = bngx.m109376e();
                aidb = aidb3;
            } else if (!cfod.f184793a.mo6606a().mo81893O()) {
                aidb = aidb3;
                aict.m56988a(arrayList2, "Notification disabled by configuration");
                bngx = bngx.m109376e();
            } else if (burl.m120292a() || cfod.m141147g()) {
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                int size6 = arrayList2.size();
                int i11 = 0;
                while (i11 < size6) {
                    aidb aidb4 = aidb3;
                    Object obj2 = obj;
                    ahsu ahsu6 = (ahsu) arrayList2.get(i11);
                    if (aict.f68729d.mo37332b() || ahsu6.mo37080f()) {
                        arrayList4.add(ahsu6);
                    } else {
                        ahsu6.mo37066a(3, "Notification temporarily disabled because recently dismissed");
                    }
                    i11++;
                    obj = obj2;
                    aidb3 = aidb4;
                    i9 = 3;
                    i2 = 4;
                    i3 = 1;
                }
                arrayList2.size();
                arrayList4.size();
                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                int size7 = arrayList4.size();
                int i12 = 0;
                while (i12 < size7) {
                    aidb aidb5 = aidb3;
                    ahsu ahsu7 = (ahsu) arrayList4.get(i12);
                    bzbk bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
                    int J = ahsu7.mo37063J();
                    int i13 = J - 1;
                    if (J != 0) {
                        if (i13 == 1) {
                            arrayList5.add(ahsu7);
                        } else if (i13 == 2) {
                            ahsu7.mo37066a(3, "Notification muted by user");
                        } else if (i13 != 3) {
                            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                            int J2 = ahsu7.mo37063J();
                            int i14 = J2 - 1;
                            if (J2 != 0) {
                                bnsl.mo68413a("Unknown state=%d for item %s", i14, (Object) ahsu7);
                                ahsu7.mo37066a(3, "Notification temporarily disabled");
                            } else {
                                throw null;
                            }
                        } else {
                            ahsu7.mo37066a(3, "Notification temporarily disabled");
                        }
                        i12++;
                        i2 = 4;
                        aidb3 = aidb5;
                        i9 = 3;
                        i3 = 1;
                    } else {
                        throw null;
                    }
                }
                arrayList4.size();
                arrayList5.size();
                ArrayList arrayList6 = new ArrayList();
                int size8 = arrayList5.size();
                int i15 = 0;
                while (i15 < size8) {
                    aidb aidb6 = aidb3;
                    ahsu ahsu8 = (ahsu) arrayList5.get(i15);
                    if (ahsu8.mo37080f()) {
                        arrayList6.add(ahsu8);
                    }
                    i15++;
                    i9 = 3;
                    i2 = 4;
                    aidb3 = aidb6;
                    i3 = 1;
                }
                ArrayList arrayList7 = new ArrayList(arrayList6.size() + i3);
                if (arrayList6.isEmpty()) {
                    aidb = aidb3;
                } else if (aict.f68728c.mo73041e()) {
                    int size9 = arrayList6.size();
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < size9) {
                        aidb aidb7 = aidb3;
                        if (((ahsu) arrayList6.get(i16)).mo37085j() == bzbk.NEARBY_DEVICE) {
                            i17++;
                        }
                        i16++;
                        i9 = 3;
                        i2 = 4;
                        aidb3 = aidb7;
                    }
                    C1225nr nrVar = new C1225nr();
                    ArrayList arrayList8 = new ArrayList();
                    int i18 = 0;
                    for (int size10 = arrayList6.size(); i18 < size10; size10 = i4) {
                        ahsu ahsu9 = (ahsu) arrayList6.get(i18);
                        if (ahsu9.mo37085j() == bzbk.NEARBY_DEVICE || !nrVar.contains(ahsu9)) {
                            int ordinal = ahsu9.mo37085j().ordinal();
                            if (ordinal == i9) {
                                aidb2 = aidb3;
                                i4 = size10;
                                aicy aicy = new aicy();
                                aicy.f68744a = "cc_com.google.android.apps.chromecast.app";
                                aicy.f68745b = "cc_com.google.android.apps.chromecast.app";
                                aicy.f68746c = aict.mo37406a("Chromecast");
                                aicy.f68747d = aict.mo37407a("Google Home", "com.google.android.apps.chromecast.app");
                                aicy.f68749f = aict.m56987a(aict.f68726a);
                                aicy.f68751h = aict.f68727b.mo37413a("cc_com.google.android.apps.chromecast.app", aidc.m57025a("DEVICES_REBRANDED"));
                                aicy.f68752i = aict.f68727b.mo37418b("cc_com.google.android.apps.chromecast.app", aidc.m57025a("DEVICES_REBRANDED"));
                                aicy.f68753j = true;
                                aicy.f68754k = "DEVICES_REBRANDED";
                                aicy.mo37424b();
                                aicz2 = aicy.mo37423a();
                            } else if (ordinal == i2) {
                                aidb2 = aidb3;
                                i4 = size10;
                                aicy aicy2 = new aicy();
                                aicy2.f68744a = "wear_com.google.android.wearable.app";
                                aicy2.f68745b = "wear_com.google.android.wearable.app";
                                aicy2.f68746c = aict.mo37406a("Wear OS");
                                aicy2.f68747d = aict.mo37407a("Wear OS", "com.google.android.wearable.app");
                                aicy2.f68749f = aict.m56987a(aict.f68726a);
                                aicy2.f68751h = aict.f68727b.mo37413a("wear_com.google.android.wearable.app", aidc.m57025a("DEVICES_REBRANDED"));
                                aicy2.f68752i = aict.f68727b.mo37418b("wear_com.google.android.wearable.app", aidc.m57025a("DEVICES_REBRANDED"));
                                aicy2.f68753j = true;
                                aicy2.f68754k = "DEVICES_REBRANDED";
                                aicy2.mo37424b();
                                aicz2 = aicy2.mo37423a();
                            } else if (ordinal == 5) {
                                byzm s = ahsu9.mo37094s();
                                bzbk j = ahsu9.mo37085j();
                                int a3 = aibn.m56966a(s);
                                if (!(a3 == 400 || a3 == 200 || a3 == 300 || a3 == 100 || a3 > 300 || a3 > 200)) {
                                    ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("Getting priority for item with unknown priority, defaulting to MIN priority");
                                }
                                Integer.valueOf(a3).intValue();
                                int a4 = aibn.m56966a(s);
                                int ordinal2 = j.ordinal();
                                if (ordinal2 == 3 || ordinal2 == 4 || ordinal2 == 5) {
                                    str = a4 >= 400 ? "DEVICES_WITHIN_REACH_REBRANDED" : a4 != 200 ? "DEVICES_REBRANDED" : "DEVICES_WITH_YOUR_ACCOUNT";
                                } else {
                                    str = null;
                                }
                                String str5 = new aibn(str).f68619a;
                                if (str5.equals("DEVICES_WITHIN_REACH_REBRANDED") && ahsu9.mo37062I() == 3) {
                                    str5 = "DEVICES_REBRANDED";
                                }
                                Context context = aict.f68726a;
                                List d = soz.m35801d(context, context.getPackageName());
                                if (ahsu9.mo37089n() == null) {
                                    i4 = size10;
                                } else if (d.isEmpty()) {
                                    i4 = size10;
                                } else {
                                    if (str5.startsWith("DEVICES_WITH_YOUR_ACCOUNT")) {
                                        str3 = aict.f68726a.getString(C0126R.string.fast_pair_your_device);
                                        str2 = ahsu9.mo37086k();
                                        i4 = size10;
                                    } else {
                                        String k = ahsu9.mo37086k();
                                        i4 = size10;
                                        if (!ahsu9.mo37086k().equals(aict.f68726a.getString(C0126R.string.fast_pair_your_device))) {
                                            str2 = aict.f68726a.getString(C0126R.string.fast_pair_connect_device_description, ((Account) d.get(0)).name);
                                            str3 = k;
                                        } else {
                                            str2 = ahsu9.mo37087l();
                                            str3 = k;
                                        }
                                    }
                                    if (!cfoj.m141532M()) {
                                        nek a5 = nek.m26028a(ahsu9.mo37098v());
                                        if (a5 != null) {
                                            String str6 = a5.f35401d;
                                            if (!TextUtils.isEmpty(str6)) {
                                                aidb2 = aidb3;
                                                if (str6.trim().matches("^LE-[0-9]{4}")) {
                                                    str4 = str6.substring(3, 7);
                                                    if (str4 != null) {
                                                        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPair: device serial number=%s, item=%s", str4, ahsu9);
                                                        aicy aicy3 = new aicy();
                                                        aicy3.f68744a = ahsu9.mo37084i();
                                                        aicy3.f68745b = ahsu9.mo37084i();
                                                        aicy3.f68746c = str3;
                                                        aicy3.f68747d = str2;
                                                        aicy3.f68748e = str4;
                                                        aicy3.f68749f = aict.m56987a(aict.f68726a);
                                                        aicy3.f68750g = ahsu9.mo37054A();
                                                        aicy3.f68751h = aict.f68727b.mo37413a(ahsu9.mo37084i(), aidc.m57025a(str5));
                                                        aicy3.f68752i = aict.f68727b.mo37418b(ahsu9.mo37084i(), aidc.m57025a(str5));
                                                        aicy3.f68753j = ahsu9.mo37062I() == 3;
                                                        aicy3.f68754k = str5;
                                                        aicy3.mo37424b();
                                                        aicy3.f68755l = ahsu9.mo37089n() == null && !d.isEmpty();
                                                        aicy3.f68756m = ahsu9.mo37092q();
                                                        aicz2 = aicy3.mo37423a();
                                                        if (i17 > 1) {
                                                            aicz2.f68772o = "DEVICES_REBRANDED";
                                                        }
                                                    }
                                                }
                                                str4 = null;
                                                if (str4 != null) {
                                                }
                                            }
                                        }
                                        aidb2 = aidb3;
                                        str4 = null;
                                        if (str4 != null) {
                                        }
                                    } else {
                                        aidb2 = aidb3;
                                    }
                                    str4 = null;
                                    aicy aicy32 = new aicy();
                                    aicy32.f68744a = ahsu9.mo37084i();
                                    aicy32.f68745b = ahsu9.mo37084i();
                                    aicy32.f68746c = str3;
                                    aicy32.f68747d = str2;
                                    aicy32.f68748e = str4;
                                    aicy32.f68749f = aict.m56987a(aict.f68726a);
                                    aicy32.f68750g = ahsu9.mo37054A();
                                    aicy32.f68751h = aict.f68727b.mo37413a(ahsu9.mo37084i(), aidc.m57025a(str5));
                                    aicy32.f68752i = aict.f68727b.mo37418b(ahsu9.mo37084i(), aidc.m57025a(str5));
                                    aicy32.f68753j = ahsu9.mo37062I() == 3;
                                    aicy32.f68754k = str5;
                                    aicy32.mo37424b();
                                    aicy32.f68755l = ahsu9.mo37089n() == null && !d.isEmpty();
                                    aicy32.f68756m = ahsu9.mo37092q();
                                    aicz2 = aicy32.mo37423a();
                                    if (i17 > 1) {
                                    }
                                }
                                str3 = ahsu9.mo37086k();
                                if (TextUtils.isEmpty(ahsu9.mo37087l())) {
                                    str2 = aict.f68726a.getString(C0126R.string.common_open);
                                } else {
                                    str2 = ahsu9.mo37087l();
                                }
                                if (!cfoj.m141532M()) {
                                }
                                str4 = null;
                                aicy aicy322 = new aicy();
                                aicy322.f68744a = ahsu9.mo37084i();
                                aicy322.f68745b = ahsu9.mo37084i();
                                aicy322.f68746c = str3;
                                aicy322.f68747d = str2;
                                aicy322.f68748e = str4;
                                aicy322.f68749f = aict.m56987a(aict.f68726a);
                                aicy322.f68750g = ahsu9.mo37054A();
                                aicy322.f68751h = aict.f68727b.mo37413a(ahsu9.mo37084i(), aidc.m57025a(str5));
                                aicy322.f68752i = aict.f68727b.mo37418b(ahsu9.mo37084i(), aidc.m57025a(str5));
                                aicy322.f68753j = ahsu9.mo37062I() == 3;
                                aicy322.f68754k = str5;
                                aicy322.mo37424b();
                                aicy322.f68755l = ahsu9.mo37089n() == null && !d.isEmpty();
                                aicy322.f68756m = ahsu9.mo37092q();
                                aicz2 = aicy322.mo37423a();
                                if (i17 > 1) {
                                }
                            } else {
                                String valueOf = String.valueOf(ahsu9);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                                sb.append("Unexpected type for device item %s");
                                sb.append(valueOf);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            arrayList8.add(aicz2);
                        } else {
                            aidb2 = aidb3;
                            i4 = size10;
                        }
                        nrVar.add(ahsu9);
                        i18++;
                        i9 = 3;
                        i2 = 4;
                        aidb3 = aidb2;
                    }
                    aidb = aidb3;
                    if (aidc.m57026a()) {
                        ArrayList arrayList9 = new ArrayList();
                        int size11 = arrayList8.size();
                        for (int i19 = 0; i19 < size11; i19++) {
                            aicz aicz3 = (aicz) arrayList8.get(i19);
                            String a6 = aict.f68730e.mo37428a(aicz3.f68772o, aict.f68726a);
                            if (a6 != null) {
                                aicz3.f68772o = a6;
                                arrayList9.add(aicz3);
                            }
                        }
                        arrayList8 = arrayList9;
                    }
                    ArrayList arrayList10 = new ArrayList();
                    int size12 = arrayList8.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size12) {
                            aicz = null;
                            break;
                        }
                        aicz aicz4 = (aicz) arrayList8.get(i20);
                        i20++;
                        if (aicz4.f68772o.equals("DEVICES_WITHIN_REACH_REBRANDED")) {
                            arrayList10.add(aicz4);
                            aicz = aicz4;
                            break;
                        }
                    }
                    if (aicz != null) {
                        arrayList8.remove(aicz);
                        Iterator it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            if (((ahsu) it2.next()).mo37084i().equals(aicz.f68759b)) {
                                it2.remove();
                            }
                        }
                    }
                    if (arrayList8.size() == 1) {
                        arrayList10.add((aicz) arrayList8.get(0));
                    } else if (arrayList8.size() > 1) {
                        arrayList10.addAll(arrayList8);
                    }
                    arrayList7.addAll(arrayList10);
                } else {
                    aidb = aidb3;
                    aict.m56988a(arrayList6, "Device notification hidden in settings");
                }
                bngx = bngx.m109368a((Collection) arrayList7);
            } else {
                aict.m56988a(arrayList2, "Notification not shown because bluetooth is disabled.");
                bngx = bngx.m109376e();
                aidb = aidb3;
            }
            aidb.mo37431a(bngx);
        }
        if (!arrayList2.isEmpty()) {
            aibm = this;
            aibm.f68608c.mo72989e(aibm.f68615j);
            aibm.f68608c.mo72983a(aibm.f68615j, cfod.m141151k() + 1);
        } else {
            aibm = this;
        }
        if (!cfoj.m141550ae()) {
            DiscoveryChimeraService discoveryChimeraService = (DiscoveryChimeraService) ahgz.m55754a(aibm.f68610e, DiscoveryChimeraService.class);
            ArrayList arrayList11 = new ArrayList(arrayList2.size());
            int size13 = arrayList2.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i21 = 0; i21 < size13; i21++) {
                ahsu ahsu10 = (ahsu) arrayList2.get(i21);
                bzbk bzbk2 = bzbk.NEARBY_TYPE_UNKNOWN;
                int ordinal3 = ahsu10.mo37085j().ordinal();
                if (ordinal3 != 3) {
                    if (ordinal3 != 4) {
                        if (ahsu10.mo37063J() != 4) {
                            if (ahsu10.mo37085j() == bzbk.NEARBY_DEVICE) {
                                arrayList11.add(ahsu10.mo37064a(aibm.f68612g.mo37412a(ahsu10.mo37084i())));
                            } else {
                                arrayList11.add(ahsu10.mo37064a(DiscoveryChimeraService.m67336a(aibm.f68612g.f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_DISCOVERY_LIST_ACTIVITY_ITEM_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", ahsu10.mo37084i())));
                            }
                        }
                    } else if (!z3) {
                        arrayList11.add(new DiscoveryListItem("wear_com.google.android.wearable.app", aibm.f68610e.getString(C0126R.string.devices_list_view_title, "Wear OS"), null, "Wear OS", "com.google.android.wearable.app", -1.0f, ahsu10.mo37081g(), bzbk.NEARBY_WEAR, aibm.m56959a("wear_com.google.android.wearable.app"), null, true));
                        z3 = true;
                    }
                } else if (!z2) {
                    arrayList11.add(new DiscoveryListItem("cc_com.google.android.apps.chromecast.app", aibm.f68610e.getString(C0126R.string.devices_list_view_title, "Chromecast"), null, "Google Home", "com.google.android.apps.chromecast.app", -1.0f, ahsu10.mo37081g(), bzbk.NEARBY_CHROMECAST, aibm.m56959a("cc_com.google.android.apps.chromecast.app"), null, true));
                    z2 = true;
                }
            }
            discoveryChimeraService.mo44201a(i, arrayList11);
        }
    }

    /* renamed from: a */
    public final void mo37370a(Message message) {
        char c;
        bzbk bzbk;
        ahsu e;
        this.f68608c.mo72984b();
        ahst ahst = this.f68606a;
        String str = message.f80678d;
        if (str.hashCode() == -1002207107 && str.equals("com.google.nearby.discoverer")) {
            c = 0;
        } else {
            c = 65535;
        }
        byzi byzi = null;
        if (c == 0) {
            try {
                byzi byzi2 = (byzi) bxvk.m124016a(byzi.f169083x, message.f80676b, bxus.m123744c());
                bzbk a = bzbk.m125615a(byzi2.f169086b);
                if (a == null) {
                    a = bzbk.NEARBY_TYPE_UNKNOWN;
                }
                if (a == bzbk.NEARBY_DEVICE && (e = ahst.mo37052e(byzi2.f169087c)) != null) {
                    srn srn = ahsd.f67925a;
                    e.mo37067a(ahst.f67959a.mo20505a());
                }
                byzi = byzi2;
            } catch (Exception e2) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68420a("Could not parse NearbyItem from Nearby Message: %s", message);
            }
        }
        if (byzi != null) {
            bzbk = bzbk.m125615a(byzi.f169086b);
            if (bzbk == null) {
                bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
            }
        } else {
            bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
        }
        mo37368a(0, bzbk);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x068c  */
    /* renamed from: a */
    public final void mo37371a(Message message, String str, BleSignalImpl bleSignalImpl, byte[] bArr) {
        char c;
        byzi byzi;
        bzbk bzbk;
        String str2;
        Object obj;
        List list;
        Float f;
        Long l;
        Message message2 = message;
        String str3 = str;
        BleSignalImpl bleSignalImpl2 = bleSignalImpl;
        this.f68608c.mo72984b();
        ahst ahst = this.f68606a;
        String str4 = message2.f80678d;
        int hashCode = str4.hashCode();
        int i = 1;
        if (hashCode != -1002207107) {
            if (hashCode == 349494500 && str4.equals("__reserved_namespace")) {
                c = 0;
                if (c != 0) {
                    if (c != 1) {
                        ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("Unexpected message namespace: %s", message2.f80678d);
                        byzi = null;
                    } else {
                        try {
                            byzi byzi2 = (byzi) bxvk.m124016a(byzi.f169083x, message2.f80676b, bxus.m123744c());
                            byzj byzj = byzi2.f169098o;
                            if (byzj == null) {
                                byzj = byzj.f169108b;
                            }
                            if (byzj.f169110a.size() > 0) {
                                byzj byzj2 = byzi2.f169098o;
                                if (byzj2 == null) {
                                    byzj2 = byzj.f169108b;
                                }
                                for (String str5 : byzj2.f169110a) {
                                    ((bnsl) ahsd.f67925a.mo68388c()).mo68425a("Disabled by server: %s, %s, %s", byzi2.f169103t, byzi2.f169087c, str5);
                                }
                            }
                            int i2 = byzi2.f169085a;
                            if ((i2 & 2) == 0) {
                                ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Server returns null ID: %s", byzi2);
                            } else if ((i2 & 1048576) != 0 || !cfod.f184793a.mo6606a().mo81920i()) {
                                bzbk a = bzbk.m125615a(byzi2.f169086b);
                                if (a == null) {
                                    a = bzbk.NEARBY_TYPE_UNKNOWN;
                                }
                                if (ahsu.m56522b(a)) {
                                    aiaa aiaa = (aiaa) ahst.f67960b.mo36459a(byzi2.f169087c);
                                    long a2 = ahst.f67959a.mo20505a();
                                    if (aiaa == null) {
                                        aiaa a3 = ahsu.m56514a();
                                        bxvd bxvd = (bxvd) a3.mo74142c(5);
                                        bxvd.mo73625a((bxvk) a3);
                                        String str6 = byzi2.f169087c;
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        aiaa aiaa2 = (aiaa) bxvd.f164949b;
                                        aiaa aiaa3 = aiaa.f68501K;
                                        str6.getClass();
                                        int i3 = aiaa2.f68513a | 1;
                                        aiaa2.f68513a = i3;
                                        aiaa2.f68515c = str6;
                                        aiaa2.f68513a = i3 | 512;
                                        aiaa2.f68524l = a2;
                                        bzbk a4 = bzbk.m125615a(byzi2.f169086b);
                                        if (a4 == null) {
                                            a4 = bzbk.NEARBY_TYPE_UNKNOWN;
                                        }
                                        if (a4 == bzbk.NEARBY_DEVICE) {
                                            if (!ahst.f67966h) {
                                                srn srn = ahsd.f67925a;
                                                if (bxvd.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd.f164950c = false;
                                                }
                                                aiaa aiaa4 = (aiaa) bxvd.f164949b;
                                                aiaa4.f68525m = 3;
                                                aiaa4.f68513a |= 1024;
                                            }
                                        }
                                        aiaa = (aiaa) bxvd.mo74062i();
                                    }
                                    bxvd bxvd2 = (bxvd) aiaa.mo74142c(5);
                                    bxvd2.mo73625a((bxvk) aiaa);
                                    bzbk a5 = bzbk.m125615a(byzi2.f169086b);
                                    if (a5 == null) {
                                        a5 = bzbk.NEARBY_TYPE_UNKNOWN;
                                    }
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    aiaa aiaa5 = (aiaa) bxvd2.f164949b;
                                    aiaa5.f68516d = a5.f169257h;
                                    aiaa5.f68513a |= 2;
                                    if (byzi2.f169095k.size() != 0) {
                                        list = ahsf.m56459a(Collections.unmodifiableList(((aiaa) bxvd2.f164949b).f68505C), byzi2.f169095k);
                                    } else {
                                        if ((byzi2.f169085a & 4096) == 0) {
                                            ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("No relevances for item: %s", byzi2);
                                        }
                                        list = ahsf.m56460a(101);
                                    }
                                    if (cfod.f184793a.mo6606a().mo81923l()) {
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        ((aiaa) bxvd2.f164949b).f68505C = bxvk.m124030de();
                                    }
                                    bxvd2.mo74023ac(list);
                                    String str7 = byzi2.f169096l;
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    aiaa aiaa6 = (aiaa) bxvd2.f164949b;
                                    str7.getClass();
                                    int i4 = aiaa6.f68513a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    aiaa6.f68513a = i4;
                                    aiaa6.f68530r = str7;
                                    String str8 = byzi2.f169092h;
                                    str8.getClass();
                                    aiaa6.f68513a = i4 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                    aiaa6.f68534v = str8;
                                    if ((byzi2.f169085a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                                        f = Float.valueOf(byzi2.f169101r);
                                    } else {
                                        f = null;
                                    }
                                    if (f == null) {
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa7 = (aiaa) bxvd2.f164949b;
                                        aiaa7.f68513a &= -1048577;
                                        aiaa7.f68535w = 0.0f;
                                    } else {
                                        float floatValue = f.floatValue();
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa8 = (aiaa) bxvd2.f164949b;
                                        aiaa8.f68513a |= 1048576;
                                        aiaa8.f68535w = floatValue;
                                    }
                                    String str9 = byzi2.f169102s;
                                    aiaa aiaa9 = (aiaa) bxvd2.f164949b;
                                    str9.getClass();
                                    int i5 = aiaa9.f68513a | 2097152;
                                    aiaa9.f68513a = i5;
                                    aiaa9.f68536x = str9;
                                    String str10 = byzi2.f169093i;
                                    str10.getClass();
                                    int i6 = i5 | 8;
                                    aiaa9.f68513a = i6;
                                    aiaa9.f68518f = str10;
                                    String str11 = byzi2.f169089e;
                                    str11.getClass();
                                    int i7 = i6 | 64;
                                    aiaa9.f68513a = i7;
                                    aiaa9.f68521i = str11;
                                    String str12 = byzi2.f169090f;
                                    str12.getClass();
                                    int i8 = i7 | 128;
                                    aiaa9.f68513a = i8;
                                    aiaa9.f68522j = str12;
                                    String str13 = byzi2.f169088d;
                                    str13.getClass();
                                    aiaa9.f68513a = i8 | 32;
                                    aiaa9.f68520h = str13;
                                    int a6 = bzbo.m125621a(byzi2.f169094j);
                                    if (a6 != 0) {
                                        i = a6;
                                    }
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    aiaa aiaa10 = (aiaa) bxvd2.f164949b;
                                    aiaa10.f68526n = i - 1;
                                    int i9 = aiaa10.f68513a | 2048;
                                    aiaa10.f68513a = i9;
                                    int i10 = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    aiaa10.f68513a = i10;
                                    aiaa10.f68523k = a2;
                                    if ((byzi2.f169085a & 2048) != 0) {
                                        String str14 = byzi2.f169097n;
                                        str14.getClass();
                                        i10 |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                        aiaa10.f68513a = i10;
                                        aiaa10.f68531s = str14;
                                    }
                                    if ((byzi2.f169085a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                                        String str15 = byzi2.f169103t;
                                        str15.getClass();
                                        aiaa10.f68513a = i10 | 4194304;
                                        aiaa10.f68537y = str15;
                                    }
                                    if ((byzi2.f169085a & 8192) != 0) {
                                        l = Long.valueOf(byzi2.f169099p);
                                    } else {
                                        l = null;
                                    }
                                    if (l == null) {
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa11 = (aiaa) bxvd2.f164949b;
                                        aiaa11.f68513a &= -131073;
                                        aiaa11.f68532t = 0;
                                    } else {
                                        long longValue = l.longValue();
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa12 = (aiaa) bxvd2.f164949b;
                                        aiaa12.f68513a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                        aiaa12.f68532t = longValue;
                                    }
                                    if ((byzi2.f169085a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                        bzar a7 = bzar.m125589a(byzi2.f169100q);
                                        if (a7 == null) {
                                            a7 = bzar.DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
                                        }
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa13 = (aiaa) bxvd2.f164949b;
                                        aiaa13.f68533u = a7.f169225d;
                                        aiaa13.f68513a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                    }
                                    bxtx bxtx = byzi2.f169091g;
                                    aiaa aiaa14 = (aiaa) bxvd2.f164949b;
                                    bxtx.getClass();
                                    int i11 = aiaa14.f68513a | 8388608;
                                    aiaa14.f68513a = i11;
                                    aiaa14.f68538z = bxtx;
                                    String str16 = byzi2.f169104u;
                                    str16.getClass();
                                    int i12 = i11 | 536870912;
                                    aiaa14.f68513a = i12;
                                    aiaa14.f68509G = str16;
                                    if ((byzi2.f169085a & 2097152) != 0) {
                                        bxtx bxtx2 = byzi2.f169105v;
                                        bxtx2.getClass();
                                        aiaa14.f68513a = i12 | JGCastService.FLAG_PRIVATE_DISPLAY;
                                        aiaa14.f68510H = bxtx2;
                                    }
                                    byzb byzb = byzi2.f169106w;
                                    if (byzb == null) {
                                        byzb = byzb.f169045j;
                                    }
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    aiaa aiaa15 = (aiaa) bxvd2.f164949b;
                                    byzb.getClass();
                                    aiaa15.f68511I = byzb;
                                    aiaa15.f68513a |= Integer.MIN_VALUE;
                                    byzj byzj3 = byzi2.f169098o;
                                    if (byzj3 == null) {
                                        byzj3 = byzj.f169108b;
                                    }
                                    if (byzj3.f169110a.size() <= 0) {
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa16 = (aiaa) bxvd2.f164949b;
                                        aiaa16.f68513a &= -16777217;
                                        aiaa16.f68503A = aiaa.f68501K.f68503A;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa17 = (aiaa) bxvd2.f164949b;
                                        aiaa17.f68504B = 0;
                                        aiaa17.f68513a |= 33554432;
                                    } else {
                                        byzj byzj4 = byzi2.f169098o;
                                        if (byzj4 == null) {
                                            byzj4 = byzj.f169108b;
                                        }
                                        String str17 = (String) byzj4.f169110a.get(0);
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa18 = (aiaa) bxvd2.f164949b;
                                        str17.getClass();
                                        int i13 = aiaa18.f68513a | 16777216;
                                        aiaa18.f68513a = i13;
                                        aiaa18.f68503A = str17;
                                        aiaa18.f68504B = 4;
                                        aiaa18.f68513a = 33554432 | i13;
                                    }
                                    if (str3 != null) {
                                        aiaa aiaa19 = (aiaa) bxvd2.f164949b;
                                        str.getClass();
                                        aiaa19.f68513a |= 4;
                                        aiaa19.f68517e = str3;
                                    }
                                    if (bArr != null) {
                                        bxtx a8 = bxtx.m123261a(bArr);
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        aiaa aiaa20 = (aiaa) bxvd2.f164949b;
                                        a8.getClass();
                                        aiaa20.f68513a |= 268435456;
                                        aiaa20.f68508F = a8;
                                    }
                                    if (bleSignalImpl2 != null) {
                                        int i14 = bleSignalImpl2.f80720b;
                                        aiaa aiaa21 = (aiaa) bxvd2.f164949b;
                                        int i15 = aiaa21.f68513a | 8192;
                                        aiaa21.f68513a = i15;
                                        aiaa21.f68528p = i14;
                                        int i16 = bleSignalImpl2.f80721c;
                                        if (i16 != Integer.MIN_VALUE) {
                                            aiaa21.f68513a = i15 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                            aiaa21.f68529q = i16;
                                            nhe.m26254b(i14, i16);
                                        }
                                    }
                                    ahst.f67960b.mo36470e((aiaa) bxvd2.mo74062i());
                                    srn srn2 = ahsd.f67925a;
                                    ((aiaa) bxvd2.f164949b).f68505C.size();
                                } else {
                                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                                    bzbk a9 = bzbk.m125615a(byzi2.f169086b);
                                    if (a9 == null) {
                                        a9 = bzbk.NEARBY_TYPE_UNKNOWN;
                                    }
                                    bnsl.mo68409a("Item skipped because type %s disabled", a9.f169257h);
                                }
                            } else if ((byzi2.f169085a & 4096) == 0) {
                                ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Server returns null entity ID: %s", byzi2);
                            }
                            byzi = byzi2;
                        } catch (Exception e) {
                            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68420a("Could not parse NearbyItem from Nearby Message: %s", message2);
                            byzi = null;
                        }
                    }
                } else if (!message2.f80677c.equals("__ble_record")) {
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("Unknown message type: %s", message2.f80677c);
                    byzi = null;
                } else {
                    try {
                        long a10 = ahst.f67959a.mo20505a();
                        bxvd da = aiac.f68544k.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aiac aiac = (aiac) da.f164949b;
                        int i17 = aiac.f68546a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        aiac.f68546a = i17;
                        aiac.f68555j = a10;
                        aiac.f68546a = i17 | 128;
                        aiac.f68554i = a10;
                        if (str3 != null) {
                            str2 = str3.toUpperCase(Locale.US);
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac2 = (aiac) da.f164949b;
                            str2.getClass();
                            aiac2.f68546a |= 4;
                            aiac2.f68549d = str2;
                        }
                        if (bleSignalImpl2 != null) {
                            int i18 = bleSignalImpl2.f80720b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac3 = (aiac) da.f164949b;
                            int i19 = aiac3.f68546a | 8;
                            aiac3.f68546a = i19;
                            aiac3.f68550e = i18;
                            int i20 = bleSignalImpl2.f80721c;
                            if (i20 != Integer.MIN_VALUE) {
                                aiac3.f68546a = i19 | 16;
                                aiac3.f68551f = i20;
                            }
                        }
                        nek a11 = nek.m26028a(message2.f80676b);
                        ahta ahta = new ahta();
                        if (!ahsy.m56585e(a11)) {
                            byte[] a12 = a11.mo20525a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
                            if (a12 != null && a12.length == 3 && a12[2] == 0) {
                                if (ahta.f67974a == null) {
                                    ahta.f67974a = new ahtb();
                                }
                                obj = ahta.f67974a;
                            } else {
                                obj = null;
                            }
                        } else {
                            if (ahta.f67975b == null) {
                                ahta.f67975b = new ahsy();
                            }
                            obj = ahta.f67975b;
                        }
                        if (obj instanceof ahsy) {
                            String valueOf = String.valueOf(ahst.m56487b(a11.f35401d, str3));
                            String str18 = valueOf.length() == 0 ? new String("cc_") : "cc_".concat(valueOf);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac4 = (aiac) da.f164949b;
                            str18.getClass();
                            aiac4.f68546a |= 1;
                            aiac4.f68547b = str18;
                            bzbk bzbk2 = bzbk.NEARBY_CHROMECAST;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac5 = (aiac) da.f164949b;
                            aiac5.f68548c = bzbk2.f169257h;
                            aiac5.f68546a |= 2;
                            String f2 = ahsy.m56586f(a11);
                            if (f2 != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                aiac aiac6 = (aiac) da.f164949b;
                                f2.getClass();
                                aiac6.f68546a |= 32;
                                aiac6.f68552g = f2;
                            }
                            int g = ahsy.m56587g(a11);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac7 = (aiac) da.f164949b;
                            aiac7.f68546a |= 64;
                            aiac7.f68553h = g;
                        } else if (obj instanceof ahtb) {
                            String valueOf2 = String.valueOf(ahst.m56487b(a11.f35401d, str3));
                            String str19 = valueOf2.length() == 0 ? new String("wear_") : "wear_".concat(valueOf2);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac8 = (aiac) da.f164949b;
                            str19.getClass();
                            aiac8.f68546a |= 1;
                            aiac8.f68547b = str19;
                            bzbk bzbk3 = bzbk.NEARBY_WEAR;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aiac aiac9 = (aiac) da.f164949b;
                            aiac9.f68548c = bzbk3.f169257h;
                            aiac9.f68546a |= 2;
                        } else {
                            throw new IllegalArgumentException(String.format("Cannot parse BLE_SCAN_RECORD message: %s, ble record: %s, decoder: %s", message2, a11, obj));
                        }
                        aiac aiac10 = (aiac) da.mo74062i();
                        bxvd bxvd3 = (bxvd) aiac10.mo74142c(5);
                        bxvd3.mo73625a((bxvk) aiac10);
                        ahst.mo37039a(bxvd3);
                        byzi = null;
                    } catch (Exception e2) {
                        srn srn3 = ahsd.f67925a;
                        byzi = null;
                    }
                }
                if (byzi != null) {
                    bzbk = bzbk.m125615a(byzi.f169086b);
                    if (bzbk == null) {
                        bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
                    }
                } else {
                    bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
                }
                mo37368a(0, bzbk);
            }
        } else if (str4.equals("com.google.nearby.discoverer")) {
            c = 1;
            if (c != 0) {
            }
            if (byzi != null) {
            }
            mo37368a(0, bzbk);
        }
        c = 65535;
        if (c != 0) {
        }
        if (byzi != null) {
        }
        mo37368a(0, bzbk);
    }
}
