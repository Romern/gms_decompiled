package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                latLng = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                latLng2 = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LatLngBounds(latLng, latLng2);
    }
}
