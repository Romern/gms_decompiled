package com.google.android.gms.chromesync.operation;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SaveTrustedVaultIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f30014a = new sek("SaveTrustedVault", new String[0]);

    /* renamed from: a */
    public static Intent m22430a(Context context, acyr acyr) {
        Intent startIntent = IntentOperation.getStartIntent(context, SaveTrustedVaultIntentOperation.class, "com.google.android.gms.chromesync.SAVE_TRUSTED_VAULT");
        if (startIntent != null) {
            startIntent.putExtra("ACCOUNT", acyr.mo33252a());
            return startIntent;
        }
        throw new qrp(1025);
    }

    public final void onHandleIntent(Intent intent) {
        f30014a.mo25414c("Handling the intent: %s.", intent);
        try {
            Account account = (Account) intent.getParcelableExtra("ACCOUNT");
            if (account != null) {
                acyr a = acyr.m50017a(getApplicationContext(), account);
                qvp qvp = (qvp) qvp.f42250b.mo13145b();
                sdo.m34959a(a);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (qvp.f42257i) {
                    qvp.mo24292a(a);
                    bmxv c = qvp.f42254f.mo24290c(a);
                    if (c.mo66813a()) {
                        bsty bsty = (bsty) c.mo66814b();
                        qrj a2 = qrk.m32721a(2);
                        bmxv a3 = qvp.mo24291a(a2, a);
                        List<qtq> a4 = qvp.f42253e.mo24272a(a, 2);
                        ArrayList arrayList = new ArrayList(a4.size());
                        for (qtq qtq : a4) {
                            try {
                                qtp a5 = a2.mo24229a(qtq, a2.mo24227a(qtq, a3), a3);
                                a5.f42109d = true;
                                arrayList.add(a5.mo24267a());
                            } catch (qrl | qrp e) {
                            }
                        }
                        qvp.f42253e.mo24275a(a, arrayList);
                        qwa qwa = qvp.f42256h;
                        qwb qwb = new qwb();
                        qwb.f42296a = a;
                        qwb.f42297b = ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
                        qwa.mo24303a(qwb.mo24305a());
                    }
                }
                qvp.f42249a.mo25412b("resaveAll() [Latency: %dms]", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                return;
            }
            throw new qrp(1025);
        } catch (gid | qrp e2) {
            f30014a.mo25418e("Error handling the intent: %s.", intent, e2);
        }
    }
}
