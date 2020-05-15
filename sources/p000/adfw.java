package p000;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.SharedLibInfo;
import java.util.ArrayList;

/* renamed from: adfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        byte[] bArr = null;
        PackageInfo packageInfo = null;
        byte[] bArr2 = null;
        int i = 0;
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
                case 10:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 5:
                    arrayList = sed.m35005c(parcel, readInt, Route.CREATOR);
                    break;
                case 6:
                    arrayList2 = sed.m35005c(parcel, readInt, AtomInfo.CREATOR);
                    break;
                case 7:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 9:
                    packageInfo = (PackageInfo) sed.m34998a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = sed.m35005c(parcel, readInt, SharedLibInfo.CREATOR);
                    break;
                case 12:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AppInfo(str, str2, arrayList, arrayList2, arrayList3, i, bArr, packageInfo, bArr2);
    }
}
