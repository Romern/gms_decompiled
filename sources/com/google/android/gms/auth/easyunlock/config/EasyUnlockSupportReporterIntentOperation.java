package com.google.android.gms.auth.easyunlock.config;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EasyUnlockSupportReporterIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10568a = new sek(new String[]{"EasyUnlockSupportReporterIntentOperation"}, (char[]) null);

    public EasyUnlockSupportReporterIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6559a(Context context) {
        return IntentOperation.getStartIntent(context, EasyUnlockSupportReporterIntentOperation.class, "com.google.android.gms.auth.easyunlock.UPDATE_FEATURE_SUPPORT");
    }

    public final void onHandleIntent(Intent intent) {
        if (ccfm.f178870a.mo6606a().mo75863e()) {
            ivi a = ivh.m16212a();
            boolean z = true;
            try {
                Account[] d = gie.m13199d(this, "com.google");
                if (d == null || (r3 = d.length) == 0) {
                    f10568a.mo25418e("Invalid account list.", new Object[0]);
                    a.mo13370a(2);
                    return;
                }
                jpc a2 = jpy.m17097a(this);
                if (!ccfm.m129455c() || !ivg.m16208a(this)) {
                    z = false;
                }
                ArrayList arrayList = new ArrayList();
                for (Account account : d) {
                    arrayList.add(a2.mo13968a(bsni.EASY_UNLOCK_HOST, z, account));
                }
                try {
                    aucu.m76783a(aucu.m76779a((Collection) arrayList), ccfs.f178881a.mo6606a().mo75871d(), TimeUnit.SECONDS);
                    a.mo13370a(0);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    f10568a.mo25416d("Failed to report feature support.", new Object[0]);
                    a.mo13370a(3);
                }
            } catch (RemoteException | rfv | rfw e2) {
                f10568a.mo25418e("Failed to fetch account list.", new Object[0]);
                a.mo13370a(1);
            }
        }
    }

    EasyUnlockSupportReporterIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
