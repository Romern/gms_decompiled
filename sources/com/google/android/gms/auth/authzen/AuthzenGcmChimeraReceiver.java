package com.google.android.gms.auth.authzen;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthzenGcmChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    public static final sek f10372b = new sek("GcmReceiver");

    public final void onReceive(Context context, Intent intent) {
        sek sek = f10372b;
        String valueOf = String.valueOf(intent.getAction());
        sek.mo25409a(valueOf.length() == 0 ? new String("Received broadcast action: ") : "Received broadcast action: ".concat(valueOf), new Object[0]);
        intent.setClassName(context, "com.google.android.gms.auth.authzen.GcmReceiverService");
        context.startService(intent);
    }
}
