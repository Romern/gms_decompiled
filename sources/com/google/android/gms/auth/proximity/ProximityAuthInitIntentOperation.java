package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProximityAuthInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f11136a = {"com.google.android.gms.auth.proximity.GcmBroadcastReceiver"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.proximity.ProximityAuthInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        for (String str : f11136a) {
            spn.m35856a((Context) this, str, true);
        }
        if ((i & 2) <= 0) {
            FirstPartyDeviceRegistrationChimeraService.m6795a(getApplicationContext());
        }
        CryptauthDeviceSyncGcmTaskService.m6784a(getApplicationContext());
        startService(BetterTogetherFeatureSupportIntentOperation.m6739a(getBaseContext()));
        startService(BetterTogetherUnifiedSetupIntentOperation.m6878a(getBaseContext()));
    }
}
