package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PhenotypeStickyAccount$AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && context != null && "android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && bdzv.m91648a(intent.getStringExtra("accountType"))) {
            String string = intent.getExtras().getString("authAccount");
            SharedPreferences sharedPreferences = context.getSharedPreferences("PhenotypeStickyAccount", 0);
            SharedPreferences.Editor editor = null;
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                if ((entry.getValue() instanceof String) && entry.getValue().equals(string)) {
                    if (editor == null) {
                        editor = sharedPreferences.edit();
                    }
                    editor.remove(entry.getKey());
                }
            }
            if (editor != null) {
                editor.apply();
            }
        }
    }
}
