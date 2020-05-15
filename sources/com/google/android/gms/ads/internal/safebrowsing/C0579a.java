package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.safebrowsing.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0579a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingConfigParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 7:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = sed.m34992D(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SafeBrowsingConfigParcel(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }
}
