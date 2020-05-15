package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicCheckChimeraReceiver extends asfd {

    /* renamed from: b */
    private static final sek f10570b = new sek(new String[]{"PeriodicCheckReceiver"}, (char[]) null);

    /* renamed from: a */
    public static Intent m6560a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.easyunlock.userpresence.PeriodicCheckReceiver");
    }

    public final void onReceive(Context context, Intent intent) {
        f10570b.mo25412b("Received intent: %s.", intent);
        asfd.m73947b(context, UserPresenceUpdateIntentOperation.m6562a(context, 4));
    }
}
