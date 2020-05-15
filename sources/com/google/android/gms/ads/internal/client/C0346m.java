package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.mediation.client.C0510a;
import com.google.android.gms.ads.internal.mediation.client.C0511b;

/* renamed from: com.google.android.gms.ads.internal.client.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0346m extends dck implements C0347n {
    public C0346m() {
        super("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public static C0347n asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof C0347n) {
            return (C0347n) queryLocalInterface;
        }
        return new C0345l(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzp vzp;
        C0511b bVar;
        vzp vzp2;
        C0511b bVar2;
        C0510a aVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzp = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
            } else {
                vzp = null;
            }
            AdSizeParcel adSizeParcel = (AdSizeParcel) dcl.m8163a(parcel, AdSizeParcel.CREATOR);
            String readString = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                if (queryLocalInterface2 instanceof C0511b) {
                    bVar = (C0511b) queryLocalInterface2;
                    IBinder newAdManager = newAdManager(vzp, adSizeParcel, readString, bVar, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(newAdManager);
                } else {
                    aVar = new C0510a(readStrongBinder2);
                }
            }
            bVar = aVar;
            IBinder newAdManager2 = newAdManager(vzp, adSizeParcel, readString, bVar, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdManager2);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                vzp2 = queryLocalInterface3 instanceof vzr ? (vzr) queryLocalInterface3 : new vzp(readStrongBinder3);
            } else {
                vzp2 = null;
            }
            AdSizeParcel adSizeParcel2 = (AdSizeParcel) dcl.m8163a(parcel, AdSizeParcel.CREATOR);
            String readString2 = parcel.readString();
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                if (queryLocalInterface4 instanceof C0511b) {
                    bVar2 = (C0511b) queryLocalInterface4;
                    IBinder newAdManagerByType = newAdManagerByType(vzp2, adSizeParcel2, readString2, bVar2, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(newAdManagerByType);
                } else {
                    aVar = new C0510a(readStrongBinder4);
                }
            }
            bVar2 = aVar;
            IBinder newAdManagerByType2 = newAdManagerByType(vzp2, adSizeParcel2, readString2, bVar2, parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdManagerByType2);
        }
        return true;
    }
}
