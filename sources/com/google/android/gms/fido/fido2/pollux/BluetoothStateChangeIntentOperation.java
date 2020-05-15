package com.google.android.gms.fido.fido2.pollux;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothStateChangeIntentOperation extends IntentOperation {

    /* renamed from: b */
    private static final sek f31838b = new sek(new String[]{"BluetoothStateChangeIntentOperation"}, (short[]) null);

    /* renamed from: a */
    private final Context f31839a;

    public BluetoothStateChangeIntentOperation() {
        this.f31839a = this;
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (intExtra == 10 || intExtra == 12) {
            sek sek = f31838b;
            Object[] objArr = new Object[1];
            if (intExtra != 12) {
                str = "off";
            } else {
                str = "on";
            }
            objArr[0] = str;
            sek.mo25412b("Bluetooth state to '%s', starting service.", objArr);
            Context context = this.f31839a;
            context.startService(CableAuthenticatorChimeraService.m23548a(context));
        }
    }

    BluetoothStateChangeIntentOperation(Context context) {
        this.f31839a = context;
    }
}
