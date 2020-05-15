package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FolsomModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f10909a = jdh.m16547a("RecoverableKeyStoreGmsModuleInitIntentOperation");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        f10909a.mo25412b("onInitRuntimeState. intent: %s, flags: %s", intent, Integer.valueOf(i));
        if (!jde.f22216b) {
            f10909a.mo25414c("Build is lower than P. No need to handle InitIntentOperation for the RecoverableKeyStoreGms module", new Object[0]);
        } else if (ccfv.m129485b()) {
            jar.m16428a(getApplicationContext(), 4);
        } else {
            jar.m16431b(this);
        }
    }
}
