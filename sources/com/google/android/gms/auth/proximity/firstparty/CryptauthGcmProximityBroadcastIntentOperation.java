package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CryptauthGcmProximityBroadcastIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11155a = jsy.m17256a("CryptauthGcmProximityBroadcastIntentOperation");

    /* renamed from: b */
    private final jpd f11156b;

    public CryptauthGcmProximityBroadcastIntentOperation() {
        this.f11156b = new jpd();
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.authzen.GCM_DEVICE_PROXIMITY".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (!soz.m35791a(this, account)) {
                f11155a.mo25418e("Invalid account: %s", stringExtra);
                return;
            }
            this.f11156b.mo13970a(this, account, intent.getStringExtra("bluetooth_mac_address"));
        }
    }

    CryptauthGcmProximityBroadcastIntentOperation(Context context, jpd jpd) {
        attachBaseContext(context);
        this.f11156b = jpd;
    }
}
