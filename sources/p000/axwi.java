package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wearable.node.CloudNodeAdapter$1;
import com.google.android.gms.wearable.node.CloudNodeAdapter$2;
import com.google.android.gms.wearable.node.CloudNodeAdapter$GcmRegistrationReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: axwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwi implements axxg, ayjm {

    /* renamed from: A */
    public static final /* synthetic */ int f96566A = 0;

    /* renamed from: D */
    private static final IntentFilter f96567D = new IntentFilter("cloud_node_sync");

    /* renamed from: E */
    private static final IntentFilter f96568E = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");

    /* renamed from: J */
    private static abop f96569J;

    /* renamed from: B */
    private final axyb f96570B;

    /* renamed from: C */
    private final ayjo f96571C;

    /* renamed from: F */
    private final WorkSource f96572F;

    /* renamed from: G */
    private final ConnectivityManager f96573G;

    /* renamed from: H */
    private final BroadcastReceiver f96574H = new CloudNodeAdapter$1(this, "wearable");

    /* renamed from: I */
    private final BroadcastReceiver f96575I = new CloudNodeAdapter$2(this, "wearable");

    /* renamed from: a */
    public final Context f96576a;

    /* renamed from: b */
    public final boolean f96577b;

    /* renamed from: c */
    public final axzq f96578c;

    /* renamed from: d */
    public final SharedPreferences f96579d;

    /* renamed from: e */
    public final bmzi f96580e;

    /* renamed from: f */
    public final bmzi f96581f;

    /* renamed from: g */
    public final axxv f96582g;

    /* renamed from: h */
    public final axwm f96583h;

    /* renamed from: i */
    public final axwn f96584i;

    /* renamed from: j */
    public final axwh f96585j;

    /* renamed from: k */
    public final axyd f96586k;

    /* renamed from: l */
    public final axzm f96587l;

    /* renamed from: m */
    public final axwf f96588m;

    /* renamed from: n */
    final axwe f96589n;

    /* renamed from: o */
    final axwd f96590o;

    /* renamed from: p */
    long f96591p = -1;

    /* renamed from: q */
    volatile boolean f96592q = false;

    /* renamed from: r */
    volatile Map f96593r;

    /* renamed from: s */
    public volatile boolean f96594s = false;

    /* renamed from: t */
    public final ayjq f96595t;

    /* renamed from: u */
    public final AtomicBoolean f96596u = new AtomicBoolean();

    /* renamed from: v */
    public final asfb f96597v;

    /* renamed from: w */
    long f96598w = 0;

    /* renamed from: x */
    public String f96599x;

    /* renamed from: y */
    public final Object f96600y = new Object();

    /* renamed from: z */
    public axwy f96601z;

    public axwi(Context context, SharedPreferences sharedPreferences, bmzi bmzi, bmzi bmzi2, axyd axyd, ConnectivityManager connectivityManager, ayjq ayjq, axxv axxv, axui axui, axzq axzq, boolean z, axyb axyb, axzm axzm, axwm axwm, axwn axwn) {
        this.f96579d = sharedPreferences;
        this.f96580e = bmzi;
        this.f96581f = bmzi2;
        this.f96582g = axxv;
        this.f96576a = context;
        this.f96577b = z;
        this.f96570B = axyb;
        this.f96587l = axzm;
        this.f96573G = connectivityManager;
        HandlerThread handlerThread = new HandlerThread("CloudNodeAdapterHandler", 9);
        handlerThread.start();
        this.f96585j = new axwh(this, handlerThread.getLooper());
        this.f96589n = new axwe(this, axui);
        this.f96590o = new axwd(this);
        this.f96578c = axzq;
        this.f96595t = ayjq;
        this.f96571C = new ayjo(this.f96576a);
        this.f96586k = axyd;
        this.f96583h = axwm;
        this.f96584i = axwn;
        if (chnj.f188812a.mo6606a().mo85375A()) {
            m83384c(context).f57804b.setIntParameter("http.connection.timeout", (int) chnj.f188812a.mo6606a().mo85377C()).setIntParameter("http.socket.timeout", (int) chnj.f188812a.mo6606a().mo85378D());
        }
        this.f96588m = new axwf(this);
        asfb asfb = new asfb(context, 1, "CloudNodeSyncWakeLock", null, "com.google.android.wearable.app");
        this.f96597v = asfb;
        asfb.mo49115a(false);
        WorkSource workSource = new WorkSource();
        this.f96572F = workSource;
        this.f96597v.mo49121c(workSource);
        context.registerReceiver(this.f96574H, f96568E);
        context.registerReceiver(this.f96575I, f96567D);
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.gcm.REGISTERED");
        intentFilter.addCategory("com.google.android.gms");
        context.registerReceiver(new CloudNodeAdapter$GcmRegistrationReceiver(this), intentFilter);
    }

    /* renamed from: a */
    public static axwn m83381a(Context context, axui axui, axxv axxv, ayjq ayjq, axyb axyb, axyd axyd) {
        return new axwn(context.getApplicationInfo().uid, m83384c(context), axui, axxv, ayjq, axyb, axyd);
    }

    /* renamed from: b */
    public static bmzi m83383b(Context context) {
        return new axwc(context.getApplicationContext());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
     arg types: [android.content.Context, java.lang.String, int, int]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void */
    /* renamed from: c */
    public static abop m83384c(Context context) {
        if (f96569J == null) {
            StringBuilder sb = new StringBuilder("Android/");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                sb.append(packageInfo.packageName);
                sb.append("/");
                sb.append(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("CloudNode", e.getMessage(), e);
            }
            f96569J = new abop(context, sb.toString(), true, true);
        }
        return f96569J;
    }

    /* renamed from: d */
    public final void mo53683d() {
        long j = chnj.m149034j();
        if (j > 0) {
            this.f96597v.mo49111a(j * 1000);
        } else {
            this.f96597v.mo49117b();
        }
    }

    /* renamed from: e */
    public final void mo53684e() {
        if (this.f96577b && chnj.f188812a.mo6606a().mo85399Y()) {
            Intent flags = new Intent().setFlags(268435456);
            if (C1133kh.m17835a(this.f96576a, "com.google.android.clockwork.settings.SHOW_FACTORY_RESET_CONFIRMATION") == 0) {
                flags.setAction("com.google.android.clockwork.settings.FACTORY_RESET");
            } else {
                flags.setAction("android.settings.PRIVACY_SETTINGS");
            }
            PendingIntent activity = PendingIntent.getActivity(this.f96576a, 0, flags, 134217728);
            ayjo ayjo = this.f96571C;
            CharSequence text = ayjo.f97763a.getResources().getText(C0126R.string.wearable_no_longer_in_network_notification_title);
            CharSequence text2 = ayjo.f97763a.getResources().getText(C0126R.string.wearable_no_longer_in_network_notification_body);
            if (Log.isLoggable("WearNotification", 3)) {
                String valueOf = String.valueOf(text);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Showing notification: ");
                sb.append(valueOf);
                Log.d("WearNotification", sb.toString());
            }
            int a = qkj.m32287a(ayjo.f97763a, C0126R.C0127drawable.quantum_ic_watch_white_24);
            C1102je jeVar = new C1102je(ayjo.f97763a);
            jeVar.mo13630b(a);
            ayjo.f97765c = jeVar;
            ayjo.f97765c.mo13640e(text);
            ayjo.f97765c.mo13632b(text2);
            C1102je jeVar2 = ayjo.f97765c;
            jeVar2.f22254f = activity;
            jeVar2.mo13634c();
            ayjo.f97765c.mo13633b(true);
            ayjo.f97764b.mo25459a("CloudNode", 0, ayjo.f97765c.mo13629b());
        }
    }

    /* renamed from: f */
    public final boolean mo53685f() {
        if (Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "readDataConnectionState");
        }
        NetworkInfo activeNetworkInfo = this.f96573G.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "no active networks");
            }
            return false;
        } else if (!activeNetworkInfo.isConnected()) {
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "active network isn't connected");
            }
            return false;
        } else {
            String typeName = activeNetworkInfo.getTypeName();
            if (Log.isLoggable("CloudNode", 2)) {
                String valueOf = String.valueOf(typeName);
                Log.v("CloudNode", valueOf.length() == 0 ? new String("active network is: ") : "active network is: ".concat(valueOf));
            }
            if ("PROXY".equals(typeName) || "COMPANION_PROXY".equals(typeName)) {
                if (Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "active network is proxy");
                }
                return false;
            } else if (!Log.isLoggable("CloudNode", 2)) {
                return true;
            } else {
                Log.v("CloudNode", "there is an active non-PROXY network");
                return true;
            }
        }
    }

    /* renamed from: a */
    public static bmzi m83382a(Context context) {
        return new axwb(context.getApplicationContext());
    }

    /* renamed from: b */
    public final boolean mo53681b() {
        axwy axwy = this.f96601z;
        return this.f96588m.mo53664a() && (axwy != null && axwy.mo53570i());
    }

    /* renamed from: a */
    public final String mo53674a() {
        return this.f96578c.mo53805c();
    }

    /* renamed from: a */
    public final void mo53675a(int i, long j, int i2) {
        axty.m83202a(i, j, 1, i2);
    }

    /* renamed from: a */
    public final void mo53676a(int i, long j, Exception exc) {
        int i2;
        if (!(exc instanceof IOException)) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        axty.m83202a(i, j, i2, 0);
    }

    /* renamed from: a */
    public final void mo53677a(long j) {
        new skc(this.f96576a).mo25675a("CloudNode", 2, j, PendingIntent.getBroadcast(this.f96576a, 0, new Intent("cloud_node_sync"), 134217728), "com.google.android.gms");
        if (Log.isLoggable("CloudNode", 2)) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("scheduleWakeup: ");
            sb.append(j);
            Log.v("CloudNode", sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo53682c() {
        this.f96597v.mo49121c(this.f96572F);
    }

    /* renamed from: a */
    public final void mo53678a(axwl axwl) {
        if (Log.isLoggable("CloudNode", 3)) {
            long j = axwl.f96606a;
            String valueOf = String.valueOf(axwl.f96607b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("handleSyncResponse: seqId ");
            sb.append(j);
            sb.append(", syncTable=");
            sb.append(valueOf);
            Log.d("CloudNode", sb.toString());
        }
        if (axwl.f96606a > 0) {
            if (Log.isLoggable("CloudNode", 3)) {
                long j2 = axwl.f96606a;
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("setting mLastSentSeqId to ");
                sb2.append(j2);
                Log.d("CloudNode", sb2.toString());
            }
            this.f96591p = axwl.f96606a;
        }
        Map map = axwl.f96607b;
        if (map != null) {
            this.f96593r = map;
        }
    }

    /* renamed from: a */
    public final void mo53679a(String str) {
        boolean z;
        synchronized (this.f96600y) {
            Set<String> stringSet = this.f96579d.getStringSet("nodesToRevoke", new HashSet());
            if (!stringSet.contains(str)) {
                stringSet.add(str);
                this.f96579d.edit().putStringSet("nodesToRevoke", stringSet).commit();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f96585j.mo53669a(2);
        }
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            axxi axxi = (axxi) arrayList.get(i);
            if (!axxi.f96650e.equals("cloud")) {
                axty.m83203a(3, axxi.f96646a.f96377a);
                if (Log.isLoggable("CloudNode", 2)) {
                    String valueOf = String.valueOf(axxi.f96647b.f96641c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Received dataitemchanged event: ");
                    sb.append(valueOf);
                    Log.v("CloudNode", sb.toString());
                }
                z = true;
            }
        }
        if (z) {
            this.f96592q = true;
            this.f96585j.mo53669a(1);
        }
    }

    /* renamed from: a */
    public final void mo53680a(Collection collection) {
        asfb asfb = this.f96597v;
        Context context = this.f96576a;
        WorkSource workSource = new WorkSource();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            WorkSource a = stx.m36335a(context, (String) it.next());
            if (a != null) {
                workSource.add(a);
            }
        }
        asfb.mo49121c(workSource);
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf(this.f96578c.mo53805c());
        ssb.println(valueOf.length() == 0 ? new String("is paired to cloud: ") : "is paired to cloud: ".concat(valueOf));
        String valueOf2 = String.valueOf(this.f96578c.mo53805c());
        ssb.println(valueOf2.length() == 0 ? new String("cloud network id: ") : "cloud network id: ".concat(valueOf2));
        String valueOf3 = String.valueOf(((axwb) this.f96580e).mo6606a());
        ssb.println(valueOf3.length() == 0 ? new String("gcm registration id: ") : "gcm registration id: ".concat(valueOf3));
        long j = this.f96591p;
        StringBuilder sb = new StringBuilder(42);
        sb.append("last sent sync seqId: ");
        sb.append(j);
        ssb.println(sb.toString());
        String valueOf4 = String.valueOf(this.f96593r);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 18);
        sb2.append("cloud sync table: ");
        sb2.append(valueOf4);
        ssb.println(sb2.toString());
        boolean f = chnj.m149030f();
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("disabled via gservices: ");
        sb3.append(f);
        ssb.println(sb3.toString());
        long j2 = chnj.m149034j();
        StringBuilder sb4 = new StringBuilder(38);
        sb4.append("wakelock timeout: ");
        sb4.append(j2);
        ssb.println(sb4.toString());
        long c = this.f96595t.mo54037c();
        long b = this.f96595t.mo54036b();
        if (c > 0) {
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("current backoff: ");
            sb5.append(c);
            ssb.println(sb5.toString());
            if (b > elapsedRealtime) {
                StringBuilder sb6 = new StringBuilder(37);
                sb6.append("  next run time: ");
                sb6.append(b);
                ssb.println(sb6.toString());
            } else {
                ssb.println("  ready to run");
            }
        } else {
            ssb.println("backoff not in effect");
        }
        boolean z3 = this.f96592q;
        StringBuilder sb7 = new StringBuilder(26);
        sb7.append("mDataChangedLocally: ");
        sb7.append(z3);
        ssb.println(sb7.toString());
        boolean z4 = this.f96594s;
        StringBuilder sb8 = new StringBuilder(22);
        sb8.append("mTickleReceived: ");
        sb8.append(z4);
        ssb.println(sb8.toString());
        boolean z5 = this.f96596u.get();
        StringBuilder sb9 = new StringBuilder(29);
        sb9.append("mUpdateGcmRegistration: ");
        sb9.append(z5);
        ssb.println(sb9.toString());
        boolean e = this.f96597v.mo49124e();
        StringBuilder sb10 = new StringBuilder(39);
        sb10.append("network processing wakelock held: ");
        sb10.append(e);
        ssb.println(sb10.toString());
        long j3 = this.f96598w;
        if (j3 > 0) {
            long j4 = elapsedRealtime - j3;
            String valueOf5 = String.valueOf(this.f96599x);
            ssb.println(valueOf5.length() == 0 ? new String("  NETWORK REQUEST IN PROGRESS: stage: ") : "  NETWORK REQUEST IN PROGRESS: stage: ".concat(valueOf5));
            StringBuilder sb11 = new StringBuilder(51);
            sb11.append("  has been syncing for ");
            sb11.append(j4 / 1000);
            sb11.append(" seconds");
            ssb.println(sb11.toString());
        }
        ssb.println();
        ssb.println("Connection State");
        ssb.mo26034a();
        axwf axwf = this.f96588m;
        if (!axwf.mo53666c()) {
            ssb.println("cloud connection enabled");
        } else {
            String valueOf6 = String.valueOf(ayjl.m84112a(axwf.f96550a));
            ssb.println(valueOf6.length() == 0 ? new String("cloud connection disabled due to fatal error at time: ") : "cloud connection disabled due to fatal error at time: ".concat(valueOf6));
            ssb.println(axwf.f96551b);
        }
        long j5 = axwf.f96556g;
        StringBuilder sb12 = new StringBuilder(55);
        sb12.append("time since last active connection: ");
        sb12.append(j5);
        ssb.println(sb12.toString());
        long j6 = axwf.f96554e;
        StringBuilder sb13 = new StringBuilder(44);
        sb13.append("time since last upload: ");
        sb13.append(j6);
        ssb.println(sb13.toString());
        long j7 = axwf.f96552c;
        StringBuilder sb14 = new StringBuilder(37);
        sb14.append("upload interval: ");
        sb14.append(j7);
        ssb.println(sb14.toString());
        ssb.mo26035b();
        ssb.println();
        ssb.println("Event Queue");
        ssb.mo26034a();
        this.f96585j.dump(ssb, "CloudNodeAdapter");
        ssb.mo26035b();
        ssb.println();
        this.f96570B.mo53558a(ssb, z, z2);
        ssb.println("\nCloud Sync Events");
        this.f96586k.mo53558a(ssb, z, z2);
    }
}
