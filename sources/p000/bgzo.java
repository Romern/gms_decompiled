package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

/* renamed from: bgzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzo {

    /* renamed from: a */
    static final rtc f118164a = rtc.m34378a("device_country", (String) null);

    /* renamed from: a */
    static int m100454a(long j, long j2) {
        if (j <= j2) {
            return j2 <= j ? 0 : -1;
        }
        return 1;
    }

    /* renamed from: c */
    public static void m100475c(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putInt(str2, sharedPreferences.getInt(str, 0));
        }
    }

    /* renamed from: d */
    public static void m100477d(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putLong(str2, sharedPreferences.getLong(str, 0));
        }
    }

    /* renamed from: a */
    public static ClientIdentity m100455a(Context context, String str) {
        if (str == null) {
            return bhby.m100614a(context);
        }
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(128)) {
            if (applicationInfo.packageName.equals(str)) {
                return new ClientIdentity(applicationInfo.uid, str);
            }
        }
        return bhby.m100614a(context);
    }

    /* renamed from: b */
    public static long m100470b() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public static boolean m100476c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return sre.m36084d(context);
    }

    /* renamed from: d */
    public static boolean m100478d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!chcs.f188354a.mo6606a().mo85016E()) {
            return connectivityManager.getBackgroundDataSetting() && ssk.m36235a(context);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return connectivityManager.getBackgroundDataSetting() && activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public static PendingIntent m100471b(Context context, String str) {
        return PendingIntent.getBroadcast(context, -1, new Intent(str).setPackage("com.google.android.gms"), 134217728);
    }

    /* renamed from: a */
    public static String m100456a() {
        String str = (String) f118164a.mo25081c();
        if (str != null && str.length() >= 2 && str.length() <= 3 && TextUtils.isGraphic(str)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        bgur.m100020b("GCoreUlr", valueOf.length() == 0 ? new String("undefined device_country: ") : "undefined device_country: ".concat(valueOf));
        return null;
    }

    /* renamed from: b */
    public static String m100472b(Context context) {
        String str;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager != null) {
            try {
                Sensor defaultSensor = sensorManager.getDefaultSensor(6);
                if (defaultSensor != null) {
                    str = defaultSensor.getName();
                    if (str != null || str.isEmpty()) {
                        return null;
                    }
                    return str.substring(0, Math.min(str.length(), 25));
                }
            } catch (NullPointerException e) {
            }
        }
        str = null;
        if (str != null) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m100457a(Context context, AccountConfig accountConfig, int i) {
        Conditions conditions = accountConfig.f150902m;
        if (!sse.m36205a(context)) {
            return context.getString(C0126R.string.location_ulr_settings_device_not_supported);
        }
        List b = conditions.mo70920b();
        if (b.size() == 1 && InactiveReason.m117336a(b, 3)) {
            String a = m100456a();
            if (a != null) {
                Locale locale = Locale.getDefault();
                Locale locale2 = new Locale(locale.getLanguage(), a, locale.getVariant());
                String displayCountry = locale2.getDisplayCountry(locale);
                if (displayCountry == null || !TextUtils.isGraphic(displayCountry)) {
                    String valueOf = String.valueOf(locale2);
                    String valueOf2 = String.valueOf(locale);
                    int length = String.valueOf(displayCountry).length();
                    StringBuilder sb = new StringBuilder(length + 29 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                    sb.append("getDisplayName() is ");
                    sb.append(displayCountry);
                    sb.append(" for ");
                    sb.append(valueOf);
                    sb.append(" in ");
                    sb.append(valueOf2);
                    bgur.m100020b("GCoreUlr", sb.toString());
                } else {
                    a = displayCountry;
                }
            } else {
                a = null;
            }
            if (a == null) {
                return context.getString(C0126R.string.location_settings_ulr_summary_unsupported_region);
            }
            return context.getString(C0126R.string.location_settings_ulr_summary_unsupported_country, a);
        } else if (!conditions.mo70921c()) {
            bgur.m100024c("GCoreUlr", 37, "Should not call if ineligible (except for unsupported geo)");
            return context.getString(C0126R.string.common_disabled);
        } else if (accountConfig.mo70907c()) {
            return context.getString(C0126R.string.common_disabled);
        } else {
            if (!conditions.f150913e) {
                return context.getString(C0126R.string.location_ulr_setting_location_disabled);
            }
            if (!conditions.f150912d) {
                return context.getString(C0126R.string.location_reporting_lgaayl_is_off);
            }
            if (!accountConfig.f150900k) {
                return context.getString(C0126R.string.location_settings_ulr_summary_auth_error);
            }
            if (!accountConfig.mo70913h()) {
                String valueOf3 = String.valueOf(accountConfig);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 66);
                sb2.append("getUnavailableReason() not handling at least one inactive reason: ");
                sb2.append(valueOf3);
                bgur.m100024c("GCoreUlr", 36, sb2.toString());
            }
            if (accountConfig.f150891b) {
                String valueOf4 = String.valueOf(accountConfig);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 30);
                sb3.append("ULR not actually unavailable: ");
                sb3.append(valueOf4);
                bgur.m100024c("GCoreUlr", 38, sb3.toString());
                return context.getString(C0126R.string.common_unknown);
            } else if (i != 1) {
                return context.getString(bgzh.m100442a(i));
            } else {
                return context.getString(C0126R.string.location_settings_ulr_summary_loading);
            }
        }
    }

    /* renamed from: b */
    public static String m100473b(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47 + String.valueOf(lowerCase).length());
        sb.append("Old account name: ");
        sb.append(str);
        sb.append(", canonicalize account name: ");
        sb.append(lowerCase);
        sb.toString();
        return lowerCase;
    }

    /* renamed from: b */
    public static void m100474b(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putBoolean(str2, sharedPreferences.getBoolean(str, false));
        }
    }

    /* renamed from: a */
    public static List m100458a(String str) {
        return Arrays.asList(str.split(","));
    }

    /* renamed from: a */
    public static void m100459a(Context context) {
        Context applicationContext = context.getApplicationContext();
        bgur.m100005a(applicationContext);
        bguv.m100041a(applicationContext);
        bgux.m100090a(applicationContext);
    }

    /* renamed from: a */
    public static void m100460a(SharedPreferences sharedPreferences, Account account) {
        String account2 = account.toString();
        for (String str : sharedPreferences.getAll().keySet()) {
            if (str.contains(account2)) {
                String replace = str.replace(account.name, aeqm.m52397a(account));
                StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 54);
                sb.append("Preference was not rekeyed for account name change: '");
                sb.append(replace);
                sb.append("'");
                bgur.m100024c("GCoreUlr", 39, sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m100461a(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putString(str2, sharedPreferences.getString(str, null));
        }
    }

    /* renamed from: a */
    public static void m100462a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                bgur.m100013a("GCoreUlr", e);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m100463a(PrintWriter printWriter, Context context, bgye bgye, bgyg bgyg) {
        printWriter.println(bgye.mo63354a());
        String valueOf = String.valueOf(bgye.f118000b.mo63408a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("old config: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(bgyg.mo63404c());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
        sb2.append("uploadRequests: ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
        boolean d = bgyg.mo63405d();
        StringBuilder sb3 = new StringBuilder(16);
        sb3.append("deepStill: ");
        sb3.append(d);
        printWriter.println(sb3.toString());
        String[] strArr = bgzm.f118162a;
        printWriter.println("Gservices values:");
        bgzm.m100453a(aymn.m84266a(context.getContentResolver(), "user_location_reporting:"), printWriter);
        printWriter.println("Phenotype values:");
        ContentResolver contentResolver = context.getContentResolver();
        Uri a = anef.m64088a("com.google.android.gms.ulr");
        HashMap hashMap = new HashMap();
        Cursor query = contentResolver.query(a, bgzm.f118162a, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            bgzm.m100453a(hashMap, printWriter);
        }
        bgur.m100007a(printWriter, "GCoreUlrLong");
        bgur.m100007a(printWriter, "GCoreUlr");
    }

    /* renamed from: a */
    public static void m100464a(List list) {
        Collator instance = Collator.getInstance(Locale.getDefault());
        instance.setStrength(0);
        Collections.sort(list, new bgzn(instance));
    }

    /* renamed from: a */
    public static boolean m100465a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        String valueOf2 = String.valueOf(intent.getExtras());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("Starting service, intent=");
        sb.append(valueOf);
        sb.append(", extras=");
        sb.append(valueOf2);
        sb.toString();
        ComponentName startService = context.startService(intent);
        if (startService == null) {
            String valueOf3 = String.valueOf(intent);
            String valueOf4 = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 41 + String.valueOf(valueOf4).length());
            sb2.append("Could not start service, intent=");
            sb2.append(valueOf3);
            sb2.append(", extras=");
            sb2.append(valueOf4);
            bgur.m100025c("GCoreUlr", sb2.toString());
        }
        return startService != null;
    }

    /* renamed from: a */
    public static boolean m100466a(Context context, AccountConfig accountConfig) {
        return accountConfig.f150891b && accountConfig.mo70913h() && sse.m36205a(context);
    }

    /* renamed from: a */
    public static boolean m100467a(ReportingConfig reportingConfig, ReportingConfig reportingConfig2, bgyv bgyv) {
        if (reportingConfig == null) {
            return true;
        }
        C1225nr<Account> nrVar = new C1225nr();
        nrVar.addAll(reportingConfig.mo70927a());
        nrVar.addAll(reportingConfig2.mo70927a());
        boolean z = false;
        boolean z2 = false;
        for (Account account : nrVar) {
            AccountConfig a = reportingConfig.mo70926a(account);
            AccountConfig a2 = reportingConfig2.mo70926a(account);
            if (a == null || a2 == null) {
                return true;
            }
            int b = bgyv.mo63450b(a, "com.google.android.googlequicksearchbox");
            int a3 = bgyv.mo63449a(a, "com.google.android.googlequicksearchbox");
            int b2 = bgyv.mo63450b(a2, "com.google.android.googlequicksearchbox");
            int a4 = bgyv.mo63449a(a2, "com.google.android.googlequicksearchbox");
            ReportingState a5 = a.mo70905a(b, a3, true, true);
            ReportingState a6 = a2.mo70905a(b2, a4, true, true);
            z |= !a6.equals(a5);
            z2 |= (a6.f79601b == a5.f79601b && a6.mo43732c() == a5.mo43732c()) ? false : true;
        }
        bguv.m100048a("UlrSettingsChange", z);
        bguv.m100048a("UlrCoarseSettingsChange", z2);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* renamed from: a */
    public static boolean m100468a(File file) {
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                if (file2 != null) {
                    z = z && m100468a(file2);
                }
            }
        }
        return file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* renamed from: a */
    public static byte[] m100469a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream = null;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (gZIPOutputStream != null) {
            }
            throw th;
        }
    }
}
