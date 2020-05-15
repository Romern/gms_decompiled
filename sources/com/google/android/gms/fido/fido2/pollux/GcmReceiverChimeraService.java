package com.google.android.gms.fido.fido2.pollux;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {

    /* renamed from: a */
    private static final sek f31849a = new sek(new String[]{"GcmReceiverService"}, (short[]) null);

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        f31849a.mo25414c("GCM message received, triggering caBLE scan...", new Object[0]);
        Intent action = new Intent().setAction("com.google.android.gms.fido.CABLE_AUTHENTICATOR");
        String stringExtra = intent.getStringExtra("client_eid");
        if (stringExtra != null) {
            try {
                action.putExtra("client_eid", boan.f132470d.mo68796b(stringExtra));
            } catch (IllegalArgumentException e) {
                f31849a.mo25415d("Failed to decode base64 client eid from GCM message", e, new Object[0]);
            }
        }
        sendBroadcast(action);
    }

    GcmReceiverChimeraService(Context context) {
        this();
        attachBaseContext(context);
    }
}
