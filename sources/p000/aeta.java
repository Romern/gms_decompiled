package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: aeta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeta implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SharingCondition.Destination[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        SharingCondition.FeatureId featureId = null;
        LatLng latLng = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                featureId = (SharingCondition.FeatureId) sed.m34998a(parcel, readInt, SharingCondition.FeatureId.CREATOR);
            } else if (a == 4) {
                latLng = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SharingCondition.Destination(str, featureId, latLng, j);
    }
}
