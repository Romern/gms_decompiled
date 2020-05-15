package com.google.android.gms.gcm;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraService extends Service {

    /* renamed from: a */
    public static volatile GcmChimeraService f32788a;

    /* renamed from: b */
    public static Semaphore f32789b = new Semaphore(0);

    /* renamed from: k */
    private static final Collection f32790k = bnfd.m109230a(m24305c());

    /* renamed from: c */
    HeartbeatChimeraAlarm f32791c;

    /* renamed from: d */
    public aank f32792d;

    /* renamed from: e */
    public aand f32793e;

    /* renamed from: f */
    aakw f32794f;

    /* renamed from: g */
    final bqgj f32795g = snp.m35704b(10);

    /* renamed from: h */
    public aamd f32796h;

    /* renamed from: i */
    private aakt f32797i;

    /* renamed from: j */
    private aajt f32798j;

    /* renamed from: a */
    public static void m24303a(String str, Object... objArr) {
        if (m24305c() > 0) {
            int i = -2;
            if (!(f32788a == null || f32788a.f32792d == null)) {
                i = f32788a.f32792d.mo17131h();
            }
            synchronized (f32790k) {
                f32790k.add(new aakj(i, str, objArr));
            }
        }
    }

    /* renamed from: b */
    public static bngx m24304b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        bngs bngs = new bngs();
        synchronized (f32790k) {
            for (aakj aakj : f32790k) {
                String format = simpleDateFormat.format(Long.valueOf(aakj.f28360a));
                int i = aakj.f28361b;
                String format2 = String.format(aakj.f28362c, aakj.f28363d);
                StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 18 + String.valueOf(format2).length());
                sb.append(format);
                sb.append(" net=");
                sb.append(i);
                sb.append(": ");
                sb.append(format2);
                bngs.mo67668c(sb.toString());
            }
        }
        return bngs.mo67664a();
    }

    /* renamed from: c */
    private static int m24305c() {
        return (int) cech.f182251a.mo6606a().mo78754a();
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        TreeMap treeMap;
        TreeMap treeMap2;
        if (!cecz.m136057e() || aajg.m21343c()) {
            mo19560a(printWriter);
            bngx b = m24304b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                printWriter.println((String) b.get(i));
            }
            aamn aamn = this.f32798j.f28305h;
            if (aamn.f28469a) {
                aamk aamk = aamn.f28471c;
                printWriter.println("\nApps supporting client queue:");
                synchronized (aamk) {
                    treeMap = new TreeMap(aamk.f28464b);
                    treeMap2 = new TreeMap(aamk.f28465c);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    printWriter.print(entry.getKey());
                    printWriter.print(" v");
                    printWriter.println(entry.getValue());
                }
                printWriter.println("\nHigh priority quota usage:");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm", Locale.US);
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    aamj aamj = (aamj) entry2.getValue();
                    printWriter.printf("%s used %d since %s\n", (aamh) entry2.getKey(), Integer.valueOf(aamj.f28462c), simpleDateFormat.format(Long.valueOf(aamj.f28461b)));
                }
                aamn.f28472d.mo17051a(printWriter);
            }
            printWriter.println("For scheduler stats see SchedulerService dump.");
            return;
        }
        printWriter.println("Not dumping stats for secondary user GcmService");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        aakb a = aakb.m21381a();
        if (aajg.m21343c()) {
            this.f32794f = a.f28341b;
            this.f32792d = a.mo16919d();
            sdo.m34970a(aajg.m21343c());
            this.f32791c = a.f28344e;
            this.f32798j = a.mo16921f();
            this.f32793e = a.mo16922g();
            f32788a = this;
            aakt aakt = new aakt(this.f32791c, this.f32792d, this.f32798j, this);
            this.f32797i = aakt;
            aank aank = aakt.f28385d;
            aank.f28565n = aank.m21641a(cect.f182268a.mo6606a().mo78768b());
            aank.f28566o = aank.m21641a(cect.f182268a.mo6606a().mo78767a());
            aank.mo17129f();
            NetworkInfo activeNetworkInfo = aank.f28553b.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    aank.f28567p = SystemClock.elapsedRealtime();
                }
                aank.f28562k = true;
                aank.mo17119a(activeNetworkInfo.getState(), activeNetworkInfo.getType());
            } else {
                aank.f28562k = false;
                aank.mo17119a(NetworkInfo.State.DISCONNECTED, -1);
            }
            if (cecz.m136073u() || cecz.m136066n() || cecz.m136065m()) {
                int i = Build.VERSION.SDK_INT;
                aank.mo17116a();
            }
            aani aani = aank.f28556e;
            aani.mo17109a(false);
            if (aani.mo17111b()) {
                aani.mo17108a(activeNetworkInfo, false);
            }
            BroadcastReceiver broadcastReceiver = aakt.f28386e.f28310m;
            if (broadcastReceiver != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_ADDED");
                intentFilter.addAction("android.intent.action.USER_REMOVED");
                intentFilter.addAction("android.intent.action.USER_STARTING");
                intentFilter.addAction("android.intent.action.USER_STOPPED");
                intentFilter.addAction("android.intent.action.USER_STOPPING");
                intentFilter.addAction("android.intent.action.USER_SWITCHED");
                aakt.f28383b.registerReceiver(broadcastReceiver, intentFilter);
            }
            IntentFilter intentFilter2 = new IntentFilter("android.provider.Telephony.SECRET_CODE");
            intentFilter2.addDataScheme("android_secret_code");
            intentFilter2.addDataAuthority("426", null);
            aakt.f28383b.registerReceiver(aakt.f28382a, intentFilter2);
            if (cedc.m136235e() > 0) {
                IntentFilter intentFilter3 = new IntentFilter();
                if (!cedc.f182364a.mo6606a().mo78876q()) {
                    intentFilter3.addAction("android.intent.action.USER_PRESENT");
                    intentFilter3.addAction("android.intent.action.SCREEN_OFF");
                } else {
                    intentFilter3.addAction("com.google.android.intent.action.MCS_HEARTBEAT");
                    intentFilter3.addAction("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
                }
                aakt.f28383b.registerReceiver(aakt.f28384c, intentFilter3);
            }
            aakt.f28383b.registerReceiver(aakt.f28384c, new IntentFilter("com.google.android.gms.gcm.HEARTBEAT_ALARM"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.intent.action.AIRPLANE_MODE");
            intentFilter4.addAction("com.google.android.intent.action.GCM_RECONNECT");
            int i2 = Build.VERSION.SDK_INT;
            intentFilter4.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            aakt.f28383b.registerReceiver(aakt.f28385d.f28555d, intentFilter4);
            mo19559a();
            f32789b.release();
        }
    }

    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        if (!cecz.m136057e() || aajg.m21343c()) {
            aakb.m21381a().mo16918c().mo16947b();
            f32788a = null;
            aakt aakt = this.f32797i;
            aank aank = aakt.f28385d;
            if (aank != null) {
                aakt.f28383b.unregisterReceiver(aank.f28555d);
                aank aank2 = aakt.f28385d;
                aank2.f28556e.f28540b.mo17057b();
                if (aank2.f28570s.mo17105b()) {
                    aank2.f28570s.mo17103a();
                }
            }
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = aakt.f28384c;
            if (heartbeatChimeraAlarm != null) {
                aakt.f28383b.unregisterReceiver(heartbeatChimeraAlarm);
                aakt.f28384c.f32815e.mo17057b();
                aakt.f28384c.f32814d.mo17065a();
            }
            aajt aajt = aakt.f28386e;
            if (!(aajt == null || (broadcastReceiver = aajt.f28310m) == null)) {
                aakt.f28383b.unregisterReceiver(broadcastReceiver);
            }
            aakt.f28383b.unregisterReceiver(aakt.f28382a);
            aand aand = this.f32793e;
            if (aand != null) {
                aand.mo17088a(15);
            }
            bqgj bqgj = this.f32795g;
            if (bqgj != null) {
                bqgj.shutdownNow();
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!aajg.m21343c()) {
            Log.e("GCM", "Unexpected GcmService started as secondary user !");
            stopSelf(i2);
            return 2;
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str) || "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(str)) {
            int i3 = Build.VERSION.SDK_INT;
            return 1;
        } else {
            this.f32795g.execute(new aaki(this, intent));
            return 1;
        }
    }

    /* renamed from: a */
    public final synchronized void mo19559a() {
        this.f32793e.mo17101i().mo17151a(cecz.m136070r());
        this.f32793e.mo17101i().mo17150a((int) cecz.m136071s());
        this.f32793e.mo17090a(this);
        if (((int) cecz.m136061i()) > 0) {
            this.f32792d.mo17123b();
        }
    }

    /* renamed from: a */
    public final void mo19560a(PrintWriter printWriter) {
        if (aytw.m84813a(this)) {
            printWriter.println("Direct boot mode (DeviceID not available");
        } else {
            String valueOf = String.valueOf(this.f32794f.mo16954b());
            printWriter.println(valueOf.length() == 0 ? new String("DeviceID: ") : "DeviceID: ".concat(valueOf));
        }
        if (this.f32793e.mo17101i().mo17149a() == -1) {
            printWriter.println("Disabled");
            return;
        }
        if (this.f32793e.mo17094b()) {
            printWriter.println(this.f32793e.toString());
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.f32791c;
            if (heartbeatChimeraAlarm.f32812b.mo17099g()) {
                String valueOf2 = String.valueOf(heartbeatChimeraAlarm.f32815e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 22);
                sb.append("Heartbeat waiting ack ");
                sb.append(valueOf2);
                printWriter.println(sb.toString());
            } else {
                String valueOf3 = String.valueOf(heartbeatChimeraAlarm.f32815e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 11);
                sb2.append("Heartbeat: ");
                sb2.append(valueOf3);
                printWriter.println(sb2.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = heartbeatChimeraAlarm.f32816f;
            if (j > 0) {
                String formatElapsedTime = DateUtils.formatElapsedTime((elapsedRealtime - j) / 1000);
                StringBuilder sb3 = new StringBuilder(String.valueOf(formatElapsedTime).length() + 36);
                sb3.append("Last heartbeat reset connection ");
                sb3.append(formatElapsedTime);
                sb3.append(" ago");
                printWriter.println(sb3.toString());
            }
            long j2 = heartbeatChimeraAlarm.f32821k;
            if (j2 > 0) {
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Last ping: ");
                sb4.append(j2);
                printWriter.println(sb4.toString());
            }
            SparseArray clone = heartbeatChimeraAlarm.f32814d.f28497a.clone();
            for (int i = 0; i < clone.size(); i++) {
                aamx aamx = (aamx) clone.valueAt(i);
                boolean a = HeartbeatChimeraAlarm.m24317a(clone.keyAt(i));
                int i2 = aamx.f28511c;
                StringBuilder sb5 = new StringBuilder(42);
                sb5.append("Adaptive Heartbeat type ");
                sb5.append(i2);
                sb5.append(": ");
                sb5.append(a);
                printWriter.println(sb5.toString());
                int i3 = aamx.f28512d;
                StringBuilder sb6 = new StringBuilder(29);
                sb6.append("connectionsLimit: ");
                sb6.append(i3);
                printWriter.println(sb6.toString());
                printWriter.println();
                printWriter.println("All stored connections: ");
                int i4 = 0;
                while (true) {
                    C1245ok okVar = aamx.f28510a;
                    if (i4 >= okVar.f26809h) {
                        break;
                    }
                    printWriter.println(okVar.mo15621c(i4));
                    i4++;
                }
                printWriter.println();
            }
            printWriter.println();
            aamv aamv = heartbeatChimeraAlarm.f32818h;
            if (aamv != null) {
                String valueOf4 = String.valueOf(aamv);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                sb7.append("Last connected: ");
                sb7.append(valueOf4);
                printWriter.println(sb7.toString());
                boolean z = heartbeatChimeraAlarm.f32820j;
                StringBuilder sb8 = new StringBuilder(45);
                sb8.append("Seen good heartbeat in last connection? ");
                sb8.append(z);
                printWriter.println(sb8.toString());
                printWriter.println();
            }
            this.f32792d.mo17121a(printWriter);
        } else if (this.f32793e.mo17093a()) {
            printWriter.println("Connecting");
            printWriter.println(this.f32793e.toString());
            this.f32792d.mo17121a(printWriter);
        } else {
            printWriter.println("Not connected");
            this.f32792d.mo17121a(printWriter);
        }
        printWriter.println();
    }
}
