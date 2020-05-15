package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.cache.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0324f extends dck implements C0325g {
    public C0324f() {
        super("com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        CacheEntryParcel a = mo6397a((CacheOffering) dcl.m8163a(parcel, CacheOffering.CREATOR));
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
