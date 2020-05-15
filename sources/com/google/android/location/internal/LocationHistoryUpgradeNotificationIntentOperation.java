package com.google.android.location.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.reporting.ReportingState;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationHistoryUpgradeNotificationIntentOperation extends IntentOperation {
    /* renamed from: a */
    public static PendingIntent m117251a(Context context, Account account, String str, int i) {
        Intent startIntent = IntentOperation.getStartIntent(context, LocationHistoryUpgradeNotificationIntentOperation.class, str);
        bmxy.m108581a(startIntent);
        startIntent.putExtra("account", account);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, LocationHistoryUpgradeNotificationIntentOperation.class, startIntent, i, 268435456);
        bmxy.m108581a(pendingIntent);
        return pendingIntent;
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        Context applicationContext = getApplicationContext();
        bgau bgau = new bgau(applicationContext);
        if ("com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLICKED".equals(intent.getAction())) {
            z = true;
        } else if ("com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLEARED".equals(intent.getAction())) {
            z = false;
        } else {
            return;
        }
        Account account = (Account) intent.getParcelableExtra("account");
        if (account != null) {
            bgau.mo62571a(account);
            if (z) {
                aeqc.m52384a(applicationContext).mo24736c(account).mo50373a(new bgas(this, account, applicationContext));
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo70876a(Account account, Context context, ReportingState reportingState) {
        if (reportingState.f79600a) {
            if (Log.isLoggable("LHUpgradeNotification", 4)) {
                String valueOf = String.valueOf(account.name);
                Log.i("LHUpgradeNotification", valueOf.length() == 0 ? new String("Launching Location History settings for: ") : "Launching Location History settings for: ".concat(valueOf));
            }
            Intent putExtra = new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(getPackageName()).putExtra("extra.screenId", 227).putExtra("extra.accountName", account.name).putExtra("style", 1);
            putExtra.setFlags(268468224);
            try {
                context.startActivity(putExtra);
            } catch (ActivityNotFoundException e) {
                Log.wtf("LHUpgradeNotification", "Problem while starting Location History settings", e);
            }
        }
    }
}
