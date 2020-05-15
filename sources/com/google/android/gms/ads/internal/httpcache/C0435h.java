package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.ads.internal.httpcache.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0435h extends dck implements C0436i {
    public C0435h() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        C0433f fVar;
        if (i == 1) {
            ParcelFileDescriptor a = mo6478a((HttpRequestParcel) dcl.m8163a(parcel, HttpRequestParcel.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            HttpRequestParcel httpRequestParcel = (HttpRequestParcel) dcl.m8163a(parcel, HttpRequestParcel.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
                fVar = queryLocalInterface instanceof C0433f ? (C0433f) queryLocalInterface : new C0431d(readStrongBinder);
            } else {
                fVar = null;
            }
            mo6479a(httpRequestParcel, fVar);
        }
        return true;
    }
}
