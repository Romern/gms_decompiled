package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceSyncV2SyncFinishedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11167a = jsy.m17256a("DeviceSyncV2FeatureIntentOperation");

    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FINISHED".equals(intent.getAction())) {
            return;
        }
        if (!cchu.m129750f()) {
            f11167a.mo25416d("Received v2 sync finished broadcast but v2 registration is turned off!", new Object[0]);
            return;
        }
        String stringExtra = intent.getStringExtra("account_name");
        Account account = new Account(stringExtra, "com.google");
        if (!soz.m35791a(this, account)) {
            f11167a.mo25416d("Invalid account: %s", stringExtra);
        } else if (cchu.m129747c()) {
            jop.m17032a();
            joq.m17033a(this, account);
        } else {
            try {
                jom.m17029a(this).mo13946b(account, 4);
            } catch (jon e) {
                f11167a.mo25416d("Failed to sync v1 devices.", new Object[0]);
                CryptauthDeviceSyncGcmTaskService.m6785a(getApplicationContext(), account);
                jop.m17032a();
                joq.m17033a(this, account);
            }
        }
    }
}
