package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;

/* renamed from: aelc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NearbyAlertRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PlaceFilter placeFilter = null;
        NearbyAlertFilter nearbyAlertFilter = null;
        int i = 0;
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        int i4 = 110;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    placeFilter = (PlaceFilter) sed.m34998a(parcel, readInt, PlaceFilter.CREATOR);
                    break;
                case 4:
                    nearbyAlertFilter = (NearbyAlertFilter) sed.m34998a(parcel, readInt, NearbyAlertFilter.CREATOR);
                    break;
                case 5:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new NearbyAlertRequest(i, i2, placeFilter, nearbyAlertFilter, z, i3, i4);
    }
}
