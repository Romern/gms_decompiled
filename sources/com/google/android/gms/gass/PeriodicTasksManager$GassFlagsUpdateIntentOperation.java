package com.google.android.gms.gass;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicTasksManager$GassFlagsUpdateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            if (!aahe.f28114d.equals(Long.valueOf(ceax.m135879c())) || aahe.f28115e != ceax.m135880d() || !aahe.f28116f.equals(Long.valueOf(ceax.m135878b()))) {
                aahe.m21252a(getBaseContext());
            }
            if (!aahe.f28117g.equals(Long.valueOf(cebd.m135900d())) || aahe.f28118h != cebd.m135902f() || !aahe.f28119i.equals(Long.valueOf(cebd.m135898b()))) {
                aahe.m21254b(getBaseContext());
            }
            if (!aahe.f28120j.equals(Long.valueOf(cebg.m135925d())) || aahe.f28121k != cebg.m135926e() || !aahe.f28123m.equals(Long.valueOf(cebg.m135924c())) || aahe.f28122l != cebg.m135927f()) {
                aahe.m21255c(getBaseContext());
            }
        }
    }
}
