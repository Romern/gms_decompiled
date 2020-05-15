package com.google.android.gms.nearby.messages.service;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Service;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;
import com.google.android.gms.nearby.messages.GcmChimeraBroadcastReceiver;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyMessagesChimeraService extends Service implements ahha {

    /* renamed from: a */
    public static final Object f80800a = new Object();

    /* renamed from: b */
    public static final bnic f80801b = bnic.m109489a("android.permission-group.MICROPHONE");

    /* renamed from: c */
    public static final Map f80802c = sqw.m36035a((Object[]) new String[]{"android.permission-group.MICROPHONE"}, (Object[]) new Integer[]{Integer.valueOf((int) C0126R.string.messages_microphone_permission)});

    /* renamed from: k */
    private static boolean f80803k;

    /* renamed from: p */
    private static WeakReference f80804p;

    /* renamed from: d */
    public Map f80805d;

    /* renamed from: e */
    public CountDownLatch f80806e;

    /* renamed from: f */
    public CopresenceBroadcastReceiver f80807f;

    /* renamed from: g */
    public ajgk f80808g;

    /* renamed from: h */
    public ahgz f80809h;

    /* renamed from: i */
    public buqh f80810i;

    /* renamed from: j */
    public aiwj f80811j;

    /* renamed from: l */
    private ServiceConnection f80812l;

    /* renamed from: m */
    private BroadcastReceiver f80813m;

    /* renamed from: n */
    private BroadcastReceiver f80814n;

    /* renamed from: o */
    private sss f80815o;

    /* renamed from: q */
    private final buqn f80816q = new ajfg(this, "resubscribeOnGmsCoreRestart");

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class AppUninstallAndForceStopReceiver extends aacn {
        public AppUninstallAndForceStopReceiver() {
            super("nearby");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            srn srn = ahfq.f67120a;
            intent.getAction();
            Uri data = intent.getData();
            if (data != null) {
                NearbyMessagesChimeraService.this.m67416a(data.getSchemeSpecificPart(), true);
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class OptInChangeBroadcastReceiver extends aacn {
        public OptInChangeBroadcastReceiver() {
            super("nearby");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            NearbyMessagesChimeraService nearbyMessagesChimeraService = NearbyMessagesChimeraService.this;
            Object obj = NearbyMessagesChimeraService.f80800a;
            nearbyMessagesChimeraService.f80810i.mo72987c(new ajfp(this, "OptInChangeBroadcastReceiver.onReceive", intent, context));
        }
    }

    /* renamed from: e */
    public static synchronized ahgz m67417e() {
        ahgz ahgz;
        synchronized (NearbyMessagesChimeraService.class) {
            ahgz = f80804p != null ? (ahgz) f80804p.get() : null;
        }
        return ahgz;
    }

    /* renamed from: f */
    private final void m67418f() {
        this.f80810i.mo72987c(new ajff(this, "NearbyMessagesService.stopServiceIfIdle"));
    }

    /* renamed from: a */
    public final ahgz mo7339a() {
        return this.f80809h;
    }

    /* renamed from: b */
    public final void mo44373b() {
        try {
            this.f80811j.mo38159a();
            if (cfop.m141879i()) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : this.f80811j.mo38162b()) {
                    SubscribeRequest b = aiwj.m58074b(bundle);
                    ClientAppIdentifier e = aiwj.m58077e(bundle);
                    if (e == null) {
                        bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                        bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "b", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("NearbyMessagesService: Failed resubscribing, null client for subscribe request: %s", b);
                    } else {
                        ajaj b2 = ((ajbn) this.f80809h.mo36473a(ajbn.class)).mo38452b(e);
                        if (!mo44372a(aiwj.m58076d(bundle), b, e, aiwj.m58078f(bundle), b2.mo36468d())) {
                            this.f80811j.mo38161a(bundle);
                        }
                        arrayList.add(b2);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ajaj) arrayList.get(i)).mo36466c();
                }
            } else {
                ajaj ajaj = ((ajbn) this.f80809h.mo36473a(ajbn.class)).f70333g;
                List d = ajaj.mo36468d();
                for (Bundle bundle2 : this.f80811j.mo38162b()) {
                    if (!mo44372a(aiwj.m58076d(bundle2), aiwj.m58074b(bundle2), aiwj.m58077e(bundle2), aiwj.m58078f(bundle2), d)) {
                        this.f80811j.mo38161a(bundle2);
                    }
                }
                ajaj.mo36466c();
            }
            Map map = this.f80805d;
            if (map == null || map.isEmpty()) {
                stopSelf();
            }
        } catch (InterruptedException | TimeoutException e2) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "b", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Exception while waiting for BackgroundSubscribeCache init.");
            stopSelf();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajaf.a(byzr[], boolean):void
     arg types: [byzr[], int]
     candidates:
      ajaf.a(java.util.Set, boolean):void
      ajaf.a(byzr[], boolean):void */
    /* renamed from: c */
    public final void mo44374c() {
        List list;
        aucb a = ((afkl) this.f80809h.mo36473a(afkl.class)).mo34919a(cfop.f185115a.mo6606a().mo82199C(), "com.google.android.gms");
        try {
            aucu.m76783a(a, (long) ((int) cfop.f185115a.mo6606a().mo82200D()), TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) a.mo50386d();
            if (fileGroupResponse == null || (list = fileGroupResponse.f79963c) == null || list.isEmpty()) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "c", 1000, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("MDD response is empty");
                return;
            }
            befa befa = new befa(Collections.singletonList((behy) this.f80809h.mo36473a(behy.class)));
            Uri parse = Uri.parse(((MddFile) fileGroupResponse.f79963c.get(0)).f79970b);
            try {
                bzco bzco = (bzco) GeneratedMessageLite.m124016a(bzco.f169385f, (byte[]) befa.mo60643a(parse, behp.m95056a(), new beer[0]), bxus.m123744c());
                ((ajeq) this.f80809h.mo36473a(ajeq.class)).mo38556a(ClientAppIdentifier.m67376a("com.google.android.gms", new ClientAppContext(getPackageName(), "0p:discoverer"))).mo38362a((byzr[]) bzco.f169389c.toArray(new byzr[0]), true);
                ((ajai) this.f80809h.mo36473a(ajai.class)).mo38390a((byyr[]) bzco.f169391e.toArray(new byyr[0]));
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "c", 1023, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Cache does not populate correctly");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "c", 995, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("mdd task does not finish");
        }
    }

    /* renamed from: d */
    public final boolean mo44375d() {
        try {
            this.f80811j.mo38159a();
            if (!this.f80811j.mo38162b().isEmpty()) {
                return false;
            }
            aiyh aiyh = (aiyh) this.f80809h.mo36473a(aiyh.class);
            aiyh.f70062d.mo72984b();
            aiyh.mo38267c();
            if (!aiyh.f70061c.isEmpty() || !Collections.unmodifiableSet(((aiyh) this.f80809h.mo36473a(aiyh.class)).f70060b.keySet()).isEmpty() || !((aiyr) this.f80809h.mo36473a(aiyr.class)).mo38302d() || !new HashSet(((aiyr) this.f80809h.mo36473a(aiyr.class)).f70092c.mo67317p()).isEmpty() || ((aiwq) this.f80809h.mo36473a(aiwq.class)).mo38175a()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "d", 1109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception while waiting for BackgroundSubscribeCache init.");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f80810i.mo72987c(new ajfo(this, "NearbyMessagesService.dump", printWriter, countDownLatch));
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "dump", 1079, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted during dump");
        }
    }

    public final IBinder onBind(Intent intent) {
        srn srn = ahfq.f67120a;
        hashCode();
        if ("com.google.android.gms.nearby.messages.service.NearbyMessagesService.START".equals(intent.getAction())) {
            return new ajfq(this);
        }
        if (!"com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE".equals(intent.getAction())) {
            return null;
        }
        aiyb.m58178a(this);
        synchronized (NearbyMessagesChimeraService.class) {
            f80804p = new WeakReference(this.f80809h);
        }
        return new ajfq(this);
    }

    public final void onCreate() {
        super.onCreate();
        srn srn = ahfq.f67120a;
        hashCode();
        ahgz ahgz = new ahgz(this);
        ahgz.mo36475a(new ajft());
        this.f80809h = ahgz;
        this.f80808g = new ajgk(this);
        buqh buqh = (buqh) this.f80809h.mo36473a(buqh.class);
        this.f80810i = buqh;
        try {
            buqh.mo72982a(new ajfh(this, "EventLoop.Initializer"));
            this.f80806e = new CountDownLatch(1);
            if (this.f80812l == null) {
                this.f80812l = new ajfn(this, "nearby");
                skh.m35531a().mo25690a(this, buyd.m120746a(this), this.f80812l, 1);
            }
            this.f80810i.mo72987c(new ajfi(this, "resetNearbyDirect"));
            OptInChangeBroadcastReceiver optInChangeBroadcastReceiver = new OptInChangeBroadcastReceiver();
            this.f80813m = optInChangeBroadcastReceiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.nearby.settings.MESSAGES_OPT_IN_CHANGE");
            registerReceiver(optInChangeBroadcastReceiver, intentFilter);
            AppUninstallAndForceStopReceiver appUninstallAndForceStopReceiver = new AppUninstallAndForceStopReceiver();
            this.f80814n = appUninstallAndForceStopReceiver;
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter2.addDataScheme("package");
            registerReceiver(appUninstallAndForceStopReceiver, intentFilter2);
            CopresenceBroadcastReceiver copresenceBroadcastReceiver = this.f80807f;
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
            registerReceiver(copresenceBroadcastReceiver, intentFilter3);
            sss a = sss.m36260a(this);
            this.f80815o = a;
            a.mo26059a(new ajfs(this), new adzt());
            this.f80811j = new aiwj(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "onCreate", 384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted during initialization");
            Thread.currentThread().interrupt();
        }
    }

    public final void onDestroy() {
        srn srn = ahfq.f67120a;
        hashCode();
        try {
            ajfj ajfj = new ajfj(this, "destroyLocator");
            if (!cfop.f185115a.mo6606a().mo82203G()) {
                this.f80810i.mo72982a(ajfj);
            } else {
                ((buqm) this.f80810i.f154703a).mo72995a(ajfj, true);
            }
            synchronized (NearbyMessagesChimeraService.class) {
                f80804p = null;
            }
        } catch (InterruptedException e) {
            try {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "onDestroy", 453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.f80809h.mo36474a();
                synchronized (NearbyMessagesChimeraService.class) {
                    f80804p = null;
                }
            } catch (Throwable th) {
                synchronized (NearbyMessagesChimeraService.class) {
                    f80804p = null;
                    throw th;
                }
            }
        }
        try {
            unregisterReceiver(this.f80814n);
            unregisterReceiver(this.f80813m);
            unregisterReceiver(this.f80807f);
            this.f80815o.mo26061b();
        } catch (IllegalArgumentException e2) {
        }
        if (this.f80812l != null) {
            try {
                skh.m35531a().mo25689a(this, this.f80812l);
            } catch (IllegalArgumentException e3) {
                if (cfop.f185115a.mo6606a().mo82201E()) {
                    throw e3;
                }
            }
            this.f80809h.mo36476a(buye.class, (Object) null);
            this.f80812l = null;
        }
        super.onDestroy();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService.a(com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService, java.lang.String):void
      com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService.a(java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        boolean z2 = true;
        try {
            if (!f80803k) {
                f80803k = true;
                ((buqh) this.f80809h.mo36473a(buqh.class)).mo72987c(this.f80816q);
                z = false;
            } else {
                z = true;
            }
            if (intent == null) {
                try {
                    srn srn = ahfq.f67120a;
                    hashCode();
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    if (z2) {
                        m67418f();
                    }
                    throw th;
                }
            } else {
                srn srn2 = ahfq.f67120a;
                hashCode();
                intent.getAction();
                if (rsk.m34335a(intent)) {
                    aiwj aiwj = this.f80811j;
                    aiwj.f69937a.mo25070c(intent);
                    if (aiwj.f69937a.mo25065a()) {
                        aiwj.f69938b.countDown();
                    }
                } else if ("com.google.android.gms.nearby.messages.service.STOP_CLIENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.messages.CALLING_APP_PACKAGE_NAME");
                    if (stringExtra == null) {
                        bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "onStartCommand", 570, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Missing CallingAppPackageName in Intent.");
                    } else {
                        m67416a(stringExtra, false);
                    }
                } else {
                    int i3 = GcmChimeraBroadcastReceiver.f80673b;
                    if (!intent.getBooleanExtra("isCopresenceGcm", false)) {
                        if (!"com.google.android.gms.nearby.messages.service.START_SERVICE_PERSISTENT".equals(intent.getAction())) {
                            if ("com.google.android.gms.nearby.messages.service.POPULATE_CACHE".equals(intent.getAction())) {
                                this.f80810i.mo72987c(new ajfm(this, "offlineCachePopulate"));
                            }
                        }
                        return 1;
                    }
                    this.f80810i.mo72987c(new ajfl(this, "handleGcmMessage", intent));
                }
            }
            if (z) {
                m67418f();
            }
            return 1;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajgf.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      ajgf.a(com.google.android.gms.nearby.messages.internal.ClientAppContext, java.lang.String):void
      ajgf.a(boolean, boolean):void */
    public final boolean onUnbind(Intent intent) {
        srn srn = ahfq.f67120a;
        hashCode();
        synchronized (f80800a) {
            Map map = this.f80805d;
            if (map != null) {
                for (ajgf ajgf : map.values()) {
                    ajgf.mo38596a(false, true);
                }
            }
        }
        this.f80810i.mo72987c(new ajfk(this, "discardForegroundImpls"));
        m67418f();
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajgf.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      ajgf.a(com.google.android.gms.nearby.messages.internal.ClientAppContext, java.lang.String):void
      ajgf.a(boolean, boolean):void */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m67416a(String str, boolean z) {
        srn srn = ahfq.f67120a;
        bngx a = mo44371a(str);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((ajgf) a.get(i)).mo38596a(z, false);
        }
    }

    /* renamed from: a */
    public final ajgf mo44370a(ClientAppIdentifier clientAppIdentifier) {
        ajgf ajgf;
        synchronized (f80800a) {
            if (this.f80805d == null) {
                this.f80805d = new C1223np();
            }
            ajgf = (ajgf) this.f80805d.get(clientAppIdentifier);
            if (ajgf == null) {
                ajgf = new ajgf(this, clientAppIdentifier, this.f80811j);
                this.f80805d.put(clientAppIdentifier, ajgf);
            }
        }
        return ajgf;
    }

    /* renamed from: a */
    public final bngx mo44371a(String str) {
        String str2;
        synchronized (f80800a) {
            if (this.f80805d != null) {
                ArrayList arrayList = new ArrayList(2);
                for (Map.Entry entry : this.f80805d.entrySet()) {
                    ClientAppContext clientAppContext = ((ClientAppIdentifier) entry.getKey()).f80668c;
                    if (clientAppContext.f80723b.equals(str) || (clientAppContext.f80723b.equals("com.google.android.gms") && (str2 = clientAppContext.f80724c) != null && str2.equals(str))) {
                        arrayList.add((ajgf) entry.getValue());
                    }
                }
                bngx a = bngx.m109368a((Collection) arrayList);
                return a;
            }
            bngx e = bngx.m109376e();
            return e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo44372a(long j, SubscribeRequest subscribeRequest, ClientAppIdentifier clientAppIdentifier, String str, List list) {
        String a;
        SubscribeRequest subscribeRequest2 = subscribeRequest;
        ClientAppIdentifier clientAppIdentifier2 = clientAppIdentifier;
        if (subscribeRequest2 == null || clientAppIdentifier2 == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("NearbyMessagesService: Failed resubscribing, null subscribeRequest(%s) or clientAppIdentifier(%s).", subscribeRequest2, clientAppIdentifier2);
            return false;
        }
        int elapsedRealtime = j != Long.MAX_VALUE ? (int) ((j - SystemClock.elapsedRealtime()) / 1000) : Integer.MAX_VALUE;
        PendingIntent pendingIntent = subscribeRequest2.f80765f;
        if (!(elapsedRealtime <= 0 || pendingIntent == null || (a = ajcp.m58515a(pendingIntent)) == null)) {
            try {
                if (getPackageManager().getApplicationInfo(a, 0).enabled && !subscribeRequest2.f80774o) {
                    if (!list.isEmpty()) {
                        aiyn aiyn = new aiyn(pendingIntent);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            byzr byzr = (byzr) it.next();
                            byze byze = byzr.f169154c;
                            if (byze == null) {
                                byze = byze.f169064e;
                            }
                            Message a2 = ajek.m58601a(byze);
                            if (cfop.m141879i()) {
                                if (subscribeRequest2.f80764e.mo44310a(a2)) {
                                    ajdv ajdv = new ajdv();
                                    ajdv.f70402b = a2;
                                    ajdv.mo38533d();
                                    aiyn.mo38276a(this, ajdv.mo38525a());
                                }
                            } else if (byzr.f169153b.contains(str)) {
                                ajdv ajdv2 = new ajdv();
                                ajdv2.f70402b = a2;
                                ajdv2.mo38533d();
                                aiyn.mo38276a(this, ajdv2.mo38525a());
                            }
                        }
                    }
                    aiyi aiyi = new aiyi(subscribeRequest2.f80762c);
                    aiyi.mo38270a(elapsedRealtime);
                    Strategy a3 = aiyi.mo38269a();
                    SubscribeRequest subscribeRequest3 = new SubscribeRequest(null, a3, null, subscribeRequest2.f80764e, subscribeRequest2.f80765f, subscribeRequest2.f80769j, null, false, subscribeRequest2.f80775p, subscribeRequest2.f80776q);
                    ajgf a4 = mo44370a(clientAppIdentifier2);
                    if (a3.mo44318c()) {
                        a4.mo38594a(2);
                    }
                    if (a3.mo44319d()) {
                        a4.mo38594a(6);
                    }
                    if (a3.mo44320e()) {
                        a4.mo38594a(1);
                    }
                    a4.mo38486a(subscribeRequest3);
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }
}
