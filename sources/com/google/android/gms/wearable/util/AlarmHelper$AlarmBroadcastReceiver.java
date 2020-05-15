package com.google.android.gms.wearable.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AlarmHelper$AlarmBroadcastReceiver extends aacn {
    public AlarmHelper$AlarmBroadcastReceiver() {
        super("wearable");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (Log.isLoggable("AlarmHelper", 2)) {
            Log.v("AlarmHelper", String.valueOf(intent.getAction()).concat(" alarm has fired. Running action."));
        }
        mo60310a(intent);
    }

    /* renamed from: a */
    public abstract void mo60310a(Intent intent);
}
