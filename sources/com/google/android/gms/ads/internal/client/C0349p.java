package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.client.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0349p extends dck implements C0350q {
    public C0349p() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public static C0350q asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof C0350q) {
            return (C0350q) queryLocalInterface;
        }
        return new C0348o(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        IBinder mobileAdsSettingManager = getMobileAdsSettingManager(vzr, parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeStrongBinder(mobileAdsSettingManager);
        return true;
    }
}
