package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiRate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: bgyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyb {

    /* renamed from: a */
    private final Context f117981a;

    /* renamed from: b */
    private final bgyf f117982b;

    /* renamed from: c */
    private final bgye f117983c;

    /* renamed from: d */
    private final bgyg f117984d;

    /* renamed from: e */
    private final bgxg f117985e;

    /* renamed from: f */
    private final bguh f117986f;

    /* renamed from: g */
    private final bguc f117987g;

    /* renamed from: h */
    private final WifiManager f117988h;

    /* renamed from: i */
    private final ContentResolver f117989i = this.f117981a.getContentResolver();

    /* renamed from: j */
    private final PowerManager f117990j = ((PowerManager) this.f117981a.getSystemService("power"));

    /* renamed from: k */
    private final bgxk f117991k = bgxk.m100235a(this.f117981a, this.f117983c);

    public bgyb(Context context, bgyf bgyf, bgye bgye, bgyg bgyg, bgxg bgxg, bguc bguc, bguh bguh) {
        bgzo.m100459a(context);
        this.f117981a = context;
        this.f117982b = bgyf;
        this.f117983c = bgye;
        this.f117984d = bgyg;
        this.f117985e = bgxg;
        this.f117987g = bguc;
        this.f117986f = bguh;
        this.f117988h = (WifiManager) context.getSystemService("wifi");
    }

    /* renamed from: a */
    public static Intent m100291a(Context context) {
        return bgxx.m100271a(context, "com.google.android.location.reporting.ACTION_UPDATE_WORLD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo63346b(List list) {
        if (this.f117983c.f118000b.mo63410a(srs.m36149a(this.f117981a) ? 1 : 0, "location_enabled_for_google_app_key")) {
            boolean a = srs.m36149a(this.f117981a);
            StringBuilder sb = new StringBuilder(53);
            sb.append("Location disabled for Google apps is changed to ");
            sb.append(a);
            sb.toString();
            bgxk bgxk = this.f117991k;
            for (Account account : bfkd.m97106a(bgxk.f117918a).f114281b) {
                bgxk.mo63325e(account);
            }
            Boolean valueOf = Boolean.valueOf(a);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 57);
            sb2.append("UlrClearcutEvents.logLocationEnabledForGoogleAppsChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                boolean booleanValue = valueOf.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157383a |= 2;
                bvql.f157385c = booleanValue;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), valueOf.booleanValue() ? bvzk.LOCATION_ENABLED_FOR_GOOGLE_APPS : bvzk.LOCATION_DISABLED_FOR_GOOGLE_APPS, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo63347c(List list) {
        int i = Build.VERSION.SDK_INT;
        boolean b = sse.m36207b(this.f117981a);
        if (this.f117983c.f118000b.mo63410a(b ? 1 : 0, "Location_wifi_scan_enabled_key")) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Location Wifi always scan mode enabled is changed to ");
            sb.append(b);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(b);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
            sb2.append("UlrClearcutEvents.logWifiAlwaysScanModeEnabledChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                boolean booleanValue = valueOf.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157383a |= 4;
                bvql.f157386d = booleanValue;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), valueOf.booleanValue() ? bvzk.WIFI_ALWAYS_SCAN_MODE_ENABLED : bvzk.WIFI_ALWAYS_SCAN_MODE_DISABLED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo63348d(List list) {
        int i = Build.VERSION.SDK_INT;
        boolean b = sse.m36206b();
        if (this.f117983c.f118000b.mo63410a(b ? 1 : 0, "Location_Ble_scan_enabled_key")) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Location BLE always scan mode enabled is changed to ");
            sb.append(b);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(b);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
            sb2.append("UlrClearcutEvents.logBleAlwaysScanModeEnabledChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                boolean booleanValue = valueOf.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157383a |= 8;
                bvql.f157387e = booleanValue;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), valueOf.booleanValue() ? bvzk.BLE_ALWAYS_SCAN_MODE_ENABLED : bvzk.BLE_ALWAYS_SCAN_MODE_DISABLED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo63349e(List list) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (Settings.Global.getInt(this.f117989i, "low_power", 0) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f117983c.f118000b.mo63410a(z ? 1 : 0, "Location_battery_saver_enabled_key")) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Battery saver mode enabled is changed to ");
            sb.append(z);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(z);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52);
            sb2.append("UlrClearcutEvents.logBatterySaverModeEnabledChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                boolean booleanValue = valueOf.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157383a |= 16;
                bvql.f157388f = booleanValue;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), valueOf.booleanValue() ? bvzk.BATTERY_SAVER_MODE_ENABLED : bvzk.BATTERY_SAVER_MODE_DISABLED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo63350f(List list) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Settings.Global.getInt(this.f117989i, "low_power_trigger_level", 0);
        if (this.f117983c.f118000b.mo63410a(i2, "Location_battery_saver_mode_threshold_key")) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Battery saver mode threshold is changed to ");
            sb.append(i2);
            sb.toString();
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("UlrClearcutEvents.logBatterySaverModeThresholdChange(");
            sb2.append(i2);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157383a |= 32;
                bvql.f157389g = i2;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), bvzk.BATTERY_SAVER_MODE_THRESHOLD_CHANGED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo63351g(List list) {
        if (this.f117983c.mo63362b(this.f117981a)) {
            int c = aeri.m52438c(this.f117981a);
            StringBuilder sb = new StringBuilder(40);
            sb.append("Location mode is changed to: ");
            sb.append(c);
            sb.toString();
            ArrayList arrayList = new ArrayList(Arrays.asList(bvzf.LM_LOCATION_MODE_OFF, bvzf.LM_LOCATION_MODE_SENSORS_ONLY, bvzf.LM_LOCATION_MODE_BATTERY_SAVING, bvzf.LM_LOCATION_MODE_HIGH_ACCURACY));
            bnha h = bnhe.m109414h();
            h.mo67695b(bvzf.LM_UNKNOWN, bvzk.LOCATION_MODE_UNKNOWN);
            h.mo67695b(bvzf.LM_LOCATION_MODE_OFF, bvzk.LOCATION_MODE_OFF);
            h.mo67695b(bvzf.LM_LOCATION_MODE_BATTERY_SAVING, bvzk.LOCATION_MODE_BATTERY_SAVING);
            h.mo67695b(bvzf.LM_LOCATION_MODE_SENSORS_ONLY, bvzk.LOCATION_MODE_SENSORS_ONLY);
            h.mo67695b(bvzf.LM_LOCATION_MODE_HIGH_ACCURACY, bvzk.LOCATION_MODE_HIGH_ACCURACY);
            bnhe b = h.mo67618b();
            bvzf bvzf = (bvzf) arrayList.get(c);
            String valueOf = String.valueOf(bvzf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb2.append("UlrClearcutEvents.logLocationModeChange(");
            sb2.append(valueOf);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157391i = bvzf.f158289f;
                bvql.f157383a |= 128;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), (bvzk) b.get(bvzf), list);
            }
        }
        boolean b2 = aeri.m52437b(this.f117981a);
        if (bguv.m100054d()) {
            bguv.f117607a.mo63232a(b2);
        }
    }

    /* renamed from: a */
    private final List m100292a() {
        ArrayList arrayList = new ArrayList();
        for (Account account : this.f117983c.mo63354a().mo70927a()) {
            AccountConfig a = this.f117983c.mo63353a(account);
            if (a != null && a.f150894e && a.f150896g) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
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
    /* renamed from: a */
    public static void m100293a(Context context, Intent intent) {
        char c;
        Context applicationContext = context.getApplicationContext();
        Intent a = m100291a(applicationContext);
        if (intent != null) {
            a.putExtra("receiverAction", intent.getAction());
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -544318258:
                    if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -177095062:
                    if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3237136:
                    if (action.equals("init")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1435872108:
                    if (action.equals("com.google.android.gms.phenotype.com.google.android.gms.beacon.COMMITTED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1785578223:
                    if (action.equals("com.google.android.gms.phenotype.com.google.android.gms.ulr.COMMITTED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1988126812:
                    if (action.equals("com.google.android.gms.phenotype.com.google.android.location.COMMITTED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                List a2 = gre.m13766a(intent);
                if (!a2.isEmpty()) {
                    a.putParcelableArrayListExtra("accountsAdded", new ArrayList(a2));
                }
            } else if (c == 1 || c == 2 || c == 3 || c == 4) {
                if (!m100295a("com.google.android.location", intent)) {
                    if (!m100295a("com.google.android.gms.beacon", intent)) {
                        if (m100295a("com.google.android.gms.ulr", intent)) {
                            if (bgzt.f118167b != null) {
                                bgzt.f118167b.mo63219b(applicationContext);
                            }
                            a.putExtra("receiverAction", "com.google.gservices.intent.action.GSERVICES_CHANGED");
                            bgzo.m100465a(applicationContext, a);
                            return;
                        }
                        return;
                    } else if (bgzt.f118169d != null) {
                        bgzt.f118169d.mo63219b(applicationContext);
                        return;
                    } else {
                        return;
                    }
                } else if (bgzt.f118167b != null) {
                    bgzt.f118168c.mo63219b(applicationContext);
                    return;
                } else {
                    return;
                }
            } else if (c == 5) {
                if (intent.getBooleanExtra("is_boot", false)) {
                    a.putExtra("is_boot", true);
                }
                if (intent.getBooleanExtra("is_module_updated", false)) {
                    a.putExtra("is_module_updated", true);
                }
            }
            bgzo.m100465a(applicationContext, a);
            return;
        }
        bgur.m100021b("GCoreUlr", "", new IllegalStateException("Missing receiver intent"));
    }

    /* renamed from: a */
    private final boolean m100294a(AccountConfig accountConfig) {
        return this.f117983c.mo63368e(accountConfig.f150890a) || !accountConfig.f150894e;
    }

    /* renamed from: a */
    private static boolean m100295a(String str, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String valueOf = String.valueOf(stringExtra);
        if (valueOf.length() == 0) {
            new String("phenotype.PACKAGE_NAME: ");
        } else {
            "phenotype.PACKAGE_NAME: ".concat(valueOf);
        }
        return str.equals(stringExtra);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgye.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgye.a(android.accounts.Account, long):void
      bgye.a(android.accounts.Account, boolean):void */
    /* renamed from: a */
    public final void mo63343a(Intent intent) {
        char c;
        boolean z;
        Long d;
        boolean z2;
        Boolean bool;
        bvwq bvwq;
        bgys bgys;
        bgys bgys2;
        boolean z3;
        boolean z4;
        int i;
        String str;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("receiverAction");
        if (stringExtra == null) {
            stringExtra = "NO_RECEIVER_ACTION";
        }
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + stringExtra.length());
        sb.append("WorldUpdater received intent ");
        sb.append(valueOf);
        sb.append(" with receiverAction ");
        sb.append(stringExtra);
        bgur.m100011a("GCoreUlr", sb.toString());
        this.f117987g.mo63174a(this.f117983c.mo63354a());
        bgye bgye = this.f117983c;
        bvwq bvwq2 = null;
        sdo.m34973b((String) null);
        synchronized (bgye.f117997f) {
            Account[] accountArr = ((bfkd) bgye.f118001c).f114281b;
            boolean aW = chcs.f188354a.mo6606a().mo85061aW();
            if (aW) {
                bgyh bgyh = bgye.f118000b;
                Set<String> a = bgyi.m100377a(bgyh.f118032a, accountArr);
                if (!a.isEmpty()) {
                    int size = a.size();
                    String a2 = aeqm.m52400a(accountArr);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 42);
                    sb2.append("Dropping ");
                    sb2.append(size);
                    sb2.append(" PersistentPref keys; ");
                    sb2.append(a2);
                    sb2.toString();
                    SharedPreferences.Editor edit = bgyh.f118032a.edit();
                    for (String str2 : a) {
                        if (!bgyi.m100378a(str2)) {
                            edit.remove(str2);
                        }
                    }
                    edit.apply();
                }
            }
            Conditions a3 = bgye.f118002d.mo63429a();
            if (!bgye.f117999a.f118059b.getAll().isEmpty() && !a3.mo70921c()) {
                String valueOf2 = String.valueOf(a3);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                sb3.append("cleanup() calling clear(): ");
                sb3.append(valueOf2);
                sb3.toString();
                List<InactiveReason> b = a3.mo70920b();
                TreeSet treeSet = new TreeSet();
                for (InactiveReason inactiveReason : b) {
                    treeSet.add(inactiveReason.f150918c);
                }
                String valueOf3 = String.valueOf(TextUtils.join("_", treeSet));
                String str3 = valueOf3.length() == 0 ? new String("clear:") : "clear:".concat(valueOf3);
                if (!InactiveReason.m117336a(b, 3)) {
                    str = str3;
                } else {
                    String a4 = bgzo.m100456a();
                    String valueOf4 = String.valueOf(str3);
                    if (a4 == null) {
                        a4 = "unknown-country";
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 1 + a4.length());
                    sb4.append(valueOf4);
                    sb4.append("_");
                    sb4.append(a4);
                    str = sb4.toString();
                }
                bgyj bgyj = bgye.f117999a;
                SharedPreferences.Editor edit2 = bgyj.f118059b.edit();
                edit2.clear();
                bgyj.mo63413a(edit2, false, "cleanup()", str, false);
            } else if (aW) {
                bgyj bgyj2 = bgye.f117999a;
                Set<String> a5 = bgyi.m100377a(bgyj2.f118059b, accountArr);
                if (!a5.isEmpty()) {
                    int size2 = a5.size();
                    String a6 = aeqm.m52400a(accountArr);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(a6).length() + 36);
                    sb5.append("Dropping ");
                    sb5.append(size2);
                    sb5.append(" UserPref keys; ");
                    sb5.append(a6);
                    bgur.m100011a("GCoreUlr", sb5.toString());
                    SharedPreferences.Editor edit3 = bgyj2.f118059b.edit();
                    for (String str4 : a5) {
                        edit3.remove(str4);
                    }
                    bgyj2.mo63413a(edit3, false, "restrictTo()", "restrictTo", false);
                }
            }
        }
        bgzo.m100459a(this.f117981a);
        ReportingConfig a7 = this.f117983c.mo63354a();
        int i2 = 0;
        switch (stringExtra.hashCode()) {
            case -1184851779:
                if (stringExtra.equals("android.location.PROVIDERS_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -511271086:
                if (stringExtra.equals("android.location.MODE_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -177095062:
                if (stringExtra.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3237136:
                if (stringExtra.equals("init")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 211362435:
                if (stringExtra.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i3 = 8;
        if (c != 0) {
            if (c == 1) {
                bgzt.m100496a();
                bgur.m100004a();
                mo63344a(stringExtra);
                if (chcs.m148243o()) {
                    for (AccountConfig accountConfig : a7.f150914a) {
                        if (accountConfig.mo70911f() && (z3 = accountConfig.f150894e) != (z4 = accountConfig.f150896g)) {
                            bgyr a8 = bgys.m100417a(accountConfig.f150890a, "com.google.android.gms+lhlr-merge");
                            a8.mo63434a(accountConfig.f150892c);
                            a8.mo63436a(true);
                            a8.f118099g = false;
                            a8.f118100h = false;
                            a8.f118097e = true;
                            a8.mo63436a(true);
                            a8.mo63437b();
                            this.f117983c.mo63357a("EnableMergeLRToLHSettingChange", a8.mo63432a(), "LR_merge_to_LH");
                            String valueOf5 = String.valueOf(accountConfig.f150890a);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 84);
                            sb6.append("EnableMergeLRToLHSettingChange update account setting: LR:");
                            sb6.append(z3);
                            sb6.append(" LH:");
                            sb6.append(z4);
                            sb6.append(" on account:");
                            sb6.append(valueOf5);
                            sb6.toString();
                        }
                    }
                }
                if (this.f117983c.mo63366c()) {
                    for (AccountConfig accountConfig2 : a7.f150914a) {
                        if (accountConfig2.mo70911f()) {
                            Account account = accountConfig2.f150890a;
                            if (chcs.m148233e() && !m100294a(accountConfig2)) {
                                bgyr a9 = bgys.m100417a(account, "com.google.android.gms+disable-flag");
                                a9.mo63434a(accountConfig2.f150892c);
                                a9.f118099g = false;
                                a9.mo63438c();
                                if (chcs.m148243o()) {
                                    a9.f118100h = false;
                                }
                                bgys = a9.mo63432a();
                                this.f117983c.mo63357a("DisableUlrFlagEnabled", bgys, "disable_ulr_flag");
                            } else if (chcs.m148233e() && m100294a(accountConfig2)) {
                                this.f117983c.mo63356a(account, true);
                                bgys = null;
                            } else if (!chcs.m148233e()) {
                                if (this.f117983c.mo63368e(accountConfig2.f150890a) || accountConfig2.f150894e) {
                                    bgys2 = null;
                                } else {
                                    bgyr a10 = bgys.m100417a(account, "com.google.android.gms+disable-flag");
                                    a10.mo63434a(accountConfig2.f150892c);
                                    a10.f118099g = true;
                                    a10.mo63438c();
                                    if (chcs.m148243o()) {
                                        a10.f118100h = true;
                                    }
                                    bgys2 = a10.mo63432a();
                                    this.f117983c.mo63357a("DisableUlrFlagDisabled", bgys2, "disable_ulr_flag");
                                }
                                this.f117983c.mo63356a(account, false);
                                bgys = bgys2;
                            } else {
                                bgys = null;
                            }
                            if (bgys != null) {
                                String valueOf6 = String.valueOf(bgys.f118118h);
                                String valueOf7 = String.valueOf(bgys.f118119i);
                                String valueOf8 = String.valueOf(accountConfig2.f150890a);
                                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 66 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
                                sb7.append("DisableUlrFlagDisabled update account setting: LR:");
                                sb7.append(valueOf6);
                                sb7.append(" LH:");
                                sb7.append(valueOf7);
                                sb7.append(" on account:");
                                sb7.append(valueOf8);
                                sb7.toString();
                            }
                        }
                    }
                }
                z = false;
            } else if (c == 2) {
                ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("accountsAdded");
                if (parcelableArrayListExtra != null) {
                    int size3 = parcelableArrayListExtra.size();
                    while (i2 < size3) {
                        Account account2 = (Account) parcelableArrayListExtra.get(i2);
                        bgxk bgxk = this.f117991k;
                        if (!bgxk.mo63322b(account2)) {
                            i = i2;
                        } else {
                            if (chbx.m148144b() && chcy.m148487c() && bgxk.f117921d == -1) {
                                bguv.m100043a("UlrAutoEnableEvents", 9);
                            }
                            if (chbx.m148144b()) {
                                i = i2;
                                if (bgxk.f117921d != -1) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (Math.abs(currentTimeMillis - bgxk.f117921d) < chcs.m148230b()) {
                                        long j = bgxk.f117921d;
                                        StringBuilder sb8 = new StringBuilder(143);
                                        sb8.append("AutoEnableManager detected cleared data. currentTimeMillis: ");
                                        sb8.append(currentTimeMillis);
                                        sb8.append(" reportingAutoEnableManagerInitTimeMillis: ");
                                        sb8.append(j);
                                        bgur.m100011a("GCoreUlr", sb8.toString());
                                        String valueOf9 = String.valueOf(aeqm.m52397a(account2));
                                        if (valueOf9.length() == 0) {
                                            new String("AutoEnableManager detected cleared data for account: ");
                                        } else {
                                            "AutoEnableManager detected cleared data for account: ".concat(valueOf9);
                                        }
                                        bgxk.mo63321a(account2);
                                        if (chcy.m148487c()) {
                                            bguv.m100043a("UlrAutoEnableEvents", i3);
                                            bguv.m100043a("UlrCreationTimeSecondAutoEnableIneligibleSetNewAccountStoragePath", (int) (bgxk.f117921d / 1000));
                                            bguv.m100043a("UlrCurrentElapsedSecondAutoEnableIneligibleSetNewAccountStoragePath", (int) (currentTimeMillis / 1000));
                                            bguv.m100043a("UlrDurationSecondAutoEnableIneligibleSetNewAccountStoragePath", (int) ((currentTimeMillis - bgxk.f117921d) / 1000));
                                        }
                                    } else {
                                        bgxk.f117919b.mo63361b(account2, true);
                                        bgxk.mo63325e(account2);
                                    }
                                }
                            } else {
                                i = i2;
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - bgxk.f117920c < chcs.m148230b()) {
                                long j2 = bgxk.f117920c;
                                long b2 = chcs.m148230b();
                                StringBuilder sb9 = new StringBuilder(162);
                                sb9.append("AutoEnableManager detected cleared data. currentElapsed: ");
                                sb9.append(elapsedRealtime);
                                sb9.append(" creationTimeMillis: ");
                                sb9.append(j2);
                                sb9.append(" ");
                                sb9.append(elapsedRealtime - j2);
                                sb9.append(" < ");
                                sb9.append(b2);
                                bgur.m100011a("GCoreUlr", sb9.toString());
                                String valueOf10 = String.valueOf(aeqm.m52397a(account2));
                                if (valueOf10.length() == 0) {
                                    new String("AutoEnableManager detected cleared data for account: ");
                                } else {
                                    "AutoEnableManager detected cleared data for account: ".concat(valueOf10);
                                }
                                bgxk.mo63321a(account2);
                                if (chcy.m148486b()) {
                                    bguv.m100043a("UlrAutoEnableEvents", 2);
                                    bguv.m100043a("UlrCreationTimeSecondAutoEnableIneligibleSetNewAccount", (int) (bgxk.f117920c / 1000));
                                    bguv.m100043a("UlrCurrentElapsedSecondAutoEnableIneligibleSetNewAccount", (int) (elapsedRealtime / 1000));
                                    bguv.m100043a("UlrDurationSecondAutoEnableIneligibleSetNewAccount", (int) ((elapsedRealtime - bgxk.f117920c) / 1000));
                                }
                            } else {
                                bgxk.f117919b.mo63361b(account2, true);
                                bgxk.mo63325e(account2);
                            }
                        }
                        i2 = i + 1;
                        i3 = 8;
                    }
                }
                z = true;
            } else if (c == 3 || c == 4) {
                this.f117983c.mo63362b(this.f117981a);
                z = false;
            } else {
                z = false;
            }
        } else if (intent2.getBooleanExtra("is_boot", false)) {
            bgye.f117996e = true;
            bgyg bgyg = this.f117984d;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            synchronized (bgyg.f118028a) {
                List<bgyt> c2 = bgyg.mo63404c();
                if (!Thread.holdsLock(bgyg.f118028a)) {
                    bgur.m100010a("GCoreUlr", 17, new IllegalStateException("Caller must grab lock before calling"));
                }
                bgyg.mo63398a();
                for (bgyt bgyt : c2) {
                    bgyg.mo63397a(bgyt.f118132c, Long.valueOf(bgyt.f118130a), elapsedRealtime2, bgyt.f118133d);
                }
            }
            Context context = this.f117981a;
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            synchronized (bgts.f117517a) {
                context.getSharedPreferences("ULR_HISTORIAN_STATE", 0).edit().putLong("last_upload_timestamp", elapsedRealtime3).apply();
            }
            int i4 = Build.VERSION.SDK_INT;
            Context context2 = this.f117981a;
            spn.m35856a(context2, "com.google.android.location.reporting.service.LocationHistoryInjectorService", sse.m36205a(context2));
            PackageManager packageManager = this.f117981a.getPackageManager();
            List a11 = m100292a();
            mo63345a(a11);
            mo63346b(a11);
            int i5 = Build.VERSION.SDK_INT;
            if (packageManager.hasSystemFeature("android.hardware.wifi")) {
                mo63347c(a11);
            }
            int i6 = Build.VERSION.SDK_INT;
            if (packageManager.hasSystemFeature("android.hardware.bluetooth_le")) {
                mo63348d(a11);
            }
            int i7 = Build.VERSION.SDK_INT;
            mo63349e(a11);
            int i8 = Build.VERSION.SDK_INT;
            mo63350f(a11);
            int i9 = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(this.f117981a.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f117983c.mo63363b(z2) && !a11.isEmpty()) {
                ApiMetadata b3 = bgzr.m100491b(z2, System.currentTimeMillis());
                if (!chcp.m148193b() || !chcp.m148195d()) {
                    bvwq = null;
                } else {
                    bvwq = bgzq.m100486b(z2, System.currentTimeMillis());
                }
                this.f117986f.mo63202a(a11, new Pair(b3, bvwq), "AirplaneModeMetaData");
                bguv.m100042a("UlrAirplaneModeChange");
                bgux.m100098b(Boolean.valueOf(z2), a11);
            }
            WifiManager wifiManager = this.f117988h;
            if (wifiManager != null) {
                int wifiState = wifiManager.getWifiState();
                if (wifiState == 3) {
                    bool = true;
                } else if (wifiState == 1) {
                    bool = false;
                } else {
                    z = false;
                }
                if (this.f117983c.mo63358a(bool.booleanValue()) && !a11.isEmpty()) {
                    ApiMetadata a12 = bgzr.m100489a(bool.booleanValue(), System.currentTimeMillis());
                    if (chcp.m148193b() && chcp.m148195d()) {
                        bvwq2 = bgzq.m100485a(bool.booleanValue(), System.currentTimeMillis());
                    }
                    this.f117986f.mo63202a(a11, new Pair(a12, bvwq2), "WifiStateMetaData");
                    bguv.m100042a("UlrWifiStateChange");
                    bgux.m100091a(bool, a11);
                }
            }
            mo63351g(new ArrayList(this.f117983c.mo63354a().mo70927a()));
            z = false;
        } else {
            z = false;
        }
        boolean isEmpty = a7.f150915b.mo70920b().isEmpty();
        for (AccountConfig accountConfig3 : a7.f150914a) {
            Account account3 = accountConfig3.f150890a;
            if (account3 == null) {
                String valueOf11 = String.valueOf(accountConfig3);
                StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf11).length() + 16);
                sb10.append("null account in ");
                sb10.append(valueOf11);
                bgur.m100019b("GCoreUlr", 16, "", new IllegalStateException(sb10.toString()));
            } else if (isEmpty) {
                long aM = chcs.f188354a.mo6606a().mo85051aM();
                Context context3 = this.f117981a;
                String valueOf12 = String.valueOf(aeqm.m52397a(account3));
                if (valueOf12.length() == 0) {
                    new String("Adding sync for account ");
                } else {
                    "Adding sync for account ".concat(valueOf12);
                }
                try {
                    ReportingSyncChimeraService.m117309a(account3, context3);
                    new rtg(context3);
                    rtg.m34396a(account3, "com.google.android.location.reporting", Bundle.EMPTY, aM);
                } catch (RuntimeException e) {
                    String a13 = aeqm.m52397a(account3);
                    StringBuilder sb11 = new StringBuilder(String.valueOf(a13).length() + 39);
                    sb11.append("account: ");
                    sb11.append(a13);
                    sb11.append(", period: ");
                    sb11.append(aM);
                    bgur.m100021b("GCoreUlr", sb11.toString(), e);
                }
                if (z && !accountConfig3.f150900k) {
                    String valueOf13 = String.valueOf(aeqm.m52397a(account3));
                    if (valueOf13.length() == 0) {
                        new String("Triggering manual sync to test re-auth for ");
                    } else {
                        "Triggering manual sync to test re-auth for ".concat(valueOf13);
                    }
                    ReportingSyncChimeraService.m117310a(account3, "WorldUpdater", this.f117981a);
                }
            } else {
                Context context4 = this.f117981a;
                String valueOf14 = String.valueOf(aeqm.m52397a(account3));
                if (valueOf14.length() == 0) {
                    new String("Ensuring no sync for account ");
                } else {
                    "Ensuring no sync for account ".concat(valueOf14);
                }
                try {
                    ReportingSyncChimeraService.m117309a(account3, context4);
                    new rtg(context4);
                    rtg.m34395a(account3, "com.google.android.location.reporting", Bundle.EMPTY);
                } catch (RuntimeException e2) {
                    String valueOf15 = String.valueOf(aeqm.m52397a(account3));
                    bgur.m100021b("GCoreUlr", valueOf15.length() == 0 ? new String("account: ") : "account: ".concat(valueOf15), e2);
                }
            }
        }
        this.f117985e.mo63313a(a7, stringExtra.length() == 0 ? new String("WorldUpdater:") : "WorldUpdater:".concat(stringExtra));
        ApiRate k = this.f117982b.mo63393k();
        NetworkLocationStatus j3 = this.f117982b.mo63392j();
        if (k != null && j3 != null && (d = k.mo71577d()) != null) {
            long millis = TimeUnit.NANOSECONDS.toMillis(j3.f79377d);
            bgyf bgyf = this.f117982b;
            long j4 = bgyf.f118009a;
            long j5 = bgyf.f118012d;
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            long longValue = (elapsedRealtime4 - d.longValue()) - chcs.f188354a.mo6606a().mo85101d();
            if (millis < longValue && j4 < longValue && j5 < longValue) {
                StringBuilder sb12 = new StringBuilder(123);
                sb12.append("Missing location or location status: ");
                sb12.append(millis);
                sb12.append(", ");
                sb12.append(j4);
                sb12.append(", ");
                sb12.append(j5);
                sb12.append(", ");
                sb12.append(elapsedRealtime4);
                sb12.toString();
                bguv.m100040a(8);
                return;
            }
            bguv.m100042a("UlrFlpLocationNotMissing");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63344a(String str) {
        char c;
        Boolean bool;
        boolean z;
        String str2;
        String str3 = str;
        if (chcd.m148153b()) {
            if (str.length() == 0) {
                new String("ulrRelatedSettingChange triggered with action: ");
            } else {
                "ulrRelatedSettingChange triggered with action: ".concat(str3);
            }
            List a = m100292a();
            boolean z2 = true;
            switch (str.hashCode()) {
                case -1918487026:
                    if (str3.equals("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1875733435:
                    if (str3.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1492165444:
                    if (str3.equals("com.google.android.location.reporting.CHANGE_ON_BLE_ALWAYS_SCAN_MODE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1184851779:
                    if (str3.equals("android.location.PROVIDERS_CHANGED")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case -1076576821:
                    if (str3.equals("android.intent.action.AIRPLANE_MODE")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1050121137:
                    if (str3.equals("com.google.android.location.reporting.CHANGE_ON_LOCATION_DISABLE_FOR_GOOGLE_APP")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -511271086:
                    if (str3.equals("android.location.MODE_CHANGED")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case 211362435:
                    if (str3.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 259854786:
                    if (str3.equals("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 870701415:
                    if (str3.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 1473645052:
                    if (str3.equals("com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            bvwq bvwq = null;
            switch (c) {
                case 0:
                    mo63345a(a);
                    return;
                case 1:
                    mo63346b(a);
                    return;
                case 2:
                    mo63347c(a);
                    return;
                case 3:
                    mo63348d(a);
                    return;
                case 4:
                    mo63349e(a);
                    return;
                case 5:
                    mo63350f(a);
                    return;
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (Settings.Global.getInt(this.f117981a.getContentResolver(), "airplane_mode_on", 0) == 0) {
                        z2 = false;
                    }
                    if (this.f117983c.mo63363b(z2)) {
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Airplane mode is changed to ");
                        sb.append(z2);
                        sb.toString();
                        if (!a.isEmpty()) {
                            if (!chcj.m148165c()) {
                                ApiMetadata b = bgzr.m100491b(z2, System.currentTimeMillis());
                                if (chcp.m148193b() && chcp.m148195d()) {
                                    bvwq = bgzq.m100486b(z2, System.currentTimeMillis());
                                }
                                this.f117986f.mo63202a(a, new Pair(b, bvwq), "AirplaneModeMetaData");
                            }
                            bguv.m100042a("UlrAirplaneModeChange");
                        }
                        bgux.m100098b(Boolean.valueOf(z2), a);
                        return;
                    }
                    return;
                case 7:
                    WifiManager wifiManager = this.f117988h;
                    if (wifiManager != null) {
                        int wifiState = wifiManager.getWifiState();
                        if (wifiState == 3) {
                            bool = true;
                        } else if (wifiState == 1) {
                            bool = false;
                        } else {
                            return;
                        }
                        if (this.f117983c.mo63358a(bool.booleanValue())) {
                            int wifiState2 = this.f117988h.getWifiState();
                            StringBuilder sb2 = new StringBuilder(37);
                            sb2.append("Wifi state is changed to: ");
                            sb2.append(wifiState2);
                            sb2.toString();
                            if (!a.isEmpty()) {
                                if (!chcj.m148165c()) {
                                    ApiMetadata a2 = bgzr.m100489a(bool.booleanValue(), System.currentTimeMillis());
                                    if (chcp.m148193b() && chcp.m148195d()) {
                                        bvwq = bgzq.m100485a(bool.booleanValue(), System.currentTimeMillis());
                                    }
                                    this.f117986f.mo63202a(a, new Pair(a2, bvwq), "WifiStateMetaData");
                                }
                                bguv.m100042a("UlrWifiStateChange");
                            }
                            bgux.m100091a(bool, a);
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                case 9:
                    mo63351g(new ArrayList(this.f117983c.mo63354a().mo70927a()));
                    return;
                case 10:
                    int i2 = Build.VERSION.SDK_INT;
                    PowerManager powerManager = this.f117990j;
                    if (powerManager == null) {
                        bgur.m100025c("GCoreUlr", "Can not obtain Power Manager");
                        z = false;
                    } else {
                        z = powerManager.isDeviceIdleMode();
                    }
                    if (!z) {
                        str2 = "off";
                    } else {
                        str2 = "on";
                    }
                    if (str2.length() == 0) {
                        new String("Doze mode is changed to: ");
                    } else {
                        "Doze mode is changed to: ".concat(str2);
                    }
                    if (!a.isEmpty()) {
                        if (!chcj.m148165c()) {
                            ApiMetadata apiMetadata = new ApiMetadata(null, new ApiDeviceConnectivitySetting(null, Boolean.valueOf(z), null), null, null, null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null);
                            if (chcp.m148193b() && chcp.m148195d()) {
                                long currentTimeMillis = System.currentTimeMillis();
                                bxvd da = bvwd.f157910e.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bvwd bvwd = (bvwd) da.f164949b;
                                bvwd.f157912a = 4 | bvwd.f157912a;
                                bvwd.f157915d = z;
                                bvwd bvwd2 = (bvwd) da.mo74062i();
                                bxvd da2 = bvwq.f157983r.mo74144da();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bvwq bvwq2 = (bvwq) da2.f164949b;
                                bvwd2.getClass();
                                bvwq2.f157996l = bvwd2;
                                int i3 = bvwq2.f157985a | 512;
                                bvwq2.f157985a = i3;
                                bvwq2.f157985a = i3 | 1;
                                bvwq2.f157986b = currentTimeMillis;
                                bvwq = (bvwq) da2.mo74062i();
                            }
                            this.f117986f.mo63202a(a, new Pair(apiMetadata, bvwq), "DozeModeMetaData");
                        }
                        bguv.m100042a("UlrDozeModeChange");
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    String valueOf2 = String.valueOf(valueOf);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
                    sb3.append("UlrClearcutEvents.logDozeModeChange(");
                    sb3.append(valueOf2);
                    sb3.append(")");
                    sb3.toString();
                    if (bgux.m100112d()) {
                        bxvd da3 = bvql.f157381l.mo74144da();
                        boolean booleanValue = valueOf.booleanValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bvql bvql = (bvql) da3.f164949b;
                        bvql.f157383a |= 512;
                        bvql.f157393k = booleanValue;
                        bgux.f117614a.mo63241a((bvql) da3.mo74062i(), !valueOf.booleanValue() ? bvzk.DOZE_MODE_OFF : bvzk.DOZE_MODE_ON, a);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63345a(List list) {
        if (this.f117983c.f118000b.mo63410a(chbr.m148128b() ? 1 : 0, "geo_supported_key")) {
            boolean b = chbr.m148128b();
            StringBuilder sb = new StringBuilder(41);
            sb.append("Geo supported setting is changed to ");
            sb.append(b);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(b);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb2.append("UlrClearcutEvents.logGeoSupportedChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (bgux.m100112d()) {
                bxvd da = bvql.f157381l.mo74144da();
                boolean booleanValue = valueOf.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvql bvql = (bvql) da.f164949b;
                bvql.f157383a |= 1;
                bvql.f157384b = booleanValue;
                bgux.f117614a.mo63241a((bvql) da.mo74062i(), !valueOf.booleanValue() ? bvzk.GEO_UNSUPPORTED : bvzk.GEO_SUPPORTED, list);
            }
        }
    }
}
