package com.google.android.gms.ads.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeFlagChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f7937a = ssv.m36267a("com.google.android.gms.admob");

    /* renamed from: b */
    static final String f7938b = ssv.m36267a("com.google.android.gms");

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !f7937a.equals(action) && !f7938b.equals(action)) {
                return;
            }
            if ("com.google.android.gms.admob".equals(stringExtra) || "com.google.android.gms".equals(stringExtra)) {
                C0371o.m5339a(this);
                if (C0640e.m5680a()) {
                    C0633h.m5664a("Phenotype flags have changed.");
                }
                if (!((Boolean) C0371o.f8212Z.mo6604a()).booleanValue()) {
                    C0235d.m5106a(this);
                }
            }
        }
    }
}
