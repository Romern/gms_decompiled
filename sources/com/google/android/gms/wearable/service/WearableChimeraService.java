package com.google.android.gms.wearable.service;

import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Message;
import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableChimeraService extends sjh implements ayjm {

    /* renamed from: G */
    private static Map f110997G = new TreeMap();

    /* renamed from: a */
    public static List f110998a = new ArrayList();

    /* renamed from: u */
    public static axue f110999u;

    /* renamed from: v */
    public static boolean f111000v;

    /* renamed from: A */
    boolean f111001A;

    /* renamed from: B */
    public axzf f111002B;

    /* renamed from: C */
    aygw f111003C;

    /* renamed from: D */
    aygp f111004D;

    /* renamed from: E */
    aygn f111005E;

    /* renamed from: F */
    aygl f111006F;

    /* renamed from: H */
    private final ConcurrentHashMap f111007H = new ConcurrentHashMap();

    /* renamed from: I */
    private final ConcurrentHashMap f111008I = new ConcurrentHashMap();

    /* renamed from: J */
    private volatile aygg f111009J;

    /* renamed from: K */
    private volatile aygh f111010K;

    /* renamed from: L */
    private axvr f111011L;

    /* renamed from: M */
    private HandlerThread f111012M;

    /* renamed from: N */
    private HandlerThread f111013N;

    /* renamed from: O */
    private ayfw f111014O;

    /* renamed from: P */
    private Random f111015P = new Random();

    /* renamed from: Q */
    private volatile boolean f111016Q;

    /* renamed from: i */
    final Map f111017i = new ConcurrentHashMap();

    /* renamed from: j */
    final Set f111018j = new HashSet();

    /* renamed from: k */
    public final Object f111019k = new Object();

    /* renamed from: l */
    public Set f111020l = null;

    /* renamed from: m */
    axxg f111021m;

    /* renamed from: n */
    aygt f111022n;

    /* renamed from: o */
    public boolean f111023o;

    /* renamed from: p */
    BroadcastReceiver f111024p;

    /* renamed from: q */
    public Set f111025q;

    /* renamed from: r */
    public final Object f111026r = new Object();

    /* renamed from: s */
    public String f111027s = "";

    /* renamed from: t */
    public Set f111028t = Collections.emptySet();

    /* renamed from: w */
    public volatile ayfs f111029w;

    /* renamed from: x */
    public ayfx f111030x;

    /* renamed from: y */
    long f111031y;

    /* renamed from: z */
    public final Object f111032z = new Object();

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class PackageBroadcastReceiver extends aacn {
        public PackageBroadcastReceiver() {
            super("wearable");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action)) {
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                List list = WearableChimeraService.f110998a;
                synchronized (wearableChimeraService.f111017i) {
                    aygj aygj = (aygj) wearableChimeraService.f111017i.remove(schemeSpecificPart);
                    wearableChimeraService.f111018j.remove(schemeSpecificPart);
                    if (aygj != null) {
                        aygj.mo54007a(wearableChimeraService);
                        if (Log.isLoggable("WearableService", 2)) {
                            String valueOf = String.valueOf(schemeSpecificPart);
                            Log.v("WearableService", valueOf.length() == 0 ? new String("Removed package record: ") : "Removed package record: ".concat(valueOf));
                        }
                    }
                }
                synchronized (WearableChimeraService.this.f111019k) {
                    WearableChimeraService.this.f111020l = null;
                }
            }
        }
    }

    public WearableChimeraService() {
        super(14, "com.google.android.gms.wearable.BIND", Collections.emptySet(), 3, 9);
    }

    /* renamed from: a */
    public static void m94432a(ayjh ayjh) {
        f110998a.add(ayjh);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5.metaData.containsKey("com.google.android.wearable.version") != false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082 A[Catch:{ NameNotFoundException -> 0x009e }] */
    /* renamed from: b */
    public final aygj mo60328b(String str) {
        String str2;
        String str3;
        if (!ayha.m83999e() || (!str.equals("com.google.android.wearable.app.cn") && !str.equals("com.google.android.wearable.app"))) {
            str3 = str;
            str2 = str3;
        } else {
            str3 = "com.google.android.wearable.app";
            str2 = "com.google.android.wearable.app.cn";
        }
        synchronized (this.f111017i) {
            if (this.f111018j.contains(str2)) {
                return null;
            }
            aygj aygj = (aygj) this.f111017i.get(str3);
            if (aygj == null) {
                if (ayha.m83999e()) {
                    try {
                        ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(str2, 128);
                        if (applicationInfo.metaData != null) {
                            if (applicationInfo.metaData.getInt("com.google.android.gms.version") < 10200000) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        if (Log.isLoggable("WearableService", 3)) {
                            String valueOf = String.valueOf(str2);
                            Log.d("WearableService", valueOf.length() == 0 ? new String("Could not resolve package: ") : "Could not resolve package: ".concat(valueOf));
                        }
                    }
                    this.f111018j.add(str2);
                    return null;
                }
                try {
                    aygj aygj2 = new aygj(this, this.f111009J, axug.m83241a(this, str));
                    try {
                        this.f111017i.put(str3, aygj2);
                        aygj = aygj2;
                    } catch (PackageManager.NameNotFoundException e2) {
                        aygj = aygj2;
                        if (Log.isLoggable("WearableService", 2)) {
                        }
                        return aygj;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    if (Log.isLoggable("WearableService", 2)) {
                        String valueOf2 = String.valueOf(str2);
                        Log.v("WearableService", valueOf2.length() == 0 ? new String("Didn't find package ") : "Didn't find package ".concat(valueOf2));
                    }
                    return aygj;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        if (!"user".equals(Build.TYPE) || ((Boolean) rsv.f43613b.mo25081c()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            String str = null;
            String str2 = null;
            boolean z2 = false;
            for (String str3 : strArr) {
                if ("verbose".equalsIgnoreCase(str3) || "-v".equalsIgnoreCase(str3)) {
                    z2 = true;
                } else {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                str = str2.toLowerCase(Locale.US);
            }
            ssb ssb = new ssb(printWriter, "  ");
            for (Map.Entry entry : f110997G.entrySet()) {
                String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.US);
                if (str != null) {
                    if (!lowerCase.contains(str)) {
                    }
                }
                ayjm ayjm = (ayjm) ((WeakReference) entry.getValue()).get();
                if (ayjm != null) {
                    ssb.println("#####################################");
                    ssb.println((String) entry.getKey());
                    ayjm.mo53558a(ssb, z, z2);
                }
                ssb.println();
            }
            ssb.flush();
        } catch (Exception e) {
            Log.e("WearableService", "caught exception while dumping", e);
            String valueOf = String.valueOf(e.getMessage());
            printWriter.println(valueOf.length() == 0 ? new String("caught exception while dumping") : "caught exception while dumping".concat(valueOf));
        }
    }

    public final void onCreate() {
        aygy.m83985a();
        if (!aygy.m83989b(this)) {
            Log.i("WearableService", "onCreate: Wearable Services not starting. Wear is not available on this device.");
            stopSelf();
            return;
        }
        Log.i("WearableService", "onCreate: Wearable Services starting.");
        ayha.m83995a(getApplicationContext());
        f111000v = true;
        this.f111030x = new ayfx(ayha.f97560b, ayha.f97559a);
        try {
            f110999u = axug.m83241a(this, "com.google.android.wearable.app");
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("WearableService", valueOf.length() == 0 ? new String("Failed to create home appkey: ") : "Failed to create home appkey: ".concat(valueOf));
        }
        this.f111023o = ayha.m84001g();
        int i = Build.VERSION.SDK_INT;
        this.f111029w = new ayfs((UsageStatsManager) getSystemService("usagestats"));
        HandlerThread handlerThread = new HandlerThread("WearableChimeraService", 9);
        handlerThread.start();
        this.f111009J = new aygg(this, handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("WearableServiceLiveListener", 9);
        handlerThread2.start();
        this.f111010K = new aygh(handlerThread2.getLooper());
        this.f111014O = new ayfw();
        this.f111021m = new aygu(this);
        axxv.f96690a.mo53736a(this.f111021m);
        this.f111003C = new aygw(this);
        ayai ayai = ayai.f96907a;
        aygw aygw = this.f111003C;
        synchronized (ayai.f96911d) {
            ayai.f96915h = aygw;
        }
        this.f111022n = new aygt(this);
        axzm.f96829a.mo53785a(this.f111022n);
        this.f111004D = new aygp(this);
        axuv.f96418a.f96426g.add(this.f111004D);
        this.f111005E = new aygn(this);
        axpc.f96234a.f96235b = this.f111005E;
        this.f111006F = new aygl();
        axpb.f96232a.f96233b = this.f111006F;
        HandlerThread handlerThread3 = new HandlerThread("ChannelManager");
        this.f111012M = handlerThread3;
        handlerThread3.start();
        aygc aygc = new aygc(new asfb(this, 1, "wearChannelApiRetransmissionQueue", null, "com.google.android.wearable.app"));
        HandlerThread handlerThread4 = new HandlerThread("ChannelRetransmissionQueue");
        this.f111013N = handlerThread4;
        handlerThread4.start();
        axyj axyj = new axyj(new axyf(new adzt(this.f111013N.getLooper())), new aybf(ayai.f96907a), aygc);
        aygb aygb = new aygb(new aygd(this));
        axvr axvr = new axvr(axzm.f96829a, new adzt(this.f111012M.getLooper()), new ayfk(), new SecureRandom(), axyj, new ayge());
        this.f111011L = axvr;
        axvr.mo53624a(ayem.ORIGIN_CHANNEL_API, aygb);
        axvr axvr2 = this.f111011L;
        if (!axvr2.f96499f.getAndSet(true)) {
            axvr2.f96498e.mo53785a(axvr2.f96501h);
            ayai.f96907a.f96914g = this.f111011L;
            this.f111009J.post(new aygf(this));
            m94433a("WearableChimeraService", this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            PackageBroadcastReceiver packageBroadcastReceiver = new PackageBroadcastReceiver();
            this.f111024p = packageBroadcastReceiver;
            registerReceiver(packageBroadcastReceiver, intentFilter);
            this.f111016Q = true;
            return;
        }
        throw new IllegalStateException("Called start() twice");
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f111016Q = false;
        if (f111000v) {
            axpc.f96234a.f96235b = null;
            this.f111005E = null;
            axpb.f96232a.f96233b = null;
            this.f111006F = null;
            if (this.f111004D != null) {
                axuv axuv = axuv.f96418a;
                axuv.f96426g.remove(this.f111004D);
            }
            this.f111004D = null;
            if (this.f111022n != null) {
                axzm.f96829a.mo53787b(this.f111022n);
            }
            this.f111022n = null;
            ayai ayai = ayai.f96907a;
            synchronized (ayai.f96911d) {
                ayai.f96915h = null;
            }
            this.f111003C = null;
            if (this.f111021m != null) {
                axxv axxv = axxv.f96690a;
                axxv.f96700h.remove(this.f111021m);
            }
            this.f111021m = null;
            if (this.f111009J != null) {
                aygg aygg = this.f111009J;
                aygg.f97521a = true;
                aygg.removeCallbacksAndMessages(null);
                aygg.getLooper().quitSafely();
                for (aygj aygj : aygg.f97522b.f111017i.values()) {
                    aygj.mo54007a(aygg.f97522b);
                }
            }
            this.f111009J = null;
            if (this.f111010K != null) {
                this.f111010K.getLooper().quitSafely();
            }
            this.f111010K = null;
            ayai.f96907a.f96914g = null;
            axvr axvr = this.f111011L;
            if (axvr != null) {
                if (axvr.f96499f.getAndSet(false)) {
                    axvr.f96494a.post(new axvi(axvr));
                    axvr.f96495b.mo53620b();
                    axvr.f96498e.mo53787b(axvr.f96501h);
                    this.f111011L.mo53624a(ayem.ORIGIN_CHANNEL_API, (aygb) null);
                    this.f111012M.quitSafely();
                    this.f111013N.interrupt();
                    this.f111013N.quit();
                } else {
                    throw new IllegalStateException("Called stop() on stopped channel manager");
                }
            }
            ayfw ayfw = this.f111014O;
            if (ayfw != null) {
                ayfw.f97505c.shutdown();
            }
            BroadcastReceiver broadcastReceiver = this.f111024p;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* renamed from: a */
    public static void m94433a(String str, ayjm ayjm) {
        f110997G.put(str, new WeakReference(ayjm));
    }

    /* renamed from: a */
    private final boolean m94434a(int i, aygj aygj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            String str = aygj.f97527e.f96378b;
            Boolean bool = (Boolean) this.f111007H.get(str);
            if (bool == null) {
                bool = Boolean.valueOf(rfz.m33557a(this).mo24610b(str));
                this.f111007H.put(str, bool);
            }
            return bool.booleanValue();
        } else if (i2 != 2) {
            return aygj.f97525c;
        } else {
            if (!aygj.f97525c) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* renamed from: a */
    public static boolean m94435a(Context context, String str) {
        boolean z;
        int a;
        String str2;
        boolean z2 = true;
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            int identifier = resourcesForApplication.getIdentifier("android_wear_is_multi_node_aware", "bool", ayjp.m84116a(resourcesForApplication, str));
            if (identifier != 0) {
                z = resourcesForApplication.getBoolean(identifier);
                a = sqr.m35996a(context, str);
                if (a <= 0 && Log.isLoggable("WearableService", 3)) {
                    String valueOf = String.valueOf(str);
                    Log.d("WearableService", valueOf.length() != 0 ? new String("package or google-play-services version not found: ") : "package or google-play-services version not found: ".concat(valueOf));
                }
                if (srq.m36141b(a)) {
                    z2 = false;
                } else if (!z) {
                    z2 = false;
                }
                if (Log.isLoggable("WearableService", 2)) {
                    if (!z2) {
                        str2 = "not ";
                    } else {
                        str2 = "";
                    }
                    StringBuilder sb = new StringBuilder(str2.length() + 29 + String.valueOf(str).length());
                    sb.append("package is ");
                    sb.append(str2);
                    sb.append("multi-node aware: ");
                    sb.append(str);
                    Log.v("WearableService", sb.toString());
                }
                return z2;
            }
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | NullPointerException e) {
        }
        z = true;
        a = sqr.m35996a(context, str);
        String valueOf2 = String.valueOf(str);
        Log.d("WearableService", valueOf2.length() != 0 ? new String("package or google-play-services version not found: ") : "package or google-play-services version not found: ".concat(valueOf2));
        if (srq.m36141b(a)) {
        }
        if (Log.isLoggable("WearableService", 2)) {
        }
        return z2;
    }

    /* renamed from: a */
    public final axzf mo60322a() {
        axzf axzf;
        synchronized (this.f111032z) {
            if (!this.f111001A) {
                Iterator it = axzm.f96829a.mo53786b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ayac ayac = (ayac) it.next();
                    if (this.f111023o != ayac.f96889f && !"cloud".equals(ayac.f96884a.f96814a) && this.f111002B == null) {
                        this.f111002B = ayac.f96884a;
                        break;
                    }
                }
                this.f111001A = true;
            }
            axzf = this.f111002B;
        }
        return axzf;
    }

    /* renamed from: a */
    public final aygj mo60323a(axue axue) {
        aygj b = mo60328b(axue.f96377a);
        if (b == null) {
            return null;
        }
        if (axue.equals(b.f97527e)) {
            return b;
        }
        String valueOf = String.valueOf(axue);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Mismatched certificate: ");
        sb.append(valueOf);
        Log.w("WearableService", sb.toString());
        synchronized (this) {
            this.f111031y++;
        }
        return null;
    }

    /* renamed from: a */
    public final Set mo60324a(int i) {
        Set<String> set;
        HashSet hashSet = new HashSet();
        synchronized (this.f111019k) {
            if (this.f111020l == null) {
                this.f111020l = new HashSet();
                List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("com.google.android.gms.wearable.BIND_LISTENER"), 0);
                if (queryIntentServices != null) {
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        this.f111020l.add(resolveInfo.serviceInfo.packageName);
                    }
                }
                String[] strArr = {"com.google.android.gms.wearable.NODE_CHANGED", "com.google.android.gms.wearable.ANCS_NOTIFICATION", "com.google.android.gms.wearable.AMS_UPDATE"};
                for (int i2 = 0; i2 < 3; i2++) {
                    List<ResolveInfo> queryIntentServices2 = getPackageManager().queryIntentServices(new Intent(strArr[i2], ayao.f96960a), 0);
                    if (queryIntentServices2 != null) {
                        for (ResolveInfo resolveInfo2 : queryIntentServices2) {
                            this.f111020l.add(resolveInfo2.serviceInfo.packageName);
                        }
                    }
                }
            }
            set = this.f111020l;
        }
        for (String str : set) {
            aygj b = mo60328b(str);
            if (b != null) {
                axue axue = b.f97527e;
                if (b.f97529g) {
                    if (Log.isLoggable("WearableService", 2)) {
                        String valueOf = String.valueOf(axue.f96377a);
                        Log.v("WearableService", valueOf.length() == 0 ? new String("ignoring stopped listener: ") : "ignoring stopped listener: ".concat(valueOf));
                    }
                } else if (m94434a(i, b)) {
                    hashSet.add(axue);
                }
            }
        }
        for (Map.Entry entry : this.f111008I.entrySet()) {
            ayja ayja = (ayja) ((WeakReference) entry.getValue()).get();
            aygj b2 = mo60328b(((axue) entry.getKey()).f96377a);
            if (!(ayja == null || b2 == null || !m94434a(i, b2))) {
                hashSet.add((axue) entry.getKey());
            }
        }
        if (Log.isLoggable("WearableService", 2)) {
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(39);
            sb.append("getListeningPackages: count=");
            sb.append(size);
            Log.v("WearableService", sb.toString());
        }
        return hashSet;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wearable.service.WearableChimeraService.a(axue, aygz, boolean):void
     arg types: [axue, aygz, int]
     candidates:
      com.google.android.gms.wearable.service.WearableChimeraService.a(ssb, boolean, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      com.google.android.gms.wearable.service.WearableChimeraService.a(axue, aygz, boolean):void */
    /* renamed from: a */
    public final void mo60325a(axue axue, aygz aygz) {
        mo60326a(axue, aygz, false);
    }

    /* renamed from: a */
    public final void mo60326a(axue axue, aygz aygz, boolean z) {
        ayja ayja;
        if (Log.isLoggable("WearableService", 2)) {
            String str = axue.f96377a;
            String str2 = !z ? " " : " liveListenersOnly";
            String valueOf = String.valueOf(aygz);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + str2.length() + String.valueOf(valueOf).length());
            sb.append("queueEventAndNotify: ");
            sb.append(str);
            sb.append(str2);
            sb.append(valueOf);
            Log.v("WearableService", sb.toString());
        }
        if (!z) {
            aygj a = mo60323a(axue);
            aygg aygg = this.f111009J;
            if (!(a == null || aygg == null)) {
                int aq = (int) chnj.f188812a.mo6606a().mo85418aq();
                Intent intent = aygz.f97558h;
                HashSet<aygk> hashSet = new HashSet(a.f97524b);
                if (intent.getPackage() == null) {
                    intent = new Intent(intent).setPackage(a.f97527e.f96378b);
                }
                List<ResolveInfo> queryIntentServices = a.f97523a.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null) {
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        hashSet.add(a.mo54006a(resolveInfo.serviceInfo.name, a.f97528f));
                    }
                }
                for (aygk aygk : hashSet) {
                    synchronized (aygk.f97534d) {
                        aygk.f97534d.add(aygz);
                    }
                    Message obtainMessage = aygg.obtainMessage(1);
                    obtainMessage.obj = aygk;
                    Intent intent2 = aygz.f97558h;
                    if (intent2.getPackage() != null && !"com.google.android.gms.wearable.CAPABILITY_CHANGED".equals(intent2.getAction())) {
                        obtainMessage.sendToTarget();
                    } else if (!aygg.hasMessages(obtainMessage.what, obtainMessage.obj)) {
                        aygg.sendMessageDelayed(obtainMessage, (long) this.f111015P.nextInt(aq));
                    }
                }
            }
        }
        WeakReference weakReference = (WeakReference) this.f111008I.get(axue);
        if (weakReference != null) {
            ayja = (ayja) weakReference.get();
        } else {
            ayja = null;
        }
        aygh aygh = this.f111010K;
        if (ayja != null && aygh != null) {
            ayja.f97724c.add(aygz);
            Message obtainMessage2 = aygh.obtainMessage(1);
            obtainMessage2.obj = ayja;
            obtainMessage2.sendToTarget();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        ConcurrentHashMap concurrentHashMap;
        ayja ayja;
        TelecomManager telecomManager;
        ayja ayja2;
        sjj sjj2 = sjj;
        if (this.f111016Q) {
            aygj b = mo60328b(getServiceRequest.f30230d);
            if (b == null) {
                sjj2.mo25644a(8, null);
                return;
            }
            axue axue = b.f97527e;
            ConcurrentHashMap concurrentHashMap2 = this.f111008I;
            synchronized (concurrentHashMap2) {
                try {
                    WeakReference weakReference = (WeakReference) this.f111008I.get(axue);
                    ayja = weakReference != null ? (ayja) weakReference.get() : null;
                    if (ayja == null) {
                        if (Log.isLoggable("WearableService", 3)) {
                            String valueOf = String.valueOf(axue);
                            String str = weakReference != null ? " (stubRef expired)" : " (no stubRef)";
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + str.length());
                            sb.append("Creating stub for AppKey: ");
                            sb.append(valueOf);
                            sb.append(str);
                            Log.d("WearableService", sb.toString());
                        }
                        int i = Build.VERSION.SDK_INT;
                        telecomManager = (TelecomManager) getSystemService("telecom");
                        ayja ayja3 = ayja2;
                        concurrentHashMap = concurrentHashMap2;
                        axue axue2 = axue;
                        try {
                            ayja2 = new ayja(getPackageManager(), axxv.f96690a, axzm.f96829a, axuv.f96418a, axue, this.f111014O, ayha.m83997c(), this.f111011L, ayai.f96907a, telecomManager, aybd.f97009a, axpc.f96234a, aybk.f97029b, aybi.f97027b, this, ayha.m83998d(), rfz.m33557a(this), axto.m83185a(this), b.f97525c, b.f97526d, this.f111029w, this.f111030x);
                            ayja = ayja3;
                            this.f111008I.put(axue2, new WeakReference(ayja));
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        concurrentHashMap = concurrentHashMap2;
                    }
                } catch (NoClassDefFoundError e) {
                    int i2 = Build.VERSION.SDK_INT;
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append("Could not get TELECOM_SERVICE in SDK ");
                    sb2.append(i2);
                    Log.w("WearableService", sb2.toString());
                    telecomManager = null;
                } catch (Throwable th2) {
                    th = th2;
                    concurrentHashMap = concurrentHashMap2;
                    throw th;
                }
                sjj.mo25645a(ayja);
                return;
            }
        }
        Log.w("WearableService", "onGetService: Wear is not available on this device.");
        sjj2.mo25644a(16, null);
        stopSelf();
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.mo26034a();
        this.f111014O.mo53558a(ssb, z, z2);
        ssb.mo26035b();
        ssb.println("EventHandler:");
        ssb.mo26034a();
        this.f111009J.dump(ssb, "");
        ssb.mo26035b();
        ssb.println("LiveListenerEventHandler:");
        ssb.mo26034a();
        this.f111010K.dump(ssb, "");
        ssb.mo26035b();
        ssb.println("Stubs:");
        ssb.mo26034a();
        for (Map.Entry entry : this.f111008I.entrySet()) {
            ayja ayja = (ayja) ((WeakReference) entry.getValue()).get();
            if (ayja != null) {
                ssb.println(entry.getKey());
                ssb.mo26034a();
                ayja.mo53558a(ssb, z, z2);
                ssb.mo26035b();
            }
        }
        ssb.mo26035b();
    }

    /* renamed from: a */
    public final boolean mo60327a(String str) {
        return this.f111028t.contains(str);
    }
}
