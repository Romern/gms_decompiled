package com.google.android.gms.udc.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcSystemIntentHandlers$OnUpgradeOrBootOperation extends qlf {

    /* renamed from: a */
    private static final String[] f109383a = {"com.google.android.gms.udc.gcm.GcmBroadcastReceiver", "com.google.android.gms.udc.service.UdcContextInitService", "com.google.android.gms.udc.ui.AuthenticatingWebViewActivity", "com.google.android.gms.udc.ui.UdcConsentActivity", "com.google.android.gms.udc.ui.UdcSettingsListActivity"};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        intent.getAction();
        startService(IntentOperation.getStartIntent(this, "com.google.android.gms.udc.intentoperation.BootOrGmsUpdatedPersistentIntentOperation", "com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED"));
        if (!chbh.m148017o()) {
            UdcContextInitChimeraService.m93661a(getBaseContext());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.udc.service.UdcSystemIntentHandlers$OnUpgradeOrBootOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        for (String str : f109383a) {
            spn.m35856a((Context) this, str, true);
        }
    }
}
