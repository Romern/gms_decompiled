package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagChangedIntentOperation extends IntentOperation {

    /* renamed from: b */
    static final String f7798b = ssv.m36267a("com.google.android.gms.accountsettings");

    /* renamed from: c */
    private static final sek f7799c = ffw.m11631a("FlagChangedOp");

    /* renamed from: a */
    aeat f7800a;

    public FlagChangedIntentOperation() {
    }

    public final void onCreate() {
        this.f7800a = aeat.m51532a(getBaseContext());
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        if (intent != null && stu.m36327m() != aymd.BUILD_TYPE_ATV) {
            String action = intent.getAction();
            if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || f7798b.equals(action)) {
                z = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME").equals("com.google.android.gms.accountsettings");
            } else {
                z = "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action);
            }
            if (z) {
                ModuleInitializer.m4995b(this);
                if (spn.m35876d(this, "com.google.android.gms.accountsettings.service.PurgeScreenDataService") != 1) {
                    f7799c.mo25409a("Service isn't enabled - drop scheduling task", new Object[0]);
                    ModuleInitializer.m4994a(this);
                    return;
                }
                aeat aeat = this.f7800a;
                if (aeat != null) {
                    aeat.mo33984a(PurgeScreenDataChimeraService.m5000a());
                }
            }
        }
    }

    protected FlagChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
