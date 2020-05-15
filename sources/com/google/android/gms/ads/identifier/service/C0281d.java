package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.ads.eventattestation.internal.C0255l;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenResponseParcel;
import com.google.android.gms.ads.identifier.settings.C0285c;
import com.google.android.gms.ads.identifier.settings.C0287e;
import com.google.android.gms.ads.identifier.settings.C0288f;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.ads.identifier.service.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0281d extends aaab {

    /* renamed from: a */
    private final ImpressionAttestationTokenRequestParcel f8009a;

    /* renamed from: b */
    private final int f8010b;

    /* renamed from: c */
    private final C0255l f8011c;

    public C0281d(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, int i, C0255l lVar) {
        super(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, "FetchImpressionAttestationToken");
        this.f8009a = impressionAttestationTokenRequestParcel;
        this.f8010b = i;
        this.f8011c = lVar;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        C0287e a = C0287e.m5194a(context);
        try {
            ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel = this.f8009a;
            String str = impressionAttestationTokenRequestParcel.f7959a;
            String str2 = impressionAttestationTokenRequestParcel.f7960b;
            int i = this.f8010b;
            if (cbvp.f178349a.mo6606a().mo75440l()) {
                bArr = a.mo6510a(str, "impressionAttestationToken", new C0285c(a, a.mo6507a(str2, i)));
            } else {
                bArr = null;
            }
            C0255l lVar = this.f8011c;
            ImpressionAttestationTokenResponseParcel impressionAttestationTokenResponseParcel = new ImpressionAttestationTokenResponseParcel(bArr);
            Parcel bj = lVar.mo8529bj();
            dcl.m8165a(bj, impressionAttestationTokenResponseParcel);
            lVar.mo8530c(2, bj);
        } catch (IOException | GeneralSecurityException e) {
            this.f8011c.mo6471a("");
            C0288f.m5215a(rpr.m34216b(), "impression-attestation", e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f8011c.mo6471a(status.f30116j);
    }
}
