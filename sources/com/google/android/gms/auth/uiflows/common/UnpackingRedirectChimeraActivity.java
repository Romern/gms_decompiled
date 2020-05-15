package com.google.android.gms.auth.uiflows.common;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UnpackingRedirectChimeraActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("target");
        if (pendingIntent != null) {
            Intent intent = new Intent();
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("response");
            if (accountAuthenticatorResponse != null) {
                intent.putExtra("response", accountAuthenticatorResponse);
            }
            String a = spn.m35852a((Activity) this);
            if (a != null) {
                intent.putExtra("caller", a);
            }
            bizc.m103024a(getIntent(), intent);
            try {
                startIntentSender(pendingIntent.getIntentSender(), intent, 33554432, 33554432, 0);
                finish();
                return;
            } catch (IntentSender.SendIntentException e) {
                Log.e("UnpackingRedirectAct", "Unable to start unpacked pending intent!", e);
            }
        }
        setResult(0);
        finish();
    }
}
