package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OneTimeInitializerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f80055a = OneTimeInitializerIntentOperation.class.getSimpleName();

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.onetimeinitializer.ONE_TIME_INITIALIZED".equals(intent.getAction()) && spn.m35876d(this, "com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver") != 2) {
            try {
                int i = Build.VERSION.SDK_INT;
                int intValue = ((Integer) afzd.f64997k.mo10351a()).intValue();
                int i2 = Build.VERSION.SDK_INT;
                if (intValue == 0 && intent.getIntExtra("run_count", 0) == 0) {
                    afzd.f64997k.mo10352a((Object) 1);
                    afzq.m53763b(this, true);
                }
            } catch (Exception e) {
                Log.e(f80055a, "One time init failed.");
            } catch (Throwable th) {
                spn.m35855a(this, "com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver", 2);
                throw th;
            }
            spn.m35855a(this, "com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver", 2);
        }
    }
}
