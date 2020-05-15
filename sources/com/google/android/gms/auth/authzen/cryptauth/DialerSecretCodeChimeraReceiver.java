package com.google.android.gms.auth.authzen.cryptauth;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DialerSecretCodeChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    public static final sek f10407b = new sek("CryptauthDialerCodeReceiver");

    public final void onReceive(Context context, Intent intent) {
        f10407b.mo25414c("Secret code activated, intent=%s", intent);
        context.sendBroadcast(new Intent().setClassName(context, "com.google.android.gms.auth.authzen.AuthzenGcmReceiver").setAction("com.google.android.gms.auth.authzen.REGISTER_NOW"));
        Toast.makeText(context, "Forcing CryptAuth enrollment", 0).show();
    }
}
