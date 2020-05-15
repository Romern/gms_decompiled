package com.google.android.gms.netrec.scoring.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.netrec.module.NetRecChimeraGcmTaskService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BootCompletedOrAppUpdatedIntentOperation extends IntentOperation {
    public BootCompletedOrAppUpdatedIntentOperation() {
        this(new akjz());
    }

    /* renamed from: a */
    public static void m67656a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, BootCompletedOrAppUpdatedIntentOperation.class, str);
        if (startIntent != null) {
            context.startService(startIntent);
            return;
        }
        eoa.m10828c("NetRec", "Could not resolve intent operation %s for action %s", BootCompletedOrAppUpdatedIntentOperation.class, str);
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        int i = eoa.f15378a;
        int i2 = spn.f44932a;
        if ("com.google.android.gms.netrec.scoring.receiver.BOOT_COMPLETED".equals(intent.getAction())) {
            eoa.m10826b("NetRec", "onBootCompleted()", new Object[0]);
            if (!soz.m35811h(this)) {
                eoa.m10826b("NetRec", "Early exit from onBootCompleted(), not the primary user.", new Object[0]);
                return;
            }
            akka.f72127b.mo10352a((Object) 0L);
            akmd.f72242a.f72241b.mo10354a().edit().clear().commit();
            eoa.m10826b("NetRec", "Scheduling CleanupDatabaseTask", new Object[0]);
            Bundle bundle = new Bundle();
            NetRecChimeraGcmTaskService.m67643b("CleanupDatabaseTask", bundle);
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.netrec.module.NetRecGcmTaskService";
            aebl.f63107s = bundle;
            aebl.f63099k = "CleanupDatabaseTask";
            aebl.f63070a = cfpd.f185332a.mo6606a().mo82420D();
            aebl.f63071b = cfpd.f185332a.mo6606a().mo82419C();
            aebl.mo34024a(0, cdny.m134339d() ? 1 : 0);
            aebl.mo34023a(2);
            aebl.f63102n = true;
            aebl.mo34027b(1);
            NetRecChimeraGcmTaskService.m67642a(aeat.m51532a(this), aebl.mo33974b());
            akjz.m59905a(this);
        } else if ("com.google.android.gms.netrec.scoring.receiver.APP_UPDATED".equals(intent.getAction())) {
            akjz.m59906b(this);
        } else {
            eoa.m10828c("NetRec", "Received unhandled intent: %s", intent.getAction());
        }
    }

    public BootCompletedOrAppUpdatedIntentOperation(akjz akjz) {
    }
}
