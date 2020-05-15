package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RejectFillPromoOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f11661a = srn.m36127a(sgj.AUTOFILL);

    public final void onHandleIntent(Intent intent) {
        lho e = krc.m18382a(this).mo14830e();
        if (!kdi.f23885a.equals(e.mo15081a())) {
            ((bnsl) f11661a.mo68388c()).mo68405a("RejectFillPromoOperation called when already setup");
            return;
        }
        String stringExtra = intent.getStringExtra("fill_promo_rejected_domain_extra");
        if (stringExtra != null) {
            e.mo15108d(stringExtra);
        }
    }
}
