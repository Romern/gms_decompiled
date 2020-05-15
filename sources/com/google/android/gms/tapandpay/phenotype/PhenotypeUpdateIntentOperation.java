package com.google.android.gms.tapandpay.phenotype;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeUpdateIntentOperation extends asjx {
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        bdxy a;
        String action = intent.getAction();
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action)) {
            if (!"com.google.android.gms.tapandpay".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                return;
            }
        } else if (!"com.google.android.gms.phenotype.com.google.android.gms.tapandpay.COMMITTED".equals(action)) {
            return;
        }
        if (cgvo.f187824a.mo6606a().mo84547a() && (a = bdxy.m91563a(getContentResolver(), anef.m64088a("com.google.android.gms.tapandpay"))) != null) {
            a.mo58435b();
        }
        asql.m74466a(this);
    }
}
