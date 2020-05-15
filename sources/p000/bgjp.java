package p000;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Looper;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: bgjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjp implements bggn, bhco, bglx, bgmb, bgnf, berg, bgmx, bgng, bgmp {

    /* renamed from: a */
    public final Context f116620a;

    /* renamed from: b */
    public final bfor f116621b;

    /* renamed from: c */
    public final bgid f116622c;

    /* renamed from: d */
    public final bgjn f116623d;

    /* renamed from: e */
    public final bfct f116624e;

    /* renamed from: f */
    public final bgmk f116625f = new bgof();

    /* renamed from: g */
    public final bgmm f116626g;

    /* renamed from: h */
    public final bgkc f116627h;

    /* renamed from: i */
    public final bgmo f116628i;

    /* renamed from: j */
    public final bgnv f116629j;

    /* renamed from: k */
    public final bgju f116630k;

    /* renamed from: l */
    public final bgly f116631l;

    /* renamed from: m */
    public final SensorManager f116632m;

    /* renamed from: n */
    public final bfko f116633n;

    /* renamed from: o */
    public final bgml f116634o;

    /* renamed from: p */
    public final bgjr f116635p;

    /* renamed from: q */
    public volatile String f116636q;

    /* renamed from: r */
    public final bugp f116637r;

    /* renamed from: s */
    public final boolean f116638s;

    /* renamed from: t */
    public final bgja f116639t;

    /* renamed from: u */
    private final bglc f116640u;

    /* renamed from: v */
    private final betq f116641v;

    /* renamed from: w */
    private final ssh f116642w;

    /* renamed from: x */
    private final bgmi f116643x;

    public bgjp(Context context, bfor bfor, bgjn bgjn, bgnv bgnv, bgmi bgmi, bugp bugp) {
        boolean z;
        Context context2 = context;
        bfor bfor2 = bfor;
        File file = null;
        this.f116636q = null;
        this.f116620a = context2;
        this.f116621b = bfor2;
        this.f116623d = bgjn;
        this.f116629j = bgnv;
        this.f116643x = bgmi;
        this.f116637r = bugp;
        boolean z2 = true;
        this.f116633n = new bfko(context2, true);
        this.f116626g = new bgji(context2, bfor2, stu.m36316b());
        int i = Build.VERSION.SDK_INT;
        this.f116640u = new bglc();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            this.f116639t = new bgja(defaultAdapter);
        } else {
            this.f116639t = null;
        }
        long a = spn.getAndroidId(context);
        File filesDir = context.getFilesDir();
        this.f116634o = new bgog(a, filesDir != null ? new File(filesDir, "nlp_ck") : file);
        this.f116624e = new bfct(this.f116626g, this);
        this.f116622c = new bgid(context, this, this.f116624e, bfor, this.f116640u);
        this.f116624e.mo61405a();
        bgju bgju = new bgju(context2, this.f116622c, bfor2);
        new ComponentName(bgju.f116658b, bgid.class);
        bgju.f116659c[bgnq.LOCATOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_LOCATOR"), 0);
        bgju.f116659c[bgnq.ACTIVE_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_ACTIVE_COLLECTOR"), 134217728);
        bgju.f116659c[bgnq.BURST_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTOR"), 134217728);
        bgju.f116659c[bgnq.PASSIVE_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_PASSIVE_COLLECTOR"), 134217728);
        bgju.f116659c[bgnq.CACHE_UPDATER.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_CACHE_UPDATER"), 134217728);
        bgju.f116659c[bgnq.CALIBRATION_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_CALIBRATION_COLLECTOR"), 134217728);
        bgju.f116659c[bgnq.SENSOR_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_SENSOR_COLLECTOR"), 134217728);
        bgju.f116659c[bgnq.SENSOR_UPLOADER.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_SENSOR_UPLOADER"), 134217728);
        bgju.f116659c[bgnq.ACTIVITY_DETECTION.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION"), 134217728);
        bgju.f116659c[bgnq.IN_OUT_DOOR_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_IN_OUT_DOOR_COLLECTOR"), 134217728);
        bgju.f116659c[bgnq.BURST_COLLECTION_TRIGGER.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTION_TRIGGER"), 134217728);
        bgju.f116659c[bgnq.VEHICLE_EXIT_DETECTOR.ordinal()] = PendingIntent.getBroadcast(bgju.f116658b, 0, bgju.m99160a("com.google.android.location.ALARM_WAKEUP_VEHICLE_EXIT_DETECTOR"), 134217728);
        WifiManager wifiManager = (WifiManager) bgju.f116658b.getApplicationContext().getSystemService("wifi");
        int i2 = Build.VERSION.SDK_INT;
        bgnq[] values = bgnq.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            bgnq bgnq = values[i3];
            Context context3 = bgju.f116658b;
            if ((bgnq.f116892w & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            bgju.f116657a[bgnq.ordinal()] = new bgky(context3, z, bgnq.f116891v, bgky.f116730a);
            i3++;
            z2 = true;
        }
        this.f116630k = bgju;
        this.f116631l = new bgoe();
        this.f116627h = new bgkc(context, bugp, bfor, new bgjo(this, z2), new bgjo(this, false), (WifiManager) context.getApplicationContext().getSystemService("wifi"), this.f116630k.mo62922b());
        this.f116628i = new bgjj(context, this.f116625f, this.f116630k, this.f116624e, this.f116622c, bfor);
        this.f116632m = (SensorManager) context2.getSystemService("sensor");
        this.f116635p = new bgjr(context2, this.f116630k, this.f116634o, m99109q());
        this.f116642w = ssh.m36213a(context);
        this.f116641v = new betq(this.f116625f);
        this.f116638s = ceze.m138464i() ? svr.m36484b(context).mo26180d("android.hardware.telephony") : true;
    }

    /* renamed from: q */
    public static boolean m99109q() {
        return stu.m36322h() == 10;
    }

    /* renamed from: a */
    public final bfft mo62764a(Set set, Map map, String str, Integer num, boolean z, long j, bsax bsax, bfew bfew, String str2) {
        bghk bghk = new bghk(bfew, this.f116630k);
        bfgi bfgi = new bfgi();
        bfgi.f113754a = set;
        bfgi.mo61654a(300000);
        byte[] b = this.f116634o.mo63006b();
        bfgi.f113763j = 2;
        bfgi.f113755b = str;
        bfgi.f113756c = b;
        bfgi.f113761h = false;
        bfgi.f113757d = j;
        bfgi.f113762i = null;
        RealCollectorConfig a = bfgi.mo61653a();
        a.f150696h = z;
        for (Map.Entry entry : map.entrySet()) {
            a.mo70860a((bfgt) entry.getKey(), ((Integer) entry.getValue()).intValue());
        }
        return new bfhh(this.f116630k, this.f116620a, a, this.f116633n, this.f116627h, num, bsax, bghk, new bhdb(str2));
    }

    /* renamed from: a */
    public final boolean mo62773a() {
        return this.f116638s;
    }

    /* renamed from: b */
    public final bglx mo62747b() {
        return this;
    }

    /* renamed from: c */
    public final bgly mo62748c() {
        return this.f116631l;
    }

    /* renamed from: cs */
    public final boolean mo62791cs() {
        try {
            return ((LocationManager) this.f116620a.getSystemService("location")).isProviderEnabled("gps");
        } catch (SecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("can't check GPS ");
            } else {
                "can't check GPS ".concat(valueOf);
            }
            return false;
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }

    /* renamed from: ct */
    public final int mo62792ct() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return memoryInfo.getTotalPss();
    }

    /* renamed from: cu */
    public final int mo62793cu() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f116620a.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.availMem / 1024);
    }

    /* renamed from: cv */
    public final boolean mo62767cv() {
        return this.f116642w.mo26039a();
    }

    /* renamed from: cw */
    public final long mo62768cw() {
        return this.f116620a.getSharedPreferences("SLEEP_PREF_NAME", 0).getLong("LAST_SLEEP_SEGMENT_MILLIS", 0);
    }

    /* renamed from: cx */
    public final List mo62769cx() {
        SharedPreferences sharedPreferences = this.f116620a.getSharedPreferences("SLEEP_PREF_NAME", 0);
        if (!sharedPreferences.contains("PREVIOUS_SLEEP_START_MILLIS") || sharedPreferences.getInt("PREVIOUS_SLEEP_STATUS", -1) != 0) {
            return null;
        }
        long j = sharedPreferences.getLong("PREVIOUS_SLEEP_START_MILLIS", 0);
        long j2 = sharedPreferences.getLong("PREVIOUS_SLEEP_END_MILLIS", 0);
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis <= 0 || currentTimeMillis >= TimeUnit.DAYS.toMillis(1)) {
            return null;
        }
        return Arrays.asList(new bevn(j, j2));
    }

    /* renamed from: cy */
    public final bevo mo62770cy() {
        SharedPreferences sharedPreferences = this.f116620a.getSharedPreferences("SLEEP_PREF_NAME", 0);
        if (sharedPreferences.contains("userPreferredSleepStartHour")) {
            return new bevo(sharedPreferences.getInt("userPreferredSleepStartHour", 0), sharedPreferences.getInt("userPreferredSleepStartMinute", 0), sharedPreferences.getInt("userPreferredSleepEndHour", 0), sharedPreferences.getInt("userPreferredSleepEndMinute", 0));
        }
        return null;
    }

    /* renamed from: cz */
    public final bgjy mo62771cz() {
        bgkx bgkx = bgkx.f116729g;
        return new bgjy(this.f116632m, this.f116630k, this.f116621b);
    }

    /* renamed from: d */
    public final bgmb mo62749d() {
        return this;
    }

    /* renamed from: e */
    public final bgmi mo62750e() {
        return this.f116643x;
    }

    /* renamed from: f */
    public final bgmk mo62751f() {
        return this.f116625f;
    }

    /* renamed from: g */
    public final bgml mo62752g() {
        return this.f116634o;
    }

    /* renamed from: h */
    public final bgmm mo62753h() {
        return this.f116626g;
    }

    /* renamed from: i */
    public final bgnf mo62754i() {
        return this;
    }

    /* renamed from: j */
    public final bgng mo62755j() {
        return this;
    }

    /* renamed from: k */
    public final bgns mo62756k() {
        return this.f116630k;
    }

    /* renamed from: l */
    public final bgmp mo62757l() {
        return this;
    }

    /* renamed from: m */
    public final bgnv mo62758m() {
        return this.f116629j;
    }

    /* renamed from: n */
    public final bgnx mo62759n() {
        return this.f116627h;
    }

    /* renamed from: o */
    public final bfor mo62760o() {
        return this.f116621b;
    }

    /* renamed from: p */
    public final bgnr mo62761p() {
        return this.f116635p;
    }

    /* renamed from: r */
    public final void mo62763r() {
    }

    /* renamed from: s */
    public final void mo62909s() {
        bgid bgid = this.f116622c;
        if (bgid.f116491l.mo63060j()) {
            bgid.f116481b.mo62048a(bfos.QUIT_NETWORK_PROVIDER);
            bgoz bgoz = bgid.f116491l;
            bgoz.mo63061k();
            if (bgoz.f117147b != null) {
                bgoz.mo61047e();
                bgoz.f117146a.remove(bgoz.f117147b);
                bgpc bgpc = bgoz.f117147b;
                if (bgpc != null) {
                    bgpc.mo61048e(false);
                }
                bgoz.f117147b = null;
            }
            bgfj bgfj = bgid.f116492m;
            if (bgfj != null) {
                bgfj.mo62746a();
                bgid.f116492m = null;
            }
        }
        this.f116630k.mo62920a(true);
    }

    /* renamed from: b */
    public final void mo62679b(List list) {
        this.f116623d.mo62679b(list);
        if (!list.isEmpty()) {
            ((bgkr) bgkx.f116729g).f116719d = (bfnb) bnjd.m109595d(list);
        }
    }

    /* renamed from: a */
    public final bfft mo62765a(boolean z, Set set, Map map, long j, bfgy bfgy, bfew bfew, String str, bgmj bgmj) {
        int i;
        long j2 = j;
        bfgy bfgy2 = bfgy;
        bghk bghk = new bghk(bfew, this.f116630k);
        bfgi bfgi = new bfgi();
        bfgi.f113754a = set;
        if (!z) {
            i = 1;
        } else {
            i = 4;
        }
        bfgi.f113763j = i;
        bfgi.f113755b = null;
        bfgi.f113756c = null;
        bfgi.f113761h = true;
        bfgi.f113762i = bgmj;
        if (j2 < 0) {
            int i2 = Build.VERSION.SDK_INT;
            bfgi.f113758e = -j2;
            bfgi.f113759f = true;
            bfgi.f113760g = null;
        } else {
            bfgi.mo61654a(j2);
        }
        if (bfgy2 != null) {
            bfgi.f113760g = bfgy2;
            bfgi.f113759f = false;
        }
        RealCollectorConfig a = bfgi.mo61653a();
        for (Map.Entry entry : map.entrySet()) {
            a.mo70860a((bfgt) entry.getKey(), ((Integer) entry.getValue()).intValue());
        }
        return new bfhh(this.f116630k, this.f116620a, a, this.f116633n, this.f116627h, null, null, bghk, new bhdb(str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [betn, java.lang.Double]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berz.a(betp, betp, boolean):java.lang.Double
     arg types: [betp, betp, int]
     candidates:
      berz.a(long[], long[], long[]):java.lang.Double
      berz.a(java.util.Map, betn, java.lang.Double):void
      berz.a(betp, betp, boolean):java.lang.Double */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if ((r9.f112416a.mo62009d() - ((p000.betp) r2.get(r2.size() - 1)).f112416a.mo62009d()) >= 55000) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0314  */
    /* renamed from: a */
    public final bfnp mo62669a(bfnb bfnb, bfnv bfnv) {
        bfnp bfnp;
        bert bert;
        bfml bfml;
        bfnp bfnp2;
        long elapsedRealtime;
        boolean z;
        bfnb bfnb2 = bfnb;
        bfnv bfnv2 = bfnv;
        betq betq = this.f116641v;
        boolean z2 = true;
        if (bfnv2 == null) {
            bfnp = betq.f112418a;
        } else if (bfnv.mo62006b() > 0) {
            betp betp = new betp(bfnv2, bfnb2);
            if (!betq.f112421d.isEmpty()) {
                List list = betq.f112421d;
            }
            betq.f112421d.add(betp);
            if (betq.f112421d.size() > 3) {
                betq.f112421d.remove(0);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < betq.f112421d.size() - 1; i++) {
                arrayList.add((betp) betq.f112421d.get(i));
            }
            arrayList.add(betp);
            if (arrayList.size() < 3) {
                bfnp = betq.f112418a;
                bert = betq.f112420c;
                if (bfnb2 == null) {
                    bfml = bfnb2.f114458c;
                } else {
                    bfml = null;
                }
                if (bfml == null || bfml.f114449c == null) {
                    bfnp2 = betq.f112418a;
                } else if (bert.f112239a.size() < 4) {
                    List list2 = bert.f112239a;
                    int size = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z = false;
                            break;
                        }
                        i2++;
                        if (bfmw.m97288a(bfml.f114449c, ((bfml) list2.get(i2)).f114449c) > Math.max(bfml.f114449c.f114482d / 1000, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)) {
                            z = true;
                            break;
                        }
                    }
                    bert.mo61067a(bfml);
                    bfnp2 = z ? new bfnp(2, 0.5d) : new bfnp(1, 0.5d);
                } else {
                    bert.mo61067a(bfml);
                    bfnp2 = betq.f112418a;
                }
                String valueOf = String.valueOf(bfnp2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Travel detection result CellOnly: ");
                sb.append(valueOf);
                sb.toString();
                if (bfnp != betq.f112418a || bfnp2 == betq.f112418a) {
                    bfnp2 = bfnp;
                }
                bgmk bgmk = betq.f112422e;
                elapsedRealtime = SystemClock.elapsedRealtime();
                if (bfnp2 != betq.f112418a && betq.mo61136a()) {
                    bfnp2 = betq.f112423f;
                } else if (bfnp == betq.f112418a || !betq.f112425h || !betq.mo61136a()) {
                    if (bfnp2 != bfnp) {
                        z2 = false;
                    }
                    betq.f112425h = z2;
                    betq.f112423f = bfnp2;
                    betq.f112424g = elapsedRealtime;
                } else {
                    bfnp2 = betq.f112423f;
                }
                String valueOf2 = String.valueOf(bfnp2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                sb2.append("Travel detection result: ");
                sb2.append(valueOf2);
                sb2.toString();
                if (!(betq.f112427j == 0 || bfnp2 == betq.f112418a || betq.f112427j == bfnp2.f114499b)) {
                    if (elapsedRealtime - betq.f112426i <= 50000) {
                        bfnp2 = betq.f112418a;
                    } else {
                        betq.f112426i = elapsedRealtime;
                    }
                }
                if (bfnp2 != betq.f112418a) {
                    betq.f112427j = bfnp2.f114499b;
                }
                return bfnp2;
            } else if (arrayList.size() == 3) {
                EnumMap enumMap = new EnumMap(betn.class);
                long[] a = berz.m95650a(((betp) arrayList.get(0)).f112416a);
                long[] a2 = berz.m95650a(((betp) arrayList.get(1)).f112416a);
                long[] a3 = berz.m95650a(((betp) arrayList.get(2)).f112416a);
                long[] a4 = berz.m95651a(a, a3);
                berz.m95649a(enumMap, betn.SCAN_OVERLAP_RATIO_0_2, berz.m95648a(a, a3, a4));
                enumMap.put((Object) betn.SCAN_OVERLAP_COUNT_0_2, (Object) Double.valueOf((double) a4.length));
                berz.m95649a(enumMap, betn.SCAN_OVERLAP_RATIO_1_2, berz.m95648a(a2, a3, berz.m95651a(a2, a3)));
                berz.m95649a(enumMap, betn.WIFI_LOC_DISTANCE_0_1, berz.m95647a((betp) arrayList.get(0), (betp) arrayList.get(1), false));
                berz.m95649a(enumMap, betn.WIFI_LOC_DISTANCE_0_2, berz.m95647a((betp) arrayList.get(0), (betp) arrayList.get(2), false));
                berz.m95649a(enumMap, betn.WIFI_LOC_DISTANCE_1_2, berz.m95647a((betp) arrayList.get(1), (betp) arrayList.get(2), false));
                berz.m95649a(enumMap, betn.CELL_LOC_DISTANCE_0_2, berz.m95647a((betp) arrayList.get(0), (betp) arrayList.get(2), true));
                beto beto = betq.f112419b;
                if (((Double) enumMap.get(betn.SCAN_OVERLAP_RATIO_1_2)).doubleValue() != 1.0d || beto.mo61134a(enumMap, betn.SCAN_OVERLAP_MIN_RADIUS_0_2) <= 400.0d) {
                    double exp = 1.0d / (Math.exp(-(((((((((beto.mo61134a(enumMap, betn.SCAN_OVERLAP_RATIO_0_2) * 1.9996d) - 1.95435d) + (beto.mo61134a(enumMap, betn.SCAN_OVERLAP_COUNT_0_2) * 0.2657d)) + (beto.mo61134a(enumMap, betn.SCAN_OVERLAP_MIN_RADIUS_0_2) * -0.0024d)) + (beto.mo61134a(enumMap, betn.SCAN_OVERLAP_RATIO_1_2) * 5.3858d)) + (beto.mo61134a(enumMap, betn.WIFI_LOC_DISTANCE_0_1) * -0.006d)) + (beto.mo61134a(enumMap, betn.WIFI_LOC_DISTANCE_0_2) * -0.007d)) + (beto.mo61134a(enumMap, betn.WIFI_LOC_DISTANCE_1_2) * -0.022d)) + (beto.mo61134a(enumMap, betn.CELL_LOC_DISTANCE_0_2) * -5.0E-4d))) + 1.0d);
                    if (exp >= 0.5d) {
                        bfnp = new bfnp(1, exp);
                    } else {
                        bfnp = new bfnp(2, 1.0d - exp);
                    }
                } else {
                    bfnp = betq.f112418a;
                }
            } else {
                int size2 = arrayList.size();
                StringBuilder sb3 = new StringBuilder(55);
                sb3.append("Can't compute features for history of size: ");
                sb3.append(size2);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            bfnp = betq.f112418a;
        }
        String valueOf3 = String.valueOf(bfnp);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
        sb4.append("Travel detection result AllSignals: ");
        sb4.append(valueOf3);
        sb4.toString();
        bert = betq.f112420c;
        if (bfnb2 == null) {
        }
        if (bfml == null) {
            if (bert.f112239a.size() < 4) {
            }
            String valueOf4 = String.valueOf(bfnp2);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 34);
            sb5.append("Travel detection result CellOnly: ");
            sb5.append(valueOf4);
            sb5.toString();
            bfnp2 = bfnp;
            bgmk bgmk2 = betq.f112422e;
            elapsedRealtime = SystemClock.elapsedRealtime();
            if (bfnp2 != betq.f112418a) {
            }
            if (bfnp == betq.f112418a) {
            }
            if (bfnp2 != bfnp) {
            }
            betq.f112425h = z2;
            betq.f112423f = bfnp2;
            betq.f112424g = elapsedRealtime;
            String valueOf22 = String.valueOf(bfnp2);
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 25);
            sb22.append("Travel detection result: ");
            sb22.append(valueOf22);
            sb22.toString();
            if (elapsedRealtime - betq.f112426i <= 50000) {
            }
            if (bfnp2 != betq.f112418a) {
            }
            return bfnp2;
        }
        bfnp2 = betq.f112418a;
        String valueOf42 = String.valueOf(bfnp2);
        StringBuilder sb52 = new StringBuilder(String.valueOf(valueOf42).length() + 34);
        sb52.append("Travel detection result CellOnly: ");
        sb52.append(valueOf42);
        sb52.toString();
        bfnp2 = bfnp;
        bgmk bgmk22 = betq.f112422e;
        elapsedRealtime = SystemClock.elapsedRealtime();
        if (bfnp2 != betq.f112418a) {
        }
        if (bfnp == betq.f112418a) {
        }
        if (bfnp2 != bfnp) {
        }
        betq.f112425h = z2;
        betq.f112423f = bfnp2;
        betq.f112424g = elapsedRealtime;
        String valueOf222 = String.valueOf(bfnp2);
        StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 25);
        sb222.append("Travel detection result: ");
        sb222.append(valueOf222);
        sb222.toString();
        if (elapsedRealtime - betq.f112426i <= 50000) {
        }
        if (bfnp2 != betq.f112418a) {
        }
        return bfnp2;
    }

    /* renamed from: a */
    public final void mo61008a(bfma bfma) {
        for (ActivityRecognitionResult activityRecognitionResult : bfma.mo61912b()) {
            Intent intent = new Intent();
            this.f116622c.mo62846a(19, 0, activityRecognitionResult, true);
            intent.setAction("com.google.android.location.activity.ACTIVITY_RESULT");
            intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult);
            aki.m919a(this.f116620a).mo874a(intent);
        }
        this.f116623d.mo61008a(bfma);
    }

    /* renamed from: a */
    public final void mo61009a(bfnn bfnn, boolean z) {
        List list;
        SleepSegmentEvent sleepSegmentEvent;
        bgdo bgdo = (bgdo) this.f116623d;
        bgdo.f116160q.mo62610a(bgdo.f116145a, bfnn, null, bgdo.f116153j);
        if (z) {
            mo62908a("LAST_SLEEP_SEGMENT_MILLIS");
            if (cfam.m138541k() && (list = bfnn.f114493a) != null && !list.isEmpty() && ((SleepSegmentEvent) list.get(0)).f79392c == 0 && (sleepSegmentEvent = (SleepSegmentEvent) list.get(0)) != null && sleepSegmentEvent.f79392c == 0) {
                SharedPreferences.Editor edit = this.f116620a.getSharedPreferences("SLEEP_PREF_NAME", 0).edit();
                edit.putLong("PREVIOUS_SLEEP_START_MILLIS", sleepSegmentEvent.f79390a);
                edit.putLong("PREVIOUS_SLEEP_END_MILLIS", sleepSegmentEvent.f79391b);
                edit.putInt("PREVIOUS_SLEEP_STATUS", sleepSegmentEvent.f79392c);
                edit.commit();
            }
        }
    }

    /* renamed from: a */
    public final void mo62671a(bfnp bfnp) {
        this.f116622c.mo62846a(21, 0, bfnp, false);
    }

    /* renamed from: a */
    public final void mo62672a(bfnv bfnv) {
        this.f116623d.mo62672a(bfnv);
    }

    /* renamed from: a */
    public final void mo62772a(bgmj bgmj) {
        this.f116621b.mo62048a(bfos.CELL_REQUEST_SCAN);
        this.f116622c.mo62846a(4, 0, bgmj, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfko.a(java.lang.String, boolean, android.location.LocationListener):void
     arg types: [java.lang.String, int, android.location.LocationListener]
     candidates:
      bfko.a(java.text.Format, long, java.io.PrintWriter):void
      bfko.a(java.lang.String, boolean, android.location.LocationListener):void */
    /* renamed from: a */
    public final void mo62790a(bgnq bgnq, boolean z) {
        bfor bfor = this.f116621b;
        int ordinal = bgnq.ordinal();
        bfor.mo62047a(new bgfm(bfos.GPS_ON_OFF, bfor.mo62055b(), z ? 1 : 0, ordinal, z, ordinal));
        bgid bgid = this.f116622c;
        bfko bfko = this.f116633n;
        String valueOf = String.valueOf(bgnq.ordinal());
        if (bgid.f116490k != z) {
            bgid.f116490k = z;
            Looper mainLooper = Looper.getMainLooper();
            if (z) {
                bfko.mo61850a(valueOf, false, bgid.f116482c.f116477c);
                bfko.mo61849a(valueOf, "gps", 0, bgid.f116483d.f116477c, mainLooper);
                return;
            }
            bfko.mo61850a(valueOf, true, bgid.f116483d.f116477c);
            bfko.mo61849a(valueOf, "passive", 0, bgid.f116482c.f116477c, mainLooper);
        }
    }

    /* renamed from: a */
    public final void mo61010a(ActivityRecognitionResult activityRecognitionResult) {
        mo61008a((bfma) new bfnm(activityRecognitionResult));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62906a(Object obj) {
        this.f116622c.mo62846a(18, 0, (bfct) obj, false);
    }

    /* renamed from: a */
    public final void mo62907a(Runnable runnable) {
        this.f116622c.mo62847a(runnable);
    }

    /* renamed from: a */
    public final void mo62908a(String str) {
        SharedPreferences.Editor edit = this.f116620a.getSharedPreferences("SLEEP_PREF_NAME", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        edit.commit();
        if (str.length() == 0) {
            new String("Updated ");
        } else {
            "Updated ".concat(str);
        }
    }

    /* renamed from: a */
    public final void mo62766a(String str, String str2, String str3, boolean z, long j) {
        Context context = this.f116620a;
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            sex a = sex.m35104a(context);
            C1102je jeVar = new C1102je(context);
            jeVar.mo13630b(qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_google_white_24));
            jeVar.mo13640e(str);
            jeVar.mo13632b(str2);
            jeVar.mo13627a(true);
            if (z) {
                jeVar.mo13616a(-1);
            } else {
                int i = Build.VERSION.SDK_INT;
                a.mo25442a(new NotificationChannel("com.google.android.gms.location.triple_chop", "Triple Chop", 2));
                jeVar.f22244B = "com.google.android.gms.location.triple_chop";
            }
            if (j > 0) {
                jeVar.f22245C = j;
            }
            if (str3 != null && !str3.isEmpty()) {
                jeVar.f22254f = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(str3)), 0);
            }
            Notification b = jeVar.mo13629b();
            int i2 = bgix.f116576a;
            bgix.f116576a = i2 + 1;
            a.mo25445a("HblUVOCvEem4PpswPRhQWw", i2, b);
        }
    }

    /* renamed from: a */
    public final void mo61011a(List list) {
        bgdo bgdo = (bgdo) this.f116623d;
        bgdo.f116158o.mo62610a(bgdo.f116145a, list, null, bgdo.f116153j);
    }

    /* renamed from: a */
    public final void mo61012a(List list, int i) {
        bgjn bgjn = this.f116623d;
        Bundle bundle = new Bundle();
        sdo.m34959a(bundle);
        bundle.putInt("location:key:transition_result_source", i);
        bgdo bgdo = (bgdo) bgjn;
        bgdo.f116159p.mo62610a(bgdo.f116145a, list, bundle, bgdo.f116153j);
    }

    /* renamed from: a */
    public final void mo62676a(bfnc[] bfncArr) {
        this.f116623d.mo62676a(bfncArr);
    }
}
