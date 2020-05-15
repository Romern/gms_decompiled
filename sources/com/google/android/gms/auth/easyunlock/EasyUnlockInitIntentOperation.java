package com.google.android.gms.auth.easyunlock;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import com.google.android.gms.auth.easyunlock.config.EasyUnlockSupportReporterIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EasyUnlockInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f10561a = new sek(new String[]{"EasyUnlockInitIntentOperation"}, (char[]) null);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (!getPackageManager().hasSystemFeature("org.chromium.arc")) {
            sek sek = f10561a;
            StringBuilder sb = new StringBuilder(53);
            sb.append("Initializing EasyUnlock, InitRuntimeState=");
            sb.append(i);
            sek.mo25412b(sb.toString(), new Object[0]);
            Context baseContext = getBaseContext();
            baseContext.startService(EasyUnlockSupportReporterIntentOperation.m6559a(baseContext));
            baseContext.startService(EasyUnlockChimeraService.m6556a(baseContext));
        }
    }
}
