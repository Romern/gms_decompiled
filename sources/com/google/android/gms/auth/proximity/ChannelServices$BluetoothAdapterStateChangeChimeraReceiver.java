package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelServices$BluetoothAdapterStateChangeChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private final jnj f11122b;

    public ChannelServices$BluetoothAdapterStateChangeChimeraReceiver() {
        this.f11122b = jnj.m16961a();
    }

    public final void onReceive(Context context, Intent intent) {
        jkf.f22700a.mo25412b("Received Bluetooth event: %s.", intent);
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 12) {
                jkf.f22700a.mo25412b("Bluetooth turned on, updating services...", new Object[0]);
                jkf.m16838a(context, this.f11122b);
            } else if (intExtra == 10) {
                jkf.f22700a.mo25412b("Stopping all services...", new Object[0]);
                context.stopService(BlePeripheralChimeraService.m6753a(context));
                context.stopService(BleCentralChimeraService.m6742a(context));
            }
        }
    }

    ChannelServices$BluetoothAdapterStateChangeChimeraReceiver(jnj jnj) {
        this.f11122b = jnj;
    }
}
