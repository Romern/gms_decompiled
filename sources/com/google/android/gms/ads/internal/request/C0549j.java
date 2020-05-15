package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.request.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0549j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NonagonRequestParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        PoolConfiguration poolConfiguration = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) sed.m34998a(parcel2, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) sed.m34998a(parcel2, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) sed.m34998a(parcel2, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    poolConfiguration = (PoolConfiguration) sed.m34998a(parcel2, readInt, PoolConfiguration.CREATOR);
                    break;
                case 11:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new NonagonRequestParcel(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, z, str3, poolConfiguration, str4);
    }
}
