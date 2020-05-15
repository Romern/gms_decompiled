package com.google.android.gms.ads.internal.purchase.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.purchase.client.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0532b extends dck implements C0533c {
    public C0532b() {
        super("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
    }

    public static C0533c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
        if (queryLocalInterface instanceof C0533c) {
            return (C0533c) queryLocalInterface;
        }
        return new C0531a(iBinder);
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
        IBinder newInAppPurchaseManager = newInAppPurchaseManager(vzr);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newInAppPurchaseManager);
        return true;
    }
}
