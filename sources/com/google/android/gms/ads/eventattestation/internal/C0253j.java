package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0253j extends dck implements C0254k {
    public C0253j() {
        super("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        C0251h hVar = null;
        C0255l lVar = null;
        C0250g gVar = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IAdvertisingIdCallback");
                if (queryLocalInterface instanceof C0251h) {
                    hVar = (C0251h) queryLocalInterface;
                } else {
                    hVar = new C0251h(readStrongBinder);
                }
            }
            mo6470a(hVar);
            return true;
        } else if (i == 3) {
            AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = (AdRequestAttestationTokenRequestParcel) dcl.m8163a(parcel, AdRequestAttestationTokenRequestParcel.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IAdRequestAttestationTokenCallback");
                if (queryLocalInterface2 instanceof C0250g) {
                    gVar = (C0250g) queryLocalInterface2;
                } else {
                    gVar = new C0248e(readStrongBinder2);
                }
            }
            mo6468a(adRequestAttestationTokenRequestParcel, gVar);
            return true;
        } else if (i != 4) {
            return false;
        } else {
            ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel = (ImpressionAttestationTokenRequestParcel) dcl.m8163a(parcel, ImpressionAttestationTokenRequestParcel.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IImpressionAttestationTokenCallback");
                if (queryLocalInterface3 instanceof C0255l) {
                    lVar = (C0255l) queryLocalInterface3;
                } else {
                    lVar = new C0255l(readStrongBinder3);
                }
            }
            mo6469a(impressionAttestationTokenRequestParcel, lVar);
            return true;
        }
    }
}
