package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.mediation.client.C0510a;
import com.google.android.gms.ads.internal.mediation.client.C0511b;

/* renamed from: com.google.android.gms.ads.internal.reward.client.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0575b extends dck implements C0576c {
    public C0575b() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public static C0576c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof C0576c) {
            return (C0576c) queryLocalInterface;
        }
        return new C0574a(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        C0511b bVar = null;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            if (queryLocalInterface2 instanceof C0511b) {
                bVar = (C0511b) queryLocalInterface2;
            } else {
                bVar = new C0510a(readStrongBinder2);
            }
        }
        IBinder newRewardedVideoAd = newRewardedVideoAd(vzr, bVar, parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newRewardedVideoAd);
        return true;
    }
}
