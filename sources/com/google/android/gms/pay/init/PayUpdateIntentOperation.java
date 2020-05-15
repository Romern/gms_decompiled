package com.google.android.gms.pay.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PayUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f81673a = srn.m36127a(sgj.PAY);

    /* renamed from: a */
    private final void m67780a() {
        new alhw(this).mo40355a();
    }

    public final void onHandleIntent(Intent intent) {
        if (cftz.f185710a.mo6606a().mo82723a()) {
            String action = intent.getAction();
            if ("com.google.android.gms.phenotype.COMMITTED".equals(action)) {
                if ("com.google.android.gms.pay".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                    m67780a();
                } else {
                    return;
                }
            }
            if ("com.google.android.gms.phenotype.com.google.android.gms.pay.COMMITTED".equals(action) || "com.google.android.gms.tapandpay.ACCOUNT_SELECTED".equals(action)) {
                m67780a();
            }
            bnsl bnsl = (bnsl) f81673a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.pay.init.PayUpdateIntentOperation", "onHandleIntent", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Dropping unexpected action: %s", action);
        }
    }
}
