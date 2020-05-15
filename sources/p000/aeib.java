package p000;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: aeib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeib implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        List list = LocationResult.f79357a;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                list = sed.m35005c(parcel, readInt, Location.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LocationResult(list);
    }
}
