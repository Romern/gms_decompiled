package com.google.android.gms.tapandpay.admin;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RedirectToSettingIntentOperation extends asjx {
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        Intent intent2 = new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY");
        if (atxn.m76506a(this, intent2)) {
            intent2.setFlags(268435456);
        } else {
            intent2 = new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity").setFlags(268435456);
        }
        startActivity(intent2.setFlags(268468224));
    }
}
