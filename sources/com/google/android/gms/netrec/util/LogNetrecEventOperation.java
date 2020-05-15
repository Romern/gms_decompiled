package com.google.android.gms.netrec.util;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LogNetrecEventOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        int i = eoa.f15378a;
        if (intent != null && "com.google.android.gms.netrec.util.LOG_NETREC_EVENT".equals(intent.getAction())) {
            int i2 = spn.f44932a;
            if (intent.hasExtra("netrecEvent")) {
                try {
                    bxvd da = boqx.f134343i.mo74144da();
                    da.mo73635b(intent.getByteArrayExtra("netrecEvent"), bxus.m123744c());
                    aknf.m60074a(da);
                } catch (bxwf e) {
                    eoa.m10824a("NetRec", "Failed to parse NetrecEvent.", e);
                }
            } else {
                eoa.m10828c("NetRec", "Intent does not contain netrecEvent extra.", new Object[0]);
            }
        }
    }
}
