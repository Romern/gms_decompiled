package com.google.android.gms.trustlet.voiceunlock.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VoiceUnlockApiChimeraService extends sjh {

    /* renamed from: a */
    private static final aunx f109328a = new aunx("TrustAgent", "VoiceUnlockApiChimeraService");

    public VoiceUnlockApiChimeraService() {
        super(52, "com.google.android.gms.speech.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        f109328a.mo50711a("onGetService", new Object[0]);
        sjj.mo25645a(new auzi(sjn.m35483a(this, this.f44565c, this.f44566d)));
    }
}
