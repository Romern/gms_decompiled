package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.projection.CarProjectionValidatorImpl$1;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: oen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oen implements oei {

    /* renamed from: a */
    public static final bnsn f37371a = odk.m28481a("CAR.VALIDATOR");

    /* renamed from: b */
    public static final bmyx f37372b = bmyx.m108640a(',').mo66917a().mo66920b();

    /* renamed from: i */
    private static final bnic f37373i = bnic.m109489a("com.google.android.gms");

    /* renamed from: p */
    private static oen f37374p;

    /* renamed from: q */
    private static int f37375q;

    /* renamed from: c */
    public volatile Map f37376c;

    /* renamed from: d */
    public volatile Map f37377d;

    /* renamed from: e */
    public volatile Set f37378e;

    /* renamed from: f */
    public volatile boolean f37379f;

    /* renamed from: g */
    public volatile boolean f37380g;

    /* renamed from: h */
    public final CountDownLatch f37381h = new CountDownLatch(1);

    /* renamed from: j */
    private final Context f37382j;

    /* renamed from: k */
    private final rfz f37383k;

    /* renamed from: l */
    private WeakReference f37384l = new WeakReference(null);

    /* renamed from: m */
    private final C1245ok f37385m = new C1245ok();

    /* renamed from: n */
    private final Set f37386n = new HashSet();

    /* renamed from: o */
    private final BroadcastReceiver f37387o = new CarProjectionValidatorImpl$1(this, "car");

    /* renamed from: r */
    private final oej f37388r = new oej(this);

    public oen(Context context, rfz rfz) {
        this.f37382j = context;
        this.f37383k = rfz;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        this.f37382j.registerReceiver(this.f37387o, intentFilter);
    }

    /* renamed from: a */
    private final List m28582a(CarInfo carInfo, CarUiInfo carUiInfo, Intent intent, nhg nhg, boolean z) {
        List<ResolveInfo> queryIntentServices = this.f37382j.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null) {
            return new ArrayList();
        }
        queryIntentServices.isEmpty();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (resolveInfo.serviceInfo != null) {
                if (!resolveInfo.serviceInfo.enabled) {
                    bnsi d = f37371a.mo68390d();
                    d.mo68432a("oen", "a", 383, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("Skipping disabled service %s", resolveInfo.serviceInfo.name);
                    if (ccsn.m131443b()) {
                        m28586a(bpec.SERVICE_DISABLED, resolveInfo.serviceInfo.packageName);
                    }
                }
            } else if (!resolveInfo.activityInfo.enabled) {
                bnsi d2 = f37371a.mo68390d();
                d2.mo68432a("oen", "a", 391, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68420a("Skipping disabled activity %s", resolveInfo.activityInfo.name);
                if (ccsn.m131443b()) {
                    m28586a(bpec.ACTIVITY_DISABLED, resolveInfo.activityInfo.packageName);
                }
            } else if ((resolveInfo.activityInfo.flags & 64) != 0) {
                bnsi d3 = f37371a.mo68390d();
                d3.mo68432a("oen", "a", 398, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68420a("Skipping reparentable activity %s", resolveInfo.activityInfo.name);
                if (ccsn.m131443b()) {
                    m28586a(bpec.ACTIVITY_NOT_REPARENTABLE, resolveInfo.activityInfo.packageName);
                }
            }
            String str = resolveInfo.serviceInfo == null ? resolveInfo.activityInfo.packageName : resolveInfo.serviceInfo.packageName;
            hashSet.add(str);
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            ((List) hashMap.get(str)).add(resolveInfo);
        }
        int size = hashSet.size();
        String[] strArr = new String[size];
        hashSet.toArray(strArr);
        if (size != 0) {
            ArrayList arrayList = new ArrayList(size);
            for (int i = size - 1; i >= 0; i--) {
                String str2 = strArr[i];
                if (m28587a(carInfo, carUiInfo, str2, nhg, z, true)) {
                    arrayList.add(str2);
                }
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        int length = strArr.length;
        ArrayList arrayList2 = new ArrayList(length);
        for (int i2 = length - 1; i2 >= 0; i2--) {
            List list = (List) hashMap.get(strArr[i2]);
            if (list != null) {
                arrayList2.addAll(list);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static nhg m28591b(String str) {
        if (!TextUtils.isEmpty(str)) {
            nhg[] values = nhg.values();
            for (int length = values.length - 1; length >= 0; length--) {
                nhg nhg = values[length];
                if (nhg.name().equalsIgnoreCase(str)) {
                    return nhg;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final boolean m28592c(String str) {
        return this.f37383k.mo24610b(str);
    }

    /* renamed from: d */
    private final boolean m28593d(String str) {
        emm emm;
        if (ccsn.m131444c()) {
            npe.m27163b();
        }
        boolean z = false;
        if (!this.f37383k.mo24610b("com.android.vending")) {
            bnsi b = f37371a.mo68387b();
            b.mo68432a("oen", "d", 804, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Play store not google signed");
            return false;
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        oel oel = new oel("car", atomicReference, countDownLatch);
        if (skh.m35531a().mo25690a(this.f37382j, new Intent().setComponent(oeo.f37389a), oel, 1)) {
            try {
                if (countDownLatch.await(5000, TimeUnit.MILLISECONDS)) {
                    IBinder iBinder = (IBinder) atomicReference.get();
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.services.IPlayGearheadService");
                        emm = queryLocalInterface instanceof emm ? (emm) queryLocalInterface : new emm(iBinder);
                    } else {
                        emm = null;
                    }
                    try {
                        z = emm.mo10277a(str).getBoolean("Finsky.IsValid");
                    } catch (RemoteException e) {
                        bnsi b2 = f37371a.mo68387b();
                        b2.mo68437a(e);
                        b2.mo68432a("oen", "d", 847, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b2.mo68405a("Play store died");
                    }
                }
            } catch (InterruptedException e2) {
            }
            skh.m35531a().mo25689a(this.f37382j, oel);
            return z;
        }
        bnsi b3 = f37371a.mo68387b();
        b3.mo68432a("oen", "d", 827, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b3.mo68405a("Failed to bind to play store");
        return false;
    }

    /* renamed from: e */
    private final XmlResourceParser m28594e(String str) {
        ApplicationInfo applicationInfo = this.f37382j.getPackageManager().getApplicationInfo(str, 128);
        int i = 0;
        if (applicationInfo.metaData != null) {
            i = applicationInfo.metaData.getInt("com.google.android.gms.car.application", 0);
        }
        if (i != 0) {
            try {
                return this.f37382j.getPackageManager().getResourcesForApplication(str).getXml(i);
            } catch (Resources.NotFoundException e) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo22066c() {
        ExecutorService b = adzl.f62962b.mo25879b(2);
        b.execute(new oek(this, new ConditionVariable()));
        b.shutdown();
    }

    /* renamed from: b */
    public final List mo22060b(CarInfo carInfo, CarUiInfo carUiInfo, Intent intent) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
        return m28582a(carInfo, carUiInfo, cloneFilter, nhg.PROJECTION, false);
    }

    /* renamed from: b */
    public final void mo22065b() {
        this.f37386n.clear();
    }

    /* renamed from: c */
    public final boolean mo22062c(CarInfo carInfo, CarUiInfo carUiInfo, String str, nhg nhg) {
        return m28587a(carInfo, carUiInfo, str, nhg, false, true);
    }

    /* renamed from: b */
    public final boolean mo22061b(CarInfo carInfo, CarUiInfo carUiInfo, String str, nhg nhg) {
        npe.m27163b();
        return m28587a(carInfo, carUiInfo, str, nhg, true, false);
    }

    /* renamed from: a */
    public static Map m28583a(String str) {
        String str2;
        String str3;
        ArrayMap arrayMap = new ArrayMap();
        if (str != null && !str.isEmpty()) {
            String[] split = str.substring(str.indexOf(124) + 1).split(",");
            for (int length = split.length - 1; length >= 0; length--) {
                String str4 = split[length];
                int indexOf = str4.indexOf(58);
                if (indexOf != -1) {
                    str2 = str4.substring(0, indexOf);
                } else {
                    str2 = str4;
                }
                if (indexOf != -1) {
                    str3 = str4.substring(indexOf + 1);
                } else {
                    str3 = "ALL";
                }
                Set set = (Set) arrayMap.get(str2);
                if (set == null) {
                    set = new HashSet();
                }
                set.add(str3);
                arrayMap.put(str2, set);
            }
        }
        return arrayMap;
    }

    /* renamed from: a */
    public static oen m28584a(Context context) {
        oen oen;
        synchronized (oen.class) {
            if (f37375q == 0) {
                Context applicationContext = context.getApplicationContext();
                oen oen2 = new oen(applicationContext, rfz.m33557a(applicationContext));
                f37374p = oen2;
                oen2.mo22066c();
                synchronized (oen2.f37385m) {
                    oen2.f37385m.clear();
                }
            }
            bmxy.m108581a(f37374p);
            f37375q++;
            oen = f37374p;
        }
        return oen;
    }

    /* renamed from: a */
    public static void m28585a() {
        synchronized (oen.class) {
            int i = f37375q - 1;
            f37375q = i;
            if (i == 0) {
                bmxy.m108581a(f37374p);
                oen oen = f37374p;
                oen.f37382j.unregisterReceiver(oen.f37387o);
                f37374p = null;
            }
        }
    }

    /* renamed from: a */
    private final void m28586a(bpec bpec, String str) {
        niw niw = (niw) this.f37384l.get();
        if (niw != null && niw.mo20863b()) {
            Pair create = Pair.create(bpec, str);
            if (!this.f37386n.contains(create) && this.f37386n.size() < 100) {
                odh a = odi.m28455a(bpcy.CAR_SERVICE, bpeb.CAR_PROJECTION_VALIDATOR, bpea.PACKAGE_DENIED);
                a.f37253f = bmxv.m108566b(bpec);
                if (str != null) {
                    a.f37251d = bmxv.m108566b(str);
                }
                niw.mo20861a((odi) a.mo22019b());
                this.f37386n.add(create);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023e, code lost:
        r4 = p000.oen.f37371a.mo68387b();
        r4.mo68437a(r0);
        r4.mo68432a("oen", "d", 847, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r4.mo68405a("Play store died");
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0253, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0256, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018e, code lost:
        if (r23 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
        m28586a(p000.bpec.f137234m, r3);
        r16 = r5;
        r17 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019f, code lost:
        if (p000.ccsn.m131444c() == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        p000.npe.m27163b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b2, code lost:
        if (r1.f37383k.mo24610b("com.android.vending") != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b4, code lost:
        r0 = p000.oen.f37371a.mo68387b();
        r0.mo68432a("oen", "d", 804, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Play store not google signed");
        r16 = r5;
        r17 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cb, code lost:
        r0 = new java.util.concurrent.atomic.AtomicReference();
        r14 = new java.util.concurrent.CountDownLatch(1);
        r15 = new p000.oel("car", r0, r14);
        r16 = r5;
        r17 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f6, code lost:
        if (p000.skh.m35531a().mo25690a(r1.f37382j, new android.content.Intent().setComponent(p000.oeo.f37389a), r15, 1) != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f8, code lost:
        r0 = p000.oen.f37371a.mo68387b();
        r0.mo68432a("oen", "d", 827, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Failed to bind to play store");
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0212, code lost:
        if (r14.await(5000, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0214, code lost:
        r0 = (android.os.IBinder) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021a, code lost:
        if (r0 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021c, code lost:
        r4 = r0.queryLocalInterface("com.google.android.finsky.services.IPlayGearheadService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        if ((r4 instanceof p000.emm) == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0226, code lost:
        r0 = (p000.emm) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022a, code lost:
        r0 = new p000.emm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0231, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r0 = r0.mo10277a(r3).getBoolean("Finsky.IsValid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0322 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0324 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final boolean m28587a(CarInfo carInfo, CarUiInfo carUiInfo, String str, nhg nhg, boolean z, boolean z2) {
        int packageUid;
        int i;
        String str2;
        bryx bryx;
        String str3;
        bryx bryx2;
        boolean z3;
        oel oel;
        CarInfo carInfo2 = carInfo;
        String str4 = str;
        nhg nhg2 = nhg;
        try {
            this.f37381h.await();
        } catch (InterruptedException e) {
        }
        if (z) {
            StrictMode.noteSlowCall("CarProjectionValidator#isPackageAllowed3p");
        }
        bryx a = bryx.m114908a(str);
        if (str4 == null) {
            bnsi c = f37371a.mo68388c();
            c.mo68432a("oen", "a", 480, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Package DENIED; null package name");
            m28586a(bpec.PACKAGE_NULL, (String) null);
            return false;
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            packageUid = this.f37382j.getPackageManager().getPackageUid(str4, 0);
            i = this.f37382j.getPackageManager().getPackageInfo(str4, 0).versionCode;
            if (m28590a((Set) this.f37376c.get(str4), i)) {
                bnsi c2 = f37371a.mo68388c();
                c2.mo68432a("oen", "a", 511, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68420a("Package DENIED; black listed [%s]", a);
                if (!ccsn.m131443b()) {
                    return false;
                }
                m28586a(bpec.PACKAGE_BLACKLISTED, str4);
                return false;
            } else if (str4.equals("com.android.vending") && m28592c(str4) && nhg2 == nhg.SERVICE) {
                return true;
            } else {
                if (z2) {
                    try {
                        if (!m28588a(str4, nhg2)) {
                            if (nhg2 != nhg.NOTIFICATION) {
                                bnsi c3 = f37371a.mo68388c();
                                c3.mo68432a("oen", "a", 537, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c3.mo68424a("Package DENIED; Uses for %s not defined [%s]", nhg2, str4);
                                if (ccsn.m131443b()) {
                                    m28586a(bpec.PACKAGE_DOES_NOT_DECLARE_USES, str4);
                                }
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        bnsi c4 = f37371a.mo68388c();
                        c4.mo68432a("oen", "a", 545, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c4.mo68420a("Package DENIED; package not found [%s]", a);
                        if (ccsn.m131443b()) {
                            m28586a(bpec.PACKAGE_NOT_FOUND, str4);
                        }
                        return false;
                    }
                }
                if (carInfo2 != null && MfiClient.ACCOUNT_ISSUER_GOOGLE.equals(carInfo2.f29332a) && ("Desktop Head Unit".equals(carInfo2.f29333b) || "Emulator".equals(carInfo2.f29333b))) {
                    return true;
                }
                if (!mo22064a(str4, carInfo2, carUiInfo)) {
                    bnsi c5 = f37371a.mo68388c();
                    c5.mo68432a("oen", "a", 566, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c5.mo68424a("Package DENIED; Should not run on HU [%s] [%s]", carInfo2, a);
                    m28586a(bpec.PACKAGE_NOT_WHITELISTED_ON_HU, str4);
                    return false;
                } else if (this.f37379f || m28592c(str4)) {
                    return true;
                } else {
                    if ("com.google.android.projection.gearhead".equals(str4)) {
                        bnsi c6 = f37371a.mo68388c();
                        c6.mo68432a("oen", "a", 583, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c6.mo68420a("Package is not a first party package [%s]", "com.google.android.projection.gearhead");
                    }
                    if (!this.f37380g) {
                        String installerPackageName = this.f37382j.getPackageManager().getInstallerPackageName(str4);
                        int i3 = Build.VERSION.SDK_INT;
                        int i4 = Build.VERSION.SDK_INT;
                        if ("com.android.vending".equals(installerPackageName)) {
                            z3 = this.f37383k.mo24610b(installerPackageName);
                            bryx = a;
                            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        } else {
                            bryx = a;
                            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                            if ("com.google.android.projection.gearhead".equals(str4)) {
                                bnsi c7 = f37371a.mo68388c();
                                str3 = str2;
                                c7.mo68432a("oen", "a", 592, str3);
                                c7.mo68420a("Package is not installed by play [%s]", bryx.m114908a("com.google.android.projection.gearhead"));
                            } else {
                                str3 = str2;
                            }
                            if (m28590a((Set) this.f37377d.get(str4), i)) {
                                return true;
                            }
                            if (this.f37378e.contains(nhg) && this.f37382j.getSharedPreferences("carservice", 0).getBoolean("allow_unknown_sources", false)) {
                                return true;
                            }
                            if (ccsn.f179851a.mo6606a().mo76721a()) {
                                try {
                                    if ((this.f37382j.getPackageManager().getApplicationInfo(str4, 0).flags & 1) == 1) {
                                        return true;
                                    }
                                    bryx2 = bryx;
                                } catch (PackageManager.NameNotFoundException e3) {
                                    bnsi c8 = f37371a.mo68388c();
                                    c8.mo68432a("oen", "a", 621, str3);
                                    c8.mo68420a("Package DENIED; package not found [%s]", bryx);
                                    m28586a(bpec.PACKAGE_NOT_FOUND, str4);
                                    return false;
                                }
                            } else {
                                bryx2 = bryx;
                            }
                            bnsi c9 = f37371a.mo68388c();
                            c9.mo68432a("oen", "a", 627, str3);
                            c9.mo68420a("Package DENIED; failed all other checks [%s]", bryx2);
                            m28586a(bpec.PACKAGE_FAILED_ALL_CHECKS, str4);
                            return false;
                        }
                    } else {
                        synchronized (this.f37385m) {
                            Pair pair = (Pair) this.f37385m.get(str4);
                            if (pair != null) {
                                if (packageUid == ((Integer) pair.first).intValue() && i == ((Integer) pair.second).intValue()) {
                                    return true;
                                }
                                this.f37385m.remove(str4);
                                bnsi d = f37371a.mo68390d();
                                d.mo68432a("oen", "a", 769, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d.mo68420a("Removing cached value for %s", str4);
                            }
                        }
                    }
                    if (z3) {
                        return true;
                    }
                    if ("com.google.android.projection.gearhead".equals(str4)) {
                    }
                    if (m28590a((Set) this.f37377d.get(str4), i)) {
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            bnsi c10 = f37371a.mo68388c();
            c10.mo68432a("oen", "a", 496, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c10.mo68420a("Package DENIED; package not found [%s]", a);
            if (!ccsn.m131443b()) {
                return false;
            }
            m28586a(bpec.PACKAGE_NOT_FOUND, str4);
            return false;
        }
        skh.m35531a().mo25689a(this.f37382j, oel);
        if (z3) {
            synchronized (this.f37385m) {
                this.f37385m.put(str4, new Pair(Integer.valueOf(packageUid), Integer.valueOf(i)));
            }
        }
        if (z3) {
        }
        if ("com.google.android.projection.gearhead".equals(str4)) {
        }
        if (m28590a((Set) this.f37377d.get(str4), i)) {
        }
    }

    /* renamed from: a */
    private final boolean m28588a(String str, nhg nhg) {
        int i;
        if (nhg == nhg.OEM) {
            return true;
        }
        if (f37373i.contains(str) && m28592c(str)) {
            return true;
        }
        XmlResourceParser e = m28594e(str);
        if (e != null) {
            try {
                int ordinal = nhg.PROJECTION.ordinal();
                for (int next = e.next(); next != 1; next = e.next()) {
                    if (next == 2 && "uses".equals(e.getName())) {
                        nhg b = m28591b(e.getAttributeValue(null, "name"));
                        if (b != null) {
                            i = b.ordinal();
                        } else {
                            i = -1;
                        }
                        if (i != nhg.ordinal()) {
                            if (nhg == nhg.SERVICE) {
                                if (i == ordinal) {
                                }
                            }
                        }
                        return true;
                    }
                }
                return false;
            } catch (IOException | XmlPullParserException e2) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r12 == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (p000.ccsn.m131444c() == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        p000.npe.m27163b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r10.f37383k.mo24610b("com.android.vending") != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r2 = p000.oen.f37371a.mo68387b();
        r2.mo68432a("oen", "d", 804, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68405a("Play store not google signed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        r2 = new java.util.concurrent.atomic.AtomicReference();
        r3 = new java.util.concurrent.CountDownLatch(1);
        r5 = new p000.oel("car", r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (p000.skh.m35531a().mo25690a(r10.f37382j, new android.content.Intent().setComponent(p000.oeo.f37389a), r5, 1) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        r2 = p000.oen.f37371a.mo68387b();
        r2.mo68432a("oen", "d", 827, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68405a("Failed to bind to play store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        if (r3.await(5000, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        r2 = (android.os.IBinder) r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r2 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r3 = r2.queryLocalInterface("com.google.android.finsky.services.IPlayGearheadService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        if ((r3 instanceof p000.emm) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        r3 = (p000.emm) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        r3 = new p000.emm(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fa, code lost:
        r4 = r3.mo10277a(r11).getBoolean("Finsky.IsValid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        r3 = p000.oen.f37371a.mo68387b();
        r3.mo68437a(r2);
        r3.mo68432a("oen", "d", 847, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r3.mo68405a("Play store died");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        m28586a(p000.bpec.f137234m, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        return false;
     */
    /* renamed from: a */
    private final boolean m28589a(String str, boolean z, int i, int i2) {
        oel oel;
        boolean z2 = false;
        if (!this.f37380g) {
            String installerPackageName = this.f37382j.getPackageManager().getInstallerPackageName(str);
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            if ("com.android.vending".equals(installerPackageName)) {
                return this.f37383k.mo24610b(installerPackageName);
            }
            return false;
        }
        synchronized (this.f37385m) {
            Pair pair = (Pair) this.f37385m.get(str);
            if (pair != null) {
                if (i == ((Integer) pair.first).intValue() && i2 == ((Integer) pair.second).intValue()) {
                    return true;
                }
                this.f37385m.remove(str);
                bnsi d = f37371a.mo68390d();
                d.mo68432a("oen", "a", 769, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("Removing cached value for %s", str);
            }
        }
        skh.m35531a().mo25689a(this.f37382j, oel);
        if (z2) {
            synchronized (this.f37385m) {
                this.f37385m.put(str, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }
        return z2;
    }

    /* renamed from: a */
    private static final boolean m28590a(Set set, int i) {
        if (set == null) {
            return false;
        }
        if (!set.contains("ALL")) {
            return set.contains(Integer.toString(i));
        }
        return true;
    }

    /* renamed from: a */
    public final List mo22055a(CarInfo carInfo, CarUiInfo carUiInfo, Intent intent) {
        npe.m27163b();
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
        return m28582a(carInfo, carUiInfo, cloneFilter, nhg.PROJECTION, true);
    }

    /* renamed from: a */
    public final List mo22056a(CarInfo carInfo, CarUiInfo carUiInfo, Intent intent, nhg nhg) {
        npe.m27163b();
        return m28582a(carInfo, carUiInfo, intent, nhg, true);
    }

    /* renamed from: a */
    public final void mo22057a(PrintWriter printWriter) {
        printWriter.println("Dumping denied packages");
        for (Pair pair : this.f37386n) {
            printWriter.println(String.format(Locale.US, "pgk=%s error=%s", pair.second, ((bpec) pair.first).name()));
        }
    }

    /* renamed from: a */
    public final void mo22058a(niw niw) {
        this.f37384l = new WeakReference(niw);
        ((nja) niw).f35786d.add(this.f37388r);
    }

    /* renamed from: a */
    public final boolean mo22059a(CarInfo carInfo, CarUiInfo carUiInfo, String str, nhg nhg) {
        if (ccsn.m131444c()) {
            npe.m27163b();
        }
        return m28587a(carInfo, carUiInfo, str, nhg, true, true);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x01cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0151 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x01e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0101 A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0106 A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010b A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0110 A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0115 A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011a A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011f A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0124 A[Catch:{ IOException | XmlPullParserException -> 0x0319 }] */
    /* renamed from: a */
    public final boolean mo22064a(String str, CarInfo carInfo, CarUiInfo carUiInfo) {
        Boolean bool;
        CarUiInfo carUiInfo2;
        Boolean bool2;
        Boolean bool3;
        boolean z;
        char c;
        int i;
        boolean z2;
        Boolean bool4;
        boolean z3;
        char c2;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z4;
        CarInfo carInfo2 = carInfo;
        CarUiInfo carUiInfo3 = carUiInfo;
        try {
            XmlResourceParser e = m28594e(str);
            int i4 = 1;
            if (e == null) {
                return true;
            }
            int next = e.next();
            while (!"head-unit-whitelist".equals(e.getName())) {
                CarUiInfo carUiInfo4 = carUiInfo3;
                if (next == 1) {
                    return true;
                }
                next = e.next();
                carUiInfo3 = carUiInfo4;
                i4 = 1;
                carInfo2 = carInfo;
            }
            Boolean bool5 = null;
            if (carInfo2 != null) {
                bool = null;
            } else if (carUiInfo3 == null) {
                return false;
            } else {
                bool = null;
            }
            while (next != i4) {
                if (next == 2) {
                    if (!"car-info".equals(e.getName())) {
                        bool2 = bool;
                    } else {
                        if (bool5 != null) {
                            if (bool5.booleanValue()) {
                                bool2 = bool;
                            }
                        }
                        if (carInfo2 != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < e.getAttributeCount()) {
                                    String b = bmwg.LOWER_CAMEL.mo66826b(bmwg.UPPER_UNDERSCORE, e.getAttributeName(i5));
                                    String str6 = "MODEL_CONTAINS";
                                    bool4 = bool;
                                    switch (b.hashCode()) {
                                        case -2088886230:
                                            if (b.equals("HEAD_UNIT_MAKE")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2087653134:
                                            if (b.equals("HEAD_UNIT_SOFTWARE_BUILD")) {
                                                c2 = 9;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1675119693:
                                            if (b.equals("MODEL_YEAR")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -951798255:
                                            if (b.equals("PROTOCOL_VERSION")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -364268964:
                                            if (b.equals("HEAD_UNIT_SOFTWARE_VERSION")) {
                                                c2 = 10;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -335259522:
                                            if (b.equals("MIN_PROTOCOL_VERSION")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -330553267:
                                            if (b.equals("HEAD_UNIT_MODEL")) {
                                                c2 = 8;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 73532169:
                                            if (b.equals("MODEL")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 347933649:
                                            if (b.equals("MANUFACTURER")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 674819040:
                                            if (b.equals("MIN_MODEL_YEAR")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1325330069:
                                            if (b.equals(str6)) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            i2 = 1;
                                            try {
                                                String attributeValue = e.getAttributeValue(i5);
                                                i3 = i2 - 1;
                                                switch (i3) {
                                                    case 0:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29332a;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                    case 1:
                                                    case 2:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29333b;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                    case 3:
                                                    case 4:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29334c;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                    case 5:
                                                    case 6:
                                                    default:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        int i6 = carInfo2.f29336e;
                                                        str3 = "MODEL";
                                                        int i7 = carInfo2.f29337f;
                                                        str2 = "MODEL_YEAR";
                                                        StringBuilder sb = new StringBuilder(23);
                                                        sb.append(i6);
                                                        sb.append(".");
                                                        sb.append(i7);
                                                        str5 = sb.toString();
                                                        break;
                                                    case 7:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29340i;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                    case 8:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29341j;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                    case 9:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29342k;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                    case 10:
                                                        str4 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                        str5 = carInfo2.f29343l;
                                                        str3 = "MODEL";
                                                        str2 = "MODEL_YEAR";
                                                        break;
                                                }
                                                if (str5 != null) {
                                                    switch (i3) {
                                                        case 0:
                                                        case 1:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                            z4 = str5.equalsIgnoreCase(attributeValue);
                                                            if (z4) {
                                                                z3 = false;
                                                                break;
                                                            } else {
                                                                i5++;
                                                                carInfo2 = carInfo;
                                                                bool = bool4;
                                                            }
                                                        case 2:
                                                            z4 = str5.toLowerCase(Locale.US).contains(attributeValue.toLowerCase(Locale.US));
                                                            if (z4) {
                                                            }
                                                            break;
                                                        case 3:
                                                        case 5:
                                                            try {
                                                                if (Float.compare(Float.valueOf(str5).floatValue(), Float.valueOf(attributeValue).floatValue()) != 0) {
                                                                    z3 = false;
                                                                } else {
                                                                    i5++;
                                                                    carInfo2 = carInfo;
                                                                    bool = bool4;
                                                                }
                                                            } catch (NumberFormatException e2) {
                                                                bnsi b2 = f37371a.mo68387b();
                                                                b2.mo68437a(e2);
                                                                b2.mo68432a("oem", "a", 1216, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                b2.mo68405a("NumberFormatException while matching attribute.");
                                                                z3 = false;
                                                                carUiInfo2 = carUiInfo;
                                                                bool5 = Boolean.valueOf(z3);
                                                                bool3 = bool4;
                                                                next = e.next();
                                                                carUiInfo3 = carUiInfo2;
                                                                i4 = 1;
                                                                carInfo2 = carInfo;
                                                            }
                                                        case 4:
                                                        case 6:
                                                        default:
                                                            try {
                                                                if (Float.compare(Float.valueOf(str5).floatValue(), Float.valueOf(attributeValue).floatValue()) < 0) {
                                                                    z3 = false;
                                                                    break;
                                                                } else {
                                                                    i5++;
                                                                    carInfo2 = carInfo;
                                                                    bool = bool4;
                                                                }
                                                            } catch (NumberFormatException e3) {
                                                                bnsi b3 = f37371a.mo68387b();
                                                                b3.mo68437a(e3);
                                                                b3.mo68432a("oem", "a", 1225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                b3.mo68405a("NumberFormatException while matching attribute.");
                                                                z3 = false;
                                                                break;
                                                            }
                                                    }
                                                } else {
                                                    bnsi d = f37371a.mo68390d();
                                                    d.mo68432a("oem", "a", 1189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    switch (i2) {
                                                        case 1:
                                                            str6 = "MANUFACTURER";
                                                            break;
                                                        case 2:
                                                            str6 = str3;
                                                            break;
                                                        case 3:
                                                            break;
                                                        case 4:
                                                            str6 = str2;
                                                            break;
                                                        case 5:
                                                            str6 = "MIN_MODEL_YEAR";
                                                            break;
                                                        case 6:
                                                            str6 = "PROTOCOL_VERSION";
                                                            break;
                                                        case 7:
                                                            str6 = "MIN_PROTOCOL_VERSION";
                                                            break;
                                                        case 8:
                                                            str6 = "HEAD_UNIT_MAKE";
                                                            break;
                                                        case 9:
                                                            str6 = "HEAD_UNIT_MODEL";
                                                            break;
                                                        case 10:
                                                            str6 = str4;
                                                            break;
                                                        default:
                                                            str6 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                            break;
                                                    }
                                                    d.mo68424a("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str6, attributeValue);
                                                    z3 = false;
                                                }
                                            } catch (IOException | XmlPullParserException e4) {
                                                return false;
                                            }
                                        case 1:
                                            i2 = 2;
                                            String attributeValue2 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 2:
                                            i2 = 3;
                                            String attributeValue22 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 3:
                                            i2 = 4;
                                            String attributeValue222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 4:
                                            i2 = 5;
                                            String attributeValue2222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 5:
                                            i2 = 6;
                                            String attributeValue22222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 6:
                                            i2 = 7;
                                            String attributeValue222222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 7:
                                            i2 = 8;
                                            String attributeValue2222222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 8:
                                            i2 = 9;
                                            String attributeValue22222222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 9:
                                            i2 = 10;
                                            String attributeValue222222222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        case 10:
                                            i2 = 11;
                                            String attributeValue2222222222 = e.getAttributeValue(i5);
                                            i3 = i2 - 1;
                                            switch (i3) {
                                            }
                                            if (str5 != null) {
                                            }
                                            break;
                                        default:
                                            try {
                                                throw new IllegalArgumentException();
                                            } catch (IllegalArgumentException e5) {
                                                break;
                                            }
                                    }
                                } else {
                                    bool4 = bool;
                                    z3 = true;
                                }
                            }
                            carUiInfo2 = carUiInfo;
                            bool5 = Boolean.valueOf(z3);
                            bool3 = bool4;
                            next = e.next();
                            carUiInfo3 = carUiInfo2;
                            i4 = 1;
                            carInfo2 = carInfo;
                        } else {
                            bool2 = bool;
                        }
                    }
                    if (!"car-ui-info".equals(e.getName())) {
                        carUiInfo2 = carUiInfo;
                    } else if (bool2 == null || !bool2.booleanValue()) {
                        carUiInfo2 = carUiInfo;
                        if (carUiInfo2 != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 < e.getAttributeCount()) {
                                    String b4 = bmwg.LOWER_CAMEL.mo66826b(bmwg.UPPER_UNDERSCORE, e.getAttributeName(i8));
                                    switch (b4.hashCode()) {
                                        case -861240527:
                                            if (b4.equals("HAS_TOUCH_SCREEN")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -642125595:
                                            if (b4.equals("HAS_ROTARY_CONTROLLER")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -535308301:
                                            if (b4.equals("HAS_D_PAD")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 559129059:
                                            if (b4.equals("HAS_TOUCHPAD_FOR_UI_NAVIGATION")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2052594852:
                                            if (b4.equals("HAS_SEARCH_BUTTON")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0) {
                                        i = 1;
                                    } else if (c == 1) {
                                        i = 2;
                                    } else if (c == 2) {
                                        i = 3;
                                    } else if (c == 3) {
                                        i = 4;
                                    } else if (c == 4) {
                                        i = 5;
                                    } else {
                                        try {
                                            throw new IllegalArgumentException();
                                        } catch (IllegalArgumentException e6) {
                                            z = false;
                                        }
                                    }
                                    int i9 = i - 1;
                                    if (i9 != 0) {
                                        z2 = i9 != 1 ? i9 != 2 ? i9 != 3 ? carUiInfo2.f29374f : carUiInfo2.f29372d : carUiInfo2.f29371c : carUiInfo2.f29370b;
                                    } else {
                                        z2 = carUiInfo2.f29369a;
                                    }
                                    if (z2) {
                                        i8++;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                            bool3 = Boolean.valueOf(z);
                            next = e.next();
                            carUiInfo3 = carUiInfo2;
                            i4 = 1;
                            carInfo2 = carInfo;
                        }
                    } else {
                        carUiInfo2 = carUiInfo;
                    }
                } else {
                    carUiInfo2 = carUiInfo3;
                    bool2 = bool;
                }
                bool3 = bool2;
                next = e.next();
                carUiInfo3 = carUiInfo2;
                i4 = 1;
                carInfo2 = carInfo;
            }
            Boolean bool6 = bool;
            if (bool5 != null && !bool5.booleanValue()) {
                return false;
            }
            if (bool6 != null) {
                return bool6.booleanValue();
            }
            return true;
        } catch (PackageManager.NameNotFoundException e7) {
            return false;
        }
    }
}
