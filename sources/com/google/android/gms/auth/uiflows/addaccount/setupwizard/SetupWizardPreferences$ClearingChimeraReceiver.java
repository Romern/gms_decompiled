package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardPreferences$ClearingChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        context.getSharedPreferences("com.google.android.gms.auth.accounts.addaccount.setupwizard.SetupWizardPreferences", 0).edit().clear().apply();
        context.startService(IntentOperation.getStartIntent(context, BufferedLogsUploadIntentOperation.class, "com.google.android.gms.auth.uiflows.addaccount.setupwizard.auth_action_suw_finished"));
    }
}
