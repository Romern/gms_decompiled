package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0252i extends dcj implements C0254k {
    public C0252i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
    }

    /* renamed from: a */
    public final void mo6468a(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, C0250g gVar) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, adRequestAttestationTokenRequestParcel);
        dcl.m8164a(bj, gVar);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo6469a(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, C0255l lVar) {
        throw null;
    }

    /* renamed from: a */
    public final void mo6470a(C0251h hVar) {
        throw null;
    }
}
