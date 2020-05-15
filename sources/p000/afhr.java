package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: afhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                latLng = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 3) {
                latLng2 = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 4) {
                latLng3 = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            } else if (a == 5) {
                latLng4 = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) sed.m34998a(parcel, readInt, LatLngBounds.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
