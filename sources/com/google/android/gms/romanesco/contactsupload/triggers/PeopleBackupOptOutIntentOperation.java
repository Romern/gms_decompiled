package com.google.android.gms.romanesco.contactsupload.triggers;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleBackupOptOutIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final aoyh f107228a = aoyh.m69805a("BackupOptOutIntent");

    /* renamed from: b */
    private final long f107229b = System.currentTimeMillis();

    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        new Object[1][0] = intent.getAction();
        String action = intent.getAction();
        if ("com.google.android.gms.backup.action.OPT_OUT".equals(action)) {
            String string = intent.getExtras().getString("com.google.android.gms.backup.extra.optOut.accountName");
            if (cgij.m145544b() || cgij.m145545c()) {
                int i = Build.VERSION.SDK_INT;
                try {
                    if (!bmxx.m108577a(string)) {
                        apal apal = new apal();
                        apal.f84032c = this.f107229b;
                        apal.f84030a = string;
                        apbd.m69986a().mo47075a(new apbb(applicationContext, apal));
                    } else if (!cgjy.m145760g()) {
                        f107228a.mo46984c("BackupOptOutIntent", "Backup account null or empty");
                    } else {
                        f107228a.mo46983c("Backup account null or empty");
                    }
                } catch (Exception e) {
                    aoyj a = aoyj.m69819a();
                    bxvd da = bzdx.f169595q.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bzdx) da.f164949b).f169606j = true;
                    bzdx bzdx = (bzdx) da.mo74062i();
                    bxvd da2 = bzel.f169667p.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzdx.getClass();
                    ((bzel) da2.f164949b).f169675g = bzdx;
                    a.mo46992a(da2);
                    aoyp.m69851a(applicationContext).mo47009a(e, cgjy.m145765l());
                }
            }
        } else {
            f107228a.mo46982b("Received unexcepted message: %s", action);
        }
    }
}
