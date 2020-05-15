package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioState;
import com.google.android.gms.car.RadioStationInfo;
import com.google.android.gms.car.StationPresetList;
import java.util.ArrayList;

/* renamed from: nvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RadioState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        RadioStationInfo radioStationInfo = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 2:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    radioStationInfo = (RadioStationInfo) sed.m34998a(parcel, readInt, RadioStationInfo.CREATOR);
                    break;
                case 5:
                    arrayList = sed.m35005c(parcel, readInt, RadioStationInfo.CREATOR);
                    break;
                case 6:
                    arrayList2 = sed.m35005c(parcel, readInt, StationPresetList.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new RadioState(z, z2, i, radioStationInfo, arrayList, arrayList2);
    }
}
