package com.google.android.gms.auth.api.credentials.manager.providers.chromesync;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChromeSyncIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10142a = ght.m13172b("ChromeSyncIntentOperation");

    public final void onHandleIntent(Intent intent) {
        hmc a = hmc.m14599a(this);
        try {
            bnre i = heb.m14256a().listIterator();
            while (i.hasNext()) {
                try {
                    a.mo12612a((acyr) i.next()).get();
                } catch (InterruptedException | ExecutionException e) {
                    f10142a.mo25417e("Failed to initialize sync.", e, new Object[0]);
                }
            }
        } catch (adbe e2) {
            f10142a.mo25417e("Failed to get the accounts.", e2, new Object[0]);
        }
    }
}
