package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.C0242b;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0249f extends dck implements C0250g {

    /* renamed from: a */
    final /* synthetic */ aucf f7962a;

    public C0249f() {
        super("com.google.android.gms.ads.eventattestation.internal.IAdRequestAttestationTokenCallback");
    }

    /* renamed from: a */
    public final void mo6466a(AdRequestAttestationTokenParcel adRequestAttestationTokenParcel) {
        this.f7962a.mo50391a(adRequestAttestationTokenParcel.f7953a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0249f(aucf aucf) {
        super("com.google.android.gms.ads.eventattestation.internal.IAdRequestAttestationTokenCallback");
        this.f7962a = aucf;
    }

    /* renamed from: a */
    public final void mo6467a(String str) {
        this.f7962a.mo50390a((Exception) new C0242b(str));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo6466a((AdRequestAttestationTokenParcel) dcl.m8163a(parcel, AdRequestAttestationTokenParcel.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            parcel.readInt();
            mo6467a(parcel.readString());
            return true;
        }
    }
}
