package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import java.util.ArrayList;

/* renamed from: aeog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeog implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceOpeningHoursEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, PlaceOpeningHoursEntity.BusinessHoursInterval.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList2 = sed.m35005c(parcel, readInt, PlaceOpeningHoursEntity.ExceptionalHours.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PlaceOpeningHoursEntity(arrayList, arrayList2);
    }
}
