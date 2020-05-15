package com.google.android.gms.plus;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlusModuleInitIntentOperation extends qlf {
    /* renamed from: a */
    private static synchronized void m68286a(Context context) {
        synchronized (PlusModuleInitIntentOperation.class) {
            Account[] a = adyd.m51363a(context).mo33916a("com.google");
            for (Account account : a) {
                ContentResolver.setIsSyncable(account, "com.google.android.gms.plus.action", 1);
                ContentResolver.setSyncAutomatically(account, "com.google.android.gms.plus.action", true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if ((i & 4) + (i & 8) != 0) {
            m68286a(getApplicationContext());
        }
    }
}
