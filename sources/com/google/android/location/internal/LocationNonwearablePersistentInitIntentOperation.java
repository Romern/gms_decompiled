package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationNonwearablePersistentInitIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f150786a = ssv.m36267a("com.google.android.gms.car");

    /* renamed from: b */
    static final String f150787b = ssv.m36267a("com.google.android.location");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.location.internal.LocationNonwearablePersistentInitIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.location.internal.LocationNonwearablePersistentInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m117255a() {
        boolean z;
        if (!m117256b() || !ceyg.m138423d()) {
            z = false;
        } else {
            z = true;
        }
        spn.m35856a((Context) this, "com.google.android.location.drivingmode.DrivingModeFrxActivity", m117256b());
        spn.m35856a((Context) this, vqx.f49826b.getClassName(), m117256b());
        int i = Build.VERSION.SDK_INT;
        spn.m35856a((Context) this, "com.google.android.location.drivingmode.DrivingModeSettingsActivity", z);
        spn.m35856a((Context) this, "com.google.android.location.drivingmode.DrivingModeSettingsNoSummaryActivity", false);
    }

    /* renamed from: b */
    private static final boolean m117256b() {
        return ccra.m131312d() && ccrj.m131353b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.location.internal.LocationNonwearablePersistentInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        int i = 1;
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || f150786a.equals(action) || f150787b.equals(action)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if ("com.google.android.gms.car".equals(stringExtra) || "com.google.android.location".equals(stringExtra)) {
                m117255a();
                if (ccrj.m131353b()) {
                    if (!ccra.m131312d() || !ceyg.m138423d()) {
                        i = 0;
                    }
                    vuk.m41322a();
                    int i2 = Build.VERSION.SDK_INT;
                    if (Settings.System.canWrite(this)) {
                        try {
                            Settings.System.putInt(getContentResolver(), "gearhead:driving_mode_settings_enabled", i);
                        } catch (IllegalArgumentException e) {
                            Log.e("CAR.DRIVINGMODE", "Failed to write to Settings.System table", e);
                        }
                    }
                }
                if (m117256b()) {
                    vse.m41148a(this, false);
                    return;
                }
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.location.internal.FLAGS", 0);
        int i3 = intExtra & 4;
        boolean z = (intExtra & 2) != 0;
        int i4 = intExtra & 8;
        if (i3 != 0) {
            int i5 = Build.VERSION.SDK_INT;
            if (ceuz.m138278c()) {
                spn.m35856a((Context) this, "com.google.android.location.settings.DrivingConditionProvider", true);
            }
            spn.m35856a((Context) this, "com.google.android.location.settings.DrivingActivity", true);
            spn.m35856a((Context) this, "com.google.android.location.settings.ActivityRecognitionPermissionActivity", true);
            spn.m35856a((Context) this, "com.google.android.location.settings.ActivityRecognitionModeActivity", true);
            int i6 = Build.VERSION.SDK_INT;
            spn.m35856a((Context) this, "com.google.android.gms.location.settings.LocationAccuracyActivity", true);
            int i7 = Build.VERSION.SDK_INT;
            int i8 = Build.VERSION.SDK_INT;
            int i9 = Build.VERSION.SDK_INT;
            if (ceyg.f183508a.mo6606a().enableDndNotificationBroadcast()) {
                new bewu(this).mo61207a(true);
            }
            m117255a();
        }
        if (i4 != 0) {
            m117255a();
        }
        if (m117256b()) {
            vse.m41148a(this, z);
        }
        cevl.m138301c();
        if (cevi.m138288c()) {
            spn.m35856a((Context) this, "com.google.android.location.settings.EAlertSettingsActivity", false);
            spn.m35856a((Context) this, "com.google.android.location.service.EAlertSettingInjectorService", false);
            spn.m35856a((Context) this, "com.google.android.location.ealert.ux.EAlertSafetyInfoActivity", false);
        }
    }
}
