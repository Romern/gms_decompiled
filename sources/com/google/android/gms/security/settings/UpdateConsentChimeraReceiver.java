package com.google.android.gms.security.settings;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateConsentChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("consent")) {
            Log.e("UpdateConsentReceiver", "No consent extra");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("consent", true);
        apgy apgy = new apgy(context);
        if (apgy.mo47206e() || apgy.mo47207f()) {
            apgy.mo47200a(booleanExtra);
        }
        if (intent.hasExtra("upload_consent")) {
            apgy.m70267a(context, intent.getBooleanExtra("upload_consent", true));
        }
    }
}
