package com.google.android.gms.checkin;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckinChimeraService extends aeah {

    /* renamed from: a */
    public static final sek f29939a = qgn.m32143a("CheckinChimeraService");

    /* renamed from: b */
    private static final String f29940b = String.format("https://%s/checkin", stn.m36304a("gms.checkin.sw_domain", "android.clients.google.com"));

    /* renamed from: h */
    private static volatile boolean f29941h = false;

    /* renamed from: i */
    private static final Object f29942i = new Object();

    /* renamed from: j */
    private static final ReentrantLock f29943j = new ReentrantLock();

    /* renamed from: k */
    private static Bundle f29944k = null;

    /* renamed from: c */
    private bmxv f29945c = bmvz.f131120a;

    /* renamed from: d */
    private final Object f29946d = new Object();

    /* renamed from: e */
    private qfc f29947e;

    /* renamed from: g */
    private int f29948g = 0;

    /* renamed from: l */
    private qfn f29949l;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ImposeReceiver extends asfd {
        public final void onReceive(Context context, Intent intent) {
            sek sek = CheckinChimeraService.f29939a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("launching from ImposeReceiver: ");
            sb.append(valueOf);
            sek.mo25409a(sb.toString(), new Object[0]);
            CheckinChimeraService.m22345a(6, intent);
            CheckinChimeraService.m22348a(context, false, 10, false, true, intent);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SecretCodeReceiver extends asfd {
        public final void onReceive(Context context, Intent intent) {
            CheckinChimeraService.m22345a(5, intent);
            CheckinChimeraService.m22348a(context, true, 8, false, false, intent);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class TriggerReceiver extends asfd {
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
         arg types: [android.content.ContentResolver, java.lang.String, int]
         candidates:
          aymn.a(android.content.ContentResolver, java.lang.String, int):int
          aymn.a(android.content.ContentResolver, java.lang.String, long):long
          aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
          aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
          aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
          aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
        public final void onReceive(Context context, Intent intent) {
            boolean z;
            boolean z2;
            int i;
            if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) || intent.hasCategory("android.server.checkin.CHECKIN")) {
                if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
                    if (aymn.m84269a(context.getContentResolver(), "checkin_trigger_on_sim_change", false)) {
                        String stringExtra = intent.getStringExtra("ss");
                        if (!"LOADED".equals(stringExtra) && !"ABSENT".equals(stringExtra)) {
                            sek sek = CheckinChimeraService.f29939a;
                            String valueOf = String.valueOf(intent);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(stringExtra).length());
                            sb.append("Ignored SIM state change trigger: ");
                            sb.append(valueOf);
                            sb.append(" sim state: ");
                            sb.append(stringExtra);
                            sek.mo25409a(sb.toString(), new Object[0]);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                sek sek2 = CheckinChimeraService.f29939a;
                String valueOf2 = String.valueOf(intent);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("launching from TriggerReceiver: ");
                sb2.append(valueOf2);
                sek2.mo25409a(sb2.toString(), new Object[0]);
                String action = intent.getAction();
                int i2 = 9;
                if (action != null) {
                    boolean z3 = true;
                    if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
                        i2 = 5;
                    } else if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
                        if ("UPLOAD_NONE".equals(intent.getStringExtra("CheckinService_logUploadPolicy"))) {
                            i2 = 17;
                            z3 = false;
                        } else {
                            i2 = 11;
                            z3 = false;
                        }
                    } else if (!"android.app.action.DEVICE_OWNER_CHANGED".equals(action)) {
                        if (intent.hasExtra("CheckinService_onStart_checkinReason")) {
                            i2 = qhi.m32172a(intent.getIntExtra("CheckinService_onStart_checkinReason", 8));
                        }
                        z3 = false;
                    } else if (!spn.m35900j(context)) {
                        i2 = 16;
                    } else {
                        CheckinChimeraService.f29939a.mo25412b("Ignoring ACTION_DEVICE_OWNER_CHANGED for ARC++ device", new Object[0]);
                        return;
                    }
                    if ("android.server.checkin.CHECKIN".equals(action)) {
                        z2 = intent.getBooleanExtra("fetchSystemUpdates", false);
                        i = i2;
                        z = z3;
                    } else {
                        i = i2;
                        z = z3;
                        z2 = false;
                    }
                } else {
                    i = 9;
                    z2 = false;
                    z = false;
                }
                CheckinChimeraService.m22345a(4, intent);
                CheckinChimeraService.m22348a(context, false, i, z2, z, intent);
                return;
            }
            sek sek3 = CheckinChimeraService.f29939a;
            String valueOf3 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
            sb3.append("Ignored a trigger: ");
            sb3.append(valueOf3);
            sek3.mo25409a(sb3.toString(), new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* renamed from: a */
    static aebm m22342a(Bundle bundle, boolean z, Context context, String str) {
        long a = aymn.m84261a(context.getContentResolver(), "checkin_interval", 43200L);
        long min = Math.min(aymn.m84261a(context.getContentResolver(), "checkin_interval_flex_sec", 10800L), a);
        SharedPreferences.Editor edit = qdn.m31960l(context).edit();
        edit.putLong("CheckinInterval_IntervalSeconds", a);
        edit.putLong("CheckinInterval_FlexSec", min);
        edit.apply();
        aebl aebl = new aebl();
        aebl.f63099k = "PeriodicTaskTag";
        aebl.mo34029b(z);
        aebl.f63097i = str;
        aebl.f63102n = true;
        aebl.mo34028b(0, 0);
        aebl.mo34024a(0, 0);
        aebl.mo34026a(false);
        aebl.f63070a = a;
        aebl.f63071b = min;
        aebl.f63107s = bundle;
        return aebl.mo33974b();
    }

    /* renamed from: b */
    private static String m22355b(Bundle bundle) {
        return bundle.getString("checkin_task_tag", "Default Task");
    }

    /* renamed from: c */
    private static int m22358c(Bundle bundle) {
        return bundle.getInt("checkin_start_id", 0);
    }

    /* renamed from: d */
    public static String m22361d(Context context) {
        return Long.toString(qdn.m31947b(context));
    }

    /* renamed from: f */
    private final String m22366f() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        String subscriberId = telephonyManager.getSubscriberId();
        if (simSerialNumber == null) {
            simSerialNumber = "no-sim";
        }
        if (subscriberId == null) {
            subscriberId = "no-imsi";
        }
        StringBuilder sb = new StringBuilder(simSerialNumber.length() + 1 + subscriberId.length());
        sb.append(simSerialNumber);
        sb.append("\n");
        sb.append(subscriberId);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(boolean, android.content.Context):void
     arg types: [int, com.google.android.gms.checkin.CheckinChimeraService]
     candidates:
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.SharedPreferences, java.lang.String):long
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.Context, boolean):void
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.SharedPreferences, android.content.Context):void
      aeah.a(aecc, aebu):bqgg
      aebd.a(aecc, aebu):bqgg
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(boolean, android.content.Context):void */
    /* renamed from: aZ */
    public final void mo7135aZ() {
        f29939a.mo25412b("onInitializeTasks", new Object[0]);
        m22346a(this);
        EventLogChimeraService.m22378a(false, (Context) this);
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            sek sek = f29939a;
            String valueOf = String.valueOf(intent.getAction());
            sek.mo25409a(valueOf.length() == 0 ? new String("onBind: ") : "onBind: ".concat(valueOf), new Object[0]);
            if (bmxx.m108578b(intent.getAction()).equals("com.google.android.gms.checkin.BIND_TO_SERVICE")) {
                qfn qfn = this.f29949l;
                qfn.asBinder();
                return qfn;
            } else if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                return super.onBind(intent);
            }
        }
        f29939a.mo25416d("onBind is called with an unexpected intent, returning null.", new Object[0]);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f29949l = new qfn(this);
        this.f29947e = new qfc();
    }

    public final void onDestroy() {
        m22359c();
        super.onDestroy();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    public final int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2 = intent;
        int i3 = i2;
        f29939a.mo25414c("onStartCommand", new Object[0]);
        Context applicationContext = getApplicationContext();
        svu.m36490b(applicationContext);
        boolean a = aymn.m84269a(applicationContext.getContentResolver(), "checkin_services_start_not_sticky", false);
        if (!svu.m36488a(applicationContext)) {
            f29939a.mo25414c("notEnabled return:%d", 2);
            return 2;
        } else if (intent2 == null) {
            Bundle bundle = new Bundle();
            if (a) {
                m22352a(bundle, this, "com.google.android.gms.checkin.CheckinService");
                f29939a.mo25414c("Start not sticky return:%d", 2);
                return 2;
            }
            m22353a(bundle, "AutoRestartTaskTag");
            m22350a(bundle, i3);
            m22367f(bundle);
            f29939a.mo25414c("Run checkin on new thread with null intent return:%d", 1);
            return 1;
        } else {
            Bundle bundle2 = intent.getExtras() == null ? new Bundle() : intent.getExtras();
            if ("com.google.android.gms.checkin.SHOW_NOTIFICATION".equals(intent.getAction())) {
                String string = bundle2.getString("show_notification_message", "checkin finished");
                C1102je jeVar = new C1102je(this);
                jeVar.mo13630b(17301642);
                jeVar.mo13619a(System.currentTimeMillis());
                jeVar.mo13639d(string);
                jeVar.mo13627a(true);
                jeVar.mo13640e(string);
                sex.m35104a(this).mo25441a(17301642, jeVar.mo13629b());
                if (bundle2.containsKey("show_notification_start_id")) {
                    stopSelfResult(bundle2.getInt("show_notification_start_id"));
                }
                if (a) {
                    f29939a.mo25414c("Notification non-sticky return:%d", 2);
                    return 2;
                }
                f29939a.mo25414c("Notification sticky return:%d", 1);
                return 1;
            } else if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                int onStartCommand = super.onStartCommand(intent, i, i2);
                f29939a.mo25414c("Gcm task onStartCommand return:%d", Integer.valueOf(onStartCommand));
                return onStartCommand;
            } else {
                if (qhi.m32172a(bundle2.getInt("CheckinService_onStart_checkinReason", 0)) == 2) {
                    m22349a(qdn.m31960l(this), 0, 0, 0);
                }
                m22350a(bundle2, i3);
                if (intent2.getBooleanExtra("CheckinService_runRequestQueue", false)) {
                    qcq a2 = qcq.m31858a();
                    qfb qfb = null;
                    while (true) {
                        qcb qcb = (qcb) a2.f40933a.poll();
                        if (qcb == null) {
                            break;
                        }
                        if (qcb.f40910a != null) {
                            qfb = this.f29947e.mo24004a();
                            Bundle bundle3 = qcb.f40910a;
                            m22353a(bundle3, "RunRequestQueueTaskTag");
                            bundle3.putInt("CheckinService_onStart_checkinReason", 8);
                            m22367f(bundle3);
                        } else if (f29943j.isLocked()) {
                            qfb = this.f29947e.mo24004a();
                        }
                        if (qfb == null) {
                            qcb.mo23900a(21042);
                        } else {
                            if (qcb.f40912c == null) {
                                qfb.mo24001a();
                            }
                            qfb.mo24002a(qcb);
                            if (!qcb.f40911b) {
                                qfb.mo24003a(true, System.currentTimeMillis());
                            }
                        }
                    }
                    if (!a) {
                        f29939a.mo25414c("Run API request return:%d", 3);
                        return 3;
                    }
                    f29939a.mo25414c("Run API request return:%d", 2);
                    return 2;
                }
                m22353a(bundle2, "CheckinNowTaskTag");
                m22356b();
                asfd.m73946a(this, intent);
                m22367f(bundle2);
                f29939a.mo25414c("Run checkin on new thread return:%d", 1);
                return 1;
            }
        }
    }

    /* renamed from: b */
    private final void m22356b() {
        synchronized (this.f29946d) {
            if (!this.f29945c.mo66813a()) {
                this.f29945c = bmxv.m108566b(new asfb(this, 1, "Checkin Service", null, "com.google.android.gms"));
            }
            if (this.f29945c.mo66813a() && ((asfb) this.f29945c.mo66814b()).mo49124e()) {
                f29939a.mo25414c("Acquire service wakelock.", new Object[0]);
                long o = cdci.m132549o();
                ((asfb) this.f29945c.mo66814b()).mo49115a(false);
                ((asfb) this.f29945c.mo66814b()).mo49111a(o);
            }
        }
    }

    /* renamed from: c */
    private final void m22359c() {
        synchronized (this.f29946d) {
            if (this.f29945c.mo66813a()) {
                try {
                    if (((asfb) this.f29945c.mo66814b()).mo49124e()) {
                        f29939a.mo25414c("Release service wakelock.", new Object[0]);
                        ((asfb) this.f29945c.mo66814b()).mo49120c();
                    }
                } catch (RuntimeException e) {
                    sek sek = f29939a;
                    String valueOf = String.valueOf(e.getMessage());
                    sek.mo25416d(valueOf.length() == 0 ? new String("Caught exception releasing Checkin Service Wakelock: ") : "Caught exception releasing Checkin Service Wakelock: ".concat(valueOf), new Object[0]);
                }
                this.f29945c = bmvz.f131120a;
            }
        }
    }

    /* renamed from: e */
    private final boolean m22364e() {
        int i = Build.VERSION.SDK_INT;
        try {
            return Settings.Global.getInt(getContentResolver(), "euicc_provisioned") == 1;
        } catch (Settings.SettingNotFoundException e) {
            return false;
        }
    }

    /* renamed from: f */
    private final void m22367f(Bundle bundle) {
        f29939a.mo25414c("runCheckinOnNewThread", new Object[0]);
        if (!m22365e(bundle)) {
            f29939a.mo25414c("Checkin is not queued to run.", new Object[0]);
            return;
        }
        qcu.m31867a();
        qcu.f40940a.execute(new qcs(this, bundle));
    }

    /* renamed from: d */
    private static boolean m22362d() {
        int i = Build.VERSION.SDK_INT;
        return cdci.m132553s();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: e */
    private final boolean m22365e(Bundle bundle) {
        Bundle bundle2 = bundle;
        synchronized (f29942i) {
            f29939a.mo25414c("Check queued to run. Is task waiting: %s", Boolean.valueOf(f29941h));
            if (!f29941h) {
                int i = bundle2.getInt("CheckinService_onStart_checkinReason", 0);
                if (aymn.m84269a(getContentResolver(), "checkin_enable_package_level_rate_limiting", false)) {
                    String string = bundle2.getString("checkin_source_package", "unspecified");
                    SharedPreferences l = qdn.m31960l(getApplicationContext());
                    String valueOf = String.valueOf(string);
                    long j = l.getLong(valueOf.length() == 0 ? new String("CheckinService_last_checkin_ms_") : "CheckinService_last_checkin_ms_".concat(valueOf), 0);
                    ContentResolver contentResolver = getContentResolver();
                    String valueOf2 = String.valueOf(string);
                    long a = aymn.m84261a(contentResolver, valueOf2.length() == 0 ? new String("checkin_min_interval_ms_") : "checkin_min_interval_ms_".concat(valueOf2), 0L);
                    long max = Math.max(System.currentTimeMillis() - j, 0L);
                    f29939a.mo25414c("CheckinChimeraService", String.format("Checkin interval check for package: %s last checkin: %s min interval config: %s actual interval: %s", string, Long.valueOf(j), Long.valueOf(a), Long.valueOf(max)));
                    if (max < a) {
                        if (cdci.m132543i()) {
                            int i2 = 19;
                            if (string != null) {
                                if (!string.equals("unspecified")) {
                                    i2 = 275;
                                }
                            }
                            qdg.m31917a((i << 9) | i2);
                        }
                        f29939a.mo25414c("High frequency skip needed", new Object[0]);
                    }
                }
                long a2 = aymn.m84261a(getContentResolver(), "checkin_high_frequency_limit_ms", 30000L);
                int a3 = aymn.m84260a(getContentResolver(), "checkin_high_frequency_allowance", 3);
                SharedPreferences l2 = qdn.m31960l(getApplicationContext());
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = l2.getLong("HighFrequency_LastTimestampMs", 0);
                Long valueOf3 = Long.valueOf(l2.getLong("HighFrequency_SumMs", 0));
                int i3 = l2.getInt("HighFrequency_Count", 0);
                long j3 = currentTimeMillis - j2;
                if (i3 != 0) {
                    if (j3 <= a2) {
                        Long valueOf4 = Long.valueOf(valueOf3.longValue() + j3);
                        int i4 = i3 + 1;
                        long max2 = Math.max(0L, ((((long) (i4 - a3)) * a2) - ((long) valueOf4.intValue())) / ((long) i4));
                        m22349a(l2, currentTimeMillis, i4, (long) Long.valueOf(valueOf4.longValue() + max2).intValue());
                        if (m22363d(bundle)) {
                            max2 = 0;
                        }
                        m22351a(bundle2, max2, a2);
                        f29941h = true;
                        return true;
                    }
                }
                m22349a(l2, currentTimeMillis, 1, 0);
                m22351a(bundle2, 0, a2);
                f29941h = true;
                return true;
            }
            f29944k = m22343a(f29944k, bundle2);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: b */
    public static void m22357b(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.checkin.CheckinService");
        className.putExtra("CheckinService_runRequestQueue", true);
        asfd.m73947b(context, className);
    }

    /* renamed from: d */
    private static boolean m22363d(Bundle bundle) {
        return bundle != null && bundle.getBoolean("CheckinService_forceCheckin", false);
    }

    /* renamed from: c */
    public static boolean m22360c(Context context) {
        return !qdn.m31960l(context).getStringSet("CheckinService_accountsReceivedByServer", Collections.emptySet()).isEmpty();
    }

    /* renamed from: a */
    static final Bundle m22343a(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null || bundle2.isEmpty()) {
            return bundle;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2.getBoolean("CheckinService_fetchSystemUpdates", false)) {
            bundle.putBoolean("CheckinService_fetchSystemUpdates", true);
        }
        if (bundle2.getBoolean("CheckinService_forceCheckin", false)) {
            bundle.putBoolean("CheckinService_forceCheckin", true);
        }
        if (bundle2.getBoolean("checkin_source_force")) {
            bundle.putBoolean("checkin_source_force", true);
            if (bundle2.containsKey("checkin_source_package")) {
                bundle.putString("checkin_source_package", bundle2.getString("checkin_source_package"));
            }
            if (bundle2.containsKey("checkin_source_class")) {
                bundle.putString("checkin_source_class", bundle2.getString("checkin_source_class"));
            }
        }
        if (bundle2.containsKey("CheckinService_networkRequest") && m22362d()) {
            bundle.putParcelable("CheckinService_networkRequest", bundle2.getParcelable("CheckinService_networkRequest"));
        }
        return bundle;
    }

    /* renamed from: a */
    private static String m22344a(Account account) {
        return new JSONObject().put("authAccount", account.name).put("accountType", account.type).toString();
    }

    /* renamed from: a */
    public static void m22345a(int i, Intent intent) {
        String str;
        if (cdci.m132543i()) {
            int i2 = 4;
            int i3 = (i << 4) | 1;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str == null) {
                i2 = 1;
            } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(str)) {
                i2 = 3;
            } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(str)) {
                i2 = !"android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(str) ? !"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(str) ? !"com.google.android.c2dm.intent.RECEIVE".equals(str) ? !"android.app.action.DEVICE_OWNER_CHANGED".equals(str) ? "android.intent.action.SIM_STATE_CHANGED".equals(str) ? 9 : 2 : 8 : 6 : 7 : 5;
            }
            qdg.m31917a(i3 | (i2 << 8));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.checkin.CheckinChimeraService.a(android.os.Bundle, boolean, android.content.Context, java.lang.String):aebm
     arg types: [android.os.Bundle, int, android.content.Context, java.lang.String]
     candidates:
      com.google.android.gms.checkin.CheckinChimeraService.a(android.content.SharedPreferences, long, int, long):void
      com.google.android.gms.checkin.CheckinChimeraService.a(android.os.Bundle, boolean, android.content.Context, java.lang.String):aebm */
    /* renamed from: a */
    static void m22346a(Context context) {
        aeat a = aeat.m51532a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("CheckinService_onStart_showNotification", false);
        bundle.putInt("CheckinService_onStart_checkinReason", 8);
        a.mo33984a(m22342a(bundle, false, context, "com.google.android.gms.checkin.CheckinService"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aeab(Uri.parse("content://com.google.android.gsf.gservices"), 1));
        aeac aeac = new aeac();
        aeac.f63099k = "GServicesObserverTaskTag";
        aeac.mo34027b(1);
        aeac.f63097i = "com.google.android.gms.checkin.CheckinService";
        aeac.f63102n = false;
        aeac.mo34028b(0, 0);
        aeac.mo34024a(0, 0);
        aeac.mo34026a(false);
        aeac.mo33973a(arrayList);
        aeac.f63107s = bundle;
        a.mo33984a(aeac.mo33974b());
    }

    /* renamed from: a */
    public static void m22347a(Context context, String str) {
        String string = qdn.m31960l(context).getString("CheckinService_lastSimOperator", "");
        if (str != null && !string.equals(str)) {
            qdn.m31960l(context).edit().putString("CheckinService_lastSimOperator", str).apply();
        }
    }

    /* renamed from: a */
    static void m22348a(Context context, boolean z, int i, boolean z2, boolean z3, Intent intent) {
        boolean z4;
        String str;
        String str2;
        boolean z5;
        Context context2 = context;
        boolean z6 = z;
        boolean z7 = z2;
        Intent intent2 = intent;
        Intent className = new Intent().setClassName(context2, "com.google.android.gms.checkin.CheckinService");
        className.putExtra("CheckinService_onStart_showNotification", z6);
        int i2 = i - 1;
        if (i != 0) {
            className.putExtra("CheckinService_onStart_checkinReason", i2);
            className.putExtra("CheckinService_fetchSystemUpdates", z7);
            String str3 = "";
            if (intent2 == null) {
                str2 = "UPLOAD_ALL";
                str = "unspecified";
                z4 = false;
            } else {
                if (intent2.hasExtra("checkin_source_package")) {
                    str = bmxx.m108578b(intent2.getStringExtra("checkin_source_package"));
                } else {
                    str = "unspecified";
                }
                if (intent2.hasExtra("checkin_source_class")) {
                    str3 = bmxx.m108578b(intent2.getStringExtra("checkin_source_class"));
                }
                if (intent2.hasExtra("checkin_source_force")) {
                    z4 = intent2.getBooleanExtra("checkin_source_force", false);
                } else {
                    z4 = false;
                }
                str2 = intent2.hasExtra("CheckinService_logUploadPolicy") ? bmxx.m108578b(intent2.getStringExtra("CheckinService_logUploadPolicy")) : "UPLOAD_ALL";
            }
            className.putExtra("checkin_source_package", str);
            className.putExtra("checkin_source_class", str3);
            className.putExtra("checkin_source_force", z4);
            if (intent2 != null) {
                className.putExtra("checkin_source_intent_action", bmxx.m108578b(intent.getAction()));
            }
            if (z3) {
                z5 = true;
            } else {
                z5 = z4;
            }
            className.putExtra("CheckinService_forceCheckin", z5);
            className.putExtra("CheckinService_logUploadPolicy", str2);
            if (cdci.m132543i()) {
                int i3 = i2 == 1 ? 18 : 2;
                if (!str2.equals("UPLOAD_ALL")) {
                    str2.equals("UPLOAD_NONE");
                }
                if (z4) {
                    i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                if (!str.equals("unspecified")) {
                    i3 |= 512;
                }
                if (!TextUtils.isEmpty(str3)) {
                    i3 |= 1024;
                }
                int i4 = i3 | 14336;
                if (z6) {
                    i4 |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                }
                int i5 = 32768 | i4 | ((i2 << 16) & 255);
                if (z7) {
                    i5 |= 16777216;
                }
                qdg.m31917a(i5);
            }
            if (cdci.m132554t()) {
                Bundle extras = className.getExtras();
                if (extras == null) {
                    asfd.m73947b(context2, qga.m32112a(context));
                } else {
                    asfd.m73947b(context2, qga.m32113a(context2, extras));
                }
            } else {
                asfd.m73947b(context2, className);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    private static void m22349a(SharedPreferences sharedPreferences, long j, int i, long j2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("HighFrequency_Count", i);
        edit.putLong("HighFrequency_SumMs", j2);
        edit.putLong("HighFrequency_LastTimestampMs", j);
        edit.apply();
    }

    /* renamed from: a */
    private static void m22350a(Bundle bundle, int i) {
        bundle.putInt("checkin_start_id", i);
    }

    /* renamed from: a */
    private static void m22351a(Bundle bundle, long j, long j2) {
        bundle.putLong("high_frequency_delay", Math.min(j, j2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* renamed from: a */
    static final void m22352a(Bundle bundle, Context context, String str) {
        aeat a = aeat.m51532a(context);
        ContentResolver contentResolver = context.getContentResolver();
        long a2 = aymn.m84261a(contentResolver, "checkin_retry_task_start_delay_secs", 30L);
        long a3 = aymn.m84261a(contentResolver, "checkin_retry_task_end_delay_secs", 120L);
        int a4 = aymn.m84260a(contentResolver, "checkin_retry_task_initial_backoff_secs", 7200);
        int a5 = aymn.m84260a(contentResolver, "checkin_retry_task_max_backoff_secs", 82800);
        aebn aebn = new aebn();
        aebn.f63075b = a4;
        aebn.f63076c = a5;
        aebn.f63074a = 0;
        aebo a6 = aebn.mo34011a();
        aebi aebi = new aebi();
        aebi.mo34004a(a2, a3);
        aebi.f63099k = "RetryTaskTag";
        aebi.f63097i = str;
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        aebi.f63107s = bundle;
        aebi.f63106r = a6;
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    private static void m22353a(Bundle bundle, String str) {
        bundle.putString("checkin_task_tag", str);
    }

    /* renamed from: a */
    public static boolean m22354a(Context context, Account account) {
        try {
            return qdn.m31960l(context).getStringSet("CheckinService_accountsReceivedByServer", Collections.emptySet()).contains(m22344a(account));
        } catch (JSONException e) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.checkin.CheckinChimeraService.a(android.os.Bundle, boolean, android.content.Context, java.lang.String):aebm
     arg types: [?[OBJECT, ARRAY], int, com.google.android.gms.checkin.CheckinChimeraService, java.lang.String]
     candidates:
      com.google.android.gms.checkin.CheckinChimeraService.a(android.content.SharedPreferences, long, int, long):void
      com.google.android.gms.checkin.CheckinChimeraService.a(android.os.Bundle, boolean, android.content.Context, java.lang.String):aebm */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        sek sek = f29939a;
        String valueOf = String.valueOf(str);
        sek.mo25412b(valueOf.length() == 0 ? new String("onRunTask with tag: ") : "onRunTask with tag: ".concat(valueOf), new Object[0]);
        Bundle bundle = aecc.f63129b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        m22353a(bundle, str);
        if ("GServicesObserverTaskTag".equals(str)) {
            SharedPreferences l = qdn.m31960l(this);
            long j = l.getLong("CheckinInterval_IntervalSeconds", 0);
            long j2 = l.getLong("CheckinInterval_FlexSec", 0);
            long a = aymn.m84261a(getContentResolver(), "checkin_interval", j);
            long a2 = aymn.m84261a(getContentResolver(), "checkin_interval_flex_sec", j2);
            if (!(j == a && j2 == a2)) {
                aeat.m51532a(this).mo33984a(m22342a((Bundle) null, true, (Context) this, "com.google.android.gms.checkin.CheckinService"));
            }
            EventLogChimeraService.m22377a(l, this);
            return 1;
        } else if (cdci.m132554t()) {
            startService(qga.m32113a(this, bundle));
            return 0;
        } else if (m22365e(bundle)) {
            mo17612a(bundle);
            return 0;
        } else if (!"RetryTaskTag".equals(str)) {
            return 0;
        } else {
            return 1;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a3, code lost:
        com.google.android.gms.checkin.CheckinChimeraService.f29939a.mo25416d("CheckinChimeraService", "NoSuchMethodException from TelephonyManager methods for getting SIM IDs", r0);
        r6 = m22366f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02eb, code lost:
        r7 = com.google.android.gms.checkin.CheckinChimeraService.f29939a;
        r12 = java.lang.String.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f7, code lost:
        if (r12.length() == 0) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f9, code lost:
        r12 = new java.lang.String("subscriberid changed to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ff, code lost:
        r12 = "subscriberid changed to ".concat(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0303, code lost:
        r7.mo25409a(r12, new java.lang.Object[0]);
        r11.edit().putString("CheckinService_lastSim", r6).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0316, code lost:
        r10 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        com.google.android.gms.checkin.CheckinChimeraService.f29939a.mo25414c("System re-creates CheckinService with null intent.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0337, code lost:
        r26 = r14;
        r25 = r21;
        r7 = false;
        r11 = false;
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0347, code lost:
        if (r2.containsKey("checkin_source_package") != false) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r13 = r2.getString("checkin_source_package", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0352, code lost:
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x035a, code lost:
        if (r2.containsKey("checkin_source_class") != false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r14 = r2.getString("checkin_source_class", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036c, code lost:
        if (r2.containsKey("checkin_source_force") != false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r6 = r2.getBoolean("checkin_source_force", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0376, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037d, code lost:
        if (r2.containsKey("CheckinService_logUploadPolicy") != false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r15 = r2.getString("CheckinService_logUploadPolicy", "UPLOAD_ALL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x038f, code lost:
        if (r2.containsKey("CheckinService_fetchSystemUpdates") != false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r7 = r2.getBoolean("CheckinService_fetchSystemUpdates", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0399, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.putLong("start_timestamp", java.lang.System.currentTimeMillis());
        r13 = r2.getLong("high_frequency_delay", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03a0, code lost:
        if (r2.containsKey("CheckinService_forceCheckin") == false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a2, code lost:
        r27 = r6;
        r25 = r13;
        r26 = r14;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03aa, code lost:
        r11 = r2.getBoolean("CheckinService_forceCheckin", false);
        r27 = r6;
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03c5, code lost:
        m22347a(r8, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03f9, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03fe, code lost:
        r12.f41016j = true;
        r15 = "UPLOAD_NONE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (r13 > 0) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0409, code lost:
        r12.f41017k = com.google.android.gms.checkin.CheckinChimeraService.f29940b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0412, code lost:
        if (p000.sre.m36082b(r28) != false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0414, code lost:
        r12.f41017k = "https://checkin.gstatic.com/checkin";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0421, code lost:
        r5 = new p000.qdt();
        r5.f41029b = true;
        r5.f41028a = getSharedPreferences("dns_patcher", 0);
        r12.f41014h = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x046a, code lost:
        r12.f41024r = m22364e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x047c, code lost:
        r5.mo66930d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0484, code lost:
        r12.f41008b = (android.os.DropBoxManager) getSystemService("dropbox");
        com.google.android.gms.checkin.eventlog.EventLogChimeraService.m22376a(r1, com.google.android.gms.checkin.eventlog.EventLogChimeraService.m22379a(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.Thread.sleep(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04a5, code lost:
        if (r2.containsKey("CheckinService_networkRequest") != false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a7, code lost:
        r12.mo23966a((android.net.NetworkRequest) r2.getParcelable("CheckinService_networkRequest"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04bc, code lost:
        r5.mo66931e();
        r6 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04c1, code lost:
        if (r10 != 0) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04c3, code lost:
        p000.qdg.m31918a(java.lang.Integer.valueOf((r6 << 4) | 4), java.lang.Long.valueOf(r5.mo66928a(java.util.concurrent.TimeUnit.MILLISECONDS)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04e4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04ee, code lost:
        r6 = getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04f8, code lost:
        if (m22362d() != false) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04fa, code lost:
        r7 = new p000.qdr(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0500, code lost:
        r7 = new p000.qdi(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0505, code lost:
        r5 = new p000.qdd(r6, r7, new p000.qdb(getApplicationContext()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0512, code lost:
        r6 = getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x051c, code lost:
        if (m22362d() != false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x051e, code lost:
        r7 = new p000.qdr(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0524, code lost:
        r7 = new p000.qdi(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0529, code lost:
        r5 = new p000.qdd(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x053d, code lost:
        p000.qdn.m31960l(getApplicationContext()).edit().putLong("CheckinService_lastCheckinSuccessTime", java.lang.System.currentTimeMillis()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x055e, code lost:
        r12 = r12.f41235l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0560, code lost:
        if (r12 != null) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0563, code lost:
        r12 = p000.qhg.f41336o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0565, code lost:
        r12 = r12.f41344g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0568, code lost:
        r12 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0577, code lost:
        r12 = p000.qde.m31913a(r7);
        r13 = r12.length;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x057d, code lost:
        if (r14 < r13) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x057f, code lost:
        r15 = r12[r14];
        r29 = r12;
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x058f, code lost:
        if ("com.google.android.checkin.INVALIDATE".equals(r15.getAction()) != false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0591, code lost:
        r12 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05a0, code lost:
        r12 = r6.f41236m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05a2, code lost:
        p000.qcx.m31881a(r1, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05a6, code lost:
        sendBroadcast(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05a9, code lost:
        r14 = r14 + 1;
        r12 = r29;
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r15 = com.google.android.gms.checkin.CheckinChimeraService.f29939a;
        r11 = new java.lang.StringBuilder(72);
        r11.append("Error in sleep during high frequency request delay: ");
        r11.append(r13);
        r15.mo25416d(r11.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05c6, code lost:
        r11.edit().putString("CheckinService_versionInfo", r7.f41260i).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05d9, code lost:
        if ((r7.f41252a & com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05db, code lost:
        com.google.android.gms.checkin.CheckinChimeraService.f29939a.mo25409a("Clearing the deviceDataVersionInfo.", new java.lang.Object[0]);
        r11.edit().remove("CheckinService_deviceDataVersionInfo").apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0601, code lost:
        if (r7.f41261j.equals(r11.getString("CheckinService_deviceDataVersionInfo", "")) == false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0603, code lost:
        com.google.android.gms.checkin.CheckinChimeraService.f29939a.mo25409a("Storing the new deviceDataVersionInfo.", new java.lang.Object[0]);
        r11.edit().putString("CheckinService_deviceDataVersionInfo", r7.f41261j).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0622, code lost:
        if (r7.f41262k.size() > 0) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0624, code lost:
        r6 = com.google.android.gms.checkin.CheckinChimeraService.f29939a;
        r11 = r7.f41262k.size();
        r12 = new java.lang.StringBuilder(32);
        r12.append("Invalidating ");
        r12.append(r11);
        r12.append(" tokens.");
        r6.mo25409a(r12.toString(), new java.lang.Object[0]);
        p000.qcx.m31881a(r1, r7.f41262k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0652, code lost:
        r6 = p000.qdn.m31960l(getApplicationContext());
        r7 = r4.f41046p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x065c, code lost:
        if (r7 == null) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0664, code lost:
        r7 = r7.f41359d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0667, code lost:
        r7 = "unspecified";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0669, code lost:
        r11 = java.lang.System.currentTimeMillis();
        r6 = r6.edit();
        r14 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x067b, code lost:
        if (r14.length() == 0) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x067d, code lost:
        r14 = new java.lang.String("CheckinService_last_checkin_ms_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0683, code lost:
        r14 = "CheckinService_last_checkin_ms_".concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0687, code lost:
        r6.putLong(r14, r11).apply();
        r6 = com.google.android.gms.checkin.CheckinChimeraService.f29939a;
        r14 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 64);
        r14.append("Recording last checkin time for package ");
        r14.append(r7);
        r14.append(" as ");
        r14.append(r11);
        r6.mo25412b(r14.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06c6, code lost:
        r7.putExtra("success", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06cd, code lost:
        r7.putExtra("success", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06db, code lost:
        p000.qff.m32062a(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06f4, code lost:
        r6 = p000.qdn.m31960l(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06f8, code lost:
        if (r10 == null) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06ff, code lost:
        if (r10.isEmpty() == false) goto L_0x0701;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0701, code lost:
        r7 = new p000.C1225nr(r10.size());
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0712, code lost:
        if (r10.hasNext() != false) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0714, code lost:
        r6.edit().putStringSet("CheckinService_accountsReceivedByServer", r7).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        r7.add(m22344a((android.accounts.Account) r10.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        r6.edit().remove("CheckinService_accountsReceivedByServer").apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0744, code lost:
        if (r8 != 0) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0746, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0749, code lost:
        r4 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x074b, code lost:
        p000.qdg.m31917a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0760, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0762, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0767, code lost:
        r6 = p000.bmyx.m108640a(',').mo66925c((java.lang.CharSequence) p000.aymn.m84265a(getContentResolver(), "checkin_no_retry_http_codes", "400,401,403"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x077d, code lost:
        if (r6 == null) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0789, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x078b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0792, code lost:
        if ("RetryTaskTag".equals(r3) != false) goto L_0x0794;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0795, code lost:
        if (r6 != false) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0797, code lost:
        r3 = com.google.android.gms.checkin.CheckinChimeraService.f29939a;
        r6 = new java.lang.StringBuilder(49);
        r6.append("Checkin result code: ");
        r6.append(r5);
        r6.append(" will be retried.");
        r3.mo25414c(r6.toString(), new java.lang.Object[0]);
        m22352a(r2, r1, "com.google.android.gms.checkin.CheckinService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07bd, code lost:
        p000.aeat.m51532a(r28).mo33986a("RetryTaskTag", "com.google.android.gms.checkin.CheckinService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0809, code lost:
        p000.qgm.m32141a(r28).mo24044a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x082b, code lost:
        stopSelfResult(m22358c(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0834, code lost:
        r3 = r7.f40962e;
        r2 = m22358c(r2);
        r4 = new android.content.Intent().setClassName(r1, "com.google.android.gms.checkin.CheckinService").setAction("com.google.android.gms.checkin.SHOW_NOTIFICATION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x084b, code lost:
        if (r3 != 0) goto L_0x084d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x084e, code lost:
        if (r3 != 2) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0851, code lost:
        if (r3 != 3) goto L_0x0853;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0853, code lost:
        r3 = "checkin failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0856, code lost:
        r3 = "checkin rescheduled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0859, code lost:
        r3 = "checkin failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x085c, code lost:
        r3 = "checkin succeeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x085e, code lost:
        r3 = r4.putExtra("show_notification_message", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0865, code lost:
        if (r2 > 0) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0867, code lost:
        r3.putExtra("show_notification_start_id", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x086c, code lost:
        p000.asfd.m73947b(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0886, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0887, code lost:
        r18 = r4;
        r17 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a2 A[Catch:{ NoSuchMethodException -> 0x02a2, IllegalAccessException -> 0x0283, InvocationTargetException -> 0x026c, all -> 0x0318 }, ExcHandler: NoSuchMethodException (r0v10 'e' java.lang.NoSuchMethodException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:88:0x0202] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c5 A[Catch:{ NoSuchMethodException -> 0x02a2, IllegalAccessException -> 0x0283, InvocationTargetException -> 0x026c, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d4 A[Catch:{ NoSuchMethodException -> 0x02a2, IllegalAccessException -> 0x0283, InvocationTargetException -> 0x026c, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02eb A[Catch:{ NoSuchMethodException -> 0x02a2, IllegalAccessException -> 0x0283, InvocationTargetException -> 0x026c, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x032d A[SYNTHETIC, Splitter:B:136:0x032d] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03c4 A[Catch:{ all -> 0x0876 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03c5 A[Catch:{ all -> 0x0876 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03f0 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03fe A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0409 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x040e A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0421 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0469 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x046a A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x047c A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0484 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x049e A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x049f A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04bc A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04ee A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0512 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x053d A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x055e A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0568 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0577 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0651 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0652 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06c6 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x06cd A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06f4 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0743 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0744 A[Catch:{ all -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0760 A[Catch:{ all -> 0x0873 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0762 A[Catch:{ all -> 0x0873 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0767 A[Catch:{ all -> 0x0873 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07bd A[Catch:{ all -> 0x0873 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182 A[SYNTHETIC, Splitter:B:60:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019f A[SYNTHETIC, Splitter:B:73:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e0 A[Catch:{ NoSuchMethodException -> 0x02a2, IllegalAccessException -> 0x0283, InvocationTargetException -> 0x026c, all -> 0x0318 }] */
    /* renamed from: a */
    public final void mo17612a(Bundle bundle) {
        long j;
        qda qda;
        Throwable th;
        qda qda2;
        Throwable th2;
        boolean z;
        boolean z2;
        Context applicationContext;
        SharedPreferences l;
        String str;
        String str2;
        int i;
        String str3;
        boolean z3;
        String str4;
        String str5;
        boolean z4;
        boolean z5;
        ContentResolver contentResolver;
        boolean z6;
        qdu a;
        qdd qdd;
        qgv qgv;
        int i2;
        qgu qgu;
        String str6;
        int i3;
        TelephonyManager telephonyManager;
        String str7;
        String str8;
        String str9;
        String str10;
        Iterator<SubscriptionInfo> it;
        TelephonyManager telephonyManager2;
        Iterator<SubscriptionInfo> it2;
        qda qda3;
        Bundle bundle2 = bundle;
        String b = m22355b(bundle);
        svu a2 = svu.m36486a();
        sek sek = f29939a;
        int i4 = bundle2.getInt("CheckinService_onStart_checkinReason", -1);
        boolean d = m22363d(bundle);
        int c = a2.mo26189c();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 78);
        sb.append("Starting Checkin Task: ");
        sb.append(b);
        sb.append(" Reason : ");
        sb.append(i4);
        sb.append(" Force : ");
        sb.append(d);
        sb.append(" UserId: ");
        sb.append(c);
        sek.mo25414c(sb.toString(), new Object[0]);
        m22356b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        f29939a.mo25412b("CheckinTask started at: %d.", Long.valueOf(elapsedRealtime));
        qda qda4 = new qda();
        qgk qgk = new qgk(this, bmvy.f131119a);
        qgk.mo24032a(bundle2);
        qgk.mo24036b(2);
        f29943j.lock();
        qgk.mo24041g();
        synchronized (f29942i) {
            try {
                bmxv c2 = bmxv.m108567c(m22343a(bundle2, f29944k));
                if (c2.mo66813a()) {
                    try {
                        bundle2 = (Bundle) c2.mo66814b();
                    } catch (Throwable th3) {
                        th2 = th3;
                        j = elapsedRealtime;
                        qda2 = qda4;
                    }
                }
                f29944k = null;
                f29941h = false;
            } catch (Throwable th4) {
                th = th4;
                j = elapsedRealtime;
                qda2 = qda4;
                th2 = th;
                try {
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
                throw th2;
            }
        }
        while (it.hasNext()) {
            SubscriptionInfo next = it.next();
            if (next == null) {
                it2 = it;
                str3 = str;
                f29939a.mo25409a("Null subscription info.", new Object[0]);
                telephonyManager2 = telephonyManager;
            } else {
                it2 = it;
                str3 = str;
                int subscriptionId = next.getSubscriptionId();
                try {
                    int i5 = Build.VERSION.SDK_INT;
                    String simSerialNumber = telephonyManager.createForSubscriptionId(subscriptionId).getSimSerialNumber();
                    if (simSerialNumber == null) {
                        simSerialNumber = "no-sim";
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    String subscriberId = telephonyManager.createForSubscriptionId(subscriptionId).getSubscriberId();
                    if (subscriberId == null) {
                        subscriberId = "no-imsi";
                    }
                    String valueOf = String.valueOf(str7);
                    telephonyManager2 = telephonyManager;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 3 + simSerialNumber.length() + subscriberId.length());
                    sb2.append(valueOf);
                    sb2.append("[");
                    sb2.append(simSerialNumber);
                    sb2.append(":");
                    sb2.append(subscriberId);
                    sb2.append("]");
                    str7 = sb2.toString();
                    it = it2;
                    str = str3;
                    telephonyManager = telephonyManager2;
                } catch (NoSuchMethodException e) {
                } catch (IllegalAccessException e2) {
                    e = e2;
                    f29939a.mo25416d("CheckinChimeraService", "Illegal access exception from TelephonyManager methods for getting SIM IDs", e);
                    it = it2;
                    str = str3;
                    telephonyManager = telephonyManager2;
                } catch (InvocationTargetException e3) {
                    e = e3;
                    f29939a.mo25416d("CheckinChimeraService", "Invocation target exception from TelephonyManager methods for getting SIM IDs", e);
                    it = it2;
                    str = str3;
                    telephonyManager = telephonyManager2;
                }
            }
            it = it2;
            str = str3;
            telephonyManager = telephonyManager2;
        }
        str3 = str;
        str10 = str7;
        if (!str10.isEmpty()) {
            f29939a.mo25416d("SIM IDs not available by subscription", new Object[0]);
            str8 = m22366f();
        } else {
            str8 = str10;
        }
        if (!str8.equals(l.getString("CheckinService_lastSim", null))) {
        }
        int i7 = i3;
        if (bundle2 == null) {
        }
        contentResolver = getContentResolver();
        if (!aymn.m84269a(contentResolver, "Checkin_Init_Last_Sim_To_Null", false)) {
        }
        qds a3 = qdu.m31973a(applicationContext);
        j = elapsedRealtime;
        try {
            a3.mo23965a(Math.max(Build.TIME, 1587020400000L));
            a3.f41019m = EventLogChimeraService.m22379a(applicationContext);
            a3.f41027u = aymn.m84260a(contentResolver, "Checkin_includedFields", 16383);
            if (z4) {
            }
            z6 = false;
            if (z6) {
            }
            if (sre.m36080a(this)) {
            }
            if (aymn.m84269a(contentResolver, "checkin_enable_dnspatcher", false)) {
            }
            a3.f41009c = qdn.m31960l(applicationContext);
            int i8 = this.f29948g + 1;
            this.f29948g = i8;
            a3.mo23964a(i7, i8, str5, str4, z3);
            a3.mo23967a(str2);
            a3.f41012f = z5;
            a3.f41013g = !cdci.m132543i();
            a3.f41015i = m22355b(bundle2);
            if (!aymn.m84269a(applicationContext.getContentResolver(), "checkin_send_euicc_provisioned", false)) {
            }
            bmza a4 = bmza.m108657a(bmvy.f131119a);
            if (cdci.m132543i()) {
            }
            qgk.mo24029a();
            if (!z6) {
            }
            qgk.mo24035b();
            if (!m22362d()) {
            }
            a = a3.mo23963a();
            if (cdci.m132543i()) {
            }
            qgk.mo24038d();
            if (!cdcl.m132638b()) {
            }
            qda a5 = qdd.mo23927a(a);
            qgk.mo24039e();
            qgu qgu2 = a5.f40961d;
            qgv = a5.f40959b;
            i2 = a5.f40962e;
            List list = a5.f40960c;
            if (i2 == 0) {
            }
            Context applicationContext2 = getApplicationContext();
            qgu = a5.f40961d;
            if (qgu != null) {
            }
            m22347a(applicationContext2, str6);
            SharedPreferences l2 = qdn.m31960l(getApplicationContext());
            if (qgv != null) {
            }
            if (i2 != 0) {
            }
            SharedPreferences l3 = qdn.m31960l(this);
            Intent intent = new Intent("com.google.android.checkin.CHECKIN_COMPLETE");
            if (i2 != 0) {
            }
            sendBroadcast(intent);
            l3.edit().putLong("CheckinService_checkinCompleteBroadcastTime", System.currentTimeMillis()).apply();
            if (i2 == 0) {
            }
            if (a.f41034d) {
            }
            qgk.mo24040f();
            qgk.mo24033a(a5.f40964g);
            qgk.mo24034a(a5.f40965h);
            qda = a5;
            try {
                if (qda.f40962e != 0) {
                }
                int i9 = qda.f40963f;
                if (z) {
                }
                f29943j.unlock();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime2));
                qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime2 - j));
                qgk.mo24031a(0L);
                qgk.mo24030a(qda.f40962e);
                qgj h = qgk.mo24042h();
                if (cdcc.m132526b()) {
                }
                this.f29947e.mo24006a(z, bundle2.getLong("start_timestamp"));
                z2 = bundle2.getBoolean("CheckinService_onStart_showNotification", false);
                if (bundle2.containsKey("checkin_start_id")) {
                }
                if (z2) {
                }
                m22359c();
            } catch (Throwable th6) {
                th = th6;
                f29943j.unlock();
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime3));
                qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime3 - j));
                qgk.mo24031a(0L);
                qgk.mo24030a(qda.f40962e);
                qgj h2 = qgk.mo24042h();
                if (cdcc.m132526b()) {
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (aymn.m84269a(getContentResolver(), "checkin_network_available_test_enabled", false)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        sek sek2 = f29939a;
                        boolean isConnected = activeNetworkInfo.isConnected();
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("checked scheduled: connected/background: ");
                        sb3.append(isConnected);
                        sek2.mo25409a(sb3.toString(), new Object[0]);
                    } else {
                        f29939a.mo25409a("checkin scheduled: no active network", new Object[0]);
                    }
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    }
                }
                qda3 = new qda();
            } catch (Throwable th8) {
                th = th8;
                j = elapsedRealtime;
                qda2 = qda4;
                qda = qda2;
                f29943j.unlock();
                long elapsedRealtime32 = SystemClock.elapsedRealtime();
                f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime32));
                qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime32 - j));
                qgk.mo24031a(0L);
                qgk.mo24030a(qda.f40962e);
                qgj h22 = qgk.mo24042h();
                if (cdcc.m132526b()) {
                    qgm.m32141a(this).mo24044a(h22);
                }
                throw th;
            }
            try {
                f29939a.mo25416d("Checkin will retry later, network is not available", new Object[0]);
                j = elapsedRealtime;
                qda = qda3;
                if (qda.f40962e != 0) {
                }
                int i92 = qda.f40963f;
                if (z) {
                }
                f29943j.unlock();
                long elapsedRealtime22 = SystemClock.elapsedRealtime();
                f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime22));
                qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime22 - j));
                qgk.mo24031a(0L);
                qgk.mo24030a(qda.f40962e);
                qgj h3 = qgk.mo24042h();
                if (cdcc.m132526b()) {
                }
                this.f29947e.mo24006a(z, bundle2.getLong("start_timestamp"));
                z2 = bundle2.getBoolean("CheckinService_onStart_showNotification", false);
                if (bundle2.containsKey("checkin_start_id")) {
                }
                if (z2) {
                }
                m22359c();
            } catch (Throwable th9) {
                th = th9;
                j = elapsedRealtime;
                qda = qda3;
                f29943j.unlock();
                long elapsedRealtime322 = SystemClock.elapsedRealtime();
                f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime322));
                qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime322 - j));
                qgk.mo24031a(0L);
                qgk.mo24030a(qda.f40962e);
                qgj h222 = qgk.mo24042h();
                if (cdcc.m132526b()) {
                }
                throw th;
            }
        }
        qgk.mo24037c();
        applicationContext = getApplicationContext();
        l = qdn.m31960l(applicationContext);
        str = "unspecified";
        String str11 = "";
        str2 = "UPLOAD_ALL";
        if (bundle2 != null) {
            if (bundle2.containsKey("CheckinService_onStart_checkinReason")) {
                i = qhi.m32172a(bundle2.getInt("CheckinService_onStart_checkinReason", 0));
                if (!srd.m36077a(this)) {
                    try {
                        qda2 = qda4;
                        try {
                            f29939a.mo25409a("system was upgraded", new Object[0]);
                            i = 7;
                        } catch (NoSuchMethodException e4) {
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            telephonyManager2 = telephonyManager;
                            f29939a.mo25416d("CheckinChimeraService", "Illegal access exception from TelephonyManager methods for getting SIM IDs", e);
                            it = it2;
                            str = str3;
                            telephonyManager = telephonyManager2;
                        } catch (InvocationTargetException e6) {
                            e = e6;
                            telephonyManager2 = telephonyManager;
                            f29939a.mo25416d("CheckinChimeraService", "Invocation target exception from TelephonyManager methods for getting SIM IDs", e);
                            it = it2;
                            str = str3;
                            telephonyManager = telephonyManager2;
                        } catch (Throwable th10) {
                            th = th10;
                            th = th;
                            j = elapsedRealtime;
                            qda = qda2;
                            f29943j.unlock();
                            long elapsedRealtime3222 = SystemClock.elapsedRealtime();
                            f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime3222));
                            qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime3222 - j));
                            qgk.mo24031a(0L);
                            qgk.mo24030a(qda.f40962e);
                            qgj h2222 = qgk.mo24042h();
                            if (cdcc.m132526b()) {
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        qda2 = qda4;
                        th = th;
                        j = elapsedRealtime;
                        qda = qda2;
                        f29943j.unlock();
                        long elapsedRealtime32222 = SystemClock.elapsedRealtime();
                        f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime32222));
                        qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime32222 - j));
                        qgk.mo24031a(0L);
                        qgk.mo24030a(qda.f40962e);
                        qgj h22222 = qgk.mo24042h();
                        if (cdcc.m132526b()) {
                        }
                        throw th;
                    }
                } else {
                    qda2 = qda4;
                }
                if (!qdg.m31925f(this)) {
                    int i10 = Build.VERSION.SDK_INT;
                    telephonyManager = (TelephonyManager) getSystemService("phone");
                    SubscriptionManager subscriptionManager = (SubscriptionManager) getSystemService("telephony_subscription_service");
                    str7 = "";
                    if (subscriptionManager == null) {
                        i3 = i;
                        str9 = str;
                    } else if (telephonyManager != null) {
                        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                        if (activeSubscriptionInfoList == null) {
                            i3 = i;
                            f29939a.mo25409a("No Subscriptions found on the device", new Object[0]);
                            str10 = "no-sim";
                            str3 = str;
                        } else {
                            i3 = i;
                            it = activeSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                            }
                            str3 = str;
                            str10 = str7;
                        }
                        if (!str10.isEmpty()) {
                        }
                        if (!str8.equals(l.getString("CheckinService_lastSim", null))) {
                        }
                    } else {
                        i3 = i;
                        str9 = str;
                    }
                    str8 = m22366f();
                    if (!str8.equals(l.getString("CheckinService_lastSim", null))) {
                    }
                } else {
                    i3 = i;
                    str3 = str;
                    f29939a.mo25416d("Gms missing READ_PHONE_STATE permission, cannot read hw info.", new Object[0]);
                }
                int i72 = i3;
                if (bundle2 == null) {
                }
                contentResolver = getContentResolver();
                if (!aymn.m84269a(contentResolver, "Checkin_Init_Last_Sim_To_Null", false)) {
                }
                qds a32 = qdu.m31973a(applicationContext);
                j = elapsedRealtime;
                a32.mo23965a(Math.max(Build.TIME, 1587020400000L));
                a32.f41019m = EventLogChimeraService.m22379a(applicationContext);
                a32.f41027u = aymn.m84260a(contentResolver, "Checkin_includedFields", 16383);
                if (z4) {
                }
                z6 = false;
                if (z6) {
                }
                if (sre.m36080a(this)) {
                }
                if (aymn.m84269a(contentResolver, "checkin_enable_dnspatcher", false)) {
                }
                a32.f41009c = qdn.m31960l(applicationContext);
                int i82 = this.f29948g + 1;
                this.f29948g = i82;
                a32.mo23964a(i72, i82, str5, str4, z3);
                a32.mo23967a(str2);
                a32.f41012f = z5;
                a32.f41013g = !cdci.m132543i();
                a32.f41015i = m22355b(bundle2);
                if (!aymn.m84269a(applicationContext.getContentResolver(), "checkin_send_euicc_provisioned", false)) {
                }
                bmza a42 = bmza.m108657a(bmvy.f131119a);
                if (cdci.m132543i()) {
                }
                qgk.mo24029a();
                if (!z6) {
                }
                qgk.mo24035b();
                if (!m22362d()) {
                }
                a = a32.mo23963a();
                if (cdci.m132543i()) {
                }
                qgk.mo24038d();
                if (!cdcl.m132638b()) {
                }
                qda a52 = qdd.mo23927a(a);
                qgk.mo24039e();
                qgu qgu22 = a52.f40961d;
                qgv = a52.f40959b;
                i2 = a52.f40962e;
                List list2 = a52.f40960c;
                if (i2 == 0) {
                }
                Context applicationContext22 = getApplicationContext();
                qgu = a52.f40961d;
                if (qgu != null) {
                }
                m22347a(applicationContext22, str6);
                SharedPreferences l22 = qdn.m31960l(getApplicationContext());
                if (qgv != null) {
                }
                if (i2 != 0) {
                }
                SharedPreferences l32 = qdn.m31960l(this);
                Intent intent2 = new Intent("com.google.android.checkin.CHECKIN_COMPLETE");
                if (i2 != 0) {
                }
                sendBroadcast(intent2);
                l32.edit().putLong("CheckinService_checkinCompleteBroadcastTime", System.currentTimeMillis()).apply();
                if (i2 == 0) {
                }
                if (a.f41034d) {
                }
                qgk.mo24040f();
                qgk.mo24033a(a52.f40964g);
                qgk.mo24034a(a52.f40965h);
                qda = a52;
                if (qda.f40962e != 0) {
                }
                int i922 = qda.f40963f;
                if (z) {
                }
                f29943j.unlock();
                long elapsedRealtime222 = SystemClock.elapsedRealtime();
                f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime222));
                qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime222 - j));
                qgk.mo24031a(0L);
                qgk.mo24030a(qda.f40962e);
                qgj h32 = qgk.mo24042h();
                if (cdcc.m132526b()) {
                }
                this.f29947e.mo24006a(z, bundle2.getLong("start_timestamp"));
                z2 = bundle2.getBoolean("CheckinService_onStart_showNotification", false);
                if (bundle2.containsKey("checkin_start_id")) {
                }
                if (z2) {
                }
                m22359c();
            }
        }
        i = 1;
        if (!srd.m36077a(this)) {
        }
        try {
            if (!qdg.m31925f(this)) {
            }
            int i722 = i3;
            if (bundle2 == null) {
            }
            contentResolver = getContentResolver();
            if (!aymn.m84269a(contentResolver, "Checkin_Init_Last_Sim_To_Null", false)) {
            }
            qds a322 = qdu.m31973a(applicationContext);
            j = elapsedRealtime;
            a322.mo23965a(Math.max(Build.TIME, 1587020400000L));
            a322.f41019m = EventLogChimeraService.m22379a(applicationContext);
            a322.f41027u = aymn.m84260a(contentResolver, "Checkin_includedFields", 16383);
            if (z4) {
            }
            z6 = false;
            if (z6) {
            }
            if (sre.m36080a(this)) {
            }
            if (aymn.m84269a(contentResolver, "checkin_enable_dnspatcher", false)) {
            }
            a322.f41009c = qdn.m31960l(applicationContext);
            int i822 = this.f29948g + 1;
            this.f29948g = i822;
            a322.mo23964a(i722, i822, str5, str4, z3);
            a322.mo23967a(str2);
            a322.f41012f = z5;
            a322.f41013g = !cdci.m132543i();
            a322.f41015i = m22355b(bundle2);
            if (!aymn.m84269a(applicationContext.getContentResolver(), "checkin_send_euicc_provisioned", false)) {
            }
            bmza a422 = bmza.m108657a(bmvy.f131119a);
            if (cdci.m132543i()) {
            }
            qgk.mo24029a();
            if (!z6) {
            }
            qgk.mo24035b();
            if (!m22362d()) {
            }
            a = a322.mo23963a();
            if (cdci.m132543i()) {
            }
            qgk.mo24038d();
            if (!cdcl.m132638b()) {
            }
            qda a522 = qdd.mo23927a(a);
            qgk.mo24039e();
            qgu qgu222 = a522.f40961d;
            qgv = a522.f40959b;
            i2 = a522.f40962e;
            List list22 = a522.f40960c;
            if (i2 == 0) {
            }
            Context applicationContext222 = getApplicationContext();
            qgu = a522.f40961d;
            if (qgu != null) {
            }
            m22347a(applicationContext222, str6);
            SharedPreferences l222 = qdn.m31960l(getApplicationContext());
            if (qgv != null) {
            }
            if (i2 != 0) {
            }
            SharedPreferences l322 = qdn.m31960l(this);
            Intent intent22 = new Intent("com.google.android.checkin.CHECKIN_COMPLETE");
            if (i2 != 0) {
            }
            sendBroadcast(intent22);
            l322.edit().putLong("CheckinService_checkinCompleteBroadcastTime", System.currentTimeMillis()).apply();
            if (i2 == 0) {
            }
            if (a.f41034d) {
            }
            qgk.mo24040f();
            qgk.mo24033a(a522.f40964g);
            qgk.mo24034a(a522.f40965h);
            qda = a522;
            if (qda.f40962e != 0) {
            }
            int i9222 = qda.f40963f;
            if (z) {
            }
            f29943j.unlock();
            long elapsedRealtime2222 = SystemClock.elapsedRealtime();
            f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime2222));
            qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime2222 - j));
            qgk.mo24031a(0L);
            qgk.mo24030a(qda.f40962e);
            qgj h322 = qgk.mo24042h();
            if (cdcc.m132526b()) {
            }
            this.f29947e.mo24006a(z, bundle2.getLong("start_timestamp"));
            z2 = bundle2.getBoolean("CheckinService_onStart_showNotification", false);
            if (bundle2.containsKey("checkin_start_id")) {
            }
            if (z2) {
            }
            m22359c();
        } catch (Throwable th12) {
            th = th12;
            j = elapsedRealtime;
            th = th;
            qda = qda2;
            f29943j.unlock();
            long elapsedRealtime322222 = SystemClock.elapsedRealtime();
            f29939a.mo25412b("CheckinTask finished at: %d.", Long.valueOf(elapsedRealtime322222));
            qdg.m31918a("CheckinTask:duration", Long.valueOf(elapsedRealtime322222 - j));
            qgk.mo24031a(0L);
            qgk.mo24030a(qda.f40962e);
            qgj h222222 = qgk.mo24042h();
            if (cdcc.m132526b()) {
            }
            throw th;
        }
    }
}
