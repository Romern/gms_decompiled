package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentInitIntentOperation extends IntentOperation {
    static {
        zvt.m46581a();
        yyn yyn = new yyn();
        yyn.f54826b = bzzn.f172101an;
        new yqe("com.google.android.gms", yyn.mo30864a(), 1);
    }

    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        yzs a = yzq.m45107a(applicationContext);
        for (String str : zmc.m45739a(applicationContext)) {
            if (zmc.m45740a(a.mo30877c(str), a.mo30880e(str))) {
                zvm.m46571a(applicationContext, str);
            }
        }
        sre.m36089i(applicationContext);
    }
}
