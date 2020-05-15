package com.google.android.gms.wallet.intentoperation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.service.WalletGcmTaskChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f110261a = ssv.m36267a("com.google.android.gms.wallet");

    public FlagsChangedIntentOperation() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r1 != false) goto L_0x0046;
     */
    public final void onHandleIntent(Intent intent) {
        boolean z = false;
        if (intent != null && (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || f110261a.equals(intent.getAction())) && intent.hasExtra("com.google.android.gms.phenotype.PACKAGE_NAME") && intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME").equals("com.google.android.gms.wallet"))) {
            z = true;
        }
        if (!"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            if (!z) {
                return;
            }
        }
        bdxy.m91563a(getApplicationContext().getContentResolver(), anef.m64088a("com.google.android.gms.wallet")).mo58435b();
        WalletGcmTaskChimeraService.m94097a(this);
    }

    public FlagsChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
