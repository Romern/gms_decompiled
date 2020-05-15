package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmResponderIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11133a = jsy.m17256a("GcmResponderIntentOperation");

    /* renamed from: a */
    static Intent m6765a(Context context, String str, String str2) {
        Intent startIntent = IntentOperation.getStartIntent(context, GcmResponderIntentOperation.class, "com.google.android.gms.auth.proximity.RESPOND_GCM");
        startIntent.putExtra("accept_device_id", str);
        startIntent.putExtra("account_name", str2);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null && intent.getAction().equals("com.google.android.gms.auth.proximity.RESPOND_GCM")) {
            String stringExtra = intent.getStringExtra("accept_device_id");
            f11133a.mo25414c("Responding to accept initiation request from %s", stringExtra);
            byte[] b = jpt.m17081b(this);
            if (b == null) {
                f11133a.mo25418e("Couldn't get public key", new Object[0]);
                str = null;
            } else {
                str = jkr.m16853a(RemoteDevice.m6768a(b));
            }
            if (str != null) {
                String uuid = UUID.randomUUID().toString();
                String stringExtra2 = intent.getStringExtra("account_name");
                if (stringExtra2 == null) {
                    f11133a.mo25418e("Unable to get account associated with %s", stringExtra);
                    return;
                }
                rpr b2 = rpr.m34216b();
                String a = jkr.m16853a(stringExtra);
                Bundle a2 = jll.m16881a(b2, stringExtra2);
                if (a2 == null) {
                    jll.m16885a(stringExtra2, "re");
                } else {
                    a2.putString("mt", "re");
                    a2.putString("rDi", str);
                    a2.putString("aDi", a);
                    a2.putString("rpt", uuid);
                    a2.putString("ran", stringExtra2);
                    jll.m16884a(b2, "auth_proximity_bootstrap", stringExtra2, str, a2);
                }
                b2.startService(StartGcmSecureChannelIntentOperation.m6779a(b2, str, stringExtra, false, uuid, stringExtra2));
                return;
            }
            f11133a.mo25418e("Could not retrieve this device's short device ID", new Object[0]);
        }
    }
}
