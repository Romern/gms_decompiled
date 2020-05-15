package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenParcel;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.C0250g;
import com.google.android.gms.ads.identifier.settings.C0284b;
import com.google.android.gms.ads.identifier.settings.C0287e;
import com.google.android.gms.ads.identifier.settings.C0288f;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.ads.identifier.service.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0279b extends aaab {

    /* renamed from: a */
    private final AdRequestAttestationTokenRequestParcel f8005a;

    /* renamed from: b */
    private final C0250g f8006b;

    /* renamed from: c */
    private final int f8007c;

    public C0279b(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, int i, C0250g gVar) {
        super(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, "FetchAdRequestAttestationToken");
        this.f8005a = adRequestAttestationTokenRequestParcel;
        this.f8007c = i;
        this.f8006b = gVar;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        C0287e a = C0287e.m5194a(context);
        try {
            AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = this.f8005a;
            this.f8006b.mo6466a(new AdRequestAttestationTokenParcel(a.mo6510a(adRequestAttestationTokenRequestParcel.f7954a, "adRequestAttestationToken", new C0284b(a, adRequestAttestationTokenRequestParcel.f7956c, this.f8007c, adRequestAttestationTokenRequestParcel.f7955b))));
        } catch (IOException | GeneralSecurityException e) {
            this.f8006b.mo6467a("");
            C0288f.m5215a(rpr.m34216b(), "request-attestation", e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f8006b.mo6467a(status.f30116j);
    }
}
