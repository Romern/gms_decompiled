package com.google.android.gms.auth.folsom.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {

    /* renamed from: b */
    private static final sek f10923b = jdh.m16547a("GcmReceiverChimeraService");

    /* renamed from: a */
    public final izr f10924a;

    /* renamed from: c */
    private final bqgj f10925c;

    public GcmReceiverChimeraService() {
        this(izr.f22008a);
    }

    /* renamed from: a */
    public static String m6627a(Context context) {
        String a = aaks.m21407a(context);
        if (a != null) {
            return a;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.gcm.gmsproc.GmsAutoStarter");
        context.sendBroadcast(intent);
        return null;
    }

    public GcmReceiverChimeraService(izr izr) {
        super("GcmReceiverService");
        this.f10925c = snp.m35704b(10);
        setIntentRedelivery(true);
        this.f10924a = izr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        if (intent == null) {
            f10923b.mo25412b("Null intent. Ignore.", new Object[0]);
        } else if (!jde.f22216b) {
            f10923b.mo25416d("Gcm ping received on device with build < P. This should never happen.", new Object[0]);
        } else if (ccfv.m129485b()) {
            izs.f22010a.mo13539b(this);
            this.f10925c.execute(new jbm(this));
        } else {
            f10923b.mo25416d("The RecoverableKeyStoreGms module is not enabled.", new Object[0]);
        }
    }
}
