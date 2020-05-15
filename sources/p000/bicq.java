package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.placefencing.PlacefencingSubscription;

/* renamed from: bicq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacefencingSubscription[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PlacefencingRequest placefencingRequest = null;
        PlacesParams placesParams = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                placefencingRequest = (PlacefencingRequest) sed.m34998a(parcel, readInt, PlacefencingRequest.CREATOR);
            } else if (a == 2) {
                placesParams = (PlacesParams) sed.m34998a(parcel, readInt, PlacesParams.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PlacefencingSubscription(placefencingRequest, placesParams, pendingIntent);
    }
}
