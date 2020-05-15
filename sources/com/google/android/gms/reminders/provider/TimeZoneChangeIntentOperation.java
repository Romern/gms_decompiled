package com.google.android.gms.reminders.provider;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeZoneChangeIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            Context applicationContext = getApplicationContext();
            String string = aowx.m69749a(applicationContext).getString("last_timezone_id", null);
            String id = TimeZone.getDefault().getID();
            if (!sdg.m34949a(string, id)) {
                aowx.m69749a(applicationContext).edit().putString("last_timezone_id", id).apply();
            } else if (!((Boolean) aoss.f83565x.mo58455c()).booleanValue()) {
                return;
            }
            getContentResolver().update(aotd.f83576c, null, null, null);
        }
    }
}
