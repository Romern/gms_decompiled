package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.ads.internal.overlay.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0527e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) sed.m34998a(parcel2, readInt, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 4:
                    iBinder2 = sed.m35021r(parcel2, readInt);
                    break;
                case 5:
                    iBinder3 = sed.m35021r(parcel2, readInt);
                    break;
                case 6:
                    iBinder4 = sed.m35021r(parcel2, readInt);
                    break;
                case 7:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    iBinder5 = sed.m35021r(parcel2, readInt);
                    break;
                case 11:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) sed.m34998a(parcel2, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 16:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) sed.m34998a(parcel2, readInt, InterstitialAdParameterParcel.CREATOR);
                    break;
                case 18:
                    iBinder6 = sed.m35021r(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdOverlayInfoParcel(adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, versionInfoParcel, str4, interstitialAdParameterParcel, iBinder6);
    }
}
