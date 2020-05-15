package com.google.android.gms.autofill.p031ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: com.google.android.gms.autofill.ui.AutofillChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutofillChimeraActivity extends lir {

    /* renamed from: b */
    public static final srn f11682b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: c */
    static final liq f11683c = new lip();

    /* renamed from: e */
    private final liq f11684e;

    public AutofillChimeraActivity() {
        this.f11684e = f11683c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final lim mo7996a(Intent intent, Bundle bundle) {
        String action = intent.getAction();
        if (action != null) {
            return this.f11684e.mo15177a(this, action, bundle);
        }
        bnsl bnsl = (bnsl) f11682b.mo68388c();
        bnsl.mo68432a("com.google.android.gms.autofill.ui.AutofillChimeraActivity", "a", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Controller name is missing");
        return null;
    }

    AutofillChimeraActivity(liq liq) {
        this.f11684e = liq;
    }
}
