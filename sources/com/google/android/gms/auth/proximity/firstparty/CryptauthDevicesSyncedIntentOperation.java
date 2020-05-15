package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CryptauthDevicesSyncedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11154a = jsy.m17256a("CryptauthDevicesSyncedIntentOperation");

    public CryptauthDevicesSyncedIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED".equals(intent.getAction())) {
            String substring = intent.getStringExtra("permit_id").substring(34);
            Account account = null;
            for (Account account2 : soz.m35801d(this, getPackageName())) {
                if (imv.m15741a(account2.name).equals(substring)) {
                    account = account2;
                }
            }
            if (account == null) {
                f11154a.mo25418e("Invalid account: %s", substring);
            }
            if (cchr.m129715c()) {
                CryptauthDeviceSyncGcmTaskService.m6784a(getApplicationContext());
                int intExtra = intent.getIntExtra("invocation_reason", 0);
                if (!cchr.f178999a.mo6606a().mo75971c() || intExtra != 4) {
                    try {
                        jom.m17029a(this).mo13945a(account, intExtra);
                        return;
                    } catch (jon e) {
                        f11154a.mo25418e("Failed to sync devices.", new Object[0]);
                        if (account != null) {
                            CryptauthDeviceSyncGcmTaskService.m6785a(getApplicationContext(), account);
                            return;
                        }
                        return;
                    }
                }
            }
            jop.m17032a();
            joq.m17033a(this, account);
        }
    }

    CryptauthDevicesSyncedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
