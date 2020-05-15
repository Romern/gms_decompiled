package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioStationInfo;

/* renamed from: nvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RadioStationInfo.MetaData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        RadioStationInfo.RdsData rdsData = null;
        RadioStationInfo.HdData hdData = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                rdsData = (RadioStationInfo.RdsData) sed.m34998a(parcel, readInt, RadioStationInfo.RdsData.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                hdData = (RadioStationInfo.HdData) sed.m34998a(parcel, readInt, RadioStationInfo.HdData.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new RadioStationInfo.MetaData(i, i2, rdsData, hdData);
    }
}
