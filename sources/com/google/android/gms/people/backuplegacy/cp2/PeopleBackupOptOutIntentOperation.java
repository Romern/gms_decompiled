package com.google.android.gms.people.backuplegacy.cp2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleBackupOptOutIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        amig.m62939a();
        if (((Boolean) amgk.f74887a.mo41191a()).booleanValue()) {
            Context applicationContext = getApplicationContext();
            intent.getAction();
            String action = intent.getAction();
            if ("com.google.android.gms.backup.action.OPT_OUT".equals(action)) {
                String string = intent.getExtras().getString("com.google.android.gms.backup.extra.optOut.accountName");
                if (((Boolean) amhr.f74920a.mo41191a()).booleanValue() || ((Boolean) amhu.f74923a.mo41191a()).booleanValue()) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        if (!bmxx.m108577a(string)) {
                            alqx alqx = new alqx();
                            alqx.f74143c = System.currentTimeMillis();
                            alqx.f74141a = string;
                            alrf.m61546a().mo40670a(new alrd(alqn.m61522a(applicationContext), alqx, new alrc(applicationContext)));
                            return;
                        }
                        Log.w("BackupOptOutIntentOperation", "Backup account null or empty");
                    } catch (Exception e) {
                        almk a = almk.m61263a();
                        bxvd da = amku.f75091n.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amku amku = (amku) da.f164949b;
                        amku.f75093a |= 512;
                        amku.f75103k = true;
                        amku amku2 = (amku) da.mo74062i();
                        bxvd da2 = amkv.f75106m.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        amkv amkv = (amkv) da2.f164949b;
                        amku2.getClass();
                        amkv.f75119l = amku2;
                        amkv.f75108a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        a.mo40514a((amkv) da2.mo74062i());
                        ande.f76660a.mo41719a(applicationContext).mo41718a(e, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    }
                }
            } else {
                amdk.m62658a("BackupOptOutIntentOperation", "Received unexcepted message: %s", action);
            }
        }
    }
}
