package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.location.reporting.service.UlrController$6;

/* renamed from: bgxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxx implements bgtz {

    /* renamed from: a */
    static final Uri f117950a = Uri.parse("content://com.google.settings/partner");

    /* renamed from: w */
    public static final /* synthetic */ int f117951w = 0;

    /* renamed from: b */
    public final Context f117952b;

    /* renamed from: c */
    public final bgye f117953c;

    /* renamed from: d */
    public final bgyg f117954d;

    /* renamed from: e */
    public final bgyf f117955e;

    /* renamed from: f */
    public final aesh f117956f;

    /* renamed from: g */
    public final sqv f117957g;

    /* renamed from: h */
    public final bgwp f117958h;

    /* renamed from: i */
    public final bgxg f117959i;

    /* renamed from: j */
    public final bgxu f117960j;

    /* renamed from: k */
    public final bgxt f117961k;

    /* renamed from: l */
    public bgxw f117962l;

    /* renamed from: m */
    public final bguc f117963m;

    /* renamed from: n */
    public final bgue f117964n;

    /* renamed from: o */
    public final bgug f117965o;

    /* renamed from: p */
    public final bguh f117966p;

    /* renamed from: q */
    public BroadcastReceiver f117967q = null;

    /* renamed from: r */
    public ContentObserver f117968r = null;

    /* renamed from: s */
    public ContentObserver f117969s = null;

    /* renamed from: t */
    public ContentObserver f117970t = null;

    /* renamed from: u */
    public ContentObserver f117971u = null;

    /* renamed from: v */
    public final rjx f117972v;

    /* renamed from: x */
    private final bgtv f117973x;

    /* renamed from: y */
    private ContentObserver f117974y = null;

    private bgxx(Context context, bguc bguc, bgue bgue, bgug bgug, bguh bguh, bgxu bgxu) {
        Context context2 = context;
        this.f117952b = context2;
        this.f117963m = bguc;
        this.f117964n = bgue;
        this.f117965o = bgug;
        this.f117966p = bguh;
        this.f117960j = bgxu;
        this.f117953c = bgye.m100307a(context);
        this.f117954d = bgyg.m100351a(context);
        this.f117955e = new bgyf();
        this.f117957g = srb.f45012a;
        if (chcy.f188471a.mo6606a().mo85131e()) {
            this.f117972v = aeie.m51878c(context);
            this.f117956f = null;
        } else {
            aesh aesh = new aesh(context2);
            this.f117956f = aesh;
            aesh.mo34501a();
            this.f117972v = null;
        }
        this.f117973x = new bgtv(context2);
        bgua bgua = new bgua(context2, this.f117957g);
        this.f117958h = new bgwp(context, this.f117955e, this.f117954d, bguh, this.f117953c);
        this.f117959i = new bgxg(context, this.f117957g, bguc, bguh, this.f117954d, this.f117953c, this.f117955e, this.f117956f, this.f117972v, this.f117973x, this.f117958h, new bgyc(context2), bgyv.m100430a(context), new bgto(context2, this.f117955e, new bgtn(context2), new bgvf(context2)), bgua, new rjx(context2, (short[]) null), this);
        this.f117961k = new bgxt(this, this.f117955e, this.f117953c, this.f117954d, this.f117959i, bguh);
        ContentResolver contentResolver = this.f117952b.getContentResolver();
        if (srs.m36149a(this.f117952b)) {
            m100280d();
        } else {
            bgxr bgxr = new bgxr(this, "location", "UlrControllerSettingsObserver", this.f117961k, new Intent("com.google.android.location.reporting.CHANGE_ON_LOCATION_DISABLE_FOR_GOOGLE_APP"));
            this.f117974y = bgxr;
            contentResolver.registerContentObserver(f117950a, true, bgxr);
        }
        PackageManager packageManager = this.f117952b.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (!(packageManager == null || !packageManager.hasSystemFeature("android.hardware.wifi") || contentResolver == null)) {
            this.f117968r = new bgxn(this, "location", "UlrControllerWifiObserver", this.f117961k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.f117968r);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(packageManager == null || !packageManager.hasSystemFeature("android.hardware.bluetooth_le") || contentResolver == null)) {
            this.f117969s = new bgxo(this, "location", "UlrControllerBleObserver", this.f117961k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("ble_scan_always_enabled"), false, this.f117969s);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (contentResolver != null) {
            this.f117970t = new bgxp(this, "location", "UlrControllerBatterySavingModeChangeObserver", this.f117961k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("low_power"), true, this.f117970t);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (contentResolver != null) {
            this.f117971u = new bgxq(this, "location", "UlrConrollerBatterySavingThresholdChangeObserver", this.f117961k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("low_power_trigger_level"), true, this.f117971u);
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.wifi")) {
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        }
        int i5 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.location.MODE_CHANGED");
        int i6 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        UlrController$6 ulrController$6 = new UlrController$6(this, "location");
        this.f117967q = ulrController$6;
        this.f117952b.registerReceiver(ulrController$6, intentFilter);
    }

    /* renamed from: a */
    public static ComponentName m100270a(Context context) {
        return new ComponentName(context, "com.google.android.location.reporting.service.DispatchingService");
    }

    /* renamed from: b */
    public static void m100277b(Context context) {
        bgzo.m100465a(context, m100271a(context, "com.google.android.location.reporting.UPLOAD"));
    }

    /* renamed from: c */
    public static void m100279c(Context context) {
        bgzo.m100465a(context, m100271a(context, "com.google.android.location.reporting.WIFI_TRIGGERED_UPLOAD"));
    }

    /* renamed from: d */
    public static void m100280d() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: e */
    private final synchronized bgxw m100281e() {
        if (this.f117962l == null) {
            this.f117962l = new bgxw(this);
        }
        return this.f117962l;
    }

    @Deprecated
    /* renamed from: a */
    public static Intent m100271a(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(m100270a(context));
        intent.setAction(str);
        return intent;
    }

    /* renamed from: b */
    public static void m100278b(Context context, String str) {
        bgzo.m100465a(context, m100272a(context, "com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE", str));
    }

    /* renamed from: c */
    public final void mo63336c() {
        bgzo.m100471b(this.f117952b, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS").cancel();
        Context context = this.f117952b;
        bgxg.m100217a(context, m100272a(context, "com.google.android.location.reporting.ACTION_ACTIVITY", "Cancel")).cancel();
        Context context2 = this.f117952b;
        PendingIntent.getService(context2, 0, m100271a(context2, "com.google.android.location.reporting.ACTION_LOCATION"), 134217728).cancel();
        Context context3 = this.f117952b;
        PendingIntent.getService(context3, 0, m100271a(context3, "com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION"), 134217728).cancel();
    }

    /* renamed from: a */
    public static Intent m100272a(Context context, String str, String str2) {
        Intent a = m100271a(context, str);
        a.putExtra("source", str2);
        return a;
    }

    /* renamed from: b */
    public final void mo63335b() {
        ContentResolver contentResolver = this.f117952b.getContentResolver();
        ContentObserver contentObserver = this.f117974y;
        if (contentObserver != null) {
            contentResolver.unregisterContentObserver(contentObserver);
            this.f117974y = null;
        }
    }

    /* renamed from: a */
    public static bgxx m100273a(Context context, bgxu bgxu) {
        bgue bgue;
        Context context2 = context;
        int i = 3;
        try {
            String[] strArr = {"gcore_ulr_ActivityDetection.db", "gcore_ulr_ApiMetadata.db", "gcore_ulr_UlrLocation.db"};
            int i2 = 0;
            while (i2 < i) {
                String str = strArr[i2];
                if (context2.deleteDatabase(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
                    sb.append("Deleted database '");
                    sb.append(str);
                    sb.append("'");
                    bgur.m100011a("GCoreUlr", sb.toString());
                }
                i2++;
                i = 3;
            }
            bgui bgui = new bgui(bgyg.m100351a(context).mo63402b());
            LevelDb a = bgug.m99966a("ulr_db", context2);
            if (a.toString().equals("LevelDB[]")) {
                bgur.m100025c("GCoreUlr", "Created NoOpLevelDb");
            }
            bgug bgug = new bgug(a, bgui, context2);
            if (chcp.m148195d()) {
                try {
                    String[] strArr2 = new String[i];
                    strArr2[0] = "gcore_ulr_ActivityDetection.db";
                    strArr2[1] = "gcore_ulr_ApiMetadata.db";
                    strArr2[2] = "gcore_ulr_UlrLocation.db";
                    for (int i3 = 0; i3 < i; i3++) {
                        String str2 = strArr2[i3];
                        if (context2.deleteDatabase(str2)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 19);
                            sb2.append("Deleted database '");
                            sb2.append(str2);
                            sb2.append("'");
                            bgur.m100011a("GCoreUlr", sb2.toString());
                        }
                    }
                    bgui bgui2 = new bgui(bgyg.m100351a(context).mo63402b());
                    LevelDb a2 = bgue.m99950a("ulr_db_grpc", context2);
                    if (a2.toString().equals("LevelDB[]")) {
                        bgur.m100025c("GCoreUlr", "Created NoOpLevelDb");
                    }
                    bgue = new bgue(a2, bgui2, context2);
                } catch (LevelDbCorruptionException e) {
                    bgur.m100018b("GCoreUlr", 5, "datastore corrupted");
                    throw e;
                } catch (LevelDbException e2) {
                    bgur.m100021b("GCoreUlr", "Error opening datastoreGrpc", e2);
                    return null;
                }
            } else {
                bgue = null;
            }
            return new bgxx(context, new bguc(bgue, bgug), bgue, bgug, new bguh(bgue, bgug), bgxu);
        } catch (LevelDbCorruptionException e3) {
            bgur.m100018b("GCoreUlr", 5, "datastore corrupted");
            throw e3;
        } catch (LevelDbException e4) {
            bgur.m100021b("GCoreUlr", "Error opening datastoreJson", e4);
            return null;
        }
    }

    /* renamed from: a */
    public static String m100274a(Intent intent) {
        try {
            if (intent.hasExtra("source")) {
                return intent.getStringExtra("source");
            }
            return null;
        } catch (RuntimeException e) {
            return null;
        }
    }

    /* renamed from: a */
    static String m100275a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("DispatchingService.updateActiveState+") : "DispatchingService.updateActiveState+".concat(valueOf);
    }

    /* renamed from: a */
    public static sns m100276a() {
        return new sns(10);
    }

    /* renamed from: a */
    public final void mo63334a(Intent intent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String action = intent.getAction();
        Handler e = ("com.google.android.location.reporting.UPLOAD".equals(action) || "com.google.android.location.reporting.ACTION_INSISTENT_SYNC".equals(action)) ? m100281e() : this.f117961k;
        Message obtainMessage = e.obtainMessage(1, intent);
        obtainMessage.arg1 = i;
        e.sendMessage(obtainMessage);
    }
}
