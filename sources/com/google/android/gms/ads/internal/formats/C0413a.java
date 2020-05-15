package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;

/* renamed from: com.google.android.gms.ads.internal.formats.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0413a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NativeAdOptionsParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        VideoOptionsParcel videoOptionsParcel = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    videoOptionsParcel = (VideoOptionsParcel) sed.m34998a(parcel, readInt, VideoOptionsParcel.CREATOR);
                    break;
                case 7:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new NativeAdOptionsParcel(i, z, i2, z2, i3, videoOptionsParcel, z3, i4);
    }
}
