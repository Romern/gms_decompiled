package com.google.android.gms.reminders.sync;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.chimera.WakefulBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {

    /* renamed from: b */
    static boolean f107221b = false;

    public final void onReceive(Context context, Intent intent) {
        blre blre;
        if (!cgid.m145535b()) {
            aowu.m69733a("Reminders_GcmBroadcastReceiver", "New tickle sync is not enabled.", new Object[0]);
            if (!f107221b) {
                aowu.m69735b("Reminders_GcmBroadcastReceiver", "Re-subscribe to gsync feed.", new Object[0]);
                for (Account account : soz.m35801d(context, context.getPackageName())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("resub", true);
                    ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
                }
                f107221b = true;
                return;
            }
            return;
        }
        f107221b = false;
        if (intent == null) {
            aowu.m69733a("Reminders_GcmBroadcastReceiver", "Received intent message is null.", new Object[0]);
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            aowu.m69733a("Reminders_GcmBroadcastReceiver", "Received message with no bundle.", new Object[0]);
            return;
        }
        String string = extras.getString("rcp");
        if (!bmxx.m108577a(string)) {
            try {
                blre = (blre) GeneratedMessageLite.m124016a(blre.f127439b, Base64.decode(string, 1), bxus.m123744c());
            } catch (bxwf | IllegalArgumentException e) {
                aowu.m69733a("Reminders_GcmBroadcastReceiver", "Failed to parse RemindersChimePayload. %s", e);
                blre = null;
            }
            if (blre != null) {
                String str = blre.f127441a;
                if (bmxx.m108577a(str)) {
                    aowu.m69733a("Reminders_GcmBroadcastReceiver", "Obfuscated Gaia Id is empty.", new Object[0]);
                } else {
                    new aowe(context, str).start();
                }
            } else {
                aowu.m69733a("Reminders_GcmBroadcastReceiver", "Cannot decode RemindersChimePayload.", new Object[0]);
            }
        } else {
            aowu.m69733a("Reminders_GcmBroadcastReceiver", "Chime payload is empty.", new Object[0]);
        }
    }
}
