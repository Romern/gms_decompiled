package com.google.android.gms.auth.account.p016be;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: com.google.android.gms.auth.account.be.AccountStatusChecker$InitializeIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountStatusChecker$InitializeIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String[] f9970a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    private gkj f9971b;

    /* renamed from: c */
    private adyd f9972c;

    /* renamed from: d */
    private goa f9973d;

    public final void onCreate() {
        gkj gkj = new gkj(this);
        adyd a = adyd.m51363a(this);
        this.f9971b = gkj;
        this.f9972c = a;
        this.f9973d = (goa) goa.f18759a.mo13145b();
    }

    public final void onHandleIntent(Intent intent) {
        for (String str : f9970a) {
            Account[] a = this.f9972c.mo33916a(str);
            for (Account account : a) {
                gkj.f18395a.mo25412b("Initialize check: %s", sek.m35081a(account));
                this.f9971b.mo11985a(this.f9973d, account);
            }
        }
    }
}
