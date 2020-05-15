package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.adshield.internal.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0193b extends dck implements C0194c {
    public C0193b() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public static C0194c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof C0194c) {
            return (C0194c) queryLocalInterface;
        }
        return new C0192a(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr = null;
        if (i == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof vzr) {
                    vzr = (vzr) queryLocalInterface;
                } else {
                    vzr = new vzp(readStrongBinder);
                }
            }
            IBinder newAdShieldClient = newAdShieldClient(readString, vzr);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdShieldClient);
        } else if (i != 2) {
            return false;
        } else {
            String readString2 = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof vzr) {
                    vzr = (vzr) queryLocalInterface2;
                } else {
                    vzr = new vzp(readStrongBinder2);
                }
            }
            IBinder newAdShieldClientWithoutAdvertisingId = newAdShieldClientWithoutAdvertisingId(readString2, vzr);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdShieldClientWithoutAdvertisingId);
        }
        return true;
    }
}
