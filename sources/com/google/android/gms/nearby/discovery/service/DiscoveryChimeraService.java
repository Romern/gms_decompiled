package com.google.android.gms.nearby.discovery.service;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.nearby.discovery.fastpair.autotest.AutoTestBroadcastReceiver;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DiscoveryChimeraService extends Service implements ahha, aicq {

    /* renamed from: A */
    private busf f80529A;

    /* renamed from: a */
    public ahgz f80530a;

    /* renamed from: b */
    public ahsa f80531b;

    /* renamed from: c */
    public ahst f80532c;

    /* renamed from: d */
    public aibm f80533d;

    /* renamed from: e */
    public buqh f80534e;

    /* renamed from: f */
    public aicw f80535f;

    /* renamed from: g */
    public aict f80536g;

    /* renamed from: h */
    public ahsh f80537h;

    /* renamed from: i */
    public ahsi f80538i;

    /* renamed from: j */
    public aics f80539j;

    /* renamed from: k */
    public ahtz f80540k;

    /* renamed from: l */
    public apr f80541l;

    /* renamed from: m */
    public aiba f80542m;

    /* renamed from: n */
    private final IntentReceiver f80543n = new IntentReceiver();

    /* renamed from: o */
    private final GuardedIntentReceiver f80544o = new GuardedIntentReceiver();

    /* renamed from: p */
    private AutoTestBroadcastReceiver f80545p;

    /* renamed from: q */
    private burh f80546q;

    /* renamed from: r */
    private Executor f80547r = snp.m35704b(10);

    /* renamed from: s */
    private final buqn f80548s = new aiar(this, "stopIfNotScheduled");

    /* renamed from: t */
    private final buqn f80549t = new aias(this, "unsubscribeAndClearData");

    /* renamed from: u */
    private final buqn f80550u = new aiat(this, "subscribe");

    /* renamed from: v */
    private aiba f80551v;

    /* renamed from: w */
    private boolean f80552w = false;

    /* renamed from: x */
    private final Object f80553x = new Object();

    /* renamed from: y */
    private Executor f80554y;

    /* renamed from: z */
    private burw f80555z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GuardedIntentReceiver extends aacn {
        public GuardedIntentReceiver() {
            super("nearby");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if (ahtz.m56655a(intent.getAction())) {
                DiscoveryChimeraService.this.f80534e.mo72987c(new aibb(this, "fastPairGuardedBroadcastHandler", intent));
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class IntentReceiver extends aacn {
        public IntentReceiver() {
            super("nearby");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if (ahtz.m56655a(intent.getAction())) {
                DiscoveryChimeraService.this.f80534e.mo72987c(new aibc(this, "fastPairBroadcastHandler", intent));
            }
        }
    }

    /* renamed from: a */
    public static Intent m67336a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    /* renamed from: b */
    public static PendingIntent m67338b(Context context) {
        return PendingIntent.getService(context, 0, m67336a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_MESSAGES_CALLBACK"), 134217728);
    }

    /* renamed from: e */
    private final void m67340e() {
        this.f80534e.mo72989e(this.f80548s);
        mo44202b();
    }

    /* renamed from: f */
    private final void m67341f() {
        if (!burl.m120294a(this, ahfl.m55644a(this)) || !this.f80546q.mo73040d()) {
            m67343h();
        } else {
            m67342g();
        }
    }

    /* renamed from: g */
    private final void m67342g() {
        this.f80534e.mo72987c(this.f80550u);
        m67344i();
    }

    /* renamed from: h */
    private final void m67343h() {
        this.f80534e.mo72989e(this.f80548s);
        this.f80534e.mo72987c(this.f80549t);
        this.f80534e.mo72987c(this.f80548s);
    }

    /* renamed from: i */
    private final void m67344i() {
        this.f80534e.mo72989e(this.f80548s);
        long W = cfod.f184793a.mo6606a().mo81901W();
        srn srn = ahsd.f67925a;
        this.f80534e.mo72983a(this.f80548s, W);
    }

    /* renamed from: a */
    public final ahgz mo7339a() {
        return this.f80530a;
    }

    /* renamed from: c */
    public final void mo44203c() {
        srn srn = ahsd.f67925a;
        aics aics = this.f80539j;
        if (cfoj.m141522C() && cfoj.m141550ae()) {
            aics.f68715l.mo37312d();
        }
        aics.f68718o.shutdownNow();
        AtomicReference atomicReference = new AtomicReference();
        try {
            aics.f68704a.mo72982a(new aicj(aics, "FastPairControllerOnDestroy", atomicReference));
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: OnDestroy: Fail to unregister listeners");
        }
        CountDownLatch countDownLatch = (CountDownLatch) atomicReference.get();
        if (countDownLatch != null) {
            try {
                System.currentTimeMillis();
                countDownLatch.await(cfog.m141274b(), TimeUnit.MILLISECONDS);
                System.currentTimeMillis();
                countDownLatch.getCount();
            } catch (InterruptedException e2) {
                bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("FastPair: OnDestroy: Interrupted when countdown");
            }
        }
        if (!cfod.m141148h()) {
            this.f80534e.mo72987c(new aiaq(this, "ReadyForDestroy"));
        } else if (cfod.m141149i()) {
            this.f80534e.mo72987c(new aiao(this, "DestroyEventLoop"));
        } else {
            try {
                this.f80534e.mo72982a(new aiap(this, "onDestroy"));
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                bnsl bnsl3 = (bnsl) ahsd.f67925a.mo68387b();
                bnsl3.mo68437a(e3);
                bnsl3.mo68405a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.f80530a.mo36474a();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahxa.a(bvkr, boolean):ahyx
     arg types: [bvkr, int]
     candidates:
      ahxa.a(android.bluetooth.le.ScanResult, int):ahyw
      ahxa.a(ahyw, android.bluetooth.le.ScanResult):void
      ahxa.a(android.bluetooth.le.ScanResult, ahyw):void
      ahxa.a(bvkr, boolean):ahyx */
    /* renamed from: d */
    public final void mo44204d() {
        List list;
        aucb a = ((afkl) this.f80530a.mo36473a(afkl.class)).mo34919a(cfog.f184854a.mo6606a().mo81956R(), "com.google.android.gms");
        try {
            aucu.m76783a(a, (long) ((int) cfog.f184854a.mo6606a().mo81957S()), TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) a.mo50386d();
            if (fileGroupResponse == null || (list = fileGroupResponse.f79963c) == null || list.isEmpty()) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairOffline: MDD response is empty");
                return;
            }
            befa befa = new befa(Collections.singletonList((behy) this.f80530a.mo36473a(behy.class)));
            Uri parse = Uri.parse(((MddFile) fileGroupResponse.f79963c.get(0)).f79970b);
            try {
                ahyu ahyu = (ahyu) GeneratedMessageLite.m124016a(ahyu.f68386b, (byte[]) befa.mo60643a(parse, behp.m95056a(), new beer[0]), bxus.m123744c());
                srn srn = ahsd.f67925a;
                ahyu.f68388a.size();
                ahxa ahxa = (ahxa) this.f80530a.mo36473a(ahxa.class);
                for (bvkr bvkr : ahyu.f68388a) {
                    ahxa.mo37250a(bvkr, false);
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("FastPair: finished offline cache populate device number in cache: %s", ahxa.f68273a.mo36468d().size());
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPairOffline: Cache does not populate correctly");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68405a("FastPairOffline: mdd task does not finish");
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            this.f80534e.mo72982a(new aian(this, "dump", printWriter));
        } catch (InterruptedException e) {
            printWriter.format("Failed to dump: %s\n", e);
        }
    }

    public final IBinder onBind(Intent intent) {
        srn srn = ahsd.f67925a;
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            if (this.f80542m == null) {
                this.f80542m = new aiba(this, this.f80534e);
            }
            return this.f80542m;
        } else if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction())) {
            if (this.f80551v == null) {
                this.f80551v = new aiba(this, this.f80534e);
            }
            return this.f80551v;
        } else if ("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE".equals(intent.getAction())) {
            if (this.f80555z == null) {
                this.f80555z = new burw(this);
            }
            return this.f80555z;
        } else if (!"com.google.android.gms.nearby.discovery.ACTION_START_PAIRING_WITH_PROGRESS".equals(intent.getAction())) {
            return null;
        } else {
            if (this.f80529A == null) {
                this.f80529A = new busf(this.f80539j);
            }
            return this.f80529A;
        }
    }

    public final void onCreate() {
        super.onCreate();
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DiscoveryService created");
        ahgz ahgz = new ahgz(this);
        this.f80530a = ahgz;
        ahgz.mo36475a(new ahrp());
        this.f80531b = (ahsa) ahgz.m55754a(this, ahsa.class);
        this.f80533d = (aibm) ahgz.m55754a(this, aibm.class);
        this.f80536g = (aict) ahgz.m55754a(this, aict.class);
        this.f80539j = (aics) ahgz.m55754a(this, aics.class);
        this.f80540k = new ahtz(this);
        this.f80532c = (ahst) ahgz.m55754a(this, ahst.class);
        this.f80546q = (burh) ahgz.m55754a(this, burh.class);
        this.f80534e = (buqh) ahgz.m55754a(this, buqh.class);
        this.f80535f = (aicw) ahgz.m55754a(this, aicw.class);
        this.f80537h = (ahsh) ahgz.m55754a(this, ahsh.class);
        this.f80538i = (ahsi) ahgz.m55754a(this, ahsi.class);
        this.f80539j.f68720q = this;
        int i = 0;
        if (!cfom.m141867b()) {
            List a = ahtz.m56654a();
            if (!a.isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    intentFilter.addAction((String) a.get(i2));
                }
                registerReceiver(this.f80543n, intentFilter);
            }
            List b = ahtz.m56656b();
            if (!b.isEmpty()) {
                IntentFilter intentFilter2 = new IntentFilter();
                int size2 = b.size();
                while (i < size2) {
                    intentFilter2.addAction((String) b.get(i));
                    i++;
                }
                ahhd.m55767a(this, this.f80544o, intentFilter2);
            }
        } else if (cfod.m141153m()) {
            List a2 = ahtz.m56654a();
            if (!a2.isEmpty()) {
                IntentFilter intentFilter3 = new IntentFilter();
                int size3 = a2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    intentFilter3.addAction((String) a2.get(i3));
                }
                registerReceiver(this.f80543n, intentFilter3);
            }
            List b2 = ahtz.m56656b();
            if (!b2.isEmpty()) {
                IntentFilter intentFilter4 = new IntentFilter();
                int size4 = b2.size();
                while (i < size4) {
                    intentFilter4.addAction((String) b2.get(i));
                    i++;
                }
                ahhd.m55767a(this, this.f80544o, intentFilter4);
            }
        }
        if (cfoj.m141545Z()) {
            AutoTestBroadcastReceiver autoTestBroadcastReceiver = new AutoTestBroadcastReceiver(this);
            this.f80545p = autoTestBroadcastReceiver;
            IntentFilter intentFilter5 = new IntentFilter();
            bnrd a3 = AutoTestBroadcastReceiver.f80498a.iterator();
            while (a3.hasNext()) {
                intentFilter5.addAction((String) a3.next());
            }
            autoTestBroadcastReceiver.f80500c.registerReceiver(autoTestBroadcastReceiver, intentFilter5);
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTestReceiver: Receiver registered!");
        }
        m67337a(new aiah(this));
    }

    public final void onDestroy() {
        if (cfod.m141153m()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairHandler: unregistering intent receivers");
            ahhd.m55766a(this, this.f80544o);
            ahhd.m55766a(this, this.f80543n);
        }
        AutoTestBroadcastReceiver autoTestBroadcastReceiver = this.f80545p;
        if (autoTestBroadcastReceiver != null) {
            ahhd.m55766a(autoTestBroadcastReceiver.f80500c, autoTestBroadcastReceiver);
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DiscoveryService destroyed");
        if (!cfod.m141148h()) {
            try {
                this.f80534e.mo72982a(new aiam(this, "onDestroy"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.f80530a.mo36474a();
            }
        } else {
            if (cfod.m141149i()) {
                try {
                    this.f80534e.mo72982a(new aial(this, "onDestroy"));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68405a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                    this.f80530a.mo36474a();
                }
            }
            m67337a(new aiai(this));
        }
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:207:0x058d, code lost:
        return 2;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x002e=Splitter:B:15:0x002e, B:208:0x058e=Splitter:B:208:0x058e} */
    public final synchronized int onStartCommand(Intent intent, int i, int i2) {
        char c;
        String stringExtra;
        Intent intent2 = intent;
        synchronized (this) {
            if (intent2 != null) {
                if (intent.getAction() != null) {
                    if (this.f80552w) {
                        if (!cfod.m141148h()) {
                            ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("DiscoveryService is now destroying, skip %s", intent.getAction());
                            return 2;
                        }
                    }
                    Bundle extras = intent.getExtras();
                    srn srn = ahsd.f67925a;
                    intent.getAction();
                    if (cfod.m141153m() && ahtz.m56655a(intent.getAction())) {
                        this.f80534e.mo72987c(new aiau(this, "fastPairHandleIntent", intent2));
                    }
                    String action = intent.getAction();
                    switch (action.hashCode()) {
                        case -1985371032:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1852939788:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_DEBUG_CHANGE")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1703372784:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_CANCEL_FAST_PAIR")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1582561631:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1530327060:
                            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1331063108:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_SET_MASTER_SWITCH")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1094157721:
                            if (action.equals("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case -883289033:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case -867080949:
                            if (action.equals("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case -368627191:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_SET_BEACON_SETTINGS")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case -366060771:
                            if (action.equals("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_DEVICE_ADDED")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case -362543359:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_INIT_MESSAGES_PATH")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -301431627:
                            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -102165123:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_LOCALE_CHANGE")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 411712845:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 545516589:
                            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                                c = 12;
                                break;
                            }
                            c = 65535;
                            break;
                        case 579327048:
                            if (action.equals("android.bluetooth.device.action.BATTERY_LEVEL_CHANGED")) {
                                c = 10;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1174571750:
                            if (action.equals("android.bluetooth.device.action.ALIAS_CHANGED")) {
                                c = 9;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1244161670:
                            if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1821585647:
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                                c = 8;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1949616771:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2068642361:
                            if (action.equals("com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2094935584:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_MESSAGES_CALLBACK")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2108582660:
                            if (action.equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR")) {
                                c = 13;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2116862345:
                            if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                                c = 6;
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
                            this.f80534e.mo72987c(new aiav(this, "reenableSystemDisabledItems"));
                            m67341f();
                            break;
                        case 1:
                            ajcc.m58482a(intent2, this.f80531b.f67914d);
                            m67344i();
                            break;
                        case 2:
                            if (cfoj.m141549ad()) {
                                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DiscoveryService created for ACTION_STATE_CHANGED.");
                                aics aics = this.f80539j;
                                if (intent2.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) != 10) {
                                    ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("FastPair: BluetoothAdapter state change to (%s).", intent2.getIntExtra("android.bluetooth.adapter.extra.STATE", 10));
                                    break;
                                } else {
                                    aics.f68704a.mo72987c(new aibw(aics, "onAdapterStateOff"));
                                    break;
                                }
                            }
                            break;
                        case 3:
                            m67341f();
                            break;
                        case 4:
                        case 5:
                            this.f80534e.mo72987c(this.f80549t);
                            m67341f();
                            break;
                        case 6:
                            aics aics2 = this.f80539j;
                            int intExtra = intent2.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                            int intExtra2 = intent2.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE);
                            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68426a("FastPair: onBondStateChange: prevState=%s, state=%s, device=%s, isFastPairing=%s", Integer.valueOf(intExtra2), Integer.valueOf(intExtra), bluetoothDevice, Boolean.valueOf(aics2.f68721r));
                            if (bluetoothDevice != null) {
                                aics2.f68704a.mo72987c(new aibu(aics2, "bondStateChanged", intExtra, bluetoothDevice, intExtra2));
                            }
                            m67344i();
                            break;
                        case 7:
                            this.f80539j.mo37403a(intent2, aicp.CONNECTED);
                            m67344i();
                            break;
                        case 8:
                            this.f80539j.mo37403a(intent2, aicp.DISCONNECTED);
                            m67344i();
                            break;
                        case 9:
                            aics aics3 = this.f80539j;
                            if (intent2.hasExtra("android.bluetooth.device.extra.DEVICE")) {
                                if (intent2.hasExtra("android.bluetooth.device.extra.NAME")) {
                                    String stringExtra2 = intent2.getStringExtra("android.bluetooth.device.extra.NAME");
                                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Received alias name change, alias = %s", stringExtra2);
                                    aics3.f68704a.mo72987c(new aicd(aics3, "aliasNameChange", (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE"), stringExtra2));
                                    m67344i();
                                    break;
                                }
                            }
                            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("Got device alias change intent with no extras.");
                            m67344i();
                        case 10:
                            if (cfoj.f184966a.mo6606a().mo82085aI()) {
                                intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                intent2.getIntExtra("android.bluetooth.device.extra.BATTERY_LEVEL", -1);
                            }
                            m67344i();
                            break;
                        case 11:
                        case 12:
                            aics aics4 = this.f80539j;
                            String action2 = intent.getAction();
                            int intExtra3 = intent2.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                            int intExtra4 = intent2.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68426a("onProfileConnectionStateChange: action=%s prevState=%s, state=%s, device=%s", action2, Integer.valueOf(intExtra3), Integer.valueOf(intExtra4), bluetoothDevice2);
                            if (bluetoothDevice2 != null) {
                                aics4.f68704a.mo72987c(new aice(aics4, "onProfileConnectionStateChange", bluetoothDevice2, action2, intExtra4));
                            }
                            m67344i();
                            break;
                        case 13:
                            aics aics5 = this.f80539j;
                            String stringExtra3 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                            int intExtra5 = intent2.getIntExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", -1);
                            byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM");
                            String stringExtra4 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_SECRET");
                            String a = aics.m56977a(intent2.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"));
                            byte[] b = stringExtra4 != null ? boan.f132472f.mo68796b(stringExtra4) : null;
                            boolean booleanExtra = intent2.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", false);
                            buqh buqh = aics5.f68704a;
                            String valueOf = String.valueOf(stringExtra3);
                            buqh.mo72987c(new aicl(aics5, valueOf.length() == 0 ? new String("fastPairWith=") : "fastPairWith=".concat(valueOf), stringExtra3, byteArrayExtra, booleanExtra, b, intExtra5, a));
                            m67344i();
                            break;
                        case 14:
                            aics aics6 = this.f80539j;
                            if (cfog.m141283k() && (stringExtra = intent2.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS")) != null) {
                                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: cancel pairing with %s", stringExtra);
                                aics6.f68704a.mo72987c(new aicm(aics6, stringExtra.length() == 0 ? new String("cancelPairing=") : "cancelPairing=".concat(stringExtra), stringExtra));
                            }
                            m67344i();
                            break;
                        case 15:
                            aics aics7 = this.f80539j;
                            String stringExtra5 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                            PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("com.google.android.gms.nearby.discovery:EXTRA_PENDING_INTENT");
                            boolean a2 = aics.m56978a(pendingIntent);
                            buqh buqh2 = aics7.f68704a;
                            String valueOf2 = String.valueOf(stringExtra5);
                            buqh2.mo72987c(new aibz(aics7, valueOf2.length() == 0 ? new String("fastPairPairedNotificationDismissed=") : "fastPairPairedNotificationDismissed=".concat(valueOf2), a2, intent, stringExtra5, pendingIntent));
                            m67344i();
                            break;
                        case 16:
                            aics aics8 = this.f80539j;
                            String stringExtra6 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                            boolean booleanExtra2 = intent2.getBooleanExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", true);
                            boolean z = !booleanExtra2;
                            buqh buqh3 = aics8.f68704a;
                            String valueOf3 = String.valueOf(stringExtra6);
                            buqh3.mo72987c(new aica(aics8, valueOf3.length() == 0 ? new String("fastPairPairingProcessDone=") : "fastPairPairingProcessDone=".concat(valueOf3), booleanExtra2, stringExtra6, z, intent));
                            m67344i();
                            break;
                        case 17:
                            aics aics9 = this.f80539j;
                            if (intent2.hasExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS")) {
                                if (intent2.hasExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY")) {
                                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: upload device to footprints.");
                                    ahur.m56675a(new aibq(aics9, intent2));
                                    m67344i();
                                    break;
                                }
                            }
                            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("Got device added intent with no extras.");
                            m67344i();
                        case 18:
                            aics aics10 = this.f80539j;
                            if (!intent2.hasExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER")) {
                                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: No bloom filter extra available.");
                            } else {
                                aics10.f68704a.mo72987c(new aibv(aics10, "bloomFilterDetected", intent2));
                            }
                            m67344i();
                            break;
                        case 19:
                            aics aics11 = this.f80539j;
                            if (intent2.hasExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY")) {
                                aics11.f68704a.mo72987c(new aico(aics11, "fastPairUnpair", intent2));
                            }
                            m67344i();
                            break;
                        case 20:
                            aics aics12 = this.f80539j;
                            String stringExtra7 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
                            if (!cfoj.f184966a.mo6606a().mo82175h()) {
                                ayqx.m84633a(aics12.f68708e, stringExtra7, BroadcastConstants$Step.FINISHED, BroadcastConstants$Result.FAILURE);
                            } else if (!BluetoothAdapter.checkBluetoothAddress(stringExtra7)) {
                                ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: Received invalid address, skipping pair: %s", stringExtra7);
                                ayqx.m84633a(aics12.f68708e, stringExtra7, BroadcastConstants$Step.FINISHED, BroadcastConstants$Result.FAILURE);
                            } else {
                                byte[] byteArrayExtra2 = intent2.getByteArrayExtra("com.google.android.gms.nearby.discovery.KEY");
                                String stringExtra8 = intent2.getStringExtra("com.google.android.gms.nearby.discovery.DEVICE_NAME");
                                aibo aibo = new aibo(aics12, stringExtra7);
                                aics12.f68721r = true;
                                snp.m35704b(9).execute(new aibp(aics12, stringExtra7, stringExtra8, byteArrayExtra2, aibo));
                            }
                            m67344i();
                            break;
                        case 21:
                            if (extras != null) {
                                if (extras.containsKey("com.google.android.gms.nearby.discovery:EXTRA_MASTER_SWITCH_ENABLED") && extras.containsKey("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED")) {
                                    this.f80534e.mo72987c(new aiaw(this, "handleMasterSwitchEvent", extras));
                                    m67339b(extras.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED"));
                                    break;
                                }
                            }
                            ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("Got settings Intent with no enabled extra");
                            m67340e();
                            break;
                        case 22:
                        case 23:
                            if (extras != null) {
                                if (extras.containsKey("com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED") && extras.containsKey("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED")) {
                                    this.f80534e.mo72987c(new aiax(this, "handleCategorySwitchEvent", extras, intent2));
                                    m67339b(extras.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED"));
                                    break;
                                }
                            }
                            ((bnsl) ahsd.f67925a.mo68387b()).mo68405a("Got settings Intent with no enabled extra");
                            m67340e();
                            break;
                        case 24:
                            this.f80534e.mo72987c(new aiay(this, "offlineCachePopulate"));
                            break;
                        default:
                            this.f80534e.mo72987c(new aiaz(this, "handleUserAction", intent2));
                            m67344i();
                            break;
                    }
                }
            }
            ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("DiscoveryService unexpectedly started with null intent or action: %s", intent2);
            m67340e();
            return 2;
        }
    }

    public final boolean onUnbind(Intent intent) {
        busf busf;
        srn srn = ahsd.f67925a;
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            aiba aiba = this.f80542m;
            if (aiba != null && aiba.mo73078d()) {
                this.f80542m.mo73077c();
            }
            return false;
        } else if (!"com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction())) {
            if ("com.google.android.gms.nearby.discovery.ACTION_START_PAIRING_WITH_PROGRESS".equals(intent.getAction()) && (busf = this.f80529A) != null) {
                busf.mo73080a();
            }
            return false;
        } else {
            aiba aiba2 = this.f80551v;
            if (aiba2 != null && aiba2.mo73078d()) {
                this.f80551v.mo73077c();
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m67337a(Runnable runnable) {
        Executor executor;
        synchronized (this.f80553x) {
            if (this.f80554y == null) {
                this.f80554y = snp.m35704b(10);
            }
            executor = this.f80554y;
        }
        executor.execute(runnable);
    }

    /* renamed from: b */
    private final void m67339b(boolean z) {
        if (burl.m120294a(this, ahfl.m55644a(this)) && z) {
            m67342g();
        } else {
            m67343h();
        }
    }

    /* renamed from: b */
    public final synchronized void mo44202b() {
        if (this.f80534e.mo72985b(this.f80548s)) {
            srn srn = ahsd.f67925a;
            return;
        }
        aics aics = this.f80539j;
        if (cfoj.m141550ae()) {
            if (aics.f68715l.mo37315g()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: isDestroyable: Scanner is alive.");
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
        }
        if (cfod.f184793a.mo6606a().mo81919h()) {
            if (!aics.f68712i.f68288b.isEmpty()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: isDestroyable: Event stream is still connected.");
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
        }
        if (cfod.m141148h()) {
            srn srn2 = ahsd.f67925a;
            stopSelf();
        } else if (!this.f80552w) {
            this.f80552w = true;
            m67337a(new aiak(this));
        } else {
            srn srn3 = ahsd.f67925a;
        }
    }

    /* renamed from: a */
    public final void mo44200a(int i) {
        this.f80533d.mo37367a(i);
    }

    /* renamed from: a */
    public final void mo44201a(int i, List list) {
        srn srn = ahsd.f67925a;
        list.size();
        aiba aiba = this.f80542m;
        if (aiba != null) {
            aiba.mo73076a(i, list);
        }
        aiba aiba2 = this.f80551v;
        if (aiba2 != null) {
            aiba2.mo73076a(i, list);
        }
        if (!list.isEmpty()) {
            ((ahuu) ahgz.m55754a(this, ahuu.class)).mo37179a();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (cfoj.m141576z()) {
            this.f80547r.execute(new aiaj(this, list));
        }
    }

    /* renamed from: a */
    public final void mo37397a(boolean z) {
        ahst ahst = this.f80532c;
        if (ahst.f67966h != z) {
            ahst.f67966h = z;
            for (ahsu ahsu : ahst.mo37048c()) {
                if (ahsu.mo37085j() == bzbk.NEARBY_DEVICE) {
                    ahsu.mo37070a(z);
                }
            }
        }
        this.f80533d.mo37367a(1);
    }
}
