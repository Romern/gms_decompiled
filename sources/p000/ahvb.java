package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallChimeraActivity;
import com.google.android.gms.nearby.discovery.fastpair.FastPairNotificationManager$1;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.concurrent.TimeUnit;

/* renamed from: ahvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvb {

    /* renamed from: b */
    static final int f68136b = (-1698320164 - 1);

    /* renamed from: c */
    public static final int f68137c = (-1698320164 - 2);

    /* renamed from: d */
    static final int f68138d = (-1698320164 - 3);

    /* renamed from: g */
    private static int f68139g = 0;

    /* renamed from: h */
    private static int f68140h = ((int) SystemClock.elapsedRealtime());

    /* renamed from: i */
    private static final int f68141i = -1698320164;

    /* renamed from: a */
    public final int f68142a;

    /* renamed from: e */
    public final Context f68143e;

    /* renamed from: f */
    public final ahsu f68144f;

    /* renamed from: j */
    private final int f68145j;

    /* renamed from: k */
    private final boolean f68146k;

    /* renamed from: l */
    private final snf f68147l = snp.m35703a(1, 10);

    /* renamed from: m */
    private final ahsi f68148m;

    public ahvb(Context context, ahsu ahsu, boolean z) {
        int i;
        this.f68143e = context;
        this.f68144f = ahsu;
        this.f68146k = z;
        this.f68142a = f68141i + f68139g;
        if (cfoj.m141534O()) {
            i = f68136b;
        } else {
            i = this.f68142a;
        }
        this.f68145j = i;
        this.f68148m = (ahsi) ahgz.m55754a(context, ahsi.class);
        f68139g++;
    }

    /* renamed from: a */
    private final PendingIntent m56686a(boolean z, Intent intent, bvin bvin, String str) {
        Intent putExtra = m56688a("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED").putExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", z).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", this.f68142a);
        if (intent != null) {
            putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_PENDING_INTENT", mo37197b(intent));
            putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_URL", intent.toUri(1));
            putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", aidc.m57025a("DEVICES_WITHIN_REACH_REBRANDED"));
        }
        putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", bvin.f156289bv).putExtra("com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID", this.f68144f.mo37060G()).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", (String) bmxv.m108567c(str).mo66812a(""));
        return mo37187a(putExtra);
    }

    /* renamed from: b */
    private final boolean m56690b(String str) {
        return m56687a(this.f68143e, str, null) != null;
    }

    /* renamed from: c */
    public final String mo37198c() {
        return this.f68144f.mo37086k();
    }

    /* renamed from: b */
    public final aicx mo37196b() {
        aicx ahvk = this.f68146k ? new ahvk(this.f68143e, this.f68144f.mo37092q()) : new aicx(this.f68143e);
        ahvk.mo37420a("DEVICES_WITHIN_REACH_REBRANDED");
        ahvk.mo37422d(true);
        ahvk.mo13630b(aict.m56987a(this.f68143e));
        ahvk.mo13621a(bush.m120378a(this.f68143e, this.f68144f.mo37054A()));
        ahvk.mo13633b(false);
        ahvk.mo13638d();
        ahvk.mo13627a(true);
        ahvk.f22271w = C1133kh.m17843b(this.f68143e, C0126R.color.discovery_activity_accent);
        return ahvk;
    }

    public ahvb(Context context, ahsu ahsu, boolean z, int i) {
        this.f68143e = context;
        this.f68144f = ahsu;
        this.f68146k = z;
        this.f68142a = i;
        this.f68145j = cfoj.m141534O() ? f68136b : i;
        this.f68148m = (ahsi) ahgz.m55754a(context, ahsi.class);
    }

    /* renamed from: b */
    public final PendingIntent mo37197b(Intent intent) {
        Context context = this.f68143e;
        int i = f68140h;
        f68140h = i + 1;
        return PendingIntent.getActivity(context, i, intent, JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* renamed from: a */
    public static Intent m56687a(Context context, String str, String str2) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (cfoj.m141555e() && str2 != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!(launchIntentForPackage == null || defaultAdapter == null)) {
                launchIntentForPackage.putExtra("android.bluetooth.device.extra.DEVICE", defaultAdapter.getRemoteDevice(str2));
            }
        }
        return launchIntentForPackage;
    }

    /* renamed from: a */
    private final Intent m56688a(String str) {
        return DiscoveryChimeraService.m67336a(this.f68143e).setAction(str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", this.f68144f.mo37084i());
    }

    /* renamed from: a */
    public static void m56689a(Context context, String str, String str2, ahyw ahyw, String str3) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        FastPairNotificationManager$1 fastPairNotificationManager$1 = new FastPairNotificationManager$1("trackCompanionAppInstall", str, str2, ahyw, str3);
        context.registerReceiver(fastPairNotificationManager$1, intentFilter);
        ((buqh) ahgz.m55754a(context, buqh.class)).mo72983a(new ahva("unregisterCompanionAppRunnable", context, fastPairNotificationManager$1), TimeUnit.MINUTES.toMillis(cfog.f184854a.mo6606a().mo82020bb()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, android.content.Intent):android.app.PendingIntent
     arg types: [int, android.content.Intent]
     candidates:
      ahvb.a(java.lang.String, java.lang.String):android.content.Intent
      ahvb.a(android.app.Notification, int):void
      ahvb.a(java.lang.String, android.content.Intent):void
      ahvb.a(boolean, android.content.Intent):android.app.PendingIntent */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, android.content.Intent):android.app.PendingIntent
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ahvb.a(java.lang.String, java.lang.String):android.content.Intent
      ahvb.a(android.app.Notification, int):void
      ahvb.a(java.lang.String, android.content.Intent):void
      ahvb.a(boolean, android.content.Intent):android.app.PendingIntent */
    /* renamed from: a */
    public final Notification mo37186a(byte[] bArr) {
        int i;
        String str;
        int i2;
        Context context = this.f68143e;
        if (!this.f68146k) {
            i = C0126R.string.fast_pair_could_not_pair;
        } else {
            i = C0126R.string.fast_pair_unable_to_connect;
        }
        String string = context.getString(i);
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        if (bArr == null) {
            Context context2 = this.f68143e;
            if (!this.f68146k) {
                i2 = C0126R.string.fast_pair_tap_to_open_bluetooth_settings;
            } else {
                i2 = C0126R.string.fast_pair_unable_to_connect_description;
            }
            str = context2.getString(i2);
        } else {
            str = this.f68143e.getString(C0126R.string.fast_pair_turn_on_bt_device_pairing_mode);
        }
        aicx b = mo37196b();
        b.mo37421b(string);
        b.f22269u = "err";
        b.mo13640e(string);
        b.mo13632b((CharSequence) str);
        b.mo13620a(mo37188a(false, intent));
        b.mo13631b(mo37188a(false, (Intent) null));
        return b.mo13629b();
    }

    /* renamed from: a */
    public final PendingIntent mo37187a(Intent intent) {
        Context context = this.f68143e;
        int i = f68140h;
        f68140h = i + 1;
        return PendingIntent.getService(context, i, intent, JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* renamed from: a */
    public final PendingIntent mo37188a(boolean z, Intent intent) {
        return m56686a(z, intent, bvin.UNKNOWN_DISCOVERY_EVENT, "");
    }

    /* renamed from: a */
    public final Intent mo37189a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m56690b(str)) {
            return m56687a(this.f68143e, str, str2);
        }
        if (cfoj.m141556f()) {
            m56689a(this.f68143e, str, str2, null, this.f68144f.mo37060G());
        }
        return CompanionAppInstallChimeraActivity.m67323a(this.f68143e, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37190a() {
        mo37191a(this.f68145j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, android.content.Intent):android.app.PendingIntent
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ahvb.a(java.lang.String, java.lang.String):android.content.Intent
      ahvb.a(android.app.Notification, int):void
      ahvb.a(java.lang.String, android.content.Intent):void
      ahvb.a(boolean, android.content.Intent):android.app.PendingIntent */
    /* renamed from: a */
    public final void mo37191a(int i) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("FastPair: Canceling notification %s", i);
        ((ahgp) ahgz.m55754a(this.f68143e, ahgp.class)).mo36449a(i);
        try {
            mo37188a(true, (Intent) null).send();
        } catch (PendingIntent.CanceledException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: Finished PendingIntent unexpectedly canceled.");
        }
    }

    /* renamed from: a */
    public final void mo37192a(Notification notification, int i) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("FastPair: Showing notification %s", i);
        int i2 = Build.VERSION.SDK_INT;
        ((ahgp) ahgz.m55754a(this.f68143e, ahgp.class)).mo36450a(i, notification);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
     arg types: [int, android.content.Intent, bvin, java.lang.String]
     candidates:
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
     arg types: [int, ?[OBJECT, ARRAY], bvin, java.lang.String]
     candidates:
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent */
    /* renamed from: a */
    public final void mo37193a(String str, int i, String str2, String str3) {
        String str4;
        String str5;
        ((aidb) ahgz.m55754a(this.f68143e, aidb.class)).mo37429a();
        ((bnsl) ahsd.f67925a.mo68390d()).mo68422a("FastPair: Showing pairing succeeded notification, companion app: %s, battery: %s", (Object) str, i);
        ((ahgp) ahgz.m55754a(this.f68143e, ahgp.class)).mo36449a(this.f68142a);
        bvin bvin = bvin.UNKNOWN_DISCOVERY_EVENT;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo37198c());
            if (i >= 0 && i <= 100) {
                sb.append("\n");
                sb.append(this.f68143e.getString(C0126R.string.common_battery_level, Integer.valueOf(i)));
            }
            str4 = sb.toString();
        } else if (m56690b(str)) {
            str4 = this.f68143e.getString(C0126R.string.fast_pair_open_companion_app);
            bvin = bvin.FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP;
        } else if (!cfoj.f184966a.mo6606a().mo82096aT() || m56690b(str) || !ahvd.m56713a(str, this.f68143e)) {
            str4 = this.f68143e.getString(C0126R.string.fast_pair_download_app_description);
            bvin = bvin.FAST_PAIR_POST_ACTION_INSTALL_COMPANION_APP;
        } else {
            str4 = this.f68143e.getString(C0126R.string.fast_pair_update_companion_app);
        }
        Intent a = mo37189a(str, str3);
        if (str2 == null) {
            str5 = this.f68143e.getString(C0126R.string.fast_pair_device_ready);
        } else {
            str5 = this.f68143e.getString(C0126R.string.fast_pair_device_ready_with_device_name, str2);
        }
        aicx b = mo37196b();
        b.mo37421b(str5);
        b.f22269u = "status";
        b.mo13640e(str5);
        b.mo13632b((CharSequence) str4);
        b.mo13620a(m56686a(true, a, bvin, str));
        b.mo13631b(m56686a(true, (Intent) null, bvin.FAST_PAIR_POST_ACTION_DISMISS_COMPANION_APP, str));
        mo37192a(b.mo13629b(), this.f68145j);
        this.f68148m.mo37018a(bvin.FAST_PAIR_POST_ACTION_NOTIFICATION_SHOWN, this.f68144f.mo37060G(), (String) bmxv.m108567c(str).mo66812a(""));
        if (TextUtils.isEmpty(str)) {
            this.f68147l.mo25814a(new ahuz(this), cfog.f184854a.mo6606a().mo82022bd(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37194a(String str, Intent intent) {
        ahsc ahsc = (ahsc) ahgz.m55754a(this.f68143e, ahsc.class);
        String a = ahsc.mo37009a("fast_pair_retroactive_save_device_description", str);
        aicx b = mo37196b();
        b.mo37421b(a);
        b.f22269u = "recommendation";
        b.mo13640e(ahsc.mo37009a("fast_pair_retroactive_save_device_title", this.f68144f.mo37086k()));
        b.mo13632b((CharSequence) a);
        b.mo13620a(mo37187a(intent));
        mo37192a(b.mo13629b(), this.f68142a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37195a(boolean z, boolean z2, String str, String str2) {
        if (cfoj.m141541V() || z2) {
            try {
                Intent putExtra = m56688a("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE").putExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", z).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", this.f68142a);
                if (str2 != null) {
                    putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_PUBLIC_ADDRESS", str2);
                }
                this.f68143e.startService(putExtra);
                srn srn = ahsd.f67925a;
            } catch (IllegalStateException | SecurityException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPair: failed to send ACTION_FAST_PAIR_PAIRING_PROCESS_DONE.");
            }
        }
    }
}
