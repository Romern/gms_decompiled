package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.client.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0339f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdRequestParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        AdDataParcel adDataParcel = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) sed.m34998a(parcel2, readInt, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) sed.m34998a(parcel2, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    bundle2 = sed.m35022s(parcel2, readInt);
                    break;
                case 14:
                    bundle3 = sed.m35022s(parcel2, readInt);
                    break;
                case 15:
                    arrayList2 = sed.m34992D(parcel2, readInt);
                    break;
                case 16:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 18:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 19:
                    adDataParcel = (AdDataParcel) sed.m34998a(parcel2, readInt, AdDataParcel.CREATOR);
                    break;
                case 20:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 21:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 22:
                    arrayList3 = sed.m34992D(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdRequestParcel(i, j, bundle, i2, arrayList, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, adDataParcel, i4, str5, arrayList3);
    }
}
