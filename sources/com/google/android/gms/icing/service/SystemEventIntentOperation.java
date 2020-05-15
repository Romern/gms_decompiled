package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemEventIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final String f79093a = ssv.m36267a("com.google.android.gms.icing");

    /* renamed from: b */
    public static final String f79094b = ssv.m36267a("com.google.android.gms.icing.mdh");

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        if (new java.util.Random().nextInt(r5) == 0) goto L_0x00c2;
     */
    /* renamed from: a */
    public static void m66745a(Context context, Intent intent) {
        absg.m48202d("SystemEventIntentOperation.run: Got intent %s", intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                absg.m48203d("SystemEventIntentOperation.run Intent extra %s: %s", str, extras.get(str));
            }
        }
        String action = intent.getAction();
        boolean equals = "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action);
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || f79093a.equals(action) || f79094b.equals(action)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (stringExtra == null) {
                return;
            }
            if ("com.google.android.gms.icing".equals(stringExtra)) {
                equals = true;
            } else if ("com.google.android.gms.icing.mdh".equals(stringExtra)) {
                equals = true;
            } else {
                return;
            }
        }
        intent.setClassName(context, "com.google.android.gms.icing.service.IndexWorkerService");
        context.startService(intent);
        if (!acbm.m48831a()) {
            if (!equals) {
                return;
            }
        } else if (equals) {
            achs.f59871a.mo25409a("Received flags update request", new Object[0]);
            if (((Boolean) acaw.f59253J.mo58455c()).booleanValue()) {
                int intValue = ((Integer) abzv.f59009C.mo58455c()).intValue();
                if (intValue <= 0) {
                    if (intValue < 0) {
                        achs.f59871a.mo25418e("Invalid sampling interval: %d", Integer.valueOf(intValue));
                    }
                }
            }
            acbp.m48832a();
        } else {
            return;
        }
        int b = (int) ceoq.f183156a.mo6606a().mo79496b();
        if (b > 0) {
            acbq.f59447a.execute(new acbo(b));
        }
    }

    public final void onHandleIntent(Intent intent) {
        m66745a(this, intent);
    }
}
