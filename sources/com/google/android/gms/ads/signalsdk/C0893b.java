package com.google.android.gms.ads.signalsdk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.signalsdk.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0893b extends dck implements C0894c {
    public C0893b() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        C0892a aVar;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
            aVar = queryLocalInterface instanceof C0892a ? (C0892a) queryLocalInterface : new C0892a(readStrongBinder);
        } else {
            aVar = null;
        }
        mo7122a(bundle, aVar);
        return true;
    }
}
