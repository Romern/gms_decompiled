package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.Route;

/* renamed from: adgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InstantAppPreLaunchInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Intent intent = null;
        Intent intent2 = null;
        AppInfo appInfo = null;
        Route route = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    intent = (Intent) sed.m34998a(parcel2, readInt, Intent.CREATOR);
                    break;
                case 6:
                    intent2 = (Intent) sed.m34998a(parcel2, readInt, Intent.CREATOR);
                    break;
                case 7:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 8:
                    appInfo = (AppInfo) sed.m34998a(parcel2, readInt, AppInfo.CREATOR);
                    break;
                case 9:
                    route = (Route) sed.m34998a(parcel2, readInt, Route.CREATOR);
                    break;
                case 10:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 12:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 16:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 17:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new InstantAppPreLaunchInfo(i, str, z, intent, intent2, appInfo, route, z2, bArr, str2, i2, i3, str3, bArr2, bundle);
    }
}
