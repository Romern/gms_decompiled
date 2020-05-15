package com.google.android.gms.trustlet.onbody.discovery;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnbodyScreenLockNotificationsManager$AccountChangedReceiver extends aacn {
    public OnbodyScreenLockNotificationsManager$AccountChangedReceiver() {
        super("trustlet_onbody");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        auve.f92589a.mo50711a("Accounts added.", new Object[0]);
        aupo.m77578a(context).edit().putLong("last_account_add_seconds", System.currentTimeMillis() / 1000).apply();
        auve.m77923a().mo50967b();
    }
}
