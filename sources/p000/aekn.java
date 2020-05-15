package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* renamed from: aekn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) sed.m34998a(parcel, readInt, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinder = sed.m35021r(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = sed.m35021r(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = sed.m35021r(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new LocationRequestUpdateData(i, locationRequestInternal, iBinder, pendingIntent, iBinder2, iBinder3);
    }
}
