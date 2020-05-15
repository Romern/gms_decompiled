package com.google.android.location.reporting.service;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportingSyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f150887a = new Object();

    /* renamed from: b */
    private static bgxl f150888b = null;

    /* renamed from: a */
    public static void m117309a(Account account, Context context) {
        new rtg(context);
        ContentResolver.setIsSyncable(account, "com.google.android.location.reporting", 1);
        rtg.m34394a(account, "com.google.android.location.reporting");
    }

    public final IBinder onBind(Intent intent) {
        return f150888b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f150887a) {
            if (f150888b == null) {
                bgzo.m100459a(this);
                f150888b = new bgxl(getApplicationContext());
            }
        }
    }

    /* renamed from: a */
    public static void m117310a(Account account, String str, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ignore_settings", true);
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("force", true);
        String a = aeqm.m52397a(account);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 32 + String.valueOf(str).length());
        sb.append("Requesting immediate sync for ");
        sb.append(a);
        sb.append(": ");
        sb.append(str);
        sb.toString();
        new rtg(context);
        ContentResolver.requestSync(account, "com.google.android.location.reporting", bundle);
    }
}
