package com.google.android.gms.icing.proxy;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppsMonitorIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        try {
            aclp a = aclp.m49388a(this);
            if (a != null) {
                if (!(intent == null || intent.getAction() == null)) {
                    acoe.m49588a().mo32944a(acoe.m49589a("AppsCorpusProcessChangeRunnable", new acln(a, intent)));
                }
            }
        } catch (Exception e) {
            acnv.m49544a(e, "Failed to handle package changes", new Object[0]);
        }
        Intent b = UpdateIcingCorporaIntentOperation.m66730b(this);
        if (b != null) {
            startService(b);
        }
    }
}
