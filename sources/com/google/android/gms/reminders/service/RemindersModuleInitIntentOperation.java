package com.google.android.gms.reminders.service;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.reminders.notification.RefreshNotificationsIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemindersModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        boolean z;
        boolean z2 = (i & 12) != 0;
        StringBuilder sb = new StringBuilder(29);
        sb.append("Initializing, isUpdate: ");
        sb.append(z2);
        sb.toString();
        if (z2) {
            if (!"RemindersV4".equals(PreferenceManager.getDefaultSharedPreferences(this).getString("pref_sync_protocol_version", null))) {
                PreferenceManager.getDefaultSharedPreferences(this).edit().putString("pref_sync_protocol_version", "RemindersV4").apply();
                z = true;
            } else {
                z = false;
            }
            Account[] a = adyd.m51363a(this).mo33916a("com.google");
            for (Account account : a) {
                aosi a2 = aosf.m69444a(this, account);
                new Object[1][0] = account.name;
                if (a2 == null) {
                    aowu.m69736c("RemindersInitializer", "Account not found, skipping", new Object[0]);
                } else {
                    new Object[1][0] = Long.valueOf(a2.f83507a);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("initialize", true);
                    if (z) {
                        Cursor query = getContentResolver().query(aotd.f83574a, new String[]{"_count"}, "account_id=?", new String[]{String.valueOf(a2.f83507a)}, null);
                        if (query != null) {
                            try {
                                if (!query.moveToFirst()) {
                                    query.close();
                                } else if (query.getInt(0) > 0) {
                                    aosf.m69447a(this, a2);
                                    ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
                                }
                            } finally {
                                query.close();
                            }
                        }
                    }
                    bundle.putBoolean("reminders_skip_sync_on_initialization", true);
                    ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
                }
            }
        }
        startService(IntentOperation.getStartIntent(this, RefreshNotificationsIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_INITIALIZE"));
    }
}
