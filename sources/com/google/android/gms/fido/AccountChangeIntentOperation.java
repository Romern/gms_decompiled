package com.google.android.gms.fido;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f31625a = new sek(new String[]{"AccountChangeIntentOperation"}, (short[]) null);

    public final void onHandleIntent(Intent intent) {
        f31625a.mo25414c("Received onHandleIntent() call: %s", intent);
        if (cdvq.f181813a.mo6606a().mo78376b() && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            new xby().mo29624a();
        }
    }
}
