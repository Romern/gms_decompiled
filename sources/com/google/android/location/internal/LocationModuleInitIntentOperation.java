package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationModuleInitIntentOperation extends qlf {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.location.internal.LocationModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        spn.m35856a((Context) this, "com.google.android.gms.location.persistent.LocationPersistentService", true);
        spn.m35856a((Context) this, "com.google.android.location.reporting.service.UploadGcmTaskService", true);
        spn.m35856a((Context) this, "com.google.android.location.internal.NanoAppUpdaterGcmTaskService", true);
        int i2 = Build.VERSION.SDK_INT;
        spn.m35856a((Context) this, "com.google.android.location.fused.FusedLocationService", true);
        int i3 = Build.VERSION.SDK_INT;
        spn.m35856a((Context) this, "com.google.android.location.settings.NlpConsentFooterReceiver", true);
        int i4 = Build.VERSION.SDK_INT;
        spn.m35856a((Context) this, "com.google.android.location.util.LocationAccuracyInjectorService", true);
        sre.m36087g(this);
        Intent startIntent = IntentOperation.getStartIntent(this, LocationPersistentInitIntentOperation.class, "com.google.android.gms.location.internal.INIT_RUNTIME_STATE");
        bmxy.m108581a(startIntent);
        startIntent.putExtra("com.google.android.gms.location.internal.FLAGS", i);
        startService(startIntent);
    }
}
