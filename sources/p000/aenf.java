package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;

/* renamed from: aenf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HierarchicalPlaceLikelihoodEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PlaceEntity placeEntity = null;
        ArrayList arrayList = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                placeEntity = (PlaceEntity) sed.m34998a(parcel, readInt, PlaceEntity.CREATOR);
            } else if (a == 2) {
                f = sed.m35015l(parcel, readInt);
            } else if (a == 3) {
                f2 = sed.m35015l(parcel, readInt);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m34992D(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new HierarchicalPlaceLikelihoodEntity(placeEntity, f, f2, i, arrayList);
    }
}
