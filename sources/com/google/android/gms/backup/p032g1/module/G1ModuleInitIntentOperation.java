package com.google.android.gms.backup.p032g1.module;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.p032g1.restore.VerifyAutoRestoreIntentOperation;

/* renamed from: com.google.android.gms.backup.g1.module.G1ModuleInitIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class G1ModuleInitIntentOperation extends qlf {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.backup.g1.module.G1ModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        if (ccls.m130542u()) {
            Settings.Secure.putString(getContentResolver(), "mms_restore_account_name", null);
            Settings.Secure.putString(getContentResolver(), "photos_restore_account_name", null);
        }
        if (ccls.f179387a.mo6606a().mo76342d()) {
            spn.m35856a((Context) this, "com.google.android.gms.backup.mms.MmsRestoreService", true);
        }
        Intent startIntent = IntentOperation.getStartIntent(this, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
        if (startIntent != null) {
            startService(startIntent);
        }
    }
}
