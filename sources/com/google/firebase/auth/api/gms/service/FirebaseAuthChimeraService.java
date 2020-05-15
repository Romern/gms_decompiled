package com.google.firebase.auth.api.gms.service;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FirebaseAuthChimeraService extends sjh {
    public FirebaseAuthChimeraService() {
        super((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, "com.google.firebase.auth.api.gms.service.START", Collections.emptySet(), 3, 9);
        if (cdxz.f181891a.mo6606a().mo78435d()) {
            this.f44564b = bngx.m109356a(new brmi());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.f30233g;
        if (bundle != null) {
            String string = bundle.getString("com.google.firebase.auth.API_KEY");
            if (!TextUtils.isEmpty(string)) {
                brps brps = new brps(bundle.getString("com.google.firebase.auth.LIBRARY_VERSION", "-1"), getServiceRequest.f30229c);
                String str = getServiceRequest.f30230d;
                sjn a = sjn.m35483a(this, this.f44565c, this.f44566d);
                a.f44585g = this.f44564b;
                sjj.mo25645a(new brmh(str, string, brps, a));
                return;
            }
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        throw new IllegalArgumentException("ExtraArgs is null.");
    }
}
