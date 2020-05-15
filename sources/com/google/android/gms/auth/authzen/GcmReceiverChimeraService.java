package com.google.android.gms.auth.authzen;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {

    /* renamed from: a */
    public static final sek f10380a = new sek("GcmReceiverService");

    public GcmReceiverChimeraService() {
        super("AuthZenGcmIntentReceiver");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    public static Intent m6430a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.authzen.GcmReceiverService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        if (intent != null) {
            try {
                sek sek = f10380a;
                String valueOf = String.valueOf(intent.getAction());
                sek.mo25409a(valueOf.length() == 0 ? new String("Handling intent: ") : "Handling intent: ".concat(valueOf), new Object[0]);
                new ifd(this, new ikj()).mo12958a(this, intent);
            } catch (RuntimeException e) {
                f10380a.mo25417e("Error", e, new Object[0]);
            } catch (Throwable th) {
                asfd.m73946a(this, intent);
                throw th;
            }
        } else {
            f10380a.mo25416d("Received null intent.", new Object[0]);
            intent = null;
        }
        asfd.m73946a(this, intent);
    }
}
