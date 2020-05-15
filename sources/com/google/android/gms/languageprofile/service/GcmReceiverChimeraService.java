package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GcmReceiverChimeraService extends TracingIntentService {
    public GcmReceiverChimeraService() {
        super(GcmReceiverChimeraService.class.getSimpleName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        if (intent.hasExtra("account_name")) {
            String stringExtra = intent.getStringExtra("account_name");
            String stringExtra2 = intent.getStringExtra("ulp");
            if (stringExtra != null) {
                bmxv bmxv = bmvz.f131120a;
                if (stringExtra2 != null) {
                    try {
                        bmxv = bmxv.m108567c((bsjk) bxvk.m124014a(bsjk.f144805d, Base64.decode(stringExtra2, 0)));
                    } catch (bxwf e) {
                    }
                }
                if (bmxv.mo66813a()) {
                    adxt.m51334a().mo33881a(stringExtra, (bsjk) bmxv.mo66814b());
                } else {
                    adxt.m51334a().mo33882b(stringExtra);
                }
            }
        }
    }
}
