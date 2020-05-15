package com.google.android.gms.ads.internal.overlay.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.overlay.client.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0524d extends dck implements C0525e {
    public C0524d() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public static C0525e asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof C0525e) {
            return (C0525e) queryLocalInterface;
        }
        return new C0523c(iBinder);
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
        IBinder newAdOverlay = newAdOverlay(vzr);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newAdOverlay);
        return true;
    }
}
