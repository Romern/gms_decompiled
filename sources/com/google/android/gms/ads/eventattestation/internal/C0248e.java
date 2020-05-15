package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0248e extends dcj implements C0250g {
    public C0248e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IAdRequestAttestationTokenCallback");
    }

    /* renamed from: a */
    public final void mo6466a(AdRequestAttestationTokenParcel adRequestAttestationTokenParcel) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, adRequestAttestationTokenParcel);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo6467a(String str) {
        Parcel bj = mo8529bj();
        bj.writeInt(1);
        bj.writeString(str);
        mo8530c(3, bj);
    }
}
