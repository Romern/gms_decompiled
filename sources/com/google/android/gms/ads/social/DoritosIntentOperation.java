package com.google.android.gms.ads.social;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DoritosIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
            String valueOf = String.valueOf(action);
            C0633h.m5670c(valueOf.length() == 0 ? new String("Accounts have changed: ") : "Accounts have changed: ".concat(valueOf));
            C0903d a = C0903d.m6097a(rpr.m34216b());
            if (!cbsy.f178239a.mo6606a().mo75344d()) {
                a.mo7130d();
            } else if (C0900a.m6091a(a.f9472a).mo7124a(C0904e.m6102a(a.f9472a).mo7132a())) {
                a.mo7130d();
            }
        }
    }
}
