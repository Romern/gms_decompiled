package com.google.android.location.internal;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.persistent.LocationPersistentChimeraService;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationPersistentInitIntentOperation extends IntentOperation {
    /* renamed from: a */
    private static boolean m117257a(Context context) {
        return Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "gps") || Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "network");
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        int i;
        int i2 = 0;
        int intExtra = intent.getIntExtra("com.google.android.gms.location.internal.FLAGS", 0);
        if ((intExtra & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((intExtra & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LocationPersistentChimeraService.m66897a(this);
        Context applicationContext = getApplicationContext();
        skc skc = new skc(applicationContext);
        Intent startIntent = IntentOperation.getStartIntent(this, AnalyticsUploadChimeraIntentService.class, "com.google.android.location.internal.UPLOAD_ANALYTICS");
        if (IntentOperation.getPendingIntent(applicationContext, AnalyticsUploadChimeraIntentService.class, startIntent, 0, 536870912) == null) {
            skc.mo25671a("AnalyticsUplIS", 2, SystemClock.elapsedRealtime() + 86400000, 86400000, IntentOperation.getPendingIntent(applicationContext, AnalyticsUploadChimeraIntentService.class, startIntent, 0, 0), "com.google.android.gms");
        }
        if (z || m117257a(this)) {
            Intent a = GoogleLocationManagerChimeraService.m117249a(this);
            a.putExtra("fromDeviceBoot", z);
            a.putExtra("fromGmsCoreInit", m117257a(this));
            startService(a);
        }
        if (z || z2) {
            if (cezr.f183532a.mo6606a().savePlatformVersionO()) {
                int i3 = Build.VERSION.SDK_INT;
                int i4 = Build.VERSION.SDK_INT;
            }
            if (cezr.f183532a.mo6606a().enablePlatformUpgradeDetection()) {
                SharedPreferences sharedPreferences = getSharedPreferences("platformVersionName", 0);
                int i5 = sharedPreferences.getInt("platformVersion", -1);
                int i6 = Build.VERSION.SDK_INT;
                int i7 = Build.VERSION.SDK_INT;
                if (i5 != 29) {
                    sharedPreferences.edit().putInt("platformVersion", 29).apply();
                    if (i5 != -1) {
                        bgau bgau = new bgau(this);
                        List<Account> d = soz.m35801d(this, getPackageName());
                        C1225nr nrVar = new C1225nr(d.size());
                        for (Account account : d) {
                            nrVar.add(account.name);
                        }
                        bgau.f115939a.edit().putStringSet("accountsToBeChecked", nrVar).apply();
                    }
                }
            }
            bgbd bgbd = new bgbd(getApplicationContext());
            if (soz.m35811h(bgbd.f115971a)) {
                int i8 = Build.VERSION.SDK_INT;
                if (cfaa.f183538a.mo6606a().showScanningUpgradeNotification()) {
                    SharedPreferences sharedPreferences2 = bgbd.f115971a.getSharedPreferences("platformVersionName", 0);
                    if (sharedPreferences2 == null || !sharedPreferences2.getBoolean("platformVersionO", false)) {
                        i = 0;
                    } else {
                        ContentResolver contentResolver = bgbd.f115971a.getContentResolver();
                        int i9 = Settings.Global.getInt(contentResolver, "wifi_scan_always_enabled", 0);
                        int i10 = Settings.Global.getInt(contentResolver, "ble_scan_always_enabled", 0);
                        i = (i9 == 0 || i10 == 0) ? i9 == 0 ? i10 == 0 ? 0 : C0126R.string.scanning_upgrade_to_p_notification_ble_on : C0126R.string.scanning_upgrade_to_p_notification_wifi_on : C0126R.string.scanning_upgrade_to_p_notification_wifi_and_ble_on;
                    }
                    bgbd.mo62593a(i);
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (cezr.f183532a.mo6606a().locationHistoryNotificationForQ()) {
                Context applicationContext2 = getApplicationContext();
                rjx a2 = aeqc.m52384a(applicationContext2);
                bgye a3 = bgye.m100307a(applicationContext2);
                bgau bgau2 = new bgau(applicationContext2);
                Set<String> stringSet = bgau2.f115939a.getStringSet("accountsToBeChecked", bnon.f131923a);
                if (!stringSet.isEmpty()) {
                    List<Account> d2 = soz.m35801d(applicationContext2, applicationContext2.getPackageName());
                    ArrayList arrayList = new ArrayList();
                    for (Account account2 : d2) {
                        if (stringSet.contains(account2.name)) {
                            arrayList.add(account2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sex a4 = sex.m35104a(applicationContext2);
                        a4.mo25442a(new NotificationChannel("privacy-features-channel", applicationContext2.getText(C0126R.string.notification_channel_name_location_privacy_features), 3));
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i2 < size) {
                            Account account3 = (Account) arrayList.get(i2);
                            a2.mo24736c(account3).mo50373a(new bgat(a3, account3, applicationContext2, a4, i12, bgau2));
                            i2++;
                            i12++;
                            a2 = a2;
                            size = size;
                            arrayList = arrayList;
                        }
                    } else if (!stringSet.isEmpty()) {
                        bgau2.f115939a.edit().clear().apply();
                    }
                }
            }
            Intent intent2 = new Intent("init");
            intent2.putExtra("is_boot", z);
            intent2.putExtra("is_module_updated", z2);
            bgyb.m100293a(this, intent2);
        }
        if (ceze.m138466k()) {
            NlpNetworkProviderSettingsUpdateIntentOperation.m117261a(this);
        } else {
            NlpNetworkProviderSettingsUpdateChimeraReceiver.m117260a(this);
        }
        NanoAppUpdaterChimeraGcmTaskService.m117274a(this);
        ComponentName componentName = new ComponentName(this, "com.google.android.location.internal.LocationContentProvider");
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        bgrw.m99827a();
        bgsg.m99845a();
    }
}
