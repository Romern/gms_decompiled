package com.google.android.gms.icing;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Base64;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends Service {
    /* renamed from: a */
    public static byte[] m66664a(Intent intent) {
        return m66665a(intent, "icing-gcm-msg-base64");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        absg.m48186a("Received gcm intent: %s extras: %s", intent, intent == null ? "" : intent.getExtras());
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        if (intent.hasExtra("mdh-pn-base64")) {
            if (acbm.m48831a() && ((Boolean) acaw.f59256M.mo58455c()).booleanValue() && (stringExtra = intent.getStringExtra("mdh-pn-base64")) != null) {
                achs.f59871a.mo25409a("Received MDH notification", new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putString("notifications", stringExtra);
                aeat a = aeat.m51532a(rpr.m34216b());
                aebi aebi = new aebi();
                aebi.mo34004a(0L, 1L);
                aebi.f63099k = "mdh-pn";
                aebi.f63102n = true;
                aebi.f63097i = "com.google.android.gms.icing.mdh.service.MobileDataHubGcmTaskService";
                aebi.mo34023a(2);
                aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
                aebi.mo34026a(false);
                aebi.mo34027b(0);
                aebi.f63107s = bundle;
                a.mo33984a(aebi.mo33974b());
            }
        } else if (intent.hasExtra("icing-gcm-msg-base64") || (cenc.m137460e() && intent.hasExtra("icing-fpop-user-actions-base64"))) {
            intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
            startService(intent);
        }
        stopSelf(i2);
        return 2;
    }

    /* renamed from: a */
    public static byte[] m66665a(Intent intent, String str) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                absg.m48191b("Gcm message has no extras");
                return null;
            }
            String string = extras.getString(str);
            if (string != null) {
                try {
                    return Base64.decode(string, 0);
                } catch (IllegalArgumentException e) {
                    absg.m48192b("Gcm message payload decode failed: %s", e.getMessage());
                    return null;
                }
            } else {
                absg.m48192b("Gcm message payload missing %s key", str);
            }
        }
        return null;
    }
}
