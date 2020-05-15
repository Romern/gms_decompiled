package com.google.android.gms.auth.account.p016be.accountstate;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedWakefulChimeraBroadcastReceiver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoginAccountsChangedWakefulChimeraBroadcastReceiver extends asfd {

    /* renamed from: b */
    private static final sek f10000b = ght.m13171a("LoginAccountsChanged");

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        f10000b.mo25409a("Received broadcast intent with action: %s", action);
        asfd.m73947b(context, new Intent().setClassName(context, "com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedIntentService").setAction(action));
    }
}
