package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.ads.internal.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0318c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InterstitialAdParameterParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    f = sed.m35015l(parcel, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    z5 = sed.m35006c(parcel, readInt);
                    break;
                case 10:
                    z6 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new InterstitialAdParameterParcel(z, z2, str, z3, f, i, z4, z5, z6);
    }
}
