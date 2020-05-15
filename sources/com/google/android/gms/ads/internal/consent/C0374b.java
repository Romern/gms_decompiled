package com.google.android.gms.ads.internal.consent;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.consent.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0374b extends dck implements C0375c {
    public C0374b() {
        super("com.google.android.gms.ads.internal.consent.IConsentSdkService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        C0373a aVar;
        if (i != 3) {
            return false;
        }
        parcel.readString();
        Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.consent.IConsentCallback");
            aVar = queryLocalInterface instanceof C0373a ? (C0373a) queryLocalInterface : new C0373a(readStrongBinder);
        } else {
            aVar = null;
        }
        mo6444a(aVar);
        return true;
    }
}
