package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickIntentHandler$TriggerRegistrationIntentOperation extends IntentOperation {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afiw.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      afiw.a(java.lang.String, android.content.Context):void
      afiw.a(android.content.Context, boolean):void */
    public final void onHandleIntent(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        if (TextUtils.equals("com.google.gservices.intent.action.GSERVICES_CHANGED", intent.getAction())) {
            afiw.m53138a("TriggerRegistration", getBaseContext());
            afiw.m53135a(getBaseContext(), cfeo.f183719a.mo6606a().mo80991ay(), 4);
            azcd.m85252a(getBaseContext()).mo54602a();
            afiw.m53142e(getBaseContext());
            afiw.m53143f(getBaseContext());
            afiw.m53137a(getBaseContext(), false);
        } else if (TextUtils.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", intent.getAction())) {
            SilentRegisterIntentOperation.m94594b(new Intent("com.google.android.gms.matchstick.register_intent_google_account_change"), getBaseContext());
        }
    }
}
