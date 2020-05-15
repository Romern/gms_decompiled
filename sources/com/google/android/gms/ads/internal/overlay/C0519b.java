package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.ads.internal.overlay.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0519b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
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
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str7 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) sed.m34998a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AdLauncherIntentInfoParcel(str, str2, str3, str4, str5, str6, str7, intent);
    }
}
