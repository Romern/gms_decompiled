package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.formats.client.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0415b extends dck implements C0416c {
    public C0415b() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public static C0416c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof C0416c) {
            return (C0416c) queryLocalInterface;
        }
        return new C0414a(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzr vzr2;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        vzr vzr3 = null;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr2 = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(readStrongBinder2);
        } else {
            vzr2 = null;
        }
        IBinder readStrongBinder3 = parcel.readStrongBinder();
        if (readStrongBinder3 != null) {
            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface3 instanceof vzr) {
                vzr3 = (vzr) queryLocalInterface3;
            } else {
                vzr3 = new vzp(readStrongBinder3);
            }
        }
        IBinder newNativeAdViewDelegate = newNativeAdViewDelegate(vzr, vzr2, vzr3, parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newNativeAdViewDelegate);
        return true;
    }
}
