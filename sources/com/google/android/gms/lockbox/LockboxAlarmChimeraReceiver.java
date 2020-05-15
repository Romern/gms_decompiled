package com.google.android.gms.lockbox;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxAlarmChimeraReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static Intent m67120a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.lockbox.LockboxAlarmReceiver");
    }

    public final void onReceive(Context context, Intent intent) {
        context.startService(new Intent().setClassName(context, "com.google.android.gms.lockbox.LockboxService"));
    }
}
