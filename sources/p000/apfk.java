package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: apfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HarmfulAppsInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HarmfulAppsData[] harmfulAppsDataArr = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) sed.m35004b(parcel, readInt, HarmfulAppsData.CREATOR);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new HarmfulAppsInfo(j, harmfulAppsDataArr, i, z);
    }
}
