package com.google.android.gms.mdm.receivers;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleAccountsAddedChimeraReceiver extends AccountsChangedChimeraReceiver {

    /* renamed from: a */
    private static boolean f80050a;

    /* renamed from: a */
    public static synchronized boolean m67196a() {
        boolean z;
        synchronized (GoogleAccountsAddedChimeraReceiver.class) {
            z = f80050a;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m67197b() {
        synchronized (GoogleAccountsAddedChimeraReceiver.class) {
            f80050a = true;
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (m67196a() && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = eoa.f15378a;
            afzn.m53752a();
            afzd.f64994h.mo10352a((Object) 1);
            afzf.m53700a(this, currentTimeMillis + 60000);
        }
    }
}
