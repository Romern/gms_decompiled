package com.google.android.gms.thunderbird;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThunderbirdModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.android.gms.thunderbird.EmergencyPersistentService"));
        if (startService(intent2) == null) {
            Log.w("Thunderbird", "unable to start emergency persistent service");
        }
        aeat a = aeat.m51532a(this);
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.thunderbird.ThunderbirdGcmTaskService";
        aebl.f63099k = "PeriodicLogging";
        aebl.mo34024a(1, 1);
        aebl.mo34023a(2);
        aebl.f63070a = TimeUnit.DAYS.toSeconds(1);
        aebl.f63102n = false;
        a.mo33984a(aebl.mo33974b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.thunderbird.ThunderbirdModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        spn.m35856a((Context) this, "com.google.android.gms.thunderbird.EmergencyLocationService", true);
        spn.m35856a((Context) this, "com.google.android.gms.thunderbird.config.EmergencyConfigContentProvider", true);
        spn.m35856a((Context) this, "com.google.android.gms.thunderbird.EmergencyPersistentService", true);
        int i = Build.VERSION.SDK_INT;
        spn.m35856a((Context) this, "com.google.android.gms.thunderbird.settings.ThunderbirdSettingsActivity", true);
        spn.m35856a((Context) this, "com.google.android.gms.thunderbird.settings.ThunderbirdSettingsContentProvider", true);
        spn.m35856a((Context) this, "com.google.android.gms.thunderbird.settings.ThunderbirdSettingInjectorService", true);
    }
}
