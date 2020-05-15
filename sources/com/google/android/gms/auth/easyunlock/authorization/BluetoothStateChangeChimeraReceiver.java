package com.google.android.gms.auth.easyunlock.authorization;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothStateChangeChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final sek f10562b = new sek(new String[]{"BluetoothStateChangeReceiver"}, (char[]) null);

    public final void onReceive(Context context, Intent intent) {
        f10562b.mo25412b("Received Bluetooth event: %s.", intent);
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 12 || intExtra == 10) {
                context.startService(EasyUnlockChimeraService.m6556a(context));
            }
        }
    }
}
