package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PermissionsIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        srn srn = ahsd.f67925a;
        if (action != null) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                if (intExtra != 10 && intExtra != 12) {
                    return;
                }
                if (cfoj.m141549ad()) {
                    startService(DiscoveryChimeraService.m67336a(this).setAction("android.bluetooth.adapter.action.STATE_CHANGED"));
                }
            }
            startService(DiscoveryChimeraService.m67336a(this).setAction("com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE"));
        }
    }
}
