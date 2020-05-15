package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ForceSyncFirstAccountIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11130a = jsy.m17256a("ForceSyncFirstAccount");

    public ForceSyncFirstAccountIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6761a(Context context) {
        return IntentOperation.getStartIntent(context, ForceSyncFirstAccountIntentOperation.class, "com.google.android.gms.auth.proximity.FORCE_DEVICE_SYNC");
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.auth.proximity.FORCE_DEVICE_SYNC".equals(intent.getAction())) {
            List d = soz.m35801d(this, getPackageName());
            if (d == null || d.isEmpty()) {
                f11130a.mo25418e("No valid accounts could be fetched.", new Object[0]);
                return;
            }
            jpp.m17075a();
            jpq.m17076a(this, (Account) d.get(0));
        }
    }

    ForceSyncFirstAccountIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
