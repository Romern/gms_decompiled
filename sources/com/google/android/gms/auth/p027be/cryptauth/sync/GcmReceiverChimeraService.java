package com.google.android.gms.auth.p027be.cryptauth.sync;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* renamed from: com.google.android.gms.auth.be.cryptauth.sync.GcmReceiverChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {
    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        int i;
        int i2;
        int i3 = 1;
        try {
            Log.i("GcmReceiverService", String.format("received gcm message from server. action: %s", intent.getAction()));
            Bundle extras = intent.getExtras();
            for (String str : extras.keySet()) {
                Object[] objArr = {str, extras.get(str)};
            }
            if (!intent.hasExtra("registrationTickleType")) {
                Log.e("GcmReceiverService", "server did not send a tickle type");
                i = 0;
            } else {
                String stringExtra = intent.getStringExtra("registrationTickleType");
                try {
                    i = Integer.parseInt(stringExtra);
                } catch (NumberFormatException e) {
                    Log.e("GcmReceiverService", String.format("Could not parse tickle type: %s", stringExtra));
                    i = 0;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            Log.i("GcmReceiverService", String.format("received tickle %s from the server", valueOf));
            ihe a = ihe.m15438a(this);
            if (i != 0) {
                i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2;
            } else {
                i2 = 1;
            }
            int i4 = i2 - 1;
            if (i2 != 0) {
                int i5 = 100;
                if (i4 != 1) {
                    if (i4 == 2) {
                        i5 = 300;
                        i3 = 3;
                    } else if (i4 != 3) {
                        ihe.f21007c.mo25418e("unrecognized tickle type: %d", valueOf);
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                }
                synchronized (a.f21010a) {
                    for (Account account : a.f21011b.mo12988a()) {
                        a.mo13009a(i5, account.name, i3, 10, 0);
                    }
                }
                asfd.m73946a(this, intent);
                return;
            }
            throw null;
        } catch (RuntimeException e2) {
            try {
                Log.e("GcmReceiverService", "Error", e2);
            } catch (Throwable th) {
                asfd.m73946a(this, intent);
                throw th;
            }
        }
    }
}
