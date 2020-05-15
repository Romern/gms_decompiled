package com.google.android.gms.security.snet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetDailyHygieneChimeraIntentService extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.security.snet.ACTION_CLEAN_PREFS".equals(intent.getAction())) {
            apyk apyk = new apyk(this);
            if (!apyk.f85144b.getBoolean("migrated_to_safetynet_preferences", false)) {
                Map<String, ?> all = apyk.f85143a.getAll();
                SharedPreferences.Editor edit = apyk.f85143a.edit();
                for (String str : all.keySet()) {
                    if (str.startsWith("snet_attestation_request_times_ms") || str.startsWith("snet_saved_attestation_response")) {
                        edit.remove(str);
                    }
                }
                if (edit.commit()) {
                    SharedPreferences.Editor edit2 = apyk.f85144b.edit();
                    edit2.putBoolean("migrated_to_safetynet_preferences", true);
                    edit2.commit();
                }
            }
            Map<String, ?> all2 = apyk.f85144b.getAll();
            SharedPreferences.Editor edit3 = apyk.f85144b.edit();
            for (String str2 : all2.keySet()) {
                if (str2.startsWith("snet_attestation_request_times_ms")) {
                    try {
                        apyk.f85145c.getPackageInfo(str2.substring(34), 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        edit3.remove(str2);
                    }
                }
            }
            edit3.commit();
        }
    }
}
