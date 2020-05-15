package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FeedbackOperation extends IntentOperation {

    /* renamed from: a */
    public static final srn f11660a = srn.m36127a(sgj.AUTOFILL);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wwu.a(wvd, boolean):void
     arg types: [kyt, int]
     candidates:
      wwu.a(java.lang.String, java.lang.String):void
      wwu.a(wvd, boolean):void */
    public final void onHandleIntent(Intent intent) {
        wwr g = krc.m18382a(this).mo14832g();
        wwu wwu = new wwu();
        wwu.f51499d = "com.google.android.gms.autofill.USER_INITIATED_FEEDBACK_REPORT";
        wwu.mo29494a((wvd) new kyt(this), true);
        if (intent.getStringExtra("account_name_in_use") != null) {
            wwu.f51496a = intent.getStringExtra("account_name_in_use");
        }
        bqga.m112781a(lqv.m19545a(g.mo29487a(wwu.mo29490a())), new kys(), bqfb.INSTANCE);
    }
}
