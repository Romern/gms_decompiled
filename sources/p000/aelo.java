package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aelo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceFilter[i];
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.location.places.PlaceFilter.<init>(java.util.List, boolean, java.util.List, java.util.List):void
     arg types: [java.util.ArrayList, boolean, java.util.ArrayList, java.util.ArrayList]
     candidates:
      com.google.android.gms.location.places.PlaceFilter.<init>(java.util.Collection, boolean, java.util.Collection, java.util.Collection):void
      com.google.android.gms.location.places.PlaceFilter.<init>(java.util.List, boolean, java.util.List, java.util.List):void */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m34990B(parcel, readInt);
            } else if (a == 6) {
                arrayList2 = sed.m34992D(parcel, readInt);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList3 = sed.m35005c(parcel, readInt, UserDataType.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PlaceFilter((List) arrayList, z, (List) arrayList2, (List) arrayList3);
    }
}
