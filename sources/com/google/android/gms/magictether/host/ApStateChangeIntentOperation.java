package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApStateChangeIntentOperation extends IntentOperation {
    public ApStateChangeIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        if (cfcj.m138656c() && !cfcj.m138659f()) {
            if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction()) || "com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("wifi_state", -1);
                if ("com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED".equals(intent.getAction()) || intExtra == 11 || intExtra == 14) {
                    afbz.m52827a(afbv.m52820a(getApplicationContext())).mo34736b();
                    AutoDisconnectIntentOperation.m67133a();
                    afcg.m52833a().mo34742b();
                    aezy.m52769a(getApplicationContext()).mo34703a(false);
                    aki.m919a(getApplicationContext()).mo874a(new Intent("com.google.android.gms.magictether.AP_FINISHED_DISABLING"));
                }
            }
        }
    }

    ApStateChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
