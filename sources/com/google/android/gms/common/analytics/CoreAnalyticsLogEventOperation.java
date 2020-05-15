package com.google.android.gms.common.analytics;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CoreAnalyticsLogEventOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action)) {
            ril.m33641a();
            ril.m33643a(this, 12, ((Long) rst.f43609d.mo25081c()).longValue());
        } else if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            ril.m33641a();
            ril.m33643a(this, 13, ((Long) rst.f43609d.mo25081c()).longValue());
        }
    }
}
