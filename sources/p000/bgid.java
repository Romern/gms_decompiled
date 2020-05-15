package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: bgid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgid {

    /* renamed from: a */
    public final Context f116480a;

    /* renamed from: b */
    public final bfor f116481b;

    /* renamed from: c */
    final bgib f116482c;

    /* renamed from: d */
    final bgib f116483d;

    /* renamed from: e */
    public final bghw f116484e;

    /* renamed from: f */
    public final bgjp f116485f;

    /* renamed from: g */
    public volatile boolean f116486g = false;

    /* renamed from: h */
    public final Handler f116487h;

    /* renamed from: i */
    public final bglc f116488i;

    /* renamed from: j */
    public boolean f116489j;

    /* renamed from: k */
    public boolean f116490k = false;

    /* renamed from: l */
    public bgoz f116491l;

    /* renamed from: m */
    public bgfj f116492m;

    /* renamed from: n */
    public bglw f116493n;

    /* renamed from: o */
    private final bfct f116494o;

    /* renamed from: p */
    private bghu f116495p;

    /* renamed from: q */
    private bghv f116496q;

    /* renamed from: r */
    private long f116497r;

    /* renamed from: s */
    private int f116498s = -1;

    /* renamed from: t */
    private int f116499t = -1;

    /* renamed from: u */
    private boolean f116500u;

    public bgid(Context context, bgjp bgjp, bfct bfct, bfor bfor, bglc bglc) {
        bgoz bgoz = new bgoz(new bghp());
        this.f116480a = context;
        this.f116485f = bgjp;
        this.f116494o = bfct;
        this.f116481b = bfor;
        this.f116491l = bgoz;
        this.f116482c = new bgib(this, 7);
        this.f116483d = new bgib(this, 11);
        this.f116484e = new bghw((LocationManager) context.getSystemService("location"));
        this.f116488i = bglc;
        this.f116487h = new bghz(this, Looper.myLooper());
    }

    /* renamed from: a */
    public static void m98971a(bfor bfor, Context context) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        WifiRttManager wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt");
        if (wifiRttManager != null) {
            z = wifiRttManager.isAvailable();
        } else {
            z = false;
        }
        bfor.mo62053a(bfos.RTT_MANAGER_AVAILABLE, z);
    }

    /* renamed from: b */
    public final void mo62848b() {
        bgju bgju = this.f116485f.f116630k;
        bgnq bgnq = bgnq.CALLBACK_RUNNER;
        bgky bgky = bgju.f116657a[bgnq.ordinal()];
        while (bgky.mo62964a()) {
            bgju.mo62925c(bgnq);
        }
    }

    /* renamed from: c */
    public final synchronized Handler mo62851c() {
        return this.f116487h;
    }

    /* renamed from: b */
    public final void mo62849b(bgoy bgoy) {
        WifiManager wifiManager = (WifiManager) this.f116480a.getApplicationContext().getSystemService("wifi");
        boolean isWifiEnabled = wifiManager.isWifiEnabled();
        boolean z = true;
        if (!isWifiEnabled && !bgkx.f116729g.mo62944a(wifiManager, this.f116480a)) {
            z = false;
        }
        bgfx.m98785c(this.f116481b, z);
        bgoy.mo61035a(z, isWifiEnabled);
    }

    /* renamed from: a */
    public static boolean m98972a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    /* renamed from: a */
    public final synchronized void mo62836a() {
        bghu bghu = this.f116495p;
        if (bghu != null) {
            try {
                this.f116480a.unregisterReceiver(bghu);
            } catch (IllegalArgumentException e) {
            }
        }
        bghv bghv = this.f116496q;
        if (bghv != null) {
            this.f116480a.getContentResolver().unregisterContentObserver(bghv);
            this.f116496q = null;
        }
    }

    /* renamed from: b */
    public final void mo62850b(bsax bsax) {
        mo62846a(13, 0, bsax, false);
    }

    /* renamed from: a */
    public final void mo62837a(int i) {
        bgnq bgnq = bgnq.values()[i];
        bfor bfor = this.f116481b;
        bfor.mo62047a(new bfop(bfos.ALARM_RING, bfor.mo62055b(), "%2$d", i));
        this.f116485f.f116630k.mo62913a(bgnq.ordinal());
        this.f116491l.mo61028a(bgnq);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgfx.a(bfor, boolean, boolean, int):void
     arg types: [bfor, int, int, int]
     candidates:
      bgfx.a(bfor, int, long, boolean):void
      bgfx.a(bfor, bfos, boolean, int):void
      bgfx.a(bfor, boolean, boolean, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgoy.a(boolean, boolean, int):void
     arg types: [int, int, int]
     candidates:
      bgoy.a(int, int, boolean):void
      bgoy.a(int, java.lang.Object, bgmj):void
      bgoy.a(long[], long[], bgca):void
      bgoy.a(boolean, boolean, int):void */
    /* renamed from: a */
    public final void mo62838a(ConnectivityManager connectivityManager, WifiManager wifiManager, bgoy bgoy) {
        int i;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        int i2 = -1;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            bgfx.m98783a(this.f116481b, false, false, -1);
            bgoy.mo61036a(false, false, -1);
        } else if (activeNetworkInfo.getType() == 0) {
            bgfx.m98783a(this.f116481b, false, true, -1);
            bgoy.mo61036a(false, true, -1);
        } else if (activeNetworkInfo.getType() == 1) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            bfor bfor = this.f116481b;
            if (connectionInfo != null) {
                i = connectionInfo.getNetworkId();
            } else {
                i = -1;
            }
            bgfx.m98783a(bfor, true, false, i);
            if (connectionInfo != null) {
                i2 = connectionInfo.getNetworkId();
            }
            bgoy.mo61036a(true, false, i2);
        } else if (activeNetworkInfo.getType() == 9) {
            bgfx.m98783a(this.f116481b, false, true, -1);
            bgoy.mo61036a(false, true, -1);
        }
    }

    /* renamed from: a */
    public final void mo62839a(bgnq bgnq, long j, long j2) {
        mo62847a(new bghm(this, bgnq, new bfmg(j, j2)));
    }

    /* renamed from: a */
    public final void mo62840a(bgoy bgoy) {
        Intent registerReceiver;
        Bundle extras;
        boolean z;
        bgoy bgoy2 = bgoy;
        if (bgoy2 != null && (registerReceiver = this.f116480a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null && (extras = registerReceiver.getExtras()) != null) {
            int i = extras.getInt("scale", 100);
            int i2 = extras.getInt("level", 0);
            if (extras.getInt("plugged", 0) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i != this.f116498s || i2 != this.f116499t || z != this.f116500u) {
                this.f116500u = z;
                this.f116499t = i2;
                this.f116498s = i;
                bfor bfor = this.f116481b;
                bfor.mo62047a(new bgfk(bfos.BATTERY_STATE_CHANGED, bfor.mo62055b(), i, i2, z ? 1 : 0, i, i2, z));
                bgoy2.mo61017a(i, i2, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo62841a(bgoy bgoy, boolean z) {
        boolean z2;
        WifiManager wifiManager = (WifiManager) this.f116480a.getApplicationContext().getSystemService("wifi");
        boolean isWifiEnabled = wifiManager.isWifiEnabled();
        if (isWifiEnabled || bgkx.f116729g.mo62944a(wifiManager, this.f116480a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        bgfx.m98785c(this.f116481b, z2);
        bgoy.mo61035a(z2, isWifiEnabled);
        PowerManager powerManager = (PowerManager) this.f116480a.getSystemService("power");
        boolean isScreenOn = powerManager.isScreenOn();
        bgfx.m98784b(this.f116481b, isScreenOn);
        bgoy.mo61034a(isScreenOn);
        bgkx bgkx = bgkx.f116729g;
        boolean isPowerSaveMode = powerManager.isPowerSaveMode();
        bgfx.m98786d(this.f116481b, isPowerSaveMode);
        bgoy.mo61042b(isPowerSaveMode);
        boolean a = m98972a(this.f116480a);
        bgfx.m98782a(this.f116481b, a);
        bgoy.mo61052g(a);
        mo62838a((ConnectivityManager) this.f116480a.getSystemService("connectivity"), wifiManager, bgoy);
        bgoy.mo61021a(this.f116494o);
        if (this.f116485f.mo62767cv()) {
            bgoy.mo61043c();
            this.f116489j = true;
        } else {
            bgoy.mo61045d();
            this.f116489j = false;
        }
        boolean isDeviceIdleMode = powerManager.isDeviceIdleMode();
        bgfx.m98787e(this.f116481b, isDeviceIdleMode);
        bgoy.mo61044c(isDeviceIdleMode);
        if (z) {
            mo62840a(bgoy);
        }
        m98971a(this.f116481b, this.f116480a);
    }

    /* renamed from: a */
    public final void mo62842a(bsax bsax) {
        mo62846a(17, 0, bsax, false);
    }

    /* renamed from: a */
    public final synchronized void mo62843a(List list, bfnz[] bfnzArr, boolean z) {
        bfnz[] bfnzArr2;
        bfnx[] bfnxArr;
        int i;
        int i2;
        bfor bfor;
        bfnx bfnx;
        bgkf[] bgkfArr;
        long j;
        bgkf[] bgkfArr2;
        int i3;
        int i4;
        int i5;
        boolean z2 = z;
        synchronized (this) {
            int size = list.size();
            bfnx[] bfnxArr2 = new bfnx[size];
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i6 = 0;
            while (i6 < size) {
                if (i6 == size - 1) {
                    bfnzArr2 = bfnzArr;
                } else {
                    bfnzArr2 = null;
                }
                long j2 = this.f116497r;
                bglc bglc = this.f116488i;
                bgkf[] bgkfArr3 = (bgkf[]) list.get(i6);
                bfor bfor2 = this.f116481b;
                if (bglc.mo62972a(elapsedRealtime, bgkfArr3)) {
                    long j3 = elapsedRealtime - j2;
                    int length = bgkfArr3.length;
                    HashSet hashSet = new HashSet(length);
                    i = size;
                    bfnxArr = bfnxArr2;
                    long j4 = Long.MAX_VALUE;
                    int i7 = 0;
                    while (i7 < length) {
                        bgkf bgkf = bgkfArr3[i7];
                        if (bgkf != null) {
                            i5 = length;
                            j4 = Math.min(bgkf.f116697a, j4);
                        } else {
                            i5 = length;
                        }
                        i7++;
                        length = i5;
                    }
                    if (j4 == Long.MAX_VALUE) {
                        j4 = elapsedRealtime;
                    }
                    int length2 = bgkfArr3.length;
                    ArrayList arrayList = new ArrayList(length2);
                    int i8 = 0;
                    boolean z3 = false;
                    while (i8 < length2) {
                        bfor bfor3 = bfor2;
                        bgkf bgkf2 = bgkfArr3[i8];
                        if (bgkf2 == null) {
                            j = j4;
                            bgkfArr2 = bgkfArr3;
                            i4 = i6;
                            i3 = length2;
                        } else {
                            i4 = i6;
                            i3 = length2;
                            long j5 = bgkf2.f116698b;
                            if (bgjz.m99183a(j5, bgkf2)) {
                                bgkfArr2 = bgkfArr3;
                                long j6 = bgkf2.f116697a;
                                long j7 = elapsedRealtime - j6;
                                if (!z2) {
                                    if (j7 <= 30000) {
                                        if (j7 <= j3 && j7 >= -30000) {
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder(127);
                                    sb.append("Stale scan: scanTimestamp is ");
                                    sb.append(j4);
                                    sb.append(" and device timestamp is ");
                                    sb.append(j6);
                                    sb.append(" and diff is ");
                                    sb.append(j4 - j6);
                                    sb.toString();
                                    z3 = true;
                                    j = j4;
                                }
                                j = j4;
                                if (hashSet.add(Long.valueOf(j5))) {
                                    arrayList.add(bgjz.m99182a(bgkf2, j5, j6));
                                }
                            } else {
                                j = j4;
                                bgkfArr2 = bgkfArr3;
                            }
                        }
                        i8++;
                        bfor2 = bfor3;
                        i6 = i4;
                        length2 = i3;
                        bgkfArr3 = bgkfArr2;
                        j4 = j;
                    }
                    bfnx = new bfnx(j4, arrayList, bfnzArr2, z3);
                    bfor = bfor2;
                    bgkfArr = bgkfArr3;
                    i2 = i6;
                } else {
                    i = size;
                    bfnxArr = bfnxArr2;
                    bfor bfor4 = bfor2;
                    i2 = i6;
                    bgkfArr = bgkfArr3;
                    int length3 = bgkfArr.length;
                    ArrayList arrayList2 = new ArrayList(length3);
                    HashSet hashSet2 = new HashSet(length3);
                    int i9 = 0;
                    while (i9 < length3) {
                        bfor bfor5 = bfor4;
                        bgkf bgkf3 = bgkfArr[i9];
                        if (bgkf3 != null) {
                            long j8 = bgkf3.f116698b;
                            if (bgjz.m99183a(j8, bgkf3)) {
                                if (hashSet2.add(Long.valueOf(j8))) {
                                    arrayList2.add(bgjz.m99182a(bgkf3, j8, elapsedRealtime));
                                }
                            }
                        }
                        i9++;
                        bfor4 = bfor5;
                    }
                    bfor = bfor4;
                    bfnx = new bfnx(elapsedRealtime, arrayList2, bfnzArr2, false);
                }
                bfor.mo62047a(new bfoq(bfos.WIFI_SCAN_RESULTS, bfor.mo62055b(), null, bfnx, bfnx.mo62006b(), bgkfArr.length - bfnx.mo62006b(), -1));
                bfnxArr[i2] = bfnx;
                i6 = i2 + 1;
                size = i;
                bfnxArr2 = bfnxArr;
            }
            int i10 = size;
            bfnx[] bfnxArr3 = bfnxArr2;
            if (i10 > 0) {
                this.f116497r = bfnxArr3[i10 - 1].f114524a;
            }
            mo62846a(8, 0, new bgic(bfnxArr3, z2), false);
            Context context = this.f116480a;
            if (ceze.m138459d()) {
                aki.m919a(context).mo874a(new Intent("com.google.android.location.internal.WIFI_SCAN_RECEIVED"));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo62844a(boolean z) {
        if (!this.f116486g) {
            mo62846a(1, z ? 1 : 0, null, false);
            this.f116486g = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgid.a(bgoy, boolean):void
     arg types: [bgoz, int]
     candidates:
      bgid.a(bfor, android.content.Context):void
      bgid.a(boolean, bfmd):void
      bgid.a(bgoy, boolean):void */
    /* renamed from: a */
    public final synchronized void mo62845a(boolean z, bfmd bfmd) {
        bhck bhck = new bhck(this.f116480a);
        bgjp bgjp = this.f116485f;
        berk berk = new berk(bhck, bgjp, z, bgjp.f116639t, bfmd, bgjp, bgjp, bgjp, new bewu(this.f116480a));
        this.f116491l = new bgoz(berk);
        this.f116493n = berk.f112210a;
        ((bgji) this.f116485f.f116626g).f116607b.execute(new bghl(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cese.m138164m()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_LOCATOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_ACTIVE_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_PASSIVE_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_CACHE_UPDATER");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_CALIBRATION_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_SENSOR_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_SENSOR_UPLOADER");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_IN_OUT_DOOR_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTION_TRIGGER");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_VEHICLE_EXIT_DETECTOR");
        intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        int i = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.intent.action.USER_FOREGROUND");
        intentFilter.addAction("android.intent.action.USER_BACKGROUND");
        int i2 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.location.MODE_CHANGED");
        int i3 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED");
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        intentFilter.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        int i4 = Build.VERSION.SDK_INT;
        if (ceze.m138458c()) {
            intentFilter.addAction("android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED");
        }
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("com.google.android.location.internal.intent.action.NLP_TESTING");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        if (cese.m138161j()) {
            intentFilter.addAction("com.google.android.apps.gmm.NAVIGATION_STATE");
        }
        if (!this.f116486g) {
            bghu bghu = new bghu(this, this.f116491l);
            this.f116495p = bghu;
            this.f116480a.registerReceiver(bghu, intentFilter, null, this.f116487h);
            int i5 = Build.VERSION.SDK_INT;
            bghv bghv = new bghv(this, this.f116487h, this.f116491l);
            this.f116496q = bghv;
            this.f116480a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, bghv);
        }
        try {
            LocationManager locationManager = (LocationManager) this.f116480a.getSystemService("location");
            locationManager.addGpsStatusListener(this.f116484e);
            if (locationManager.isProviderEnabled("passive")) {
                if (locationManager.getProvider("passive") != null) {
                    bgkx.f116729g.mo62948a(this.f116480a, "passive", this.f116482c.f116477c, Looper.getMainLooper());
                }
            }
        } catch (NullPointerException | SecurityException e) {
        }
        this.f116481b.mo62048a(bfos.INITIALIZE);
        this.f116491l.mo61055i();
        mo62841a((bgoy) this.f116491l, false);
    }

    /* renamed from: a */
    public final boolean mo62846a(int i, int i2, Object obj, boolean z) {
        int i3;
        if (this.f116486g) {
            return false;
        }
        if (z) {
            this.f116485f.f116630k.mo62923b(bgnq.CALLBACK_RUNNER, 60000, null);
            i3 = 4321;
        } else {
            i3 = 8534;
        }
        if (obj == null) {
            Message.obtain(this.f116487h, i, i2, i3).sendToTarget();
            return true;
        }
        Message.obtain(this.f116487h, i, i2, i3, obj).sendToTarget();
        return true;
    }

    /* renamed from: a */
    public final boolean mo62847a(Runnable runnable) {
        return mo62846a(24, 0, runnable, true);
    }
}
