package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutofillFlagChangeIntentOperation extends IntentOperation {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[ADDED_TO_REGION] */
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        if (ccip.f179070a.mo6606a().mo76046i()) {
            AutofillModuleInitIntentOperation.m7150a();
            if (intent != null && (action = intent.getAction()) != null) {
                int hashCode = action.hashCode();
                if (hashCode != -544318258) {
                    if (hashCode == -335680806 && action.equals("com.google.android.gms.phenotype.com.google.android.gms.autofill.COMMITTED")) {
                        c = 0;
                        if (c != 0 || (c == 1 && "com.google.android.gms.autofill".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                            kyr.m18804a(krc.m18382a(this));
                        }
                        return;
                    }
                } else if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                    c = 1;
                    if (c != 0) {
                    }
                    kyr.m18804a(krc.m18382a(this));
                }
                c = 65535;
                if (c != 0) {
                }
                kyr.m18804a(krc.m18382a(this));
            }
        }
    }
}
