package com.google.android.gms.ads.identifier.service;

import android.os.Binder;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.C0250g;
import com.google.android.gms.ads.eventattestation.internal.C0251h;
import com.google.android.gms.ads.eventattestation.internal.C0253j;
import com.google.android.gms.ads.eventattestation.internal.C0255l;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel;

/* renamed from: com.google.android.gms.ads.identifier.service.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0282e extends C0253j implements aaai {

    /* renamed from: a */
    private final aaag f8012a;

    public C0282e(aaag aaag) {
        this.f8012a = aaag;
    }

    /* renamed from: a */
    public final void mo6468a(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, C0250g gVar) {
        this.f8012a.mo16658a(new C0279b(adRequestAttestationTokenRequestParcel, Binder.getCallingUid(), gVar));
    }

    /* renamed from: a */
    public final void mo6469a(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, C0255l lVar) {
        this.f8012a.mo16658a(new C0281d(impressionAttestationTokenRequestParcel, Binder.getCallingUid(), lVar));
    }

    /* renamed from: a */
    public final void mo6470a(C0251h hVar) {
        this.f8012a.mo16658a(new C0280c(hVar));
    }
}
