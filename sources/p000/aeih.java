package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsConfiguration;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* renamed from: aeih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeih implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        LocationSettingsConfiguration locationSettingsConfiguration = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, LocationRequest.CREATOR);
            } else if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 3) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                locationSettingsConfiguration = (LocationSettingsConfiguration) sed.m34998a(parcel, readInt, LocationSettingsConfiguration.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, locationSettingsConfiguration);
    }
}
