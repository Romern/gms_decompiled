package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.ads.internal.client.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0340g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdSizeParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        AdSizeParcel[] adSizeParcelArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    adSizeParcelArr = (AdSizeParcel[]) sed.m35004b(parcel2, readInt, AdSizeParcel.CREATOR);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdSizeParcel(str, i, i2, z, i3, i4, adSizeParcelArr, z2, z3, z4, z5, z6, z7, z8);
    }
}
