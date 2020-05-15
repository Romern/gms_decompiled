package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.wearable.node.DataService$1;
import com.google.android.gms.wearable.node.GcmMessageReceiver;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/* renamed from: ayha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayha {

    /* renamed from: a */
    public static axue f97559a;

    /* renamed from: b */
    public static axue f97560b;

    /* renamed from: c */
    public static boolean f97561c;

    /* renamed from: d */
    static aydo f97562d;

    /* renamed from: e */
    private static boolean f97563e = false;

    /* renamed from: f */
    private static ayaw f97564f;

    /* renamed from: g */
    private static aydn f97565g;

    /* renamed from: h */
    private static axwy f97566h;

    /* renamed from: i */
    private static boolean f97567i;

    /* renamed from: j */
    private static boolean f97568j;

    /* renamed from: k */
    private static ayak f97569k;

    /* renamed from: l */
    private static ayjs f97570l;

    /* renamed from: m */
    private static axzt f97571m;

    /* renamed from: a */
    public static synchronized ayaw m83994a() {
        ayaw ayaw;
        synchronized (ayha.class) {
            ayaw = f97564f;
        }
        return ayaw;
    }

    /* renamed from: b */
    public static synchronized aydo m83996b() {
        aydo aydo;
        synchronized (ayha.class) {
            aydo = f97562d;
        }
        return aydo;
    }

    /* renamed from: c */
    public static synchronized aydn m83997c() {
        aydn aydn;
        synchronized (ayha.class) {
            aydn = f97565g;
        }
        return aydn;
    }

    /* renamed from: d */
    public static synchronized axwy m83998d() {
        axwy axwy;
        synchronized (ayha.class) {
            axwy = f97566h;
        }
        return axwy;
    }

    /* renamed from: e */
    public static synchronized boolean m83999e() {
        boolean z;
        synchronized (ayha.class) {
            m84000f();
            z = f97568j;
        }
        return z;
    }

    /* renamed from: f */
    public static synchronized void m84000f() {
        synchronized (ayha.class) {
            sdo.m34975b(f97561c, "Local Edition mode must be initialized");
        }
    }

    /* renamed from: g */
    public static synchronized boolean m84001g() {
        boolean z;
        synchronized (ayha.class) {
            sdo.m34975b(f97563e, "WearableServiceStatics must be initialized");
            z = f97567i;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x04ba, code lost:
        throw new java.lang.IllegalStateException("unable to determine the wear package name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        throw new java.lang.IllegalStateException("Failed to create LE Companion Key.", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x0054, B:22:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04aa A[Catch:{ NameNotFoundException -> 0x04b2, NameNotFoundException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122 A[Catch:{ NameNotFoundException -> 0x04b2, NameNotFoundException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0421 A[Catch:{ NameNotFoundException -> 0x04b2, NameNotFoundException -> 0x005b }] */
    /* renamed from: a */
    public static synchronized void m83995a(Context context) {
        boolean z;
        axxe axxe;
        axzr axzr;
        ayae ayae;
        ayai ayai;
        axzm axzm;
        ayai ayai2;
        ayjq ayjq;
        axwm axwm;
        axyd axyd;
        axud axud;
        Context context2 = context;
        synchronized (ayha.class) {
            if (!f97563e) {
                Log.i("Wear_Statics", "Initializing static objects.");
                if ("com.google.android.wearable.app.cn".equals(context.getPackageName())) {
                    Log.d("Wear_Statics", "Running on Companion.");
                    f97568j = true;
                    ayfz.f97510a = context2;
                }
                f97563e = true;
                f97561c = true;
                if ((context.getResources().getConfiguration().uiMode & 15) != 6) {
                    z = false;
                } else {
                    z = true;
                }
                int i = Build.VERSION.SDK_INT;
                f97567i = z;
                if (f97568j) {
                    f97559a = axue.m83239a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
                    f97560b = axug.m83241a(context2, "com.google.android.wearable.app.cn");
                } else {
                    f97559a = axug.m83241a(context2, context.getPackageName());
                    f97560b = null;
                }
                axty.f96348a = new axty(context2, !spn.m35859a() && !sre.m36080a(context) && !f97568j);
                axzt axzt = new axzt(context2);
                f97571m = axzt;
                new Thread(new axzs(axzt)).start();
                ayae ayae2 = new ayae(f97571m, f97567i);
                axzr axzr2 = new axzr(context2);
                axze axze = new axze(context, "node.db", f97571m, axzr2, f97567i);
                bmzi a = axwi.m83382a(context);
                bmzi b = axwi.m83383b(context);
                axzq axzq = new axzq(context, ayfz.m83948a(), b, a, f97571m, f97567i);
                if (!f97568j) {
                    if (!sre.m36080a(context)) {
                        String str = f97571m.mo53808b().f96814a;
                        ayfz.m83948a();
                        axxe = new axxe(str);
                        axxv axxv = r6;
                        axuo axuo = new axuo(axxe);
                        axzq axzq2 = axzq;
                        axxv axxv2 = new axxv(context, srb.f45012a, f97567i, f97571m, axze, context2.getSharedPreferences("wearable.data_service.settings", 0), axzr2, axuo, axxe);
                        if (axxv.f96690a != null) {
                            axxv.f96690a = axxv;
                            axxv.f96710r = new DataService$1(axxv, "wearable");
                            axxv.f96694b.registerReceiver(axxv.f96710r, new IntentFilter("action_database_maintenance"));
                            axxv.mo53745c();
                            axzq2.f96848b = axxv;
                            axxv.mo53736a(axzq2);
                            axuo axuo2 = axuo;
                            axuo2.f96404a = axxv;
                            f97564f = new ayaw(context2, context.getFilesDir().getPath(), f97571m, new axys());
                            ayjs ayjs = new ayjs();
                            context2.registerComponentCallbacks(ayjs);
                            f97570l = ayjs;
                            axyb axyb = new axyb();
                            axxz axxz = new axxz();
                            f97569k = new ayak(f97571m, aakz.m21424a(context), ayae2, axzq2, axyb, f97570l);
                            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                            axzm axzm2 = new axzm(connectivityManager, ayae2, f97567i, context2);
                            if (axzm.f96829a == null) {
                                axzm.f96829a = axzm2;
                                axzm2.f96840l = f97571m;
                                axxv.mo53736a(axzm2);
                                axzm2.f96836h = axxv;
                                Log.d("Wear_Statics", "NodeService is set...");
                                ayai ayai3 = new ayai(f97570l);
                                ayai3.f96912e = ayai.m83685a(context);
                                ayai3.f96910c = axzm2;
                                ayai.f96907a = ayai3;
                                int i2 = Build.VERSION.SDK_INT;
                                if (sre.m36080a(context)) {
                                    ayai = ayai3;
                                    axzr = axzr2;
                                    ayae = ayae2;
                                    axzm = axzm2;
                                } else if (!f97568j) {
                                    if (f97567i) {
                                        if (chmx.f188796a.mo6606a().mo85364b()) {
                                            WearableChimeraService.m94433a("60-GcmController", new axye(context2));
                                        }
                                    }
                                    ayae = ayae2;
                                    aybd aybd = r5;
                                    ayai = ayai3;
                                    axzr = axzr2;
                                    axzm = axzm2;
                                    aybd aybd2 = new aybd(context, ayfz.m83948a(), f97567i, f97571m, (WifiManager) context.getApplicationContext().getSystemService("wifi"), axxv, connectivityManager);
                                    if (aybd.f97009a == null) {
                                        aybd.f97009a = aybd;
                                        axxv.mo53736a(aybd);
                                        Log.d("Wear_Statics", "WifiService is set...");
                                    } else {
                                        throw new IllegalStateException("WifiService singleton can only be set once.");
                                    }
                                } else {
                                    ayai = ayai3;
                                    axzr = axzr2;
                                    ayae = ayae2;
                                    axzm = axzm2;
                                }
                                axpc axpc = new axpc();
                                if (axpc.f96234a == null) {
                                    axpc.f96234a = axpc;
                                    axpb axpb = new axpb();
                                    if (axpb.f96232a == null) {
                                        axpb.f96232a = axpb;
                                        axuv axuv = new axuv(context, f97559a, f97571m, new axuu(context2), f97567i);
                                        axuv.f96423d = axxv;
                                        axuv.f96424e = axzm;
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        new axur(axuv, countDownLatch).start();
                                        try {
                                            countDownLatch.await();
                                        } catch (InterruptedException e) {
                                            Log.e("CapabilityService", "Service interrupted waiting for initialization thread to start.", e);
                                        }
                                        axuv.f96418a = axuv;
                                        axxv.mo53736a(axuv);
                                        axzm.mo53785a(axuv);
                                        axxz.f96742b = f97571m;
                                        axxz.f96741a = axxv;
                                        axxv.mo53736a(axxz);
                                        ayak ayak = f97569k;
                                        sdo.m34959a(ayai);
                                        ayai ayai4 = ayai;
                                        ayak.f96924e = ayai4;
                                        ayai4.f96909b = f97569k;
                                        f97564f.mo53852a(axuo2);
                                        f97564f.mo53852a(axxz);
                                        f97564f.mo53852a(f97569k);
                                        f97564f.mo53852a(axzm);
                                        ayfn ayfn = new ayfn(ayfm.m83927a(context));
                                        ConnectivityManager connectivityManager2 = (ConnectivityManager) context2.getSystemService("connectivity");
                                        axyd axyd2 = new axyd();
                                        ayjq ayjq2 = new ayjq(new Random(), "CloudNode");
                                        axzt axzt2 = f97571m;
                                        abop c = axwi.m83384c(context);
                                        axzq2.mo53800a(c);
                                        if (!chnj.f188812a.mo6606a().mo85380F()) {
                                            if (Log.isLoggable("CloudNode", 3)) {
                                                Log.d("CloudNode", "Creating JSON Client...");
                                            }
                                            ayjq = ayjq2;
                                            ayai2 = ayai4;
                                            axwm = new axwt(context, c, axzt2, axzq2, ayjq2, axyb, axyd2);
                                            axyd = axyd2;
                                        } else {
                                            ayjq = ayjq2;
                                            axyd axyd3 = axyd2;
                                            ayai2 = ayai4;
                                            if (Log.isLoggable("CloudNode", 3)) {
                                                Log.d("CloudNode", "Creating GRPC Client...");
                                            }
                                            axyd = axyd3;
                                            axwm = new axws(context2, axzt2, axzq2, axyd);
                                        }
                                        axwn a2 = axwi.m83381a(context, axzr, axxv, ayjq, axyb, axyd);
                                        axwi axwi = r8;
                                        axxz axxz2 = axxz;
                                        axuo axuo3 = axuo2;
                                        axzr axzr3 = axzr;
                                        axzm axzm3 = axzm;
                                        axuv axuv2 = axuv;
                                        axwi axwi2 = new axwi(context, ayfz.m83948a(), a, b, axyd, connectivityManager2, ayjq, axxv, axzr, axzq2, f97567i, axyb, axzm3, axwm, a2);
                                        axzq axzq3 = axzq2;
                                        axzq3.f96847a = axwi;
                                        axwi.f96587l.mo53785a(axwi.f96588m);
                                        f97565g = new aydn(context, ayfz.m83948a(), ayfn, f97564f, axwi);
                                        Context context3 = context;
                                        f97562d = new aydo(context3);
                                        axxv axxv3 = axxv;
                                        axxv3.mo53736a(axwi);
                                        f97564f.f96996i = axwi;
                                        if (!sre.m36080a(context)) {
                                            if (!f97568j) {
                                                if (f97567i) {
                                                    int i3 = Build.VERSION.SDK_INT;
                                                    ayak ayak2 = f97569k;
                                                    new aydq(context3);
                                                    axud = new axxa(context, axwi, ayak2, ayae, axxv3, axzm3);
                                                } else {
                                                    axud = new axwz(context, axwi, f97569k, ayae, axxv3, axzm3);
                                                }
                                                ayak ayak3 = f97569k;
                                                IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.RECEIVE");
                                                intentFilter.addCategory("com.google.android.gms.wearable");
                                                context3.registerReceiver(new GcmMessageReceiver(ayak3, axwi), intentFilter, "com.google.android.c2dm.permission.SEND", null);
                                                axxv3.mo53736a(axud);
                                                WearableChimeraService.m94433a("70-CloudSyncManager", axud);
                                                WearableChimeraService.m94433a("07-CloudNodeAdapter", axud.f96366c);
                                                f97566h = axud;
                                                axwi.f96601z = f97566h;
                                                axzm axzm4 = axzm3;
                                                axzm4.f96837i = f97566h;
                                                if (Log.isLoggable("pairingservice", 2)) {
                                                    Log.v("pairingservice", "PairingService starting...");
                                                }
                                                new soa(9, new axzo(axzq3)).start();
                                                WearableChimeraService.m94433a("00-WearableTransport", f97564f);
                                                WearableChimeraService.m94433a("01-ConnectionServiceManager", f97565g);
                                                WearableChimeraService.m94433a("02-ConnectionStatusHelper", f97562d);
                                                WearableChimeraService.m94433a("03-DataTransport", axxz2);
                                                WearableChimeraService.m94433a("04-AssetTransport", axuo3);
                                                WearableChimeraService.m94433a("05-NodeService", axzm4);
                                                WearableChimeraService.m94433a("06-DataSync", axxv3.f96702j);
                                                WearableChimeraService.m94433a("71-RpcTracker", f97570l);
                                                WearableChimeraService.m94433a("97-CapabilityService", axuv2);
                                                WearableChimeraService.m94433a("98-AssetStorage", axzr3);
                                                WearableChimeraService.m94433a("99-DataService", axxv3);
                                                WearableChimeraService.m94432a(axxv3);
                                                WearableChimeraService.m94432a(ayai2);
                                                WearableChimeraService.m94432a(f97571m);
                                                WearableChimeraService.m94432a(f97565g);
                                                return;
                                            }
                                        }
                                        f97566h = new axzn();
                                        axwi.f96601z = f97566h;
                                        axzm axzm42 = axzm3;
                                        axzm42.f96837i = f97566h;
                                        if (Log.isLoggable("pairingservice", 2)) {
                                        }
                                        new soa(9, new axzo(axzq3)).start();
                                        WearableChimeraService.m94433a("00-WearableTransport", f97564f);
                                        WearableChimeraService.m94433a("01-ConnectionServiceManager", f97565g);
                                        WearableChimeraService.m94433a("02-ConnectionStatusHelper", f97562d);
                                        WearableChimeraService.m94433a("03-DataTransport", axxz2);
                                        WearableChimeraService.m94433a("04-AssetTransport", axuo3);
                                        WearableChimeraService.m94433a("05-NodeService", axzm42);
                                        WearableChimeraService.m94433a("06-DataSync", axxv3.f96702j);
                                        WearableChimeraService.m94433a("71-RpcTracker", f97570l);
                                        WearableChimeraService.m94433a("97-CapabilityService", axuv2);
                                        WearableChimeraService.m94433a("98-AssetStorage", axzr3);
                                        WearableChimeraService.m94433a("99-DataService", axxv3);
                                        WearableChimeraService.m94432a(axxv3);
                                        WearableChimeraService.m94432a(ayai2);
                                        WearableChimeraService.m94432a(f97571m);
                                        WearableChimeraService.m94432a(f97565g);
                                        return;
                                    }
                                    throw new IllegalStateException("AmsService singleton can only be set once.");
                                }
                                throw new IllegalStateException("AncsService singleton can only be set once.");
                            }
                            throw new IllegalStateException("NodeService singleton can only be set once.");
                        }
                        throw new IllegalStateException("DataItemService singleton can only be set once.");
                    }
                }
                axxe = new axxd();
                axxv axxv4 = axxv2;
                axuo axuo4 = new axuo(axxe);
                axzq axzq22 = axzq;
                axxv axxv22 = new axxv(context, srb.f45012a, f97567i, f97571m, axze, context2.getSharedPreferences("wearable.data_service.settings", 0), axzr2, axuo4, axxe);
                if (axxv.f96690a != null) {
                }
            }
        }
    }
}
