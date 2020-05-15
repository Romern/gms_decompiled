package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import java.util.ArrayList;

/* renamed from: aete */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aete implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSharingSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        ArrayList arrayList = null;
        Boolean bool4 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    bool = sed.m35007d(parcel, readInt);
                    break;
                case 2:
                    arrayList = sed.m35005c(parcel, readInt, LocationShare.CREATOR);
                    break;
                case 3:
                    arrayList2 = sed.m35005c(parcel, readInt, LocationShare.CREATOR);
                    break;
                case 4:
                    bool2 = sed.m35007d(parcel, readInt);
                    break;
                case 5:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    bool3 = sed.m35007d(parcel, readInt);
                    break;
                case 7:
                    bool4 = sed.m35007d(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new LocationSharingSettings(bool.booleanValue(), arrayList, arrayList2, bool2.booleanValue(), i, bool3.booleanValue(), bool4.booleanValue());
    }
}
