package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;

/* renamed from: aehn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, ParcelableGeofence.CREATOR);
            } else if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GeofencingRequest(arrayList, i, str);
    }
}
