package com.google.android.gms.auth.account.visibility;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WhitelistApplicationForGoogleAccountsIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10037a = ght.m13171a("WhitelistApplicationForGoogleAccountsIntentOperation");

    /* renamed from: a */
    public static Intent m6315a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, WhitelistApplicationForGoogleAccountsIntentOperation.class, "com.google.android.gms.auth.account.visibility.WHITELIST_APPLICATION");
        startIntent.putExtra("calling_package", str);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        String string;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.auth.account.visibility.WHITELIST_APPLICATION".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras == null || (string = extras.getString("calling_package")) == null) {
                    f10037a.mo25416d("onHandleIntent called without package name in extras(%s)", extras);
                } else {
                    ((gsg) gsg.f18948d.mo13145b()).mo12165a(string);
                }
            } else {
                f10037a.mo25416d("onHandleIntent called with incorrect action(%s)", action);
            }
        } else {
            f10037a.mo25416d("onHandleIntent(intent=null)", new Object[0]);
        }
    }
}
