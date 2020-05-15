package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* renamed from: aens */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aens implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NearbyLikelihoodEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                placeEntity = (PlaceEntity) sed.m34998a(parcel, readInt, PlaceEntity.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                f = sed.m35015l(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new NearbyLikelihoodEntity(placeEntity, f);
    }
}
