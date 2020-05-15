package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.request.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0543d extends dck implements C0544e {
    public C0543d() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            C0545f fVar = null;
            C0546g gVar = null;
            C0546g gVar2 = null;
            C0546g gVar3 = null;
            C0546g gVar4 = null;
            if (i == 2) {
                AdRequestInfoParcel adRequestInfoParcel = (AdRequestInfoParcel) dcl.m8163a(parcel, AdRequestInfoParcel.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    fVar = queryLocalInterface instanceof C0545f ? (C0545f) queryLocalInterface : new C0545f(readStrongBinder);
                }
                mo6729a(adRequestInfoParcel, fVar);
                parcel2.writeNoException();
            } else if (i == 4) {
                NonagonRequestParcel nonagonRequestParcel = (NonagonRequestParcel) dcl.m8163a(parcel, NonagonRequestParcel.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof C0546g) {
                        gVar4 = (C0546g) queryLocalInterface2;
                    } else {
                        gVar4 = new C0546g(readStrongBinder2);
                    }
                }
                mo6730a(nonagonRequestParcel, gVar4);
                parcel2.writeNoException();
            } else if (i == 5) {
                NonagonRequestParcel nonagonRequestParcel2 = (NonagonRequestParcel) dcl.m8163a(parcel, NonagonRequestParcel.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof C0546g) {
                        gVar3 = (C0546g) queryLocalInterface3;
                    } else {
                        gVar3 = new C0546g(readStrongBinder3);
                    }
                }
                mo6732b(nonagonRequestParcel2, gVar3);
                parcel2.writeNoException();
            } else if (i == 6) {
                NonagonRequestParcel nonagonRequestParcel3 = (NonagonRequestParcel) dcl.m8163a(parcel, NonagonRequestParcel.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof C0546g) {
                        gVar2 = (C0546g) queryLocalInterface4;
                    } else {
                        gVar2 = new C0546g(readStrongBinder4);
                    }
                }
                mo6733c(nonagonRequestParcel3, gVar2);
                parcel2.writeNoException();
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof C0546g) {
                        gVar = (C0546g) queryLocalInterface5;
                    } else {
                        gVar = new C0546g(readStrongBinder5);
                    }
                }
                mo6731a(readString, gVar);
                parcel2.writeNoException();
            }
        } else {
            AdResponseParcel a = mo6728a((AdRequestInfoParcel) dcl.m8163a(parcel, AdRequestInfoParcel.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        }
        return true;
    }
}
