package com.google.android.gms.auth.folsom.operation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GserviceChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f10910a = ssv.m36267a("com.google.android.gms.auth.folsom");

    /* renamed from: b */
    private static final sek f10911b = jdh.m16547a("GserviceChangeIntentOperation");

    public GserviceChangeIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ccfy.f178890a.mo6606a().mo75902q() || (!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !f10910a.equals(intent.getAction()))) {
            if (!"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action)) {
                f10911b.mo25412b("Unexpected action, ignoring: %s", action);
            } else if (!jde.f22216b) {
                f10911b.mo25414c("Build is lower than P. No need to handle [%s]", "com.google.gservices.intent.action.GSERVICES_CHANGED");
            } else if (ccfv.m129485b()) {
                f10911b.mo25409a("Initializing auth_folsom due to gservice change", new Object[0]);
                jar.m16428a(this, 2);
            } else {
                f10911b.mo25409a("Disabling auth_folsom due to gservice change", new Object[0]);
                jar.m16431b(this);
            }
        } else if ("com.google.android.gms.auth.folsom".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            f10911b.mo25412b("Detected Phenotype flag update for auth_folsom", new Object[0]);
            if (jde.f22216b && ccgb.m129583b()) {
                ((jcj) jcj.f22155a.mo13145b()).mo13580b();
            }
        }
    }

    public GserviceChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
