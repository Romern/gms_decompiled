package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.fencing.PlaceIdCollection;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import java.util.ArrayList;

/* renamed from: aemn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacefencingFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, PlaceIdCollection.CREATOR);
            } else if (a == 2) {
                arrayList2 = sed.m34990B(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList3 = sed.m34992D(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PlacefencingFilter(arrayList, arrayList2, arrayList3);
    }
}
